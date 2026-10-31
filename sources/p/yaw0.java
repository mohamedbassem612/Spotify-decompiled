package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yaw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final k4m i;
    public final Function0 j;
    public final boolean k;
    public final boolean l;

    public /* synthetic */ yaw0(int i, String str, String str2, String str3, String str4, String str5, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? k4m.d : k4mVar, null, false, (i & 4096) != 0 ? false : z4);
    }

    public static yaw0 a(yaw0 yaw0Var, Function0 function0, int i) {
        String str = yaw0Var.a;
        String str2 = yaw0Var.b;
        String str3 = yaw0Var.c;
        String str4 = yaw0Var.d;
        String str5 = yaw0Var.e;
        boolean z = yaw0Var.f;
        boolean z2 = yaw0Var.g;
        boolean z3 = yaw0Var.h;
        k4m k4mVar = yaw0Var.i;
        yaw0Var.getClass();
        boolean z4 = (i & 2048) != 0 ? yaw0Var.k : true;
        boolean z5 = yaw0Var.l;
        yaw0Var.getClass();
        return new yaw0(str, str2, str3, str4, str5, z, z2, z3, k4mVar, function0, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yaw0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yaw0 yaw0Var = (yaw0) obj;
        return u890.j(this.a, yaw0Var.a) && u890.j(this.b, yaw0Var.b) && u890.j(this.c, yaw0Var.c) && u890.j(this.d, yaw0Var.d) && u890.j(this.e, yaw0Var.e) && this.f == yaw0Var.f && this.g == yaw0Var.g && this.l == yaw0Var.l && this.i == yaw0Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.l);
    }

    public yaw0(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, k4m k4mVar, Function0 function0, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = k4mVar;
        this.j = function0;
        this.k = z4;
        this.l = z5;
    }
}
