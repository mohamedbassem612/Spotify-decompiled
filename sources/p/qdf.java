package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qdf implements bef {
    public final String a;
    public final sl01 b;

    public qdf(String str, sl01 sl01Var) {
        this.a = str;
        this.b = sl01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdf)) {
            return false;
        }
        qdf qdfVar = (qdf) obj;
        return u890.j(this.a, qdfVar.a) && this.b == qdfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
