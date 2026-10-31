package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zte1 implements aue1 {
    public final uvg1 a;

    public zte1(uvg1 uvg1Var) {
        this.a = uvg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zte1) && u890.j(this.a, ((zte1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
