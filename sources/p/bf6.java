package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bf6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf6(j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 6:
                this.b = j2iVar;
                this.c = i;
                super(2);
                break;
            case 7:
            default:
                this.b = j2iVar;
                this.c = i;
                break;
            case 8:
                this.b = j2iVar;
                this.c = i;
                super(2);
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        j2i j2iVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2iVar.invoke(Integer.valueOf(i), x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    j2iVar.invoke(Integer.valueOf(i), x340Var4, 0);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                mqo1.b(czo1.p(i | 1), j2iVar, (b0k) obj);
                break;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    x340Var6.l0(Integer.valueOf(i));
                    j2iVar.invoke(x340Var6, 6);
                    x340Var6.w();
                }
                break;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    j2iVar.invoke(Integer.valueOf(i), x340Var8, 0);
                }
                break;
            case 5:
                ((Number) obj2).intValue();
                cto1.g(i, j2iVar, (b0k) obj, czo1.p(49));
                break;
            case 6:
                ((Number) obj2).intValue();
                p9p1.k(czo1.p(i | 1), j2iVar, (b0k) obj);
                break;
            case 7:
                ((Number) obj2).intValue();
                qr21.b(i, j2iVar, (b0k) obj, czo1.p(49));
                break;
            default:
                ((Number) obj2).intValue();
                hno1.e(czo1.p(i | 1), j2iVar, (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf6(int i, j2i j2iVar) {
        super(2);
        this.a = (byte) 3;
        this.c = i;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf6(int i, j2i j2iVar, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = i;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf6(byte b, int i, j2i j2iVar, boolean z) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = i;
    }
}
