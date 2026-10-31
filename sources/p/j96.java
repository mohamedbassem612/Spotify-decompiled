package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j96 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(etu etuVar, List list, List list2, iir iirVar, ven0 ven0Var, tvr tvrVar) {
        super(1);
        this.a = (byte) 9;
        this.b = etuVar;
        this.d = list;
        this.e = list2;
        this.f = iirVar;
        this.c = ven0Var;
        this.g = tvrVar;
    }

    private final Object a(Object obj) {
        mey0 mey0Var = (mey0) obj;
        gii0 gii0Var = (gii0) this.b;
        p1e0 p1e0Var = new p1e0(d3p1.F(gii0Var.c, gii0Var.X, mey0Var), (byte) 14);
        b8d0 b8d0Var = new b8d0(p1e0Var, mey0Var, (byte) 29);
        return h5p1.q(p1e0Var, ((nwt) this.c).a(), ((clm) this.d).a, gii0Var.e.a(), new vd0((byte) 21, (uvy) this.e, mey0Var.c, rqt0.u(b8d0Var)), new mci0((ohi0) this.f, (yy4) this.g, (lnm) null, (byte) 2));
    }

    private final Object d(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        jd21 jd21Var = (jd21) this.b;
        List list = jd21Var.a;
        List list2 = jd21Var.b;
        Set set = ((bin0) this.c).c;
        d0r d0rVar = (d0r) this.d;
        poj0 poj0Var = (poj0) this.e;
        iu30 iu30Var = (iu30) this.f;
        if (!list.isEmpty()) {
            rtb0Var.d("pending-requests-heading", "section_heading", d3j.c);
            rtb0Var.e(list.size(), new ehf0(list, (byte) 28), new ehf0(list, (byte) 29), new j2i(802480018, new a87(list, set, d0rVar, poj0Var, iu30Var, (byte) 5), true));
        }
        if (!list.isEmpty() && !list2.isEmpty()) {
            rtb0Var.d("requests-section-divider", "section_divider", d3j.a);
        }
        eyr0 eyr0Var = (eyr0) this.g;
        if (!list2.isEmpty()) {
            rtb0Var.d("approved-requests-heading", "section_heading", d3j.b);
            rtb0Var.e(list2.size(), new ehf0(list2, (byte) 26), new ehf0(list2, (byte) 27), new j2i(802480018, new ot(list2, eyr0Var, (byte) 14), true));
        }
        return rih1.a;
    }

    private final Object e(Object obj) {
        int i = ((irq0) this.b).a;
        String str = ((c8e1) obj).a.b;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strC1 = ihc1.c1(i, sb.toString());
        boolean zEquals = strC1.equals((String) this.d);
        ven0 ven0Var = (ven0) this.c;
        if (zEquals) {
            int length2 = strC1.length();
            ven0Var.setValue(new c8e1(e6p1.e(length2, length2), 4, strC1));
        } else {
            int length3 = strC1.length();
            ven0Var.setValue(new c8e1(e6p1.e(length3, length3), 4, strC1));
            ((iu30) this.e).invoke(strC1);
            boolean z = strC1.length() == i;
            ((iu30) this.f).invoke(Boolean.valueOf(z));
            if (z) {
                ((Function0) this.g).invoke();
            }
        }
        return rih1.a;
    }

    public final Object invoke(Object obj) {
        iu30 qi1Var;
        ult0 vlt0Var;
        char c;
        char c2;
        String strM;
        WebView webView;
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                yk41 yk41Var = (xpx0) obj;
                ven0 ven0Var = (ven0) obj2;
                ven0 ven0Var2 = (ven0) obj3;
                ven0 ven0Var3 = (ven0) obj6;
                if (yk41Var instanceof yk41) {
                    ((iu30) ven0Var3.getValue()).invoke(new i86(yk41Var.a));
                } else if (yk41Var instanceof kg40) {
                    ((iu30) ven0Var3.getValue()).invoke(new q76(((kg40) yk41Var).a));
                } else if (yk41Var instanceof kow0) {
                    ((iu30) ven0Var3.getValue()).invoke(new w76(((kow0) yk41Var).a));
                } else if (yk41Var instanceof lak1) {
                    iu30 iu30Var = (iu30) ven0Var3.getValue();
                    List list = ((lak1) yk41Var).a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : list) {
                        if (obj8 instanceof n46) {
                            arrayList.add(obj8);
                        }
                    }
                    iu30Var.invoke(new j86(arrayList));
                } else if (yk41Var instanceof jpk1) {
                    ((iu30) ven0Var3.getValue()).invoke(l86.a);
                } else if (yk41Var instanceof bl7) {
                    ((iu30) ven0Var3.getValue()).invoke(new e76(((bl7) yk41Var).a));
                } else if (yk41Var instanceof nfl) {
                    ((iu30) ven0Var3.getValue()).invoke(new c86(((nfl) yk41Var).a));
                } else if (yk41Var instanceof qne0) {
                    ((iu30) ven0Var3.getValue()).invoke(new t76(((qne0) yk41Var).a));
                } else if (yk41Var instanceof ka81) {
                    fn31.T((c9n) ((ven0) obj4).getValue(), (o8n) null, 0, new hi2(yk41Var, (ven0) obj7, (lnm) null, (byte) 29), 3);
                } else if (yk41Var instanceof iik1) {
                    ((iu30) ven0Var3.getValue()).invoke(new j86(Collections.singletonList(new l46(((iik1) yk41Var).a))));
                } else if (yk41Var instanceof ivc1) {
                    ven0Var2.setValue((((l96) obj5).g.h() || ihc1.y0((String) ven0Var2.getValue())) ? ((ivc1) yk41Var).a : xcg1.i((String) ven0Var2.getValue(), "\n", ((ivc1) yk41Var).a));
                    ven0Var.setValue(Boolean.TRUE);
                } else if (yk41Var instanceof hwc1) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                Matrix matrix = (Matrix) obj7;
                xd6 xd6Var = (xd6) obj4;
                float f = -((float) Math.sin(Math.toRadians(((Number) ((Function0) obj5).invoke()).floatValue())));
                b4g1 b4g1Var = (b4g1) obj6;
                float fS = 0.0f;
                float fS2 = ((b4g1Var == null || !b4g1Var.a()) ? xd6Var != null ? xd6Var.c.s() : 0.0f : b4g1Var.e.s()) + f;
                if (b4g1Var != null && b4g1Var.a()) {
                    fS = b4g1Var.f.s();
                } else if (xd6Var != null) {
                    fS = xd6Var.d.s();
                }
                matrix.setTranslate(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * (-yoi1.o(fS2 * 1.5f, -1.0f, 1.0f)) * 0.5f, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * yoi1.o(fS * 1.5f, -1.0f, 1.0f) * 0.5f);
                ((LinearGradient) obj3).setLocalMatrix(matrix);
                u84 u84VarP = drawScope.a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawRect(0.0f, 0.0f, Float.intBitsToFloat((int) (drawScope.j() >> 32)), Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)), (Paint) obj2);
                return rih1Var;
            case 2:
                fta ftaVar = (fta) obj5;
                dp5 dp5Var = (dp5) ftaVar.c;
                dg30 dg30Var = (dg30) ftaVar.b;
                String str = (String) obj6;
                String string = dg30Var.getString(2131952762, str);
                String string2 = dg30Var.getString(2131952759, str);
                String string3 = dg30Var.getString(2131952758);
                String string4 = dg30Var.getString(2131952761);
                dy7 dy7Var = new dy7(ftaVar, (String) obj4, (String) obj7, (syf) obj3, (String) obj6, (ahh) obj2, (byte) 1);
                cu9 cu9Var = cu9.Y;
                mw40 mw40VarT = yoi1.T((dg30) dp5Var.b, string, string2);
                wzk wzkVar = new wzk(dy7Var, (byte) 0);
                mw40VarT.a = string3;
                mw40VarT.c = wzkVar;
                wzk wzkVar2 = new wzk(cu9Var, (byte) 1);
                mw40VarT.b = string4;
                mw40VarT.d = wzkVar2;
                mw40VarT.b().b();
                return rih1Var;
            case 3:
                dnc0 dnc0Var = (dnc0) obj;
                kpc kpcVar = (kpc) obj5;
                hpc hpcVar = new hpc(kpcVar, (byte) 1);
                new v721(kpcVar.a, (wrw) obj6, new hpc(kpcVar, (byte) 2), (byte) 13).invoke(dnc0Var);
                zu11 zu11Var = (av11) obj4;
                w2c1 w2c1Var = kpcVar.b;
                iu30 iu30Var2 = (iu30) obj7;
                toc tocVar = (toc) obj3;
                boolean z = kpcVar.i;
                it8 it8Var = (it8) obj2;
                lzn0 lzn0Var = kpcVar.g;
                boolean z2 = it8Var != null;
                mmr0 mmr0VarV = w2c1Var.V(pb31.class);
                m441 m441Var = new m441(new du2(h4p1.f(new lqv(kpcVar.c.getLifecycle(), w8c0.d, t5p1.i(wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b)), (lnm) null, (byte) 10)), (lnm) null, z2, kpcVar));
                if (zu11Var instanceof zu11) {
                    os11 os11Var = new os11();
                    zu11Var.a.invoke(os11Var);
                    qi1Var = new axm0(m441Var, iu30Var2, os11Var.a(), kpcVar.j, kpcVar.e, w2c1Var, tocVar, z, it8Var, hpcVar, lzn0Var);
                } else {
                    if (!(zu11Var instanceof yu11)) {
                        eg.o();
                        return null;
                    }
                    qi1Var = new qi1(m441Var, iu30Var2, ((yu11) zu11Var).a, kpcVar.k, tocVar, it8Var, hpcVar, lzn0Var);
                }
                qi1Var.invoke(dnc0Var);
                return rih1Var;
            case 4:
                cfd cfdVar = (cfd) obj5;
                fn31.T(cto1.q((dg30) cfdVar.b), (o8n) null, 0, new zn0((bke) obj6, (uie) obj4, (ela) obj7, (iu30) obj3, (iu30) obj2, cfdVar, (lnm) null, (byte) 4), 3);
                return rih1Var;
            case 5:
                List list2 = ((gpk) obj5).b;
                ((epb0) obj).R(list2.size(), (iu30) null, new x94(list2, (byte) 1), new kwd(list2, (byte) 26), new j2i(-1117249557, new cbf(list2, (tyq) obj6, (g1i) obj4, (tyq) obj7, (ovi1) obj3, (z8x) obj2, (byte) 1), true));
                return rih1Var;
            case 6:
                cir0 cir0Var = (cir0) obj;
                ((iu30) obj4).invoke(cir0Var.d().p().a("CWP_TEMPLATE"));
                cir0Var.d().p().c("CWP_TEMPLATE", new uk((Function0) obj6, (byte) 3));
                return new twn((xu30) obj7, (rzq) obj2, (h72) obj5, cir0Var, (vu30) obj3, (byte) 0);
            case 7:
                jh5 jh5Var = (jh5) obj;
                nen0 nen0Var = (nen0) obj5;
                if (!nen0Var.b(jh5Var) && ((oen0) obj6).a(jh5Var)) {
                    ((l811) obj4).a = true;
                    k3r k3rVar = (k3r) ((rzq) obj7).j.get(jh5Var);
                    if (k3rVar != null) {
                        nen0Var.m(jh5Var, k3rVar);
                    } else {
                        n811 n811Var = (n811) obj2;
                        int i2 = n811Var.a;
                        n811Var.a = i2 + 1;
                        ((ses0) obj3).p(i2, jh5Var);
                    }
                }
                return rih1Var;
            case 8:
                List list3 = (List) obj;
                return ((bv30) obj5).c1(((l4r) obj6).e.invoke(list3.get(0)), ((l4r) obj4).e.invoke(list3.get(1)), ((l4r) obj7).e.invoke(list3.get(2)), ((l4r) obj3).e.invoke(list3.get(3)), ((l4r) obj2).e.invoke(list3.get(4)));
            case 9:
                rtb0 rtb0Var = (rtb0) obj;
                List list4 = (List) obj7;
                tvr tvrVar = (tvr) obj2;
                List list5 = (List) obj4;
                ven0 ven0Var4 = (ven0) obj6;
                rtb0.c(rtb0Var, (Object) null, bki.a, 3);
                rtb0.c(rtb0Var, (Object) null, new j2i(1529073138, new mgl((iir) obj3, (byte) 29), true), 3);
                List<p0v> list6 = ((etu) obj5).a;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    for (p0v p0vVar : list6) {
                        int i3 = itu.b;
                        if (p0vVar.e.equals(new m0v(1))) {
                            rtb0.c(rtb0Var, (Object) null, new j2i(-2006689514, new nf0(ven0Var4, (byte) 3), true), 3);
                        }
                    }
                }
                rtb0Var.e(list5.size(), new f1m(list5, (byte) 16), new f1m(list5, (byte) 17), new j2i(802480018, new ovr(list5, tvrVar, (byte) 0), true));
                if (!list4.isEmpty()) {
                    rtb0.c(rtb0Var, "recent_downloads_heading", new j2i(684192077, new e6j(list5, ven0Var4, (byte) 19), true), 2);
                    rtb0Var.e(list4.size(), new f1m(list4, (byte) 18), new f1m(list4, (byte) 19), new j2i(802480018, new ovr(list4, tvrVar, (byte) 1), true));
                }
                return rih1Var;
            case 10:
                tka0 tka0Var = otw.a;
                Object value = ((ven0) obj6).getValue();
                ven0 ven0Var5 = (ven0) obj4;
                guj gujVar = (guj) ven0Var5.getValue();
                Object obj9 = ((q811) obj5).a;
                if (obj9 == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                ztw ztwVar = (ztw) obj9;
                String str2 = (String) obj3;
                iu30 iu30Var3 = (iu30) obj2;
                try {
                    Object objB = gujVar.a.a().b(value, ((h141) gujVar.b.d).getState(), obj, (op80) ((q811) obj7).a);
                    ((guj) ven0Var5.getValue()).b.q(obj, objB != null ? ztwVar.b(objB) : null);
                    return rih1Var;
                } catch (Exception e) {
                    loo1.o(e, iu30Var3.invoke(value), ((h141) gujVar.b.d).getState(), str2);
                    throw null;
                }
            case 11:
                boolean z3 = true;
                rtb0 rtb0Var2 = (rtb0) obj;
                l5y l5yVar = (l5y) obj5;
                k5y k5yVar = l5yVar.b;
                if (!(k5yVar instanceof j5y)) {
                    if (k5yVar instanceof i5y) {
                        c380 c380Var = ((i5y) k5yVar).a;
                        rtb0Var2.e(c380Var.size(), (iu30) null, new nt(c380Var, (byte) 6), new j2i(802480018, new ot(c380Var, (vu30) obj2, (byte) 9), true));
                        return rih1Var;
                    }
                    if (k5yVar.equals(h5y.a)) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                muo muoVar = (muo) obj3;
                ven0 ven0Var6 = (ven0) obj6;
                ven0 ven0Var7 = (ven0) obj4;
                ven0 ven0Var8 = (ven0) obj7;
                int i4 = 0;
                for (Object obj10 : ((j5y) k5yVar).a) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    n5y n5yVar = (n5y) obj10;
                    boolean z4 = z3;
                    rtb0.c(rtb0Var2, ab80.n("header:", ":", i4, n5yVar.b), new j2i(-817085640, new x3y(n5yVar, z4 ? (byte) 1 : (byte) 0), z4), 2);
                    c380 c380Var2 = n5yVar.c;
                    l5y l5yVar2 = l5yVar;
                    rtb0Var2.e(c380Var2.size(), new da(new du0(i4, n5yVar, (byte) 25), c380Var2, (byte) 21), new nt(c380Var2, (byte) 7), new j2i(2039820996, new y3y(c380Var2, n5yVar, i4, muoVar, l5yVar2, ven0Var6, ven0Var7, ven0Var8), true));
                    i4 = i5;
                    l5yVar = l5yVar2;
                    z3 = true;
                }
                return rih1Var;
            case 12:
                d0r d0rVar = (d0r) obj2;
                sqy sqyVar = (sqy) obj5;
                ruz ruzVar = sqyVar.f40p;
                String str3 = (String) obj6;
                Set set = s4b1.f;
                b3i1 b3i1Var = nyu0.e;
                b3i1 b3i1Var2 = wyu0.f;
                boolean zK = uic.k(str3, b3i1Var, b3i1Var2);
                iac0 iac0Var = sqyVar.d;
                if (zK) {
                    b0d0 b0d0Var = sqyVar.o;
                    w7x w7xVar = (Set) obj4;
                    if (w7xVar == null) {
                        w7xVar = w7x.a;
                    }
                    huz huzVar = new huz(w7xVar, (byte) 10);
                    huz huzVar2 = new huz((g3d0) obj7, (byte) 10);
                    zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                    c2 = 0;
                    zpzVarY.s("entity-segments-playback");
                    EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                    b7x b7xVar = b7x.a;
                    c = 1;
                    vlt0Var = new ult0(b0d0Var.b(str3, huzVar, iac0Var, ruzVar, huzVar2, playOriginBuild, new huz(b7xVar, (byte) 10), new huz(b7xVar, (byte) 10)));
                } else {
                    char c3 = 0;
                    char c4 = 1;
                    if (uic.g((String) obj3, blc0.M3)) {
                        vlt0Var = new wlt0(ruzVar);
                        c2 = c3;
                        c = c4;
                    } else {
                        xq51 xq51VarA = sqyVar.l.a(str3, d0rVar, zso1.H(iac0Var.getLifecycle()));
                        vlt0Var = new vlt0(sqyVar.k.a(str3, iac0Var.getLifecycle(), new z6n(2, xq51VarA, xq51.class, "getPlaybackTimestamp", "getPlaybackTimestamp(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 27), sqyVar.m.a(d5p1.t(new any(d0rVar.c(e4r.a.a(str3)).a().a, (byte) 2), zso1.H(iac0Var.getLifecycle()), ey71.a, yry.a))), new i5w(new uuy(new LinkedHashMap(), zso1.H(iac0Var.getLifecycle()), sqyVar.n, new gcy(1, xq51VarA, xq51.class, "getPresentationTimestampRangeFlow", "getPresentationTimestampRangeFlow(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 27), new gcy(1, xq51VarA, xq51.class, "getBufferingCreatorRangeFlow", "getBufferingCreatorRangeFlow(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 28), str3, (byte) 0), (byte) 28));
                        c2 = c3;
                        c = c4;
                    }
                }
                y0q0 y0q0VarA = sqyVar.e.a(d0rVar, vlt0Var);
                b3i1[] b3i1VarArr = new b3i1[2];
                b3i1VarArr[c2] = b3i1Var;
                b3i1VarArr[c] = b3i1Var2;
                return uic.k(str3, b3i1VarArr) ? new wzq(new nou0(y0q0VarA, d0rVar, str3), yoy.c1) : fdg1.m0(new xzq(y0q0VarA, yoy.d1), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 13:
                Set set2 = q410.n;
                return ((q410) obj5).b((String) obj6, (PreparePlayOptions) obj4, (PlayOrigin) obj7, (LoggingParams) obj3, (Map) obj2);
            case 14:
                l291 l291Var = (l291) obj4;
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj7;
                o8u0 o8u0Var = (o8u0) obj5;
                if (o8u0Var != null) {
                    exoPlayer.P(o8u0Var);
                }
                Surface surface = (Surface) obj6;
                ((r390) obj3).G0(exoPlayer, surface != null ? new i390(surface, l291Var, 4) : surfaceTexture != null ? new i390(new Surface(surfaceTexture), l291Var, true) : new i390((Surface) null, (l291) null, 7));
                o8u0 o8u0Var2 = (o8u0) obj2;
                if (o8u0Var2 == null) {
                    return null;
                }
                exoPlayer.J(o8u0Var2);
                return rih1Var;
            case 15:
                rj41 rj41Var = (rj41) obj;
                return new mwn0(rj41Var, (uun0) ((b6h1) obj5).a(rj41Var), (z6r0) ((b6h1) obj6).a(rj41Var), (nwn0) obj4, (kly0) obj7, (qgz) ((b6h1) obj3).a(rj41Var), (ynb0) ((Optional) obj2).orElse(null));
            case 16:
                kil kilVar = (kil) obj;
                View view = (View) obj5;
                op71.t(view, kilVar);
                View view2 = (View) obj6;
                op71.t(view2, kilVar);
                ConstraintLayout constraintLayout = (ConstraintLayout) obj4;
                kilVar.g(view.getId(), 6, constraintLayout.getId(), 6);
                kilVar.g(view.getId(), 7, view2.getId(), 6);
                kilVar.g(view2.getId(), 6, view.getId(), 7);
                kilVar.g(view2.getId(), 7, ((Barrier) obj7).getId(), 6);
                LinearLayout linearLayout = (LinearLayout) obj3;
                op71.t(linearLayout, kilVar);
                kilVar.g(linearLayout.getId(), 7, constraintLayout.getId(), 7);
                View view3 = (View) obj2;
                if (view3 != null) {
                    op71.t(view3, kilVar);
                    kilVar.g(view3.getId(), 7, constraintLayout.getId(), 7);
                }
                return rih1Var;
            case 17:
                rtb0 rtb0Var3 = (rtb0) obj;
                fli0 fli0Var = (fli0) obj6;
                rtb0.c(rtb0Var3, "avatarRowElement", new j2i(795737993, new h6a0(fli0Var, (ob9) obj4, (byte) 7), true), 2);
                rtb0.c(rtb0Var3, "accountSectionHeader", new j2i(-1122815232, new v0c0((dh51) obj7, (byte) 0), true), 2);
                rtb0.c(rtb0Var3, "nameRowElement", new j2i(1089600705, new w0c0((fkn0) obj3, fli0Var, (byte) 0), true), 2);
                rtb0.c(rtb0Var3, "accountTypeRowElement", new j2i(-992950654, new x0c0((hx) obj2, (byte) 0), true), 2);
                rtb0.c(rtb0Var3, "divider1", evi.a, 2);
                ((iu30) obj5).invoke(rtb0Var3);
                return rih1Var;
            case 18:
                rtb0 rtb0Var4 = (rtb0) obj;
                bjx bjxVar = (bjx) obj6;
                b9g0 b9g0Var = (b9g0) obj4;
                rtb0Var4.d("description", "description", new j2i(-1941974206, new h6a0(bjxVar, b9g0Var, (byte) 25), true));
                ep6 ep6Var = (ep6) obj7;
                d0r d0rVar2 = (d0r) obj3;
                xx21 xx21Var = (xx21) obj2;
                for (Object obj11 : (ArrayList) obj5) {
                    int i6 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    ifs0 ifs0Var = (ifs0) obj11;
                    boolean z5 = ifs0Var instanceof hfs0;
                    if (!z5) {
                        if (ifs0Var instanceof gfs0) {
                            strM = "audiobooks";
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    strM = l1d.m("artist-", ((hfs0) ifs0Var).a);
                    if (i > 0) {
                        rtb0Var4.d("divider-".concat(strM), "divider", vyi.a);
                    }
                    if (z5) {
                        rtb0Var4.d(strM, "artist_header", new j2i(92120689, new iwf0(ep6Var, (hfs0) ifs0Var, b9g0Var, (byte) 4), true));
                    } else {
                        if (!(ifs0Var instanceof gfs0)) {
                            eg.o();
                            return null;
                        }
                        rtb0Var4.d(strM, "audiobooks_header", vyi.b);
                    }
                    List listL0 = ifs0Var.l0();
                    b9g0 b9g0Var2 = b9g0Var;
                    bjx bjxVar2 = bjxVar;
                    rtb0Var4.e(listL0.size(), new ehf0(listL0, (byte) 5), new ehf0(listL0, (byte) 6), new j2i(802480018, new a87(listL0, b9g0Var2, d0rVar2, bjxVar2, xx21Var, (byte) 4), true));
                    i = i6;
                    b9g0Var = b9g0Var2;
                    bjxVar = bjxVar2;
                }
                return rih1Var;
            case 19:
                e4h0 e4h0Var = (e4h0) obj;
                if (e4h0Var instanceof p3h0) {
                    ven0 ven0Var9 = (ven0) obj6;
                    p6i1 p6i1VarL = i1o1.l(((rnc0) ((q1d0) obj5).b.getValue()).b);
                    ven0Var9.setValue(p6i1VarL != null ? p6i1VarL.b : null);
                    ((ven0) obj4).setValue((Object) null);
                    ((ven0) obj7).setValue(Boolean.TRUE);
                    ydh.m((hdn0) obj2, 1);
                }
                ((iu30) ((ven0) obj3).getValue()).invoke(e4h0Var);
                return rih1Var;
            case 20:
                qtr qtrVar = (qtr) obj;
                rwj rwjVar = (rwj) obj3;
                p731 p731Var = (p731) rwjVar.e;
                kko kkoVar = (kko) rwjVar.d;
                zog zogVar = new zog((lzn0) obj5, (vgm) obj6, (dnc) obj4, (ytp0) obj7, p731Var, ((eci0) obj2).i, 2, (vu30) rwjVar.f, (vu30) rwjVar.g);
                qtrVar.c(new zbi0(kkoVar, (lnm) null, (byte) 0));
                qtrVar.b(new lcm(zogVar, (lnm) null, (byte) 7));
                return rih1Var;
            case 21:
                qtr qtrVar2 = (qtr) obj;
                n0o n0oVar = (n0o) obj3;
                p731 p731Var2 = (p731) n0oVar.g;
                kko kkoVar2 = (kko) n0oVar.f;
                zog zogVar2 = new zog((lzn0) obj5, (vgm) obj6, (dnc) obj4, (ytp0) obj7, p731Var2, ((eci0) obj2).i, 2, (vu30) n0oVar.h, (vu30) n0oVar.i);
                qtrVar2.c(new zbi0(kkoVar2, (lnm) null, (byte) 0));
                qtrVar2.b(new lcm(zogVar2, (lnm) null, (byte) 7));
                return rih1Var;
            case 22:
                qtr qtrVar3 = (qtr) obj;
                yxb0 yxb0Var = (yxb0) obj3;
                p731 p731Var3 = (p731) yxb0Var.d;
                kko kkoVar3 = (kko) yxb0Var.c;
                zog zogVar3 = new zog((lzn0) obj5, (vgm) obj6, (dnc) obj4, (ytp0) obj7, p731Var3, ((uei0) obj2).j, 1, (vu30) yxb0Var.e, (vu30) yxb0Var.f);
                qtrVar3.c(new zbi0(kkoVar3, (lnm) null, (byte) 0));
                qtrVar3.b(new lcm(zogVar3, (lnm) null, (byte) 7));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                mey0 mey0Var = (mey0) obj;
                el9 el9Var = (el9) obj5;
                uei0 uei0Var = (uei0) obj3;
                return h5p1.q(new p1e0(d3p1.F(el9Var.b, el9Var.c, mey0Var), (byte) 13), ((nwt) obj6).a(), ((clm) obj4).a, ((kko) el9Var.h).a(), ((ytp0) obj7).E(uei0Var.j ? mey0Var.c : null), new mci0(uei0Var, (yy4) obj2, (lnm) null, (byte) 1));
            case 24:
                qtr qtrVar4 = (qtr) obj;
                el9 el9Var2 = (el9) obj3;
                p731 p731Var4 = (p731) el9Var2.i;
                kko kkoVar4 = (kko) el9Var2.h;
                zog zogVar4 = new zog((lzn0) obj5, (vgm) obj6, (dnc) obj4, (ytp0) obj7, p731Var4, ((uei0) obj2).j, 1, (vu30) el9Var2.t, (vu30) el9Var2.X);
                qtrVar4.c(new zbi0(kkoVar4, (lnm) null, (byte) 0));
                qtrVar4.b(new lcm(zogVar4, (lnm) null, (byte) 7));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return a(obj);
            case 26:
                return d(obj);
            case 27:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new ary((byte) 25, (xtb0) obj5, (Set) obj7, (c380) obj3, (ven0) obj6, (ven0) obj4, (lnm) null);
                abc0Var.a = new e3p0((Set) obj7, (iu30) obj2, (lnm) null, (byte) 2);
                return rih1Var;
            case 28:
                return e(obj);
            default:
                Context context = (Context) obj;
                gpv0 gpv0Var = (gpv0) obj5;
                if (gpv0Var != null) {
                    webView = gpv0Var.a;
                    ViewParent parent = webView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    gpv0Var.e = true;
                } else {
                    WebView webView2 = new WebView(context);
                    Bundle bundle = (Bundle) obj3;
                    String str4 = (String) obj2;
                    no80.l(webView2);
                    webView2.addJavascriptInterface(new ods0((ees0) obj4), "Android");
                    webView2.setWebViewClient(new q78((Function0) obj7, (byte) 2));
                    if (bundle.isEmpty()) {
                        webView2.loadUrl(str4);
                    } else {
                        webView2.restoreState(bundle);
                    }
                    webView = webView2;
                }
                ((ven0) obj6).setValue(webView);
                return webView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(l96 l96Var, hwx0 hwx0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5) {
        super(1);
        this.a = (byte) 0;
        this.b = l96Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
        this.g = ven0Var5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(kpc kpcVar, boolean z, wrw wrwVar, av11 av11Var, iu30 iu30Var, toc tocVar, it8 it8Var) {
        super(1);
        this.a = (byte) 3;
        this.b = kpcVar;
        this.c = wrwVar;
        this.d = av11Var;
        this.e = iu30Var;
        this.f = tocVar;
        this.g = it8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j96(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(l5y l5yVar, muo muoVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, vu30 vu30Var) {
        super(1);
        this.a = (byte) 11;
        this.b = l5yVar;
        this.f = muoVar;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.g = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(xtb0 xtb0Var, Set set, c380 c380Var, ven0 ven0Var, ven0 ven0Var2, iu30 iu30Var) {
        super(1);
        this.a = (byte) 27;
        this.b = xtb0Var;
        this.e = set;
        this.f = c380Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.g = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(q1d0 q1d0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, hdn0 hdn0Var, ven0 ven0Var4) {
        super(1);
        this.a = (byte) 19;
        this.b = q1d0Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.g = hdn0Var;
        this.f = ven0Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(irq0 irq0Var, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, ven0 ven0Var) {
        super(1);
        this.a = (byte) 28;
        this.b = irq0Var;
        this.d = str;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = function0;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(q811 q811Var, q811 q811Var2, String str, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.a = (byte) 10;
        this.b = q811Var;
        this.e = q811Var2;
        this.f = str;
        this.g = iu30Var;
        this.c = ven0Var;
        this.d = ven0Var2;
    }
}
