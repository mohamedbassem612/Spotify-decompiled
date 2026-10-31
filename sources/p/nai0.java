package p;

import android.os.ResultReceiver;
import com.spotify.mobius.functions.Consumer;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nai0 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nai0(Set set, lbh1 lbh1Var, boolean z, Set set2, Set set3, rxe1 rxe1Var, String str, ven0 ven0Var, iu30 iu30Var, ResultReceiver resultReceiver, tsq tsqVar) {
        super(2);
        this.d = set;
        this.e = lbh1Var;
        this.b = z;
        this.f = set2;
        this.g = set3;
        this.h = rxe1Var;
        this.i = str;
        this.t = ven0Var;
        this.c = iu30Var;
        this.X = resultReceiver;
        this.Y = tsqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Y;
        Object obj4 = this.d;
        Object obj5 = this.X;
        Object obj6 = this.t;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.f;
        Object obj11 = this.c;
        Object obj12 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    rce0.a((tl7) ((Function0) obj4).invoke(), apo.r(1935740065, new twj((hob1) obj12, (iu30) obj11, (iuj) obj10, (znb0) obj9, (znb0) obj8, (znb0) obj7, (znb0) obj6, this.b, (znb0) obj5, (i091) obj3), x340Var2), x340Var2, 48);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj11;
                ven0 ven0Var = (ven0) obj6;
                lbh1 lbh1Var = (lbh1) obj12;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    tsq tsqVar = (tsq) obj3;
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = (ubh1) tsqVar.get();
                        x340Var4.s0(objT);
                    }
                    ubh1 ubh1Var = (ubh1) objT;
                    ubh1Var.getClass();
                    String str = lbh1Var.a;
                    boolean zContains = ((Set) obj4).contains(str);
                    boolean z = !this.b;
                    boolean zContains2 = ((Set) obj10).contains(str);
                    boolean zContains3 = ((Set) obj9).contains(str);
                    rxe1 rxe1Var = (rxe1) obj8;
                    Integer numValueOf = rxe1Var != null ? Integer.valueOf(rxe1Var.a) : null;
                    String str2 = (String) obj7;
                    boolean zI = x340Var4.i(ven0Var) | x340Var4.i(lbh1Var);
                    Object objT2 = x340Var4.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new mah1(lbh1Var, ven0Var, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG = x340Var4.g(iu30Var) | x340Var4.i(lbh1Var);
                    Object objT3 = x340Var4.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new mah1(iu30Var, lbh1Var, (byte) 2);
                        x340Var4.s0(objT3);
                    }
                    otw.c(ubh1Var, new tbh1(str2, lbh1Var, zContains, z, zContains2, numValueOf, zContains3, function0, (Function0) objT3, (ResultReceiver) obj5), (qim0) null, (ipb1) null, x340Var4, 64, 12);
                }
                break;
            default:
                ((Number) obj2).intValue();
                brl.k((fbp) obj12, (cce) obj11, (q9l1) obj10, (q9l1) obj9, (jkr0) obj8, (jjr0) obj7, (akr0) obj6, this.b, (Consumer) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nai0(Function0 function0, hob1 hob1Var, iu30 iu30Var, iuj iujVar, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, znb0 znb0Var4, boolean z, znb0 znb0Var5, i091 i091Var) {
        super(2);
        this.d = function0;
        this.e = hob1Var;
        this.c = iu30Var;
        this.f = iujVar;
        this.g = znb0Var;
        this.h = znb0Var2;
        this.i = znb0Var3;
        this.t = znb0Var4;
        this.b = z;
        this.X = znb0Var5;
        this.Y = i091Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nai0(fbp fbpVar, cce cceVar, q9l1 q9l1Var, q9l1 q9l1Var2, jkr0 jkr0Var, jjr0 jjr0Var, akr0 akr0Var, boolean z, Consumer consumer, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.e = fbpVar;
        this.c = cceVar;
        this.f = q9l1Var;
        this.g = q9l1Var2;
        this.h = jkr0Var;
        this.i = jjr0Var;
        this.t = akr0Var;
        this.b = z;
        this.X = consumer;
        this.d = function0;
        this.Y = qim0Var;
    }
}
