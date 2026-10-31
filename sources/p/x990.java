package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x990 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Paragraph b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x990(Paragraph paragraph, byte b) {
        super(2);
        this.a = b;
        this.b = paragraph;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Paragraph paragraph = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-734638367);
                vnr0 vnr0VarA = shy0.a(paragraph, x340Var);
                x340Var.r(false);
                return vnr0VarA;
            case 1:
                ((Number) obj2).intValue();
                nln.l(paragraph, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(487010246);
                paragraph.getClass();
                vnr0 vnr0VarA2 = shy0.a(paragraph, x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
            case 3:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(-892775067);
                paragraph.getClass();
                vnr0 vnr0VarA3 = shy0.a(paragraph, x340Var3);
                x340Var3.r(false);
                return vnr0VarA3;
            case 4:
                ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj;
                x340Var4.i0(1816120093);
                paragraph.getClass();
                vnr0 vnr0VarA4 = shy0.a(paragraph, x340Var4);
                x340Var4.r(false);
                return vnr0VarA4;
            case 5:
                ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj;
                x340Var5.i0(1698483324);
                paragraph.getClass();
                vnr0 vnr0VarA5 = shy0.a(paragraph, x340Var5);
                x340Var5.r(false);
                return vnr0VarA5;
            case 6:
                x340 x340Var6 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qgo1.f(shy0.a(paragraph, x340Var7), null, null, 0, false, null, x340Var7, 8, 62);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 7:
                tlc1 tlc1Var = (tlc1) obj;
                int i = hjl.i(((hjl) obj2).a);
                int iI0 = tlc1Var.i0(3.0f);
                int i2 = i - (iI0 * 2);
                if (i2 < 0) {
                    i2 = 0;
                }
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("topLabel", new j2i(17808493, new x990(paragraph, (byte) 6), true)))).H(jjl.b(0, 0, 0, 0, 15));
                int i3 = q5t0VarH.a;
                b7x b7xVar = b7x.a;
                if (i3 <= i2) {
                    return tlc1Var.S(i, q5t0VarH.b, b7xVar, new wb5(q5t0VarH, (i - i3) / 2, (byte) 16));
                }
                float f = i2 / (i3 >= 1 ? i3 : 1);
                return tlc1Var.S(i, jch0.U(q5t0VarH.b * f), b7xVar, new ri6(q5t0VarH, iI0, f, (byte) 2));
            case 8:
                ((Number) obj2).intValue();
                cuo1.b(paragraph, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var8 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qgo1.f(shy0.a(paragraph, x340Var9), null, null, 0, false, null, x340Var9, 8, 62);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x990(Paragraph paragraph, int i, byte b) {
        super(2);
        this.a = b;
        this.b = paragraph;
    }
}
