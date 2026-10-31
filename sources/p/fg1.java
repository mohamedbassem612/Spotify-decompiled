package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fg1 implements aik1 {
    public final ag1 a;

    public fg1(ag1 ag1Var) {
        this.a = ag1Var;
    }

    @Override // p.aik1
    public final int a() {
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg1) && u890.j(this.a, ((fg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
