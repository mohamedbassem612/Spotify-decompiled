package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ejb1 implements fjb1 {
    public final kx91 a;

    public ejb1(kx91 kx91Var) {
        this.a = kx91Var;
    }

    public final kx91 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejb1) && this.a.equals(((ejb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
