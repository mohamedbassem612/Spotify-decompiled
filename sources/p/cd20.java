package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cd20 implements dd20 {
    public final yc20 a;

    public cd20(yc20 yc20Var) {
        this.a = yc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd20) && this.a.equals(((cd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
