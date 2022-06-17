package id.nadiar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private ISpeaker speaker;
    private ITyres tyres;

    @Autowired
    public VehicleService(ISpeaker speaker, ITyres tyres) {
        this.speaker = speaker;
        this.tyres = tyres;
    }

    public ISpeaker getSpeaker() {
        return speaker;
    }

    public ITyres getTyres() {
        return tyres;
    }
}
