package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qoh implements iph {
    public final String a;
    public final cg21 b;

    public qoh(String str, cg21 cg21Var) {
        this.a = str;
        this.b = cg21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoh)) {
            return false;
        }
        qoh qohVar = (qoh) obj;
        return u890.j(this.a, qohVar.a) && this.b.equals(qohVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
