package com.christianjaena.kingdomwars.application.services;

import com.christianjaena.kingdomwars.application.dto.KingdomDto;
import com.christianjaena.kingdomwars.application.request.KingdomRequest;

public interface KingdomService {
    KingdomDto createKingdom(KingdomRequest command);
}
