package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class res implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final jsw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public final rqw i;

    public res(e070 e070Var, c070 c070Var, ao0 ao0Var, i01 i01Var, yqg yqgVar, op0 op0Var, bju bjuVar) {
        this.a = (byte) 14;
        this.d = ao0Var;
        this.e = i01Var;
        this.f = yqgVar;
        this.g = op0Var;
        this.h = bjuVar;
        hh60 hh60Var = hh60.R0;
        t2m t2mVar = t2m.C;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        rz60 rz60Var = new rz60();
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hz60.class), runSequentially.a(rz60Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new sz60(i01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tz60(c070Var, i01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uz60(c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vz60(c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wz60(c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xz60(c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ez60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yz60(e070Var, c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(iz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new b070()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zz60(c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pz60(c070Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gz60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qz60(c070Var)));
        this.b = sbl.A(hh60Var, t2mVar, new a(c070Var.f, coroutinesSubtypeEffectHandlerBuilderI), g070.b, new h070(this, (byte) 1));
        this.i = new eih1();
        j2i j2iVar = new j2i(1785515564, new wv60(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public static kbb1 x(sbb1 sbb1Var, ibb1 ibb1Var) {
        return new kbb1(ibb1Var, (!sbb1Var.b || sbb1Var.d) ? new obb1(grx.c) : new obb1(xmx.c));
    }

    public final rqw a() {
        byte b = this.a;
        hy00 hy00Var = this.i;
        switch (b) {
            case 0:
                return (ia00) hy00Var;
            case 1:
                return hy00Var;
            case 2:
                return (ia00) hy00Var;
            case 3:
                return (s52) hy00Var;
            case 4:
                return (ia00) hy00Var;
            case 5:
                return (ia00) hy00Var;
            case 6:
                return (eih1) hy00Var;
            case 7:
                return (u7h1) hy00Var;
            case 8:
                return (ia00) hy00Var;
            case 9:
                return (ia00) hy00Var;
            case 10:
                return (eih1) hy00Var;
            case 11:
                return (u7h1) hy00Var;
            case 12:
                return (ia00) hy00Var;
            case 13:
                return (eih1) hy00Var;
            case 14:
                return (eih1) hy00Var;
            case 15:
                return (ia00) hy00Var;
            case 16:
                return (ia00) hy00Var;
            case 17:
                return (ia00) hy00Var;
            case 18:
                return (eih1) hy00Var;
            case 19:
                return (ia00) hy00Var;
            case 20:
                return (eih1) hy00Var;
            case 21:
                return (ia00) hy00Var;
            case 22:
                return (ia00) hy00Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (u7h1) hy00Var;
            case 24:
                return (ia00) hy00Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (eih1) hy00Var;
            case 26:
                return hy00Var;
            case 27:
                return (eih1) hy00Var;
            case 28:
                return hy00Var;
            default:
                return hy00Var;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return this.c;
    }

    public void e(li81 li81Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-566865318);
        int i2 = (x340Var.i(li81Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (li81Var != null) {
            x340Var.i0(326873096);
            otw.c(li81Var.a, li81Var.b, qim0Var, (ipb1) null, x340Var, (i2 << 3) & 896, 8);
            x340Var.r(false);
        } else {
            x340Var.i0(326965352);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(this, li81Var, qim0Var, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    public void f(ad0 ad0Var, Function0 function0, b0k b0kVar, int i) {
        j2i j2iVarR;
        List list;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1067139230);
        int i2 = (i & 6) == 0 ? (x340Var.g(ad0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            zc0 zc0Var = ad0Var.c;
            List list2 = zc0Var.d;
            yc0 yc0Var = zc0Var.e;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zIsEmpty = list2.isEmpty();
            yc0 yc0Var2 = zc0Var.e;
            bq50 bq50Var = bq50.a;
            if (yc0Var2 == null) {
                x340Var.i0(1752878461);
                boolean z = !zIsEmpty && zBooleanValue;
                if (list2.isEmpty() || !z) {
                    x340Var.i0(-1354239991);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1354455813);
                    bq50 dq50Var = new dq50(apo.r(207809078, new n2(this, zc0Var, (byte) 8), x340Var));
                    x340Var.r(false);
                    bq50Var = dq50Var;
                }
                x340Var.r(false);
            } else if (zIsEmpty || !yc0Var2.a) {
                x340Var.i0(1752884589);
                x340Var.r(false);
            } else {
                x340Var.i0(1752882964);
                x340Var.r(false);
                bq50Var = cq50.a;
            }
            bq50 bq50Var2 = bq50Var;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new ma0(ven0Var, (byte) 2);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            List list3 = zc0Var.d;
            if (yc0Var != null) {
                if (list3.isEmpty()) {
                    function1 = null;
                } else {
                    function1 = yc0Var.b;
                }
            } else if (list3.isEmpty()) {
                function1 = null;
            }
            x340Var.i0(-1863212800);
            if (function1 == null) {
                x340Var.r(false);
                j2iVarR = null;
            } else {
                j2iVarR = apo.r(-1581609597, new x2(this, zc0Var, bq50Var2, function1, (byte) 6), x340Var);
                x340Var.r(false);
            }
            List list4 = ad0Var.b;
            if (yc0Var != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list4) {
                    if (((v081) obj).a == x081.a) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            } else {
                list = list4;
            }
            j1p1.d(ad0Var.a, list, function0, (qim0) null, bq50Var2, j2iVarR, x340Var, (i3 & 896) | ((i3 << 6) & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, ad0Var, function0, i, (byte) 1);
        }
    }

    public void g(eoy0 eoy0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(419612914);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(eoy0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gdx gdxVarS = yla.s(x340Var);
            jdx jdxVar = jdx.c;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new g1x0(eoy0Var, iu30Var);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdxVar, (qim0) null, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, qaj.a, x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new foy0(this, eoy0Var, iu30Var, i, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (js20) obj;
            case 1:
                return (js20) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (js20) obj;
            case 4:
                return (js20) obj;
            case 5:
                return (js20) obj;
            case 6:
                return (poy0) obj;
            case 7:
                return (rey0) this.h;
            case 8:
                return (k8d1) obj;
            case 9:
                return (k8d1) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (ljm0) this.h;
            case 12:
                return (js20) obj;
            case 13:
                return (ljm0) obj;
            case 14:
                return (e7m0) obj;
            case 15:
                return (rey0) obj;
            case 16:
                return (js20) obj;
            case 17:
                return (js20) obj;
            case 18:
                return (e7m0) obj;
            case 19:
                return (rey0) obj;
            case 20:
                return (js20) obj;
            case 21:
                return (js20) obj;
            case 22:
                return (js20) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (js20) obj;
            case 24:
                return (ljm0) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (k8d1) obj;
            case 26:
                return (js20) obj;
            case 27:
                return (e7m0) obj;
            case 28:
                return (ljm0) obj;
            default:
                return (js20) obj;
        }
    }

    public void h(Function0 function0, b0k b0kVar, int i) {
        res resVar;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-372285409);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            utk0 utk0Var = (utk0) ((e5l0) this.h).b;
            h3o0 mgq0Var = utk0Var != null ? new mgq0(new ttk0(utk0Var, (byte) 0), (byte) 0) : rrn1.a;
            resVar = this;
            function1 = function0;
            resVar.m(2131952984, 2131952984, mgq0Var, function1, x340Var, (i2 << 9) & 64512);
        } else {
            resVar = this;
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1o0(resVar, function1, i, b);
        }
    }

    public void i(String str, String str2, boolean z, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        String strConcat;
        int i2;
        boolean z3;
        String strK;
        lzn0 lzn0Var = (lzn0) this.f;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1142055616);
        int i3 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(this) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z4 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objT = b0kVar3.T();
            if (z4 || objT == m4cVar) {
                if (z2) {
                    Set set = s4b1.f;
                    String strJ = uic.x(str).j();
                    if (strJ == null) {
                        strJ = "";
                    }
                    if (nhc1.Y(str, "spotify:episode:", false)) {
                        strConcat = "spotify:internal:entity-segments:episode:".concat(strJ);
                    } else {
                        strConcat = nhc1.Y(str, "spotify:track:", false) ? "spotify:internal:entity-segments:track:".concat(strJ) : null;
                    }
                    objT = strConcat;
                } else {
                    objT = null;
                }
                b0kVar3.s0(objT);
            }
            String str3 = (String) objT;
            boolean zG = b0kVar3.g(lzn0Var);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                i2 = i3;
                z3 = false;
                w460 w460Var = new w460(lzn0Var, true, true, false, (a1r0) null, 56);
                b0kVar3.s0(w460Var);
                objT2 = w460Var;
            } else {
                i2 = i3;
                z3 = false;
            }
            w460 w460Var2 = (w460) objT2;
            if (z) {
                strK = x0d.k(b0kVar3, -1996160490, 2131955566, b0kVar3, z3);
            } else {
                b0kVar3.i0(-1751375075);
                b0kVar3.r(z3);
                strK = null;
            }
            String strO0 = cwl1.o0(b0kVar3, 2131955565);
            if (str3 == 0) {
                strO0 = null;
            }
            boolean zG2 = ((i2 & 112) != 32 ? z3 : true) | b0kVar3.g(strK) | b0kVar3.g(str3) | b0kVar3.g(strO0);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new s460(3, 736, str2 == null ? "" : str2, strK, strO0, str3, false);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            otw.c(w460Var2, (s460) objT3, uyn1.z(16.0f, 0.0f, 2, qim0VarZ), (ipb1) null, b0kVar2, 8, 8);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(this, str, str2, z, z2, i);
        }
    }

    public void j(Function0 function0, b0k b0kVar, int i) {
        res resVar;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1698261162);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        byte b = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            utk0 utk0Var = (utk0) ((e5l0) this.h).b;
            h3o0 mgq0Var = utk0Var != null ? new mgq0(new ttk0(utk0Var, (byte) 1), (byte) 1) : rrn1.a;
            resVar = this;
            function1 = function0;
            resVar.m(2131952969, 2131952969, mgq0Var, function1, x340Var, (i2 << 9) & 64512);
        } else {
            resVar = this;
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1o0(resVar, function1, i, b);
        }
    }

    public void k(eoy0 eoy0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        res resVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-875080713);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(eoy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(this) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarF2 = dug.f(uyn1.z(12.0f, 0.0f, 2, qim0VarB), cbx.a(x340Var2).a.a.a(), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12));
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF2, 12.0f, 16.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            int i3 = i2;
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true);
            cvx cvxVar5 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(wnb0VarQ, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            lee1 lee1Var = cbx.d(x340Var2).d;
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = ucy0.N0;
                x340Var2.s0(objT);
            }
            uwo1.e(cwl1.o0(x340Var2, 2131955301), s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.b;
            cvx cvxVar6 = cbx.b(x340Var2).b;
            uwo1.e(cwl1.o0(x340Var2, 2131955300), uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), lee1Var2, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(true);
            resVar = this;
            resVar.g(eoy0Var, iu30Var, x340Var, i3 & 1022);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            resVar = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new foy0(resVar, eoy0Var, iu30Var, i, (byte) 1);
        }
    }

    public void l(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(93012138);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x8c0 lifecycle = ((iac0) x340Var.k(jfe0.a)).getLifecycle();
            ven0 ven0VarS = v8r.s(function0, x340Var);
            boolean zI = x340Var.i(ven0VarS) | x340Var.i(lifecycle);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new he3(lifecycle, ven0VarS, (byte) 1);
                x340Var.s0(objT);
            }
            qxd0.i(lifecycle, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(this, function0, i, (byte) 24);
        }
    }

    public void m(int i, int i2, h3o0 h3o0Var, Function0 function0, b0k b0kVar, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(605363704);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & 512) == 0 ? x340Var.g(h3o0Var) : x340Var.i(h3o0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            otw.c(new umf0(h3o0Var, function0), new g3o0(i, i2), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ek0(this, i, i2, h3o0Var, function0, i3);
        }
    }

    public void n(aj81 aj81Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(514483323);
        int i2 = i | (b0kVar3.i(aj81Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131962465);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 15);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0Var, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(-1024534267, new wi81(aj81Var, (byte) 0), b0kVar3), (xu30) null, (xu30) null, apo.r(305903171, new iww0(strO0, (byte) 29), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-941538881, new wi81(aj81Var, (byte) 1), b0kVar3), b0kVar2, ((i2 >> 6) & 14) | 100663296, 196656, 30398);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, aj81Var, iu30Var, qim0Var, (byte) 8);
        }
    }

    public void o(aj81 aj81Var, iu30 iu30Var, li81 li81Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1186786656);
        int i2 = 2;
        int i3 = i | (x340Var.i(aj81Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(li81Var) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.i0(-1959318780);
            if (li81Var == null) {
                i2 = 1;
            } else if (ef.b(x340Var).a()) {
                i2 = 3;
            }
            x340Var.r(false);
            vvx.a(xi81.b, apo.r(700806511, new nk31(i2, this, aj81Var, iu30Var, li81Var), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, aj81Var, iu30Var, li81Var, (byte) 9);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void p(ubb1 ubb1Var, nbb1 nbb1Var, iu30 iu30Var, xb10 xb10Var, yqi1 yqi1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        yqi1 yqi1Var2;
        x340 x340Var;
        Object ku91Var;
        qim0 qim0Var;
        String str;
        res resVar = this;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-540408055);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var2.g(ubb1Var) : x340Var2.i(ubb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(nbb1Var) : x340Var2.i(nbb1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(xb10Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            yqi1Var2 = yqi1Var;
            i2 |= x340Var2.i(yqi1Var2) ? 16384 : 8192;
        } else {
            yqi1Var2 = yqi1Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(resVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            ibb1 ibb1VarA = nbb1Var.a();
            rbb1 placeholder = nbb1Var.getPlaceholder();
            String string = ibb1VarA.getUri().toString();
            boolean z = ibb1VarA instanceof gbb1;
            qim0 qim0Var2 = nim0.a;
            if (z) {
                x340Var2.i0(-1758525013);
                ((rnu) resVar.g).a(string, xb10Var, u291.d(qim0Var2, 1.0f), yqi1Var2, x340Var2, ((i3 >> 6) & 112) | 384 | ((i3 >> 3) & 7168));
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                if (!(ibb1VarA instanceof hbb1)) {
                    throw p3d1.k(x340Var2, 358913933, false);
                }
                x340Var2.i0(-1758291459);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = c13.l(!ihc1.y0(string), x340Var2);
                }
                ven0 ven0Var = (ven0) objT;
                if (!ihc1.y0(string)) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                boolean zG = x340Var2.g(string) | x340Var2.i(resVar);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    qim0Var = qim0Var2;
                    ku91Var = new ku91(string, this, ven0Var, (lnm) null, (byte) 3);
                    str = string;
                    resVar = this;
                    x340Var2.s0(ku91Var);
                } else {
                    str = string;
                    ku91Var = objT2;
                    qim0Var = qim0Var2;
                }
                qxd0.t(ibb1VarA, x340Var2, (vu30) ku91Var);
                int i4 = i3 << 9;
                ((rnu) resVar.f).b(str, ubb1Var.a, ubb1Var.b, nbb1Var, ubb1Var.c, iu30Var, xb10Var, u291.d(qim0Var, 1.0f), yqi1Var, placeholder, x340Var2, ((i3 << 6) & 7168) | 12582912 | (458752 & i4) | (i4 & 3670016) | ((i3 << 12) & 234881024));
                x340Var = x340Var2;
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(resVar, ubb1Var, nbb1Var, iu30Var, xb10Var, yqi1Var, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d8 A[Catch: all -> 0x0039, LOOP:0: B:42:0x00d2->B:44:0x00d8, LOOP_END, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00f5, B:20:0x004a, B:39:0x00b5, B:41:0x00bf, B:42:0x00d2, B:44:0x00d8, B:45:0x00e4, B:23:0x0051, B:24:0x005e, B:26:0x0064, B:28:0x006f, B:29:0x0073, B:30:0x0080, B:32:0x0086, B:33:0x0092, B:35:0x0098), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r0 == r10) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(java.util.List r21, p.onm r22) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.res.q(java.util.List, p.onm):java.lang.Object");
    }

    public xnl0 r() {
        c0k0 c0k0Var = (c0k0) this.e;
        String str = c0k0Var.a;
        return new xnl0(str.length() > 0 ? cy30.p(t2p1.B(str), "?inTrackURL=", Uri.encode(c0k0Var.d.a), "&outTrackURL=", Uri.encode(c0k0Var.c.a)) : "");
    }

    public nhb1 s() {
        Resources resources = ((Context) this.d).getResources();
        return new nhb1(resources.getString(2131961338), resources.getString(2131961337), resources.getString(2131961336), resources.getString(2131961339), true, (izh1) null, 96);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object t(String str, ou80 ou80Var, onm onmVar) {
        ic61 ic61Var;
        bpb1 bpb1Var = (bpb1) this.h;
        if (onmVar instanceof ic61) {
            ic61Var = (ic61) onmVar;
            int i = ic61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic61Var.c = i - Integer.MIN_VALUE;
            } else {
                ic61Var = new ic61(this, onmVar);
            }
        } else {
            ic61Var = new ic61(this, onmVar);
        }
        ic61 ic61Var2 = ic61Var;
        Object obj = ic61Var2.a;
        int i2 = ic61Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                mzr0 mzr0Var = (mzr0) this.e;
                String str2 = (String) this.f;
                r6h1 r6h1Var = (r6h1) this.g;
                n641 n641Var = new n641(this, str, (lnm) null, (byte) 20);
                Integer num = new Integer(2131961639);
                ic61Var2.c = 1;
                Object objD = mzr0Var.d(str2, str, 2131961638, ou80Var, n641Var, r6h1Var, num, ic61Var2);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            Boolean bool2 = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool2);
            return rih1.a;
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool3);
            throw th;
        }
    }

    public Completable u(String str) {
        qnv0 qnv0Var = (qnv0) this.g;
        gfe gfeVar = gfe.b;
        mmq0 mmq0Var = mmq0.d;
        smq0 smq0Var = new smq0(gfeVar, mmq0Var, true);
        gfe gfeVar2 = gfe.a;
        smq0 smq0Var2 = new smq0(gfeVar2, mmq0Var, true);
        mmq0 mmq0Var2 = mmq0.c;
        return qnv0Var.d(new smq0[]{smq0Var, smq0Var2, new smq0(gfeVar, mmq0Var2, true), new smq0(gfeVar2, mmq0Var2, true)}, 4, str, false, (dg30) null);
    }

    public byk0 v(zc0 zc0Var) {
        fyk0 fyk0Var = (fyk0) ((ynb0) this.f).get();
        fyk0Var.getClass();
        return new byk0(new jpk0(fyk0Var), -1, zc0Var.c, zc0Var.a.a, (byte) 5);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153  */
    /* JADX WARN: Code duplicated, block: B:101:0x0159  */
    /* JADX WARN: Code duplicated, block: B:103:0x015f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0166  */
    /* JADX WARN: Code duplicated, block: B:106:0x016c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0173  */
    /* JADX WARN: Code duplicated, block: B:109:0x0179  */
    /* JADX WARN: Code duplicated, block: B:110:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x013e  */
    /* JADX WARN: Code duplicated, block: B:97:0x014b  */
    /* JADX WARN: Code duplicated, block: B:98:0x014e  */
    public scz w(rcz rczVar, tcz tczVar) {
        a5v0 x4v0Var;
        long j;
        long j2;
        hlw0 hlw0Var;
        iix0 iix0Var = tczVar.a;
        Long l = rczVar.c;
        kcz kczVar = rczVar.d;
        boolean z = tczVar.b;
        long jB = ((yqg) this.d).b();
        boolean z2 = tczVar.c;
        Long l2 = tczVar.d;
        boolean z3 = tczVar.e;
        a5v0 a5v0Var = b5v0.a;
        Object obj = a5v0.a;
        a5v0 a5v0Var2 = y4v0.a;
        a5v0 a5v0Var3 = z4v0.a;
        if (z2 || !(iix0Var == null || z3)) {
            Long lU = fho1.u(iix0Var, l2);
            if (iix0Var != null && lU != null) {
                x4v0Var = new x4v0(iix0Var.f(), lU.longValue());
            } else if (l == null || l.longValue() <= 0 || jB < l.longValue() || jB - l.longValue() > 864000000) {
                x4v0Var = z ? obj : a5v0Var;
            } else {
                x4v0Var = a5v0Var2;
            }
        } else {
            x4v0Var = a5v0Var3;
        }
        j8z j8zVar = tczVar.f;
        Float f = null;
        i091 i091Var = j8zVar != null ? j8zVar.a : null;
        boolean z4 = j8zVar != null && j8zVar.b;
        boolean z5 = (j8zVar == null || (hlw0Var = j8zVar.c) == null || !hlw0Var.b) ? false : true;
        boolean z6 = kczVar == kcz.b;
        boolean z7 = rczVar.g;
        ocz nczVar = mcz.a;
        if (!z7 && (!z6 || !rczVar.h)) {
            if (z6 && z4 && z5 && !rczVar.f && i091Var != null) {
                k091 k091Var = i091Var.h;
                boolean z8 = k091Var instanceof k091;
                ocz oczVar = lcz.a;
                if (z8) {
                    h091 h091Var = k091Var.a;
                    if (h091Var.equals(d091.a) || h091Var.equals(g091.a)) {
                        nczVar = oczVar;
                    } else if (!h091Var.equals(e091.a)) {
                        if (!h091Var.equals(f091.a)) {
                            eg.o();
                            return null;
                        }
                        if (!x4v0Var.equals(a5v0Var3)) {
                            if (x4v0Var instanceof x4v0) {
                                if (z6) {
                                    x4v0 x4v0Var2 = (x4v0) x4v0Var;
                                    j = x4v0Var2.a - x4v0Var2.b;
                                    if (j < 0) {
                                        j2 = 0;
                                    } else {
                                        j2 = j;
                                    }
                                    nczVar = new pcz(j2);
                                } else {
                                    nczVar = new ncz(1);
                                }
                            } else if (x4v0Var.equals(a5v0Var2)) {
                                nczVar = new ncz(2);
                            } else if (x4v0Var.equals(obj)) {
                                nczVar = new ncz(3);
                            } else {
                                if (!x4v0Var.equals(a5v0Var)) {
                                    eg.o();
                                    return null;
                                }
                                nczVar = new ncz(4);
                            }
                        }
                    }
                } else if (u890.j(k091Var, l091.a)) {
                    if (!x4v0Var.equals(a5v0Var3)) {
                        if (x4v0Var instanceof x4v0) {
                            if (z6) {
                                x4v0 x4v0Var3 = (x4v0) x4v0Var;
                                j = x4v0Var3.a - x4v0Var3.b;
                                if (j < 0) {
                                    j2 = 0;
                                } else {
                                    j2 = j;
                                }
                                nczVar = new pcz(j2);
                            } else {
                                nczVar = new ncz(1);
                            }
                        } else if (x4v0Var.equals(a5v0Var2)) {
                            nczVar = new ncz(2);
                        } else if (x4v0Var.equals(obj)) {
                            nczVar = new ncz(3);
                        } else {
                            if (!x4v0Var.equals(a5v0Var)) {
                                eg.o();
                                return null;
                            }
                            nczVar = new ncz(4);
                        }
                    }
                } else if (i091Var.e <= 0) {
                    nczVar = oczVar;
                } else {
                    float f2 = i091Var.f;
                    Float fValueOf = Float.valueOf(f2);
                    if (u890.j(k091Var, n091.a) && Math.abs(f2) <= Float.MAX_VALUE && f2 > 0.0f) {
                        f = fValueOf;
                    }
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    long j3 = i091Var.d;
                    nczVar = new ocz(i091.a(i091Var, j3 < 0 ? 0L : j3, fFloatValue, false, 471));
                }
            } else if (!x4v0Var.equals(a5v0Var3)) {
                if (x4v0Var instanceof x4v0) {
                    if (z6) {
                        x4v0 x4v0Var4 = (x4v0) x4v0Var;
                        j = x4v0Var4.a - x4v0Var4.b;
                        if (j < 0) {
                            j2 = 0;
                        } else {
                            j2 = j;
                        }
                        nczVar = new pcz(j2);
                    } else {
                        nczVar = new ncz(1);
                    }
                } else if (x4v0Var.equals(a5v0Var2)) {
                    nczVar = new ncz(2);
                } else if (x4v0Var.equals(obj)) {
                    nczVar = new ncz(3);
                } else {
                    if (!x4v0Var.equals(a5v0Var)) {
                        eg.o();
                        return null;
                    }
                    nczVar = new ncz(4);
                }
            }
        }
        return new scz(rczVar.a, kczVar, nczVar, rczVar.i);
    }

    public byk0 y(zc0 zc0Var) {
        fyk0 fyk0Var = (fyk0) ((ynb0) this.f).get();
        fyk0Var.getClass();
        return new byk0(new jpk0(fyk0Var), -1, zc0Var.c, zc0Var.a.a, (byte) 1);
    }

    public res(Context context, los losVar, lzn0 lzn0Var, x52 x52Var, ce31 ce31Var) {
        this.a = (byte) 3;
        this.d = context;
        this.e = losVar;
        this.f = lzn0Var;
        this.g = x52Var;
        this.h = ce31Var;
        this.b = x3p1.n(ny1.Z, new r52(this, (byte) 0), new ab(this, (byte) 28), (o8n) null, new r52(this, (byte) 1), 8);
        this.i = new s52(this, (byte) 0);
        this.c = new f70((byte) 1);
    }

    public res(qn qnVar, cw71 cw71Var, gw71 gw71Var, w1q w1qVar, lte lteVar, quc0 quc0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 27;
        this.d = w1qVar;
        this.e = lteVar;
        this.f = quc0Var;
        this.g = q8nVar;
        this.h = q8nVar2;
        dw71 dw71Var = new dw71("", 2, false);
        z6x z6xVar = z6x.a;
        mw71 mw71Var = mw71.d;
        w7x w7xVar = w7x.a;
        this.b = sbl.z(new xx71("", "", dw71Var, z6xVar, true, (ew71) null, false, false, (String) null, (ew71) null, mw71Var, 0L, 0L, false, false, w7xVar, w7xVar), gp71.e, qnVar, new hx71(this, (byte) 0), new c861(cw71Var, gw71Var, this));
        this.i = new eih1();
        j2i j2iVar = new j2i(1831798753, new c771(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(di4 di4Var, joe joeVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = (byte) 8;
        this.d = di4Var;
        this.e = joeVar;
        this.f = iu30Var;
        this.g = iu30Var2;
        this.h = ygn0.a();
        this.b = k1o1.u(new l14(this, (lnm) null, (byte) 1));
        this.i = n3o1.q(this).a(fdm.W0, fdm.X0);
        j2i j2iVar = qgi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(urk0 urk0Var, di4 di4Var, joe joeVar, iu30 iu30Var) {
        this.a = (byte) 9;
        this.d = urk0Var;
        this.e = di4Var;
        this.f = joeVar;
        this.g = iu30Var;
        this.h = ygn0.a();
        this.b = k1o1.u(new l14(this, (lnm) null, (byte) 2));
        this.i = n3o1.q(this).a(new cml(this, (byte) 19), cnn.X0);
        j2i j2iVar = new j2i(560008038, new bfm(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(Context context, dv dvVar, kw kwVar, ca40 ca40Var, uzl0 uzl0Var) {
        this.a = (byte) 1;
        this.d = context;
        this.e = dvVar;
        this.f = kwVar;
        this.g = ca40Var;
        this.h = uzl0Var;
        this.b = x3p1.n(new ku(this, (byte) 0), new ku(this, (byte) 1), e3.X, (o8n) null, new ku(this, (byte) 2), 8);
        this.i = n3o1.r(this).c(new m3(this, (byte) 7), n1.Y);
        j2i j2iVar = w2i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(urk0 urk0Var, gw70 gw70Var, tg80 tg80Var, di4 di4Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = (byte) 15;
        this.d = gw70Var;
        this.e = tg80Var;
        this.f = di4Var;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.i = n3o1.q(this).a(new z63(urk0Var, (byte) 20), rb80.X);
        this.b = new rey0(new gn50(this, (byte) 28));
        j2i j2iVar = new j2i(-1403643663, new wv60(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(Context context, r35 r35Var, Flowable flowable, q8n q8nVar, String str, String str2) {
        this.a = (byte) 25;
        this.d = context;
        this.e = r35Var;
        this.f = flowable;
        this.g = str;
        this.h = str2;
        this.b = new k8d1(q8nVar, new yyg(this, (lnm) null, (byte) 4));
        j2i j2iVar = agj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.i = new eih1();
    }

    public res(o4o0 o4o0Var, o1o0 o1o0Var, rfr rfrVar, Function0 function0, Function0 function1, e5l0 e5l0Var) {
        this.a = (byte) 20;
        this.d = o1o0Var;
        this.e = rfrVar;
        this.f = function0;
        this.g = function1;
        this.h = e5l0Var;
        this.b = x3p1.m(yoi1.g(o4o0Var.b()), htn0.t, b5n0.V0, (o8n) null, new xkm0(this, (byte) 26), 8);
        this.i = new eih1();
        j2i j2iVar = new j2i(-33108923, new hmk0(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5) {
        this.a = (byte) 2;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = ynb0Var3;
        this.g = ynb0Var4;
        this.h = ynb0Var5;
        this.b = x3p1.n(new cd0(this, (byte) 0), ft.X0, e3.Y, (o8n) null, new cd0(this, (byte) 1), 8);
        this.i = n3o1.q(this).a(new dd0(this, (byte) 0), new dd0(this, (byte) 1));
        j2i j2iVar = new j2i(-1628209543, new r1(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(ouz ouzVar, i5a1 i5a1Var, v4o0 v4o0Var, los losVar, it90 it90Var) {
        this.a = (byte) 16;
        this.d = ouzVar;
        this.e = i5a1Var;
        this.f = v4o0Var;
        this.g = it90Var;
        this.h = new svh0(losVar, (byte) 16);
        this.b = x3p1.n(new ut90(this, (byte) 0), mr90.c, ul90.f, (o8n) null, new ut90(this, (byte) 1), 8);
        this.i = n3o1.q(this).a(rb80.Z0, rb80.a1);
        j2i j2iVar = new j2i(-1694729387, new wv60(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(u9c0 u9c0Var, mzr0 mzr0Var, String str, xe01 xe01Var) {
        this.a = (byte) 26;
        this.d = u9c0Var;
        this.e = mzr0Var;
        this.f = str;
        this.g = r6h1.c;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.h = bpb1VarB;
        this.b = z0o1.k(d5p1.t(new x010(xe01Var, bpb1VarB, new w1t(3, (lnm) null, (byte) 2), (byte) 1), u9c0Var, new alb1(0L, Long.MAX_VALUE), new qzm((List) xe01Var.a.getValue(), false)), qr51.S0, new q961(this, (byte) 2), 4);
        j2i j2iVar = hgj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.i = n3o1.r(this).c(new z821(this, (byte) 25), vp51.T0);
    }

    public res(yqg yqgVar, ubw0 ubw0Var, ubw0 ubw0Var2, jcz jczVar) {
        this.a = (byte) 13;
        o8n o8nVar = (o8n) v55.Z.getValue();
        this.d = yqgVar;
        this.e = ubw0Var;
        this.f = ubw0Var2;
        this.h = jczVar;
        this.g = new idd1(new pdy(this, (byte) 13));
        this.b = h7w.B(new nty(this, (byte) 15), o8nVar, (iu30) null, new k9s(this, (byte) 26), 4);
        this.i = new eih1();
        j2i j2iVar = new j2i(549336989, new yhy(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(lik1 lik1Var, d0r d0rVar, lzn0 lzn0Var, wty wtyVar) {
        this.a = (byte) 12;
        this.d = lik1Var;
        this.e = d0rVar;
        this.f = lzn0Var;
        this.g = wtyVar;
        this.h = w3p1.n(new l4r(hvm.c, 1, rqy.Y0, new j4r(rqy.W0), rqy.Z0), new l4r(pwc0.b, 1, rqy.a1, new j4r(rqy.X0), rqy.b1), lgx.e1);
        this.b = x3p1.n(new nty(this, (byte) 0), rqy.V0, lgx.d1, (o8n) null, (iu30) null, 24);
        this.i = n3o1.q(this).a(c9x.a1, c9x.b1);
        j2i j2iVar = new j2i(-463238489, new yhy(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(lik1 lik1Var, lzn0 lzn0Var, vpp0 vpp0Var) {
        this.a = (byte) 23;
        this.d = lik1Var;
        this.e = lzn0Var;
        this.f = vpp0Var;
        this.g = new idd1(wso0.Q0);
        this.h = new idd1(new pdp0(this, (byte) 7));
        this.b = x3p1.n(new vop0(this, (byte) 0), mmp0.h, ofo0.Z0, (o8n) null, new vop0(this, (byte) 1), 8);
        this.i = new u7h1(new nso0(this, (byte) 6), new qsn0(this, (byte) 14));
        j2i j2iVar = r4j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(Context context, lik1 lik1Var, oj3 oj3Var, qut0 qut0Var, upp0 upp0Var) {
        this.a = (byte) 22;
        this.d = lik1Var;
        this.e = oj3Var;
        this.f = qut0Var;
        this.g = context.getString(2131959315);
        this.h = context.getString(2131959314);
        this.b = x3p1.n(new pop0(this, (byte) 0), mmp0.f, ofo0.Y0, (o8n) null, new pop0(this, (byte) 1), 8);
        this.i = n3o1.q(this).a(new qop0(this, (byte) 0), new qop0(this, (byte) 1));
        j2i j2iVar = new j2i(-764071122, new aso0(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(lzn0 lzn0Var, zru zruVar, mr20 mr20Var, lnh0 lnh0Var, bqk0 bqk0Var) {
        this.a = (byte) 7;
        this.d = lzn0Var;
        this.e = zruVar;
        this.f = mr20Var;
        this.g = lnh0Var;
        this.h = new rey0(new orm(this, (byte) 0));
        this.b = new nqk0(bqk0Var, 0);
        this.i = eth.a0((vu30) null, new orm(this, (byte) 1), 1);
        j2i j2iVar = new j2i(-1475946330, new bfm(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(d0r d0rVar, String str, gqg gqgVar) {
        this.a = (byte) 6;
        this.d = d0rVar;
        this.e = str;
        Map map = gqgVar.a;
        this.f = map;
        List<fqg> listA1 = o7h.a1(map.values(), new p0d((byte) 10));
        ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
        for (fqg fqgVar : listA1) {
            arrayList.add(new ypg(fqgVar.d, fqgVar.b, fqgVar.a, fqgVar.c));
        }
        this.g = arrayList;
        this.h = vxo1.l((d0r) this.d, (String) this.e);
        this.b = d4o1.f(new cqg(this, (byte) 0), tpg.e, rng.c, new cqg(this, (byte) 1), 8);
        this.i = new eih1();
        j2i j2iVar = zci.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(n4b n4bVar, ulc ulcVar, q8n q8nVar, wh71 wh71Var, oud oudVar) {
        this.a = (byte) 10;
        this.d = n4bVar;
        this.e = q8nVar;
        this.f = wh71Var;
        this.g = oudVar;
        this.b = new rey0(new mgl(this, (byte) 17));
        this.i = new eih1();
        j2i j2iVar = new j2i(457666911, new bfm(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(mxr mxrVar, byp bypVar, tq90 tq90Var, i3b i3bVar, b0a0 b0a0Var) {
        this.a = (byte) 5;
        this.d = mxrVar;
        this.e = bypVar;
        this.f = tq90Var;
        this.g = i3bVar;
        this.h = b0a0Var;
        this.b = x3p1.n(new eaf(this, (byte) 0), nve.t, eqe.g, (o8n) null, new eaf(this, (byte) 1), 8);
        this.i = n3o1.q(this).a(r0f.e, r0f.f);
        j2i j2iVar = new j2i(-243115405, new gtd(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(Context context, lzn0 lzn0Var, bfd bfdVar, q8n q8nVar) {
        this.a = (byte) 11;
        this.d = context;
        this.e = lzn0Var;
        this.f = bfdVar;
        this.g = q8nVar;
        this.h = h7w.D(rnv.U0, (bs50) null, (iu30) null, new j2i(-483572386, new sw1(this, (byte) 9), true), 6);
        this.b = new txk0((byte) 9);
        this.i = eth.a0((vu30) null, new oat(this, (byte) 16), 1);
        j2i j2iVar = rki.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(lzn0 lzn0Var, vcd0 vcd0Var, ov20 ov20Var, jed0 jed0Var, b7n b7nVar, hgd0 hgd0Var, pcl pclVar, i9i1 i9i1Var) {
        huz mnc0Var;
        this.a = (byte) 17;
        this.d = lzn0Var;
        this.e = vcd0Var;
        this.f = hgd0Var;
        this.g = i9i1Var;
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        dt71VarE.a(rih1.a);
        this.h = dt71VarE;
        mr20 mr20VarU = rqt0.u(hu20.e(dt71VarE, new zz90((lnm) null, this, (byte) 5)));
        bw20 bw20Var = (bw20) ov20Var;
        mr20 mr20VarA = bw20Var.a("publish-activity", false);
        mr20 mr20VarA2 = b7nVar.a(r6n.a);
        lmf lmfVar = new lmf(jed0Var.b(), (byte) 2);
        if (hgd0Var.d()) {
            mnc0Var = new huz(Boolean.TRUE, (byte) 10);
        } else {
            mnc0Var = new mnc0(bw20Var.c("campfire", "DISABLED_CANNOT_ENABLE"), (byte) 9);
        }
        this.b = x3p1.m(h5p1.s(mr20VarU, mr20VarA, h5p1.q(mr20VarA2, lmfVar, mnc0Var, pclVar.a(), jed0Var.d(), new dad0(null, (byte) 0)), new td1(4, (lnm) null, (byte) 6)), l1d0.b1, new s2c0(this, (byte) 14), (o8n) null, new l6d0(this, (byte) 5), 8);
        this.i = qro1.q(n3o1.q(this), j830.Z0, i2d0.Y);
        j2i j2iVar = new j2i(182176242, new pba0(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(lzn0 lzn0Var, koc0 koc0Var, gr6 gr6Var, af10 af10Var, uu00 uu00Var) {
        this.a = (byte) 4;
        this.d = lzn0Var;
        this.e = koc0Var;
        this.f = gr6Var;
        this.g = af10Var;
        this.h = uu00Var;
        this.b = x3p1.n(new y93(this, (byte) 0), q83.R0, p83.Q0, (o8n) null, new y93(this, (byte) 1), 8);
        j2i j2iVar = new j2i(1383401113, new i43(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.i = n3o1.q(this).a(k63.h, k63.i);
    }

    public res(lcs lcsVar, los losVar, ck20 ck20Var, qnv0 qnv0Var) {
        this.a = (byte) 21;
        this.d = lcsVar;
        this.e = losVar;
        this.f = ck20Var;
        this.g = qnv0Var;
        bpb1 bpb1VarB = gio1.b(jpo0.a);
        this.h = bpb1VarB;
        this.b = z0o1.k(bpb1VarB, ofo0.X, new y3o0(this, (byte) 8), 4);
        this.i = n3o1.q(this).a(n3o0.U0, n3o0.V0);
        j2i j2iVar = new j2i(-207114084, new hmk0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(iyc0 iyc0Var, kt91 kt91Var, op31 op31Var, cxv cxvVar, wcp wcpVar) {
        this.a = (byte) 24;
        this.d = iyc0Var;
        this.e = kt91Var;
        this.f = op31Var;
        this.g = cxvVar;
        this.h = wcpVar;
        ucy0 ucy0Var = ucy0.O0;
        fns fnsVar = igu.a;
        this.b = h7w.B(ucy0Var, pyf0.a, (iu30) null, new ixt0(this, (byte) 19), 4);
        j2i j2iVar = new j2i(-114995985, new qsu0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.i = n3o1.q(this).a(cnx0.Z0, cnx0.a1);
    }

    public res(lzn0 lzn0Var, v5n v5nVar, uzl0 uzl0Var, Observable observable, gu guVar) {
        this.a = (byte) 28;
        this.d = lzn0Var;
        this.e = v5nVar;
        this.f = uzl0Var;
        this.g = observable;
        this.h = guVar;
        this.b = h7w.D(oa81.Y0, (bs50) null, oa81.a1, new j2i(1862173850, new wcy0(this, (byte) 11), true), 2);
        this.i = n3o1.r(this).c(new cq61(this, (byte) 14), c781.Q0);
        j2i j2iVar = new j2i(1250052994, new c771(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(cdk0 cdk0Var, c0k0 c0k0Var, yqg yqgVar, nxo nxoVar, r7j0 r7j0Var) {
        this.a = (byte) 19;
        this.d = cdk0Var;
        this.e = c0k0Var;
        this.f = yqgVar;
        this.g = nxoVar;
        this.h = r7j0Var;
        this.b = new rey0(new mbj0(this, (byte) 19));
        this.i = n3o1.q(this).a(new pah0(this, (byte) 20), fmk0.c);
        j2i j2iVar = new j2i(1001602641, new hmk0(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(stm1 stm1Var, stm1 stm1Var2, lqr lqrVar, z0t z0tVar, ft30 ft30Var) {
        this.a = (byte) 0;
        this.d = lqrVar;
        this.e = z0tVar;
        this.f = ft30Var;
        String name = res.class.getName();
        this.g = new idd1(new nxr(stm1Var, this, (byte) 16));
        this.h = new idd1(new nxr(stm1Var2, this, (byte) 15));
        this.b = x3p1.m(new huz(rih1.a, (byte) 10), c6s.Z0, new i4o((Object) this, (byte) 21), (o8n) null, new vas(this, (byte) 5), 8);
        this.i = new ia00(name, zyr.d1, zyr.e1);
        j2i j2iVar = new j2i(1750882103, new i6r(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(Context context, pd80 pd80Var, iac0 iac0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 18;
        this.d = context;
        this.e = pd80Var;
        this.f = iac0Var;
        this.g = q8nVar;
        this.h = q8nVar2;
        this.b = sbl.z(new g7j0(i7j0.c, d7j0.a, (String) null, (String) null, (String) null), xxb0.v, new ku1(this, (byte) 21), m2j0.c, new n7j0(this));
        this.i = new eih1();
        j2i j2iVar = s0j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public res(f1n0 f1n0Var, mnk0 mnk0Var, aqv aqvVar, bpb1 bpb1Var, bpb1 bpb1Var2, jha1 jha1Var, mr20 mr20Var) {
        this.a = (byte) 29;
        this.d = f1n0Var;
        this.e = bpb1Var;
        this.f = new rnu(bpb1Var2);
        this.g = new rnu(bpb1Var2);
        this.b = x3p1.m(h5p1.s(jha1Var, mnk0Var.a, mr20Var, new td1(4, (lnm) null, (byte) 11)), new qd81(this, (byte) 11), new wh91(this, (byte) 18), (o8n) null, new l5b1(this, (byte) 4), 8);
        j2i j2iVar = new j2i(1550184019, new u491(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.i = n3o1.r(this).c(vva1.Y, new zbb1(this, (byte) 0));
    }
}
