package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l72 extends n72 {
    public final String e;
    public final d3d1 f;
    public final byte g;
    public final String h;
    public final String i;

    /* JADX WARN: Multi-variable type inference failed */
    public l72(int i, String str, String str2, String str3, d3d1 d3d1Var) {
        super(str, d3d1Var, i, str3);
        this.e = str;
        this.f = d3d1Var;
        this.g = i;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l72)) {
            return false;
        }
        l72 l72Var = (l72) obj;
        return u890.j(this.e, l72Var.e) && this.f == l72Var.f && this.g == l72Var.g && u890.j(this.h, l72Var.h) && u890.j(this.i, l72Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(kaa0.f(this.g, (this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31), 31, this.h);
    }

    public /* synthetic */ l72(String str) {
        this(8, str, "", "", d3d1.MUSIC_NPV);
    }
}
