package p;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.casita.v1.resolved.Section;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.slottextview.EncorePretitleView;
import com.spotify.mdata.esperanto.proto.ObserveResponse;
import com.spotify.messages.MobileEpisodePageFallbackEvent;
import com.spotify.mobius.functions.Consumer;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uny implements kdm, Function, o4e1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public uny(rzq rzqVar, t2j0 t2j0Var) {
        this.a = (byte) 7;
        this.b = rzqVar;
        this.c = t2j0Var;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.l(new l4r(new xv00(jd11Var.b(mdz.class)), 1, w4z.e, new j4r(s3z.Y0), w4z.f), new l4r(new wlu(jd11Var.b(jo70.class)), 2, s3z.c1, new j4r(s3z.Z0), s3z.d1), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, s3z.e1, new j4r(s3z.a1), w4z.b), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, w4z.c, new j4r(s3z.b1), w4z.d), c0z.g);
    }

    public static String I(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return o7h.y0(list, ",", (String) null, (String) null, (iu30) null, 62);
    }

    public static String h(oav oavVar) {
        return oavVar.a + "_" + oavVar.d;
    }

    public haz A(lby lbyVar, cu7 cu7Var, d8r0 d8r0Var, String str, List list, boolean z) {
        int i;
        kfv kfvVar = cu7Var.c;
        boolean z2 = cu7Var.h && kfvVar.a > 0;
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        String strJ0 = bmq0.j0(((Resources) this.d).getString(2131961520), bmq0.j0(z2 ? "" : ((ggv) this.b).a(kfvVar.a, new fgv(4, 2)), cu7Var.a));
        String str4 = lbyVar.c;
        String str5 = cu7Var.i;
        String str6 = "";
        String str7 = cu7Var.a;
        if (cu7Var.f) {
            i = 1;
        } else {
            i = cu7Var.b ? 2 : 3;
        }
        String strA = ((o5r) this.c).a(cu7Var.e.a);
        boolean z3 = cu7Var.h;
        boolean z4 = cu7Var.X && z;
        if (z2) {
            long j = kfvVar.a;
            int i2 = (int) (j / 3600);
            int i3 = ((int) (j / 60)) - (i2 * 60);
            long j2 = j % 60;
            str6 = i2 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Long.valueOf(j2)}, 2));
        }
        return new haz(str2, str3, strJ0, str7, str4, str5, i, d8r0Var, str, strA, z3, list, z4, str6);
    }

    public ArrayList B(h290 h290Var, boolean z, yz21 yz21Var) {
        uqs uqsVar = new uqs(yz21Var, ((lmo) this.b).a, z, (kp00) this.c, ((w25) this.d).j0());
        ArrayList arrayList = new ArrayList();
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            jn60 jn60VarO = uqsVar.o(Section.f0((phc) it.next()));
            if (jn60VarO != null) {
                arrayList.add(jn60VarO);
            }
        }
        return arrayList;
    }

    public Object C(hac0 hac0Var, sac0 sac0Var) {
        nen0 nen0Var = (nen0) this.b;
        il10 il10Var = (il10) nen0Var.g(hac0Var);
        if (il10Var != null) {
            return il10Var.b;
        }
        il10 il10Var2 = new il10(hac0Var, sac0Var);
        nen0Var.m(hac0Var, il10Var2);
        il10 il10Var3 = (il10) this.d;
        if (il10Var3 == null) {
            this.c = il10Var2;
            this.d = il10Var2;
            return null;
        }
        il10Var3.c = il10Var2;
        il10Var2.d = il10Var3;
        this.d = il10Var2;
        return null;
    }

    public void D(hac0 hac0Var) {
        il10 il10Var = (il10) ((nen0) this.b).k(hac0Var);
        if (il10Var == null) {
            return;
        }
        il10 il10Var2 = il10Var.d;
        il10 il10Var3 = il10Var.c;
        if (il10Var2 == null) {
            this.c = il10Var3;
        } else {
            il10Var2.c = il10Var3;
        }
        il10 il10Var4 = il10Var.c;
        if (il10Var4 == null) {
            this.d = il10Var2;
        } else {
            il10Var4.d = il10Var2;
        }
        il10Var.e = true;
    }

    public void E(r800 r800Var) {
        if (r800Var != null) {
            String str = r800Var.c;
            bk7 bk7Var = (bk7) this.d;
            ArrayList arrayListI = pqo.i(new nty(r800Var, (byte) 22));
            c21 c21Var = (c21) bk7Var.e;
            ArrayList arrayList = (ArrayList) c21Var.f;
            j4u j4uVarP = w0h1.p(new r0i((byte) 0, arrayList, (LinkedHashMap) c21Var.b, arrayListI));
            arrayList.clear();
            arrayList.addAll(arrayListI);
            j4uVarP.b(bk7Var);
            if (str != null) {
                ((TextView) ((u800) this.c).c.getValue()).setText(str);
            }
        }
    }

    public Completable F(List list, z460 z460Var) {
        return Single.fromCallable(new wra(this, list, z460Var, (byte) 2)).flatMapCompletable(new t7y(this, z460Var, (byte) 24));
    }

    public void G(int i) {
        kt91 kt91Var = (kt91) this.c;
        kt91Var.b();
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public int H() {
        return ((nen0) this.b).e;
    }

    public void J(List list, List list2, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd00 vd00Var = (vd00) it.next();
            ((LinkedHashMap) this.b).put(vd00Var.a, vd00Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            ((LinkedHashMap) this.c).put((String) entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            oav oavVar = (oav) it2.next();
            ((LinkedHashMap) this.d).put(h(oavVar), new fd00(oavVar.b));
        }
    }

    public zob1 a() {
        zob1 m231Var;
        pbq pbqVar = (pbq) this.b;
        w2c1 w2c1Var = (y1c1) this.c;
        String str = (String) this.d;
        try {
            m231Var = w2c1Var.U(tb2.class);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return gio1.b(b7x.a);
        }
        return new z2c1(new kov(str, pbqVar), w2c1Var.U(tb2.class));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    public Object apply(Object obj) {
        boolean z;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                String str = (String) obj2;
                tv00 tv00VarA = ((uv00) obj).a(l1z.class, str);
                ez00 ez00Var = tv00VarA.b;
                if (!tv00VarA.c.a) {
                    ez00Var = null;
                }
                l1z l1zVar = (l1z) ez00Var;
                x2z x2zVar = (x2z) this.c;
                List list = ((v740) this.d).a;
                if (l1zVar != null) {
                    z = l1zVar.e;
                }
                u740 u740Var = (u740) o7h.s0(list);
                String str2 = u740Var != null ? u740Var.d.a : null;
                if (z && str2 != null && !ihc1.y0(str2)) {
                    return Observable.just(new hq21(str2));
                }
                u740 u740Var2 = (u740) o7h.s0(list);
                String str3 = u740Var2 != null ? u740Var2.a : null;
                if (str3 == null || str3.equals(str)) {
                    Observable observableJust = Observable.just(new hq21(str));
                    observableJust.getClass();
                    return observableJust;
                }
                Observable map = x2zVar.a.b(new oi("GatedContentRouter", false, new kov(str3, (byte) 23))).filter(uml1.b1).map(new v2z(str3, str, (byte) 0));
                map.getClass();
                return map;
            case 18:
                ObserveResponse observeResponse = (ObserveResponse) obj;
                pv00 pv00Var = ((zu00) this.c).b;
                if (((AtomicBoolean) obj2).get()) {
                    return new wv00(observeResponse, pv00Var);
                }
                nif1 nif1Var = (nif1) this.d;
                nif1Var.c((Long) null, "proto_deserialize");
                try {
                    return new wv00(observeResponse, pv00Var);
                } finally {
                    nif1Var.e("proto_deserialize");
                }
            case 20:
                j410 j410Var = (j410) obj;
                String str4 = (String) this.c;
                u2u0 u2u0Var = (u2u0) obj2;
                ArrayList arrayList = j410Var.c;
                if (!j410Var.a) {
                    return u2u0Var;
                }
                if (!j410Var.b) {
                    return (str4 == null || !arrayList.contains(str4)) ? u2u0Var : new p2u0(str4, (String) this.d);
                }
                if (str4 == null || !arrayList.contains(str4)) {
                    str4 = (String) o7h.s0(arrayList);
                }
                return str4 != null ? new r2u0(str4) : u2u0Var;
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                z410 z410Var = (z410) obj2;
                String str5 = (String) this.c;
                PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.d;
                Set set = s4b1.f;
                if (uic.x(str5).c == blc0.k4) {
                    return Single.just(s410.a(preparePlayOptions, str5));
                }
                if (uic.x(str5).c == blc0.g1) {
                    return z410Var.d.a.b(EsOffline.GetContextsRequest.q().build()).map(ua20.T0).map(new ljp1((byte) 9, z410Var, str5));
                }
                if (!zBooleanValue) {
                    w6b1 w6b1VarA = f7b1.a(blc0.ti);
                    if (w6b1VarA != null && new kik1(w6b1VarA.d).a(str5)) {
                        Context contextBuild = Context.builder(str5).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.create(str5))).build())).build();
                        contextBuild.getClass();
                        return Single.just(new u410(contextBuild));
                    }
                    if (uic.x(str5).w()) {
                        return Single.just(s410.a(preparePlayOptions, str5));
                    }
                }
                return Single.just(t410.a);
            default:
                String str6 = (String) obj2;
                return (spq0) ((py21) obj).b(new kq00(str6, (byte) 12), new os(str6, (String) this.c, (ci10) this.d, (byte) 14));
        }
    }

    public kpg0 b(lik1 lik1Var, Function0 function0) {
        return new kpg0(ycm.a((ycm) this.c), new djx((Object) lik1Var, (Object) this, (Object) function0, (byte) 7));
    }

    public il10 c(hac0 hac0Var) {
        il10 il10Var = (il10) ((nen0) this.b).g(hac0Var);
        if (il10Var != null) {
            return il10Var.d;
        }
        return null;
    }

    public void d(Action action, Consumer consumer) {
        mvb mvbVar = (mvb) this.b;
        mvbVar.c = action;
        mvbVar.b = consumer;
        ((View) ((u800) this.c).b.getValue()).setOnClickListener(new zfs(action, (byte) 11));
    }

    public boolean e(hac0 hac0Var) {
        return ((nen0) this.b).c(hac0Var);
    }

    public void f(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2120942835);
        int i2 = (x340Var.g(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gra graVar = ((Boolean) ((ven0) this.b).getValue()).booleanValue() ? een.d : een.g;
            y7e1 y7e1Var = (y7e1) this.c;
            String str = (String) this.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            if (y7e1Var.d().d.length() != 0 || str.length() <= 0) {
                x340Var.i0(-1948380837);
                x340Var.r(false);
            } else {
                x340Var.i0(-1948556173);
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            }
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00(this, j2iVar, i, (byte) 7);
        }
    }

    public lx10 g(int i, String str) {
        Object[] objArr = new Object[0];
        Resources resources = (Resources) ((WeakReference) ((k9) ((rwg0) this.b)).b).get();
        return new lx10(str, resources == null ? "" : resources.getString(i, objArr));
    }

    public il10 i() {
        il10 il10Var = (il10) this.c;
        if (il10Var != null) {
            return il10Var;
        }
        bhn0.t("Collection is empty.");
        return null;
    }

    public void j(rac0 rac0Var) {
        for (il10 il10Var = (il10) this.d; il10Var != null; il10Var = il10Var.d) {
            if (!il10Var.e) {
                rac0Var.invoke(il10Var);
            }
        }
    }

    public void k(rac0 rac0Var) {
        for (il10 il10Var = (il10) this.c; il10Var != null; il10Var = il10Var.c) {
            if (!il10Var.e) {
                rac0Var.invoke(il10Var);
            }
        }
    }

    public Single l(String str) {
        kp00 kp00Var = (kp00) this.c;
        FilterMetadataDatabase filterMetadataDatabase = (FilterMetadataDatabase) kp00Var.b;
        xoa1 xoa1VarX = filterMetadataDatabase.x();
        MaybeMap maybeMapF = m5n1.n(xoa1VarX.a, new iv81(str, xoa1VarX, (byte) 23)).f(sa20.b);
        j5 j5Var = j5.a;
        MaybeSwitchIfEmptySingle maybeSwitchIfEmptySingleK = maybeMapF.k(Single.just(j5Var));
        ooa1 ooa1VarW = filterMetadataDatabase.w();
        MaybeSwitchIfEmptySingle maybeSwitchIfEmptySingleK2 = m5n1.n(ooa1VarW.a, new iv81(str, ooa1VarW, (byte) 21)).f(ta20.b).k(Single.just(j5Var));
        gb10 gb10VarV = filterMetadataDatabase.v();
        MaybeSwitchIfEmptySingle maybeSwitchIfEmptySingleK3 = m5n1.n(gb10VarV.a, new f0z(str, gb10VarV, (byte) 27)).f(ua20.b).k(Single.just(j5Var));
        ab10 ab10VarU = filterMetadataDatabase.u();
        return Single.zip(maybeSwitchIfEmptySingleK, maybeSwitchIfEmptySingleK2, maybeSwitchIfEmptySingleK3, m5n1.n(ab10VarU.a, new f0z(str, ab10VarU, (byte) 25)).f(va20.b).k(Single.just(j5Var)), new mcn1(str, (byte) 5)).subscribeOn((Scheduler) kp00Var.c).flatMap(new acn1(str, (byte) 4));
    }

    public String m() {
        return o7h.y0(f46.i0(new String[]{"agent", "startachat", ((di4) this.b).l() ? "progressive_call_search_overview" : null}), ",", (String) null, (String) null, (iu30) null, 62);
    }

    public String n() {
        di4 di4Var = (di4) this.b;
        if (di4Var.b() || di4Var.O()) {
            return "aipersona";
        }
        return null;
    }

    public String o() {
        di4 di4Var = (di4) this.b;
        return I(f46.i0(new String[]{"recentqueryhighlight", "track_classification", "pl_spotify_logic", di4Var.d() ? "is_chaptered" : null, di4Var.q0() ? "videoflag" : null, di4Var.r0() != bi4.b ? "videometadata" : null, di4Var.f0() != zh4.b ? "queryhighlight" : null, di4Var.o0() ? "showverified" : null, n()}));
    }

    public i6l0 p() {
        return (i6l0) ((idd1) this.d).getValue();
    }

    public Map q(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
        if (linkedHashMap2.isEmpty()) {
            return linkedHashMap;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                oav oavVar = (oav) obj;
                fd00 fd00Var = (fd00) linkedHashMap2.get(h(oavVar));
                if (fd00Var == null) {
                    fd00Var = new fd00(0L);
                }
                if (oavVar.b != fd00Var.a || oavVar.c > 0) {
                    arrayList2.add(obj);
                }
            }
            mmr0 mmr0Var = new mmr0(str, list);
            if (arrayList2.isEmpty()) {
                mmr0Var = null;
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public Map r(LinkedHashMap linkedHashMap) {
        Integer num;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.c;
        if (linkedHashMap2.isEmpty()) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (!linkedHashMap2.containsKey(str) || (num = (Integer) linkedHashMap2.get(str)) == null || iIntValue != num.intValue()) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap3;
    }

    public List s(List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            vd00 vd00Var = (vd00) obj;
            vd00 vd00Var2 = (vd00) linkedHashMap.get(vd00Var.a);
            if (vd00Var2 != null && vd00Var.g == vd00Var2.g) {
                long jLongValue = vd00Var.f;
                if (jLongValue == vd00Var2.f) {
                    Long l = vd00Var.e;
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    Long l2 = vd00Var2.e;
                    if (l2 != null && jLongValue == l2.longValue()) {
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public ViewGroup t() {
        return ((u800) this.c).b();
    }

    public boolean u(List list, List list2, Map map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.isEmpty() && !list.isEmpty()) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        List list3 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((vd00) it.next()).a);
        }
        if (!o7h.p1(arrayList).containsAll(linkedHashMap.keySet()) || !map.keySet().containsAll(((LinkedHashMap) this.c).keySet())) {
            return false;
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(h((oav) it2.next()));
        }
        return o7h.p1(arrayList2).containsAll(((LinkedHashMap) this.d).keySet());
    }

    public il10 v() {
        il10 il10Var = (il10) this.d;
        if (il10Var != null) {
            return il10Var;
        }
        bhn0.t("Collection is empty.");
        return null;
    }

    public il10 w() {
        return (il10) this.d;
    }

    public Completable x(rqd0 rqd0Var) {
        if (rqd0Var instanceof oqd0) {
            return CompletableEmpty.a;
        }
        if (rqd0Var instanceof pqd0) {
            return ((ruz) this.c).a(new p9u0()).observeOn((Scheduler) this.b).flatMapCompletable(new kp00(this, (pqd0) rqd0Var, (byte) 10));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object y(String str, uzq uzqVar, onm onmVar) {
        v4z v4zVar;
        Object objL;
        v6g1 v6g1Var;
        ArrayList arrayList;
        List list;
        io70 io70Var;
        mq70 mq70Var;
        up70 up70VarA;
        String str2 = str;
        if (onmVar instanceof v4z) {
            v4zVar = (v4z) onmVar;
            int i = v4zVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v4zVar.d = i - Integer.MIN_VALUE;
            } else {
                v4zVar = new v4z(this, onmVar);
            }
        } else {
            v4zVar = new v4z(this, onmVar);
        }
        Object obj = v4zVar.b;
        int i2 = v4zVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            rzq rzqVar = (rzq) this.b;
            o3r o3rVar = (o3r) this.d;
            o3r o3rVar2 = uzqVar.c;
            v4zVar.a = str2;
            v4zVar.d = 1;
            objL = u2p1.l(rzqVar, o3rVar, o3rVar2, str2, v4zVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = v4zVar.a;
            hm5.M(obj);
            objL = ((e331) obj).a;
        }
        String str3 = str2;
        Throwable thA = e331.a(objL);
        if (thA != null) {
            return new m231(thA);
        }
        mmr0 mmr0Var = (mmr0) objL;
        u4z u4zVar = (u4z) mmr0Var.a;
        Object obj2 = mmr0Var.b;
        jo70 jo70Var = u4zVar.c;
        mdz mdzVar = u4zVar.a;
        kdz kdzVar = mdzVar.d;
        if (jo70Var != null) {
            xkk1 xkk1Var = u4zVar.b;
            v6g1Var = new v6g1(0L, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) ? null : up70VarA.a.a, jo70Var.a, jo70Var.b);
        } else {
            v6g1Var = null;
        }
        if (v6g1Var == null) {
            t2j0 t2j0Var = (t2j0) this.c;
            f6l0 f6l0VarN = MobileEpisodePageFallbackEvent.n();
            f6l0VarN.n(str3);
            t2j0Var.a(f6l0VarN.build());
        }
        vto vtoVar = (jo70Var == null || (io70Var = jo70Var.e) == null) ? null : new vto(io70Var.b, io70Var.a);
        if (vtoVar == null) {
            vtoVar = new vto(kdzVar != null ? kdzVar.b.toString() : "", kdzVar != null ? kdzVar.a : "");
        }
        vto vtoVar2 = vtoVar;
        if (jo70Var == null || (list = jo70Var.d) == null) {
            arrayList = z6x.a;
        } else {
            List<ho70> list2 = list;
            arrayList = new ArrayList(q7h.U(list2, 10));
            for (ho70 ho70Var : list2) {
                arrayList.add(new uto(ho70Var.b, ho70Var.a));
            }
        }
        ArrayList arrayList2 = arrayList;
        if (v6g1Var == null) {
            String strA = mdzVar.e.a(zdn.c);
            v6g1Var = new v6g1(0L, strA.length() > 0 ? strA : null, mdzVar.c, "episode");
        }
        return new wto(str3, arrayList2, vtoVar2, obj2, v6g1Var);
    }

    public tv80 z(j82 j82Var) {
        Object obj;
        y6h1 y6h1Var = ((xok0) this.d).b;
        ksk0 ksk0Var = (ksk0) this.c;
        r6h1 r6h1Var = ksk0Var.b;
        y6h1 y6h1Var2 = ksk0Var.c;
        lbp lbpVar = (lbp) this.b;
        boolean z = j82Var instanceof eu80;
        b7x b7xVar = b7x.a;
        if (z) {
            i8h1 i8h1Var = (i8h1) lbpVar.get();
            x6h1 x6h1VarC = y6h1Var2.c();
            x6h1VarC.i.add(new a7h1("header", "header-id", (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            String str = ((eu80) j82Var).d;
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("change_location_button", str, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            String str2 = nik1.y1.a;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var.equals(tt80.e)) {
            i8h1 i8h1Var2 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC3 = y6h1Var2.c();
            x6h1VarC3.i.add(new a7h1("header", "header-id", (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("filter_browse_location_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            y6h1 y6h1VarA3 = x6h1VarC4.a();
            String str3 = nik1.y1.a;
            return i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA3, r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var.equals(tt80.f)) {
            i8h1 i8h1Var3 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC5 = y6h1Var2.c();
            x6h1VarC5.i.add(new a7h1("header", "header-id", (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("filter_clear_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            return i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var instanceof ju80) {
            i8h1 i8h1Var4 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC7 = y6h1Var2.c();
            x6h1VarC7.i.add(new a7h1("header", "header-id", (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            x6h1 x6h1VarC8 = x6h1VarC7.a().c();
            x6h1VarC8.i.add(new a7h1("filter_saved_events_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            y6h1 y6h1VarA4 = x6h1VarC8.a();
            ju80 ju80Var = (ju80) j82Var;
            int i = ju80Var.d;
            int i2 = ju80Var.e;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            String str4 = "active";
            if (i == 1) {
                obj = "active";
            } else {
                if (i != 2) {
                    throw null;
                }
                obj = "not_active";
            }
            mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
            if (i2 != 1) {
                if (i2 != 2) {
                    throw null;
                }
                str4 = "not_active";
            }
            return i8h1Var4.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str4)})), y6h1VarA4, r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var instanceof gu80) {
            i8h1 i8h1Var5 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC9 = y6h1Var2.c();
            x6h1VarC9.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = false;
            x6h1 x6h1VarC10 = x6h1VarC9.a().c();
            x6h1VarC10.i.add(new a7h1("notification_settings_button", "toolbar-notifications-button", (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            return i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:settings:notifications:category-details:notify-in-person-concerts-and-events")), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var.equals(tt80.d)) {
            i8h1 i8h1Var6 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC11 = y6h1Var2.c();
            x6h1VarC11.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            x6h1 x6h1VarC12 = x6h1VarC11.a().c();
            x6h1VarC12.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = false;
            return i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC12.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var.equals(tt80.h)) {
            i8h1 i8h1Var7 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC13 = y6h1Var2.c();
            x6h1VarC13.i.add(new a7h1("header", "header-id", (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            x6h1 x6h1VarC14 = x6h1VarC13.a().c();
            x6h1VarC14.i.add(new a7h1("filter_date_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC14.j = false;
            return i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var.equals(tt80.g)) {
            i8h1 i8h1Var8 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC15 = y6h1Var2.c();
            x6h1VarC15.i.add(new a7h1("header", "header-id", (Integer) null, (String) null, (String) null));
            x6h1VarC15.j = false;
            x6h1 x6h1VarC16 = x6h1VarC15.a().c();
            x6h1VarC16.i.add(new a7h1("filter_concepts_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC16.j = false;
            return i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC16.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var instanceof ut80) {
            throw null;
        }
        if (j82Var instanceof vt80) {
            throw null;
        }
        if (j82Var instanceof xt80) {
            throw null;
        }
        if (j82Var instanceof wt80) {
            throw null;
        }
        if (j82Var instanceof cu80) {
            i8h1 i8h1Var9 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC17 = y6h1Var.c();
            x6h1VarC17.i.add(new a7h1("filters_view", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC17.j = false;
            y6h1 y6h1VarA5 = x6h1VarC17.a();
            ldl0 ldl0Var = ((cu80) j82Var).d;
            x6h1 x6h1VarC18 = y6h1VarA5.c();
            x6h1VarC18.i.add(new a7h1("date_quick_filter_button", ldl0Var.a, (Integer) null, (String) null, (String) null));
            x6h1VarC18.j = false;
            return i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var instanceof bu80) {
            i8h1 i8h1Var10 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC19 = y6h1Var.c();
            x6h1VarC19.i.add(new a7h1("filters_view", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC19.j = false;
            y6h1 y6h1VarA6 = x6h1VarC19.a();
            bu80 bu80Var = (bu80) j82Var;
            Integer numValueOf = Integer.valueOf(bu80Var.e);
            String str5 = bu80Var.d;
            x6h1 x6h1VarC20 = y6h1VarA6.c();
            x6h1VarC20.i.add(new a7h1("concept_filter_chip", (String) null, numValueOf, str5, (String) null));
            x6h1VarC20.j = false;
            return i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var instanceof au80) {
            i8h1 i8h1Var11 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC21 = y6h1Var.c();
            x6h1VarC21.i.add(new a7h1("filters_view", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC21.j = false;
            y6h1 y6h1VarA7 = x6h1VarC21.a();
            au80 au80Var = (au80) j82Var;
            Integer numValueOf2 = Integer.valueOf(au80Var.e);
            String str6 = au80Var.d;
            x6h1 x6h1VarC22 = y6h1VarA7.c();
            x6h1VarC22.i.add(new a7h1("concept_filter_chip", (String) null, numValueOf2, str6, (String) null));
            x6h1VarC22.j = false;
            return i8h1Var11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (j82Var.equals(tt80.i)) {
            i8h1 i8h1Var12 = (i8h1) lbpVar.get();
            x6h1 x6h1VarC23 = y6h1Var.c();
            x6h1VarC23.i.add(new a7h1("clear_all_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC23.j = false;
            return i8h1Var12.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC23.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (!j82Var.equals(tt80.j)) {
            eg.o();
            return null;
        }
        i8h1 i8h1Var13 = (i8h1) lbpVar.get();
        x6h1 x6h1VarC24 = y6h1Var.c();
        x6h1VarC24.i.add(new a7h1("show_results_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC24.j = false;
        return i8h1Var13.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public uny(lzn0 lzn0Var, kp00 kp00Var) {
        this.a = (byte) 17;
        this.b = lzn0Var;
        this.c = kp00Var;
        this.d = new mev((Object) this, (byte) 11);
    }

    public uny(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = (byte) 16;
        this.b = i8h1Var;
        this.c = r6h1Var;
        this.d = new idd1(new pdy(this, (byte) 25));
    }

    public uny(String str, kp00 kp00Var, vgq0 vgq0Var) {
        this.a = (byte) 29;
        this.b = str;
        this.c = kp00Var;
        this.d = ((g420) vgq0Var.b).a();
    }

    public uny(dg30 dg30Var, t8u0 t8u0Var, k811 k811Var, Scheduler scheduler) {
        this.a = (byte) 25;
        this.b = scheduler;
        this.c = t8u0Var.a(((f0i) dg30Var).a).a();
        this.d = (id31) ((ynb0) (((pm4) k811Var.b).a() ? k811Var.c : k811Var.d)).get();
    }

    public uny(uu00 uu00Var) {
        this.a = (byte) 5;
        this.b = uu00Var;
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        this.c = dt71VarE;
        this.d = hu20.e(dt71VarE, new uls((lnm) null, this, (byte) 14));
    }

    public /* synthetic */ uny(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public uny(tny tnyVar, EncoreIconView encoreIconView, EncorePretitleView encorePretitleView, EncoreIconView encoreIconView2) {
        this.a = (byte) 0;
        this.b = encoreIconView;
        this.d = encorePretitleView;
        this.c = encoreIconView2;
    }

    public uny(qmr qmrVar, mvb mvbVar, u800 u800Var) {
        this.a = (byte) 10;
        this.b = mvbVar;
        this.c = u800Var;
        bk7 bk7VarF = bbp1.f(new f0z(qmrVar, mvbVar, (byte) 9));
        this.d = bk7VarF;
        RecyclerView recyclerView = (RecyclerView) u800Var.d.getValue();
        u800Var.b().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(bk7VarF);
        b8k1.p((View) u800Var.b.getValue(), new zdc((byte) 9));
    }

    public uny(android.content.Context context, as00 as00Var) {
        this.a = (byte) 15;
        this.b = context;
        this.c = as00Var;
        this.d = new HashMap();
    }

    public uny(y0u y0uVar, xh00 xh00Var) {
        this.a = (byte) 19;
        this.b = z6x.a;
        this.c = y0uVar;
        this.d = xh00Var;
    }

    public uny(byte b) {
        this.a = b;
        switch (b) {
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                this.b = new nen0();
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                break;
        }
    }
}
