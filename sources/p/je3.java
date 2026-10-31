package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class je3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je3(long j, iu30 iu30Var, yqg yqgVar, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = j;
        this.d = iu30Var;
        this.e = yqgVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.b;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                c680.g(this.b, (iu30) obj4, (yqg) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                kub.d((Function0) obj4, this.b, (qim0) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                vxo1.b((String) obj4, this.b, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                p811 p811Var = (p811) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (!((l811) obj4).a) {
                    x340Var2.i0(-934614273);
                    u4p1.f(this.c, (lee1) p811Var.a, this.b, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-934762205);
                    cr31 cr31Var = er31.a;
                    uwr uwrVar = cbx.a;
                    w3d1.a((qim0) null, cr31Var, cbx.a(x340Var2).a.c, 0L, 0.0f, 0.0f, (qqb) null, apo.r(1087104291, new z6r(i, p811Var, j), x340Var2), x340Var2, 12582912, 121);
                    x340Var2.r(false);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                mue1.c((iix0) obj4, this.c, this.b, (qim0) obj3, (b0k) obj, iP3);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                ioo1.o((ArrayList) obj4, this.b, (qim0) obj3, (b0k) obj, iP4);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                rqo1.e((String) obj4, this.b, (Function0) obj3, (b0k) obj, iP5);
                break;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    hux huxVar = (hux) obj4;
                    jsl jslVar = new jsl((String) obj3);
                    if (i == 2) {
                        x340Var4.i0(-970811186);
                    } else {
                        x340Var4.i0(-970767259);
                        uwr uwrVar2 = cbx.a;
                        j = cbx.a(x340Var4).b.a;
                    }
                    x340Var4.r(false);
                    w0h1.a(huxVar, jslVar, (qim0) null, j, 0L, false, x340Var4, 8, 52);
                }
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                kbb.j((d631) obj4, this.b, (qim0) obj3, (b0k) obj, iP6);
                break;
            default:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                pok1.e((qim0) obj4, this.b, (j2i) obj3, (b0k) obj, iP7);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je3(Object obj, long j, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je3(hux huxVar, String str, int i, long j) {
        super(2);
        this.a = (byte) 7;
        this.d = huxVar;
        this.e = str;
        this.c = i;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je3(iix0 iix0Var, int i, long j, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 4;
        this.d = iix0Var;
        this.c = i;
        this.b = j;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je3(l811 l811Var, int i, p811 p811Var, long j) {
        super(2);
        this.a = (byte) 3;
        this.d = l811Var;
        this.c = i;
        this.e = p811Var;
        this.b = j;
    }
}
