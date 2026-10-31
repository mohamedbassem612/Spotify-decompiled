package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p81 extends u4p1 {
    public final String c;
    public final g4a d;
    public final g4a e;

    public p81(String str, g4a g4aVar, g4a g4aVar2) {
        this.c = str;
        this.d = g4aVar;
        this.e = g4aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p81)) {
            return false;
        }
        p81 p81Var = (p81) obj;
        return u890.j(this.c, p81Var.c) && this.d == p81Var.d && this.e == p81Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
