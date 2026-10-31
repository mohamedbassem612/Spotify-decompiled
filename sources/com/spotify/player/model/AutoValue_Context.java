package com.spotify.player.model;

import p.b380;
import p.bb00;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j380;
import p.j5;
import p.l1d;
import p.mno1;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_Context extends Context {
    private final j380 metadata;
    private final spq0 pages;
    private final spq0 restrictions;
    private final String uri;
    private final String url;

    private AutoValue_Context(String str, String str2, j380 j380Var, spq0 spq0Var, spq0 spq0Var2) {
        this.uri = str;
        this.url = str2;
        this.metadata = j380Var;
        this.pages = spq0Var;
        this.restrictions = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Context) {
            Context context = (Context) obj;
            if (this.uri.equals(context.uri()) && this.url.equals(context.url())) {
                j380 j380Var = this.metadata;
                j380 j380VarMetadata = context.metadata();
                j380Var.getClass();
                if (mno1.l(j380VarMetadata, j380Var) && this.pages.equals(context.pages()) && this.restrictions.equals(context.restrictions())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.restrictions.hashCode() ^ ((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003) ^ this.pages.hashCode()) * 1000003);
    }

    public j380 metadata() {
        return this.metadata;
    }

    public spq0 pages() {
        return this.pages;
    }

    public spq0 restrictions() {
        return this.restrictions;
    }

    public Context.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.uri;
        String str2 = this.url;
        String strValueOf = String.valueOf(this.metadata);
        String strValueOf2 = String.valueOf(this.pages);
        String strValueOf3 = String.valueOf(this.restrictions);
        StringBuilder sbN = gvg.n("Context{uri=", str, ", url=", str2, ", metadata=");
        bb00.j(sbN, strValueOf, ", pages=", strValueOf2, ", restrictions=");
        return l1d.n(strValueOf3, "}", sbN);
    }

    public String uri() {
        return this.uri;
    }

    public String url() {
        return this.url;
    }

    public /* synthetic */ AutoValue_Context(String str, String str2, j380 j380Var, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(str, str2, j380Var, spq0Var, spq0Var2);
    }

    public static final class Builder extends Context.Builder {
        private j380 metadata;
        private spq0 pages;
        private spq0 restrictions;
        private String uri;
        private String url;

        public Builder(Context context) {
            j5 j5Var = j5.a;
            this.pages = j5Var;
            this.restrictions = j5Var;
            this.uri = context.uri();
            this.url = context.url();
            this.metadata = context.metadata();
            this.pages = context.pages();
            this.restrictions = context.restrictions();
        }

        public Context build() {
            String str;
            j380 j380Var;
            String str2 = this.uri;
            if (str2 != null && (str = this.url) != null && (j380Var = this.metadata) != null) {
                return new AutoValue_Context(str2, str, j380Var, this.pages, this.restrictions, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.uri == null) {
                sb.append(" uri");
            }
            if (this.url == null) {
                sb.append(" url");
            }
            if (this.metadata == null) {
                sb.append(" metadata");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        public Context.Builder metadata(j380 j380Var) {
            if (j380Var != null) {
                this.metadata = j380Var;
                return this;
            }
            bhn0.i("Null metadata");
            return null;
        }

        public Context.Builder pages(b380 b380Var) {
            this.pages = spq0.d(b380Var);
            return this;
        }

        public Context.Builder restrictions(Restrictions restrictions) {
            this.restrictions = spq0.d(restrictions);
            return this;
        }

        public Context.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            bhn0.i("Null uri");
            return null;
        }

        public Context.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            bhn0.i("Null url");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.pages = j5Var;
            this.restrictions = j5Var;
        }
    }
}
