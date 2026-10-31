package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uyl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(uyl uylVar, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 6:
                j2i j2iVar = kfi.a;
                j2i j2iVar2 = kfi.a;
                j2i j2iVar3 = kfi.a;
                j2i j2iVar4 = kfi.a;
                this.b = uylVar;
                super(2);
                break;
            default:
                this.b = uylVar;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uyl uylVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fq7.v(uylVar, (lwb0) null, x340Var2, 0, 2);
                }
                break;
            case 1:
                uzj uzjVar = (uzj) obj;
                uzjVar.g(uylVar);
                uzjVar.c = fq7.B(uylVar);
                break;
            case 2:
                ((Number) obj2).intValue();
                xpn1.a(uylVar, (b0k) obj, czo1.p(1));
                break;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    xpn1.a(uylVar, x340Var4, 0);
                }
                break;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    h5p1.c(6, apo.r(-426616983, new zzj(uylVar, (byte) 3), x340Var6), x340Var6);
                }
                break;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    j2i j2iVar = kfi.a;
                    j2i j2iVar2 = kfi.a;
                    j2i j2iVar3 = kfi.a;
                    j2i j2iVar4 = kfi.a;
                    xpn1.f(uylVar, x340Var8, 28080);
                }
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar5 = kfi.a;
                xpn1.f(uylVar, (b0k) obj, czo1.p(28081));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzj(uyl uylVar, byte b) {
        super(2);
        this.a = b;
        this.b = uylVar;
    }
}
