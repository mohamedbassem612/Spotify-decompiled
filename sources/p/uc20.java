package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uc20 implements xc20 {
    public final yc20 a;

    public uc20(yc20 yc20Var) {
        this.a = yc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc20) && this.a.equals(((uc20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
