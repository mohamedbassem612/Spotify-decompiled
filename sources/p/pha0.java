package p;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class pha0 {
    public static final ye90 a = ye90.m(new String[]{"x", "y"});

    public static int a(eha0 eha0Var) {
        eha0Var.a();
        int i = (int) (eha0Var.i() * 255.0d);
        int i2 = (int) (eha0Var.i() * 255.0d);
        int i3 = (int) (eha0Var.i() * 255.0d);
        while (eha0Var.g()) {
            eha0Var.v();
        }
        eha0Var.d();
        return Color.argb(255, i, i2, i3);
    }

    public static PointF b(eha0 eha0Var, float f) {
        int iC = l1d.C(eha0Var.o());
        if (iC == 0) {
            eha0Var.a();
            float fI = (float) eha0Var.i();
            float fI2 = (float) eha0Var.i();
            while (eha0Var.o() != 2) {
                eha0Var.v();
            }
            eha0Var.d();
            return new PointF(fI * f, fI2 * f);
        }
        if (iC != 2) {
            if (iC != 6) {
                hhg1.n("Unknown point starts with ".concat(cy30.z(eha0Var.o())));
                return null;
            }
            float fI3 = (float) eha0Var.i();
            float fI4 = (float) eha0Var.i();
            while (eha0Var.g()) {
                eha0Var.v();
            }
            return new PointF(fI3 * f, fI4 * f);
        }
        eha0Var.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (eha0Var.g()) {
            int iQ = eha0Var.q(a);
            if (iQ == 0) {
                fD = d(eha0Var);
            } else if (iQ != 1) {
                eha0Var.u();
                eha0Var.v();
            } else {
                fD2 = d(eha0Var);
            }
        }
        eha0Var.e();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(eha0 eha0Var, float f) {
        ArrayList arrayList = new ArrayList();
        eha0Var.a();
        while (eha0Var.o() == 1) {
            eha0Var.a();
            arrayList.add(b(eha0Var, f));
            eha0Var.d();
        }
        eha0Var.d();
        return arrayList;
    }

    public static float d(eha0 eha0Var) {
        int iO = eha0Var.o();
        int iC = l1d.C(iO);
        if (iC != 0) {
            if (iC == 6) {
                return (float) eha0Var.i();
            }
            hhg1.n("Unknown value for token of type ".concat(cy30.z(iO)));
            return 0.0f;
        }
        eha0Var.a();
        float fI = (float) eha0Var.i();
        while (eha0Var.g()) {
            eha0Var.v();
        }
        eha0Var.d();
        return fI;
    }
}
