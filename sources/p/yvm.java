package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yvm {
    public final w4i1 a;
    public final boolean b;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public yvm(w4i1 w4i1Var, boolean z) {
        this.a = w4i1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvm)) {
            return false;
        }
        yvm yvmVar = (yvm) obj;
        return u890.j(this.a, yvmVar.a) && this.b == yvmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
