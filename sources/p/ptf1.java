package p;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.usergeopoints.v1.UpdateLocationRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlinx.coroutines.TimeoutCancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ptf1 implements Function, lqw, mi51, m381, l381 {
    public static JSONObject d;
    public static ptf1 e;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public ptf1(Context context) {
        this.a = (byte) 18;
        JSONObject jSONObject = new JSONObject();
        this.c = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:((?!campaign_ids).)*$");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException e2) {
            i1k0.m(e2.getMessage());
        }
        ne neVarZ = ne.z(context);
        JSONObject jSONObject2 = new JSONObject();
        String strF = neVarZ.F("skip_url_format_key");
        if (TextUtils.isEmpty(strF) || "bnc_no_value".equals(strF)) {
            jSONObject2 = (JSONObject) this.c;
        } else {
            try {
                jSONObject2 = new JSONObject(strF);
            } catch (JSONException e3) {
                i1k0.m(e3.getMessage());
            }
        }
        d = jSONObject2;
        this.b = new ArrayList();
    }

    public static void g(Context context) {
        try {
            new vih1(context).a(new Void[0]);
        } catch (Exception e2) {
            i1k0.m(e2.getMessage());
        }
    }

    public static ptf1 h(Context context) {
        ptf1 ptf1Var = e;
        if (ptf1Var != null) {
            return ptf1Var;
        }
        ptf1 ptf1Var2 = new ptf1(context);
        e = ptf1Var2;
        return ptf1Var2;
    }

    public void a(izr0 izr0Var) {
        uwg1 uwg1Var = (uwg1) this.c;
        SparseArray sparseArray = uwg1Var.h;
        bae baeVar = (bae) this.b;
        if (izr0Var.E() == 0 && (izr0Var.E() & 128) != 0) {
            izr0Var.S(6);
            int iA = izr0Var.a() / 4;
            for (int i = 0; i < iA; i++) {
                izr0Var.o(0, baeVar.b, 4);
                baeVar.m(0);
                int iG = baeVar.g(16);
                baeVar.o(3);
                if (iG == 0) {
                    baeVar.o(13);
                } else {
                    int iG2 = baeVar.g(13);
                    if (sparseArray.get(iG2) == null) {
                        sparseArray.put(iG2, new ni51(new o0g1(uwg1Var, iG2)));
                        uwg1Var.n++;
                    }
                }
            }
            if (uwg1Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public Object apply(Object obj) {
        String str;
        switch (this.a) {
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                va81 va81Var = ((uv00) mmr0Var.b).a(va81.class, (String) this.b).b;
                if (va81Var != null && (str = va81Var.l) != null) {
                    Observable map = ((uu00) this.c).b(new oi("CWPTrailerEventSource", false, new ysf1(str, (byte) 8))).map(new lvc1(str, mmr0Var, va81Var, (byte) 25));
                    if (map != null) {
                        return map;
                    }
                }
                return Observable.just(new mmr0(new mmr0((Object) null, mmr0Var.a), va81Var));
            default:
                String str2 = (String) obj;
                hce1 hce1Var = (hce1) this.c;
                x5u x5uVar = (x5u) hce1Var.d;
                HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) hce1Var.b;
                kai1 kai1Var = (kai1) this.b;
                if (kai1Var instanceof iai1) {
                    ehb ehbVarU = headphoneFilterStateDatabase.u();
                    iai1 iai1Var = (iai1) kai1Var;
                    boolean zBooleanValue = ((Boolean) x5uVar.invoke()).booleanValue();
                    k560 k560Var = iai1Var.a;
                    String str3 = k560Var.a;
                    String str4 = k560Var.b;
                    z9i1 z9i1Var = iai1Var.b;
                    String str5 = z9i1Var.d;
                    String str6 = z9i1Var.e;
                    return m5n1.l(ehbVarU.a, new kd8(ehbVarU, new fhb(str3, str2, str4, z9i1Var.a, z9i1Var.b, zBooleanValue ? z9i1Var.c : false, str5, str6, z9i1Var.f, z9i1Var.g), (byte) 26));
                }
                if (!(kai1Var instanceof jai1)) {
                    eg.o();
                    return null;
                }
                sul1 sul1VarV = headphoneFilterStateDatabase.v();
                jai1 jai1Var = (jai1) kai1Var;
                boolean zBooleanValue2 = ((Boolean) x5uVar.invoke()).booleanValue();
                String str7 = jai1Var.a.a;
                z9i1 z9i1Var2 = jai1Var.b;
                String str8 = z9i1Var2.d;
                String str9 = z9i1Var2.e;
                String str10 = z9i1Var2.b;
                return m5n1.l(sul1VarV.a, new hij1(sul1VarV, new tul1(str7, str2, z9i1Var2.a, str10, str8, str9, z9i1Var2.g, zBooleanValue2 ? z9i1Var2.c : false, z9i1Var2.f), (byte) 28));
        }
    }

    public o3r b() {
        switch (this.a) {
            case 16:
                break;
            case 22:
                break;
        }
        return (o3r) this.b;
    }

    public void d(Object obj) {
        ((lqw) this.b).d(((iu30) this.c).invoke(obj));
    }

    public void dispose() {
        ((lqw) this.b).dispose();
    }

    public String i(String str) {
        String string;
        ArrayList arrayList = (ArrayList) this.b;
        try {
            JSONArray jSONArrayOptJSONArray = d.optJSONArray("uri_skip_list");
            if (jSONArrayOptJSONArray == null) {
                string = null;
                break;
            }
            int i = 0;
            while (true) {
                if (i >= jSONArrayOptJSONArray.length()) {
                    string = null;
                    break;
                }
                try {
                    string = jSONArrayOptJSONArray.getString(i);
                    if (Pattern.compile(string).matcher(str).find()) {
                        break;
                    }
                    i++;
                } catch (JSONException e2) {
                    i1k0.m(e2.getMessage());
                }
            }
            if (string == null) {
                if (arrayList.size() <= 0) {
                    return str;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (str.matches((String) it.next())) {
                        return str;
                    }
                }
            }
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r2 == r10) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(long r16, java.lang.String r18, p.onm r19, boolean r20) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r2 instanceof p.hcg1
            if (r4 == 0) goto L1a
            r4 = r2
            p.hcg1 r4 = (p.hcg1) r4
            int r5 = r4.f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1a
            int r5 = r5 - r6
            r4.f = r5
        L18:
            r7 = r4
            goto L20
        L1a:
            p.hcg1 r4 = new p.hcg1
            r4.<init>(r15, r2)
            goto L18
        L20:
            java.lang.Object r2 = r7.d
            int r4 = r7.f
            r8 = 2
            r5 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r4 == 0) goto L48
            if (r4 == r5) goto L3b
            if (r4 != r8) goto L35
            p.hm5.M(r2)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r0 = move-exception
            goto L8e
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r9
        L3b:
            long r3 = r7.c
            boolean r0 = r7.a
            java.lang.String r5 = r7.b
            p.hm5.M(r2)
            r11 = r0
            r0 = r2
            r2 = r5
            goto L68
        L48:
            p.hm5.M(r2)
            if (r3 == 0) goto Lab
            java.lang.Object r2 = r15.c
            p.a42 r2 = (p.a42) r2
            r7.b = r0
            r7.a = r3
            r11 = r16
            r7.c = r11
            r7.f = r5
            java.io.Serializable r2 = r2.d(r0, r7)
            if (r2 != r10) goto L62
            goto L8a
        L62:
            r4 = r2
            r2 = r0
            r0 = r4
            r13 = r11
            r11 = r3
            r3 = r13
        L68:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L71
            goto Lab
        L71:
            p.wn2 r0 = new p.wn2     // Catch: java.lang.Throwable -> L33
            r5 = 0
            r6 = 19
            r1 = r15
            r0.<init>(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L33
            r7.b = r9     // Catch: java.lang.Throwable -> L33
            r7.a = r11     // Catch: java.lang.Throwable -> L33
            r7.c = r3     // Catch: java.lang.Throwable -> L33
            r7.f = r8     // Catch: java.lang.Throwable -> L33
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r2 = p.rc2.O(r1, r0, r7)     // Catch: java.lang.Throwable -> L33
            if (r2 != r10) goto L8b
        L8a:
            return r10
        L8b:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L33
            goto L93
        L8e:
            p.m231 r2 = new p.m231
            r2.<init>(r0)
        L93:
            java.lang.Throwable r0 = p.e331.a(r2)
            if (r0 == 0) goto La3
            boolean r1 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r1 != 0) goto La3
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto La2
            goto La3
        La2:
            throw r0
        La3:
            boolean r0 = r2 instanceof p.m231
            if (r0 == 0) goto La8
            goto La9
        La8:
            r9 = r2
        La9:
            java.lang.String r9 = (java.lang.String) r9
        Lab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ptf1.j(long, java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public void k(Object obj, tqw tqwVar) {
        ((lqw) this.b).k(obj, tqwVar);
    }

    public tv80 l(String str) {
        i8h1 i8h1Var = (i8h1) ((xrp) this.c).get();
        x6h1 x6h1VarC = ((hll0) this.b).a.c();
        x6h1VarC.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("add_member_help_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void m() {
        i8h1 i8h1Var = (i8h1) ((jwo) this.c).get();
        x6h1 x6h1VarC = ((yok0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("add_to_plan_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 n(s2c1 s2c1Var, int i, boolean z, String str) {
        w7h1 w7h1Var;
        int i2 = z ? 1 : 2;
        int i3 = s2c1Var.m ? 1 : 2;
        i8h1 i8h1Var = (i8h1) ((z1p) this.c).get();
        boolean zY = nhc1.Y(s2c1Var.i, "spotify:", false);
        y6h1 y6h1Var = ((yok0) this.b).b;
        b7x b7xVar = b7x.a;
        if (zY) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("add_ons", (String) null, (Integer) null, (String) null, ktk0.a(i2)));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            Integer numValueOf = Integer.valueOf(i);
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("storefront_card_add_on", (String) null, numValueOf, str, ktk0.b(i3)));
            x6h1VarC2.j = true;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        } else {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("add_ons", (String) null, (Integer) null, (String) null, ktk0.a(i2)));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA2 = x6h1VarC3.a();
            Integer numValueOf2 = Integer.valueOf(i);
            x6h1 x6h1VarC4 = y6h1VarA2.c();
            x6h1VarC4.i.add(new a7h1("storefront_card_add_on", (String) null, numValueOf2, str, ktk0.b(i3)));
            x6h1VarC4.j = true;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        }
        return i8h1Var.m(w7h1Var, (xj61) null);
    }

    public void o() {
        vnd1 vnd1Var = (vnd1) this.b;
        String strQ = yla.q((xvd0) this.c);
        i8h1 i8h1Var = (i8h1) ((ynb0) vnd1Var.b).get();
        g5l0 g5l0Var = (g5l0) vnd1Var.c;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("live_room_dialog", strQ, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = g5l0Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public tv80 p(String str) {
        i8h1 i8h1Var = (i8h1) ((xrp) this.c).get();
        x6h1 x6h1VarC = ((hll0) this.b).a.c();
        x6h1VarC.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("manage_member_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public String q() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((grk0) this.c).a.c();
        x6h1VarC.i.add(new a7h1("contextual_audio_positive_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        boolean zB;
        x1b x1bVar = (x1b) this.c;
        qxc0 qxc0Var = ((jch1) obj).a;
        if (qxc0Var != null) {
            dlg1 dlg1Var = ((pch1) ((jxp) x1bVar.e).get()).b;
            lch1 lch1VarU = o4o1.u(qxc0Var);
            if (dlg1Var.q(zbh1.c) && lch1VarU.c && dlg1Var.g(lch1VarU)) {
                thc1 thc1Var = vhc1Var instanceof thc1 ? (thc1) vhc1Var : null;
                if (thc1Var != null) {
                    zB = do01.b(new co01(thc1Var.c, x1bVar.b, thc1Var.d), vby0.v(thc1Var.f), ((yqg) x1bVar.d).b(), (mmw0) ((ypg0) x1bVar.f).getValue());
                } else {
                    zB = false;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s() {
        i8h1 i8h1Var = (i8h1) this.c;
        txk0 txk0Var = (txk0) this.b;
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("your_dj_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = txk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public boolean t(Object obj) {
        switch (this.a) {
            case 22:
                qxc0 qxc0Var = (qxc0) obj;
                return gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h}) && !((hod0) ((bn1) this.c).g).c(qxc0Var.X);
            default:
                qxc0 qxc0Var2 = (qxc0) obj;
                dfv dfvVar = (dfv) this.c;
                return qxc0Var2.Z0 && !gyo1.L(qxc0Var2.O0) && dfvVar.c.b(new cij1(dfvVar.b, qxc0Var2.X0, dfvVar.d.a(qxc0Var2.e), qxc0Var2.N0, qxc0Var2.t, qxc0Var2.X)) == 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r10 == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(java.lang.String r8, p.lhg1 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.tkg1
            if (r0 == 0) goto L13
            r0 = r10
            p.tkg1 r0 = (p.tkg1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.tkg1 r0 = new p.tkg1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r10)
            goto L8e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            java.lang.String r8 = r0.a
            p.hm5.M(r10)
            goto L49
        L37:
            p.hm5.M(r10)
            java.lang.Object r10 = r7.b
            p.vnd1 r10 = (p.vnd1) r10
            r0.a = r8
            r0.d = r4
            java.lang.Object r10 = r10.g(r8, r9, r0)
            if (r10 != r5) goto L49
            goto L8d
        L49:
            java.util.List r10 = (java.util.List) r10
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L54:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L5f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r10.next()
            p.gjg1 r1 = (p.gjg1) r1
            java.lang.String r6 = r1.a
            java.lang.String r1 = r1.b
            java.lang.String[] r1 = new java.lang.String[]{r6, r1}
            java.util.List r1 = p.p7h.M(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            p.r7h.W(r1, r9)
            goto L5f
        L7d:
            java.lang.Object r7 = r7.c
            p.iyc0 r7 = (p.iyc0) r7
            r0.a = r2
            r0.d = r3
            p.xyc0 r7 = (p.xyc0) r7
            java.lang.Object r10 = r7.m(r8, r9, r0, r2)
            if (r10 != r5) goto L8e
        L8d:
            return r5
        L8e:
            p.py21 r10 = (p.py21) r10
            boolean r7 = r10 instanceof p.oy21
            if (r7 == 0) goto L95
            goto L9a
        L95:
            boolean r7 = r10 instanceof p.ly21
            if (r7 == 0) goto L9f
            r4 = 0
        L9a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L9f:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ptf1.u(java.lang.String, p.lhg1, p.onm):java.lang.Object");
    }

    public f2h1 v(c2h1 c2h1Var, b6 b6Var) {
        synchronized (((pvc) this.b)) {
            f2h1 f2h1Var = (f2h1) ((ydf0) this.c).c(c2h1Var);
            if (f2h1Var != null) {
                if (f2h1Var.a()) {
                    return f2h1Var;
                }
            }
            try {
                f2h1 f2h1Var2 = (f2h1) b6Var.invoke(new vae1(this, c2h1Var, (byte) 9));
                synchronized (((pvc) this.b)) {
                    if (((ydf0) this.c).c(c2h1Var) == null && f2h1Var2.a()) {
                        ((ydf0) this.c).d(c2h1Var, f2h1Var2);
                    }
                }
                return f2h1Var2;
            } catch (Exception e2) {
                k220.p("Could not load font", e2);
                return null;
            }
        }
    }

    public void w() {
        kt91 kt91Var = (kt91) this.c;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962912});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131962912, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable x(wgf wgfVar, p371 p371Var, ela1 ela1Var, o571 o571Var, onm onmVar) throws Throwable {
        zvh1 zvh1Var;
        ela1 ela1Var2;
        o571 o571Var2;
        p371 p371Var2;
        p371 p371Var3;
        ela1 ela1Var3;
        o571 o571Var3;
        String m231Var;
        p371 p371Var4;
        ela1 ela1Var4;
        o571 o571Var4;
        Throwable thA;
        Throwable thA2;
        if (onmVar instanceof zvh1) {
            zvh1Var = (zvh1) onmVar;
            int i = zvh1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zvh1Var.f = i - Integer.MIN_VALUE;
            } else {
                zvh1Var = new zvh1(this, onmVar);
            }
        } else {
            zvh1Var = new zvh1(this, onmVar);
        }
        Object objY = zvh1Var.d;
        int i2 = zvh1Var.f;
        if (i2 == 0) {
            hm5.M(objY);
            if (wgfVar != null) {
                try {
                    cfd cfdVar = (cfd) this.b;
                    try {
                        String strD = p371Var.d();
                        zvh1Var.a = p371Var;
                        ela1Var2 = ela1Var;
                        try {
                            zvh1Var.b = ela1Var2;
                            o571Var2 = o571Var;
                            try {
                                zvh1Var.c = o571Var2;
                                zvh1Var.f = 1;
                                objY = cfdVar.y(wgfVar, strD, zvh1Var);
                                d9n d9nVar = d9n.a;
                                if (objY == d9nVar) {
                                    return d9nVar;
                                }
                                p371Var3 = p371Var;
                                ela1Var3 = ela1Var2;
                                o571Var3 = o571Var2;
                            } catch (Throwable th) {
                                th = th;
                                p371Var2 = p371Var;
                                m231Var = new m231(th);
                                p371Var4 = p371Var2;
                                ela1Var4 = ela1Var2;
                                o571Var4 = o571Var2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            o571Var2 = o571Var;
                            p371Var2 = p371Var;
                            m231Var = new m231(th);
                            p371Var4 = p371Var2;
                            ela1Var4 = ela1Var2;
                            o571Var4 = o571Var2;
                            thA = e331.a(m231Var);
                            if (thA == null) {
                            }
                            thA2 = e331.a(m231Var);
                            if (thA2 != null) {
                                vyo1.y((g871) this.c, k771.Q0, thA2, p371Var4, ela1Var4, o571Var4, (String) null, 32);
                            }
                            if (m231Var instanceof m231) {
                                return null;
                            }
                            return m231Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ela1Var2 = ela1Var;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ela1Var2 = ela1Var;
                    o571Var2 = o571Var;
                }
            } else {
                p371Var3 = p371Var;
                ela1Var3 = ela1Var;
                o571Var3 = o571Var;
            }
            o571Var4 = o571Var3;
            m231Var = str;
            p371Var4 = p371Var3;
            ela1Var4 = ela1Var3;
            thA = e331.a(m231Var);
            if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                throw thA;
            }
            thA2 = e331.a(m231Var);
            if (thA2 != null) {
                vyo1.y((g871) this.c, k771.Q0, thA2, p371Var4, ela1Var4, o571Var4, (String) null, 32);
            }
            if (m231Var instanceof m231) {
                return null;
            }
            return m231Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o571Var3 = zvh1Var.c;
        ela1Var3 = zvh1Var.b;
        p371Var3 = zvh1Var.a;
        try {
            hm5.M(objY);
        } catch (Throwable th5) {
            th = th5;
            o571Var2 = o571Var3;
            p371Var2 = p371Var3;
            ela1Var2 = ela1Var3;
            m231Var = new m231(th);
            p371Var4 = p371Var2;
            ela1Var4 = ela1Var2;
            o571Var4 = o571Var2;
        }
        hhf hhfVar = (hhf) objY;
        String str = hhfVar != null ? hhfVar.a : null;
        o571Var4 = o571Var3;
        m231Var = str;
        p371Var4 = p371Var3;
        ela1Var4 = ela1Var3;
        thA = e331.a(m231Var);
        if (thA == null) {
        }
        thA2 = e331.a(m231Var);
        if (thA2 != null) {
            vyo1.y((g871) this.c, k771.Q0, thA2, p371Var4, ela1Var4, o571Var4, (String) null, 32);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Enum y(irt irtVar, String str, onm onmVar) {
        hai1 hai1Var;
        double d2;
        double d3;
        String str2;
        String str3;
        String str4;
        String str5 = str;
        if (onmVar instanceof hai1) {
            hai1Var = (hai1) onmVar;
            int i = hai1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hai1Var.e = i - Integer.MIN_VALUE;
            } else {
                hai1Var = new hai1(this, onmVar);
            }
        } else {
            hai1Var = new hai1(this, onmVar);
        }
        Object objA = hai1Var.c;
        int i2 = hai1Var.e;
        doe0 doe0Var = doe0.b;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                d2 = irtVar.c;
                irh1 irh1VarO = UpdateLocationRequest.o();
                irh1VarO.q(irtVar.a);
                irh1VarO.s(irtVar.b);
                irh1VarO.n(d2);
                if (str5 != null) {
                    irh1VarO.r(str5);
                }
                UpdateLocationRequest updateLocationRequestBuild = irh1VarO.build();
                try {
                    gai1 gai1Var = (gai1) this.b;
                    updateLocationRequestBuild.getClass();
                    hai1Var.a = str5;
                    hai1Var.b = d2;
                    hai1Var.e = 1;
                    objA = gai1Var.a(updateLocationRequestBuild, hai1Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    d3 = d2;
                    prt prtVar = (prt) this.c;
                    if (str5 == null) {
                        str4 = "unspecified";
                    } else {
                        str4 = str5;
                    }
                    doe0 doe0Var2 = doe0.a;
                    prtVar.e(doe0Var2, 200, d3, str4);
                    return doe0Var2;
                } catch (HttpException e2) {
                    e = e2;
                    prt prtVar2 = (prt) this.c;
                    if (str5 == null) {
                        str3 = "unspecified";
                    } else {
                        str3 = str5;
                    }
                    prtVar2.e(doe0Var, e.a, d2, str3);
                    return doe0Var;
                } catch (Exception unused) {
                    prt prtVar3 = (prt) this.c;
                    if (str5 == null) {
                        str2 = "unspecified";
                    } else {
                        str2 = str5;
                    }
                    prtVar3.e(doe0Var, -1, d2, str2);
                    return doe0Var;
                }
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d4 = hai1Var.b;
            str5 = hai1Var.a;
            try {
                hm5.M(objA);
                d3 = d4;
                try {
                    prt prtVar4 = (prt) this.c;
                    if (str5 == null) {
                        str4 = "unspecified";
                    } else {
                        str4 = str5;
                    }
                    doe0 doe0Var3 = doe0.a;
                    prtVar4.e(doe0Var3, 200, d3, str4);
                    return doe0Var3;
                } catch (HttpException e3) {
                    e = e3;
                    d2 = d3;
                    prt prtVar5 = (prt) this.c;
                    if (str5 == null) {
                        str3 = "unspecified";
                    } else {
                        str3 = str5;
                    }
                    prtVar5.e(doe0Var, e.a, d2, str3);
                    return doe0Var;
                } catch (Exception unused2) {
                    d2 = d3;
                    prt prtVar6 = (prt) this.c;
                    if (str5 == null) {
                        str2 = "unspecified";
                    } else {
                        str2 = str5;
                    }
                    prtVar6.e(doe0Var, -1, d2, str2);
                    return doe0Var;
                }
            } catch (HttpException e4) {
                e = e4;
                d2 = d4;
                prt prtVar7 = (prt) this.c;
                if (str5 == null) {
                    str3 = "unspecified";
                } else {
                    str3 = str5;
                }
                prtVar7.e(doe0Var, e.a, d2, str3);
                return doe0Var;
            } catch (Exception unused3) {
                d2 = d4;
                prt prtVar8 = (prt) this.c;
                if (str5 == null) {
                    str2 = "unspecified";
                } else {
                    str2 = str5;
                }
                prtVar8.e(doe0Var, -1, d2, str2);
                return doe0Var;
            }
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    public ptf1(vnd1 vnd1Var, yla ylaVar, xvd0 xvd0Var) {
        this.a = (byte) 12;
        this.b = vnd1Var;
        this.c = xvd0Var;
    }

    public void c(yve1 yve1Var, gc10 gc10Var, wwg1 wwg1Var) {
    }

    public ptf1(i8h1 i8h1Var, edr0 edr0Var) {
        this.a = (byte) 8;
        this.b = i8h1Var;
        this.c = new grk0("SEND", edr0Var.b(of61.a));
    }

    public ptf1(ConstraintLayout constraintLayout, ViewStub viewStub, ConstraintLayout constraintLayout2, Barrier barrier) {
        this.a = (byte) 26;
        this.b = constraintLayout2;
        this.c = barrier;
    }

    public ptf1(bn1 bn1Var) {
        this.a = (byte) 22;
        this.c = bn1Var;
        this.b = bn1Var.e;
    }

    public /* synthetic */ ptf1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ptf1(dfv dfvVar) {
        this.a = (byte) 28;
        this.c = dfvVar;
        this.b = dfvVar.g;
    }

    public ptf1(nwa nwaVar, yqg yqgVar) {
        this.a = (byte) 19;
        this.b = nwaVar;
        this.c = yqgVar.d();
    }

    public ptf1(x1b x1bVar) {
        this.a = (byte) 16;
        this.c = x1bVar;
        this.b = w3p1.o(new l4r(pwc0.b, 2, hzg1.i, new j4r(new ymg1(x1bVar, (byte) 11)), hzg1.t), hzg1.h);
    }

    public ptf1() {
        this.a = (byte) 7;
        this.b = new pvc((byte) 26);
        this.c = new ydf0(16);
    }

    public ptf1(uwg1 uwg1Var) {
        this.a = (byte) 6;
        this.c = uwg1Var;
        this.b = new bae(new byte[4], 4);
    }
}
