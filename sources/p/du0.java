package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class du0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(akh akhVar, int i) {
        super(2);
        this.a = (byte) 13;
        this.c = akhVar;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        lee1 lee1Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                eu0.b((uoa) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                q3p1.h((ez0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                t9p1.f((ow1) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                poz0.e((h04) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                r4o1.F((y86) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                k5p1.c((c380) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                k5p1.h((fbp1) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                kkn.b((olb) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                xyn1.i((jgd) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((k8e) ((an) obj3).g).a.onNext(new s7e(i, (kfe) obj, ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((ske) obj3).c((b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                yto1.b((tkf) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ((fmg) obj3).f((b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                d7p1.b((akh) obj3, nim0Var, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                xpn1.g((vu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((f8m) obj3).b((b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return new pxg1(i, 100, (ceo) obj3);
            case 17:
                ((Number) obj2).intValue();
                lgo1.h((zrm) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((ham) obj3).e((b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                bro1.f((vgm0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                bro1.h((bgm0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                upo upoVar = (upo) obj3;
                if (upoVar.j != i) {
                    throw new CancellationException("Superseded by newer gesture");
                }
                upoVar.a.t(fFloatValue);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                g2p1.o((i2r) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                hcx hcxVar = (hcx) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fA = hcxVar.a(x340Var2) * 0.3f;
                    String strC = f4i1.c(i, "+");
                    switch (hcxVar.ordinal()) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            x340Var2.i0(1958651470);
                            uwr uwrVar = cbx.a;
                            lee1Var = cbx.d(x340Var2).n;
                            x340Var2.r(false);
                            break;
                        case 1:
                            x340Var2.i0(1958649167);
                            uwr uwrVar2 = cbx.a;
                            lee1Var = cbx.d(x340Var2).k;
                            x340Var2.r(false);
                            break;
                        case 2:
                            x340Var2.i0(1958647023);
                            uwr uwrVar3 = cbx.a;
                            lee1Var = cbx.d(x340Var2).k;
                            x340Var2.r(false);
                            break;
                        case 3:
                            x340Var2.i0(1958645132);
                            uwr uwrVar4 = cbx.a;
                            lee1Var = cbx.d(x340Var2).e;
                            x340Var2.r(false);
                            break;
                        case 4:
                            x340Var2.i0(1958643181);
                            uwr uwrVar5 = cbx.a;
                            lee1Var = cbx.d(x340Var2).d;
                            x340Var2.r(false);
                            break;
                        case 5:
                            x340Var2.i0(1958641168);
                            uwr uwrVar6 = cbx.a;
                            lee1Var = cbx.d(x340Var2).b;
                            x340Var2.r(false);
                            break;
                        case 6:
                            x340Var2.i0(1958653646);
                            uwr uwrVar7 = cbx.a;
                            lee1Var = cbx.d(x340Var2).n;
                            x340Var2.r(false);
                            break;
                        default:
                            throw p3d1.k(x340Var2, 1958639359, false);
                    }
                    uwo1.e(strC, uyn1.z(fA, 0.0f, 2, nim0Var), lee1Var, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1784);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                jto1.m((xu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 25:
                return l1d.q(cy30.q(i, ((Number) obj).intValue(), "voice:", ":", ":"), ((n5y) obj3).b, ":", ((m5y) obj2).a);
            case 26:
                ((Number) obj2).intValue();
                wpb1.k((loy) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                si1.j((zm30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                aq8.b((llw0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                e9k.g((s140) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du0(int i, Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(f8m f8mVar, int i) {
        super(2);
        this.a = (byte) 15;
        this.c = f8mVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(bgm0 bgm0Var, int i) {
        super(2);
        this.a = (byte) 20;
        this.c = bgm0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(vgm0 vgm0Var, int i) {
        super(2);
        this.a = (byte) 19;
        this.c = vgm0Var;
        this.b = i;
    }
}
