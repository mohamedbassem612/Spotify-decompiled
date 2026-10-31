package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vqd {
    public final boolean a;
    public final boolean b;
    public final String c;

    public vqd(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqd)) {
            return false;
        }
        vqd vqdVar = (vqd) obj;
        return this.a == vqdVar.a && this.b == vqdVar.b && u890.j(this.c, vqdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
