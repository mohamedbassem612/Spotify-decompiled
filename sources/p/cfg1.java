package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cfg1 implements efg1 {
    public final xeg1 a;

    public cfg1(xeg1 xeg1Var) {
        this.a = xeg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfg1) && this.a.equals(((cfg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
