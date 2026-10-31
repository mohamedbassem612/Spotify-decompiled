package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.First;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.widgets.widgetstate.WidgetState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class utt extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utt(d3u d3uVar, hnn0 hnn0Var) {
        super(2);
        this.a = (byte) 1;
        this.b = hnn0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:267:0x0784  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        Parcelable m231Var;
        String strK;
        Set set;
        Object obj4;
        c9n c9nVar;
        nim0 nim0Var;
        Object obj5;
        byte b = this.a;
        Parcelable parcelableX0 = null;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                vtt vttVar = (vtt) obj6;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var2;
                }
                iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
                stt sttVar = vttVar.e;
                ytt yttVar = vttVar.c;
                ven0 ven0VarG = rwq.g(yoi1.g(sttVar.a), Boolean.FALSE, (o8n) null, x340Var2, 48, 2);
                Object[] objArr = new Object[0];
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    obj3 = objT;
                    u6t u6tVar = u6t.X;
                    x340Var2.s0(u6tVar);
                    obj3 = u6tVar;
                }
                obj3 = objT;
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) obj3, x340Var2, 48);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    vttVar.f.a.g();
                }
                if (yttVar.b && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ox90.b(vttVar.h, yttVar.a);
                    ven0Var.setValue(Boolean.TRUE);
                }
                boolean zI = x340Var2.i(vttVar) | x340Var2.i(iac0Var);
                Object objT2 = x340Var2.T();
                Object obj7 = objT2;
                if (zI || objT2 == m4cVar) {
                    wrs wrsVar = new wrs(iac0Var, vttVar, (byte) 12);
                    x340Var2.s0(wrsVar);
                    obj7 = wrsVar;
                }
                qxd0.i(iac0Var, (iu30) obj7, x340Var2);
                otw.c(vttVar.b, rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                vttVar.j.getClass();
                x340Var2.i0(1330502650);
                x340Var2.r(false);
                return rih1Var2;
            case 1:
                x340 x340Var3 = (b0k) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    x340 x340Var4 = x340Var3;
                    if (x340Var4.H()) {
                        x340Var4.b0();
                    } else {
                        iji.a.invoke((hnn0) obj6, x340Var3, 0);
                    }
                } else {
                    iji.a.invoke((hnn0) obj6, x340Var3, 0);
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                cwl1.a((e3u) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ziu ziuVar = (ziu) obj2;
                ((fiu) obj6).f.getClass();
                diu diuVar = ziuVar.f;
                List list = diuVar.e;
                fq0 fq0Var = diuVar.a;
                String strR = ila0.r(list);
                xj61 xj61Var = new xj61();
                if (list.isEmpty()) {
                    xj61Var.add(new usk(fq0Var));
                } else if (strR == null || strR.length() == 0) {
                    xj61Var.add(new uj21(fq0Var));
                } else {
                    xj61Var.add(new ate0(fq0Var, "render_started", diuVar.g));
                }
                xj61Var.add(new kc80(fq0Var));
                return First.c(ziuVar, cwl1.j(xj61Var));
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hqq0.g(((sru) obj6).a, null, x340Var6, 0, 2);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                azu azuVar = (azu) obj6;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    maa maaVar = (maa) azuVar.c.get();
                    czu czuVar = azuVar.a;
                    otw.c(maaVar, new zyu(czuVar.a, czuVar.b), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                qxy0.j((o0v) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                o2v o2vVar = (o2v) obj6;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    maa maaVar2 = (maa) o2vVar.c.get();
                    q2v q2vVar = o2vVar.b;
                    String str = q2vVar.a;
                    String str2 = q2vVar.b;
                    String str3 = q2vVar.c;
                    if (str3 != null) {
                        try {
                            m231Var = n2v.valueOf(str3);
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        parcelableX0 = (n2v) (m231Var instanceof m231 ? null : m231Var);
                    }
                    otw.c(maaVar2, new l2v(str, str2, parcelableX0), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                    break;
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                return new jpg0(((ajq0) ((x6e) obj6).b).l(new epb1((zob1) obj), nzu.b1, (nu11) null), nzu.c1);
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwo1.e(((z9v) obj6).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2046);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                ((bbc) obj6).l(new jcv((tv80) obj2));
                return rih1Var;
            case 11:
                x340 x340Var13 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                tdv tdvVar = (tdv) obj6;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g431 g431VarH = ((cir0) x340Var14.k(k2r0.a)).h();
                    boolean zG = x340Var14.g(g431VarH);
                    Object objT3 = x340Var14.T();
                    if (zG || objT3 == fkj0.X) {
                        e93 e93Var = (e93) tdvVar.b.a.c;
                        xdv xdvVar = new xdv(g431VarH, (vdv) e93Var.b, (ydv) ((jly0) e93Var.t).get(), (zcv) ((jly0) e93Var.R0).get(), (xbp) ((jly0) e93Var.T0).get());
                        x340Var14.s0(xdvVar);
                        objT3 = xdvVar;
                    }
                    xdv xdvVar2 = (xdv) objT3;
                    int iOrdinal = tdvVar.c.a.ordinal();
                    if (iOrdinal == 0) {
                        strK = x0d.k(x340Var14, 229152228, 2131955143, x340Var14, false);
                    } else if (iOrdinal == 1) {
                        strK = x0d.k(x340Var14, 229155815, 2131955142, x340Var14, false);
                    } else {
                        if (iOrdinal != 2) {
                            throw p3d1.k(x340Var14, 229150516, false);
                        }
                        strK = x0d.k(x340Var14, 229159529, 2131955141, x340Var14, false);
                    }
                    nyx.a(2, (wux) null, apo.r(-1064869804, new o1t(xdvVar2, strK, (byte) 13), x340Var14), x340Var14, 3078, 6);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var15 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str4 = ((aev) obj6).a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str4, (qim0) null, cbx.d(x340Var16).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2042);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 13:
                sx50 sx50Var = (ux50) obj2;
                ptj ptjVar = (ptj) ((dx0) obj6).d;
                if (sx50Var instanceof rx50) {
                    return new bgv((String) ptjVar.invoke(sx50Var));
                }
                if (sx50Var instanceof tx50) {
                    return new dgv((String) ptjVar.invoke(sx50Var));
                }
                if (!(sx50Var instanceof sx50)) {
                    eg.o();
                    return null;
                }
                sx50 sx50Var2 = sx50Var;
                long j = sx50Var2.b;
                return new cgv(j != 0 ? (int) ((sx50Var2.a / j) * 100.0f) : 0, (String) ptjVar.invoke(sx50Var));
            case 14:
                x340 x340Var17 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j2i j2iVar = nki.a;
                    mod.b(s4k.a.a(x340Var18.k(r4k.a)), apo.r(829527101, new eiv((WidgetState) obj6), x340Var18), x340Var18, 56);
                    x340Var18.i0(264663813);
                    x340Var18.r(false);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 15:
                ito itoVar = (ito) obj;
                yvg1 yvg1Var = (yvg1) obj2;
                g23 g23Var = (g23) ((teb) obj6).h;
                if (g23Var != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) g23Var.d;
                    BehaviorSubject behaviorSubjectF = (BehaviorSubject) linkedHashMap.get(itoVar);
                    if (behaviorSubjectF == null) {
                        behaviorSubjectF = BehaviorSubject.f();
                        linkedHashMap.put(itoVar, behaviorSubjectF);
                    }
                    behaviorSubjectF.onNext(yvg1Var);
                }
                return rih1Var;
            case 16:
                otu otuVar = (otu) ((tkv) obj6).b;
                return new jpg0(f6o1.A(new qj0((ja8) otuVar.b, (her) otuVar.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jkv.N0);
            case 17:
                ((Number) obj2).intValue();
                ((ynv) obj6).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var19 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tov tovVar = (tov) obj6;
                    res resVar = tovVar.c;
                    bpv bpvVar = tovVar.a;
                    String str5 = bpvVar.a;
                    String str6 = bpvVar.c;
                    if (str6 == null) {
                        str6 = "";
                    }
                    otw.c(resVar, new zov(str5, str6), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var21 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    otw.c((uej0) obj6, new sej0(2), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((qvv) obj6).e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                e8e0 e8e0Var = (e8e0) obj;
                Bundle bundle = (Bundle) obj2;
                gyv gyvVar = ((iyv) obj6).b;
                List list2 = e8e0Var.a;
                List list3 = e8e0Var.b;
                fyv fyvVar = bundle != null ? (fyv) jhc1.t(bundle, "restorable_state", fyv.class) : null;
                if (fyvVar != null) {
                    s061 s061Var = gyvVar.a;
                    Set set2 = fyvVar.a;
                    bpb1 bpb1Var = s061Var.a;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, set2);
                }
                if (fyvVar == null || (set = fyvVar.a) == null) {
                    set = w7x.a;
                }
                return new eyv(set, list2.isEmpty(), list3.isEmpty(), true);
            case 22:
                n3w n3wVar = ((k2w) obj6).d;
                return new m3w((String) obj, n3wVar.b, bmb1.a, ke81.a, n3wVar.c);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                nyn1.x((d7w) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var23 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ni00 ni00Var = (ni00) obj6;
                    ryn1.d(0, ni00Var.a, ni00Var.d, x340Var24, (qim0) null);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                s7w s7wVar = (s7w) obj6;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    Object objT4 = x340Var26.T();
                    if (objT4 == m4cVar2) {
                        obj4 = objT4;
                        c9n c9nVarM = qxd0.M(o6x.a, x340Var26);
                        x340Var26.s0(c9nVarM);
                        obj4 = c9nVarM;
                    }
                    obj4 = objT4;
                    c9n c9nVar2 = (c9n) obj4;
                    Object objT5 = x340Var26.T();
                    Object obj8 = objT5;
                    if (objT5 == m4cVar2) {
                        mr20 mr20VarA = s7wVar.d.a(s7wVar.a.b);
                        x340Var26.s0(mr20VarA);
                        obj8 = mr20VarA;
                    }
                    ven0 ven0VarG2 = rwq.g((mr20) obj8, new n6w(z6x.a), (o8n) null, x340Var26, 0, 2);
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var26, 0);
                    int iHashCode = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM = x340Var26.m();
                    qim0 qim0VarE = zr7.E(x340Var26, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var26.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(hmb0.t1);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(mbhVarA, x340Var26, y580.O0);
                    nko1.H(xos0VarM, x340Var26, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var26, y580.R0);
                    nko1.F(x340Var26);
                    nko1.H(qim0VarE, x340Var26, y580.Y);
                    String strO0 = cwl1.o0(x340Var26, 2131955410);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var26).h;
                    cvx cvxVar = cbx.b(x340Var26).b;
                    cvx cvxVar2 = cbx.b(x340Var26).b;
                    uwo1.e(strO0, uyn1.y(nim0Var2, 16.0f, 8.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2040);
                    x340Var26.i0(1515999378);
                    int i = 0;
                    for (Object obj9 : ((n6w) ven0VarG2.getValue()).a) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        bxn bxnVar = (bxn) obj9;
                        boolean zI2 = x340Var26.i(s7wVar) | x340Var26.e(i) | x340Var26.i(bxnVar) | x340Var26.i(c9nVar2);
                        Object objT6 = x340Var26.T();
                        if (zI2 || objT6 == m4cVar2) {
                            c9nVar = c9nVar2;
                            nim0Var = nim0Var2;
                            ka0 ka0Var = new ka0(s7wVar, i, bxnVar, c9nVar, (byte) 4);
                            x340Var26.s0(ka0Var);
                            objT6 = ka0Var;
                        } else {
                            c9nVar = c9nVar2;
                            nim0Var = nim0Var2;
                        }
                        uyn1.b(bxnVar, (Function0) objT6, x340Var26, 0);
                        nim0Var2 = nim0Var;
                        c9nVar2 = c9nVar;
                        i = i2;
                    }
                    x340Var26.r(false);
                    uwr uwrVar3 = cbx.a;
                    ywx0.n(nim0Var2, cbx.b(x340Var26).b.b, x340Var26, true);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var27 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    bzn1.e((qim0) null, (vu30) null, false, (vu30) null, new qgr0(((vex) zex.a.e).c), (ngr0) null, ezn1.n((es41) obj6, new tr80(0, 1, 1), x340Var28, 24576), (Function0) null, x340Var28, 2097152, 175);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var29 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    w8w w8wVar = (w8w) obj6;
                    Function0 function0 = w8wVar.b2;
                    h85 h85Var = w8wVar.a2;
                    if (h85Var == null) {
                        u890.C("properties");
                        throw null;
                    }
                    iy71.a(0, function0, x340Var30, (qim0) null, h85Var.a());
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 28:
                rm70 rm70Var = (rm70) obj;
                List list4 = (List) obj2;
                RecyclerView recyclerView = (RecyclerView) obj6;
                a layoutManager = recyclerView.getLayoutManager();
                parcelableX0 = layoutManager != null ? layoutManager.x0() : null;
                rm70Var.C(list4);
                a layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.w0(parcelableX0);
                }
                return rih1Var;
            default:
                x340 x340Var31 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    Object objT7 = x340Var32.T();
                    if (objT7 == fkj0.X) {
                        obj5 = objT7;
                        hrr0 hrr0VarQ = v8r.q(Boolean.TRUE);
                        x340Var32.s0(hrr0VarQ);
                        obj5 = hrr0VarQ;
                    }
                    obj5 = objT7;
                    ven0 ven0Var2 = (ven0) obj5;
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        x340Var32.i0(-1777263422);
                        nyx.a(2, (wux) null, apo.r(529613838, new o1t(ven0Var2, (mxw) obj6, (byte) 29), x340Var32), x340Var32, 3078, 6);
                        x340Var32.r(false);
                    } else {
                        x340Var32.i0(-1776156350);
                        x340Var32.r(false);
                    }
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utt(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utt(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
