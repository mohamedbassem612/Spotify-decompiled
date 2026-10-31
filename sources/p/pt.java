package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.Timestamp;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pt implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public final Object t;

    public pt(gw70 gw70Var, gff1 gff1Var, iff1 iff1Var, qn qnVar, fg60 fg60Var, l6m0 l6m0Var, pt ptVar, qn qnVar2) {
        this.a = (byte) 18;
        this.d = gw70Var;
        this.e = iff1Var;
        this.f = qnVar;
        this.g = fg60Var;
        this.h = l6m0Var;
        this.i = ptVar;
        this.t = qnVar2;
        yff1 yff1VarX0 = wff1.x0(new agf1((ArrayList) null, (Integer) null, Timestamp.o(), 11), fg60Var.b());
        gp71 gp71Var = gp71.n;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        dff1 dff1Var = new dff1(gff1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lff1.class), runSequentially.a(dff1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mff1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eff1(gff1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kff1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fff1(gff1Var)));
        this.b = sbl.B(yff1VarX0, gp71Var, new a(gff1Var.d, coroutinesSubtypeEffectHandlerBuilderI), ppd1.e1, new ibf1(this, (byte) 5));
        j2i j2iVar = new j2i(-243986302, new y2f1(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public static c9 A(List list, boolean z, boolean z2) {
        boolean z3 = z && !z2;
        List<ev> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (ev evVar : list2) {
            arrayList.add(new ev(evVar.a, evVar.b, evVar.c, evVar.d, evVar.e && z3, evVar.f));
        }
        return mqo1.F(arrayList);
    }

    public static int F(int i, List list) {
        zff1 zff1Var = (zff1) o7h.t0(i, list);
        if (zff1Var == null) {
            return 1;
        }
        List list2 = zff1Var.Y;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 1;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((vff1) it.next()).e) {
                return 2;
            }
        }
        return 1;
    }

    public static boolean G(hek1 hek1Var) {
        if (hek1Var.a && hek1Var.h == nmu0.c) {
            return hek1Var.d || hek1Var.e;
        }
        return false;
    }

    public static lis0 I(zff1 zff1Var) {
        cis0 cis0Var = new cis0(zff1Var.a, zff1Var.t, zff1Var.h, zff1Var.e);
        List<vff1> list = zff1Var.Y;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (vff1 vff1Var : list) {
            arrayList.add(new kis0(vff1Var.b, vff1Var.c, vff1Var.a, vff1Var.d, vff1Var.e));
        }
        return new lis0(cis0Var, arrayList);
    }

    public static xs J(qs qsVar, ts tsVar, boolean z) {
        boolean z2 = tsVar.c;
        c380 c380Var = qsVar.a;
        if (c380Var == null) {
            return new ws(false);
        }
        return c380Var.isEmpty() ? new us(z2, qsVar.b, true) : new vs(A(c380Var, tsVar.b, z), z2, (ev) null, false);
    }

    public static ti81 K(pt ptVar, si81 si81Var, String str, Uri uri, String str2, u7h u7hVar, int i) {
        String str3 = (i & 1) != 0 ? null : str;
        Uri uri2 = (i & 2) != 0 ? null : uri;
        String str4 = (i & 4) != 0 ? null : str2;
        u7h u7hVar2 = (i & 8) != 0 ? null : u7hVar;
        li81 li81Var = (li81) ptVar.C(si81Var.c).getValue();
        return new ti81(str3, uri2, str4, u7hVar2, si81Var.a || (!si81Var.b && li81Var == null), si81Var.b, li81Var, (li81) ptVar.C(si81Var.d).getValue());
    }

    public ven0 B(ji81 ji81Var, x340 x340Var) {
        boolean zG = x340Var.g(ji81Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = C(ji81Var);
            x340Var.s0(objT);
        }
        return rwq.h((zob1) objT, x340Var, 0);
    }

    public zob1 C(ji81 ji81Var) {
        ypg0 ypg0Var;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        zob1 zob1Var = (zob1) linkedHashMap.get(ji81Var);
        if (zob1Var != null) {
            return zob1Var;
        }
        gu guVar = (gu) this.h;
        idd1 idd1Var = guVar.l;
        Object obj = null;
        int i = 2;
        if (ji81Var instanceof hi81) {
            ypg0Var = new ypg0(new fu(i, ji81Var, (Object) new idd1(new eu(guVar, (byte) 1)), (Object) new idd1(new eu(guVar, (byte) 2)), (byte) 0), (zob1) idd1Var.getValue());
        } else {
            if (!(ji81Var instanceof ii81)) {
                eg.o();
                return null;
            }
            ypg0Var = new ypg0(new ym((fr) guVar.k.get(), 2, (byte) 1), (zob1) idd1Var.getValue());
        }
        for (Object obj2 : linkedHashMap.keySet()) {
            if (((ji81) obj2).getClass() == ji81Var.getClass()) {
                obj = obj2;
                break;
            }
        }
        ji81 ji81Var2 = (ji81) obj;
        if (ji81Var2 != null) {
            linkedHashMap.remove(ji81Var2);
        }
        linkedHashMap.put(ji81Var, ypg0Var);
        return ypg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r5.u(r2, r8, r7) == r14) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r2.c(r1, r7) == r14) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object D(p.gea0 r25, p.onm r26) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pt.D(p.gea0, p.onm):java.lang.Object");
    }

    public void E(gek1 gek1Var, hek1 hek1Var) {
        t2 t2Var = (t2) this.h;
        String str = (String) this.d;
        t2Var.a.i(new dwn0("spotify:internal:magpie?config=".concat(hek1Var.a ? "EDIT" : "VIEW"), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), pzm.f("uri", str, "errors", gek1Var.c));
    }

    public void H() {
        ((bpb1) this.c).m((Object) null, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(lnm lnmVar) {
        arh1 arh1Var;
        if (lnmVar instanceof arh1) {
            arh1Var = (arh1) lnmVar;
            int i = arh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                arh1Var.c = i - Integer.MIN_VALUE;
            } else {
                arh1Var = new arh1(this, lnmVar);
            }
        } else {
            arh1Var = new arh1(this, lnmVar);
        }
        Object objJ = arh1Var.a;
        int i2 = arh1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleOnErrorReturnItem = ((zww) ((y1t0) this.f).b).b().map(y6x0.f).onErrorReturnItem(zxw.a);
            arh1Var.c = 1;
            objJ = fc11.j(singleOnErrorReturnItem, arh1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        ayw aywVar = (ayw) objJ;
        yxw yxwVar = aywVar instanceof yxw ? (yxw) aywVar : null;
        if (yxwVar != null) {
            ((e241) this.g).a.onNext(yxwVar.a);
        }
        return rih1.a;
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (ia00) obj;
            case 1:
                return (ia00) obj;
            case 2:
                return (eih1) obj;
            case 3:
                return (ia00) obj;
            case 4:
                return (rqw) obj;
            case 5:
                return (d9k) this.t;
            case 6:
                return (u7h1) obj;
            case 7:
                return (ia00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (ia00) obj;
            case 10:
                return (ia00) obj;
            case 11:
                return (ia00) obj;
            case 12:
                return (ia00) obj;
            case 13:
                return (hy00) obj;
            case 14:
                return n3o1.r(this).c(new x3o0(this, (byte) 20), f2s0.h);
            case 15:
                return (ia00) obj;
            case 16:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (hy00) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return n3o1.q(this).a(new nsb1(this, (byte) 21), new zbb1(this, (byte) 6));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ia00) obj;
            default:
                return (ia00) obj;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                return (psw) obj;
            case 2:
                return (psw) obj;
            case 3:
                return (psw) obj;
            case 4:
                return (psw) obj;
            case 5:
                return (psw) obj;
            case 6:
                return (psw) obj;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj;
            case 10:
                return (psw) obj;
            case 11:
                return (psw) obj;
            case 12:
                return (psw) obj;
            case 13:
                return (psw) obj;
            case 14:
                j2i j2iVar = new j2i(-1199832858, new t9r0(this, (byte) 8), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 15:
                return (psw) obj;
            case 16:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (psw) obj;
            default:
                return (psw) obj;
        }
    }

    public void e(li81 li81Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-146015982);
        int i4 = (x340Var.i(li81Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var;
            if (li81Var != null) {
                x340Var.i0(839907452);
                vvx.a(krz0.c1, apo.r(-785267586, new q081(li81Var, qim0Var3, (byte) 5), x340Var), x340Var, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(840080432);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(this, li81Var, qim0Var2, i, i2, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9 A[PHI: r5 r7
      0x00b9: PHI (r5v22 int) = (r5v9 int), (r5v9 int), (r5v24 int) binds: [B:71:0x00c5, B:65:0x00b6, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r7v12 p.qim0) = (r7v4 p.qim0), (r7v2 p.qim0), (r7v2 p.qim0) binds: [B:71:0x00c5, B:65:0x00b6, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:81:0x0154  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public void f(boolean z, Function0 function0, qim0 qim0Var, qim0 qim0Var2, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var3;
        idn0 idn0Var2;
        boolean z2;
        qim0 qim0Var4;
        idn0 idn0Var3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var5;
        idn0 idn0VarY;
        gdx gdxVarS;
        qim0 qim0Var6;
        int i5;
        qim0 qim0Var7 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1911543786);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var7) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                qim0Var3 = qim0Var2;
                i3 |= x340Var.i(qim0Var3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    idn0Var2 = idn0Var;
                    int i7 = x340Var.i(idn0Var2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    idn0Var2 = idn0Var;
                }
                i3 |= i7;
            } else {
                idn0Var2 = idn0Var;
            }
            if ((196608 & i) == 0) {
                if (x340Var.i(this)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i6 != 0) {
                        qim0Var3 = nim0.a;
                    }
                    if ((i2 & 16) != 0) {
                        i4 = i3 & (-57345);
                        qim0Var5 = qim0Var3;
                        idn0VarY = zso1.Y(x340Var);
                    }
                    x340Var.s();
                    gdxVarS = yla.s(x340Var);
                    if (function0 != null) {
                        x340Var.i0(170765295);
                        qim0Var6 = qim0Var5;
                        wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, (max) null, gdxVarS, (vzq0) null, false, idn0VarY, (ga80) null, apo.r(-1034269852, new r7e0(this, z, qim0Var5, (byte) 25), x340Var), x340Var, (i4 & 896) | ((i4 << 12) & 234881024), 6, 728);
                        qim0Var7 = qim0Var;
                        x340Var.r(false);
                    } else {
                        qim0Var6 = qim0Var5;
                        x340Var.i0(171084874);
                        g(((i4 >> 9) & 896) | (i4 & 14), x340Var, u291.r(uyn1.x(uyn1.x(qim0Var7, 8.0f), 8.0f).then(qim0Var6), 16.0f), z);
                        x340Var.r(false);
                    }
                    qim0Var4 = qim0Var6;
                    idn0Var3 = idn0VarY;
                } else {
                    x340Var.b0();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                i4 = i3;
                qim0Var5 = qim0Var3;
                idn0VarY = idn0Var2;
                x340Var.s();
                gdxVarS = yla.s(x340Var);
                if (function0 != null) {
                    x340Var.i0(170765295);
                    qim0Var6 = qim0Var5;
                    wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, (max) null, gdxVarS, (vzq0) null, false, idn0VarY, (ga80) null, apo.r(-1034269852, new r7e0(this, z, qim0Var5, (byte) 25), x340Var), x340Var, (i4 & 896) | ((i4 << 12) & 234881024), 6, 728);
                    qim0Var7 = qim0Var;
                    x340Var.r(false);
                } else {
                    qim0Var6 = qim0Var5;
                    x340Var.i0(171084874);
                    g(((i4 >> 9) & 896) | (i4 & 14), x340Var, u291.r(uyn1.x(uyn1.x(qim0Var7, 8.0f), 8.0f).then(qim0Var6), 16.0f), z);
                    x340Var.r(false);
                }
                qim0Var4 = qim0Var6;
                idn0Var3 = idn0VarY;
            } else {
                x340Var.b0();
                qim0Var4 = qim0Var3;
                idn0Var3 = idn0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(this, z, function0, qim0Var7, qim0Var4, idn0Var3, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var3 = qim0Var2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                idn0Var2 = idn0Var;
                if (x340Var.i(idn0Var2)) {
                }
                i3 |= i7;
            } else {
                idn0Var2 = idn0Var;
            }
            i3 |= i7;
        } else {
            idn0Var2 = idn0Var;
        }
        if ((196608 & i) == 0) {
            if (x340Var.i(this)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    qim0Var3 = nim0.a;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    qim0Var5 = qim0Var3;
                    idn0VarY = zso1.Y(x340Var);
                } else {
                    i4 = i3;
                    qim0Var5 = qim0Var3;
                    idn0VarY = idn0Var2;
                }
            } else {
                if (i6 != 0) {
                    qim0Var3 = nim0.a;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    qim0Var5 = qim0Var3;
                    idn0VarY = zso1.Y(x340Var);
                } else {
                    i4 = i3;
                    qim0Var5 = qim0Var3;
                    idn0VarY = idn0Var2;
                }
            }
            x340Var.s();
            gdxVarS = yla.s(x340Var);
            if (function0 != null) {
                x340Var.i0(170765295);
                qim0Var6 = qim0Var5;
                wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, (max) null, gdxVarS, (vzq0) null, false, idn0VarY, (ga80) null, apo.r(-1034269852, new r7e0(this, z, qim0Var5, (byte) 25), x340Var), x340Var, (i4 & 896) | ((i4 << 12) & 234881024), 6, 728);
                qim0Var7 = qim0Var;
                x340Var.r(false);
            } else {
                qim0Var6 = qim0Var5;
                x340Var.i0(171084874);
                g(((i4 >> 9) & 896) | (i4 & 14), x340Var, u291.r(uyn1.x(uyn1.x(qim0Var7, 8.0f), 8.0f).then(qim0Var6), 16.0f), z);
                x340Var.r(false);
            }
            qim0Var4 = qim0Var6;
            idn0Var3 = idn0VarY;
        } else {
            x340Var.b0();
            qim0Var4 = qim0Var3;
            idn0Var3 = idn0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(this, z, function0, qim0Var7, qim0Var4, idn0Var3, i, i2);
        }
    }

    public void g(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(784095961);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qlx qlxVar = z ? qlx.c : mlx.c;
            if (z) {
                i3 = 1896950686;
                i4 = 2131962463;
            } else {
                i3 = 1896953564;
                i4 = 2131962464;
            }
            w0h1.a(qlxVar, new jsl(x0d.k(x340Var, i3, i4, x340Var, false)), qim0Var, 0L, 0L, false, x340Var, 8 | ((i2 << 3) & 896), 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi81(this, z, qim0Var, i, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.t;
        switch (b) {
            case 0:
                return (js20) obj;
            case 1:
                return (rey0) obj;
            case 2:
                return (ljm0) obj;
            case 3:
                return (rey0) obj;
            case 4:
                return (ljm0) obj;
            case 5:
                return (e7m0) this.g;
            case 6:
                return (e7m0) obj;
            case 7:
                return (js20) obj;
            case 8:
                return (ljm0) obj;
            case 9:
                return (k8d1) obj;
            case 10:
                return (js20) obj;
            case 11:
                return (k8d1) obj;
            case 12:
                return (e7m0) obj;
            case 13:
                return (ljm0) obj;
            case 14:
                return x3p1.n(new ois0(this, (byte) 0), egs0.i, w0q0.Z0, (o8n) null, new ois0(this, (byte) 1), 8);
            case 15:
                return (ljm0) obj;
            case 16:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ljm0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (e7m0) this.b;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (e7m0) obj;
            default:
                return (js20) obj;
        }
    }

    public void h(ez5 ez5Var, b0k b0kVar, int i) {
        pt ptVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2082979248);
        int i2 = (x340Var.g(ez5Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ptVar = this;
            otw.c(ptVar, new ez5(ez5Var.a, (rz5) rwq.h(((yfr) this.d).n, x340Var, 0).getValue()), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
        } else {
            ptVar = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xy5(ptVar, ez5Var, i);
        }
    }

    public void i(ea11 ea11Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(986504093);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ea11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131954732);
            String strO1 = cwl1.o0(x340Var, ((bf4) this.i).b() ? 2131954734 : 2131954733);
            zmx zmxVar = zmx.c;
            String strO2 = cwl1.o0(x340Var, 2131954731);
            String strO3 = cwl1.o0(x340Var, 2131954730);
            boolean zG = ((i2 & 112) == 32) | ((i2 & 14) == 4) | x340Var.g(strO1) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                odp0 odp0Var = new odp0(iu30Var2, ea11Var, strO1, strO0, (byte) 10);
                x340Var.s0(odp0Var);
                objT = odp0Var;
            }
            kyo1.c(strO2, zmxVar, (Function0) objT, (qim0) null, false, strO3, (v2g) null, (vu30) null, x340Var, zmx.d << 3, 216);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0((Object) this, (Object) ea11Var, (Object) iu30Var, i, (byte) 21);
        }
    }

    public void j(ev evVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(220924743);
        int i2 = (x340Var.i(evVar) ? 4 : 2) | i | 48;
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = evVar.b;
            if (str == null) {
                str = evVar.a;
            }
            String strO0 = cwl1.o0(x340Var, 2131951757);
            boolean zG = x340Var.g(str) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new os(str, strO0, b);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            wu.b(str, s161.a(qim0Var3, (iu30) objT), (qim0) null, false, (gbx) null, false, apo.r(-1416807337, new ab(evVar, (byte) 2), x340Var), x340Var, 1572864, 60);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1(this, evVar, qim0Var2, i, (byte) 5);
        }
    }

    public void k(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1135372733);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131960620);
            String strO1 = cwl1.o0(x340Var, 2131960619);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new h7w0(iu30Var, (byte) 17);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            String strO2 = cwl1.o0(x340Var, 2131960622);
            String strO3 = cwl1.o0(x340Var, 2131960621);
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new h7w0(iu30Var, (byte) 18);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            boolean z3 = false;
            zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function1));
            if (i3 == 4) {
                z3 = true;
            }
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new h7w0(iu30Var, (byte) 19);
                x340Var.s0(objT3);
            }
            Function0 function2 = (Function0) objT3;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function0, (i3u) null, (hux) null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(this, iu30Var, i, (byte) 20);
        }
    }

    public void l(ti81 ti81Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(837064935);
        int i2 = i | (x340Var.i(ti81Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            sv71.a(48, 0, apo.r(1536913513, new dk0(ti81Var, (int) jfv.h(cbx.c(x340Var).b.b), this, function0, function1), x340Var), x340Var, u291.f(nim0.a, 1.0f));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri81(this, ti81Var, function0, function1, i, (byte) 0);
        }
    }

    public void m(List list, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1207785525);
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            pf50 pf50Var = new pf50(2);
            zzq0 zzq0VarJ = uyn1.j(16.0f, 0.0f, 16.0f, 16.0f, 2);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            d36 d36Var2 = new d36(16.0f, true, new um5(false));
            qim0 qim0VarN = anm1.N("gallery_grid_view", nim0.a);
            boolean zI = ((i2 & 14) == 4) | x340Var.i(this) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new o0d((Object) list, (Object) this, (Object) iu30Var, (byte) 29);
                x340Var.s0(objT);
            }
            dko1.g(pf50Var, qim0VarN, (upb0) null, zzq0VarJ, d36Var2, d36Var, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 916);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(this, list, iu30Var, i, (byte) 23);
        }
    }

    public void n(c0y0 c0y0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String title;
        String str;
        boolean z;
        tob1 tob1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-548701826);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c0y0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = c0y0Var instanceof a0y0;
            lnm lnmVar = null;
            if (z2) {
                x340Var.i0(978526132);
                List listM = p7h.M(new String[]{cwl1.o0(x340Var, 2131960626), cwl1.o0(x340Var, 2131960627), cwl1.o0(x340Var, 2131960628)});
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = v8r.q(0);
                    x340Var.s0(objT);
                }
                tob1 tob1Var2 = (ven0) objT;
                boolean zI = x340Var.i(tob1Var2) | x340Var.g(listM);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    tob1Var = tob1Var2;
                    objT2 = new pew0(listM, tob1Var, false, lnmVar, (byte) 20);
                    x340Var.s0(objT2);
                } else {
                    tob1Var = tob1Var2;
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
                title = (String) listM.get(((Number) tob1Var.getValue()).intValue());
                x340Var.r(false);
            } else if (c0y0Var instanceof xzx0) {
                title = x0d.k(x340Var, 978527541, 2131960625, x340Var, false);
            } else {
                x340Var.i0(978529795);
                x340Var.r(false);
                title = c0y0Var.getTitle();
            }
            String str2 = title;
            if (str2 == null) {
                x340Var.i0(269705615);
                x340Var.r(false);
            } else {
                x340Var.i0(269705616);
                if (z2) {
                    str = ((a0y0) c0y0Var).c;
                } else {
                    str = c0y0Var instanceof yzx0 ? ((yzx0) c0y0Var).f : null;
                }
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z2) {
                    x340Var.i0(1947882875);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = xox0.V0;
                        x340Var.s0(objT3);
                    }
                    z = false;
                    hm5.a(str2, (qim0) null, (iu30) objT3, (tl3) null, "loadingTitleTransition", (iu30) null, apo.r(14679239, new wh(this, str, (byte) 29), x340Var), x340Var, 1597824, 42);
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(1948330453);
                    ((iuj) ((kly0) this.d).get()).a(new hvl1(str2, 182, (String) null, (String) null, false, str), x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0((Object) this, (Object) c0y0Var, (Object) qim0Var, i, (byte) 7);
        }
    }

    public void o(vy30 vy30Var, boolean z, int i, int i2, iu30 iu30Var, b0k b0kVar, int i3) {
        int i4;
        x340 x340Var;
        ven0 ven0Var;
        qim0 qim0Var;
        drr0 drr0Var;
        x340 x340Var2;
        float f;
        ni7 ni7Var;
        ven0 ven0Var2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(2028519353);
        if ((i3 & 6) == 0) {
            i4 = (x340Var3.g(vy30Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var3.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var3.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var3.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var3.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            String str = vy30Var.e;
            int i5 = vy30Var.c;
            int i6 = vy30Var.b;
            Object objT = x340Var3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = c97.b(0.0f);
                x340Var3.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == obj) {
                objT2 = c97.b(0.0f);
                x340Var3.s0(objT2);
            }
            o95 o95Var2 = (o95) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == obj) {
                objT3 = qxd0.M(o6x.a, x340Var3);
                x340Var3.s0(objT3);
            }
            c9n c9nVar = (c9n) objT3;
            kiv kivVar = t4k.h;
            wat watVar = (wat) x340Var3.k(kivVar);
            kiv kivVar2 = frm.a;
            int i7 = i4;
            float fX0 = watVar.X0(200.0f);
            float fX1 = ((wat) x340Var3.k(kivVar)).X0(100.0f);
            Object objT4 = x340Var3.T();
            if (objT4 == obj) {
                objT4 = us71.i(1.0f, x340Var3);
            }
            drr0 drr0Var2 = (drr0) objT4;
            Object objT5 = x340Var3.T();
            if (objT5 == obj) {
                objT5 = kaa0.h(0L, x340Var3);
            }
            ven0 ven0Var3 = (ven0) objT5;
            Object objT6 = x340Var3.T();
            if (objT6 == obj) {
                objT6 = p3d1.n(0L, x340Var3);
            }
            ven0 ven0Var4 = (ven0) objT6;
            boolean zG = x340Var3.g(str) | x340Var3.e(i6) | x340Var3.e(i5);
            Object objT7 = x340Var3.T();
            if (zG || objT7 == obj) {
                objT7 = Float.valueOf((i6 <= 0 || i5 <= 0) ? 0.0f : i6 / i5);
                x340Var3.s0(objT7);
            }
            float fFloatValue = ((Number) objT7).floatValue();
            ni7 ni7VarA = oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var3, 0, 0, 131070);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarD);
            cvx cvxVar2 = cbx.b(x340Var3).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean zI = x340Var3.i(ven0Var4);
            Object objT8 = x340Var3.T();
            if (zI || objT8 == obj) {
                objT8 = new f4g(ven0Var4, (byte) 28);
                x340Var3.s0(objT8);
            }
            qim0 qim0VarU = lrn1.u(qim0VarB, (iu30) objT8);
            int i8 = i7 & 57344;
            boolean zI2 = x340Var3.i(drr0Var2) | x340Var3.i(ven0Var3) | (i8 == 16384);
            Object objT9 = x340Var3.T();
            if (zI2 || objT9 == obj) {
                objT9 = new uqm(drr0Var2, ven0Var3, iu30Var);
                x340Var3.s0(objT9);
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB2 = f8d1.b(qim0VarU, rih1Var, (PointerInputEventHandler) objT9);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarB2);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            h6m h6mVar = mif1.Q0;
            jsl jslVar = new jsl(cwl1.n0(2131958395, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, x340Var3));
            qim0 qim0VarN = anm1.N("gallery_single_media_view", fFloatValue == 0.0f ? u291.d(nim0Var, 1.0f) : d7e.r(fFloatValue, nim0Var, false));
            boolean zI3 = x340Var3.i(o95Var);
            Object objT10 = x340Var3.T();
            if (zI3 || objT10 == obj) {
                objT10 = new wqe(o95Var, (byte) 4);
                x340Var3.s0(objT10);
            }
            qim0 qim0VarB3 = eqr0.B(nim0Var, (iu30) objT10);
            boolean zI4 = x340Var3.i(drr0Var2) | x340Var3.i(ven0Var3) | x340Var3.i(ni7VarA) | x340Var3.i(ven0Var4) | x340Var3.i(c9nVar) | x340Var3.i(o95Var2) | x340Var3.i(o95Var) | x340Var3.d(fX0) | ((i7 & 112) == 32) | (i8 == 16384) | x340Var3.d(fX1);
            Object objT11 = x340Var3.T();
            if (zI4 || objT11 == obj) {
                ven0Var = ven0Var4;
                qim0Var = qim0VarB3;
                drr0Var = drr0Var2;
                x340Var2 = x340Var3;
                f = 16.0f;
                ni7Var = ni7VarA;
                ven0Var2 = ven0Var3;
                zqm zqmVar = new zqm(drr0Var, ven0Var2, ni7Var, ven0Var, c9nVar, o95Var2, o95Var, fX0, z, iu30Var, fX1);
                x340Var2.s0(zqmVar);
                objT11 = zqmVar;
            } else {
                ven0Var = ven0Var4;
                qim0Var = qim0VarB3;
                ven0Var2 = ven0Var3;
                x340Var2 = x340Var3;
                drr0Var = drr0Var2;
                ni7Var = ni7VarA;
                f = 16.0f;
            }
            qim0 qim0VarB4 = f8d1.b(qim0Var, rih1Var, (PointerInputEventHandler) objT11);
            boolean zI5 = x340Var2.i(drr0Var) | x340Var2.i(ven0Var) | x340Var2.i(ni7Var) | x340Var2.i(ven0Var2);
            Object objT12 = x340Var2.T();
            if (zI5 || objT12 == obj) {
                ggh gghVar = new ggh(drr0Var, ven0Var, ni7Var, ven0Var2, (byte) 10);
                x340Var2.s0(gghVar);
                objT12 = gghVar;
            }
            qim0 qim0VarThen = qim0VarN.then(i541.C(qim0VarB4, (iu30) objT12));
            x340Var2.i0(-1847739885);
            pv71 pv71Var = (pv71) x340Var2.k(frm.a);
            pv71Var.getClass();
            qim0 qim0VarE2 = pv71.e(pv71Var, pv71.d(str, x340Var2), (cd5) x340Var2.k(frm.b));
            x340Var2.r(false);
            qim0 qim0VarThen2 = qim0VarThen.then(qim0VarE2);
            cua cuaVar = cbx.b(x340Var2).f;
            x340 x340Var4 = x340Var2;
            eso1.h(ni7Var, jslVar, i1p1.q(qim0VarThen2, er31.b(f)), (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, x340Var4, 224256, 384);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new arm(this, vy30Var, z, i, i2, iu30Var, i3, (byte) 0);
        }
    }

    public void p(yzx0 yzx0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2 = iu30Var;
        k0y0 k0y0Var = yzx0Var.c;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2139913558);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(yzx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(this) ? 256 : 128;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarD = o0c.d(u291.b(0.0f, 250.0f, 1, nim0Var), (ni20) null, 3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarD);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            ((n0v0) this.f).g(k0y0Var, b0kVar2, 0);
            b0kVar2.r(true);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 8.0f));
            String strEncodeToString = Base64.encodeToString(new Uri.Builder().path(k0y0Var.b).appendQueryParameter("userPrompt", k0y0Var.a).appendQueryParameter("title", k0y0Var.c).appendQueryParameter("contentDescription", k0y0Var.d).appendQueryParameter("itemsInResponse", o7h.y0(k0y0Var.e, ",", (String) null, (String) null, (iu30) null, 62)).build().toString().getBytes(nne.a), 2);
            mr10 mr10Var = (mr10) ((idd1) this.i).getValue();
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            x760.f(strEncodeToString, mr10Var, iu30Var2, uyn1.z(16.0f, 0.0f, 2, nim0Var), b0kVar2, (i3 << 3) & 896);
            iu30Var2 = iu30Var2;
            if (yzx0Var.d) {
                b0kVar2.i0(1109663057);
                k(iu30Var2, b0kVar2, (i3 >> 3) & 126);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1109721678);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0((Object) this, (Object) yzx0Var, (Object) iu30Var2, i, (byte) 8);
        }
    }

    public void q(ti81 ti81Var, qim0 qim0Var, qim0 qim0Var2, Function0 function0, li81 li81Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var3;
        int i3;
        int i4;
        li81 li81Var2;
        li81 li81Var3 = li81Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-273599495);
        int i5 = (x340Var.i(ti81Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            qim0Var3 = qim0Var2;
        } else {
            qim0Var3 = qim0Var2;
            i3 = i5 | (x340Var.i(qim0Var3) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
        } else {
            i4 = i3 | ((32768 & i) == 0 ? x340Var.g(li81Var3) : x340Var.i(li81Var3) ? 16384 : 8192);
        }
        if ((196608 & i) == 0) {
            i4 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            qim0 qim0Var4 = i6 != 0 ? nim0.a : qim0Var3;
            if (i7 != 0) {
                li81Var3 = null;
            }
            li81 li81Var4 = li81Var3;
            vvx.a(krz0.d1, apo.r(-1569308920, new ydi0(function0, li81Var4, cwl1.o0(x340Var, 2131962465), qim0Var, this, ti81Var, qim0Var4), x340Var), x340Var, 48);
            li81Var2 = li81Var4;
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            li81Var2 = li81Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(this, ti81Var, qim0Var, qim0Var3, function0, li81Var2, i, i2, (byte) 13);
        }
    }

    public void r(ti81 ti81Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1615254809);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(ti81Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = sgc1.D(1, u291.f(nim0Var, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (ti81Var.h == null || ti81Var.g == null) {
                x340Var.i0(1780526084);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                int i3 = i2 << 6;
                q(ti81Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, function0, null, x340Var, 8 | (i2 & 14) | (i3 & 7168) | (i3 & 458752), 20);
                x340Var.r(false);
            } else {
                x340Var.i0(1780658144);
                idn0 idn0VarY = zso1.Y(x340Var);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarC = u291.c(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarC);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0 qim0VarB = h2c.a.b(nim0Var);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = oa81.V0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarQ = d9y0.q(qim0VarB, (iu30) objT);
                boolean z2 = function1 != null;
                boolean z3 = (i2 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new pt61(function1, (byte) 14);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarV = bin.v(qim0VarQ, idn0VarY, (ga80) null, z2, (String) null, (pm31) null, (Function0) objT2, 24);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = oa81.W0;
                    x340Var.s0(objT3);
                }
                op71.g(x340Var, s161.a(qim0VarV, (iu30) objT3));
                int i4 = i2 << 6;
                int i5 = i4 & 458752;
                q(ti81Var, sgc1.H(2, nim0Var), null, function0, null, x340Var, 8 | (i2 & 14) | (i4 & 7168) | i5, 20);
                x340Var.r(true);
                f(ti81Var.e, function1, u291.c(nim0Var, 1.0f), null, idn0VarY, x340Var, ((i2 >> 3) & 112) | i5, 8);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri81(this, ti81Var, function0, function1, i, (byte) 1);
        }
    }

    public void s(Function0 function0, hek1 hek1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(987124858);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(hek1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            kyo1.c(cwl1.o0(x340Var, (hek1Var.a && ((i5y0) this.e).e()) ? 2131958047 : 2131958050), ulx.c, function0, (qim0) null, false, (String) null, (v2g) null, (vu30) null, x340Var, (ulx.d << 3) | ((i2 << 6) & 896), 248);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jek1(this, function0, hek1Var, i, (byte) 0);
        }
    }

    public void t(Function0 function0, hek1 hek1Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        oex oexVar;
        long j;
        long j2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1363206274);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(hek1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(this) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            List listB = uiz.b(hek1Var.c, (nfa0) this.g);
            if (listB.isEmpty()) {
                z = false;
            } else {
                List list = listB;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            n4y0 n4y0Var = (n4y0) it.next();
                            if (!(n4y0Var instanceof k4y0) && !(n4y0Var instanceof m4y0)) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            }
            if (z) {
                b0kVar3.i0(1932839962);
                Object objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = olj1.R0;
                    b0kVar3.s0(objT);
                }
                vu30 vu30Var = (vu30) objT;
                Object objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = olj1.S0;
                    b0kVar3.s0(objT2);
                }
                vu30 vu30Var2 = (vu30) objT2;
                Object objT3 = b0kVar3.T();
                if (objT3 == m4cVar) {
                    objT3 = olj1.T0;
                    b0kVar3.s0(objT3);
                }
                oexVar = new oex(0, vu30Var, vu30Var2, (vu30) objT3, 1);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1933045213);
                vu30 vu30Var3 = ((pgx) ogx.e).b;
                Object objT4 = b0kVar3.T();
                if (objT4 == m4cVar) {
                    objT4 = olj1.U0;
                    b0kVar3.s0(objT4);
                }
                oexVar = new oex(0, (vu30) null, vu30Var3, (vu30) objT4, 3);
                b0kVar3.r(false);
            }
            oex oexVar2 = oexVar;
            if (z) {
                b0kVar3.i0(-76183675);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).b.e;
            } else {
                b0kVar3.i0(-76182586);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(b0kVar3).b.d;
            }
            b0kVar3.r(false);
            if (z) {
                b0kVar3.i0(-76180123);
                j2 = cbx.a(b0kVar3).b.e;
            } else {
                b0kVar3.i0(-76179034);
                j2 = cbx.a(b0kVar3).b.d;
            }
            b0kVar3.r(false);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
            lex lexVarZ = yoo1.z(b0kVar3);
            boolean z2 = (i2 & 14) == 4;
            Object objT5 = b0kVar3.T();
            if (z2 || objT5 == m4cVar) {
                objT5 = new tpj1(function0, (byte) 9);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            poo1.e(new gbx(z50.c, (Function0) objT5), oexVar2, lexVarZ, (qim0) null, 0, (String) null, (max) null, apo.r(707431494, new dne1((byte) 3, j), b0kVar3), (vu30) null, (idn0) null, (ga80) null, false, zzq0Var, apo.r(1424468825, new qi6(hek1Var, this, j2, (byte) 19), b0kVar3), b0kVar2, 12582912, 3072, 3960);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jek1(this, function0, hek1Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void u(c0y0 c0y0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(530414634);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c0y0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(u291.j(184.0f, 0.0f, 2, qim0Var2), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var2);
            int i4 = (i3 >> 3) & 896;
            n(c0y0Var, qim0VarZ, x340Var, (i3 & 14) | i4);
            if (c0y0Var instanceof b0y0) {
                x340Var.i0(-547846412);
                v((b0y0) c0y0Var, iu30Var, null, x340Var, i3 & 7294);
                x340Var.r(false);
            } else if (c0y0Var instanceof a0y0) {
                x340Var.i0(-547844650);
                o6p1.c(0, 2, x340Var, qim0VarZ, false);
                x340Var.r(false);
            } else if (c0y0Var instanceof yzx0) {
                x340Var.i0(-547842863);
                p((yzx0) c0y0Var, iu30Var, x340Var, (i3 & 126) | i4);
                x340Var.r(false);
            } else {
                if (!(c0y0Var instanceof xzx0)) {
                    throw p3d1.k(x340Var, -547847307, false);
                }
                x340Var.i0(196804231);
                String str = ((xzx0) c0y0Var).c;
                boolean z = (i3 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new h7w0(iu30Var, (byte) 20);
                    x340Var.s0(objT);
                }
                xyn1.g(0, str, (Function0) objT, x340Var, qim0VarZ);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, c0y0Var, iu30Var, qim0Var2, i, (byte) 11);
        }
    }

    public void v(b0y0 b0y0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1908150867);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(b0y0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c380 c380VarA = mqo1.A(b0y0Var.d);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ppv0(iu30Var, (byte) 13);
                x340Var.s0(objT);
            }
            cso1.u(0, x340Var, (iu30) objT, c380VarA, (qim0) null);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = ywx0.k(qim0Var3, 16.0f, x340Var, x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            boolean z2 = i4 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new h7w0(iu30Var, (byte) 21);
                x340Var.s0(objT2);
            }
            xpn1.e(0, (Function0) objT2, x340Var, qim0VarZ);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, b0y0Var, iu30Var, qim0Var2, i, (byte) 12);
        }
    }

    public void w(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1591510871);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            vvx.a(krz0.e1, apo.r(-1263270234, new j2r0(j2iVar, (byte) 19), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, j2iVar, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void x(vy30 vy30Var, boolean z, int i, int i2, iu30 iu30Var, b0k b0kVar, int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1476169638);
        if ((i3 & 6) == 0) {
            i4 = (x340Var.g(vy30Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= x340Var.e(i5) ? 256 : 128;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i6 = i2;
            i4 |= x340Var.e(i6) ? 2048 : 1024;
        } else {
            i6 = i2;
        }
        if ((i3 & 24576) == 0) {
            iu30Var2 = iu30Var;
            i4 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            int iC = l1d.C(vy30Var.d);
            if (iC == 0) {
                x340Var.i0(-1259806720);
                o(vy30Var, z, i, i2, iu30Var, x340Var, i4 & 524286);
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1259808449, false);
                }
                x340Var.i0(-1259803030);
                b6p1.i(vy30Var, z, i5, i6, iu30Var2, (woa) this.g, (kma) this.h, (yqg) this.i, x340Var, i4 & 65534);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new arm(this, vy30Var, z, i, i2, iu30Var, i3, (byte) 1);
        }
    }

    public void y(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1742224077);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
            lex lexVarZ = yoo1.z(b0kVar3);
            vu30 vu30Var = ((pgx) ogx.e).b;
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = olj1.V0;
                b0kVar3.s0(objT);
            }
            vu30 vu30Var2 = (vu30) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = olj1.W0;
                b0kVar3.s0(objT2);
            }
            oex oexVar = new oex(0, vu30Var2, vu30Var, (vu30) objT2, 1);
            boolean z = (i2 & 14) == 4;
            Object objT3 = b0kVar3.T();
            if (z || objT3 == m4cVar) {
                objT3 = new tpj1(function0, (byte) 10);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            poo1.e(new gbx(z50.c, (Function0) objT3), oexVar, lexVarZ, (qim0) null, 0, (String) null, (max) null, irj.a, (vu30) null, (idn0) null, (ga80) null, false, zzq0Var, irj.b, b0kVar2, 12582912, 3072, 3960);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(this, function0, i, (byte) 19);
        }
    }

    public void z(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(957995993);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            kiv kivVar = wu.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            ViewGroup viewGroup = (ViewGroup) x340Var.k(AndroidCompositionLocals_androidKt.f);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            hcx hcxVar = z ? hcx.d : hcx.c;
            if (z) {
                x340Var.i0(1511164576);
                uwr uwrVar = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            } else {
                x340Var.i0(1511166209);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 8.0f;
            }
            mod.b(wu.a.a(hcxVar), apo.r(-352575335, new ys(this, viewGroup, xtb0VarA, f, iu30Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(this, z, iu30Var, i, (byte) 0);
        }
    }

    public pt(iyc0 iyc0Var, op31 op31Var, kt91 kt91Var, Context context) {
        this.a = (byte) 11;
        this.d = iyc0Var;
        this.e = op31Var;
        this.f = kt91Var;
        this.g = context;
        Boolean bool = Boolean.FALSE;
        this.h = v8r.q(bool);
        this.i = v8r.q(bool);
        this.t = k1o1.u(new r20((Object) this, (lnm) null, (byte) 24));
        this.b = n3o1.q(this).a(mx90.Z0, mx90.a1);
        j2i j2iVar = new j2i(-208645827, new pba0(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(lik1 lik1Var, f1n0 f1n0Var, gdx0 gdx0Var, e8i1 e8i1Var, joo jooVar, q8n q8nVar, i4q i4qVar) {
        this.a = (byte) 9;
        this.d = lik1Var;
        this.e = f1n0Var;
        this.f = gdx0Var;
        this.g = e8i1Var;
        this.h = jooVar;
        this.i = i4qVar;
        this.t = new k8d1(q8nVar, new cz40(this, (lnm) null));
        j2i j2iVar = new j2i(775968332, new zq30(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(d640.N0, d640.O0);
    }

    public pt(lo60 lo60Var, gw70 gw70Var, hj31 hj31Var, iac0 iac0Var, tym0 tym0Var, lk31 lk31Var, l0x0 l0x0Var) {
        this.a = (byte) 3;
        b3s b3sVar = b3s.c;
        this.d = lo60Var;
        this.e = gw70Var;
        this.f = tym0Var;
        this.g = lk31Var;
        this.h = l0x0Var;
        ayh ayhVarA = sap1.a();
        fn31.T(cto1.q(iac0Var), b3sVar, 0, new w5d(ayhVarA, hj31Var, (lnm) null, (byte) 0), 2);
        this.i = ayhVarA;
        this.t = new rey0(new gaa(this, (byte) 21));
        this.b = n3o1.q(this).a(h40.e, new hp9(this, (byte) 19));
        j2i j2iVar = new j2i(-354026115, new zk9(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(gkd gkdVar, toj0 toj0Var, gw70 gw70Var, woa woaVar, kma kmaVar, yu3 yu3Var) {
        this.a = (byte) 2;
        this.d = gkdVar;
        this.e = toj0Var;
        this.f = gw70Var;
        this.g = woaVar;
        this.h = kmaVar;
        this.i = yu3Var;
        this.t = h7w.B(fr9.N0, null, null, new hp9(this, (byte) 5), 6);
        this.b = new eih1();
        j2i j2iVar = new j2i(797827515, new zk9(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(e8k e8kVar, yqg yqgVar, q3c q3cVar, gw70 gw70Var) {
        this.a = (byte) 5;
        this.d = yqgVar;
        this.e = gw70Var;
        this.f = new idd1(new opg((Object) this, (byte) 1));
        this.g = sbl.B(new a9k("", null, null, false, z6x.a, 0, null, true, null, null, false, false, null, null, null), n4.B, e8kVar, b9k.a, new mwh(this, (byte) 14));
        this.b = n3o1.q(this).a(c9k.b, c9k.c);
        this.t = new d9k(this, (byte) 0);
        j2i j2iVar = new j2i(-1068247017, new rxg(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(oj10 oj10Var, Optional optional, i8p i8pVar, lzn0 lzn0Var, los losVar, i8h1 i8h1Var) {
        this.a = (byte) 8;
        this.d = oj10Var;
        this.e = optional;
        this.f = i8pVar;
        this.g = lzn0Var;
        this.h = losVar;
        this.i = i8h1Var;
        xc10 xc10Var = xc10.t;
        fns fnsVar = igu.a;
        this.t = h7w.D(xc10Var, pyf0.a.f, null, new j2i(-598362759, new sw1(this, (byte) 13), true), 4);
        this.b = n3o1.q(this).a(jq00.N0, new wx00(this, (byte) 4));
        j2i j2iVar = new j2i(-164205535, new yhy(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(gw70 gw70Var, woa woaVar, kma kmaVar, zhy zhyVar, zrg zrgVar, lc20 lc20Var, ekb ekbVar) {
        this.a = (byte) 4;
        this.d = gw70Var;
        this.e = woaVar;
        this.f = kmaVar;
        this.g = zhyVar;
        this.h = zrgVar;
        this.i = lc20Var;
        this.t = h7w.B(ovh.h, null, null, new zee(this, (byte) 20), 6);
        this.b = n3o1.q(this).a(a8h.h, a8h.i);
        j2i j2iVar = new j2i(-1867885505, new rxg(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(c9c0 c9c0Var, p410 p410Var, z1s z1sVar, g5p0 g5p0Var, lzn0 lzn0Var, q8n q8nVar) {
        this.a = (byte) 10;
        this.d = c9c0Var;
        this.e = p410Var;
        this.f = z1sVar;
        this.g = g5p0Var;
        this.h = lzn0Var;
        this.i = q8nVar;
        this.t = x3p1.n(new m5a0(this, (byte) 0), mr90.t, ul90.N0, (o8n) null, new m5a0(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(mx90.Y, mx90.Z);
        j2i j2iVar = dui.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(g341 g341Var, dg30 dg30Var, y1t0 y1t0Var, e241 e241Var, z710 z710Var, i9i1 i9i1Var) {
        this.a = (byte) 19;
        this.d = g341Var;
        this.e = dg30Var;
        this.f = y1t0Var;
        this.g = e241Var;
        this.h = z710Var;
        this.i = i9i1Var;
        this.t = x3p1.m(h4p1.g(new k6g1(this, (lnm) null, (byte) 16)), qmh1.c1, lbg1.Z0, (o8n) null, new ymg1(this, (byte) 15), 8);
        this.b = qro1.q(n3o1.q(this), rre1.Y, swg1.b1);
        j2i j2iVar = bpj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(lzn0 lzn0Var, js6 js6Var, i4q i4qVar, yhm yhmVar, em6 em6Var, ssf1 ssf1Var, l6m0 l6m0Var, zc80 zc80Var) {
        this.a = (byte) 14;
        this.d = lzn0Var;
        this.e = js6Var;
        this.f = i4qVar;
        this.g = yhmVar;
        this.h = em6Var;
        this.i = ssf1Var;
        this.t = l6m0Var;
        this.b = zc80Var;
        this.c = gio1.b(Boolean.FALSE);
    }

    public pt(yfr yfrVar, a0b a0bVar, a1r0 a1r0Var, los losVar, hz5 hz5Var, p40 p40Var, uu0 uu0Var) {
        this.a = (byte) 1;
        this.d = yfrVar;
        this.e = a1r0Var;
        this.f = losVar;
        this.g = hz5Var;
        this.h = p40Var;
        this.i = uu0Var;
        this.t = new rey0(new ub3(this, (byte) 7));
        this.b = n3o1.q(this).a(oy5.d, new v72(this, (byte) 15));
        j2i j2iVar = new j2i(808646927, new i43(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(lzn0 lzn0Var, String str, kt91 kt91Var, xvo xvoVar, zwz0 zwz0Var, bf4 bf4Var) {
        this.a = (byte) 16;
        this.d = lzn0Var;
        this.e = str;
        this.f = kt91Var;
        this.g = xvoVar;
        this.h = zwz0Var;
        this.i = bf4Var;
        this.t = x3p1.n(new fa11(this, (byte) 0), a411.O0, h211.d, (o8n) null, new fa11(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1946237361, new dr01(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(rw01.Z, new g001(this, (byte) 16));
    }

    public pt(xsh0 xsh0Var, k3i0 k3i0Var, r3d r3dVar, ysh0 ysh0Var, q8n q8nVar) {
        this.a = (byte) 12;
        this.d = xsh0Var;
        this.e = k3i0Var;
        this.f = r3dVar;
        this.g = ysh0Var;
        this.h = q8nVar;
        z6h0 z6h0Var = new z6h0(this, (byte) 7);
        xxb0 xxb0Var = xxb0.s;
        bzg0 bzg0Var = bzg0.e1;
        w6m0 w6m0Var = new w6m0(xxb0Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = ish0.b;
        casVar.a(zdh0.S0, zdh0.T0);
        this.t = new e7m0(z6h0Var, w6m0Var, xsh0Var, bzg0Var, casVar);
        this.b = n3o1.q(this).a(new pah0(this, (byte) 3), ytg0.Y);
        j2i j2iVar = new j2i(-619859588, new qcd0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(hcq hcqVar, icq icqVar, op0 op0Var, gdj1 gdj1Var, g9c0 g9c0Var, lbj1 lbj1Var, av0 av0Var, fv0 fv0Var) {
        this.a = (byte) 20;
        this.d = op0Var;
        this.e = gdj1Var;
        this.f = g9c0Var;
        this.g = lbj1Var;
        this.h = av0Var;
        this.i = fv0Var;
        xaj1 xaj1Var = new xaj1(this, (byte) 1);
        wam0 wam0Var = new wam0((byte) 25);
        String str = lbj1Var.a;
        kbj1 kbj1Var = lbj1Var.c;
        vu30 vu30Var = kbj1Var.a;
        vu30 vu30Var2 = kbj1Var.b;
        r7q r7qVar = hcqVar.a;
        daq daqVar = r7qVar.b;
        q8n q8nVar = (q8n) daqVar.r2.get();
        q8n q8nVar2 = (q8n) daqVar.V2.get();
        teq teqVar = r7qVar.d;
        this.t = sbl.C(xaj1Var, wam0Var, new naj1(str, vu30Var, vu30Var2, gdj1Var, q8nVar, q8nVar2, teqVar.b(), (pxc) teqVar.t7.get(), (ao0) daqVar.Hk.get()), new muh1((Object) this, (byte) 15), new rzf1(icqVar, this, (byte) 22));
        this.b = n3o1.q(this).a(k3j1.f, k3j1.g);
        j2i j2iVar = new j2i(1428851013, new l6i1(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(jq jqVar, g5t g5tVar, Observable observable, uzl0 uzl0Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4) {
        this.a = (byte) 0;
        this.d = g5tVar;
        this.e = uzl0Var;
        this.f = ynb0Var;
        this.g = ynb0Var2;
        this.h = ynb0Var3;
        this.i = ynb0Var4;
        this.t = x3p1.n(new et(this, (byte) 0), new tsm1(this, (byte) 16), e3.i, (o8n) null, ft.c, 8);
        this.b = n3o1.q(this).a(new kt(this, (byte) 0), n1.t);
        j2i j2iVar = new j2i(2004361758, new r1(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(ayl0 ayl0Var, gmt gmtVar, bnj0 bnj0Var, wh71 wh71Var, Context context, drj0 drj0Var, ulc ulcVar) {
        this.a = (byte) 13;
        this.d = ayl0Var;
        this.e = gmtVar;
        this.f = bnj0Var;
        this.g = wh71Var;
        this.h = context;
        this.i = drj0Var;
        this.t = h7w.B(pzo0.e1, null, null, new lmp0(this, (byte) 0), 6);
        this.b = n3o1.r(this).c(new lmp0(this, (byte) 1), n3o0.d1);
        j2i j2iVar = new j2i(-1228189730, new aso0(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(kly0 kly0Var, tzr0 tzr0Var, n0v0 n0v0Var, bsn bsnVar, lwp lwpVar) {
        this.a = (byte) 15;
        this.d = kly0Var;
        this.e = tzr0Var;
        this.f = n0v0Var;
        this.g = bsnVar;
        this.h = lwpVar;
        this.i = new idd1(new z6v0(this, (byte) 29));
        this.t = h7w.D(fft0.X, null, xox0.X0, new j2i(1228297345, new sw1(this, (byte) 29), true), 2);
        this.b = n3o1.q(this).a(bnx0.d, cnx0.O0);
        j2i j2iVar = new j2i(-1641257111, new qsu0(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(String str, i5y0 i5y0Var, xq81 xq81Var, nfa0 nfa0Var, t2 t2Var, x1i1 x1i1Var) {
        this.a = (byte) 21;
        this.d = str;
        this.e = i5y0Var;
        this.f = xq81Var;
        this.g = nfa0Var;
        this.h = t2Var;
        this.i = x1i1Var;
        this.t = x3p1.n(new lek1(this, (byte) 0), eak1.Y, olj1.X0, (o8n) null, new lek1(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(cxj1.Z, new zbb1(this, (byte) 16));
        j2i j2iVar = new j2i(1119129874, new l6i1(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(rqm rqmVar, res resVar, ng20 ng20Var, bqk0 bqk0Var, woa woaVar, kma kmaVar, yqg yqgVar) {
        this.a = (byte) 6;
        this.d = resVar;
        this.e = ng20Var;
        this.f = bqk0Var;
        this.g = woaVar;
        this.h = kmaVar;
        this.i = yqgVar;
        crm crmVar = crm.b;
        t2m t2mVar = t2m.d;
        u2m u2mVar = u2m.Q0;
        w6m0 w6m0Var = new w6m0(t2mVar, (byte) 0);
        cas casVar = new cas();
        casVar.a(crm.c, crm.d);
        this.t = new e7m0(crmVar, w6m0Var, rqmVar, u2mVar, casVar);
        this.b = new u7h1(new h1m(this, (byte) 11), new mgl(this, (byte) 8));
        j2i j2iVar = new j2i(-673485366, new bfm(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(lzn0 lzn0Var, v5n v5nVar, uzl0 uzl0Var, Observable observable, gu guVar) {
        this.a = (byte) 17;
        this.d = lzn0Var;
        this.f = v5nVar;
        this.e = uzl0Var;
        this.g = observable;
        this.h = guVar;
        this.i = new LinkedHashMap();
        this.t = h7w.D(new ui81(this, (byte) 0), null, new ui81(this, (byte) 1), new j2i(1993382738, new wcy0(this, (byte) 10), true), 2);
        this.b = n3o1.r(this).c(new cq61(this, (byte) 13), c781.P0);
        j2i j2iVar = new j2i(-2139207622, new c771(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pt(ft30 ft30Var, evm1 evm1Var, n4b n4bVar, na naVar, lls0 lls0Var, oi oiVar) {
        this.a = (byte) 7;
        this.d = ft30Var;
        this.e = evm1Var;
        this.f = n4bVar;
        this.g = naVar;
        this.h = lls0Var;
        this.i = oiVar;
        this.t = x3p1.n(new cxr(this, (byte) 0), nvr.P0, new i4o(this, (byte) 15), (o8n) null, new cxr(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(zho.d1, zho.e1);
        j2i j2iVar = new j2i(1399585847, new i6r(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
