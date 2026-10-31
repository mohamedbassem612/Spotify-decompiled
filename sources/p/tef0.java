package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tef0 {
    public static final tef0 j = new tef0(new a9h((ArrayList) null, 0, (List) null, (String) null, false, (bef0) null, (eef0) null, 0, (bff0) null, 1023), "", "absent", "", "", "", false, true, null);
    public final a9h a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public tef0(a9h a9hVar, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
        this.a = a9hVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = str6;
    }

    public static tef0 a(tef0 tef0Var, a9h a9hVar, String str, boolean z, String str2, int i) {
        if ((i & 1) != 0) {
            a9hVar = tef0Var.a;
        }
        a9h a9hVar2 = a9hVar;
        String str3 = tef0Var.b;
        if ((i & 4) != 0) {
            str = tef0Var.c;
        }
        String str4 = str;
        String str5 = tef0Var.d;
        String str6 = tef0Var.e;
        String str7 = tef0Var.f;
        boolean z2 = tef0Var.g;
        if ((i & 128) != 0) {
            z = tef0Var.h;
        }
        boolean z3 = z;
        if ((i & 256) != 0) {
            str2 = tef0Var.i;
        }
        return new tef0(a9hVar2, str3, str4, str5, str6, str7, z2, z3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tef0)) {
            return false;
        }
        tef0 tef0Var = (tef0) obj;
        return this.a.equals(tef0Var.a) && this.b.equals(tef0Var.b) && this.c.equals(tef0Var.c) && this.d.equals(tef0Var.d) && this.e.equals(tef0Var.e) && this.f.equals(tef0Var.f) && this.g == tef0Var.g && this.h == tef0Var.h && u890.j(this.i, tef0Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
