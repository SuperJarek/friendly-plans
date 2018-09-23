package database.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
class JoinPlansWithPrizes {

    @Id(autoincrement = true)
    private Long id;

    private Long planTemplateId;

    private Long prizeId;

    @Generated(hash = 155369471)
    public JoinPlansWithPrizes(Long id, Long planTemplateId, Long prizeId) {
        this.id = id;
        this.planTemplateId = planTemplateId;
        this.prizeId = prizeId;
    }

    @Generated(hash = 20996143)
    public JoinPlansWithPrizes() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanTemplateId() {
        return this.planTemplateId;
    }

    public void setPlanTemplateId(Long planTemplateId) {
        this.planTemplateId = planTemplateId;
    }

    public Long getPrizeId() {
        return this.prizeId;
    }

    public void setPrizeId(Long prizeId) {
        this.prizeId = prizeId;
    }
}
