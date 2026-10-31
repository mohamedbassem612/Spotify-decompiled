package com.spotify.player.model;

import java.util.Map;
import p.b380;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j380;
import p.j5;
import p.mno1;
import p.rjx;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_ContextPage extends ContextPage {
    private final j380 metadata;
    private final String nextPageUrl;
    private final String pageUrl;
    private final spq0 tracks;

    private AutoValue_ContextPage(String str, String str2, spq0 spq0Var, j380 j380Var) {
        this.pageUrl = str;
        this.nextPageUrl = str2;
        this.tracks = spq0Var;
        this.metadata = j380Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextPage) {
            ContextPage contextPage = (ContextPage) obj;
            if (this.pageUrl.equals(contextPage.pageUrl()) && this.nextPageUrl.equals(contextPage.nextPageUrl()) && this.tracks.equals(contextPage.tracks())) {
                j380 j380Var = this.metadata;
                j380 j380VarMetadata = contextPage.metadata();
                j380Var.getClass();
                if (mno1.l(j380VarMetadata, j380Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.metadata.hashCode() ^ ((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.nextPageUrl.hashCode()) * 1000003) ^ this.tracks.hashCode()) * 1000003);
    }

    public j380 metadata() {
        return this.metadata;
    }

    public String nextPageUrl() {
        return this.nextPageUrl;
    }

    public String pageUrl() {
        return this.pageUrl;
    }

    public ContextPage$Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.pageUrl;
        String str2 = this.nextPageUrl;
        return rjx.o(gvg.n("ContextPage{pageUrl=", str, ", nextPageUrl=", str2, ", tracks="), String.valueOf(this.tracks), ", metadata=", String.valueOf(this.metadata), "}");
    }

    public spq0 tracks() {
        return this.tracks;
    }

    public /* synthetic */ AutoValue_ContextPage(String str, String str2, spq0 spq0Var, j380 j380Var, int i) {
        this(str, str2, spq0Var, j380Var);
    }

    public static final class Builder extends ContextPage$Builder {
        private j380 metadata;
        private String nextPageUrl;
        private String pageUrl;
        private spq0 tracks;

        public Builder(ContextPage contextPage) {
            this.tracks = j5.a;
            this.pageUrl = contextPage.pageUrl();
            this.nextPageUrl = contextPage.nextPageUrl();
            this.tracks = contextPage.tracks();
            this.metadata = contextPage.metadata();
        }

        @Override // com.spotify.player.model.ContextPage$Builder
        public ContextPage build() {
            if (this.pageUrl != null && this.nextPageUrl != null && this.metadata != null) {
                return new AutoValue_ContextPage(this.pageUrl, this.nextPageUrl, this.tracks, this.metadata, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.pageUrl == null) {
                sb.append(" pageUrl");
            }
            if (this.nextPageUrl == null) {
                sb.append(" nextPageUrl");
            }
            if (this.metadata == null) {
                sb.append(" metadata");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.ContextPage$Builder
        public ContextPage$Builder metadata(Map<String, String> map) {
            this.metadata = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.ContextPage$Builder
        public ContextPage$Builder nextPageUrl(String str) {
            if (str != null) {
                this.nextPageUrl = str;
                return this;
            }
            bhn0.i("Null nextPageUrl");
            return null;
        }

        @Override // com.spotify.player.model.ContextPage$Builder
        public ContextPage$Builder pageUrl(String str) {
            if (str != null) {
                this.pageUrl = str;
                return this;
            }
            bhn0.i("Null pageUrl");
            return null;
        }

        @Override // com.spotify.player.model.ContextPage$Builder
        public ContextPage$Builder tracks(b380 b380Var) {
            this.tracks = spq0.d(b380Var);
            return this;
        }

        public Builder() {
            this.tracks = j5.a;
        }
    }
}
