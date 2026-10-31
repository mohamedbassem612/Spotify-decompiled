package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ikb {
    public final vuh0 a;
    public final boolean b;
    public final boolean c;

    public ikb(vuh0 vuh0Var, boolean z, boolean z2) {
        this.a = vuh0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikb)) {
            return false;
        }
        ikb ikbVar = (ikb) obj;
        return this.a.equals(ikbVar.a) && this.b == ikbVar.b && this.c == ikbVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
