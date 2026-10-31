package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yco implements zco {
    public final ji0 a;
    public final mr20 b;

    public yco(ji0 ji0Var, mr20 mr20Var) {
        this.a = ji0Var;
        this.b = mr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yco)) {
            return false;
        }
        yco ycoVar = (yco) obj;
        return u890.j(this.a, ycoVar.a) && this.b.equals(ycoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
