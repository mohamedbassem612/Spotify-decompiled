package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mbb1 implements nbb1 {
    public final hbb1 a;

    public mbb1(hbb1 hbb1Var) {
        this.a = hbb1Var;
    }

    public final ibb1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbb1) && this.a.equals(((mbb1) obj).a);
    }

    public final rbb1 getPlaceholder() {
        return qbb1.a;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
