package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ugz {
    public final boolean a;
    public final piz b;

    public ugz(piz pizVar, boolean z) {
        this.a = z;
        this.b = pizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugz)) {
            return false;
        }
        ugz ugzVar = (ugz) obj;
        return this.a == ugzVar.a && u890.j(this.b, ugzVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        piz pizVar = this.b;
        return iHashCode + (pizVar == null ? 0 : pizVar.hashCode());
    }
}
