package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t721 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ u721 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t721(String str, String str2, u721 u721Var, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = u721Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        j721 j721Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        String str2 = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        u721 u721Var = this.d;
                        i6q i6qVar = u721Var.b;
                        u9c0 u9c0VarQ = cto1.q(u721Var.a);
                        ggx0 ggx0Var = new ggx0(0, u721Var, u721.class, "dismiss", "dismiss()V", 0, (byte) 16);
                        switch (i6qVar.a) {
                            case 0:
                                s7q s7qVar = (s7q) i6qVar.b.d;
                                Activity activity = (Activity) s7qVar.t.a;
                                daq daqVar = s7qVar.b;
                                j721Var = new j721(u9c0VarQ, ggx0Var, new mzr0(activity, (Flowable) daqVar.z2.get(), (j0a1) daqVar.ls.get(), (r630) daqVar.ya.get(), (w430) daqVar.ts.get(), (kt91) daqVar.f8.get(), (q8n) daqVar.E1.get()));
                                break;
                            default:
                                ziq ziqVar = ((thq) i6qVar.b).c.a;
                                Activity activity2 = (Activity) ziqVar.b.f.a;
                                daq daqVar2 = ziqVar.a;
                                j721Var = new j721(u9c0VarQ, ggx0Var, new mzr0(activity2, (Flowable) daqVar2.z2.get(), (j0a1) daqVar2.ls.get(), (r630) daqVar2.ya.get(), (w430) daqVar2.ts.get(), (kt91) daqVar2.f8.get(), (q8n) daqVar2.E1.get()));
                                break;
                        }
                        objT = j721Var;
                        x340Var2.s0(objT);
                    }
                    otw.c((j721) objT, new d721(str2, str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(841341282, new t721(str2, str, this.d, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
