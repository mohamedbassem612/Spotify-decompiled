package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class boh implements iph {
    public final String a;
    public final kp8 b;
    public final tv80 c;
    public final boolean d;

    public boh(String str, kp8 kp8Var, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = kp8Var;
        this.c = tv80Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boh)) {
            return false;
        }
        boh bohVar = (boh) obj;
        return this.a.equals(bohVar.a) && this.b.equals(bohVar.b) && u890.j(this.c, bohVar.c) && this.d == bohVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tv80 tv80Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
