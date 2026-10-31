package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qia {
    public final List a;
    public final float b;

    public qia(List list, float f, int i) {
        ytw0 ytw0Var = jfv.b;
        f = (i & 4) != 0 ? 0.0f : f;
        this.a = list;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qia)) {
            return false;
        }
        qia qiaVar = (qia) obj;
        return this.a.equals(qiaVar.a) && jfv.f(0L, 0L) && Float.compare(this.b, qiaVar.b) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ytw0 ytw0Var = jfv.b;
        return Float.hashCode(this.b) + cy30.f(iHashCode, 0L, 31);
    }
}
