package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ci71 extends di71 {
    public final o571 a;

    static {
        idd1 idd1Var = o571.c;
    }

    public ci71(o571 o571Var) {
        this.a = o571Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci71) && u890.j(this.a, ((ci71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
