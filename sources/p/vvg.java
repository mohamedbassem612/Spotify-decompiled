package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vvg implements y561 {
    public final Uri a;
    public final String b;
    public final boolean c;
    public final long d;

    public vvg(Uri uri, String str, boolean z, long j) {
        this.a = uri;
        this.b = str;
        this.c = z;
        this.d = j;
    }

    public final long a() {
        return this.d;
    }

    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvg)) {
            return false;
        }
        vvg vvgVar = (vvg) obj;
        return this.a.equals(vvgVar.a) && u890.j(this.b, vvgVar.b) && this.c == vvgVar.c && this.d == vvgVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
