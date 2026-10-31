package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ej40 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final d8r0 f;
    public final List g;
    public final o940 h;

    public ej40(String str, String str2, CharSequence charSequence, String str3, String str4, d8r0 d8r0Var, List list, o940 o940Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = d8r0Var;
        this.g = list;
        this.h = o940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej40)) {
            return false;
        }
        ej40 ej40Var = (ej40) obj;
        return u890.j(this.a, ej40Var.a) && u890.j(this.b, ej40Var.b) && u890.j(this.c, ej40Var.c) && u890.j(this.d, ej40Var.d) && u890.j(this.e, ej40Var.e) && this.f.equals(ej40Var.f) && this.g.equals(ej40Var.g) && u890.j(this.h, ej40Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iB = f4i1.b(hrt.i(this.f, cy30.d(cy30.d((iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31, this.g);
        o940 o940Var = this.h;
        return iB + (o940Var != null ? o940Var.hashCode() : 0);
    }
}
