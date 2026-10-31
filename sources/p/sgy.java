package p;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class sgy {
    public static final blc0[] a = {blc0.ti, blc0.ui};
    public static final blc0[] b = {blc0.g1, blc0.h1, blc0.j1};
    public static final blc0[] c = {blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6};

    public static final boolean a(String str) {
        return str != null && nhc1.Y(str, "spotify:kallax:", false);
    }

    public static final boolean b(String str) {
        if (str != null) {
            return nik1.F.a(str);
        }
        return false;
    }

    public static final boolean c(String str) {
        Set set = s4b1.f;
        return uic.g(str, blc0.ed);
    }

    public static final boolean d(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = c;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }

    public static final boolean e(String str) {
        return d(str) || c(str);
    }

    public static final boolean f(String str) {
        Set set = s4b1.f;
        return uic.g(str, blc0.fh);
    }

    public static final boolean g(String str) {
        Set set = s4b1.f;
        return uic.g(str, blc0.jf);
    }

    public static final boolean h(String str) {
        Set set = s4b1.f;
        return uic.g(str, blc0.Mf);
    }

    public static final boolean i(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = a;
        return uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length));
    }
}
