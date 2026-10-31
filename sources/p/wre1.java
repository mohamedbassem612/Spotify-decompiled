package p;

import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimeline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wre1 extends ese1 {
    public final UserTimeline a;
    public final int b;
    public final String c;

    public wre1(UserTimeline userTimeline, int i, String str) {
        this.a = userTimeline;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wre1)) {
            return false;
        }
        wre1 wre1Var = (wre1) obj;
        return this.a.equals(wre1Var.a) && this.b == wre1Var.b && this.c.equals(wre1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
