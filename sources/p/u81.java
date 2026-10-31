package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u81 extends u4p1 {
    public final String c;
    public final String d;
    public final g4a e;
    public final g4a f;
    public final boolean g;

    public u81(String str, String str2, g4a g4aVar, g4a g4aVar2, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = g4aVar;
        this.f = g4aVar2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u81)) {
            return false;
        }
        u81 u81Var = (u81) obj;
        return u890.j(this.c, u81Var.c) && u890.j(this.d, u81Var.d) && this.e == u81Var.e && this.f == u81Var.f && this.g == u81Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d)) * 31)) * 31);
    }
}
