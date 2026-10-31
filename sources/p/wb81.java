package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final String g;
    public final boolean h;

    public wb81(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = str6;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb81)) {
            return false;
        }
        wb81 wb81Var = (wb81) obj;
        return this.a.equals(wb81Var.a) && this.b.equals(wb81Var.b) && this.c.equals(wb81Var.c) && this.d.equals(wb81Var.d) && this.e.equals(wb81Var.e) && this.f.equals(wb81Var.f) && u890.j(this.g, wb81Var.g) && this.h == wb81Var.h;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        String str = this.g;
        return ((Boolean.hashCode(this.h) + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31) - 1346034426;
    }
}
