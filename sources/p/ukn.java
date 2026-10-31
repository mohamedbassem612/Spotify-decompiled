package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ukn implements xkn {
    public final int a;
    public final w4i1 b;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public ukn(int i, w4i1 w4i1Var) {
        this.a = i;
        this.b = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukn)) {
            return false;
        }
        ukn uknVar = (ukn) obj;
        return this.a == uknVar.a && u890.j(this.b, uknVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
