package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l8g1 {
    public final so20 a;

    public l8g1(so20 so20Var) {
        this.a = so20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8g1) && this.a.equals(((l8g1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
