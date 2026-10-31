package com.spotify.player.model.command.options;

import p.bb00;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SkipToTrack extends SkipToTrack {
    private final spq0 pageIndex;
    private final spq0 pageUrl;
    private final spq0 trackIndex;
    private final spq0 trackUid;
    private final spq0 trackUri;

    private AutoValue_SkipToTrack(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, spq0 spq0Var5) {
        this.pageUrl = spq0Var;
        this.pageIndex = spq0Var2;
        this.trackUid = spq0Var3;
        this.trackUri = spq0Var4;
        this.trackIndex = spq0Var5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToTrack) {
            SkipToTrack skipToTrack = (SkipToTrack) obj;
            if (this.pageUrl.equals(skipToTrack.pageUrl()) && this.pageIndex.equals(skipToTrack.pageIndex()) && this.trackUid.equals(skipToTrack.trackUid()) && this.trackUri.equals(skipToTrack.trackUri()) && this.trackIndex.equals(skipToTrack.trackIndex())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.trackIndex.hashCode() ^ ((((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.pageIndex.hashCode()) * 1000003) ^ this.trackUid.hashCode()) * 1000003) ^ this.trackUri.hashCode()) * 1000003);
    }

    public spq0 pageIndex() {
        return this.pageIndex;
    }

    public spq0 pageUrl() {
        return this.pageUrl;
    }

    public SkipToTrack.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.pageUrl);
        String strValueOf2 = String.valueOf(this.pageIndex);
        String strValueOf3 = String.valueOf(this.trackUid);
        String strValueOf4 = String.valueOf(this.trackUri);
        String strValueOf5 = String.valueOf(this.trackIndex);
        StringBuilder sbN = gvg.n("SkipToTrack{pageUrl=", strValueOf, ", pageIndex=", strValueOf2, ", trackUid=");
        bb00.j(sbN, strValueOf3, ", trackUri=", strValueOf4, ", trackIndex=");
        return l1d.n(strValueOf5, "}", sbN);
    }

    public spq0 trackIndex() {
        return this.trackIndex;
    }

    public spq0 trackUid() {
        return this.trackUid;
    }

    public spq0 trackUri() {
        return this.trackUri;
    }

    public /* synthetic */ AutoValue_SkipToTrack(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, spq0 spq0Var5, int i) {
        this(spq0Var, spq0Var2, spq0Var3, spq0Var4, spq0Var5);
    }

    public static final class Builder extends SkipToTrack.Builder {
        private spq0 pageIndex;
        private spq0 pageUrl;
        private spq0 trackIndex;
        private spq0 trackUid;
        private spq0 trackUri;

        public Builder(SkipToTrack skipToTrack) {
            j5 j5Var = j5.a;
            this.pageUrl = j5Var;
            this.pageIndex = j5Var;
            this.trackUid = j5Var;
            this.trackUri = j5Var;
            this.trackIndex = j5Var;
            this.pageUrl = skipToTrack.pageUrl();
            this.pageIndex = skipToTrack.pageIndex();
            this.trackUid = skipToTrack.trackUid();
            this.trackUri = skipToTrack.trackUri();
            this.trackIndex = skipToTrack.trackIndex();
        }

        public SkipToTrack build() {
            return new AutoValue_SkipToTrack(this.pageUrl, this.pageIndex, this.trackUid, this.trackUri, this.trackIndex, 0);
        }

        public SkipToTrack.Builder pageIndex(Long l) {
            this.pageIndex = spq0.d(l);
            return this;
        }

        public SkipToTrack.Builder pageUrl(String str) {
            this.pageUrl = spq0.d(str);
            return this;
        }

        public SkipToTrack.Builder trackIndex(Long l) {
            this.trackIndex = spq0.d(l);
            return this;
        }

        public SkipToTrack.Builder trackUid(String str) {
            this.trackUid = spq0.d(str);
            return this;
        }

        public SkipToTrack.Builder trackUri(String str) {
            this.trackUri = spq0.d(str);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.pageUrl = j5Var;
            this.pageIndex = j5Var;
            this.trackUid = j5Var;
            this.trackUri = j5Var;
            this.trackIndex = j5Var;
        }
    }
}
