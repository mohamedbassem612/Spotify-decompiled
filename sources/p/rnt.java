package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rnt implements snt {
    public final String a;
    public final ugb0 b;

    public rnt(String str, ugb0 ugb0Var) {
        this.a = str;
        this.b = ugb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnt)) {
            return false;
        }
        rnt rntVar = (rnt) obj;
        return this.a.equals(rntVar.a) && this.b.equals(rntVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
