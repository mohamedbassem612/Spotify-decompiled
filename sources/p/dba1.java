package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dba1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dba1(String str, byte b) {
        super(3);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        String str = this.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                break;
            case 1:
                ((Number) obj3).intValue();
                String str2 = this.b;
                x340 x340Var = (b0k) obj2;
                if (str2 == null) {
                    x340Var.i0(-1204692432);
                } else {
                    x340Var.i0(-1204692431);
                    uwo1.e(str2, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2046);
                }
                x340Var.r(false);
                break;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.f(pno1.f(str, (ib60) null, b0kVar2), (qim0) null, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4094);
                break;
            case 3:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar3).g, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1722);
                break;
            case 4:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
            case 5:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                float f = cbx.b(b0kVar4).b.d;
                cvx cvxVar = cbx.b(b0kVar4).b;
                uwo1.e(this.b, uyn1.B(nim0.a, 0.0f, f, 0.0f, 16.0f, 5), cbx.d(b0kVar4).g, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2032);
                break;
            case 6:
                ((Number) obj3).intValue();
                dro.i(0, str, (b0k) obj2, (qim0) null);
                break;
            case 7:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar4 = cbx.a;
                uwo1.e(this.b, qim0VarF, cbx.d(b0kVar5).j, cbx.a(b0kVar5).b.b, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar5, 0, 0, 1696);
                break;
            case 8:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                break;
            case 9:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (!x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var3.b0();
                } else {
                    plx plxVar = plx.c;
                    jsl jslVar = new jsl(str);
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var3).g;
                    w0h1.a(plxVar, jslVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var3).b.b, 0L, false, x340Var3, plx.d, 48);
                }
                break;
            case 10:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (!x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var5.b0();
                } else {
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var5).g, cbx.a(x340Var5).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2034);
                }
                break;
            case 11:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                nkx nkxVar = nkx.c;
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, b0kVar6, 1073741872, 0, 3580);
                break;
            case 12:
                ((Number) obj3).intValue();
                x340 x340Var6 = (b0k) obj2;
                Object objT = x340Var6.T();
                if (objT == fkj0.X) {
                    objT = kei1.Z0;
                    x340Var6.s0(objT);
                }
                uwo1.e(this.b, s161.a(nim0Var, (iu30) objT), (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var6, 0, 0, 1724);
                break;
            case 13:
                ((Number) obj3).intValue();
                Uri uri2 = Uri.parse(str);
                cbx.a.getClass();
                ecx ecxVarD = uwr.d();
                xtx xtxVar = xtx.c;
                eso1.e(uri2, isl.a, (qim0) null, (p3v) null, (zvx) null, ecxVarD, (j6m) null, (tl3) null, (ColorFilter) null, new nux(xtxVar, xtxVar), false, false, (b0k) obj2, 1073744944, 0, 3540);
                break;
            case 14:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
            case 15:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
            case 16:
                i2c i2cVar = (i2c) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var7.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var8.b0();
                } else {
                    eso1.e(Uri.parse(str), isl.a, u291.f(u291.h(nim0Var, yoi1.t(new p3v(i2cVar.c() * 0.3f), new p3v(20.0f), new p3v(80.0f)).a), 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, een.g, (ColorFilter) null, oux.a, false, false, x340Var8, 14380080, 0, 3328);
                }
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                uwo1.e(this.b, anm1.N("your-premium-referral-subtitle", nim0Var), cbx.d(b0kVar7).j, cbx.a(b0kVar7).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar7, 0, 0, 2032);
                break;
            default:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar8 = cbx.a;
                uwo1.e(this.b, anm1.N("your-premium-referral-title", nim0Var), cbx.d(b0kVar8).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar8, 0, 0, 2040);
                break;
        }
        return rih1Var;
    }
}
