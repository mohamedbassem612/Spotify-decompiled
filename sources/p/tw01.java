package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tw01 {
    public final String a;
    public final int b;
    public final d8r0 c;
    public final String d;
    public final String e;
    public final ArrayList f;

    public tw01(int i, String str, String str2, String str3, ArrayList arrayList, d8r0 d8r0Var) {
        this.a = str;
        this.b = i;
        this.c = d8r0Var;
        this.d = str2;
        this.e = str3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw01)) {
            return false;
        }
        tw01 tw01Var = (tw01) obj;
        return u890.j(this.a, tw01Var.a) && this.b == tw01Var.b && this.c.equals(tw01Var.c) && u890.j(this.d, tw01Var.d) && u890.j(this.e, tw01Var.e) && this.f.equals(tw01Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(hrt.i(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
