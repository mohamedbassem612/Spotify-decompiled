package com.spotify.player.model;

import p.cy30;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_AdBreakContext extends AdBreakContext {
    private final long maxSecondsRemaining;
    private final long positionInCurrentAdBreak;
    private final long totalAdsInBreakEstimate;

    private AutoValue_AdBreakContext(long j, long j2, long j3) {
        this.maxSecondsRemaining = j;
        this.positionInCurrentAdBreak = j2;
        this.totalAdsInBreakEstimate = j3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdBreakContext) {
            AdBreakContext adBreakContext = (AdBreakContext) obj;
            if (this.maxSecondsRemaining == adBreakContext.maxSecondsRemaining() && this.positionInCurrentAdBreak == adBreakContext.positionInCurrentAdBreak() && this.totalAdsInBreakEstimate == adBreakContext.totalAdsInBreakEstimate()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.maxSecondsRemaining;
        long j2 = this.positionInCurrentAdBreak;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.totalAdsInBreakEstimate;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    @Override // com.spotify.player.model.AdBreakContext
    public long maxSecondsRemaining() {
        return this.maxSecondsRemaining;
    }

    @Override // com.spotify.player.model.AdBreakContext
    public long positionInCurrentAdBreak() {
        return this.positionInCurrentAdBreak;
    }

    @Override // com.spotify.player.model.AdBreakContext
    public AdBreakContext.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        long j = this.maxSecondsRemaining;
        long j2 = this.positionInCurrentAdBreak;
        long j3 = this.totalAdsInBreakEstimate;
        StringBuilder sbS = cy30.s(j, "AdBreakContext{maxSecondsRemaining=", ", positionInCurrentAdBreak=");
        sbS.append(j2);
        sbS.append(", totalAdsInBreakEstimate=");
        sbS.append(j3);
        sbS.append("}");
        return sbS.toString();
    }

    @Override // com.spotify.player.model.AdBreakContext
    public long totalAdsInBreakEstimate() {
        return this.totalAdsInBreakEstimate;
    }

    public /* synthetic */ AutoValue_AdBreakContext(int i, long j, long j2, long j3) {
        this(j, j2, j3);
    }

    public static final class Builder extends AdBreakContext.Builder {
        private long maxSecondsRemaining;
        private long positionInCurrentAdBreak;
        private byte set$0;
        private long totalAdsInBreakEstimate;

        public Builder(AdBreakContext adBreakContext) {
            this.maxSecondsRemaining = adBreakContext.maxSecondsRemaining();
            this.positionInCurrentAdBreak = adBreakContext.positionInCurrentAdBreak();
            this.totalAdsInBreakEstimate = adBreakContext.totalAdsInBreakEstimate();
            this.set$0 = (byte) 7;
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext build() {
            if (this.set$0 == 7) {
                return new AutoValue_AdBreakContext(0, this.maxSecondsRemaining, this.positionInCurrentAdBreak, this.totalAdsInBreakEstimate);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" maxSecondsRemaining");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" positionInCurrentAdBreak");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" totalAdsInBreakEstimate");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext.Builder maxSecondsRemaining(long j) {
            this.maxSecondsRemaining = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext.Builder positionInCurrentAdBreak(long j) {
            this.positionInCurrentAdBreak = j;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.spotify.player.model.AdBreakContext.Builder
        public AdBreakContext.Builder totalAdsInBreakEstimate(long j) {
            this.totalAdsInBreakEstimate = j;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        public Builder() {
        }
    }
}
