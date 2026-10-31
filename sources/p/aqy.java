package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aqy extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tpy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqy(tpy tpyVar, byte b) {
        super(3);
        this.a = b;
        this.b = tpyVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        hux huxVar;
        long j;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        tpy tpyVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = tpyVar.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                nkx nkxVar = nkx.c;
                eso1.e(uri, isl.a, i1p1.q(nim0Var, er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, b0kVar, 1073741872, 0, 3576);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                int iC = l1d.C(tpyVar.d);
                if (iC == 0 || iC == 1) {
                    huxVar = irx.c;
                } else if (iC == 2) {
                    huxVar = klx.c;
                } else {
                    if (iC != 3 && iC != 4) {
                        eg.o();
                        return null;
                    }
                    huxVar = bpx.c;
                }
                int iC2 = l1d.C(tpyVar.d);
                if (iC2 == 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1879705435);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var2).b.b;
                    x340Var2.r(false);
                } else if (iC2 == 1) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1879708251);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var3).c.b;
                    x340Var3.r(false);
                } else if (iC2 == 2) {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(-1879711894);
                    uwr uwrVar3 = cbx.a;
                    j = cbx.a(x340Var4).b.c;
                    x340Var4.r(false);
                } else if (iC2 != 3) {
                    if (iC2 != 4) {
                        throw p3d1.k(x340Var, -1879713917, false);
                    }
                    x340 x340Var5 = x340Var;
                    x340Var5.i0(-1879708251);
                    uwr uwrVar4 = cbx.a;
                    j = cbx.a(x340Var5).c.b;
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var;
                    x340Var6.i0(-1879705435);
                    uwr uwrVar5 = cbx.a;
                    j = cbx.a(x340Var6).b.b;
                    x340Var6.r(false);
                }
                long j2 = j;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var, 56, 48);
                return rih1Var;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = tpyVar.b;
                uwr uwrVar6 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                return rih1Var;
        }
    }
}
