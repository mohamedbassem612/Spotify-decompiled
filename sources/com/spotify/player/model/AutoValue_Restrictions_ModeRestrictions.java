package com.spotify.player.model;

import java.util.Map;
import p.eg;
import p.f4i1;
import p.j380;
import p.mno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_Restrictions_ModeRestrictions extends Restrictions$ModeRestrictions {
    private final j380 values;

    public static final class Builder extends Restrictions$ModeRestrictions.Builder {
        private j380 values;

        @Override // com.spotify.player.model.Restrictions$ModeRestrictions.Builder
        public Restrictions$ModeRestrictions build() {
            j380 j380Var = this.values;
            if (j380Var != null) {
                return new AutoValue_Restrictions_ModeRestrictions(j380Var, 0);
            }
            eg.m("Missing required properties: values");
            return null;
        }

        @Override // com.spotify.player.model.Restrictions$ModeRestrictions.Builder
        public Restrictions$ModeRestrictions.Builder values(Map<String, Restrictions.RestrictionReasons> map) {
            this.values = j380.c(map);
            return this;
        }
    }

    private AutoValue_Restrictions_ModeRestrictions(j380 j380Var) {
        this.values = j380Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Restrictions$ModeRestrictions)) {
            return false;
        }
        j380 j380Var = this.values;
        j380 j380VarValues = ((Restrictions$ModeRestrictions) obj).values();
        j380Var.getClass();
        return mno1.l(j380VarValues, j380Var);
    }

    public int hashCode() {
        return this.values.hashCode() ^ 1000003;
    }

    public String toString() {
        return f4i1.f("ModeRestrictions{values=", String.valueOf(this.values), "}");
    }

    @Override // com.spotify.player.model.Restrictions$ModeRestrictions
    public j380 values() {
        return this.values;
    }

    public /* synthetic */ AutoValue_Restrictions_ModeRestrictions(j380 j380Var, int i) {
        this(j380Var);
    }
}
