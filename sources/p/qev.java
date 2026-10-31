package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qev {
    public final xe01 a;
    public final xe01 b;
    public final xe01 c;
    public final boolean d;

    public qev(xe01 xe01Var, xe01 xe01Var2, xe01 xe01Var3, boolean z) {
        this.a = xe01Var;
        this.b = xe01Var2;
        this.c = xe01Var3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qev) {
            qev qevVar = (qev) obj;
            if (this.a == qevVar.a && this.b == qevVar.b && this.c == qevVar.c && this.d == qevVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
