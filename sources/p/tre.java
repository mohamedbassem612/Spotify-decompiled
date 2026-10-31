package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tre extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tre(long j, Function0 function0, boolean z, boolean z2) {
        super(2);
        this.c = j;
        this.e = function0;
        this.b = z;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        max maxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = eqe.c;
                        x340Var2.s0(objT);
                    }
                    vu30 vu30Var = (vu30) objT;
                    long j = this.c;
                    boolean zF = x340Var2.f(j);
                    Object objT2 = x340Var2.T();
                    if (zF || objT2 == m4cVar) {
                        objT2 = new sre((byte) 0, j);
                        x340Var2.s0(objT2);
                    }
                    hdx hdxVar = new hdx(0, vu30Var, (vu30) objT2, (vu30) null, (hw61) null, 25);
                    gdx gdxVarS = yla.s(x340Var2);
                    boolean zG = x340Var2.g(function0);
                    Object objT3 = x340Var2.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new pj8(function0, (byte) 24);
                        x340Var2.s0(objT3);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT3);
                    if (z) {
                        x340Var2.i0(-1442781246);
                        x340Var2.r(false);
                        maxVar = jax.a;
                    } else {
                        x340Var2.i0(-1442710070);
                        max haxVar = new hax(cwl1.o0(x340Var2, this.d ? 2131953709 : 2131953708));
                        x340Var2.r(false);
                        maxVar = haxVar;
                    }
                    wro1.h(gbxVar, hdxVar, null, maxVar, gdxVarS, null, false, null, null, kbi.a, x340Var2, 0, 6, 972);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!z) {
                    x340Var4.i0(1238848074);
                    w0h1.a((hux) obj3, isl.a, (qim0) null, this.c, 0L, this.d, x340Var4, 56, 20);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1238687370);
                    uwr uwrVar = cbx.a;
                    xto1.e(null, 1, cbx.a(x340Var4).b.a, 0L, x340Var4, 48, 9);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tre(boolean z, hux huxVar, long j, boolean z2) {
        super(2);
        this.b = z;
        this.e = huxVar;
        this.c = j;
        this.d = z2;
    }
}
