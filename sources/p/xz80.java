package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xz80 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;

    public xz80(String str, String str2, boolean z, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz80)) {
            return false;
        }
        xz80 xz80Var = (xz80) obj;
        if (!this.a.equals(xz80Var.a) || !this.b.equals(xz80Var.b) || !this.c.equals(xz80Var.c)) {
            return false;
        }
        bgm bgmVar = bgm.c;
        return bgmVar.equals(bgmVar) && this.d.equals(xz80Var.d) && this.e == xz80Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f4i1.b((((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31) - 414161009) * 31, 31, this.d);
    }
}
