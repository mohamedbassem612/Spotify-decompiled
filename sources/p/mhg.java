package p;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mhg implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mhg(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        s8e0 s8e0Var = null;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                Object objD = s9p1.D(nav0Var, new lhg((iu30) obj3, (ven0) obj, (ven0) obj2, (lnm) null, (byte) 0), lnmVar);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                ven0 ven0Var = (ven0) obj2;
                Object objH = g5v.h(new hnf(ven0Var, (byte) 14), new hnf(ven0Var, (byte) 15), lnmVar, new bzm((ven0) obj, (byte) 0), new xd2((ven0) obj3, (byte) 7), nav0Var);
                return objH == d9nVar ? objH : rih1Var;
            case 2:
                Object objD2 = s9p1.D(nav0Var, new xj40((c9n) obj3, (pob0) obj, (lbh) obj2, null), lnmVar);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case 3:
                c9n c9nVar = (c9n) obj;
                sfx0 sfx0Var = (sfx0) obj2;
                Object objD3 = s9p1.D(nav0Var, new fqf((n511) obj3, new fz40(c9nVar, sfx0Var, (byte) 22), new jj50(c9nVar, sfx0Var, (byte) 13), new br60(c9nVar, sfx0Var, (byte) 0), new br60(c9nVar, sfx0Var, (byte) 1), (lnm) null), lnmVar);
                if (objD3 != d9nVar) {
                    objD3 = rih1Var;
                }
                return objD3 == d9nVar ? objD3 : rih1Var;
            case 4:
                iu30 iu30Var = (iu30) obj3;
                ss50 ss50Var = (ss50) obj2;
                zzz0 zzz0Var = (zzz0) obj;
                if (!zzz0Var.e.a() && zzz0Var.g) {
                    s8e0Var = new s8e0(ss50Var, iu30Var, (byte) 0);
                }
                Object objD4 = rqd1.d(nav0Var, s8e0Var, new s8e0(ss50Var, iu30Var, (byte) 1), (xu30) null, new t8e0(iu30Var, zzz0Var, (byte) 0), lnmVar, 4);
                return objD4 == d9nVar ? objD4 : rih1Var;
            case 5:
                Object objD5 = rqd1.d(nav0Var, (iu30) null, klf0.e1, (xu30) null, new gnf0((iu30) obj3, (bmf0) obj2, (ven0) obj, (byte) 2), lnmVar, 5);
                return objD5 == d9nVar ? objD5 : rih1Var;
            case 6:
                ss50 ss50Var2 = (ss50) obj;
                iu30 iu30Var2 = (iu30) obj3;
                Object objD6 = rqd1.d(nav0Var, new s8e0(ss50Var2, iu30Var2, (byte) 2), new s8e0(ss50Var2, iu30Var2, (byte) 3), (xu30) null, new wt3((az20) obj2, (byte) 5), lnmVar, 4);
                return objD6 == d9nVar ? objD6 : rih1Var;
            case 7:
                Object objD7 = s9p1.D(nav0Var, new lhg((View) obj3, (ven0) obj, (ven0) obj2, (lnm) null, (byte) 3), lnmVar);
                return objD7 == d9nVar ? objD7 : rih1Var;
            case 8:
                iu30 iu30Var3 = (iu30) obj3;
                Object objD8 = rqd1.d(nav0Var, (iu30) null, new s8e0((ss50) obj, iu30Var3, (byte) 4), (xu30) null, new mr3(iu30Var3, (String) obj2, (byte) 6), lnmVar, 5);
                return objD8 == d9nVar ? objD8 : rih1Var;
            case 9:
                iu30 iu30Var4 = (iu30) obj3;
                Object objD9 = rqd1.d(nav0Var, (iu30) null, new s8e0((ss50) obj, iu30Var4, (byte) 5), (xu30) null, new aft0(iu30Var4, (ovu0) obj2, (byte) 25), lnmVar, 5);
                return objD9 == d9nVar ? objD9 : rih1Var;
            case 10:
                j8d1 j8d1Var = (j8d1) nav0Var;
                Object objD10 = s9p1.D(j8d1Var, new yfz0((fgz0) obj3, j8d1Var.h() * zfz0.c, (c9n) obj, (drr0) obj2, null), lnmVar);
                return objD10 == d9nVar ? objD10 : rih1Var;
            case 11:
                Object objD11 = s9p1.D(nav0Var, new shb1(((int) (((j8d1) nav0Var).Y0 >> 32)) / 5.0f, (iu30) obj3, (ven0) obj, (hdn0) obj2, null), lnmVar);
                return objD11 == d9nVar ? objD11 : rih1Var;
            case 12:
                Object objX = dro.x(nav0Var, (Function0) obj, (iu30) obj3, (Function0) obj2, lnmVar);
                return objX == d9nVar ? objX : rih1Var;
            default:
                List list = k6f1.a;
                j8d1 j8d1Var2 = (j8d1) nav0Var;
                drr0 drr0Var = (drr0) obj2;
                Object objK = g5v.k(j8d1Var2, (iu30) null, new rr9(j8d1Var2.h() * 80.0f, j8d1Var2, (hdn0) obj3, drr0Var, (ven0) obj), new lb7(drr0Var, (byte) 3), lnmVar, 5);
                return objK == d9nVar ? objK : rih1Var;
        }
    }

    public /* synthetic */ mhg(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ mhg(Object obj, Object obj2, ven0 ven0Var, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = ven0Var;
    }

    public /* synthetic */ mhg(Object obj, iu30 iu30Var, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
    }
}
