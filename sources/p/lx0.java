package p;

import com.spotify.adsinternal.adscore.model.Format;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lx0 {
    public final int a;
    public final Format b;
    public final ji0 c;
    public final String d;

    public lx0(int i, Format format, ji0 ji0Var, String str) {
        this.a = i;
        this.b = format;
        this.c = ji0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx0)) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return this.a == lx0Var.a && this.b == lx0Var.b && this.c.equals(lx0Var.c) && this.d.equals(lx0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31)) * 31);
    }
}
