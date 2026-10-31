package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ibx {
    public final lee1 a;
    public final lee1 b;

    public ibx(lee1 lee1Var, lee1 lee1Var2) {
        this.a = lee1Var;
        this.b = lee1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibx)) {
            return false;
        }
        ibx ibxVar = (ibx) obj;
        return this.a.equals(ibxVar.a) && this.b.equals(ibxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
