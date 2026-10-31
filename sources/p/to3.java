package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class to3 extends qxd0 {
    public final jv51 d;

    public to3(jv51 jv51Var) {
        this.d = jv51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to3) && this.d.equals(((to3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
