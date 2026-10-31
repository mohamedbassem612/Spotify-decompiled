package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mvn0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvn0(gft0 gft0Var, vet0 vet0Var, iu30 iu30Var, met0 met0Var) {
        super(1);
        this.a = (byte) 21;
        this.b = vet0Var;
        this.c = iu30Var;
        this.d = met0Var;
    }

    public final Object invoke(Object obj) {
        String string;
        View.OnClickListener t230Var;
        int i;
        zft0 vft0Var;
        byte b = this.a;
        Parcelable parcelable = aqr0.a;
        int i2 = 0;
        String string2 = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                sd5 sd5Var = (sd5) obj4;
                lvn0 lvn0Var = (lvn0) obj2;
                ((lzn0) sd5Var.b).a(lvn0Var.c, bcl1.f((bcl1) sd5Var.c, ((o0i) obj3).e, "navigation_header_body", zmo1.s(lvn0Var.c), (String) null, new nvn0(lvn0Var, (byte) 0), 8), (Bundle) null);
                return rih1Var;
            case 1:
                tv80 tv80Var = (tv80) obj2;
                String str = (String) obj;
                ugo0 ugo0Var = (ugo0) obj4;
                mgo0 mgo0Var = ugo0Var.i;
                String str2 = ugo0Var.h;
                dxy dxyVar = (dxy) obj3;
                dg30 dg30Var = (dg30) dxyVar.b;
                if (mgo0Var == null) {
                    String string3 = dg30Var.getString(2131956591);
                    if (ugo0Var.f) {
                        string = dg30Var.getString(2131959154);
                        t230Var = new t230(dxyVar, ugo0Var, (byte) 19);
                    } else {
                        string = null;
                        t230Var = null;
                    }
                    kgo0 kgo0Var = new kgo0(dxyVar, (byte) 1);
                    ((f0i) dg30Var).a.a(kgo0Var);
                    ((kt91) dxyVar.c).k(new er91((fs91) null, string3, (Integer) null, string, (Integer) null, t230Var, (cvr) null, kgo0Var, false));
                } else {
                    Parcelable vqr0Var = new vqr0(ugo0Var.b, mgo0Var.a, mgo0Var.b, str2, mgo0Var.c, mgo0Var.d, ugo0Var.e);
                    a1r0 a1r0Var = (a1r0) dxyVar.g;
                    String str3 = nik1.T6.a;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("not_interested_followup_input", vqr0Var);
                    a1r0.m(a1r0Var, str3, tv80Var, bundle, 8);
                }
                ((ggl) dxyVar.d).a(str2, str, ugo0Var.e);
                if (mgo0Var == null && ((ms00) dxyVar.f).c() && ugo0Var.g) {
                    fn31.T(cto1.q(dg30Var), (o8n) null, 0, new m3n0(dxyVar, tv80Var, (lnm) null, (byte) 23), 3);
                }
                return rih1Var;
            case 2:
                c380 c380Var = (c380) obj4;
                ((rtb0) obj).e(c380Var.size(), new iio0(c380Var, (byte) 0), new iio0(c380Var, (byte) 1), new j2i(802480018, new rf1((byte) 22, (hio0) obj3, (hcs) obj2, c380Var), true));
                return rih1Var;
            case 3:
                ((byp) obj4).A((String) obj3, new s2n0((ihm) obj2, (tv80) obj, (byte) 22));
                return rih1Var;
            case 4:
                bnj0 bnj0VarL = bnj0.l(LayoutInflater.from((Context) obj), (ViewGroup) null);
                iu30 iu30Var = (iu30) obj2;
                res resVar = (res) obj4;
                ((EncoreProgressIndicatorButton) bnj0VarL.c).setOnClickListener(new jl5((rpo0) obj3, bnj0VarL, iu30Var, resVar, (byte) 7));
                ((los) resVar.e).c(new wck0(iu30Var, (byte) 14));
                return (ConstraintLayout) bnj0VarL.b;
            case 5:
                dmh1 dmh1VarA = ((r2r) obj3).a("android-nowplaying-scrollsection", new lff((t380) obj2, ((jv4) obj4).a(), cto1.q((iac0) obj), (byte) 6));
                j3r j3rVar = rzq.y;
                return new jwo0(l2p1.f(dmh1VarA));
            case 6:
                ((Number) obj).intValue();
                r6h1 r6h1Var = ((kyo0) obj4).h.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-now-playing-view-nova-scroll";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = null;
                x6h1VarI.e = (String) obj3;
                x6h1VarI.d = (String) obj2;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("nowplaying");
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                return new r6h1(arrayList, r6h1Var.b);
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    View viewFindViewById = ((View) obj4).findViewById(2131430187);
                    viewFindViewById.getClass();
                    aiq0.a(viewFindViewById, new uu1(viewFindViewById, (dg30) obj3, (u6j0) obj2, (byte) 22));
                }
                return rih1Var;
            case 8:
                return new hp0(((los) obj4).c(new ijp0((Function0) obj3, (Function0) obj2, (byte) 0)), (byte) 12);
            case 9:
                ((qtr) obj).b(new v63((iu30) obj4, (yvp0) obj3, (p410) obj2, null, (byte) 2));
                return rih1Var;
            case 10:
                wsc0 wsc0Var = (wsc0) obj;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                v2q0 v2q0Var = (v2q0) obj2;
                kby kbyVar = wsc0Var.f;
                Map map = kbyVar.q;
                String str6 = kbyVar.p;
                Set set = v2q0.e;
                me30 me30Var = v2q0Var.c;
                kly0 kly0Var = v2q0Var.a.a;
                boolean zJ = u890.j(map.get("enhanced_context"), "true");
                boolean zR = eqr0.r(wsc0Var, new dlc0[]{dlc0.d});
                boolean z = kbyVar.j;
                if (!u890.j((String) obj4, str5)) {
                    i = 3;
                } else if (str6 == null || str6.length() == 0) {
                    i = 1;
                } else {
                    i = ((((t35) kly0Var.get()).t() && v2q0.e.contains(me30Var.a(str6))) || (((t35) kly0Var.get()).u() && v2q0.f.contains(me30Var.a(str6))) || (((t35) kly0Var.get()).v() && v2q0.g.contains(me30Var.a(str6)))) ? 2 : 4;
                }
                return new i5w0(new yrc0(str4, str5, zJ, i, zR, z));
            case 11:
                return new sg((bw91) obj4, (kwq0) obj3, (kd41) obj2, (byte) 14);
            case 12:
                return new sg((mwq0) obj4, (kd41) obj3, (UUID) obj2, (byte) 15);
            case 13:
                List list = ((wsc0) obj).e;
                if (list.isEmpty()) {
                    ((xev0) ((zl5) obj4).m).d();
                }
                List list2 = list;
                String str7 = (String) obj3;
                y6h1 y6h1Var2 = (y6h1) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (Object obj5 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    zuc0 zuc0Var = (zuc0) obj5;
                    arrayList2.add(new mfr0(zuc0Var.c, str7, i3, zuc0Var.a, new tfr0(Integer.valueOf(i2), y6h1Var2)));
                    i2 = i3;
                }
                return arrayList2;
            case 14:
                return new j5r0(((los) ((ahi0) obj4).R0).d(new i5r0((iu30) obj2, (ven0) obj3)), (byte) 0);
            case 15:
                q7r0 q7r0Var = (q7r0) obj;
                ebr0 ebr0Var = (ebr0) obj4;
                Parcelable parcelable2 = (Parcelable) obj3;
                if (parcelable2 != null) {
                    parcelable = parcelable2;
                }
                return ebr0Var.a(parcelable, q7r0Var, obj2);
            case 16:
                q7r0 q7r0Var2 = (q7r0) obj;
                kyv0 kyv0Var = (kyv0) obj4;
                Parcelable parcelable3 = (Parcelable) obj3;
                if (parcelable3 != null) {
                    parcelable = parcelable3;
                }
                return kyv0Var.b(parcelable, q7r0Var2, obj2);
            case 17:
                rtb0 rtb0Var = (rtb0) obj;
                Locale locale = (Locale) obj2;
                bcb0 bcb0Var = (bcb0) obj4;
                iu30 iu30Var2 = (iu30) obj3;
                rtb0.f(rtb0Var, "header", new j2i(1685168036, new wh(bcb0Var, iu30Var2, (byte) 22), true), 2);
                boolean z2 = bcb0Var.d;
                List list3 = bcb0Var.c;
                if (z2) {
                    rtb0.c(rtb0Var, "off", new j2i(481036789, new ukm0(bcb0Var, iu30Var2, (byte) 17), true), 2);
                }
                List list4 = list3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list4) {
                    if (!((xab0) obj6).c) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : list4) {
                    if (((xab0) obj7).c) {
                        arrayList4.add(obj7);
                    }
                }
                rtb0Var.e(arrayList3.size(), new qbb0(arrayList3, (byte) 17), new qbb0(arrayList3, (byte) 18), new j2i(802480018, new mhr0(arrayList3, locale, bcb0Var, iu30Var2, (byte) 0), true));
                if (!arrayList4.isEmpty()) {
                    rtb0.c(rtb0Var, "auto_generated_header", n5j.a, 2);
                    rtb0Var.e(arrayList4.size(), new qbb0(arrayList4, (byte) 19), new qbb0(arrayList4, (byte) 20), new j2i(802480018, new mhr0(arrayList4, locale, bcb0Var, iu30Var2, (byte) 1), true));
                }
                return rih1Var;
            case 18:
                tgs0 tgs0Var = (tgs0) obj4;
                ArrayList arrayList5 = tgs0Var.b;
                ((rtb0) obj).e(arrayList5.size(), (iu30) null, new qbb0(arrayList5, (byte) 21), new j2i(2039820996, new oi1(arrayList5, (pjp) obj3, (lbl0) obj2, tgs0Var, (byte) 10), true));
                return rih1Var;
            case 19:
                String str8 = (String) obj;
                ((ven0) obj3).setValue(str8);
                ((ven0) obj2).setValue(Boolean.valueOf(str8.length() == 4));
                v1t0 v1t0Var = (v1t0) obj4;
                i8h1 i8h1Var = (i8h1) v1t0Var.d.getValue();
                x6h1 x6h1VarC = v1t0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("pin_input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "pin")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 20:
                tzr0 tzr0Var = (tzr0) obj4;
                fn31.T(cto1.q((dg30) tzr0Var.b), (o8n) null, 0, new ofk0(tzr0Var, (lik1) obj2, (String) obj3, (lnm) null, (byte) 25), 3);
                return rih1Var;
            case 21:
                PlayButtonView playButtonView = (PlayButtonView) obj;
                vet0 vet0Var = (vet0) obj4;
                iu30 iu30Var3 = (iu30) obj3;
                met0 met0Var = (met0) obj2;
                Context context = playButtonView.getContext();
                boolean z3 = vet0Var.c;
                qet0 qet0Var = vet0Var.a;
                pet0 pet0Var = qet0Var.d;
                if (pet0Var instanceof net0) {
                    vft0Var = new zft0(false, ((net0) pet0Var).a);
                } else {
                    if (!(pet0Var instanceof oet0)) {
                        eg.o();
                        return null;
                    }
                    vft0Var = new vft0(false);
                }
                int i4 = qet0Var.e;
                if (i4 != 0) {
                    if (cft0.a[l1d.C(i4)] != 1) {
                        eg.o();
                        return null;
                    }
                    string2 = context.getString(2131955427);
                }
                playButtonView.B(new cet0(z3, vft0Var, string2));
                playButtonView.n(new aft0(iu30Var3, met0Var, (byte) 0));
                return rih1Var;
            case 22:
                ((qtr) obj).b(new v63((iu30) obj4, (yvp0) obj3, (lgy) obj2, null, (byte) 3));
                return rih1Var;
            case 23:
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.S();
                sku0VarP.L();
                sku0VarP.E();
                sku0VarP.G();
                sku0VarP.W();
                sku0VarP.k0();
                sku0VarP.n(((iz00) obj4).a(Collections.singleton(rc11.a.b(qp31.class))));
                hru0VarS.x(sku0VarP);
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                playlistRequestDecorationPolicyBuild.getClass();
                return yoi1.i(((xrc0) obj3).k(((bsu0) obj).a, new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, qrc0.a, jqz0.a, (prc0) null, 0, (List) null, 462)), o6x.a).observeOn((Scheduler) obj2).map(xi10.b1).doOnError(xfs0.P0).onErrorReturn(dj10.a1).map(fj10.a1).toFlowable(BackpressureStrategy.d);
            case 24:
                nuu0 nuu0Var = (ouu0) obj;
                String str9 = ((l1j0) obj2).g;
                iu30 iu30Var4 = (iu30) obj3;
                if (nuu0Var.equals(kuu0.a)) {
                    ((Function0) obj4).invoke();
                } else if (nuu0Var instanceof nuu0) {
                    iu30Var4.invoke(new v0j0(nuu0Var.a));
                } else if (nuu0Var instanceof luu0) {
                    iu30Var4.invoke(new p0j0(str9, ((luu0) nuu0Var).a));
                } else if (nuu0Var instanceof muu0) {
                    iu30Var4.invoke(new t0j0(str9, ((muu0) nuu0Var).a));
                } else if (nuu0Var instanceof iuu0) {
                    iu30Var4.invoke(new m0j0(str9, ((iuu0) nuu0Var).a));
                } else {
                    if (!nuu0Var.equals(juu0.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var4.invoke(new o0j0(str9));
                }
                return rih1Var;
            case 25:
                j0v0 j0v0Var = (j0v0) obj4;
                return (yu50) ((vu30) obj).invoke(j0v0Var, new pcp0(j0v0Var, (rbt) obj3, (qzu0) obj2, (byte) 22));
            case 26:
                vu30 vu30Var = (vu30) obj;
                List<j0v0> list5 = (List) obj4;
                act actVar = (act) obj3;
                qzu0 qzu0Var = (qzu0) obj2;
                ArrayList arrayList6 = new ArrayList(q7h.U(list5, 10));
                for (j0v0 j0v0Var2 : list5) {
                    arrayList6.add((anc0) vu30Var.invoke(j0v0Var2, new pcp0(j0v0Var2, actVar, qzu0Var, (byte) 23)));
                }
                return arrayList6;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                vu30 vu30Var2 = (vu30) obj;
                ArrayList<j0v0> arrayList7 = (ArrayList) obj4;
                zbt zbtVar = (zbt) obj3;
                qzu0 qzu0Var2 = (qzu0) obj2;
                ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                for (j0v0 j0v0Var3 : arrayList7) {
                    arrayList8.add((mk90) vu30Var2.invoke(j0v0Var3, new pcp0(j0v0Var3, zbtVar, qzu0Var2, (byte) 24)));
                }
                return arrayList8;
            case 28:
                vu30 vu30Var3 = (vu30) obj;
                List<j0v0> list6 = (List) obj4;
                pbt pbtVar = (pbt) obj3;
                qzu0 qzu0Var3 = (qzu0) obj2;
                ArrayList arrayList9 = new ArrayList(q7h.U(list6, 10));
                for (j0v0 j0v0Var4 : list6) {
                    arrayList9.add((py50) vu30Var3.invoke(j0v0Var4, new pcp0(j0v0Var4, pbtVar, qzu0Var3, (byte) 25)));
                }
                return arrayList9;
            default:
                vu30 vu30Var4 = (vu30) obj;
                List<j0v0> list7 = ((qzu0) obj4).t0;
                y2r y2rVar = ((z2r) obj3).a;
                gzu0 gzu0Var = (gzu0) obj2;
                for (j0v0 j0v0Var5 : list7) {
                    y2rVar = (y2r) vu30Var4.invoke(j0v0Var5, new pcp0(j0v0Var5, gzu0Var, y2rVar, (byte) 26));
                }
                return y2rVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvn0(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
