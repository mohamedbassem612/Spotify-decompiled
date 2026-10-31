package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.protobuf.Timestamp;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mgl extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgl(g210 g210Var, lfm lfmVar) {
        super(3);
        this.a = (byte) 5;
        this.b = g210Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ou80 ou80Var;
        w7h1 w7h1Var;
        ou80 ou80Var2;
        float f;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        bwn0 bwn0VarValueOf = null;
        switch (b) {
            case 0:
                lgl lglVar = (lgl) obj;
                kgl kglVar = (kgl) obj2;
                if (kglVar instanceof hgl) {
                    gw10 gw10Var = ((ogl) obj4).c;
                    tv10 tv10Var = new tv10(lglVar.a.a);
                    String string = ihc1.f1(ihc1.J0(ihc1.J0(ihc1.f1(((hgl) kglVar).b).toString(), "…"), "...")).toString();
                    if (string.length() != 0) {
                        string = string.concat(" ");
                    }
                    bpb1 bpb1Var = gw10Var.i;
                    fw10 fw10Var = (fw10) bpb1Var.getValue();
                    bpb1Var.m((Object) null, new fw10(tv10Var, string, (fw10Var != null ? fw10Var.c : 0) + 1));
                    gw10Var.a(tv10Var);
                }
                return rih1Var;
            case 1:
                m78 m78Var = (m78) obj2;
                h8p h8pVar = ((dml) obj4).e;
                m78Var.getClass();
                x2p x2pVar = (x2p) h8pVar.a.c;
                Scheduler scheduler = (Scheduler) ((eml) x2pVar.c).a.get();
                c8o.l(scheduler);
                eml emlVar = (eml) x2pVar.c;
                Scheduler scheduler2 = (Scheduler) emlVar.b.get();
                c8o.l(scheduler2);
                RetrofitMaker retrofitMaker = (RetrofitMaker) emlVar.e.get();
                c8o.l(retrofitMaker);
                oi oiVar = new oi((gmd) retrofitMaker.createExperimentalWebgateService(gmd.class, "android-audiobookpremium-capping-datasource"), new lhc((byte) 21), ((Boolean) emlVar.i.get()).booleanValue(), (byte) 5);
                ((Boolean) emlVar.i.get()).getClass();
                return new fml((gml) obj, m78Var, scheduler, scheduler2, oiVar);
            case 2:
                j8m j8mVar = (j8m) obj;
                tqw tqwVar = (tqw) obj3;
                Parcelable m6h0Var = new m6h0(j8mVar.a, j8mVar.b);
                Bundle bundle = new Bundle();
                bundle.putParcelable("martini-launch-parameters", m6h0Var);
                bundle.putBoolean("martini-open-with-keyboard", false);
                a1r0 a1r0Var = ((n8m) obj4).e;
                String str = nik1.w6.a;
                if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                    bwn0VarValueOf = ou80Var.a;
                }
                a1r0.j(a1r0Var, str, bwn0VarValueOf, bundle, false, 8);
                return rih1Var;
            case 3:
                f9m f9mVar = (f9m) obj;
                e9m e9mVar = (e9m) obj2;
                tqw tqwVar2 = (tqw) obj3;
                if (!(e9mVar instanceof c9m)) {
                    if (!(e9mVar instanceof d9m)) {
                        eg.o();
                        return null;
                    }
                    Function0 function0 = f9mVar.j;
                    if (function0 == null) {
                        return rih1Var;
                    }
                    function0.invoke();
                    return rih1Var;
                }
                g9m g9mVar = (g9m) obj4;
                String str2 = ((c9m) e9mVar).a;
                xu30 xu30Var = f9mVar.m;
                if (xu30Var != null) {
                    String strY0 = ihc1.Y0(str2, '?');
                    Set set = s4b1.f;
                    if (uic.x(strY0).c == blc0.Pg) {
                        xu30Var.invoke(str2, f9mVar.c, tqwVar2 != null ? n3o1.y(tqwVar2) : null);
                        return rih1Var;
                    }
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                    intent.addFlags(268435456);
                    g9mVar.a.startActivity(intent);
                    return rih1Var;
                } catch (Exception e) {
                    n57.s("Exception in SourceChipsElementImpl for url " + str2 + ": " + e.getMessage());
                    return rih1Var;
                }
            case 4:
                tm tmVar = (tm) obj4;
                if (!((dem) obj2).equals(dem.a)) {
                    eg.o();
                    return null;
                }
                oks oksVar = (oks) ((ynb0) tmVar.c).get();
                udm udmVar = (udm) tmVar.d;
                ki90 ki90Var = udmVar.a;
                oksVar.a(ki90Var.a, ki90Var.b, 2, udmVar.b, udmVar.c);
                return rih1Var;
            case 5:
                tqw tqwVar3 = (tqw) obj3;
                if (gfm.a[((gem) obj2).ordinal()] == 1) {
                    ((g210) obj4).d(cvl1.d(tqwVar3));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                lgm lgmVar = (lgm) obj;
                tqw tqwVar4 = (tqw) obj3;
                qj0 qj0Var = (qj0) obj4;
                vim vimVar = ((kgm) obj2).a;
                Set set2 = s4b1.f;
                String strZ = uic.C(vimVar.a, (String) null).z();
                if (strZ != null) {
                    ((lzn0) qj0Var.d).a(strZ, cvl1.d(tqwVar4), (Bundle) null);
                    lgmVar.c.invoke();
                }
                return rih1Var;
            case 7:
                eqm eqmVar = (eqm) obj;
                fqm fqmVar = (fqm) obj4;
                idd1 idd1Var = fqmVar.d;
                idd1 idd1Var2 = fqmVar.c;
                if (!((dqm) obj3).equals(dqm.a)) {
                    eg.o();
                    return null;
                }
                int iC = l1d.C(eqmVar.c);
                if (iC == 0) {
                    uvk0 uvk0Var = (uvk0) idd1Var2.getValue();
                    String str3 = eqmVar.a;
                    uvk0Var.getClass();
                    x6h1 x6h1VarC = uvk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("message", str3, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC == 1) {
                    uvk0 uvk0Var2 = (uvk0) idd1Var2.getValue();
                    String str4 = eqmVar.a;
                    uvk0Var2.getClass();
                    x6h1 x6h1VarC2 = uvk0Var2.a.c();
                    x6h1VarC2.i.add(new a7h1("message", str4, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC == 2) {
                    uvk0 uvk0Var3 = (uvk0) idd1Var2.getValue();
                    String str5 = eqmVar.a;
                    uvk0Var3.getClass();
                    x6h1 x6h1VarC4 = uvk0Var3.a.c();
                    x6h1VarC4.i.add(new a7h1("shareable_card", str5, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC == 3) {
                    uvk0 uvk0Var4 = (uvk0) idd1Var2.getValue();
                    String str6 = eqmVar.a;
                    uvk0Var4.getClass();
                    x6h1 x6h1VarC5 = uvk0Var4.a.c();
                    x6h1VarC5.i.add(new a7h1("shareable_card", str6, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iC == 4) {
                        vcl0 vcl0Var = (vcl0) idd1Var.getValue();
                        vcl0Var.getClass();
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), vcl0Var.a, r6h1.c, System.currentTimeMillis());
                    }
                    if (iC != 5) {
                        eg.o();
                        return null;
                    }
                    vcl0 vcl0Var2 = (vcl0) idd1Var.getValue();
                    vcl0Var2.getClass();
                    x6h1 x6h1VarC7 = vcl0Var2.a.c();
                    x6h1VarC7.i.add(new a7h1("reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 8:
                boh0 boh0Var = (boh0) obj2;
                wnh0 wnh0Var = (wnh0) obj3;
                bqk0 bqk0Var = (bqk0) ((pt) obj4).f;
                ynh0 ynh0Var = boh0Var.b;
                List list = boh0Var.a;
                if (wnh0Var instanceof snh0) {
                    return null;
                }
                if (wnh0Var instanceof qnh0) {
                    ynh0 ynh0Var2 = ynh0Var instanceof ynh0 ? ynh0Var : null;
                    if (ynh0Var2 == null) {
                        return null;
                    }
                    Integer numValueOf = Integer.valueOf(list.indexOf(ynh0Var2.a));
                    x6h1 x6h1VarC8 = bqk0Var.b.c();
                    x6h1VarC8.i.add(new a7h1("media_preview", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC8.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (wnh0Var instanceof rnh0) {
                    znh0 znh0Var = ynh0Var instanceof znh0 ? (znh0) ynh0Var : null;
                    if (znh0Var == null) {
                        return null;
                    }
                    Integer numValueOf2 = Integer.valueOf(list.indexOf(znh0Var.a));
                    x6h1 x6h1VarC9 = bqk0Var.b.c();
                    x6h1VarC9.i.add(new a7h1("media_preview", (String) null, numValueOf2, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                if (wnh0Var instanceof pnh0) {
                    return null;
                }
                if (wnh0Var instanceof unh0) {
                    ynh0 ynh0Var3 = ynh0Var instanceof ynh0 ? ynh0Var : null;
                    if (ynh0Var3 == null) {
                        return null;
                    }
                    Integer numValueOf3 = Integer.valueOf(list.indexOf(ynh0Var3.a));
                    x6h1 x6h1VarC10 = bqk0Var.b.c();
                    x6h1VarC10.i.add(new a7h1("media_preview", (String) null, numValueOf3, (String) null, (String) null));
                    x6h1VarC10.j = true;
                    return new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                }
                if (wnh0Var instanceof vnh0) {
                    ynh0 ynh0Var4 = ynh0Var instanceof ynh0 ? ynh0Var : null;
                    if (ynh0Var4 == null) {
                        return null;
                    }
                    Integer numValueOf4 = Integer.valueOf(list.indexOf(ynh0Var4.a));
                    x6h1 x6h1VarC11 = bqk0Var.b.c();
                    x6h1VarC11.i.add(new a7h1("media_preview", (String) null, numValueOf4, (String) null, (String) null));
                    x6h1VarC11.j = true;
                    return new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(wnh0Var instanceof tnh0)) {
                    eg.o();
                    return null;
                }
                if (ynh0Var instanceof ynh0) {
                    Integer numValueOf5 = Integer.valueOf(list.indexOf(ynh0Var.a));
                    x6h1 x6h1VarC12 = bqk0Var.b.c();
                    x6h1VarC12.i.add(new a7h1("media_preview", (String) null, numValueOf5, (String) null, (String) null));
                    x6h1VarC12.j = true;
                    return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("download_file", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(ynh0Var instanceof znh0)) {
                    if (ynh0Var instanceof xnh0) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                Integer numValueOf6 = Integer.valueOf(list.indexOf(((znh0) ynh0Var).a));
                x6h1 x6h1VarC13 = bqk0Var.b.c();
                x6h1VarC13.i.add(new a7h1("media_preview", (String) null, numValueOf6, (String) null, (String) null));
                x6h1VarC13.j = true;
                return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("download_file", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
            case 9:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str7 = ((zrm) obj4).a;
                uwr uwrVar = cbx.a;
                uwo1.e(str7, (qim0) null, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2042);
                return rih1Var;
            case 10:
                yvm yvmVar = (yvm) obj;
                tqw tqwVar5 = (tqw) obj3;
                if (!((xvm) obj2).equals(xvm.a)) {
                    eg.o();
                    return null;
                }
                if (!yvmVar.b) {
                    return rih1Var;
                }
                pcf.a(((sve) obj4).b, pcf.j(yvmVar.a.a), tqwVar5 != null ? n3o1.y(tqwVar5) : null, (Bundle) null);
                return rih1Var;
            case 11:
                ((e0n) obj4).a.invoke((c0n) obj2);
                return rih1Var;
            case 12:
                hsl1 hsl1Var = (hsl1) obj2;
                s4n s4nVar = (s4n) obj4;
                ViewGroup.LayoutParams layoutParams = s4nVar.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    return null;
                }
                h3n h3nVar = (h3n) layoutParams;
                int i = hsl1Var.a.i(519).d;
                bwn0VarValueOf = i > s4nVar.b ? Integer.valueOf(i) : null;
                ((ViewGroup.MarginLayoutParams) h3nVar).height = bwn0VarValueOf != null ? bwn0VarValueOf.intValue() : 0;
                s4nVar.setLayoutParams(h3nVar);
                return hsl1Var;
            case 13:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                hma1 hma1VarEdit = ((mjn) ((fp8) obj4).b).a.edit();
                hma1VarEdit.a(mjn.c, zBooleanValue);
                hma1VarEdit.g();
                return new it61(bool);
            case 14:
                oln olnVar = (oln) obj2;
                tqw tqwVar6 = (tqw) obj3;
                qln qlnVar = ((pln) obj).a;
                boolean z = qlnVar instanceof qln;
                oln olnVar2 = oln.a;
                if (z) {
                    if (olnVar.equals(olnVar2)) {
                        a1r0 a1r0Var2 = ((tln) obj4).a;
                        String str8 = qlnVar.a;
                        tv80 tv80VarY = tqwVar6 != null ? n3o1.y(tqwVar6) : null;
                        Set set3 = s4b1.f;
                        String strH = pcf.h(uic.C(str8, (String) null));
                        if (strH != null) {
                            Set set4 = s4b1.f;
                            String strE = pcf.e(uic.x(strH));
                            if (tv80VarY != null && (ou80Var2 = tv80VarY.a) != null) {
                                bwn0VarValueOf = ou80Var2.a;
                            }
                            a1r0.j(a1r0Var2, strE, bwn0VarValueOf, mno1.h(new mmr0[]{new mmr0("OnPlatformShareData", new g7q0(strH))}), false, 8);
                            return rih1Var;
                        }
                        hhg1.n("Required value was null.");
                    } else {
                        eg.o();
                    }
                } else {
                    if ((qlnVar instanceof rln) && olnVar.equals(olnVar2)) {
                        ((rln) qlnVar).b.invoke(tqwVar6 != null ? n3o1.y(tqwVar6) : null);
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            case 15:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                xj1 xj1Var = (xj1) obj4;
                jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                na9 na9Var = new na9(xj1Var.a, (byte) 15);
                rih1 rih1Var2 = rih1.a;
                otw.c(na9Var, rih1Var2, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var3.r(true);
                return rih1Var2;
            case 16:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(2, (wux) null, apo.r(1129935214, new g1o((x6o) obj, (z6o) obj4, (byte) 2), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case 17:
                dgo dgoVar = (dgo) obj;
                cgo cgoVar = (cgo) obj2;
                if (!(cgoVar instanceof cgo)) {
                    eg.o();
                    return null;
                }
                res resVar = (res) obj4;
                llm llmVar = (llm) resVar.h;
                if (llmVar != null) {
                    fn31.T(llmVar, (o8n) null, 0, new hxn(cgoVar, dgoVar, resVar, (lnm) null, (byte) 2), 3);
                    return rih1Var;
                }
                u890.C("scope");
                throw null;
            case 18:
                ((Number) obj3).intValue();
                rso rsoVar = (rso) obj4;
                rsoVar.d.a(rsoVar.a, rsoVar.b.e, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            case 19:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uwo1.e(((ouo) obj4).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 20:
                bvo bvoVar = (bvo) obj;
                tqw tqwVar7 = (tqw) obj3;
                if (((avo) obj2).equals(avo.a)) {
                    pcf.a((lzn0) ((qj0) obj4).d, pcf.j(bvoVar.c.a.a), tqwVar7 != null ? n3o1.y(tqwVar7) : null, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 21:
                ((ez01) ((br0) obj4).c).d();
                return rih1Var;
            case 22:
                x5r x5rVar = (x5r) obj;
                u5r u5rVar = (w5r) obj2;
                tqw tqwVar8 = (tqw) obj3;
                ldo ldoVar = (ldo) obj4;
                if (u5rVar instanceof u5r) {
                    u5r u5rVar2 = u5rVar;
                    ((l8s) ldoVar.d).c(new ijo0(new mx81(u5rVar2.a, 2, 4, (Long) null, 166), u5rVar2.b, (w4f1) null, 12));
                    return rih1Var;
                }
                if (u5rVar instanceof v5r) {
                    b6r b6rVar = x5rVar.t;
                    if (b6rVar instanceof z5r) {
                        xf60 xf60Var = (xf60) ldoVar.c;
                        z5r z5rVar = (z5r) b6rVar;
                        cmt cmtVar = z5rVar.a;
                        String str9 = z5rVar.b;
                        String str10 = x5rVar.h;
                        Timestamp timestamp = x5rVar.g;
                        xf60Var.a(cmtVar, str9, new uf60(timestamp.q(), timestamp.p(), str10), tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                        return rih1Var;
                    }
                    if (b6rVar instanceof a6r) {
                        ((bpb1) ((u6x) ldoVar.e).b).m((Object) null, Boolean.TRUE);
                        return rih1Var;
                    }
                    if (b6rVar instanceof y5r) {
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    eg.o();
                }
                return null;
            case 23:
                h6r h6rVar = (h6r) obj;
                tqw tqwVar9 = (tqw) obj3;
                if (!((g6r) obj2).equals(g6r.a)) {
                    eg.o();
                    return null;
                }
                j6r j6rVar = (j6r) obj4;
                String strE2 = j6r.e(h6rVar.a);
                tv80 tv80VarY2 = tqwVar9 != null ? n3o1.y(tqwVar9) : null;
                lzn0 lzn0Var = j6rVar.b;
                if (tv80VarY2 != null) {
                    lzn0Var.a(strE2, tv80VarY2, (Bundle) null);
                    return rih1Var;
                }
                lzn0Var.h(strE2);
                return rih1Var;
            case 24:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var7.i0(-660979328);
                    cvx cvxVar = cbx.b(x340Var7).b;
                    x340Var7.r(false);
                    p3v p3vVar = (p3v) obj4;
                    if (p3vVar == null) {
                        x340Var7.i0(-660977664);
                        cvx cvxVar2 = cbx.b(x340Var7).b;
                        x340Var7.r(false);
                        f = 8.0f;
                    } else {
                        x340Var7.i0(-660978191);
                        x340Var7.r(false);
                        f = p3vVar.a;
                    }
                    p6p1.g(uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, f, 5), x340Var7, 0);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 25:
                Boolean bool2 = (Boolean) obj2;
                boolean zBooleanValue2 = bool2.booleanValue();
                aod aodVar = (aod) ((vun) obj4).b;
                hma1 hma1VarEdit2 = ((dma1) aodVar.b).edit();
                hma1VarEdit2.a(q3l.a, zBooleanValue2);
                hma1VarEdit2.h();
                xid xidVar = (xid) ((uq8) aodVar.c).b;
                i8h1 i8h1Var = (i8h1) xidVar.b;
                x6h1 x6h1VarC14 = ((txk0) ((l2a) xidVar.c).b).b.c();
                x6h1VarC14.i.add(new a7h1("device_lock_screen_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return new it61(bool2);
            case 26:
                hqn hqnVar = (hqn) obj;
                tqw tqwVar10 = (tqw) obj3;
                rqr rqrVar = (rqr) obj4;
                String str11 = hqnVar.a;
                if (pqr.a[((gqn) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                rqrVar.a.a(true, new cqn((String) null, (String) null, new zpn(false, (List) null, str11.length() == 0 ? z6x.a : Collections.singletonList(str11), (List) null, rqrVar.b.a, hqnVar.b, (ypn) null, false, 1839), 3), tqwVar10 != null ? n3o1.y(tqwVar10) : null);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                fz01 fz01Var = (fz01) obj2;
                ft30 ft30Var = ((dtr) obj4).b;
                if (fz01Var == fz01.a) {
                    ft30Var.invoke(jp3.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 28:
                tqw tqwVar11 = (tqw) obj3;
                na9 na9Var2 = (na9) obj4;
                if (!((o7r) obj2).equals(o7r.a)) {
                    eg.o();
                    return null;
                }
                lzn0 lzn0Var2 = na9Var2.b;
                tv80 tv80VarY3 = tqwVar11 != null ? n3o1.y(tqwVar11) : null;
                if (tv80VarY3 == null) {
                    n57.e("Daylist: section element interactionId should not be null");
                }
                lzn0Var2.f(new dwn0("spotify:playlist:37i9dQZF1EP6YuccBxUcC1", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY3 != null ? new bwn0(tv80VarY3) : null));
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                otw.c((tm) ((iir) obj4).c, new fzu((Function0) null, itu.a, 1), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mgl(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }
}
