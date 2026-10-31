package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e7e0 implements g7e0 {
    public final zf80 a;

    public e7e0(zf80 zf80Var) {
        this.a = zf80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7e0) && this.a.equals(((e7e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
