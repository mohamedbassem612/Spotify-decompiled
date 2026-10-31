package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lzh {
    public final ebr0 a;
    public final Parcelable b;

    public lzh(ebr0 ebr0Var, Parcelable parcelable) {
        this.a = ebr0Var;
        this.b = parcelable;
    }

    public final ebr0 a() {
        return this.a;
    }

    public final Parcelable b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzh)) {
            return false;
        }
        lzh lzhVar = (lzh) obj;
        return this.a.equals(lzhVar.a) && u890.j(this.b, lzhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
