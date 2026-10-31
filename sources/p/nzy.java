package p;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class nzy {
    public static final blc0[] a = {blc0.ti, blc0.ui};
    public static final blc0[] b = {blc0.g1, blc0.h1, blc0.j1};
    public static final blc0[] c = {blc0.fh};
    public static final blc0[] d = {blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6};
    public static final blc0[] e = {blc0.u1, blc0.A1, blc0.M1};
    public static final blc0[] f = {blc0.ee};
    public static final blc0[] g = {blc0.U4};
    public static final blc0[] h = {blc0.O2};
    public static final blc0[] i = {blc0.de};
    public static final blc0[] j = {blc0.Rj};
    public static final blc0[] k = {blc0.lg};
    public static final blc0[] l = {blc0.A8};
    public static final blc0[] m = {blc0.yi, blc0.zi};
    public static final blc0[] n = {blc0.M3};
    public static final blc0[] o = {blc0.ed};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final se11 f59p = new se11("^[A-Za-z0-9_-]{1,128}$");

    public static final boolean a(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = b;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean b(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = n;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean c(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = d;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean d(String str) {
        Set set = s4b1.f;
        return uic.i(str, s4b1.g) || uic.g(str, blc0.Yc);
    }

    public static final boolean e(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = i;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean f(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = c;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean g(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = a;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean h(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = f;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length)) || (uic.x(str).d instanceof aji1);
    }

    public static final boolean i(String str) {
        return f59p.e(str);
    }

    public static final boolean j(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = j;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final String k(String str) {
        return ihc1.Z0(ihc1.e1(str).toString(), "?");
    }
}
