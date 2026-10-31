package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class Restrictions$ModeRestrictions {

    public static abstract class Builder {
        public static Builder builder() {
            return Restrictions$ModeRestrictions.builder();
        }

        public abstract Restrictions$ModeRestrictions build();

        public abstract Builder values(Map<String, Restrictions.RestrictionReasons> map);
    }

    public static Builder builder() {
        return new AutoValue_Restrictions_ModeRestrictions.Builder();
    }

    public abstract j380 values();
}
