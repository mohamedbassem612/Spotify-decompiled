package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sef extends cso1 {
    public final zro1 b;

    public sef(zro1 zro1Var) {
        this.b = zro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sef) && this.b.equals(((sef) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
