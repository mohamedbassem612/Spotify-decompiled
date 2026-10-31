package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange;
import com.spotify.familyviewservice.accountswitching.v1.GetAddAccountPageResponse;
import com.spotify.familyviewservice.accountswitching.v1.PlanMember;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nbc implements BiFunction, t9v0, h271, Function, Init, jrn0, Predicate, r8m {
    public final /* synthetic */ byte a;

    public static final int c(int i) {
        return (i & 2) != 0 ? i | 64 : i;
    }

    public static long e() {
        ytw0 ytw0Var = jfv.b;
        return fdg1.l0(SystemClock.elapsedRealtimeNanos(), ngv.b);
    }

    public static int g(i1z i1zVar) {
        Integer num;
        String str = i1zVar.b;
        d1z d1zVar = i1zVar.B;
        if (!jhc1.F(str)) {
            return 1;
        }
        d1z d1zVar2 = d1z.b;
        if (!(d1zVar == d1zVar2 || d1zVar == d1z.a) || (num = i1zVar.r) == null || i1zVar.q - num.intValue() < 30) {
            return (d1zVar == d1zVar2 || d1zVar == d1z.a) ? 3 : 4;
        }
        return 2;
    }

    public static bma1 m(String str) {
        if (str == null) {
            eg.m("Required value was null.");
            return null;
        }
        if (nhc1.Y(str, "__", false)) {
            eg.f("Cannot create key in protected namespace");
            return null;
        }
        bma1.c.add(str);
        return new bma1(str);
    }

    public static boolean o(String str) {
        String queryParameter;
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            uri = null;
        }
        return (uri == null || (queryParameter = uri.getQueryParameter("client_id")) == null || queryParameter.length() <= 0) ? false : true;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static bma1 r(String str) {
        if (nhc1.Y(str, "__", false)) {
            eg.f("Cannot create key in protected namespace");
            return null;
        }
        HashSet hashSet = bma1.c;
        if (hashSet.contains(str)) {
            eg.f("Requesting same string for a key previously defined somewhere else: ".concat(str));
            return null;
        }
        hashSet.add(str);
        return new bma1(str);
    }

    public static Next v(z551 z551Var, fz41 fz41Var) {
        String str = fz41Var.a;
        w851 w851Var = z551Var.d;
        if (w851Var instanceof w851) {
            q39 q39Var = w851Var.a;
            List list = q39Var.b.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                k39 k39Var = ((lby) obj).e;
                k39 k39Var2 = k39Var instanceof k39 ? k39Var : null;
                if (!u890.j(k39Var2 != null ? k39Var2.a : null, str)) {
                    arrayList.add(obj);
                }
            }
            return Next.i(z551.a(z551Var, (String) null, (String) null, 0, new w851(new q39(q39Var.a, new b49(arrayList, q39Var.b.b))), (val) null, (fw41) null, (llr0) null, (ue20) null, (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32759), Effects.a(new ex41[]{new ex41(str)}));
        }
        if ((w851Var instanceof p851) || u890.j(w851Var, q851.a) || (w851Var instanceof r851) || u890.j(w851Var, u851.a) || u890.j(w851Var, y851.a) || (w851Var instanceof z851) || (w851Var instanceof a951) || (w851Var instanceof b951)) {
            return Next.j();
        }
        if (!(w851Var instanceof x851)) {
            eg.o();
            return null;
        }
        i39 i39Var = ((x851) w851Var).a;
        List list2 = i39Var.b.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!u890.j(((ma51) obj2).a.a, str)) {
                arrayList2.add(obj2);
            }
        }
        return Next.i(z551.a(z551Var, (String) null, (String) null, 0, new x851(new i39(i39Var.a, new j39(arrayList2, i39Var.b.b))), (val) null, (fw41) null, (llr0) null, (ue20) null, (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32759), Effects.a(new ex41[]{new ex41(str)}));
    }

    public u9v0 a(String str) {
        return new jet(str);
    }

    public Object apply(Object obj, Object obj2) {
        fqi0 eqi0Var;
        boolean z;
        boolean z2 = false;
        switch (this.a) {
            case 6:
                spq0 spq0Var = (spq0) obj;
                Boolean bool = (Boolean) obj2;
                if (spq0Var.c()) {
                    l0l l0lVar = (l0l) spq0Var.b();
                    if (!l0lVar.l() && l0lVar.g() && nhc1.S(l0lVar.E(), "Google", true) && !ihc1.h0(l0lVar.s(), "Chromecast", true) && bool.booleanValue()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                GetAddAccountPageResponse getAddAccountPageResponse = (GetAddAccountPageResponse) obj;
                List list = (List) obj2;
                h290 h290VarP = getAddAccountPageResponse.p();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it = h290VarP.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        boolean zN = getAddAccountPageResponse.n();
                        if (!getAddAccountPageResponse.q()) {
                            getAddAccountPageResponse = null;
                        }
                        return new h9t0(arrayList, zN, true, getAddAccountPageResponse != null ? Integer.valueOf(getAddAccountPageResponse.o()) : null);
                    }
                    PlanMember planMember = (PlanMember) it.next();
                    planMember.getClass();
                    String username = planMember.getUsername();
                    String displayName = planMember.p().getDisplayName();
                    String imageUrl = planMember.p().getImageUrl();
                    int iO = planMember.o();
                    int i = iO == 0 ? -1 : vi10.a[l1d.C(iO)];
                    if (i != -1) {
                        if (i == 1) {
                            eqi0Var = new eqi0(planMember.n().getChildId());
                        } else if (i == 2) {
                            eqi0Var = new fqi0(planMember.q().o());
                        } else if (i != 3) {
                            eg.o();
                            return null;
                        }
                        fqi0 fqi0Var = eqi0Var;
                        int iD = gj10.d(planMember.p());
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                z = it2.hasNext();
                                if (u890.j(((ev) it2.next()).a, planMember.getUsername())) {
                                }
                            }
                        }
                        arrayList.add(new z8t0(username, displayName, imageUrl, fqi0Var, iD, z));
                        break;
                    }
                    eg.m("Account type not supported");
                    return null;
                }
        }
    }

    public Object b(u171 u171Var) {
        qz61 qz61Var = u171Var.a;
        if (!u890.j(qz61Var.c, ysd.a)) {
            hhg1.n("Expected Unknown card data for full content card");
            return null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new mp30(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public wdu0 d() {
        return new wdu0((byte) 8);
    }

    public First e0(Object obj) {
        return First.b((r6g0) obj);
    }

    public Object f(String str, lnm lnmVar) {
        return p8m.a;
    }

    public synchronized bma1 h() {
        return bma1.c.contains("quickplay_taste_onboarding_completed") ? new bma1("quickplay_taste_onboarding_completed") : null;
    }

    public Object j(o5o0 o5o0Var, lnm lnmVar) {
        return p8m.a;
    }

    public synchronized bma1 k(String str) {
        return m(str);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Bundle bundleZ;
        String strValueOf = String.valueOf(intent.getData());
        Set set = s4b1.f;
        String strJ = uic.x(strValueOf).j();
        bi90 parcelableExtra = intent.getParcelableExtra("SELECTED_GROUP_ITEM");
        if (parcelableExtra != null) {
            bundleZ = q3c.z(parcelableExtra, strJ, strValueOf);
        } else {
            if (!jmo1.m(strJ)) {
                hhg1.n("Group category fragment cannot be instantiated without a category or a valid category key");
                return null;
            }
            bundleZ = q3c.z(null, strJ, null);
        }
        return new frn0(bundleZ, li50.class);
    }

    public synchronized bma1 n(String str) {
        return m(str);
    }

    public synchronized bma1 q(String str) {
        return r(str);
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for full content cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for full content cards");
    }

    public boolean test(Object obj) {
        Set set = s4b1.f;
        return !uic.j(((u310) obj).a, bzu0.f);
    }

    public synchronized bma1 u(String str) {
        return r(str);
    }

    public /* synthetic */ nbc(byte b) {
        this.a = b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
                return apc0.b.get(obj);
            case 21:
                return lfz0.b((tl51) obj);
            default:
                return a0f1.d((EsTokenExchange.TokenExchangeResponse) obj);
        }
    }
}
