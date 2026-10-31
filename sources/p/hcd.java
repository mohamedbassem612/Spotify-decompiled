package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hcd implements jcd {
    public final String a;
    public final ctf b;
    public final zks0 c;

    public hcd(String str, ctf ctfVar, zks0 zks0Var) {
        this.a = str;
        this.b = ctfVar;
        this.c = zks0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcd)) {
            return false;
        }
        hcd hcdVar = (hcd) obj;
        return u890.j(this.a, hcdVar.a) && u890.j(this.b, hcdVar.b) && u890.j(this.c, hcdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
