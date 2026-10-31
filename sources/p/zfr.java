package p;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import spotify.autodownload.esperanto.proto.ShowStateRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zfr implements Function3, hsg0, Function, am01, BiFunction {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public zfr(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 19:
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
                this.b = sharedPreferences;
                String string = sharedPreferences.getString("pref_key_recent_emoji", null);
                this.c = string != null ? new ArrayList(ihc1.Q0(string, new String[]{","}, 0, 6)) : new ArrayList();
                break;
            case 25:
                ks6 ks6VarG = ks6.g(LayoutInflater.from(context));
                ConstraintLayout constraintLayout = (ConstraintLayout) ks6VarG.a;
                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                Collections.addAll(v9w0VarQ.c, (TextView) ks6VarG.R0, (TextView) ks6VarG.Q0);
                v9w0VarQ.e = false;
                v9w0VarQ.a();
                constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                this.b = ks6VarG;
                this.c = w2g0.p(ks6VarG, 2131624471);
                break;
            default:
                this.b = context.getApplicationContext();
                this.c = new ofr((byte) 2);
                break;
        }
    }

    public static void p(zfr zfrVar, int i) {
        boolean z = (i & 2) == 0;
        Activity activityA = ((e831) zfrVar.b).a();
        if (activityA != null) {
            ((ior) ((hu90) zfrVar.c).invoke(activityA)).a((String) null, z);
        }
    }

    public void a(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.remove(str);
        arrayList.add(0, str);
        ((SharedPreferences) this.b).edit().putString("pref_key_recent_emoji", o7h.y0(arrayList, ",", (String) null, (String) null, (iu30) null, 62)).commit();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 15:
                return rqt0.F(o6x.a, new hxn((aas) this.b, (String) obj, (String) this.c, (lnm) null, (byte) 11));
            default:
                hur hurVar = (hur) this.b;
                List list = (List) this.c;
                h290 h290VarO = ((YourLibraryContainsResponse) obj).o();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : h290VarO) {
                    if (((YourLibraryContainsResponseEntity) obj2).o()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((YourLibraryContainsResponseEntity) it.next()).getUri());
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (list.contains((String) it2.next())) {
                            return CompletableEmpty.a;
                        }
                    }
                }
                return hur.c(o7h.j0(list), new eks(hurVar, (byte) 0));
        }
    }

    public Object b(x4x x4xVar) {
        return (ArrayList) this.c;
    }

    public void c(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(390738210);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kvvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (kvvVar.Q0) {
            x340Var.i0(1120810561);
            tcp tcpVar = (tcp) this.c;
            String str = kvvVar.a;
            String str2 = kvvVar.b;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new hws(iu30Var, (byte) 6);
                x340Var.s0(objT);
            }
            tcpVar.getClass();
            umf0 umf0Var = new umf0(str, str2, (iu30) objT);
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new w8t(this, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("delete-playlist-dialog", (iu30) objT2, apo.r(1662813625, new v8t(umf0Var, (byte) 1), x340Var), x340Var, 390);
            x340Var.r(false);
        } else {
            x340Var.i0(1121516896);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, kvvVar, iu30Var, i, (byte) 0);
        }
    }

    public Object d(String str, onm onmVar) {
        return fn31.Y((q8n) this.c, new jjr(this, str, (lnm) null, (byte) 0), onmVar);
    }

    public Object e(String str, String str2, String str3, onm onmVar) {
        return fn31.Y((q8n) this.c, new el0(this, str, str3, str2, (lnm) null, (byte) 21), onmVar);
    }

    public boolean f(ou80 ou80Var) {
        g3t g3tVar = (g3t) this.b;
        if (g3tVar == null) {
            return false;
        }
        g3tVar.c.add(ou80Var);
        return true;
    }

    public void g(String str) {
        ((zxl) this.b).a.j(new String[]{str}, true);
        ((wh41) this.c).m(new srg0(str));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 p.pp90, still in use, count: 2, list:
          (r2v3 p.pp90) from 0x01f3: MOVE (r24v0 p.pp90) = (r2v3 p.pp90) (LINE:500)
          (r2v3 p.pp90) from 0x01f9: PHI (r24v1 p.pp90) = (r24v0 p.pp90), (r2v3 p.pp90) binds: [B:104:0x01f1, B:103:0x01ea] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public p.pp90 h(p.k5a1 r26, p.l0l r27) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zfr.h(p.k5a1, p.l0l):p.pp90");
    }

    public ah91 i(nqs nqsVar) {
        xpw xpwVar = (xpw) ((yzs) this.b).d.get();
        l0l l0lVar = (l0l) this.c;
        return new ah91(xpwVar, new stk1(l0lVar.d(), l0lVar.getName(), "volume-smart-control", new ots(nqsVar, (byte) 10), (String) null, (Float) null, false, 480), u291.v(nim0.a, 300.0f));
    }

    public pr31 j(String str) {
        Object obj;
        Object next;
        String str2;
        p7s p7sVar = (p7s) this.b;
        Iterator it = p7sVar.d().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!nhc1.R(((pr31) next).a, str, false));
        pr31 pr31Var = (pr31) next;
        c3e c3eVarH = ekb.H(pr31Var != null ? pr31Var.k : null);
        if (c3eVarH == null || (str2 = c3eVarH.a) == null) {
            return null;
        }
        for (Object obj2 : p7sVar.d()) {
            if (nhc1.R(((pr31) obj2).a, str2, false)) {
                obj = obj2;
                break;
            }
        }
        return (pr31) obj;
    }

    public ec10 k(Object... objArr) {
        Constructor constructorD;
        synchronized (((AtomicBoolean) this.c)) {
            try {
                if (!((AtomicBoolean) this.c).get()) {
                    try {
                        constructorD = ((ofr) this.b).d();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.c).set(true);
                        constructorD = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorD = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorD == null) {
            return null;
        }
        try {
            return (ec10) constructorD.newInstance(objArr);
        } catch (Exception e2) {
            k220.p("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public PublishSubject l() {
        return (PublishSubject) this.b;
    }

    public Object m(String str, ejr ejrVar) {
        return fn31.Y((q8n) this.c, new jjr(str, this, (lnm) null, (byte) 1), ejrVar);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        ktl ktlVar = (ktl) obj3;
        vt8 vt8Var = vt8.b;
        String str = (String) this.b;
        g281 g281Var = (g281) ((Map) obj2).get(str);
        boolean z = !((Boolean) obj).booleanValue() && (ktlVar != ktl.c || (g281Var != null && g281Var.w));
        if (g281Var == null) {
            Observable observableJust = Observable.just(vt8Var);
            observableJust.getClass();
            return observableJust;
        }
        dir dirVar = (dir) this.c;
        f281 f281Var = g281Var.t;
        dirVar.getClass();
        int i = f281Var == null ? -1 : bir.a[f281Var.ordinal()];
        Observable observable = (i == 1 || i == 2 ? yoi1.i(new dkm(dirVar.c.a(j6n.a), (byte) 22), o6x.a).first(Boolean.FALSE) : Single.just(Boolean.FALSE)).toObservable();
        mt8 mt8Var = dirVar.a;
        ma81 ma81VarN = ShowStateRequest.n();
        ma81VarN.q(str);
        return Observable.combineLatest(observable, mt8Var.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamShowState", ma81VarN.build()).map(qz70.t).distinctUntilChanged(), new nql(str, z, (byte) 1)).onErrorReturnItem(vt8Var);
    }

    public tv80 o(h7p1 h7p1Var) {
        Object obj;
        w7h1 w7h1Var;
        kpl0 kpl0Var = (kpl0) this.c;
        ynb0 ynb0Var = (ynb0) this.b;
        boolean z = h7p1Var instanceof m7v0;
        b7x b7xVar = b7x.a;
        if (z) {
            i8h1 i8h1Var = (i8h1) ynb0Var.get();
            m7v0 m7v0Var = (m7v0) h7p1Var;
            String str = m7v0Var.d;
            kpl0Var.getClass();
            x6h1 x6h1VarC = kpl0Var.a.c();
            x6h1VarC.i.add(new a7h1("mark_as_played_button", (String) null, (Integer) null, str, (String) null));
            x6h1VarC.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", m7v0Var.c)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (h7p1Var.equals(l7v0.e)) {
            i8h1 i8h1Var2 = (i8h1) ynb0Var.get();
            kpl0Var.getClass();
            x6h1 x6h1VarC2 = kpl0Var.a.c();
            x6h1VarC2.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            x6h1 x6h1VarC3 = x6h1VarC2.a().c();
            x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            return i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (h7p1Var instanceof j7v0) {
            i8h1 i8h1Var3 = (i8h1) ynb0Var.get();
            j7v0 j7v0Var = (j7v0) h7p1Var;
            String str2 = j7v0Var.c;
            if (j7v0Var.d) {
                kpl0Var.getClass();
                x6h1 x6h1VarC4 = kpl0Var.a.c();
                x6h1VarC4.i.add(new a7h1("auto_download_switch", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("auto_download_enable", 1, Collections.singletonMap("item_to_download", str2 != null ? str2 : "")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            } else {
                kpl0Var.getClass();
                x6h1 x6h1VarC5 = kpl0Var.a.c();
                x6h1VarC5.i.add(new a7h1("auto_download_switch", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("auto_download_disable", 1, Collections.singletonMap("item_to_stop_download", str2 != null ? str2 : "")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
            }
            return i8h1Var3.m(w7h1Var, (xj61) null);
        }
        if (h7p1Var instanceof k7v0) {
            i8h1 i8h1Var4 = (i8h1) ynb0Var.get();
            k7v0 k7v0Var = (k7v0) h7p1Var;
            String str3 = k7v0Var.d;
            kpl0Var.getClass();
            x6h1 x6h1VarC6 = kpl0Var.a.c();
            x6h1VarC6.i.add(new a7h1("manage_download_settings_button", (String) null, (Integer) null, str3, (String) null));
            x6h1VarC6.j = false;
            y6h1 y6h1VarA = x6h1VarC6.a();
            String str4 = k7v0Var.c;
            return i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (!(h7p1Var instanceof n7v0)) {
            if (h7p1Var.equals(l7v0.d)) {
                i8h1 i8h1Var5 = (i8h1) ynb0Var.get();
                kpl0Var.getClass();
                x6h1 x6h1VarC7 = kpl0Var.a.c();
                x6h1VarC7.i.add(new a7h1("set_schedule_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                return i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            }
            if (!h7p1Var.equals(l7v0.c)) {
                eg.o();
                return null;
            }
            i8h1 i8h1Var6 = (i8h1) ynb0Var.get();
            kpl0Var.getClass();
            x6h1 x6h1VarC8 = kpl0Var.a.c();
            x6h1VarC8.i.add(new a7h1("delete_show_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            return i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        i8h1 i8h1Var7 = (i8h1) ynb0Var.get();
        kpl0Var.getClass();
        x6h1 x6h1VarC9 = kpl0Var.a.c();
        x6h1VarC9.i.add(new a7h1("skip_finished_episodes_switch", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC9.j = false;
        y6h1 y6h1VarA2 = x6h1VarC9.a();
        boolean z2 = ((n7v0) h7p1Var).c;
        char c = z2 ? (char) 2 : (char) 1;
        char c2 = z2 ? (char) 1 : (char) 2;
        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
        String str5 = "disabled";
        if (c == 1) {
            obj = "disabled";
        } else {
            if (c != 2) {
                throw null;
            }
            obj = "enabled";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (c2 != 1) {
            if (c2 != 2) {
                throw null;
            }
            str5 = "enabled";
        }
        return i8h1Var7.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str5)})), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void q(String str) {
        ((mvr) this.c).a.onNext(new wou(str));
    }

    public evz r() {
        return (evz) this.c;
    }

    public void s(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        b380 b380VarP = b380.p(hashSet);
        hashSet.clear();
        w280 w280VarR = b380VarP.r(0);
        while (w280VarR.hasNext()) {
            awr awrVar = (awr) w280VarR.next();
            awrVar.getClass();
            awrVar.l(z ? 1 : 3, exc);
        }
    }

    public h3t t() {
        g3t g3tVar = (g3t) this.b;
        if (g3tVar == null) {
            return null;
        }
        myn0 myn0Var = g3tVar.b;
        this.b = null;
        ((LinkedHashSet) this.c).add(myn0Var.a);
        myn0 myn0Var2 = new myn0(myn0Var.a, myn0Var.b, myn0Var.c, o7h.O0(qvn0.c, myn0Var.d), myn0Var.e, myn0Var.f);
        gwn0 gwn0Var = g3tVar.a;
        List list = g3tVar.c;
        return new h3t(new g3t(gwn0Var, myn0Var2, list, g3tVar.d), o7h.l1(list), g3tVar.d);
    }

    public void u(awr awrVar) {
        ((HashSet) this.b).add(awrVar);
        if (((awr) this.c) != null) {
            return;
        }
        this.c = awrVar;
        zn00 zn00VarC = awrVar.b.c();
        awrVar.A = zn00VarC;
        yvr yvrVar = awrVar.t;
        String str = zoi1.a;
        zn00VarC.getClass();
        yvrVar.getClass();
        yvrVar.obtainMessage(1, new zvr(d2e0.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), zn00VarC)).sendToTarget();
    }

    public Object v(String str, onm onmVar) {
        Object objY = fn31.Y((q8n) this.c, new jjr(str, this, (lnm) null, (byte) 2), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public boolean w(nsn0 nsn0Var) {
        g3t g3tVar = (g3t) this.b;
        if (g3tVar == null || g3tVar.d != null) {
            return true;
        }
        g3tVar.d = nsn0Var;
        return false;
    }

    public Object x(String str, fjr fjrVar) {
        return fn31.Y((q8n) this.c, new jjr(this, str, (lnm) null, (byte) 3), fjrVar);
    }

    public Object y(String str, String str2, onm onmVar) {
        return fn31.Y((q8n) this.c, new swn(this, str, str2, (lnm) null, (byte) 4), onmVar);
    }

    public zfr(iac0 iac0Var) {
        this.a = (byte) 8;
        this.b = iac0Var;
    }

    public zfr(jo20 jo20Var, g23 g23Var) {
        this.a = (byte) 0;
        this.b = jo20Var;
        this.c = g23Var;
        new AtomicBoolean(false);
    }

    public zfr(Context context, gw70 gw70Var) {
        this.a = (byte) 17;
        q4e q4eVar = new q4e(context, gw70Var);
        this.b = q4eVar;
        View viewInflate = LayoutInflater.from(context).inflate(2131624316, (ViewGroup) null, false);
        RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131428099);
        if (recyclerViewT != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            n4b n4bVar = new n4b(frameLayout, recyclerViewT);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            recyclerViewT.setAdapter(q4eVar);
            recyclerViewT.setLayoutManager(new LinearLayoutManager(0));
            recyclerViewT.j(new fyd((byte) 2));
            this.c = n4bVar;
            return;
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131428099)));
        throw null;
    }

    public zfr(ov20 ov20Var, b0a0 b0a0Var) {
        this.a = (byte) 24;
        this.b = b0a0Var;
        bw20 bw20Var = (bw20) ov20Var;
        this.c = h5p1.r(bw20Var.a("jam", false), bw20Var.a("social-session", false), bw20Var.a("social-session-free-tier", false), bw20Var.c("jam-social-session", ""), new mrs(this, (lnm) null, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public Object apply(Object obj, Object obj2) {
        boolean z;
        Boolean bool = (Boolean) obj2;
        if (!((Boolean) obj).booleanValue() || bool.booleanValue()) {
            z = false;
        } else {
            ln91 ln91Var = (ln91) ((l6s) this.b).b;
            ContextTrack contextTrack = (ContextTrack) this.c;
            ln91Var.getClass();
            if (ydh.b(ln91.a(contextTrack))) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public zfr(p7s p7sVar, ekb ekbVar, String str) {
        this.a = (byte) 3;
        this.b = p7sVar;
        this.c = str;
    }

    public zfr(mvr mvrVar) {
        this.a = (byte) 6;
        this.c = mvrVar;
        this.b = mvrVar.a;
    }

    public zfr(str strVar, EncoreTextView encoreTextView, EncoreTextView encoreTextView2) {
        this.a = (byte) 29;
        this.b = encoreTextView;
        this.c = encoreTextView2;
    }

    public /* synthetic */ zfr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zfr(ofr ofrVar) {
        this.a = (byte) 9;
        this.b = ofrVar;
        this.c = new AtomicBoolean(false);
    }

    public zfr(byte b) {
        this.a = b;
        switch (b) {
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                this.c = new LinkedHashSet();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }
}
