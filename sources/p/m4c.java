package p;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m4c implements Function, c290, BiFunction, ft50, z1g0, cjh0, zfa, rr41, Init {
    public final /* synthetic */ byte a;

    public m4c(daq daqVar, teq teqVar) {
        this.a = (byte) 4;
    }

    public static final String g(w7h1 w7h1Var) {
        Set set = g2u0.c;
        List list = ((q6h1) w7h1Var).c.b.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((y6h1) it.next()).d, arrayList);
        }
        return "/".concat(o7h.y0(o7h.N0(((q6h1) w7h1Var).c.a.d, arrayList), "/", (String) null, (String) null, hxt0.h, 30));
    }

    public static final boolean i(StringBuilder sb, String str, Object obj, boolean z) {
        if (obj != null) {
            if (z) {
                sb.append(",");
            }
            sb.append(str + '=' + obj);
        } else {
            obj = null;
        }
        return obj != null;
    }

    public static final xq50 j(yq50 yq50Var) {
        nac nacVar = new nac();
        yq50Var.d(nacVar);
        return new xq50(yq50Var, nacVar, (byte) 0);
    }

    public static final Method k() {
        String[] strArr = sk30.b;
        return (Method) sk30.e.getValue();
    }

    public static final Method l() {
        String[] strArr = sk30.b;
        return (Method) sk30.d.getValue();
    }

    public static final yq50 m(tn21 tn21Var) {
        return new yq50(tn21Var, (byte) 0);
    }

    public static String n(String str) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:ai-playlist:reedit:".concat(str)).z();
        if (strZ != null) {
            return strZ;
        }
        eg.m("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f A[PHI: r6
      0x006f: PHI (r6v7 int) = (r6v4 int), (r6v4 int), (r6v5 int), (r6v6 int) binds: [B:41:0x006d, B:47:0x0087, B:53:0x0091, B:55:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    public static n3z o(String str, iix0 iix0Var, mdz mdzVar, p6v0 p6v0Var, List list, tto ttoVar, l1z l1zVar, hll hllVar, qfd qfdVar) {
        long j;
        int i;
        int i2;
        List list2;
        if (iix0Var instanceof gix0) {
            gix0 gix0Var = (gix0) iix0Var;
            j = gix0Var.b - gix0Var.c;
        } else {
            j = iix0Var instanceof hix0 ? ((hix0) iix0Var).b : 0L;
        }
        long j2 = j;
        int i3 = 2;
        if (mdzVar == null) {
            i = 1;
        } else if (mdzVar.l) {
            i = 3;
        } else if (mdzVar.k) {
            i = 2;
        } else {
            i = 1;
        }
        boolean zG = iix0Var != null ? iix0Var.g() : false;
        boolean z = p6v0Var != null && p6v0Var.a;
        boolean z2 = l1zVar != null && l1zVar.e;
        d1z d1zVar = (hllVar == null || (list2 = hllVar.d) == null || !list2.contains(fll.c)) ? d1z.b : d1z.c;
        if (qfdVar != null) {
            l131 l131Var = (l131) o7h.s0(qfdVar.e);
            int i4 = l131Var == null ? -1 : o3z.a[l131Var.ordinal()];
            if (i4 == -1) {
                i2 = i3;
            } else if (i4 == 1) {
                i2 = 3;
            } else if (i4 == 2 || i4 == 3) {
                i2 = 4;
            } else {
                i3 = 5;
                if (i4 != 4) {
                    if (i4 != 5) {
                        eg.o();
                        return null;
                    }
                    i3 = 6;
                }
                i2 = i3;
            }
        } else {
            i2 = i3;
        }
        return new n3z(str, i, zG, j2, z, list, z2, d1zVar, i2, ttoVar);
    }

    public static vi11 p() {
        return new vi11((byte) 20);
    }

    public static uo5 r(JSONArray jSONArray) {
        String strOptString;
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        HashMap mapW = null;
        HashMap mapW2 = null;
        HashMap mapW3 = null;
        String strOptString2 = null;
        String strOptString3 = null;
        String strOptString4 = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                if (strOptString.equalsIgnoreCase("other")) {
                    strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                    mapW = w(jSONObjectOptJSONObject);
                } else if (strOptString.equalsIgnoreCase("transient")) {
                    strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                    mapW2 = w(jSONObjectOptJSONObject);
                } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                    strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                    mapW3 = w(jSONObjectOptJSONObject);
                }
            }
        }
        return new uo5(mapW, mapW2, mapW3, strOptString2, strOptString3, strOptString4);
    }

    public static uo5 t() {
        return new uo5((HashMap) null, sqg0.H(new mmr0[]{new mmr0(2, (Object) null), new mmr0(4, (Object) null), new mmr0(9, (Object) null), new mmr0(17, (Object) null), new mmr0(341, (Object) null)}), sqg0.H(new mmr0[]{new mmr0(102, (Object) null), new mmr0(190, (Object) null), new mmr0(412, (Object) null)}), (String) null, (String) null, (String) null);
    }

    public static sqk0 u(yxk0 yxk0Var, ave0 ave0Var, int i) {
        return new sqk0(new rpl0(yxk0Var, Integer.valueOf(i)), ave0Var != null ? ave0Var.a : null, ave0Var != null ? Integer.valueOf(ave0Var.b) : null, ave0Var != null ? ave0Var.c : null, ave0Var != null ? ave0Var.d : null);
    }

    public static HashMap w(JSONObject jSONObject) {
        int iOptInt;
        HashSet hashSet;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                        if (iOptInt2 != 0) {
                            hashSet.add(Integer.valueOf(iOptInt2));
                        }
                    }
                }
                map.put(Integer.valueOf(iOptInt), hashSet);
            }
        }
        return map;
    }

    public static phd x(m4c m4cVar, View view, ViewGroup viewGroup, dn60 dn60Var) {
        mgb s90Var;
        boolean z = false;
        if (dn60Var instanceof wm60) {
            wm60 wm60Var = (wm60) dn60Var;
            s90Var = new mgb(new tf2(hu20.c(m4cVar.v(view, viewGroup, wm60Var.d, false), new h4c(2, null)), (byte) 4), wm60Var, (byte) 5);
        } else {
            if (!dn60Var.equals(ym60.e) && !dn60Var.equals(zm60.e) && !dn60Var.equals(bn60.e) && (dn60Var.equals(an60.e) || dn60Var.equals(cn60.e))) {
                z = true;
            }
            s90Var = new s90(new hs6(m4cVar.v(view, viewGroup, dn60Var.d, z), (byte) 20), z, dn60Var);
        }
        return o4p1.l(s90Var);
    }

    public void a(MainLayout mainLayout, b2g0 b2g0Var) {
        g2g0 g2g0Var = (g2g0) b2g0Var;
        boolean z = g2g0Var.b;
        mainLayout.getBannerContainer().setVisibility(g2g0Var.a ? 0 : 8);
        mainLayout.getNavigationContainer().setVisibility(z ? 0 : 8);
        Iterator it = mainLayout.getNowPlayingViews().iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setVisibility(z ? 0 : 8);
        }
        View sidePanelBackground = mainLayout.getSidePanelBackground();
        if (sidePanelBackground != null) {
            sidePanelBackground.setVisibility(z ? 0 : 8);
        }
        Guideline sidePanelGuideline = mainLayout.getSidePanelGuideline();
        if (sidePanelGuideline != null) {
            qhl layoutParams = sidePanelGuideline.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            qhl qhlVar = layoutParams;
            qhlVar.c = z ? qx21.a(2131166389, mainLayout.getResources()) : 0.0f;
            sidePanelGuideline.setLayoutParams(qhlVar);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrack == null || !l4o1.G(contextTrack) || l4o1.U(contextTrack)) {
                    return ohe.a;
                }
                String strA0 = l4o1.a0(contextTrack, "album_uri");
                if (strA0 == null) {
                    strA0 = "";
                }
                return new phe(strA0);
            default:
                gag1 gag1Var = (gag1) obj;
                List list = gag1Var.a.a;
                int iJ = p7h.J(list, new tla(gag1Var, (byte) 5));
                if (iJ < 0) {
                    return yua.a;
                }
                jcg1 jcg1Var = (jcg1) list.get(iJ);
                return new mbl1(jcg1Var.a, jcg1Var.b, jcg1Var.d);
        }
    }

    public boolean b() {
        boolean z;
        synchronized (t320.a) {
            try {
                int i = t320.c;
                t320.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > t320.d + 30000) {
                    t320.c = 0;
                    t320.d = SystemClock.uptimeMillis();
                    String[] list = t320.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    t320.e = list.length < 800;
                }
                z = t320.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public Object convert(int i) {
        switch (this.a) {
            case 3:
                w80 w80VarA = w80.a(i);
                return w80VarA == null ? w80.f : w80VarA;
            default:
                m871 m871Var = i != 0 ? null : m871.UNSPECIFIED_TYPE;
                return m871Var == null ? m871.UNRECOGNIZED : m871Var;
        }
    }

    public vfa d() {
        return new rzo0();
    }

    public b2g0 e(c2g0 c2g0Var) {
        ggr0 ggr0Var = c2g0Var.a;
        if (ggr0Var.equals(dgr0.a)) {
            return new g2g0(true, true);
        }
        if (ggr0Var.equals(egr0.a)) {
            return new g2g0(false, false);
        }
        if (ggr0Var.equals(fgr0.a)) {
            return new g2g0(true, true);
        }
        eg.o();
        return null;
    }

    public First e0(Object obj) {
        return s9x0.g((rqe1) obj);
    }

    public boolean f(k291 k291Var) {
        w4u w4uVar = k291Var.a;
        boolean z = w4uVar instanceof w4u;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z ? w4uVar.a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        w4u w4uVar2 = k291Var.b;
        if (w4uVar2 instanceof w4u) {
            i = w4uVar2.a;
        }
        return i > 100;
    }

    public List h(MainLayout mainLayout, b2g0 b2g0Var, a2g0 a2g0Var) {
        jhg1 ogc0Var = new ogc0(48);
        ogc0Var.b(mainLayout.getBannerContainer());
        jhg1 ogc0Var2 = new ogc0(8388611);
        ogc0Var2.b(mainLayout.getNavigationContainer());
        Iterator it = mainLayout.getNowPlayingViews().iterator();
        while (it.hasNext()) {
            ogc0Var2.b((View) it.next());
        }
        View sidePanelBackground = mainLayout.getSidePanelBackground();
        if (sidePanelBackground != null) {
            ogc0Var2.b(sidePanelBackground);
        }
        jhg1 rceVar = new rce();
        rceVar.b(mainLayout.getFragmentContainer());
        rceVar.b(mainLayout.getBannerContainer());
        rceVar.b(mainLayout.getLimitedExperienceIndicatorContainer());
        return p7h.M(new jhg1[]{ogc0Var, ogc0Var2, rceVar});
    }

    public kp00 q(String str, boolean z, boolean z2) {
        o3r o3rVarF;
        jd0 jd0Var = jd0.g;
        pwc0 pwc0Var = pwc0.r;
        hjx0 hjx0Var = hjx0.a;
        if (z) {
            l4r l4rVar = new l4r(hjx0Var, 2, lyy.a1, new j4r(q3z.N0), lyy.e1);
            jd11 jd11Var = rc11.a;
            l4r l4rVar2 = new l4r(new xv00(jd11Var.b(mdz.class)), 1, q3z.i, new j4r(q3z.O0), q3z.t);
            l4r l4rVar3 = new l4r(new xv00(jd11Var.b(p6v0.class)), 2, q3z.b, new j4r(q3z.P0), q3z.c);
            l4r l4rVar4 = new l4r(new wlu(jd11Var.b(jo70.class)), 2, q3z.d, new j4r(q3z.Q0), q3z.e);
            l4r l4rVar5 = new l4r(new xv00(jd11Var.b(mtl.class)), 2, q3z.f, new j4r(new gy((byte) 25, z2)), q3z.g);
            l4r l4rVar6 = new l4r(new xv00(jd11Var.b(l1z.class)), 2, q3z.h, new j4r(q3z.R0), lyy.Q0);
            l4r l4rVar7 = new l4r(new xv00(jd11Var.b(hll.class)), 2, lyy.R0, new j4r(q3z.S0), lyy.S0);
            l4r l4rVar8 = new l4r(pwc0Var, 2, lyy.T0, new j4r(q3z.T0), lyy.U0);
            l4r l4rVar9 = new l4r(new xv00(jd11Var.b(a7q0.class)), 2, lyy.V0, new j4r(q3z.U0), lyy.W0);
            l4r l4rVar10 = new l4r(new xv00(jd11Var.b(e2k1.class)), 2, lyy.X0, new j4r(q3z.X), lyy.Y0);
            l4r l4rVar11 = new l4r(new xv00(jd11Var.b(zoy0.class)), 2, lyy.Z0, new j4r(q3z.Y), lyy.b1);
            l4r l4rVar12 = new l4r(jd0Var, 2, lyy.c1, new j4r(q3z.Z), lyy.d1);
            o3rVarF = new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, l4rVar10, l4rVar11, l4rVar12}), new w3r(new r3z(this, str, z2), l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, l4rVar10, l4rVar11, l4rVar12, (byte) 0), false);
        } else {
            l4r l4rVar13 = new l4r(hjx0Var, 2, s3z.b, new j4r(s3z.P0), s3z.f);
            jd11 jd11Var2 = rc11.a;
            o3rVarF = w3p1.f(l4rVar13, new l4r(new xv00(jd11Var2.b(p6v0.class)), 2, s3z.g, new j4r(s3z.Q0), s3z.h), new l4r(new wlu(jd11Var2.b(jo70.class)), 2, s3z.i, new j4r(s3z.R0), s3z.t), new l4r(new xv00(jd11Var2.b(mtl.class)), 2, s3z.X, new j4r(new gy((byte) 26, z2)), s3z.Y), new l4r(new xv00(jd11Var2.b(l1z.class)), 2, s3z.Z, new j4r(s3z.S0), q3z.V0), new l4r(new xv00(jd11Var2.b(hll.class)), 2, q3z.W0, new j4r(s3z.T0), q3z.X0), new l4r(pwc0Var, 2, q3z.Y0, new j4r(s3z.U0), q3z.Z0), new l4r(new xv00(jd11Var2.b(a7q0.class)), 2, q3z.a1, new j4r(s3z.V0), q3z.b1), new l4r(new xv00(jd11Var2.b(e2k1.class)), 2, q3z.c1, new j4r(s3z.W0), q3z.d1), new l4r(new xv00(jd11Var2.b(zoy0.class)), 2, q3z.e1, new j4r(s3z.N0), s3z.c), new l4r(jd0Var, 2, s3z.d, new j4r(s3z.O0), s3z.e), new t3z(this, str, z2));
        }
        return new kp00(new uzq(o3rVarF), p3z.b, (byte) 7);
    }

    public synchronized uo5 s() {
        uo5 uo5VarT;
        uo5VarT = uo5.X;
        if (uo5VarT == null) {
            uo5VarT = t();
            uo5.X = uo5VarT;
        }
        return uo5VarT;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public mr20 v(View view, ViewGroup viewGroup, float f, boolean z) {
        mr20 mr20VarU = rqt0.u(h4p1.f(new gqj1(view, (lnm) null, (byte) 4)));
        dt71 dt71VarE = mgo1.e(1, 0, 2, 2);
        z22 z22Var = new z22(dt71VarE, (byte) 1);
        view.getViewTreeObserver().addOnScrollChangedListener(z22Var);
        z22Var.onScrollChanged();
        return rqt0.u(new x010(mr20VarU, new iib(new sr0(new huz(new bt20(100L, dt71VarE, (lnm) null), (byte) 6), this, view, viewGroup, (byte) 5), new l2(view, z22Var, (lnm) null), (byte) 6), new l4c(z, f, null), (byte) 1));
    }

    public /* synthetic */ m4c(byte b) {
        this.a = b;
    }

    public void c() {
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                Boolean bool = (Boolean) obj;
                spq0 spq0Var = (spq0) obj2;
                boolean z = true;
                if (!(spq0Var.c() ? ((l0l) spq0Var.b()).l() : true) && bool.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return new l9z0((iun0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
