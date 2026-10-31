package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m3c implements BiFunction, hx30, Function {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public m3c(Activity activity) {
        this.a = (byte) 0;
        n3c n3cVarH = n3c.h();
        if (activity != null) {
            if (n3cVarH.f() == null || !n3cVarH.f().getLocalClassName().equals(activity.getLocalClassName())) {
                i1k0.B("currentActivityReference_ was " + n3cVarH.h);
                n3cVarH.h = new WeakReference(activity);
                i1k0.B("currentActivityReference_ is now set to " + n3cVarH.h);
            }
        }
    }

    public void a(Object obj, hth0 hth0Var) {
        if (this.b) {
            hth0Var.release();
            return;
        }
        hth0 hth0Var2 = (hth0) ((LinkedHashMap) this.d).put(obj, hth0Var);
        if (hth0Var2 != null) {
            hth0Var2.g(0.0f);
            hth0Var2.release();
        }
        hth0Var.b(this.c);
        b();
    }

    public Object apply(Object obj, Object obj2) throws Throwable {
        l510 l510Var = (l510) obj;
        u7c u7cVar = (u7c) this.d;
        if (((Boolean) obj2).booleanValue()) {
            List<p510> list = l510Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (p510 p510Var : list) {
                List list2 = p510Var.e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!u890.j(((t510) obj3).e, Boolean.TRUE)) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList.add(new p510(p510Var.a, p510Var.b, p510Var.c, p510Var.d, arrayList2, p510Var.f, p510Var.g, p510Var.h, p510Var.i));
            }
            l510Var = new l510(arrayList, l510Var.b, l510Var.c);
        }
        List list3 = l510Var.a;
        r9c r9cVar = (r9c) this.e;
        boolean z = this.b;
        boolean z2 = this.c;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list3.iterator();
        int i = 0;
        while (true) {
            Throwable th = null;
            if (!it.hasNext()) {
                return new z310(arrayList3, new f410(14, u7cVar.a.getString(2131955874), (String) null, (List) null), (m510) null, (String) null);
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            p510 p510Var2 = (p510) next;
            p710 p710Var = new p710(16, Integer.valueOf(i), "SECTION", p510Var2.a, p510Var2.c, (String) null);
            List list4 = p510Var2.e;
            ArrayList arrayList4 = new ArrayList();
            int i3 = 0;
            for (Object obj4 : list4) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    p7h.T();
                    throw th2;
                }
                t510 t510Var = (t510) obj4;
                Throwable th3 = th;
                ArrayList arrayList5 = arrayList4;
                p510 p510Var3 = p510Var2;
                p710 p710Var2 = p710Var;
                Iterator it2 = it;
                r9c r9cVar2 = r9cVar;
                u310 u310Var = (u310) u7cVar.f.c(t510Var, p510Var2.b, Boolean.valueOf(r9cVar.i), z, z2, u7cVar.e, new y310(p7h.M(new p710[]{p710Var, new p710(18, Integer.valueOf(i3), "ITEM", (String) null, t510Var.c, (String) null)})), 3, r9cVar.e, (String) null, (rz0) null).h();
                if (u310Var != null) {
                    arrayList5.add(u310Var);
                }
                arrayList4 = arrayList5;
                th = th3;
                i3 = i4;
                p510Var2 = p510Var3;
                p710Var = p710Var2;
                it = it2;
                r9cVar = r9cVar2;
            }
            r7h.W(arrayList4, arrayList3);
            it = it;
            i = i2;
        }
    }

    public void b() {
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            Object key = entry.getKey();
            hth0 hth0Var = (hth0) entry.getValue();
            Float f = (Float) ((ww7) this.e).a.get(key);
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            if (hth0Var.c() != fFloatValue) {
                hth0Var.g(fFloatValue);
            }
        }
    }

    public void c() {
        i1k0.B("Beginning session initialization");
        i1k0.B("Session uri is " + ((Uri) this.e));
        i1k0.B("Callback is " + ((o2b1) this.d));
        i1k0.B("Is auto init " + this.b);
        i1k0.B("Will ignore intent null");
        i1k0.B("Is reinitializing " + this.c);
        if (n3c.u) {
            i1k0.B("Session init is deferred until signaled by plugin.");
            n3c.h().l = this;
            StringBuilder sb = new StringBuilder("Session initialization deferred until plugin invokes notifyNativeToInit()\nCaching Session Builder ");
            sb.append(n3c.h().l);
            sb.append("\nuri: ");
            sb.append((Uri) n3c.h().l.e);
            sb.append("\ncallback: ");
            sb.append((o2b1) n3c.h().l.d);
            sb.append("\nisReInitializing: ");
            sb.append(n3c.h().l.c);
            sb.append("\ndelay: 0\nisAutoInitialization: ");
            n3c.h().l.getClass();
            sb.append(n3c.h().l.b);
            sb.append("\nignoreIntent: null");
            n3c.h().l.getClass();
            i1k0.B(sb.toString());
            return;
        }
        n3c n3cVarH = n3c.h();
        if (n3cVarH == null) {
            i1k0.q("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
            return;
        }
        Activity activityF = n3cVarH.f();
        Intent intent = activityF != null ? activityF.getIntent() : null;
        Uri referrer = activityF != null ? activityF.getReferrer() : null;
        i1k0.B("Activity: " + activityF);
        i1k0.B("Intent: " + intent);
        i1k0.B("Initial Referrer: " + referrer);
        if (activityF != null && intent != null && referrer != null) {
            ne.z(activityF).T(referrer.toString());
        }
        Uri uri = (Uri) this.e;
        if (uri != null) {
            n3cVarH.o(uri, activityF);
        } else if (this.c && n3c.k(intent)) {
            n3cVarH.o(intent != null ? intent.getData() : null, activityF);
        } else if (this.c) {
            o2b1 o2b1Var = (o2b1) this.d;
            if (o2b1Var != null) {
                yt91 yt91Var = (yt91) o2b1Var.b;
                if (((w62) yt91Var.b).k((Intent) yt91Var.c, true, null, "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".")) {
                    return;
                }
                ((ptb) yt91Var.d).invoke();
                return;
            }
            return;
        }
        i1k0.B("isInstantDeepLinkPossible " + n3cVarH.i);
        if (n3cVarH.i) {
            n3cVarH.i = false;
            o2b1 o2b1Var2 = (o2b1) this.d;
            if (o2b1Var2 != null) {
                o2b1Var2.b(n3cVarH.i(), (r3c) null);
            }
            y861 y861Var = n3c.h().f;
            f4t f4tVar = f4t.b;
            y861Var.b("instant_dl_session", "true");
            n3cVarH.a();
            this.d = null;
        }
        v861 v861VarG = n3cVarH.g((o2b1) this.d, this.b);
        i1k0.m("Creating " + v861VarG + " from init on thread " + Thread.currentThread().getName());
        StringBuilder sb2 = new StringBuilder("initializeSession ");
        sb2.append(v861VarG);
        sb2.append(" delay 0");
        i1k0.B(sb2.toString());
        ne neVar = n3cVarH.b;
        if (neVar.F("bnc_branch_key") == null || neVar.F("bnc_branch_key").equalsIgnoreCase("bnc_no_value")) {
            n3cVarH.n = 3;
            l3c l3cVar = v861VarG.i;
            if (l3cVar != null) {
                l3cVar.b((JSONObject) null, new r3c("Trouble initializing Branch.", -114));
            }
            i1k0.C("Warning: Please enter your branch_key in your project's manifest");
            return;
        }
        if (cwl1.a) {
            i1k0.C("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
        }
        Intent intent2 = n3cVarH.f() != null ? n3cVarH.f().getIntent() : null;
        boolean zK = n3c.k(intent2);
        int i = n3cVarH.n;
        i1k0.B("Intent: " + intent2 + " forceBranchSession: " + zK + " initState: " + l1d.F(i));
        if (i == 3 || zK) {
            if (zK && intent2 != null) {
                intent2.removeExtra(eqq.h(2));
            }
            n3cVarH.p(v861VarG, zK);
            return;
        }
        l3c l3cVar2 = v861VarG.i;
        if (l3cVar2 != null) {
            l3cVar2.b((JSONObject) null, new r3c("Warning.", -118));
        }
    }

    public void d() {
        this.b = true;
    }

    public void e() {
        this.b = false;
        this.c = false;
        t45 t45VarA = ((zle1) this.d).a("load_latest_nodes_with_metadata");
        t45VarA.h = "android-campfire-service-impl";
        t45.m(t45VarA, "load_latest_nodes_with_metadata", 4);
        this.e = t45VarA;
    }

    public void f(int i) {
        String str;
        t45 t45Var = (t45) this.e;
        if (t45Var != null) {
            if (i == 1) {
                str = "success";
            } else if (i == 2) {
                str = "failed_to_load_latest_nodes";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "failed_to_load_extended_metadata";
            }
            t45Var.g.put("outcome", str);
            t45Var.g("load_latest_nodes_with_metadata");
            ((zle1) this.d).b(t45Var.e());
        }
        this.e = null;
    }

    public void g() {
        if (this.b) {
            return;
        }
        Iterator it = ((LinkedHashMap) this.d).values().iterator();
        while (it.hasNext()) {
            ((hth0) it.next()).j();
        }
    }

    public void h() {
        this.c = true;
        c();
    }

    public void i(Object obj) {
        hth0 hth0Var;
        if (this.b || (hth0Var = (hth0) ((LinkedHashMap) this.d).remove(obj)) == null) {
            return;
        }
        hth0Var.g(0.0f);
        hth0Var.release();
    }

    public void j(boolean z) {
        if (this.b || z == this.c) {
            return;
        }
        this.c = z;
        Iterator it = ((LinkedHashMap) this.d).values().iterator();
        while (it.hasNext()) {
            ((hth0) it.next()).b(z);
        }
    }

    public void k(o2b1 o2b1Var) {
        i1k0.B("InitSessionBuilder setting BranchReferralInitListener withCallback with " + o2b1Var);
        this.d = o2b1Var;
    }

    public void l(Uri uri) {
        i1k0.B("InitSessionBuilder setting withData with " + uri);
        this.e = uri;
    }

    public void onSuccess(Object obj) {
        final jxh0 jxh0Var = (jxh0) obj;
        fzh0 fzh0Var = ((e0i0) this.e).d;
        final ixh0 ixh0Var = (ixh0) this.d;
        final boolean z = this.b;
        final boolean z2 = this.c;
        Runnable runnable = new Runnable() { // from class: p.qzh0
            @Override // java.lang.Runnable
            public final void run() {
                fzh0 fzh0Var2 = ((e0i0) this.a.e).d;
                fzh0Var2.C();
                ffu0 ffu0Var = fzh0Var2.t;
                bai0.f(ffu0Var, jxh0Var);
                int playbackState = ffu0Var.getPlaybackState();
                if (z) {
                    if (playbackState == 1) {
                        if (ffu0Var.Y(2)) {
                            ffu0Var.e();
                        }
                    } else if (playbackState == 4 && ffu0Var.Y(4)) {
                        ffu0Var.y();
                    }
                }
                boolean z3 = z2;
                if (z3 && ffu0Var.Y(1)) {
                    ffu0Var.j();
                }
                l8u0 l8u0Var = new l8u0();
                l8u0Var.a.e(new int[]{31, 2});
                l8u0Var.c(1, z3);
                fzh0Var2.v(ixh0Var, l8u0Var.d());
            }
        };
        fzh0Var.getClass();
        fzh0Var.x = ixh0Var;
        runnable.run();
        fzh0Var.x = null;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sbT = l1d.t("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                sbT.append((String) this.d);
                sbT.append(", name=");
                return gvg.k(sbT, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public void onFailure(Throwable th) {
    }

    public m3c(vxm1 vxm1Var, boolean z, r9c r9cVar, boolean z2) {
        this.a = (byte) 9;
        this.d = vxm1Var;
        this.b = z;
        this.e = r9cVar;
        this.c = z2;
    }

    public m3c(zle1 zle1Var) {
        this.a = (byte) 6;
        this.d = zle1Var;
    }

    public m3c(LinkedHashMap linkedHashMap, ww7 ww7Var) {
        this.a = (byte) 4;
        this.d = new LinkedHashMap(linkedHashMap);
        this.e = ww7Var;
        b();
    }

    public m3c(String str, boolean z, String str2, boolean z2) {
        this.a = (byte) 3;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public m3c(qba qbaVar) {
        this.a = (byte) 2;
        qbaVar.getClass();
        this.d = qbaVar;
        this.e = new loh0();
    }

    public m3c(e0i0 e0i0Var, ixh0 ixh0Var, boolean z, boolean z2) {
        this.a = (byte) 5;
        this.e = e0i0Var;
        this.d = ixh0Var;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ m3c(rhh0 rhh0Var, r9c r9cVar, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = rhh0Var;
        this.e = r9cVar;
        this.b = z;
        this.c = z2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                return ((ats0) this.d).g((r9c) this.e, this.b, this.c);
            case 8:
                return new z310(((dp01) this.d).c(((RecentlyPlayedResponse) obj).getItems(), (r9c) this.e, this.b, this.c), (f410) null, (m510) null, (String) null);
            default:
                YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) obj;
                e821 e821Var = ((vxm1) this.d).b;
                boolean z = this.b;
                r9c r9cVar = (r9c) this.e;
                return new z310(e821.f(e821Var, yourLibraryResponse, z, r9cVar.i, this.c, vxm1.c(r9cVar) == null, 96), (f410) null, (m510) null, (String) null);
        }
    }
}
