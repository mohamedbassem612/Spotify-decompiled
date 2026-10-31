package p;

import android.os.ResultReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j2g1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2g1(String str, String str2, u7h u7hVar, boolean z, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 4;
        this.c = str;
        this.d = str2;
        this.e = u7hVar;
        this.b = z;
        this.f = qim0Var;
        this.g = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                k2g1.f((d2g1) obj7, (c380) obj6, (wf3) obj5, (qim0) obj4, this.b, (Function0) obj3, (b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    tsq tsqVar = (tsq) obj3;
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = (kah1) tsqVar.get();
                        x340Var2.s0(objT);
                    }
                    kah1 kah1Var = (kah1) objT;
                    kah1Var.getClass();
                    otw.c(kah1Var, new jah1((String) obj7, (rxe1) obj6, !this.b, (jtc1) obj5, (ResultReceiver) obj4), (qim0) null, (ipb1) null, x340Var2, 64, 12);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                w3p1.d((kly0) obj7, (o0i) obj6, (s3t0) obj5, this.b, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(65));
                break;
            case 3:
                ((Number) obj2).intValue();
                x3p1.i((uoa) obj7, (b3k1) obj6, (a7j1) obj5, this.b, (czs) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                fj30.q((String) obj7, (String) obj6, (u7h) obj5, this.b, (qim0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2g1(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, qim0 qim0Var, boolean z) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.g = obj4;
        this.f = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2g1(String str, rxe1 rxe1Var, boolean z, jtc1 jtc1Var, ResultReceiver resultReceiver, tsq tsqVar) {
        super(2);
        this.a = (byte) 1;
        this.c = str;
        this.d = rxe1Var;
        this.b = z;
        this.e = jtc1Var;
        this.f = resultReceiver;
        this.g = tsqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2g1(d2g1 d2g1Var, c380 c380Var, wf3 wf3Var, qim0 qim0Var, boolean z, Function0 function0, int i) {
        super(2);
        this.a = (byte) 0;
        this.c = d2g1Var;
        this.d = c380Var;
        this.e = wf3Var;
        this.f = qim0Var;
        this.b = z;
        this.g = function0;
    }
}
