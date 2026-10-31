package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mxe implements nye {
    public final String a;
    public final gxz0 b;
    public final boolean c;

    public mxe(String str, gxz0 gxz0Var, boolean z) {
        this.a = str;
        this.b = gxz0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxe)) {
            return false;
        }
        mxe mxeVar = (mxe) obj;
        return u890.j(this.a, mxeVar.a) && this.b.equals(mxeVar.b) && this.c == mxeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
