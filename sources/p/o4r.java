package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o4r {
    public final zjd1 a;
    public final boolean b;

    public o4r(zjd1 zjd1Var, boolean z) {
        this.a = zjd1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4r)) {
            return false;
        }
        o4r o4rVar = (o4r) obj;
        return u890.j(this.a, o4rVar.a) && this.b == o4rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
