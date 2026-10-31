package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wun0 implements xun0 {
    public final Parcelable a;
    public final xg30 b;
    public final zf30 c;

    public wun0(Parcelable parcelable, xg30 xg30Var, zf30 zf30Var) {
        this.a = parcelable;
        this.b = xg30Var;
        this.c = zf30Var;
    }

    public final xg30 a() {
        return this.b;
    }

    public final zf30 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wun0)) {
            return false;
        }
        wun0 wun0Var = (wun0) obj;
        return this.a.equals(wun0Var.a) && u890.j(this.b, wun0Var.b) && u890.j(this.c, wun0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zf30 zf30Var = this.c;
        return iHashCode + (zf30Var == null ? 0 : zf30Var.hashCode());
    }
}
