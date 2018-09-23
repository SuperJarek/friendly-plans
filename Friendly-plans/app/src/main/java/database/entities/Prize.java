package database.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.List;

@Entity
public class Prize {

    @Id(autoincrement = true)
    private Long id;

    private String name;

    private Integer durationTime;

    private Long pictureId;

    private Long soundId;

    @Generated(hash = 566054077)
    public Prize(Long id, String name, Integer durationTime, Long pictureId,
            Long soundId) {
        this.id = id;
        this.name = name;
        this.durationTime = durationTime;
        this.pictureId = pictureId;
        this.soundId = soundId;
    }

    @Generated(hash = 374847236)
    public Prize() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurationTime() {
        return this.durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getSoundId() {
        return this.soundId;
    }

    public void setSoundId(Long soundId) {
        this.soundId = soundId;
    }
    
}