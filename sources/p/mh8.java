package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mh8 extends qh8 {
    public final ug8 a;

    public mh8(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh8) && this.a.equals(((mh8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
