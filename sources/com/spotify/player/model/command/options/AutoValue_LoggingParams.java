package com.spotify.player.model.command.options;

import p.bb00;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_LoggingParams extends LoggingParams {
    private final spq0 commandId;
    private final spq0 commandInitiatedTime;
    private final spq0 commandReceivedTime;
    private final t380 interactionIds;
    private final t380 pageInstanceIds;

    private AutoValue_LoggingParams(spq0 spq0Var, spq0 spq0Var2, t380 t380Var, t380 t380Var2, spq0 spq0Var3) {
        this.commandInitiatedTime = spq0Var;
        this.commandReceivedTime = spq0Var2;
        this.pageInstanceIds = t380Var;
        this.interactionIds = t380Var2;
        this.commandId = spq0Var3;
    }

    public spq0 commandId() {
        return this.commandId;
    }

    public spq0 commandInitiatedTime() {
        return this.commandInitiatedTime;
    }

    public spq0 commandReceivedTime() {
        return this.commandReceivedTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoggingParams) {
            LoggingParams loggingParams = (LoggingParams) obj;
            if (this.commandInitiatedTime.equals(loggingParams.commandInitiatedTime()) && this.commandReceivedTime.equals(loggingParams.commandReceivedTime()) && this.pageInstanceIds.equals(loggingParams.pageInstanceIds()) && this.interactionIds.equals(loggingParams.interactionIds()) && this.commandId.equals(loggingParams.commandId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.commandId.hashCode() ^ ((((((((this.commandInitiatedTime.hashCode() ^ 1000003) * 1000003) ^ this.commandReceivedTime.hashCode()) * 1000003) ^ this.pageInstanceIds.hashCode()) * 1000003) ^ this.interactionIds.hashCode()) * 1000003);
    }

    public t380 interactionIds() {
        return this.interactionIds;
    }

    public t380 pageInstanceIds() {
        return this.pageInstanceIds;
    }

    public LoggingParams.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.commandInitiatedTime);
        String strValueOf2 = String.valueOf(this.commandReceivedTime);
        String strValueOf3 = String.valueOf(this.pageInstanceIds);
        String strValueOf4 = String.valueOf(this.interactionIds);
        String strValueOf5 = String.valueOf(this.commandId);
        StringBuilder sbN = gvg.n("LoggingParams{commandInitiatedTime=", strValueOf, ", commandReceivedTime=", strValueOf2, ", pageInstanceIds=");
        bb00.j(sbN, strValueOf3, ", interactionIds=", strValueOf4, ", commandId=");
        return l1d.n(strValueOf5, "}", sbN);
    }

    public /* synthetic */ AutoValue_LoggingParams(spq0 spq0Var, spq0 spq0Var2, t380 t380Var, t380 t380Var2, spq0 spq0Var3, int i) {
        this(spq0Var, spq0Var2, t380Var, t380Var2, spq0Var3);
    }

    public static final class Builder extends LoggingParams.Builder {
        private spq0 commandId;
        private spq0 commandInitiatedTime;
        private spq0 commandReceivedTime;
        private t380 interactionIds;
        private t380 pageInstanceIds;

        public Builder(LoggingParams loggingParams) {
            j5 j5Var = j5.a;
            this.commandInitiatedTime = j5Var;
            this.commandReceivedTime = j5Var;
            this.commandId = j5Var;
            this.commandInitiatedTime = loggingParams.commandInitiatedTime();
            this.commandReceivedTime = loggingParams.commandReceivedTime();
            this.pageInstanceIds = loggingParams.pageInstanceIds();
            this.interactionIds = loggingParams.interactionIds();
            this.commandId = loggingParams.commandId();
        }

        public LoggingParams build() {
            if (this.pageInstanceIds != null && this.interactionIds != null) {
                return new AutoValue_LoggingParams(this.commandInitiatedTime, this.commandReceivedTime, this.pageInstanceIds, this.interactionIds, this.commandId, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.pageInstanceIds == null) {
                sb.append(" pageInstanceIds");
            }
            if (this.interactionIds == null) {
                sb.append(" interactionIds");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        public LoggingParams.Builder commandId(String str) {
            this.commandId = spq0.d(str);
            return this;
        }

        public LoggingParams.Builder commandInitiatedTime(Long l) {
            this.commandInitiatedTime = spq0.d(l);
            return this;
        }

        public LoggingParams.Builder commandReceivedTime(Long l) {
            this.commandReceivedTime = spq0.d(l);
            return this;
        }

        public LoggingParams.Builder interactionIds(t380 t380Var) {
            if (t380Var != null) {
                this.interactionIds = t380Var;
                return this;
            }
            bhn0.i("Null interactionIds");
            return null;
        }

        public LoggingParams.Builder pageInstanceIds(t380 t380Var) {
            if (t380Var != null) {
                this.pageInstanceIds = t380Var;
                return this;
            }
            bhn0.i("Null pageInstanceIds");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.commandInitiatedTime = j5Var;
            this.commandReceivedTime = j5Var;
            this.commandId = j5Var;
        }
    }
}
