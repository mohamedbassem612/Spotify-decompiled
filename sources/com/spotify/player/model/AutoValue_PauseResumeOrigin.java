package com.spotify.player.model;

import p.bhn0;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PauseResumeOrigin extends PauseResumeOrigin {
    private final String featureIdentifier;

    private AutoValue_PauseResumeOrigin(String str) {
        this.featureIdentifier = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseResumeOrigin) {
            return this.featureIdentifier.equals(((PauseResumeOrigin) obj).featureIdentifier());
        }
        return false;
    }

    @Override // com.spotify.player.model.PauseResumeOrigin
    public String featureIdentifier() {
        return this.featureIdentifier;
    }

    public int hashCode() {
        return this.featureIdentifier.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.PauseResumeOrigin
    public PauseResumeOrigin.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("PauseResumeOrigin{featureIdentifier=", this.featureIdentifier, "}");
    }

    public /* synthetic */ AutoValue_PauseResumeOrigin(String str, int i) {
        this(str);
    }

    public static final class Builder extends PauseResumeOrigin.Builder {
        private String featureIdentifier;

        public Builder(PauseResumeOrigin pauseResumeOrigin) {
            this.featureIdentifier = pauseResumeOrigin.featureIdentifier();
        }

        @Override // com.spotify.player.model.PauseResumeOrigin.Builder
        public PauseResumeOrigin build() {
            String str = this.featureIdentifier;
            if (str != null) {
                return new AutoValue_PauseResumeOrigin(str, 0);
            }
            eg.m("Missing required properties: featureIdentifier");
            return null;
        }

        @Override // com.spotify.player.model.PauseResumeOrigin.Builder
        public PauseResumeOrigin.Builder featureIdentifier(String str) {
            if (str != null) {
                this.featureIdentifier = str;
                return this;
            }
            bhn0.i("Null featureIdentifier");
            return null;
        }

        public Builder() {
        }
    }
}
