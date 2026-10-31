package com.spotify.player.model.command.options;

import java.util.Map;
import p.bb00;
import p.eg;
import p.gvg;
import p.j380;
import p.j5;
import p.l1d;
import p.mno1;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PlayerOptionOverrides extends PlayerOptionOverrides {
    private final j380 modes;
    private final spq0 playbackSpeed;
    private final spq0 repeatingContext;
    private final spq0 repeatingTrack;
    private final spq0 shufflingContext;

    private AutoValue_PlayerOptionOverrides(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, j380 j380Var) {
        this.shufflingContext = spq0Var;
        this.repeatingContext = spq0Var2;
        this.repeatingTrack = spq0Var3;
        this.playbackSpeed = spq0Var4;
        this.modes = j380Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptionOverrides) {
            PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) obj;
            if (this.shufflingContext.equals(playerOptionOverrides.shufflingContext()) && this.repeatingContext.equals(playerOptionOverrides.repeatingContext()) && this.repeatingTrack.equals(playerOptionOverrides.repeatingTrack()) && this.playbackSpeed.equals(playerOptionOverrides.playbackSpeed())) {
                j380 j380Var = this.modes;
                j380 j380VarModes = playerOptionOverrides.modes();
                j380Var.getClass();
                if (mno1.l(j380VarModes, j380Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.modes.hashCode() ^ ((((((((this.shufflingContext.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.repeatingTrack.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003);
    }

    public j380 modes() {
        return this.modes;
    }

    public spq0 playbackSpeed() {
        return this.playbackSpeed;
    }

    public spq0 repeatingContext() {
        return this.repeatingContext;
    }

    public spq0 repeatingTrack() {
        return this.repeatingTrack;
    }

    public spq0 shufflingContext() {
        return this.shufflingContext;
    }

    public PlayerOptionOverrides.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.shufflingContext);
        String strValueOf2 = String.valueOf(this.repeatingContext);
        String strValueOf3 = String.valueOf(this.repeatingTrack);
        String strValueOf4 = String.valueOf(this.playbackSpeed);
        String strValueOf5 = String.valueOf(this.modes);
        StringBuilder sbN = gvg.n("PlayerOptionOverrides{shufflingContext=", strValueOf, ", repeatingContext=", strValueOf2, ", repeatingTrack=");
        bb00.j(sbN, strValueOf3, ", playbackSpeed=", strValueOf4, ", modes=");
        return l1d.n(strValueOf5, "}", sbN);
    }

    public /* synthetic */ AutoValue_PlayerOptionOverrides(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, j380 j380Var, int i) {
        this(spq0Var, spq0Var2, spq0Var3, spq0Var4, j380Var);
    }

    public static final class Builder extends PlayerOptionOverrides.Builder {
        private j380 modes;
        private spq0 playbackSpeed;
        private spq0 repeatingContext;
        private spq0 repeatingTrack;
        private spq0 shufflingContext;

        public Builder(PlayerOptionOverrides playerOptionOverrides) {
            j5 j5Var = j5.a;
            this.shufflingContext = j5Var;
            this.repeatingContext = j5Var;
            this.repeatingTrack = j5Var;
            this.playbackSpeed = j5Var;
            this.shufflingContext = playerOptionOverrides.shufflingContext();
            this.repeatingContext = playerOptionOverrides.repeatingContext();
            this.repeatingTrack = playerOptionOverrides.repeatingTrack();
            this.playbackSpeed = playerOptionOverrides.playbackSpeed();
            this.modes = playerOptionOverrides.modes();
        }

        public PlayerOptionOverrides build() {
            if (this.modes != null) {
                return new AutoValue_PlayerOptionOverrides(this.shufflingContext, this.repeatingContext, this.repeatingTrack, this.playbackSpeed, this.modes, 0);
            }
            eg.m("Missing required properties: modes");
            return null;
        }

        public PlayerOptionOverrides.Builder modes(Map<String, String> map) {
            this.modes = j380.c(map);
            return this;
        }

        public PlayerOptionOverrides.Builder playbackSpeed(Float f) {
            this.playbackSpeed = spq0.d(f);
            return this;
        }

        public PlayerOptionOverrides.Builder repeatingContext(Boolean bool) {
            this.repeatingContext = spq0.d(bool);
            return this;
        }

        public PlayerOptionOverrides.Builder repeatingTrack(Boolean bool) {
            this.repeatingTrack = spq0.d(bool);
            return this;
        }

        public PlayerOptionOverrides.Builder shufflingContext(Boolean bool) {
            this.shufflingContext = spq0.d(bool);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.shufflingContext = j5Var;
            this.repeatingContext = j5Var;
            this.repeatingTrack = j5Var;
            this.playbackSpeed = j5Var;
        }
    }
}
