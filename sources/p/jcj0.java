package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jcj0 implements qcj0 {
    public final w4i1 a;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public jcj0(w4i1 w4i1Var) {
        this.a = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcj0) && this.a.equals(((jcj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
