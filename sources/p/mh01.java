package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mh01 implements ph01 {
    public final ih01 a;

    public mh01(ih01 ih01Var) {
        this.a = ih01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh01) && this.a.equals(((mh01) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
