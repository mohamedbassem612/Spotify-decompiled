package p;

import android.graphics.PointF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aqu implements usi1 {
    public static final aqu a = new aqu();
    public static final ye90 b = ye90.m(new String[]{"t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz"});

    public final Object h(eha0 eha0Var, float f) {
        eha0Var.c();
        String strM = null;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        int iJ = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zH = true;
        int i = 3;
        String strM2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (eha0Var.g()) {
            switch (eha0Var.q(b)) {
                case 0:
                    strM = eha0Var.m();
                    break;
                case 1:
                    strM2 = eha0Var.m();
                    break;
                case 2:
                    fI = (float) eha0Var.i();
                    break;
                case 3:
                    int iJ2 = eha0Var.j();
                    i = (iJ2 <= 2 && iJ2 >= 0) ? l1d.H(3)[iJ2] : 3;
                    break;
                case 4:
                    iJ = eha0Var.j();
                    break;
                case 5:
                    fI2 = (float) eha0Var.i();
                    break;
                case 6:
                    fI3 = (float) eha0Var.i();
                    break;
                case 7:
                    iA = pha0.a(eha0Var);
                    break;
                case 8:
                    iA2 = pha0.a(eha0Var);
                    break;
                case 9:
                    fI4 = (float) eha0Var.i();
                    break;
                case 10:
                    zH = eha0Var.h();
                    break;
                case 11:
                    eha0Var.a();
                    pointF = new PointF(((float) eha0Var.i()) * f, ((float) eha0Var.i()) * f);
                    eha0Var.d();
                    break;
                case 12:
                    eha0Var.a();
                    pointF = pointF;
                    pointF2 = new PointF(((float) eha0Var.i()) * f, ((float) eha0Var.i()) * f);
                    eha0Var.d();
                    break;
                default:
                    eha0Var.u();
                    eha0Var.v();
                    break;
            }
        }
        eha0Var.e();
        zpu zpuVar = new zpu();
        zpuVar.a = strM;
        zpuVar.b = strM2;
        zpuVar.c = fI;
        zpuVar.d = i;
        zpuVar.e = iJ;
        zpuVar.f = fI2;
        zpuVar.g = fI3;
        zpuVar.h = iA;
        zpuVar.i = iA2;
        zpuVar.j = fI4;
        zpuVar.k = zH;
        zpuVar.l = pointF;
        zpuVar.m = pointF2;
        return zpuVar;
    }
}
