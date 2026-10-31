package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u17 implements dbr0 {
    public static final u17 b = new u17(uz6.a);
    public final wz6 a;

    public u17(wz6 wz6Var) {
        this.a = wz6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u17) && this.a.equals(((u17) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
