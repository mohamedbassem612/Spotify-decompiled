package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sia {
    public final List a;
    public final long b;
    public final float c;

    public sia(List list, long j, float f) {
        this.a = list;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sia)) {
            return false;
        }
        sia siaVar = (sia) obj;
        return this.a.equals(siaVar.a) && jfv.f(this.b, siaVar.b) && Float.compare(this.c, siaVar.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ytw0 ytw0Var = jfv.b;
        return Float.hashCode(this.c) + cy30.f(iHashCode, this.b, 31);
    }
}
