package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ipb1 {
    void a(jpb1 jpb1Var);

    default boolean b() {
        return true;
    }

    Bundle c();

    void d(jpb1 jpb1Var);

    void e(Object obj);

    default dts f() {
        dts dtsVarK = k();
        return dtsVarK == null ? new dts(null) : dtsVarK;
    }

    default dts g() {
        dts dtsVarK = k();
        if (i() == null) {
            dtsVarK = null;
        }
        if (dtsVarK == null) {
            return new dts(null);
        }
        return new dts(dtsVarK.a, dtsVarK.b, dtsVarK.c(h()), null);
    }

    Object getState();

    default String h() {
        String strI = i();
        return strI == null ? toString() : strI;
    }

    default String i() {
        return null;
    }

    void j(Bundle bundle);

    default dts k() {
        return null;
    }

    default Bundle serialize() {
        return null;
    }
}
