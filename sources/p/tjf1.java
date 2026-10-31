package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tjf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ujf1 b;
    public final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjf1(ujf1 ujf1Var, Uri uri, byte b) {
        super(2);
        this.a = b;
        this.b = ujf1Var;
        this.c = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Uri uri = this.c;
        ujf1 ujf1Var = this.b;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ujf1 ujf1Var2 = this.b;
                    xjf1 xjf1Var = (xjf1) ujf1Var2.K1.getValue();
                    boolean zI = x340Var2.i(ujf1Var2);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        hcf1 hcf1Var = new hcf1(1, ujf1Var2, ujf1.class, "onUserClicked", "onUserClicked(Ljava/lang/String;)V", 0, (byte) 4);
                        x340Var2.s0(hcf1Var);
                        objT = hcf1Var;
                    }
                    iu30 iu30Var = (iu30) objT;
                    boolean zI2 = x340Var2.i(ujf1Var2);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        sjf1 sjf1Var = new sjf1(0, ujf1Var2, ujf1.class, "dismiss", "dismiss()V", 0, (byte) 0);
                        x340Var2.s0(sjf1Var);
                        objT2 = sjf1Var;
                    }
                    exd0.l(xjf1Var, this.c, iu30Var, (Function0) objT2, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(-1965511945, new tjf1(ujf1Var, uri, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = ujf1Var.I1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(-1582963932, new tjf1(ujf1Var, uri, b2), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
