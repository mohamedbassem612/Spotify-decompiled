package p;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.libs.sociallistening.events.proto.JamResolveTokenResult;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iv81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv81(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.o2u0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, p.op80] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p.op80, p.q6x] */
    public final Object invoke(Object obj) throws Exception {
        rih1 rih1Var;
        ?? r0;
        op80 op80Var;
        byte b = this.a;
        byte b2 = 27;
        byte b3 = 4;
        byte b4 = 10;
        Object poa1Var = null;
        rih1 rih1Var2 = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((d781) obj3).invoke(th);
                bbc bbcVar = (bbc) ((y441) obj2).c;
                bbcVar.e(th, false);
                do {
                    Object objB = qge.b(bbcVar.x());
                    if (objB == null) {
                        rih1Var = null;
                    } else {
                        t091 t091Var = (u091) objB;
                        if (t091Var instanceof t091) {
                            t091Var.b.y0(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        }
                        rih1Var = rih1Var2;
                    }
                } while (rih1Var != null);
                return rih1Var2;
            case 1:
                op80 op80Var2 = (op80) obj;
                vu30 vu30Var = (vu30) ((hz81) obj3).c.get(obj2.getClass());
                if (vu30Var == null || (op80Var = (op80) vu30Var.invoke(obj2, op80Var2)) == null) {
                    r0 = op80Var;
                    r0 = q6x.b;
                }
                r0 = op80Var;
                ?? r1 = q6x.b;
                if ((r0.equals(r1) && r1.equals(r1)) || r0.equals(r1)) {
                    return r1;
                }
                return r1.equals(r1) ? r0 : new wch((op80) r0, (op80) r1);
            case 2:
                er91 er91Var = (er91) obj2;
                aa91 aa91Var = (aa91) obj3;
                kt91 kt91Var = aa91Var.d;
                if (!kt91Var.g() || aa91Var.f.h(aa91Var.a)) {
                    kt91Var.o(er91Var);
                } else {
                    kt91Var.k(er91Var);
                }
                return rih1Var2;
            case 3:
                p5t0 p5t0Var = (p5t0) obj;
                qqt qqtVar = (qqt) obj2;
                p5t0Var.f((q5t0) obj3, p5t0Var.i0(qqtVar.c), p5t0Var.i0(qqtVar.d), 0.0f);
                return rih1Var2;
            case 4:
                ((Boolean) obj).getClass();
                ((iu30) obj3).invoke(((oh91) obj2).a);
                return rih1Var2;
            case 5:
                o4o1.o((y2s) obj, (kdn0) ((vh) obj3).b, new d781((vyf1) obj2, b2));
                return rih1Var2;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                ((kt91) obj3).getClass();
                return kt91.f((g0i) obj2, iIntValue);
            case 7:
                p5t0.u((p5t0) obj, (q5t0) obj3, 0, 0, new dv91((ev91) obj2, (byte) 0), 4);
                return rih1Var2;
            case 8:
                dhl dhlVar = (dhl) obj;
                ihl ihlVar = dhlVar.c;
                unb0 unb0Var = (unb0) obj3;
                ube ubeVar = dhlVar.e;
                if (unb0Var == unb0.a) {
                    yf.p(ubeVar, ((ihl) obj2).g, 0.0f, 6);
                    dhl.d(dhlVar, ihlVar.d, ihlVar.f, 124);
                } else {
                    yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                    xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                }
                hrt.m((p3v) null, "wrap", dhlVar, (p3v) null, "wrap");
                return rih1Var2;
            case 9:
                d1a0 d1a0Var = (d1a0) obj;
                t2j0 t2j0Var = ((my91) obj3).d.a;
                a1a0 a1a0VarP = JamResolveTokenResult.p();
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cot) it.next()).a);
                }
                a1a0VarP.q(arrayList);
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((cot) it2.next()).b);
                }
                a1a0VarP.n(arrayList2);
                if (d1a0Var instanceof b1a0) {
                    a1a0VarP.s("client");
                    String strR = rc11.a.b(((b1a0) d1a0Var).a.getClass()).r();
                    a1a0VarP.t(strR != null ? strR : "Unknown");
                } else {
                    if (!(d1a0Var instanceof c1a0)) {
                        eg.o();
                        return null;
                    }
                    a1a0VarP.s("server");
                    c1a0 c1a0Var = (c1a0) d1a0Var;
                    int i = c1a0Var.a;
                    String str = c1a0Var.b;
                    a1a0VarP.t(i + ":" + (str != null ? str : "Unknown"));
                }
                t2j0Var.a(a1a0VarP.build());
                return rih1Var2;
            case 10:
                ComposeView composeView = (ComposeView) obj3;
                composeView.setViewCompositionStrategy(p5x0.W0);
                composeView.setContent(new j2i(-1458498657, new t0a1((xu30) obj, (ym90) obj2, (byte) 1), true));
                return rih1Var2;
            case 11:
                ym90 ym90Var = new ym90(obj);
                ((x0a1) obj3).b(new iv81((ComposeView) obj2, ym90Var, b4));
                return ym90Var;
            case 12:
                Object obj4 = ((u0a1) obj3).i2;
                if (obj4 != null) {
                    ((wh91) obj2).invoke(obj4, obj);
                }
                return rih1Var2;
            case 13:
                e261 e261Var = (e261) obj;
                String str2 = (String) obj3;
                atb1 atb1Var = (atb1) obj2;
                b261.n(e261Var, str2 != null ? xcg1.i(atb1Var.f, ". ", str2) : atb1Var.f);
                b261.x(e261Var, 0);
                return rih1Var2;
            case 14:
                i7a1 i7a1Var = (i7a1) obj3;
                ArrayList arrayList3 = i7a1Var.a.d;
                ((rtb0) obj).e(arrayList3.size(), new qbb0(arrayList3, (byte) 27), new qbb0(arrayList3, (byte) 28), new j2i(802480018, new d311(b3, i7a1Var, (iu30) obj2, arrayList3), true));
                return rih1Var2;
            case 15:
                return d3p1.H((d0r) obj3, ((z8a1) obj2).a, (w8a1) obj);
            case 16:
                return new u6a1(((pic1) obj).a, ((u7h) obj3).a, (s6a1) obj2, 4);
            case 17:
                ((z6c) obj2).a.a(f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0((String) obj3, new String[]{":"}, 0, 6)), ":dna:report"), (tv80) obj, (Bundle) null);
                return rih1Var2;
            case 18:
                h9a1 h9a1Var = h9a1.O0;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(fca1.class, new r3r((tyq) obj3, h9a1Var, 4));
                linkedHashMap.put(eca1.class, new r3r((tyq) obj2, h9a1.P0, 4));
                return rih1Var2;
            case 19:
                jp80 jp80VarA = ((op80) obj).a(vgp1.R0);
                Function0 function0 = jp80VarA != null ? jp80VarA.c : null;
                if (function0 != null) {
                    return new jp80(new m551((Object) function0, obj3, obj2, (byte) 14));
                }
                return null;
            case 20:
                return new xzq(((d2q) ((pbq) obj3).h).a(igu.a, (d0r) obj), new oz6((lik1) obj2, (byte) 5));
            case 21:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM SpecificDisabledFilterEntity WHERE id = ?");
                try {
                    d441VarG1.K(1, (String) obj3);
                    int iW = y7y0.w(d441VarG1, "id");
                    int iW2 = y7y0.w(d441VarG1, "paths");
                    int iW3 = y7y0.w(d441VarG1, "revision");
                    int iW4 = y7y0.w(d441VarG1, "format");
                    if (d441VarG1.f1()) {
                        poa1Var = new poa1(d441VarG1.P0(iW), (int) d441VarG1.getLong(iW3), (int) d441VarG1.getLong(iW4), ((xa20) ((ooa1) obj2).c.getValue()).a(d441VarG1.P0(iW2)));
                        break;
                    }
                    return poa1Var;
                } finally {
                    d441VarG1.close();
                }
            case 22:
                ((ooa1) obj3).b.D((y341) obj, (poa1) obj2);
                return rih1Var2;
            case 23:
                d441 d441VarG2 = ((y341) obj).g1("SELECT * FROM SpecificEnabledFilterEntity WHERE id = ?");
                try {
                    d441VarG2.K(1, (String) obj3);
                    return d441VarG2.f1() ? new yoa1(d441VarG2.P0(y7y0.w(d441VarG2, "id")), ((xa20) ((xoa1) obj2).c.getValue()).a(d441VarG2.P0(y7y0.w(d441VarG2, "paths"))), d441VarG2.P0(y7y0.w(d441VarG2, "brand")), d441VarG2.P0(y7y0.w(d441VarG2, "model")), d441VarG2.P0(y7y0.w(d441VarG2, "deviceFormattedName")), (int) d441VarG2.getLong(y7y0.w(d441VarG2, "revision")), (int) d441VarG2.getLong(y7y0.w(d441VarG2, "format"))) : null;
                } finally {
                    d441VarG2.close();
                }
            case 24:
                ((xoa1) obj3).b.D((y341) obj, (yoa1) obj2);
                return rih1Var2;
            case 25:
                ((PublishSubject) ((oss) obj3).a.i).onNext(new mss((tta1) obj2));
                return rih1Var2;
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yxa1 yxa1Var = (yxa1) obj3;
                yt91 yt91Var = yxa1Var.n;
                fya1 fya1Var = yxa1Var.a;
                r2a1 r2a1Var = yxa1Var.j;
                b7x b7xVar = b7x.a;
                if (zBooleanValue) {
                    r2a1Var.o("iawb_dismissed", fya1Var.a);
                    bqk0 bqk0Var = (bqk0) yt91Var.c;
                    if (bqk0Var != null) {
                        i8h1 i8h1Var = (i8h1) yt91Var.b;
                        x6h1 x6h1VarC = bqk0Var.b.c();
                        x6h1VarC.i.add(new a7h1("iawb_dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                } else {
                    r2a1Var.o("split_dismissed", fya1Var.a);
                    bqk0 bqk0Var2 = (bqk0) yt91Var.c;
                    if (bqk0Var2 != null) {
                        i8h1 i8h1Var2 = (i8h1) yt91Var.b;
                        x6h1 x6h1VarC2 = bqk0Var2.b.c();
                        x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    ((uoa) obj2).u();
                }
                yxa1Var.c.g();
                return rih1Var2;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                List list2 = (List) obj;
                q1m q1mVar = (q1m) obj3;
                try {
                    int i2 = SpotifyMediaBrowserService.N0;
                    ArrayList arrayListN = kqn1.n(list2);
                    q1mVar.b(1);
                    ((yhh0) obj2).d(arrayListN);
                    break;
                } catch (IllegalStateException e) {
                    q1mVar.b(2);
                    n57.t("MBS: Failed to send search results", e);
                }
                return rih1Var2;
            case 28:
                try {
                    ((em61) obj3).u(s7c0.d(mqn1.H((List) obj), (iph0) obj2));
                    break;
                } catch (IllegalStateException e2) {
                    n57.t("Failed to set item list of children", e2);
                }
                return rih1Var2;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                List list3 = k6b1.h;
                Context applicationContext = ((Context) obj3).getApplicationContext();
                Object obj5 = (Object[]) ((g6b1) obj2).b.get(Integer.valueOf(iIntValue2));
                if (obj5 == null) {
                    obj5 = new String[0];
                }
                List<String> listB0 = f46.b0(1, (String[]) obj5);
                ArrayList arrayList4 = new ArrayList(q7h.U(listB0, 10));
                for (String str3 : listB0) {
                    int identifier = applicationContext.getResources().getIdentifier(str3, "font", applicationContext.getPackageName());
                    if (identifier <= 0) {
                        hhg1.f(l1d.m("Missing font resource: ", str3));
                        return null;
                    }
                    InputStream inputStreamOpenRawResource = applicationContext.getResources().openRawResource(identifier);
                    try {
                        inputStreamOpenRawResource.getClass();
                        byte[] bArrK = o0c.K(inputStreamOpenRawResource);
                        inputStreamOpenRawResource.close();
                        arrayList4.add(bArrK);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            u890.p(inputStreamOpenRawResource, th2);
                            throw th3;
                        }
                    }
                }
                return arrayList4;
        }
    }
}
