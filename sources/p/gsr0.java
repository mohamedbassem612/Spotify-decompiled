package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gsr0 implements hsr0 {
    public final String a;
    public final Uri b;
    public final long c;

    public gsr0(long j, Uri uri, String str) {
        this.a = str;
        this.b = uri;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsr0)) {
            return false;
        }
        gsr0 gsr0Var = (gsr0) obj;
        if (!this.a.equals(gsr0Var.a) || !this.b.equals(gsr0Var.b)) {
            return false;
        }
        long j = gsr0Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j);
    }

    public final int hashCode() {
        int iH = hrt.h(this.b, this.a.hashCode() * 31, 31);
        int i = u7h.l;
        return Long.hashCode(this.c) + iH;
    }
}
