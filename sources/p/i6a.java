package p;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i6a extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6a(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                t1c.a(u291.f(nim0.a, 1.0f), b0kVar, 0);
                int i2 = j6a.h;
                ((j6a) obj5).e((e6a) obj2, null, b0kVar, (iIntValue >> 3) & 14);
                return rih1Var;
            case 1:
                adn adnVar = (adn) obj;
                iu30 iu30Var = (iu30) obj2;
                b0k b0kVar2 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (((x340) b0kVar2).g(adnVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((x340) b0kVar2).i(iu30Var) ? 32 : 16;
                }
                x340 x340Var = (x340) b0kVar2;
                if (x340Var.Y(i & 1, (i & 147) != 146)) {
                    nyx.a(2, null, apo.r(393230602, new mzj((cdn) obj5, adnVar, iu30Var, (byte) 27), x340Var), x340Var, 3078, 6);
                } else {
                    x340Var.b0();
                }
                return rih1Var;
            case 2:
                return new xgu((Context) obj2, (ygu) obj5, (iu30) obj4, (ViewGroup) obj3);
            case 3:
                wu70 wu70Var = (wu70) obj5;
                return new dv70(wu70Var.a, (ViewGroup) obj3, new uu70(wu70Var, (byte) 1), (Context) obj2, wu70Var.e);
            case 4:
                bcl0 bcl0Var = (bcl0) obj;
                nnt0 nnt0Var = (nnt0) obj3;
                zmt0 zmt0Var = (zmt0) obj4;
                n1x n1xVarA = ((lnt0) obj2).a();
                if (n1xVarA != null) {
                    ((l0x0) obj5).o(l0p1.f(zmt0Var, n1xVarA, nnt0Var));
                }
                if (zmt0Var instanceof vmt0) {
                    return bcl0Var.a(nnt0Var.c());
                }
                if (zmt0Var instanceof umt0) {
                    return nnt0Var.b() instanceof vdo ? bcl0Var.h().a(nnt0Var.c()) : bcl0Var.a(nnt0Var.c());
                }
                if (zmt0Var instanceof ymt0) {
                    return bcl0Var.g();
                }
                if (zmt0Var instanceof wmt0) {
                    return bcl0Var.g();
                }
                if (zmt0Var instanceof xmt0) {
                    return null;
                }
                eg.o();
                return null;
            case 5:
                return (n8h1) ((bu11) obj5).d().invoke(Integer.valueOf(((Number) obj3).intValue()), ((uv11) obj).a, (r6h1) obj4);
            default:
                return new n2o((Context) obj2, (iu30) obj4, (x8j1) obj5, (ViewGroup) obj3);
        }
    }
}
