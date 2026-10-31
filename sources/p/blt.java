package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class blt {
    public final String a;
    public final alt b;

    public blt(String str, alt altVar) {
        this.a = str;
        this.b = altVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blt)) {
            return false;
        }
        blt bltVar = (blt) obj;
        return u890.j(this.a, bltVar.a) && u890.j(this.b, bltVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        alt altVar = this.b;
        return iHashCode + (altVar == null ? 0 : altVar.hashCode());
    }
}
