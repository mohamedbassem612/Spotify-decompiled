package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b4a1 implements h4a1 {
    public final f5a0 a;

    public b4a1(f5a0 f5a0Var) {
        this.a = f5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4a1) && this.a.equals(((b4a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
