package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lpm {
    public final mld a;
    public final Object b;

    public lpm(mld mldVar, Object obj) {
        this.a = mldVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpm)) {
            return false;
        }
        lpm lpmVar = (lpm) obj;
        return u890.j(this.a, lpmVar.a) && u890.j(this.b, lpmVar.b);
    }

    public final int hashCode() {
        return e331.b(this.b) + (this.a.a.hashCode() * 31);
    }
}
