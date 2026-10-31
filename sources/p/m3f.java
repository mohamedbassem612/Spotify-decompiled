package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3f implements q3f {
    public final w4i1 a;
    public final boolean b;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
    }

    public m3f(w4i1 w4i1Var, boolean z) {
        this.a = w4i1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3f)) {
            return false;
        }
        m3f m3fVar = (m3f) obj;
        return u890.j(this.a, m3fVar.a) && this.b == m3fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
