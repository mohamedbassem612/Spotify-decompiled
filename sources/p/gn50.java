package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gn50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn50(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:136:0x0470  */
    /* JADX WARN: Code duplicated, block: B:343:0x0473 A[SYNTHETIC] */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        String str;
        xfh0 xfh0Var;
        xfh0 xfh0Var2;
        int i2;
        cr31 zvxVar;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 16;
        int iIntValue = 0;
        iIntValue = 0;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        tv80 tv80VarY = null;
        switch (b) {
            case 0:
                an50 an50Var = (an50) obj3;
                hn50 hn50Var = (hn50) obj4;
                int i3 = ((cn50) obj2).c;
                if (an50Var.equals(vm50.a)) {
                    uvk0 uvk0VarE = hn50Var.e();
                    uvk0VarE.getClass();
                    x6h1 x6h1VarC = uvk0VarE.a.c();
                    x6h1VarC.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "on_platform"));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("reject_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (an50Var.equals(xm50.a)) {
                    uvk0 uvk0VarE2 = hn50Var.e();
                    uvk0VarE2.getClass();
                    x6h1 x6h1VarC3 = uvk0VarE2.a.c();
                    x6h1VarC3.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "on_platform"));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                if (an50Var.equals(sm50.a)) {
                    if ((i3 == 0 ? -1 : fn50.a[l1d.C(i3)]) == 1) {
                        uvk0 uvk0VarE3 = hn50Var.e();
                        uvk0VarE3.getClass();
                        x6h1 x6h1VarC5 = uvk0VarE3.a.c();
                        x6h1VarC5.i.add(new a7h1("group_someone_blocked_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("accept_chat", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                    }
                    uvk0 uvk0VarE4 = hn50Var.e();
                    uvk0VarE4.getClass();
                    x6h1 x6h1VarC6 = uvk0VarE4.a.c();
                    x6h1VarC6.i.add(new a7h1("join_group_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("accept_chat", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                if (an50Var.equals(um50.a)) {
                    if ((i3 == 0 ? -1 : fn50.a[l1d.C(i3)]) == 1) {
                        uvk0 uvk0VarE5 = hn50Var.e();
                        uvk0VarE5.getClass();
                        x6h1 x6h1VarC7 = uvk0VarE5.a.c();
                        x6h1VarC7.i.add(new a7h1("group_someone_blocked_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    }
                    uvk0 uvk0VarE6 = hn50Var.e();
                    uvk0VarE6.getClass();
                    x6h1 x6h1VarC8 = uvk0VarE6.a.c();
                    x6h1VarC8.i.add(new a7h1("join_group_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (an50Var.equals(tm50.a)) {
                    uvk0 uvk0VarE7 = hn50Var.e();
                    uvk0VarE7.getClass();
                    x6h1 x6h1VarC9 = uvk0VarE7.a.c();
                    x6h1VarC9.i.add(new a7h1("group_someone_blocked_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_chat", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                if (an50Var.equals(qm50.a)) {
                    uvk0 uvk0VarE8 = hn50Var.e();
                    uvk0VarE8.getClass();
                    x6h1 x6h1VarC10 = uvk0VarE8.a.c();
                    x6h1VarC10.i.add(new a7h1("delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_chat", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                }
                if (an50Var.equals(rm50.a)) {
                    uvk0 uvk0VarE9 = hn50Var.e();
                    uvk0VarE9.getClass();
                    x6h1 x6h1VarC11 = uvk0VarE9.a.c();
                    x6h1VarC11.i.add(new a7h1("delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!an50Var.equals(ym50.a)) {
                    if ((an50Var instanceof wm50) || (an50Var instanceof zm50)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                uvk0 uvk0VarE10 = hn50Var.e();
                uvk0VarE10.getClass();
                x6h1 x6h1VarC12 = uvk0VarE10.a.c();
                x6h1VarC12.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "on_platform"));
                x6h1VarC12.j = true;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("manage_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                y6h1 y6h1VarA = x6h1VarC13.a();
                String str2 = nik1.e1.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 1:
                tqw tqwVar = (tqw) obj3;
                if (!((ln50) obj2).equals(ln50.a)) {
                    eg.o();
                    return null;
                }
                nn50 nn50Var = (nn50) obj4;
                pcf.a(nn50Var.a, l1d.m("spotify:listening-activity:group-audience-selection:", nn50Var.b), tqwVar != null ? n3o1.y(tqwVar) : null, (Bundle) null);
                return rih1Var;
            case 2:
                un50 un50Var = (un50) obj;
                tqw tqwVar2 = (tqw) obj3;
                if (((tn50) obj2).equals(tn50.a)) {
                    pcf.a(((wn50) obj4).a, un50Var.b, tqwVar2 != null ? n3o1.y(tqwVar2) : null, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                kq50 kq50Var = (kq50) obj;
                tqw tqwVar3 = (tqw) obj3;
                if (!((jq50) obj2).equals(jq50.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar3 == null) {
                    return rih1Var;
                }
                ((lzn0) ((umf0) obj4).e).a(kq50Var.a.b, n3o1.y(tqwVar3), (Bundle) null);
                return rih1Var;
            case 4:
                tqw tqwVar4 = (tqw) obj3;
                ((c4z) ((sbk) obj4).e).invoke((uy50) obj2, tqwVar4 != null ? n3o1.y(tqwVar4).a : null);
                return rih1Var;
            case 5:
                ((u060) obj4).a.b((f060) obj2);
                return rih1Var;
            case 6:
                ((l260) obj4).c.invoke((yyq) obj, (b0k) obj2, Integer.valueOf(14 & ((Number) obj3).intValue()));
                return rih1Var;
            case 7:
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH.a, q5t0VarH.b, b7xVar, new fz40((v260) obj4, q5t0VarH, b2));
            case 8:
                tqw tqwVar5 = (tqw) obj3;
                String str3 = ((k460) obj).e;
                if (!((j460) obj2).equals(j460.a)) {
                    eg.o();
                    return null;
                }
                if (str3 == null) {
                    return rih1Var;
                }
                if ((!ihc1.y0(str3) ? str3 : null) == null) {
                    return rih1Var;
                }
                ((l460) obj4).a.a(str3, tqwVar5 != null ? n3o1.y(tqwVar5) : null, (Bundle) null);
                return rih1Var;
            case 9:
                s460 s460Var = (s460) obj;
                r460 r460Var = (r460) obj2;
                tqw tqwVar6 = (tqw) obj3;
                w460 w460Var = (w460) obj4;
                a1r0 a1r0Var = w460Var.b;
                String str4 = s460Var.d;
                if (!r460Var.equals(p460.a)) {
                    if (!r460Var.equals(q460.a)) {
                        eg.o();
                        return null;
                    }
                    Function0 function0 = w460Var.c;
                    if (function0 == null) {
                        return rih1Var;
                    }
                    function0.invoke();
                    return rih1Var;
                }
                if (str4 == null) {
                    return rih1Var;
                }
                if ((!ihc1.y0(str4) ? str4 : null) == null) {
                    return rih1Var;
                }
                if (s460Var.g && a1r0Var != null) {
                    a1r0.m(a1r0Var, str4, tqwVar6 != null ? n3o1.y(tqwVar6) : null, (Bundle) null, 12);
                    return rih1Var;
                }
                mjm mjmVar = w460Var.a;
                if (mjmVar == null) {
                    return rih1Var;
                }
                mjmVar.a(str4, tqwVar6 != null ? n3o1.y(tqwVar6) : null, (Bundle) null);
                return rih1Var;
            case 10:
                t660 t660Var = (t660) obj;
                q660 q660Var = (r660) obj2;
                tqw tqwVar7 = (tqw) obj3;
                u660 u660Var = (u660) obj4;
                if (!(q660Var instanceof p660)) {
                    if (q660Var instanceof q660) {
                        z710.d(u660Var.b, q660Var.a, false, 6);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                if (tqwVar7 == null) {
                    return rih1Var;
                }
                tv80 tv80VarY2 = n3o1.y(tqwVar7);
                String str5 = t660Var.h;
                if (str5 == null) {
                    return rih1Var;
                }
                u660Var.a.z(str5, tv80VarY2);
                return rih1Var;
            case 11:
                vb60 vb60Var = (vb60) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                xb60 xb60Var = (xb60) obj4;
                xb60Var.g.a(new yxe1(new ehc1(vb60Var.a)));
                ArrayList arrayList = vb60Var.b;
                ArrayList arrayList2 = vb60Var.e;
                cmt cmtVar = vb60Var.c;
                String str6 = vb60Var.d;
                zb60 zb60Var = xb60Var.b;
                String str7 = zb60Var.b;
                Long l = zb60Var.a;
                smo1.f(arrayList, cmtVar, str6, str7, l == null ? "spotify:listeningstats:insights:current" : "spotify:listeningstats:insights:" + l, xb60Var.c, xb60Var.d, (qim0) null, arrayList2, b0kVar, 134217728);
                return rih1Var;
            case 12:
                fc60 fc60Var = (fc60) obj;
                tqw tqwVar8 = (tqw) obj3;
                if (!((ec60) obj2).equals(ec60.a)) {
                    eg.o();
                    return null;
                }
                gc60 gc60Var = (gc60) obj4;
                if (gc60Var.c) {
                    gc60Var.b.a(fc60Var.c, fc60Var.b, new sf60(fc60Var.a, fc60Var.d), tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                    return rih1Var;
                }
                Toast.makeText(gc60Var.a, "Coming soon", 0).show();
                return rih1Var;
            case 13:
                hd60 hd60Var = (hd60) obj;
                tqw tqwVar9 = (tqw) obj3;
                String str8 = hd60Var.i;
                if (str8 != null) {
                    lzn0 lzn0Var = ((id60) obj4).a;
                    Parcelable.Creator creator = lik1.CREATOR;
                    if (oap1.o(str8)) {
                        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("highlight_id", hd60Var.a)});
                        if (tqwVar9 != null) {
                            lzn0Var.a(str8, n3o1.y(tqwVar9), bundleH);
                        } else {
                            lzn0Var.g(bundleH, str8);
                        }
                    }
                }
                return rih1Var;
            case 14:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(((hjl) obj3).a);
                float f = q5t0VarH2.a;
                float f2 = ((zqz0) obj4).c;
                return ifh0Var.S(jch0.U((1.0f - Math.abs(f2)) * f), q5t0VarH2.b, b7xVar, new wb5(q5t0VarH2, jch0.U(q5t0VarH2.a * (f2 <= 0.0f ? f2 : 0.0f)), (byte) 14));
            case 15:
                tqw tqwVar10 = (tqw) obj3;
                if (eh60.a[((ch60) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                tm tmVar = (tm) obj4;
                ((tbn) tmVar.e).a.a(t5p1.q((String) tmVar.c), cvl1.d(tqwVar10), (Bundle) null);
                return rih1Var;
            case 16:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uzm uzmVar = new uzm(0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                ((bm00) obj4).a(uzmVar, aqb0.b((aqb0) obj, uyn1.z(16.0f, 0.0f, 2, nim0Var), (pxg1) null, (ni20) null, 7), b0kVar2, 0);
                return rih1Var;
            case 17:
                if (!((aj60) obj2).equals(aj60.a)) {
                    eg.o();
                    return null;
                }
                ug3 ug3Var = (ug3) obj4;
                Activity activity = (Activity) ug3Var.d;
                pbh0 pbh0Var = new pbh0(activity, 0);
                ((uh3) pbh0Var).a.f = activity.getString(2131953910);
                pbh0Var.d(2131953912, new oad(ug3Var, (byte) 15)).c(2131953911, k6b.h).create().show();
                return rih1Var;
            case 18:
                ft70 ft70Var = (ft70) obj;
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                ht70 ht70Var = (ht70) obj4;
                nl9 nl9Var = ht70Var.d;
                List<zvh> list = ft70Var.h;
                ArrayList arrayList3 = new ArrayList();
                for (zvh zvhVar : list) {
                    List<rzh> list2 = zvhVar.b;
                    String str9 = zvhVar.a;
                    ArrayList arrayList4 = new ArrayList();
                    for (rzh rzhVar : list2) {
                        blb blbVar = rzhVar.c;
                        if (blbVar instanceof blb) {
                            blb blbVar2 = blbVar;
                            str = str9;
                            xfh0Var2 = new xfh0(rzhVar.a, 1, blbVar2.a, blbVar2.b, blbVar2.c, str);
                        } else {
                            str = str9;
                            if (blbVar instanceof clb) {
                                clb clbVar = (clb) blbVar;
                                xfh0Var2 = new xfh0(rzhVar.a, 2, clbVar.a, clbVar.b, clbVar.c, str);
                            } else {
                                xfh0Var = null;
                            }
                            if (xfh0Var != null) {
                                arrayList4.add(xfh0Var);
                            }
                            str9 = str;
                        }
                        xfh0Var = xfh0Var2;
                        if (xfh0Var != null) {
                            arrayList4.add(xfh0Var);
                        }
                        str9 = str;
                    }
                    r7h.W(arrayList4, arrayList3);
                }
                lt70 lt70Var = ht70Var.b;
                String str10 = lt70Var.b;
                if (str10 != null) {
                    Iterator it = arrayList3.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (((xfh0) it.next()).b.equals(str10)) {
                            i = i4;
                        } else {
                            i4++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    if (i < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                int i5 = iIntValue;
                String str11 = ft70Var.i;
                String str12 = lt70Var.a;
                Set set = s4b1.f;
                otw.c(nl9Var, new ys70(i5, str11, str12, uic.x(str12).c == blc0.fh ? lt70Var.a : null, arrayList3), (qim0) null, (ipb1) null, b0kVar3, 0, 12);
                return rih1Var;
            case 19:
                x340 x340Var = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Uri uri = Uri.parse(((ot70) obj4).a);
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    eso1.e(uri, isl.a, u291.q(0.0f, 1, u291.h(nim0Var, 32.0f)), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var2, 1797168, 0, 3456);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 20:
                aw70 aw70Var = (aw70) obj;
                n600 n600Var = (n600) obj2;
                tqw tqwVar11 = (tqw) obj3;
                iv70 iv70Var = (iv70) obj4;
                if (n600Var instanceof wzz) {
                    iv70Var.b.a(aw70Var.h, cvl1.d(tqwVar11), (Bundle) null);
                    return rih1Var;
                }
                if (n600Var instanceof yzz) {
                    vgm.b(iv70Var.c, aw70Var.h, (String) null, cvl1.d(tqwVar11), new tgm((String) null, false, true, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, !aw70Var.r, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -16777223, 1), 2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 21:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                cu70 cu70Var = (cu70) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str13 = cu70Var.b;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var4).k;
                    long j = cbx.a(x340Var4).b.a;
                    bu70 bu70Var = cu70Var.h;
                    uwo1.e(str13, qim0VarF, lee1Var, j, new a0e1(3), (iu30) null, 2, false, new cjc0(bu70Var != null ? bu70Var.b : 1), 0, (qx8) null, x340Var4, 1572912, 0, 1696);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 22:
                ps70 ps70Var = (ps70) obj;
                if (!((os70) obj2).equals(os70.a)) {
                    eg.o();
                    return null;
                }
                if (!ps70Var.i) {
                    return rih1Var;
                }
                ((zrg) ((rt01) obj4).c).b(ps70Var.b, ps70Var.d);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                cc80 cc80Var = (cc80) obj;
                if (((bc80) obj2).equals(bc80.a)) {
                    ((dc80) obj4).a.invoke(cc80Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 24:
                zf80 zf80Var = (zf80) obj;
                tqw tqwVar12 = (tqw) obj3;
                if (((yf80) obj2) instanceof yf80) {
                    ((lzn0) ((cm0) obj4).c).a(zf80Var.a, cvl1.d(tqwVar12), (Bundle) null);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                si80 mi80Var = (si80) obj2;
                tqw tqwVar13 = (tqw) obj3;
                if (mi80Var instanceof mi80) {
                    mi80 mi80Var2 = (mi80) mi80Var;
                    tv80 tv80Var = mi80Var2.b;
                    if (tv80Var != null) {
                        tv80VarY = tv80Var;
                    } else if (tqwVar13 != null) {
                        tv80VarY = n3o1.y(tqwVar13);
                    }
                    mi80Var = new mi80(mi80Var2.a, tv80VarY);
                }
                ((xi80) obj4).g.invoke(mi80Var);
                return rih1Var;
            case 26:
                yl80 yl80Var = (yl80) obj;
                tl80 tl80Var = (tl80) obj2;
                yxb0 yxb0Var = (yxb0) obj4;
                if (tl80Var instanceof rl80) {
                    rl80 rl80Var = (rl80) tl80Var;
                    View view = rl80Var.a;
                    int iOrdinal = rl80Var.b.ordinal();
                    if (iOrdinal == 0) {
                        i2 = 2131963627;
                    } else if (iOrdinal == 1) {
                        i2 = 2131963602;
                    } else {
                        eg.o();
                    }
                    ijo0 ijo0Var = new ijo0(new mx81(view.getContext().getString(i2), 2, 6, (Long) null, 166), view, (w4f1) null, 12);
                    fii1 fii1Var = (fii1) yxb0Var.f;
                    ((vku) fii1Var.b.getValue()).a(fii1Var.a.c(ijo0Var).toObservable().subscribe(new z2a1(fii1Var, (byte) 28)));
                    return rih1Var;
                }
                if (tl80Var instanceof sl80) {
                    int iOrdinal2 = yl80Var.a.ordinal();
                    if (iOrdinal2 == 0) {
                        ((ytp0) yxb0Var.c).C(((sl80) tl80Var).a).subscribe();
                        return rih1Var;
                    }
                    if (iOrdinal2 == 1) {
                        Parcelable.Creator creator2 = lik1.CREATOR;
                        String str14 = ((sl80) tl80Var).a;
                        if (oap1.o(str14)) {
                            ((lzn0) yxb0Var.d).f(new dwn0(str14, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                            return rih1Var;
                        }
                        v8i0.j("Invalid URI, won't navigate. Uri: ", str14);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    eg.o();
                }
                return null;
            case 27:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(1303743841);
                int iOrdinal3 = ((zl80) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    x340Var5.i0(-1232616440);
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar = cbx.b(x340Var5).f;
                    cua cuaVar2 = cbx.b(x340Var5).f;
                    zvxVar = new zvx();
                    x340Var5.r(false);
                } else {
                    if (iOrdinal3 != 1) {
                        throw p3d1.k(x340Var5, -1232618414, false);
                    }
                    x340Var5.i0(-1232614948);
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var5).f;
                    zvxVar = er31.b(16.0f);
                    x340Var5.r(false);
                }
                qim0 qim0VarQ = i1p1.q(qim0Var, zvxVar);
                x340Var5.r(false);
                return qim0VarQ;
            case 28:
                so80 so80Var = (so80) obj;
                tqw tqwVar14 = (tqw) obj3;
                res resVar = (res) obj4;
                String str15 = so80Var.c;
                if (ihc1.y0(str15)) {
                    str15 = null;
                }
                if (str15 != null) {
                    ((iu30) resVar.g).invoke(str15);
                }
                if (((di4) resVar.f).L()) {
                    tg80 tg80Var = (tg80) resVar.e;
                    String str16 = so80Var.j;
                    String str17 = so80Var.k;
                    String str18 = so80Var.l;
                    tv80 tv80VarY3 = tqwVar14 != null ? n3o1.y(tqwVar14) : null;
                    llm llmVar = tg80Var.k;
                    String str19 = tg80Var.j;
                    if (str19 != null && u890.j(tg80Var.i, str16)) {
                        fn31.T(llmVar, (o8n) null, 0, new f530(tg80Var, str19, tv80VarY3, (lnm) null, (byte) 24), 3);
                    } else if (tg80Var.l.k(Boolean.FALSE, Boolean.TRUE)) {
                        fn31.T(llmVar, (o8n) null, 0, new og5((byte) 20, tg80Var, str16, tv80VarY3, str17, str18, (lnm) null), 3);
                    }
                } else {
                    ((iu30) resVar.h).invoke(new xz41(so80Var.j, so80Var.b, so80Var.k, so80Var.l, tqwVar14 != null ? n3o1.y(tqwVar14) : null));
                }
                return rih1Var;
            default:
                tqw tqwVar15 = (tqw) obj3;
                ((nt80) obj4).a.invoke(((mt80) obj).a, tqwVar15 != null ? n3o1.y(tqwVar15) : null);
                return rih1Var;
        }
    }
}
