package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yn3 extends qxd0 {
    public final tv80 d;

    public yn3(tv80 tv80Var) {
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn3) && this.d.equals(((yn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
