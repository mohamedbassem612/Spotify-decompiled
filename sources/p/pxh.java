package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pxh extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ xxh b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxh(xxh xxhVar, qim0 qim0Var) {
        super(2);
        this.b = xxhVar;
        this.c = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wxh wxhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                lap1.a(wxhVar, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (wxhVar instanceof wxh) {
                    x340Var2.i0(1925559669);
                    String strValueOf = String.valueOf(wxhVar.a);
                    glx glxVar = glx.c;
                    uwr uwrVar = cbx.a;
                    oap1.a(strValueOf, this.c, new al70(cbx.a(x340Var2).b.f, glxVar), x340Var2, 512, 0);
                    x340Var2.r(false);
                } else if (wxhVar instanceof txh) {
                    x340Var2.i0(-436999335);
                    String strValueOf2 = String.valueOf(((txh) wxhVar).a);
                    elx elxVar = elx.c;
                    uwr uwrVar2 = cbx.a;
                    oap1.a(strValueOf2, this.c, new al70(cbx.a(x340Var2).b.d, elxVar), x340Var2, 512, 0);
                    x340Var2.r(false);
                } else if (wxhVar instanceof uxh) {
                    x340Var2.i0(1925575860);
                    oap1.a(cwl1.o0(x340Var2, 2131963611), this.c, null, x340Var2, 0, 4);
                    x340Var2.r(false);
                } else {
                    if (!u890.j(wxhVar, vxh.a)) {
                        throw p3d1.k(x340Var2, 1925558493, false);
                    }
                    x340Var2.i0(-436598629);
                    x340Var2.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxh(xxh xxhVar, qim0 qim0Var, int i) {
        super(2);
        this.b = xxhVar;
        this.c = qim0Var;
    }
}
