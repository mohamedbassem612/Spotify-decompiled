package com.spotify.player.model;

import java.util.Set;
import p.eg;
import p.f4i1;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_Restrictions_RestrictionReasons extends Restrictions.RestrictionReasons {
    private final t380 reasons;

    public static final class Builder extends Restrictions.RestrictionReasons.Builder {
        private t380 reasons;

        @Override // com.spotify.player.model.Restrictions.RestrictionReasons.Builder
        public Restrictions.RestrictionReasons build() {
            t380 t380Var = this.reasons;
            if (t380Var != null) {
                return new AutoValue_Restrictions_RestrictionReasons(t380Var, 0);
            }
            eg.m("Missing required properties: reasons");
            return null;
        }

        @Override // com.spotify.player.model.Restrictions.RestrictionReasons.Builder
        public Restrictions.RestrictionReasons.Builder reasons(Set<String> set) {
            this.reasons = t380.p(set);
            return this;
        }
    }

    private AutoValue_Restrictions_RestrictionReasons(t380 t380Var) {
        this.reasons = t380Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Restrictions.RestrictionReasons) {
            return this.reasons.equals(((Restrictions.RestrictionReasons) obj).reasons());
        }
        return false;
    }

    public int hashCode() {
        return this.reasons.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.Restrictions.RestrictionReasons
    public t380 reasons() {
        return this.reasons;
    }

    public String toString() {
        return f4i1.f("RestrictionReasons{reasons=", String.valueOf(this.reasons), "}");
    }

    public /* synthetic */ AutoValue_Restrictions_RestrictionReasons(t380 t380Var, int i) {
        this(t380Var);
    }
}
