package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(String str, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        String str = this.b;
        Function0 function0 = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                if (str.length() > 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1379868717);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    zk51.a(48, str, function0, x340Var2, uyn1.z(0.0f, 6.0f, 1, qim0VarF));
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1380372281);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var4).b;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                uwo1.e(this.b, anm1.N("category_dropdown_title_text", new wnb0(1.0f, false)), cbx.d(x340Var4).c, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2040);
                if (function0 != null) {
                    x340Var6.i0(-1852726190);
                    w0h1.a(mlx.c, new jsl(cwl1.o0(x340Var4, 2131953505)), anm1.N("category_dropdown_title_chevron", nim0Var), 0L, 0L, false, x340Var4, mlx.d, 56);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1852443656);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                x340 x340Var7 = (b0k) obj2;
                if (str == null) {
                    x340Var7.i0(1804112444);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(1804112445);
                    idx idxVar = new idx(6);
                    qim0 qim0VarN = anm1.N("connectionItemButton", nim0Var);
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function0), idxVar, qim0VarN, null, yla.s(x340Var7), null, null, null, null, null, apo.r(782425910, new pji(str, (byte) 28), x340Var7), x340Var7, 0, 48, 2008);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 3:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (str == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                    Uri uri2 = uri;
                    uri2.getClass();
                    gra graVar = een.e;
                    qim0 qim0VarN2 = anm1.N("artwork_image_test_tag", u291.d(nim0Var, 1.0f));
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarN2, cbx.a(x340Var9).a.b.a(), d4o1.a);
                    boolean zG = x340Var9.g(function0);
                    Object objT = x340Var9.T();
                    if (zG || objT == fkj0.X) {
                        objT = new xet(function0, (byte) 14);
                        x340Var9.s0(objT);
                    }
                    eso1.e(uri2, isl.a, i541.C(qim0VarF2, (iu30) objT), (p3v) null, (zvx) null, (ecx) null, (j6m) null, graVar, (ColorFilter) null, oux.a, false, false, x340Var9, 12807216, 0, 3392);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 4:
                yah0.j((((Number) obj3).intValue() << 3) & 112, str, function0, (b0k) obj2, (qim0) obj);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var10 = (b0k) obj2;
                boolean zG2 = x340Var10.g(function0);
                Object objT2 = x340Var10.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new aba0(function0, (byte) 23);
                    x340Var10.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(str), function1);
                ldx ldxVar = ldx.c;
                gdx gdxVarA = yla.s(x340Var10).a();
                Object objT3 = x340Var10.T();
                if (objT3 == m4cVar) {
                    objT3 = gje0.b;
                    x340Var10.s0(objT3);
                }
                wro1.h(gbxVar, ldxVar, s161.a(nim0Var, (iu30) objT3), null, gdxVarA, null, false, null, null, gxi.a, x340Var10, 12582912, 6, 856);
                return rih1Var;
            case 6:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.g(new gbx(new y50(str), function0), null, null, yla.s(b0kVar), null, null, null, apo.r(1484557678, new psr0(str, (byte) 11), b0kVar), b0kVar, 12582912, 118);
                return rih1Var;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarX = bin.x(nim0.a, false, null, new pm31(0), null, this.c, 11);
                uwr uwrVar4 = cbx.a;
                uwo1.e(this.b, qim0VarX, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.c, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
                return rih1Var;
        }
    }
}
