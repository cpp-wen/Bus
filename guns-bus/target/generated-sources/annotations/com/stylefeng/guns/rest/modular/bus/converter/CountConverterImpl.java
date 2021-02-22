package com.stylefeng.guns.rest.modular.bus.converter;

import com.stylefeng.guns.rest.bus.dto.CountDto;
import com.stylefeng.guns.rest.common.persistence.model.Count;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-19T14:47:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class CountConverterImpl implements CountConverter {

    @Override
    public List<CountDto> count2Res(List<Count> counts) {
        if ( counts == null ) {
            return null;
        }

        List<CountDto> list = new ArrayList<CountDto>( counts.size() );
        for ( Count count : counts ) {
            list.add( countToCountDto( count ) );
        }

        return list;
    }

    protected CountDto countToCountDto(Count count) {
        if ( count == null ) {
            return null;
        }

        CountDto countDto = new CountDto();

        countDto.setUuid( count.getUuid() );
        countDto.setBusId( count.getBusId() );
        countDto.setBeginTime( count.getBeginTime() );
        countDto.setEndTime( count.getEndTime() );
        countDto.setPrice( count.getPrice() );
        countDto.setSelectedSeats( count.getSelectedSeats() );
        countDto.setSeatStatus( count.getSeatStatus() );
        countDto.setBeginDate( count.getBeginDate() );

        return countDto;
    }
}
