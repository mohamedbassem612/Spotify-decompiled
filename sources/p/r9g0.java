package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r9g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9g0(y1x0 y1x0Var, qim0 qim0Var, float f, long j, hw61 hw61Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.d = y1x0Var;
        this.f = qim0Var;
        this.c = f;
        this.b = j;
        this.e = hw61Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2i j2iVarR = apo.r(499225447, new rz2((xag0) obj4, f, (byte) 3), x340Var2);
                    j2i j2iVarR2 = apo.r(36700009, new tse0((Function0) obj3, (byte) 2), x340Var2);
                    long j = u7h.j;
                    long jB = u7h.b(this.b, this.c, 0.0f, 0.0f, 0.0f, 14);
                    uwr uwrVar = cbx.a;
                    ti5.d(j2iVarR, (qim0) null, j2iVarR2, (xu30) null, 0.0f, (erl1) null, kkn.C(j, jB, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, x340Var2, 32), (k2t0) obj5, x340Var2, 390, 58);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    j2i j2iVarR3 = apo.r(-29895044, new rz2((hdg0) obj4, f, (byte) 4), x340Var4);
                    j2i j2iVarR4 = apo.r(-1204819586, new tse0((Function0) obj3, (byte) 3), x340Var4);
                    long j2 = u7h.j;
                    long jB2 = u7h.b(this.b, this.c, 0.0f, 0.0f, 0.0f, 14);
                    uwr uwrVar2 = cbx.a;
                    ti5.d(j2iVarR3, (qim0) null, j2iVarR4, (xu30) null, 0.0f, (erl1) null, kkn.C(j2, jB2, cbx.a(x340Var4).b.a, cbx.a(x340Var4).b.a, cbx.a(x340Var4).b.a, x340Var4, 32), (k2t0) obj5, x340Var4, 390, 58);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                wpo1.f(this.c, this.b, (Function0) obj3, (qim0) obj5, (j2i) obj4, (b0k) obj, czo1.p(196657));
                break;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    j2i j2iVarR5 = apo.r(282622910, new rz2((hh11) obj4, f, (byte) 10), x340Var6);
                    j2i j2iVarR6 = apo.r(-1291403908, new ziz0((vwz0) obj3, (byte) 22), x340Var6);
                    long j3 = u7h.j;
                    long jB3 = u7h.b(this.b, this.c, 0.0f, 0.0f, 0.0f, 14);
                    uwr uwrVar3 = cbx.a;
                    ti5.d(j2iVarR5, (qim0) null, j2iVarR6, (xu30) null, 0.0f, (erl1) null, kkn.C(j3, jB3, cbx.a(x340Var6).b.a, cbx.a(x340Var6).b.a, 0L, x340Var6, 48), (k2t0) obj5, x340Var6, 390, 58);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ((y1x0) obj5).a((qim0) obj4, this.c, this.b, (hw61) obj3, (b0k) obj, czo1.p(24577));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9g0(long j, float f, k2t0 k2t0Var, Object obj, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = f;
        this.d = k2t0Var;
        this.f = obj;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9g0(float f, long j, Function0 function0, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = f;
        this.b = j;
        this.e = function0;
        this.d = qim0Var;
        this.f = j2iVar;
    }
}
