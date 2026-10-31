package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class syb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uyb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syb1(uyb1 uyb1Var, byte b) {
        super(2);
        this.a = b;
        this.b = uyb1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uyb1 uyb1Var = this.b;
        byte b2 = 1;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uyb1Var.a.invoke(x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(860007010, new syb1(uyb1Var, null == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    kiv kivVar = gfe0.a;
                    mod.c(new ely0[]{gfe0.a.a(uyb1Var.getInstrumentationEnvironment$src_main_java_com_spotify_connect_devicepickerpage_devicepickerpage()), oi7.a.a(uyb1Var.d)}, apo.r(1290754447, new syb1(uyb1Var, b2), x340Var6), x340Var6, 56);
                }
                break;
        }
        return rih1Var;
    }
}
