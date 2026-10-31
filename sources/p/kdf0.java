package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kdf0 {
    public final ldf0 a;
    public final ldf0 b;
    public final mdf0 c;

    public kdf0() {
        qs10 qs10Var = qs10.N0;
        ws10 ws10Var = ws10.N0;
        this.a = qs10Var;
        this.b = ws10Var;
        this.c = mdf0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdf0)) {
            return false;
        }
        kdf0 kdf0Var = (kdf0) obj;
        return this.a.equals(kdf0Var.a) && this.b.equals(kdf0Var.b) && this.c.equals(kdf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
