package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xp90 {
    public final phx a;
    public final phx b;
    public final String c;

    public xp90(phx phxVar, phx phxVar2, String str) {
        this.a = phxVar;
        this.b = phxVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp90)) {
            return false;
        }
        xp90 xp90Var = (xp90) obj;
        return this.a.equals(xp90Var.a) && this.b.equals(xp90Var.b) && u890.j(this.c, xp90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
