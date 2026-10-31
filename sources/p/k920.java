package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k920 implements h920 {
    public final l920 a;

    public k920(l920 l920Var) {
        this.a = l920Var;
    }

    public final boolean a() {
        return this.a.a instanceof i920;
    }

    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k920) && this.a.equals(((k920) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
