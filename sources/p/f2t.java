package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f2t extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2t(Activity activity, pz11 pz11Var, xav0 xav0Var) {
        super(0);
        this.a = (byte) 0;
        this.b = activity;
        this.c = xav0Var;
    }

    public final Object invoke() {
        ArrayList arrayListN0;
        boolean z = true;
        z = true;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                Context applicationContext = ((Activity) this.b).getApplicationContext();
                mfm0 mfm0Var = mfm0.a;
                xav0 xav0Var = (xav0) this.c;
                String strD = men1.D(mfm0Var);
                uq8 uq8Var = cj4.b;
                File file = new File(applicationContext.getDir("remote-config", 0), strD);
                if (!file.exists()) {
                    file.mkdirs();
                }
                uq8 uq8Var2 = cj4.b;
                cj4 cj4VarB = m9x0.b(applicationContext, Integer.toHexString(xav0Var.hashCode()) + ".pb", men1.D(mfm0Var));
                m9x0.d(applicationContext);
                LinkedHashMap linkedHashMap = kvw0.b;
                cev0.x(applicationContext);
                svz0 svz0VarC = cj4VarB.c();
                svz0 svz0Var = svz0.d;
                svz0 svz0Var2 = svz0.d;
                Map map = svz0VarC.b;
                Map map2 = svz0Var2.b;
                if (!map2.isEmpty() || !map2.isEmpty()) {
                    svz0VarC = ulc.m(sc50.a(svz0VarC.a, o7h.l1(sqg0.O(sqg0.O(map, map2), map2).values()), 27));
                }
                return new e2t(svz0VarC.b);
            case 1:
                i8h1 i8h1Var = ((t6t) this.b).a;
                x6h1 x6h1VarC = ((uvk0) this.c).a.c();
                x6h1VarC.i.add(new a7h1("delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 2:
                fn31.T(cto1.q((dg30) ((oi) this.b).c), (o8n) null, 0, new n1o((rhh) this.c, (lnm) null, (byte) 25), 3);
                return rih1.a;
            case 3:
                ((goq) this.b).b((tom) this.c, true);
                return rih1.a;
            case 4:
                ((goq) ((hur) this.b).b).b((tom) this.c, false);
                return rih1.a;
            case 5:
                ((goq) ((iir) this.b).b).c((tom) this.c, true);
                return rih1.a;
            case 6:
                ((iu30) this.b).invoke(Integer.valueOf(((jat) this.c).f));
                return rih1.a;
            case 7:
                Set set = (Set) ((sut) this.b).i.get(((cut) this.c).a);
                return set == null ? w7x.a : set;
            case 8:
                out outVar = (out) this.c;
                bvt bvtVar = (bvt) this.b;
                if (u890.j(bvtVar.d, Boolean.TRUE)) {
                    return outVar;
                }
                bvtVar.e.add(outVar);
                return null;
            case 9:
                return new fma1(new hfb((byte) 26, false), ((vl4) ((gma1) this.b).a.get()).b(), "diagnostic_session_history").d((Context) this.c, "diagnostic_session_history");
            case 10:
                ((e3u) this.b).i((hnn0) this.c, false);
                return rih1.a;
            case 11:
                ((y3u) this.b).f.onNext((vp81) this.c);
                return rih1.a;
            case 12:
                ((r331) this.b).e((d331) this.c);
                return rih1.a;
            case 13:
                fnu fnuVar = (fnu) this.b;
                ((iu30) this.c).invoke(gt81.a);
                wnu wnuVar = (wnu) fnuVar.q.getValue();
                synchronized (wnuVar) {
                    if (!((Boolean) wnuVar.b.getValue()).booleanValue()) {
                        bpb1 bpb1Var = wnuVar.b;
                        Boolean bool = Boolean.TRUE;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, bool);
                        fnuVar.n.a();
                        a1r0.j(fnuVar.l, nik1.D4.a, (String) null, (Bundle) null, true, 6);
                    }
                }
                return rih1.a;
            case 14:
                k1v k1vVar = (p1v) this.b;
                kbf0 kbf0Var = (kbf0) this.c;
                float f = 0.0f;
                if (!k1vVar.equals(f1v.a) && !k1vVar.equals(h1v.a) && !k1vVar.equals(i1v.a) && !k1vVar.equals(l1v.a)) {
                    if (k1vVar instanceof k1v) {
                        Float f2 = k1vVar.a;
                        f = f2 != null ? f2.floatValue() : kbf0Var.f();
                    } else if (k1vVar.equals(n1v.a)) {
                        f = kbf0Var.f();
                    } else if (!k1vVar.equals(m1v.a)) {
                        eg.o();
                        return null;
                    }
                }
                return Float.valueOf(f);
            case 15:
                kt91 kt91Var = ((g58) this.c).b;
                Function0 function0 = (Function0) this.b;
                if (function0 != null) {
                    er91 er91Var = (er91) function0.invoke();
                    if (kt91Var.g()) {
                        kt91Var.k(er91Var);
                    } else {
                        kt91Var.o(er91Var);
                    }
                }
                return rih1.a;
            case 16:
                ((iu30) this.b).invoke((lia1) this.c);
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (((g23) ((teb) this.b).h) != null) {
                    g23.n((ViewGroup) this.c);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                fai0 fai0Var = (fai0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (arrayList.isEmpty()) {
                    arrayListN0 = z6x.a;
                } else {
                    List listD1 = o7h.d1(arrayList, 1);
                    List listK0 = o7h.k0(arrayList, 1);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listK0) {
                        ito itoVar = (ito) obj;
                        if (!((rnc0) itoVar.c.b().getValue()).b.isEmpty() && ((o5e0) itoVar.c.c().getValue()).h()) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayListN0 = o7h.N0(arrayList2, listD1);
                }
                fai0Var.m(arrayListN0);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((d0r) this.b).h((ckv) this.c);
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((iu30) this.b).invoke((ova) this.c);
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                zeu zeuVar = (zeu) ((lqr) this.b).b;
                i8h1 i8h1Var2 = (i8h1) zeuVar.a;
                g5l0 g5l0Var = (g5l0) zeuVar.c;
                x6h1 x6h1VarC2 = g5l0Var.c.c();
                x6h1VarC2.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((iu30) this.c).invoke(new vuv(i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", aqv.a((String) zeuVar.b))), x6h1VarC2.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null)));
                return rih1.a;
            case 22:
                ((ven0) this.c).setValue(Boolean.FALSE);
                ((vqv) this.b).b.c();
                return rih1.a;
            case 23:
                otu otuVar = ((bxv) this.b).a;
                i8h1 i8h1Var3 = (i8h1) otuVar.b;
                x6h1 x6h1VarC3 = ((txk0) otuVar.c).b.c();
                x6h1VarC3.i.add(new a7h1("remove_from_profile_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "visible_on_profile"), new mmr0("state_after_toggle", "not_visible_on_profile")})), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) this.c).invoke(mxv.a);
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                y7e1 y7e1Var = (y7e1) this.b;
                String str = (String) this.c;
                if (str.length() != 0 ? u890.j(y7e1Var.d().d.toString(), str) : ihc1.y0(y7e1Var.d().d)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                iu30 iu30Var = (iu30) this.b;
                List list = ((y4w) this.c).a;
                ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((bxn) it.next()).b);
                }
                iu30Var.invoke(new b5w(arrayList3));
                return rih1.a;
            case 26:
                return new low(new zm41((dn41) this.c, new qrk(z ? 1 : 0, (byte) 20), (iu30) null, new htu((byte) 8, 2, false), (Function0) null, new v7v((now) ((kly0) this.b).get(), (byte) 11), 84));
            case 27:
                nd41 nd41Var = (nd41) this.b;
                ipb1 ipb1Var = (ipb1) this.c;
                Map mapE = nd41Var.e();
                if (!mapE.isEmpty()) {
                    bundle = new Bundle();
                    for (Map.Entry entry : mapE.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list2 = (List) entry.getValue();
                        bundle.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                    }
                }
                ipb1Var.j(bundle);
                return rih1.a;
            case 28:
                iu30 iu30Var2 = (iu30) this.c;
                wvw wvwVar = (wvw) this.b;
                yqg yqgVar = wvwVar.d;
                long j = wvwVar.e;
                if (j <= 0 || yqgVar.b() < j) {
                    jut jutVar = wvwVar.c;
                    i8h1 i8h1Var4 = (i8h1) jutVar.c;
                    x6h1 x6h1VarC4 = ((h4l0) jutVar.b).b.c();
                    x6h1VarC4.i.add(new a7h1("resend_code_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    b7x b7xVar2 = b7x.a;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("retry", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    wvwVar.W(new mhv0("email_otp", "resend_email_otp", ew80.c, (String) null));
                    int iC = l1d.C(wvwVar.f <= yqgVar.b() ? 1 : 2);
                    if (iC == 0) {
                        iu30Var2.invoke(new pwe0(mwe0.a));
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        wvwVar.V(mvw.a);
                    }
                } else {
                    iu30Var2.invoke(new pwe0(nwe0.a));
                }
                return rih1.a;
            default:
                ((ven0) this.c).setValue(Boolean.FALSE);
                mxw mxwVar = (mxw) this.b;
                ohv0 ohv0Var = mxwVar.X1;
                if (ohv0Var == null) {
                    u890.C("preAuthUbiTracker");
                    throw null;
                }
                ohv0Var.a(new khv0("email_method_picker", 4, (Map) null, "dialog_dismissed"));
                mxwVar.Z0(false, false);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2t(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
