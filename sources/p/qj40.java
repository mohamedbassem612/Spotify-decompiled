package p;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qj40 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public qj40(Function0 function0, c5f0 c5f0Var, Function0 function1, Function0 function2, Function0 function3) {
        this.a = (byte) 0;
        this.b = function0;
        this.f = c5f0Var;
        this.c = function1;
        this.d = function2;
        this.e = function3;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                l811 l811Var = new l811();
                xet xetVar = new xet((Function0) obj5, (byte) 11);
                c5f0 c5f0Var = (c5f0) obj;
                djx djxVar = new djx((Object) c5f0Var, obj4, (Object) l811Var, (byte) 27);
                qd0 qd0Var = new qd0(l811Var, c5f0Var, (Function0) obj3, (lnm) null);
                ddh ddhVar = new ddh(l811Var, (Function0) obj2);
                u9a1 u9a1Var = rqd1.a;
                Object objS = smo1.s(new qt61((byte) 6, nav0Var, xetVar, djxVar, qd0Var, ddhVar, (lnm) null), lnmVar);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? objS : rih1Var;
            case 1:
                ven0 ven0Var = (ven0) obj5;
                Object objK = g5v.k(nav0Var, new i2g1(ven0Var, (byte) 17), new mek1(ven0Var, (byte) 3), new l3j1((View) obj4, (iu30) obj3, (drr0) obj2, (drr0) obj, (byte) 3), lnmVar, 4);
                return objK == d9nVar ? objK : rih1Var;
            default:
                Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new t3t0(nav0Var, (xu30) obj5, (ven0) obj4, (ven0) obj3, (ven0) obj2, (ven0) obj), lnmVar, 7);
                return objD == d9nVar ? objD : rih1Var;
        }
    }

    public /* synthetic */ qj40(Object obj, Object obj2, Object obj3, ven0 ven0Var, ven0 ven0Var2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = ven0Var;
        this.f = ven0Var2;
    }
}
