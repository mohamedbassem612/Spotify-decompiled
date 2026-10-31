package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.mobius.Connectable;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ibf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibf1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        j9k1 j9k1Var;
        otl0 otl0Var;
        bmg1 parcelable;
        byte b = this.a;
        yig1 yig1Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ard1) ((lf6) obj2).h).d((t480) obj);
                return rih1Var;
            case 1:
                return new kcf1((lcf1) obj2, (byte) 0);
            case 2:
                ((kd31) obj).b(((ge5) obj2).b);
                return rih1Var;
            case 3:
                return s110.o((pdf1) obj, z6x.a, ((xdf1) obj2).h);
            case 4:
                return new k3h1(((pef1) obj2).a);
            case 5:
                pt ptVar = (pt) obj2;
                cas casVar = (a7m0) obj;
                casVar.a = new wcf1((Object) ptVar, (byte) 5);
                casVar.c = new r1k(new Connectable[]{(iff1) ptVar.e, (qn) ptVar.f, (qn) ptVar.t}, (byte) 2);
                return rih1Var;
            case 6:
                return new lo8(new nsb1((vgf1) obj2, (byte) 22), rre1.e, (byte) 14);
            case 7:
                return ((ehf1) obj2).b;
            case 8:
                return ((glf1) obj2).a;
            case 9:
                plf1 plf1Var = (plf1) obj;
                int i = plf1Var.G;
                boolean z = plf1Var.u;
                boolean z2 = plf1Var.t;
                boolean z3 = i != 3 && z;
                boolean zF = o0c.F(i, z2, z2);
                if (z3) {
                    j9k1Var = eql.b;
                } else {
                    j9k1Var = zF ? fql.b : gql.b;
                }
                j9k1 j9k1Var2 = j9k1Var;
                String str = plf1Var.a;
                String str2 = plf1Var.c;
                String str3 = plf1Var.d;
                String str4 = plf1Var.e;
                String str5 = plf1Var.f;
                String str6 = plf1Var.g;
                int i2 = plf1Var.G;
                boolean z4 = plf1Var.j;
                boolean z5 = plf1Var.k;
                boolean z6 = plf1Var.o;
                boolean z7 = plf1Var.f33p;
                boolean z8 = plf1Var.s;
                boolean z9 = plf1Var.v;
                return new qlf1(str, str2, str3, str4, str5, str6, false, i2, j9k1Var2, false, 3, z4, z5, z6, false, z7, false, z8, z9, plf1Var.y && (plf1Var.w || z9 || z8), null, plf1Var.z, plf1Var.w, plf1Var.x, plf1Var.D, false, plf1Var.F && ((di4) ((rlf1) obj2).j).d());
            case 10:
                ho11 ho11Var = (ho11) obj;
                ((tl7) obj2).h(new jen0(ho11Var.a().a, ho11Var.a().b, ho11Var.a().c, ho11Var.a().d));
                return rih1Var;
            case 11:
                e261 e261Var = (e261) obj;
                crf1 crf1Var = (crf1) obj2;
                String strY0 = crf1Var.h;
                if (strY0.length() <= 0) {
                    String str7 = crf1Var.a;
                    String str8 = crf1Var.b;
                    String str9 = crf1Var.c;
                    if (str9.length() <= 0) {
                        str9 = null;
                    }
                    d761 d761Var = crf1Var.g;
                    if (d761Var != null) {
                        yig1 yig1VarB = kh.b(d761Var);
                        if (yig1VarB.length() > 0) {
                            yig1Var = yig1VarB;
                        }
                    }
                    strY0 = o7h.y0(f46.i0(new String[]{str7, str8, str9, yig1Var}), ", ", (String) null, (String) null, (iu30) null, 62);
                }
                b261.n(e261Var, strY0);
                return rih1Var;
            case 12:
                cas casVar2 = (a7m0) obj;
                casVar2.a = ggf1.i;
                casVar2.c = ((grf1) obj2).b;
                return rih1Var;
            case 13:
                ((qtr) obj).b(new k8y0((yup0) obj2, (lnm) null, (byte) 23));
                return rih1Var;
            case 14:
                gxb gxbVar = (hxb) obj;
                ynb0 ynb0Var = ((yuf1) obj2).e;
                if (gxbVar instanceof gxb) {
                    int iC = l1d.C(gxbVar.a);
                    b7x b7xVar = b7x.a;
                    if (iC == 0) {
                        xuf1 xuf1Var = (xuf1) ynb0Var.get();
                        ((i8h1) xuf1Var.a.get()).m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), xuf1Var.b.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else if (iC == 2) {
                        xuf1 xuf1Var2 = (xuf1) ynb0Var.get();
                        ((i8h1) xuf1Var2.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), xuf1Var2.b.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                return rih1Var;
            case 15:
                return (nhb1) ((et90) obj2).e;
            case 16:
                return ((sjw0) obj2).k.distinctUntilChanged(new qpp0((byte) 23)).toFlowable(BackpressureStrategy.d).J(u3x0.U0).t(Functions.a);
            case 17:
                return new nts((nfx) obj2, new pky());
            case 18:
                wfx wfxVar = ((px6) obj2).b.c;
                return new fws(wfxVar.b, wfxVar.a);
            case 19:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.S0(lslVar, (qoz0) obj2, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 20:
                f7g1 f7g1Var = (f7g1) obj2;
                return d3p1.F(f7g1Var.e(), f7g1Var.b, (String) obj);
            case 21:
                ((o7g1) obj2).g();
                return rih1Var;
            case 22:
                j7h1 j7h1Var = (j7h1) obj2;
                j7h1Var.getClass();
                int iOrdinal = ((tcd1) obj).ordinal();
                if (iOrdinal == 0) {
                    otl0Var = otl0.d;
                } else if (iOrdinal == 1) {
                    otl0Var = otl0.b;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    otl0Var = otl0.c;
                }
                j7h1Var.a = otl0Var;
                return rih1Var;
            case 23:
                cv31 cv31Var = (cv31) obj;
                ((mbg1) obj2).getClass();
                return new t710(cv31Var.b, 48, cv31Var.c, cv31Var.d, true, (String) null);
            case 24:
                vcg1 vcg1Var = (vcg1) obj;
                adg1 adg1Var = (adg1) obj2;
                j1r j1rVarN = adg1Var.N0 ? j1r.a : x2p1.n(adg1Var.a, adg1Var.R0, vcg1Var);
                return j1rVarN instanceof i1r ? new wcg1(ob51.q(((ycg1) u890.k(j1rVarN, (d0r) null, (n4r) null)).a, vcg1Var), (Integer) null, (Integer) null, e5e0.a, vcg1Var.b, vcg1Var.a) : new wcg1(z6x.a, (Integer) null, (Integer) null, g5e0.a, vcg1Var.b, vcg1Var.a);
            case 25:
                jx31 jx31Var = (jx31) o7h.t0(((Number) obj).intValue(), ((wcg1) obj2).a);
                if (jx31Var == null) {
                    return null;
                }
                if (!(jx31Var instanceof ix31)) {
                    if (jx31Var instanceof hx31) {
                        return bbp1.i(((hx31) jx31Var).b);
                    }
                    return null;
                }
                ix31 ix31Var = (ix31) jx31Var;
                String str10 = ix31Var.b;
                String str11 = ix31Var.c;
                return !ihc1.y0(str11) ? xcg1.i(str10, " • ", str11) : str10;
            case 26:
                return (FrameLayout) ((ilh1) ((eos) ((h680) obj2).c).b).b;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((z2s) obj).R(reg1.class, ((teg1) obj2).b, zdg1.e, zdg1.f, zdg1.g, false, lbg1.e);
                return rih1Var;
            case 28:
                Bundle bundle = (Bundle) obj;
                jlg1 jlg1Var = (jlg1) obj2;
                if (bundle != null && (parcelable = bundle.getParcelable("TRANSITION_SUBMIT_PAGE_MODEL")) != null) {
                    return parcelable;
                }
                cmg1 cmg1Var = jlg1Var.d;
                String str12 = cmg1Var.b;
                if (str12 == null) {
                    str12 = "";
                }
                String str13 = str12;
                wxa0 wxa0Var = cmg1Var.a;
                boolean z10 = wxa0Var instanceof xxa0;
                wxa0 wxa0Var2 = wxa0Var instanceof wxa0 ? wxa0Var : null;
                return new bmg1(str13, z10, wxa0Var2 != null ? wxa0Var2.a : null, o7h.i0(p7h.M(new vur0[]{vur0.e, vur0.c}), cmg1Var.f), -1L, (String) null, "", fmg1.a, cmg1Var.g);
            default:
                r6h1 r6h1Var = r6h1.c;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                hce1 hce1Var = (hce1) obj2;
                return new jtl0(new htl0(new ntl0(new qtl0(0, yon1.D4().c, (String) hce1Var.e, r6h1Var), (otl0) hce1Var.d), (byte) 1));
        }
    }
}
