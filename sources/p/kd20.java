package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kd20 extends pd20 {
    public final yc20 a;

    public kd20(yc20 yc20Var) {
        this.a = yc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd20) && this.a.equals(((kd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
