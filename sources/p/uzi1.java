package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uzi1 implements wzi1 {
    public final tzi1 a;
    public final szi1 b;
    public final szi1 c;
    public final yaq0 d;

    public uzi1(tzi1 tzi1Var, szi1 szi1Var, szi1 szi1Var2, yaq0 yaq0Var) {
        this.a = tzi1Var;
        this.b = szi1Var;
        this.c = szi1Var2;
        this.d = yaq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzi1)) {
            return false;
        }
        uzi1 uzi1Var = (uzi1) obj;
        return this.a == uzi1Var.a && this.b.equals(uzi1Var.b) && this.c.equals(uzi1Var.c) && u890.j(this.d, uzi1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        yaq0 yaq0Var = this.d;
        return iHashCode + (yaq0Var == null ? 0 : yaq0Var.hashCode());
    }
}
