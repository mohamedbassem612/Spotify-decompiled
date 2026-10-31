package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.camera.core.ProcessingException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profile.proto.ProfilemodelRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gmt implements quu, Function, ix30, Predicate, ya {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public gmt(EditText editText) {
        this.a = (byte) 25;
        this.b = editText;
        k5x k5xVar = new k5x(editText);
        this.c = k5xVar;
        editText.addTextChangedListener(k5xVar);
        if (g4x.b == null) {
            synchronized (g4x.a) {
                try {
                    if (g4x.b == null) {
                        g4x g4xVar = new g4x();
                        try {
                            g4x.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, g4x.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        g4x.b = g4xVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(g4x.b);
    }

    public static gmt j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624551, viewGroup, false);
        int i = 2131427456;
        if (m5n1.t(constraintLayoutInflate, 2131427456) != null) {
            i = 2131427457;
            if (m5n1.t(constraintLayoutInflate, 2131427457) != null) {
                i = 2131427458;
                if (m5n1.t(constraintLayoutInflate, 2131427458) != null) {
                    i = 2131427459;
                    if (m5n1.t(constraintLayoutInflate, 2131427459) != null) {
                        i = 2131427893;
                        if (m5n1.t(constraintLayoutInflate, 2131427893) != null) {
                            i = 2131428682;
                            if (m5n1.t(constraintLayoutInflate, 2131428682) != null) {
                                i = 2131428698;
                                if (m5n1.t(constraintLayoutInflate, 2131428698) != null) {
                                    i = 2131428700;
                                    if (m5n1.t(constraintLayoutInflate, 2131428700) != null) {
                                        i = 2131430956;
                                        ShimmerFrameLayout shimmerFrameLayoutT = m5n1.t(constraintLayoutInflate, 2131430956);
                                        if (shimmerFrameLayoutT != null) {
                                            return new gmt((Object) constraintLayoutInflate, (Object) shimmerFrameLayoutT, (byte) 5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public aic a() {
        p3v p3vVar = (p3v) this.b;
        if (p3vVar != null) {
            return new cic(p3vVar.a);
        }
        String str = (String) this.c;
        return str != null ? gic.n(str) : gic.n("wrap");
    }

    public boolean accept(Object obj) {
        return ((kp4) this.b).a() && ((m980) this.c).b && nhc1.Y(((ksk) obj).a, "spotify:playlist:", false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ntj0 */
    /* JADX WARN: Code duplicated, block: B:57:0x0213  */
    public Object apply(Object obj) throws ntj0 {
        ProfilemodelRequest.Profile profile;
        int i;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                pmf0 pmf0Var = (pmf0) obj2;
                String str = (String) this.c;
                pmf0Var.getClass();
                return Single.fromCallable(new e71((a9h) obj, str, (byte) 13)).flatMapCompletable(new mre0(pmf0Var, (byte) 2)).s(pmf0Var.b);
            case 11:
                return ((k3v) obj2).c((YourLibraryResponse) obj, (ywm1) this.c);
            case 13:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (((qfd) obj3).b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((qfd) it.next()).a);
                }
                List<ba51> list = (List) obj2;
                nkv nkvVar = (nkv) this.c;
                ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                for (ba51 ba51Var : list) {
                    List list2 = ba51Var.b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list2) {
                        aa51 aa51Var = (aa51) obj4;
                        Set set = s4b1.f;
                        blc0 blc0Var = uic.x(aa51Var.d).c;
                        nkvVar.getClass();
                        if (blc0Var != blc0.ti || arrayList2.contains(aa51Var.d)) {
                            arrayList4.add(obj4);
                        }
                    }
                    arrayList3.add(new ba51(ba51Var.a, arrayList4));
                }
                return arrayList3;
            case 16:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    sy21Var = null;
                }
                if (sy21Var == null || (profile = (ProfilemodelRequest.Profile) sy21Var.b) == null) {
                    throw new ntj0();
                }
                String str2 = (String) obj2;
                yqg yqgVar = (yqg) ((yzu) this.c).d;
                String strC = profile.C();
                strC.getClass();
                String str3 = strC.length() > 0 ? strC : null;
                String name = profile.getName();
                String imageUrl = profile.getImageUrl();
                imageUrl.getClass();
                String str4 = imageUrl.length() > 0 ? imageUrl : null;
                boolean zU = profile.u();
                int color = profile.getColor();
                String strZ = profile.z();
                strZ.getClass();
                String str5 = strZ.length() > 0 ? strZ : null;
                String strY = profile.y();
                strY.getClass();
                String str6 = strY.length() > 0 ? strY : null;
                boolean zW = profile.w();
                String strO = profile.o();
                strO.getClass();
                String str7 = strO.length() > 0 ? strO : null;
                boolean zContains = profile.q().contains(pex0.d);
                int iO = !profile.F() ? 0 : profile.D().o();
                int iP = (profile.F() && profile.D().r()) ? (int) (profile.D().p().p() / 86400) : 0;
                if (profile.F() && profile.D().s()) {
                    long jQ = profile.D().q().q() - (yqgVar.b() / 1000);
                    if (jQ <= 0) {
                        i = 0;
                    } else {
                        i = (int) ((jQ + 86399) / 86400);
                    }
                } else {
                    i = 0;
                }
                return new myv(str2, str3, name, str4, zU, color, str5, str6, Boolean.valueOf(zW), zContains, new lrz0(iO, iP, i), str7, profile.q().contains(pex0.c));
            case 17:
                SingleSubject singleSubject = new SingleSubject();
                r0w r0wVar = (r0w) this.c;
                ((lls0) obj2).B(new jzv(r0wVar, singleSubject, (byte) 5), new jzv(r0wVar, singleSubject, (byte) 6));
                return singleSubject;
            case 22:
                kqi0 kqi0Var = (kqi0) obj2;
                Map mapJ = sqg0.J(new mmr0[]{new mmr0("signal", String.format("playlistURI:%s", Arrays.copyOf(new Object[]{((uaw) obj).a}, 1))), new mmr0("region", Locale.getDefault().getCountry())});
                dn81 dn81Var = (dn81) kqi0Var.c;
                zym0 zym0Var = (ajg) kqi0Var.d;
                Object obj5 = ((i92) dn81Var.b).get();
                obj5.getClass();
                Observable observable = ((ykm0) kqi0Var.b).a(sqg0.O(mapJ, sqg0.J(new mmr0[]{new mmr0("dt", ((SimpleDateFormat) obj5).format(new Date())), new mmr0("locale", upn1.m()), new mmr0("version", zym0Var.e())}))).toObservable();
                rd70 rd70Var = rd70.c;
                return observable.map(new khc((byte) 16)).map(new khc((lmw) this.c, (byte) 8)).map(olj0.a1).onErrorReturnItem(syz.a);
            case 23:
                return d4o1.q((frw) obj2, (List) obj, (Function0) this.c);
            default:
                mmr0 mmr0Var = (mmr0) obj;
                pdm pdmVar = (pdm) mmr0Var.a;
                PlayerState playerState = (PlayerState) mmr0Var.b;
                return new CompletableFromAction(new tzx(new ngm(playerState, ((ContextTrack) playerState.track().b()).uri()), (vzx) obj2, (tqw) this.c, pdmVar, playerState, (byte) 0));
        }
    }

    public void b(List list) {
        ayl aylVar = (ayl) ((xvu) this.b).i;
        fvu fvuVar = (fvu) this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ayl.c(aylVar, (String) it.next(), fvuVar.a, 4);
        }
        ayl.c(aylVar, fvuVar.d.c(), fvuVar.a, 4);
    }

    public int c(ewt ewtVar, ewt ewtVar2) {
        int iCompare;
        Map map = (Map) this.b;
        long jH = h(map, ewtVar);
        long jH2 = h(map, ewtVar2);
        if (ewtVar.d() || ewtVar2.d() || (iCompare = Boolean.compare(ewtVar2.c(), ewtVar.c())) == 0) {
            return jH == jH2 ? ewtVar.a().compareTo(ewtVar2.a()) : u890.r(jH2, jH);
        }
        return iCompare;
    }

    public jhm d() {
        return new jhm("edit_taste_profile", gtx.c, (fhm) null, 2131954369, (String) null, false, new tm81(0, 12, p3d1.d(2), new k7b1(1, (ivd1) this.c, ivd1.class, "newnessExpiryDate", "newnessExpiryDate(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 12), false), new ihm(new ygm(2), new ghm(axv.d1, axv.e1), new nit(this, (byte) 27)), 116);
    }

    public jhm e(String str) {
        return new jhm("genalpha_disable_playback", pox.c, (fhm) null, 2131956185, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(zlt.Z0, zlt.a1), new wrs(this, str, (byte) 14)), 244);
    }

    public jhm f(lik1 lik1Var) {
        return new jhm("endless_dj_language", smx.c, (fhm) null, Integer.valueOf(((b1y) this.c).a.d() ? 2131957163 : 2131954363), (String) null, false, (tm81) null, new ihm(new bhm(2), new ghm(x0y.Y, new oz6(lik1Var, (byte) 2)), new i5w(this, (byte) 18)), 244);
    }

    public wex g() {
        return (wex) this.c;
    }

    public long h(Map map, ewt ewtVar) {
        Long l;
        if (ewtVar.d()) {
            return Long.MAX_VALUE;
        }
        String strA = ((mur) this.c).a(ewtVar.b());
        if (!map.containsKey(strA) || (l = (Long) map.get(strA)) == null) {
            return Long.MIN_VALUE;
        }
        return l.longValue();
    }

    public xex i() {
        return (xex) this.b;
    }

    public boolean k() {
        return ((p3v) this.b) == null && ((String) this.c) == null;
    }

    public List l(int i, List list) {
        if (list.isEmpty()) {
            return z6x.a;
        }
        Set set = (Set) this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            za71 za71Var = (za71) this.b;
            String str = ((o571) obj).a;
            if (za71Var.a.l(bma1.b.k("status_new_label_shown_".concat(str)), 0) < 3) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || i == 2) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new p571(((g471) it.next()).a(), false));
            }
            return arrayList2;
        }
        List<g471> listA1 = o7h.a1(list, new f57(arrayList, list, (byte) 1));
        ArrayList arrayList3 = new ArrayList(q7h.U(listA1, 10));
        for (g471 g471Var : listA1) {
            arrayList3.add(new p571(g471Var.a(), arrayList.contains(g471Var.a())));
        }
        return arrayList3;
    }

    public ArrayList m(long j, String str) {
        otu otuVar = (otu) this.c;
        String strE = ((dma1) otuVar.b).e(i7w.a, (String) null);
        List<l7w> list = (strE == null || strE.length() == 0) ? z6x.a : ((o7w) ((nfa0) otuVar.c).a(strE, o7w.Companion.serializer())).a;
        long j2 = j - 86400000;
        ArrayList arrayList = new ArrayList();
        for (l7w l7wVar : list) {
            if (j2 < l7wVar.b && !u890.j(l7wVar.a, str)) {
                arrayList.add(l7wVar);
            }
        }
        return arrayList;
    }

    public void n(jbz jbzVar) {
        String str = jbzVar.f13p;
        if (!str.equals((String) this.c) && ((Boolean) ((iu30) this.b).invoke(jbzVar)).booleanValue()) {
            this.c = str;
        }
    }

    public void o(g471 g471Var, boolean z) {
        za71 za71Var = (za71) this.b;
        String str = g471Var.a().a;
        dma1 dma1Var = za71Var.a;
        bma1 bma1VarK = bma1.b.k("status_new_label_shown_".concat(str));
        int iL = z ? Integer.MAX_VALUE : dma1Var.l(bma1VarK, 0) + 1;
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(bma1VarK, iL);
        hma1VarEdit.g();
    }

    public void onFailure(Throwable th) {
        int i = ((n3d1) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            j2h1.o("DualSurfaceProcessorNode");
        } else {
            "Downstream node failed to provide Surface. Target: ".concat(m0p1.u(i));
            j2h1.N("DualSurfaceProcessorNode");
        }
    }

    public void onSuccess(Object obj) {
        d4d1 d4d1Var = (d4d1) obj;
        d4d1Var.getClass();
        try {
            ((e4d1) ((yjq) this.c).c).a(d4d1Var);
        } catch (ProcessingException unused) {
            j2h1.q("DualSurfaceProcessorNode");
        }
    }

    public boolean p(ContextTrack contextTrack) {
        q1x q1xVar = ((z1x) this.b).p;
        if (q1xVar == null) {
            return false;
        }
        anf1 anf1Var = q1xVar.a;
        uuw uuwVar = anf1Var.b;
        return u890.j(contextTrack.uri(), uuwVar.a()) && !q1xVar.b && anf1Var.a != null && (uuwVar instanceof ruw);
    }

    public boolean test(Object obj) {
        s0w s0wVar = (s0w) obj;
        if (!((l811) this.b).a) {
            return true;
        }
        iu30 iu30Var = (iu30) this.c;
        s0wVar.getClass();
        return !((Boolean) iu30Var.invoke(s0wVar)).booleanValue();
    }

    public gmt(t0r0 t0r0Var) {
        this.a = (byte) 2;
        x0u x0uVar = x0u.a;
        this.b = t0r0Var;
        this.c = x0uVar;
    }

    public gmt(iu30 iu30Var) {
        this.a = (byte) 7;
        this.b = iu30Var;
    }

    public /* synthetic */ gmt(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public gmt(yjq yjqVar, n3d1 n3d1Var) {
        this.a = (byte) 12;
        this.c = yjqVar;
        this.b = n3d1Var;
    }

    public gmt(p3v p3vVar, String str, String str2) {
        this.a = (byte) 3;
        this.b = p3vVar;
        this.c = str;
    }
}
