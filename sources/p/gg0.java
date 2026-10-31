package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gg0 implements ig0 {
    public final zf30 a;

    public gg0(zf30 zf30Var) {
        this.a = zf30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg0) && this.a.equals(((gg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
