package com.spotify.player.model;

import java.util.Map;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j380;
import p.mno1;
import p.rjx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_ContextTrack extends ContextTrack {
    private final j380 metadata;
    private final String provider;
    private final String uid;
    private final String uri;

    private AutoValue_ContextTrack(String str, String str2, j380 j380Var, String str3) {
        this.uri = str;
        this.uid = str2;
        this.metadata = j380Var;
        this.provider = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextTrack) {
            ContextTrack contextTrack = (ContextTrack) obj;
            if (this.uri.equals(contextTrack.uri()) && this.uid.equals(contextTrack.uid())) {
                j380 j380Var = this.metadata;
                j380 j380VarMetadata = contextTrack.metadata();
                j380Var.getClass();
                if (mno1.l(j380VarMetadata, j380Var) && this.provider.equals(contextTrack.provider())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.provider.hashCode() ^ ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.uid.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003);
    }

    public j380 metadata() {
        return this.metadata;
    }

    public String provider() {
        return this.provider;
    }

    public ContextTrack$Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.uri;
        String str2 = this.uid;
        return rjx.o(gvg.n("ContextTrack{uri=", str, ", uid=", str2, ", metadata="), String.valueOf(this.metadata), ", provider=", this.provider, "}");
    }

    public String uid() {
        return this.uid;
    }

    public String uri() {
        return this.uri;
    }

    public /* synthetic */ AutoValue_ContextTrack(String str, String str2, j380 j380Var, String str3, int i) {
        this(str, str2, j380Var, str3);
    }

    public static final class Builder extends ContextTrack$Builder {
        private j380 metadata;
        private String provider;
        private String uid;
        private String uri;

        public Builder(ContextTrack contextTrack) {
            this.uri = contextTrack.uri();
            this.uid = contextTrack.uid();
            this.metadata = contextTrack.metadata();
            this.provider = contextTrack.provider();
        }

        @Override // com.spotify.player.model.ContextTrack$Builder
        public ContextTrack build() {
            if (this.uri != null && this.uid != null && this.metadata != null && this.provider != null) {
                return new AutoValue_ContextTrack(this.uri, this.uid, this.metadata, this.provider, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.uri == null) {
                sb.append(" uri");
            }
            if (this.uid == null) {
                sb.append(" uid");
            }
            if (this.metadata == null) {
                sb.append(" metadata");
            }
            if (this.provider == null) {
                sb.append(" provider");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.ContextTrack$Builder
        public ContextTrack$Builder metadata(Map<String, String> map) {
            this.metadata = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.ContextTrack$Builder
        public ContextTrack$Builder provider(String str) {
            if (str != null) {
                this.provider = str;
                return this;
            }
            bhn0.i("Null provider");
            return null;
        }

        @Override // com.spotify.player.model.ContextTrack$Builder
        public ContextTrack$Builder uid(String str) {
            if (str != null) {
                this.uid = str;
                return this;
            }
            bhn0.i("Null uid");
            return null;
        }

        @Override // com.spotify.player.model.ContextTrack$Builder
        public ContextTrack$Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            bhn0.i("Null uri");
            return null;
        }

        public Builder() {
        }
    }
}
