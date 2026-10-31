package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ksc1 {
    public final u7h a;
    public final String b;

    public ksc1(u7h u7hVar, String str) {
        this.a = u7hVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksc1)) {
            return false;
        }
        ksc1 ksc1Var = (ksc1) obj;
        return u890.j(this.a, ksc1Var.a) && u890.j(this.b, ksc1Var.b);
    }

    public final int hashCode() {
        u7h u7hVar = this.a;
        return this.b.hashCode() + ((u7hVar == null ? 0 : Long.hashCode(u7hVar.a)) * 31);
    }
}
