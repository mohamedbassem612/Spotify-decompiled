package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.corex.readalongtranscript.proto.ReadAlongTranscript;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dxy implements m0i {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public dxy(krh krhVar, giq giqVar, hiq hiqVar, iiq iiqVar, liq liqVar, View view, gf81 gf81Var) {
        this.a = (byte) 22;
        this.b = krhVar;
        this.c = view;
        this.d = new vx40((kt91) giqVar.a.b.f8.get(), view, (byte) 22);
        thq thqVar = hiqVar.a;
        daq daqVar = thqVar.b;
        v8n0 v8n0Var = (v8n0) daqVar.ns.get();
        v8n0 v8n0Var2 = (v8n0) daqVar.ns.get();
        teq teqVar = thqVar.c;
        this.e = new s880(v8n0Var, v8n0Var2, (a1r0) teqVar.V0.get(), (am30) daqVar.Qb.get(), xqu.a(teqVar.W4), (q8n) daqVar.V2.get(), (ff81) gf81Var);
        thq thqVar2 = iiqVar.a;
        teq teqVar2 = thqVar2.c;
        lzn0 lzn0Var = (lzn0) teqVar2.i.get();
        am30 am30Var = (am30) thqVar2.b.Qb.get();
        jiq jiqVar = (jiq) teqVar2.b.E8.get();
        kiq kiqVar = (kiq) teqVar2.b.F8.get();
        yiq yiqVar = teqVar2.b;
        lzn0 lzn0Var2 = (lzn0) yiqVar.b.i.get();
        daq daqVar2 = yiqVar.a;
        this.f = new dxy(lzn0Var, am30Var, jiqVar, kiqVar, new eyh0(lzn0Var2, new pg5(((qxo) daqVar2.a.a.kb.get()).j), new eyh0((krh) daqVar2.y5.get(), sdd1.A((RetrofitMaker) daqVar2.Y3.get(), (yqg) daqVar2.J1.get(), sdd1.D((gma1) daqVar2.d3.get()), (Context) daqVar2.x1.a, (joo) daqVar2.n7.get()), yiqVar.G8, (byte) 14), (byte) 15), (ff81) gf81Var);
        daq daqVar3 = liqVar.a.b;
        this.g = new r961((rh11) daqVar3.ia.get(), (kt91) daqVar3.f8.get(), view, (byte) 21);
    }

    public static boolean B(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public static /* synthetic */ nt21 h(dxy dxyVar) {
        return (nt21) dxyVar.b;
    }

    public static /* synthetic */ File i(dxy dxyVar) {
        return (File) dxyVar.c;
    }

    public static /* synthetic */ File j(dxy dxyVar) {
        return (File) dxyVar.d;
    }

    public static /* synthetic */ File k(dxy dxyVar) {
        return (File) dxyVar.e;
    }

    public static /* synthetic */ File l(dxy dxyVar) {
        return (File) dxyVar.f;
    }

    public static /* synthetic */ File m(dxy dxyVar) {
        return (File) dxyVar.g;
    }

    public static final void v(ohd ohdVar, AtomicBoolean atomicBoolean, p811 p811Var, List list) {
        List<mmr0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            k3r k3rVar = (k3r) ((mmr0) it.next()).b;
            if ((k3rVar instanceof j3r) || (k3rVar instanceof h3r)) {
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (mmr0 mmr0Var : list2) {
                    jh5 jh5Var = (jh5) mmr0Var.a;
                    j3r j3rVar = (k3r) mmr0Var.b;
                    arrayList.add(new mmr0((String) jh5Var.b, j3rVar instanceof j3r ? (ddz) j3rVar.a : null));
                }
                if ((ohdVar.s() instanceof ago0) && atomicBoolean.compareAndSet(false, true)) {
                    cmh1 cmh1Var = (cmh1) p811Var.a;
                    if (cmh1Var != null) {
                        cmh1Var.dispose();
                    }
                    ohdVar.resumeWith(sqg0.T(arrayList));
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[PHI: r1 r9
      0x00a3: PHI (r1v2 p.yfe0) = (r1v1 p.yfe0), (r1v3 p.yfe0) binds: [B:31:0x0087, B:36:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r9v4 boolean) = (r9v3 boolean), (r9v5 boolean) binds: [B:31:0x0087, B:36:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r10 == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(p.yfe0 r9, p.onm r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dxy.A(p.yfe0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object C(String str, String str2, qxc0 qxc0Var, onm onmVar) {
        nyb0 nyb0Var;
        if (onmVar instanceof nyb0) {
            nyb0Var = (nyb0) onmVar;
            int i = nyb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nyb0Var.c = i - Integer.MIN_VALUE;
            } else {
                nyb0Var = new nyb0(this, onmVar);
            }
        } else {
            nyb0Var = new nyb0(this, onmVar);
        }
        nyb0 nyb0Var2 = nyb0Var;
        Object objB = nyb0Var2.a;
        int i2 = nyb0Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                nhb nhbVar = new nhb(this, str, str2, qxc0Var, (lnm) null, (byte) 2);
                tc31 tc31Var = (tc31) this.e;
                vq80 vq80Var = new vq80(this, str, (byte) 21);
                nyb0Var2.c = 1;
                objB = tc31Var.b(2131960062, nhbVar, vq80Var, n521.R0, nyb0Var2);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
        } catch (IllegalStateException e) {
            Logger.d("Failed to leave playlist: " + e, new Object[0]);
        }
        return rih1.a;
    }

    public mr20 D(Set set, su01 su01Var) {
        if (set.isEmpty()) {
            return new huz(new cbr(w7x.a), (byte) 10);
        }
        su01Var.h("decorate_episode_and_audiobook_progress");
        return j6p1.m(new m441(new us0(((xr01) this.f).c, (Object) null, o4p1.r(new m441(new hgo0(this, set, su01Var, (lnm) null, (byte) 8)), (q8n) this.c), (lnm) null, (byte) 27)), kex0.i, new ggx0(0, su01Var, su01.class, "endProgressPoint", "endProgressPoint()V", 0, (byte) 0), new dsr0(su01Var, (byte) 2));
    }

    public void E(File file) {
        this.c = file;
    }

    public void F(nt21 nt21Var) {
        this.b = nt21Var;
    }

    public void G(File file) {
        this.g = file;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public Object H(PlayerError playerError, onm onmVar) {
        ai11 ai11Var;
        View view;
        PlayerError playerError2 = playerError;
        r961 r961Var = (r961) this.g;
        s880 s880Var = (s880) this.e;
        if (onmVar instanceof ai11) {
            ai11Var = (ai11) onmVar;
            int i = ai11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ai11Var.d = i - Integer.MIN_VALUE;
            } else {
                ai11Var = new ai11(this, onmVar);
            }
        } else {
            ai11Var = new ai11(this, onmVar);
        }
        Object objK = ai11Var.b;
        int i2 = ai11Var.d;
        rih1 rih1Var = rih1.a;
        boolean zE = true;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objK);
            ai11Var.a = playerError2;
            ai11Var.d = 1;
            objK = K(playerError2, ai11Var);
            if (objK != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objK);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        playerError2 = ai11Var.a;
        hm5.M(objK);
        if (((Boolean) objK).booleanValue()) {
            vx40 vx40Var = (vx40) this.d;
            View view2 = (View) vx40Var.c;
            if (view2 != null) {
                kt91 kt91Var = (kt91) vx40Var.b;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961023});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.n(new er91((fs91) null, "", 2131961023, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, true), view2);
                return rih1Var;
            }
        } else {
            ErrorType errorTypeError = playerError2.error();
            ErrorType errorType = ErrorType.PICK_AND_SHUFFLE_CAPPED;
            if (errorTypeError == errorType && ihc1.h0(playerError2.reasons(), "pick_and_shuffle_capped_video_context", false)) {
                String strContextUri = playerError2.contextUri();
                String strViewUri = playerError2.viewUri();
                strContextUri.getClass();
                if (ihc1.h0(strContextUri, "spotify:search", false)) {
                    zE = ((v8n0) s880Var.c).d.e();
                } else {
                    strViewUri.getClass();
                    if (ihc1.h0(strViewUri, "spotify:search", false)) {
                        zE = ((v8n0) s880Var.c).d.e();
                    }
                }
            } else {
                zE = false;
            }
            if (zE) {
                String strU0 = ihc1.U0(playerError2.trackUri(), "spotify:track:", "");
                if (strU0.length() > 0) {
                    xab1 xab1Var = (xab1) s880Var.h;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    s880Var.h = fn31.T(smo1.e((q8n) s880Var.a), (o8n) null, 0, new l4f0(s880Var, strU0, (lnm) null, (byte) 13), 3);
                }
                ff81.a((ff81) s880Var.g, playerError2.contextUri(), playerError2.trackUri(), playerError2.viewUri());
                if (ihc1.h0(playerError2.contextUri(), "spotify:search", false) || ihc1.h0(playerError2.viewUri(), "spotify:search", false)) {
                    ((e7p0) ((ynb0) s880Var.f).get()).c();
                    return rih1Var;
                }
            } else if (playerError2.error() == errorType || playerError2.error() == ErrorType.PICK_AND_SHUFFLE_CONNECT_RESTRICTED) {
                dxy dxyVar = (dxy) this.f;
                yfe0 yfe0Var = new yfe0(playerError2.contextUri(), playerError2.trackUri(), playerError2.viewUri());
                ai11Var.a = null;
                ai11Var.d = 2;
                if (dxyVar.A(yfe0Var, ai11Var) == obj) {
                    return obj;
                }
            } else if (playerError2.error() == ErrorType.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED && ((e05) ((rh11) r961Var.b).a.get()).d() && (view = (View) r961Var.d) != null) {
                kt91 kt91Var2 = (kt91) r961Var.c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955896});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.n(new er91((fs91) null, "", 2131955896, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, true), view);
                return rih1Var;
            }
        }
        return rih1Var;
    }

    public void I(File file) {
        this.d = file;
    }

    public void J(String str, String str2, Bundle bundle) {
        int i;
        int i2;
        String str3;
        String strEncodeToString;
        boolean zH;
        char c;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        wi20 wi20Var = (wi20) this.b;
        wi20Var.a();
        bundle.putString("gmp_app_id", wi20Var.c.b);
        gjj0 gjj0Var = (gjj0) this.c;
        synchronized (gjj0Var) {
            try {
                i = 0;
                if (gjj0Var.d == 0) {
                    try {
                        packageInfo = gjj0Var.a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        gjj0Var.d = packageInfo.versionCode;
                    }
                }
                i2 = gjj0Var.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((gjj0) this.c).a());
        gjj0 gjj0Var2 = (gjj0) this.c;
        synchronized (gjj0Var2) {
            try {
                if (gjj0Var2.c == null) {
                    gjj0Var2.d();
                }
                str3 = gjj0Var2.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        wi20 wi20Var2 = (wi20) this.b;
        wi20Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(wi20Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((f19) o0c.g(((mj20) this.g).d())).a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) o0c.g(((mj20) this.g).c()));
        bundle.putString("cliv", "fcm-23.1.2");
        v0s v0sVar = (x560) ((lly0) this.f).get();
        gys gysVar = (gys) ((lly0) this.e).get();
        if (v0sVar == null || gysVar == null) {
            return;
        }
        v0s v0sVar2 = v0sVar;
        synchronized (v0sVar2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            q6y q6yVar = (q6y) v0sVar2.a.get();
            synchronized (q6yVar) {
                zH = q6yVar.h(jCurrentTimeMillis);
            }
            if (zH) {
                synchronized (q6yVar) {
                    String strE = q6yVar.e(System.currentTimeMillis());
                    ((SharedPreferences) q6yVar.a).edit().putString("last-used-date", strE).commit();
                    q6yVar.g(strE);
                }
                c = 3;
            } else {
                c = 1;
            }
        }
        if (c != 1) {
            if (c != 1) {
                i = 2;
                if (c == 2) {
                    i = 1;
                } else if (c != 3) {
                    throw null;
                }
            }
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(i));
            bundle.putString("Firebase-Client", gysVar.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(PlayerError playerError, onm onmVar) {
        bi11 bi11Var;
        if (onmVar instanceof bi11) {
            bi11Var = (bi11) onmVar;
            int i = bi11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi11Var.c = i - Integer.MIN_VALUE;
            } else {
                bi11Var = new bi11(this, onmVar);
            }
        } else {
            bi11Var = new bi11(this, onmVar);
        }
        Object objB = bi11Var.a;
        int i2 = bi11Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            if (playerError.error() == ErrorType.INTERRUPT_PLAYBACK_RESTRICTED) {
                krh krhVar = (krh) this.b;
                bi11Var.c = 1;
                objB = krhVar.b(ql10.a, bi11Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        boolean z = ((Boolean) objB).booleanValue() ? false : true;
        return Boolean.valueOf(z);
    }

    public void L(String str, boolean z) {
        lzn0 lzn0Var = (lzn0) this.b;
        if (z) {
            lzn0Var.h(lx20.d.g());
            return;
        }
        String str2 = null;
        if (str != null) {
            Set set = s4b1.f;
            String strJ = uic.x(str).j();
            if (strJ != null && !ihc1.y0(strJ)) {
                str2 = strJ;
            }
        }
        String strI = nik1.y6.a;
        if (str2 != null) {
            strI = xcg1.i(strI, "?trackID=", str2);
        }
        lzn0Var.h(strI);
    }

    public void M(zuc0 zuc0Var, tv80 tv80Var) {
        ssf1 ssf1Var = (ssf1) this.c;
        String str = zuc0Var.c;
        lik1 lik1Var = (lik1) this.b;
        String str2 = lik1Var.a;
        erq0 erq0VarA = zuc0Var.q.a(erq0.class);
        ssf1Var.b(new dmf1(str, lik1Var, str2, new vsf1((String) null, (String) null, false, (String) null, false, false, false, false, false, true, (String) null, false, true, false, false, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, ((um4) this.f).a(), false, false, (p860) null, (String) null, false, false, -268444673, 63), sqg0.M(new mmr0[]{new mmr0("is_music_video", String.valueOf(erq0VarA != null ? Boolean.valueOf(!erq0VarA.a.isEmpty()) : null)), new mmr0("is_in_video_first_playlist", "true")})), tv80Var);
    }

    public void N() {
        ((war0) ((ik30) this.b).invoke()).d((qpj0) this.f);
        ((war0) ((ik30) this.c).invoke()).d((xjr) this.g);
    }

    public hfp1 O(String str, String str2, Bundle bundle) {
        int i;
        int i2;
        PackageInfo packageInfo;
        try {
            J(str, str2, bundle);
            ny31 ny31Var = (ny31) this.d;
            m5u m5uVar = m5u.c;
            dap1 dap1Var = ny31Var.c;
            synchronized (dap1Var) {
                if (dap1Var.b == 0) {
                    try {
                        packageInfo = mjm1.a(dap1Var.a).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        new StringBuilder(String.valueOf(e).length() + 23);
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        dap1Var.b = packageInfo.versionCode;
                    }
                }
                i = dap1Var.b;
            }
            if (i < 12000000) {
                return dap1Var.a() != 0 ? ny31Var.a(bundle).e(m5uVar, new zxl1(ny31Var, bundle, (byte) 27)) : o0c.y(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            b8p1 b8p1VarE = b8p1.E(ny31Var.b);
            synchronized (b8p1VarE) {
                i2 = b8p1VarE.b;
                b8p1VarE.b = i2 + 1;
            }
            return b8p1VarE.K(new p5p1(i2, 1, bundle)).o(m5uVar, xpv0.Y);
        } catch (InterruptedException | ExecutionException e2) {
            return o0c.y(e2);
        }
    }

    public void P() {
        switch (this.a) {
            case 12:
                ((war0) ((ik30) this.b).invoke()).c((qpj0) this.f);
                ((war0) ((ik30) this.c).invoke()).c((xjr) this.g);
                break;
            default:
                xab1 xab1Var = (xab1) ((s880) this.e).h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
        }
    }

    public hfp1 Q(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(str2));
        return O(str, "/topics/".concat(str2), bundle).o(new l5o(), new tw20(this, (byte) 3));
    }

    public hfp1 R(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(str2));
        bundle.putString("delete", "1");
        return O(str, "/topics/".concat(str2), bundle).o(new l5o(), new tw20(this, (byte) 3));
    }

    public void S(String str) {
        if (u890.j((String) this.d, str)) {
            return;
        }
        this.d = str;
        Iterator it = ((CopyOnWriteArrayList) this.e).iterator();
        while (it.hasNext()) {
            ((rjp0) it.next()).b((String) this.d);
        }
    }

    public Object a(Class cls) {
        if (!((Set) this.e).contains(lzy0.a(cls))) {
            nkx0.n("Attempting to request an undeclared dependency ", cls, ".");
            return null;
        }
        Object objA = ((m0i) this.g).a(cls);
        if (!cls.equals(noy0.class)) {
            return objA;
        }
        return new l031();
    }

    public lly0 b(lzy0 lzy0Var) {
        if (((Set) this.f).contains(lzy0Var)) {
            return ((m0i) this.g).b(lzy0Var);
        }
        nkx0.n("Attempting to request an undeclared dependency Provider<Set<", lzy0Var, ">>.");
        return null;
    }

    public Set c(lzy0 lzy0Var) {
        if (((Set) this.d).contains(lzy0Var)) {
            return ((m0i) this.g).c(lzy0Var);
        }
        nkx0.n("Attempting to request an undeclared dependency Set<", lzy0Var, ">.");
        return null;
    }

    public Object d(lzy0 lzy0Var) {
        if (((Set) this.e).contains(lzy0Var)) {
            return ((m0i) this.g).d(lzy0Var);
        }
        nkx0.n("Attempting to request an undeclared dependency ", lzy0Var, ".");
        return null;
    }

    public lly0 e(lzy0 lzy0Var) {
        if (((Set) this.b).contains(lzy0Var)) {
            return ((m0i) this.g).e(lzy0Var);
        }
        nkx0.n("Attempting to request an undeclared dependency Provider<", lzy0Var, ">.");
        return null;
    }

    public aqq0 f(lzy0 lzy0Var) {
        if (((Set) this.c).contains(lzy0Var)) {
            return ((m0i) this.g).f(lzy0Var);
        }
        nkx0.n("Attempting to request an undeclared dependency Deferred<", lzy0Var, ">.");
        return null;
    }

    public lly0 g(Class cls) {
        return e(lzy0.a(cls));
    }

    public void o(qpj0 qpj0Var) {
        ((CopyOnWriteArrayList) this.e).add(qpj0Var);
    }

    public void p(File file) {
        this.e = file;
    }

    public u9c q() {
        return new u9c(this);
    }

    public u771 r() {
        wa71 wa71Var = (wa71) this.b;
        if (wa71Var == null) {
            hhg1.n("shareMenuData needs to be set when using default share menu fields");
            return null;
        }
        t771 t771Var = new t771(wa71Var, (z771) this.d);
        y171 y171Var = new y171(rc11.a.b(zwy.class));
        o1f1 o1f1Var = (o1f1) this.c;
        return new u771(t771Var, new pz61(y171Var, new exy((String) null, o1f1Var, 0, false, (rhy) this.f, (bwe1) null, (cuu0) null), (ez61) this.g, o1f1Var instanceof n1f1), new bj71((Set) this.e, true, (String) null));
    }

    public jhm s(ugo0 ugo0Var) {
        return new jhm("explicit_feedback_not_interested", itx.c, (fhm) null, 2131956587, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(qfo0.X, new lgo0(ugo0Var, (byte) 1)), new tgo0(this, ugo0Var, (byte) 0)), 244);
    }

    public wpw t(Function0 function0, Function0 function1, int i) {
        FlowableMap flowableMap = (FlowableMap) this.b;
        gn4 gn4Var = (gn4) this.g;
        vbs vbsVar = (vbs) this.e;
        if (!vbsVar.a) {
            return new bxt0(flowableMap, (uu00) this.c, function0, function1, gn4Var.a(), i);
        }
        d0r d0rVar = (d0r) this.d;
        vbm[] vbmVarArr = q601.a;
        return new jxt0(d0rVar, new kge(flowableMap), function0, function1, gn4Var.a(), vbsVar, (q8n) this.f, i);
    }

    public void u(File file) {
        this.f = file;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0169  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object w(ga01 ga01Var, onm onmVar) {
        s701 s701Var;
        cdz cdzVar;
        Object next;
        cdz cdzVar2;
        ga01 ga01Var2;
        ReadAlongTranscript readAlongTranscript;
        k8g1 k8g1VarA;
        d390 d390Var;
        ga01 ga01Var3 = ga01Var;
        if (onmVar instanceof s701) {
            s701Var = (s701) onmVar;
            int i = s701Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                s701Var.e = i - Integer.MIN_VALUE;
            } else {
                s701Var = new s701(this, onmVar);
            }
        } else {
            s701Var = new s701(this, onmVar);
        }
        s701 s701Var2 = s701Var;
        Object objR = s701Var2.c;
        int i2 = s701Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ga01Var3 = s701Var2.a;
                hm5.M(objR);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k8g1 k8g1Var = s701Var2.b;
                    hm5.M(objR);
                    return k8g1Var;
                }
                ga01Var2 = s701Var2.a;
                hm5.M(objR);
            }
            readAlongTranscript = (ReadAlongTranscript) objR;
            if (readAlongTranscript == null) {
                nkx0.j(ga01Var2, "Missing transcript value for key ");
                return null;
            }
            k8g1VarA = ((ecg1) this.d).a(ga01Var2.a, readAlongTranscript);
            d390Var = (d390) this.e;
            s701Var2.a = null;
            s701Var2.b = k8g1VarA;
            s701Var2.e = 3;
            if (d390Var.b(ga01Var2, k8g1VarA, s701Var2) == d9nVar) {
                return d9nVar;
            }
            return k8g1VarA;
        }
        hm5.M(objR);
        List listSingletonList = Collections.singletonList(ga01Var3.a);
        s701Var2.a = ga01Var3;
        s701Var2.e = 1;
        ohd ohdVar = new ohd(1, aym.t(s701Var2));
        ohdVar.t();
        if (listSingletonList.isEmpty()) {
            ohdVar.resumeWith(b7x.a);
        } else {
            p811 p811Var = new p811();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            fv00 fv00VarC = ((dv00) this.b).c(new r701(ohdVar, atomicBoolean, p811Var));
            p811Var.a = fv00VarC;
            List list = listSingletonList;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new jh5(new xv00(rc11.a.b(ddz.class)), (String) it.next()));
            }
            v(ohdVar, atomicBoolean, p811Var, sqg0.S(fv00VarC.a(o7h.p1(arrayList))));
            ohdVar.n(new i3(p811Var, (byte) 13));
        }
        objR = ohdVar.r();
        if (objR != d9nVar) {
        }
        return d9nVar;
        ga01 ga01Var4 = ga01Var3;
        ddz ddzVar = (ddz) ((Map) objR).get(ga01Var4.a);
        if (ddzVar == null) {
            nkx0.j(ga01Var4, "Missing transcript value for key ");
            return null;
        }
        ArrayList arrayList2 = ddzVar.b;
        String str = ga01Var4.b;
        if (str != null) {
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((cdz) it2.next()).b);
            }
            String strR = a6o1.r(str, arrayList3);
            if (strR != null) {
                Iterator it3 = arrayList2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((cdz) next).b.equalsIgnoreCase(strR));
                cdzVar2 = (cdz) next;
            } else {
                cdzVar = null;
            }
            if (cdzVar != null) {
                nkx0.j(ga01Var4, "Missing transcript value for key ");
                return null;
            }
            boolean z = ga01Var4.c;
            boolean z2 = ga01Var4.d;
            s701Var2.a = ga01Var4;
            s701Var2.e = 2;
            objR = fn31.Y((q8n) this.f, new du2(cdzVar, this, z, z2, (lnm) null), s701Var2);
            if (objR != d9nVar) {
                ga01Var2 = ga01Var4;
                readAlongTranscript = (ReadAlongTranscript) objR;
                if (readAlongTranscript == null) {
                    nkx0.j(ga01Var2, "Missing transcript value for key ");
                    return null;
                }
                k8g1VarA = ((ecg1) this.d).a(ga01Var2.a, readAlongTranscript);
                d390Var = (d390) this.e;
                s701Var2.a = null;
                s701Var2.b = k8g1VarA;
                s701Var2.e = 3;
                if (d390Var.b(ga01Var2, k8g1VarA, s701Var2) == d9nVar) {
                    return k8g1VarA;
                }
            }
            return d9nVar;
        }
        cdzVar2 = (cdz) o7h.s0(arrayList2);
        cdzVar = cdzVar2;
        if (cdzVar != null) {
            nkx0.j(ga01Var4, "Missing transcript value for key ");
            return null;
        }
        boolean z3 = ga01Var4.c;
        boolean z4 = ga01Var4.d;
        s701Var2.a = ga01Var4;
        s701Var2.e = 2;
        objR = fn31.Y((q8n) this.f, new du2(cdzVar, this, z3, z4, (lnm) null), s701Var2);
        if (objR != d9nVar) {
            ga01Var2 = ga01Var4;
            readAlongTranscript = (ReadAlongTranscript) objR;
            if (readAlongTranscript == null) {
                nkx0.j(ga01Var2, "Missing transcript value for key ");
                return null;
            }
            k8g1VarA = ((ecg1) this.d).a(ga01Var2.a, readAlongTranscript);
            d390Var = (d390) this.e;
            s701Var2.a = null;
            s701Var2.b = k8g1VarA;
            s701Var2.e = 3;
            if (d390Var.b(ga01Var2, k8g1VarA, s701Var2) == d9nVar) {
                return k8g1VarA;
            }
        }
        return d9nVar;
    }

    public aqq0 x(Class cls) {
        return f(lzy0.a(cls));
    }

    public hfp1 y() {
        return O(gjj0.b((wi20) this.b), "*", new Bundle()).o(new l5o(), new tw20(this, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r8 == r6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object z(p.lnm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.oke1
            if (r0 == 0) goto L13
            r0 = r8
            p.oke1 r0 = (p.oke1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.oke1 r0 = new p.oke1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            p.rih1 r2 = p.rih1.a
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            p.dxy r7 = r0.a
            p.hm5.M(r8)
            goto L65
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L35:
            p.hm5.M(r8)
            goto L49
        L39:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.f
            p.lvc1 r8 = (p.lvc1) r8
            r0.d = r4
            java.lang.Object r8 = r8.R(r0)
            if (r8 != r6) goto L49
            goto L64
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L52
            return r2
        L52:
            java.lang.Object r8 = r7.c
            p.am30 r8 = (p.am30) r8
            p.mr20 r8 = r8.a()
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = p.b5p1.i(r8, r0)
            if (r8 != r6) goto L65
        L64:
            return r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.L(r5, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dxy.z(p.lnm):java.lang.Object");
    }

    public dxy(Context context, s8q s8qVar, lvc0 lvc0Var, kxc0 kxc0Var, uxc0 uxc0Var, Set set) {
        this.a = (byte) 26;
        this.b = context;
        this.c = s8qVar;
        this.d = lvc0Var;
        this.f = kxc0Var;
        this.g = uxc0Var;
        this.e = set;
    }

    public /* synthetic */ dxy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public dxy(ik30 ik30Var, ik30 ik30Var2) {
        this.a = (byte) 12;
        this.b = ik30Var;
        this.c = ik30Var2;
        this.e = new CopyOnWriteArrayList();
        this.f = new qpj0(this, (byte) 1);
        this.g = new xjr(this, (byte) 3);
    }

    public dxy(ao0 ao0Var, ko0 ko0Var, lzn0 lzn0Var, dg30 dg30Var, yqu0 yqu0Var) {
        this.a = (byte) 18;
        this.b = ao0Var;
        this.c = ko0Var;
        this.d = lzn0Var;
        this.e = dg30Var;
        this.f = yqu0Var;
        this.g = new vku();
    }

    public dxy(qfr qfrVar, t2b t2bVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = (byte) 10;
        this.b = qfrVar;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = BehaviorSubject.f();
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.f = behaviorSubjectF;
        this.g = behaviorSubjectF.distinctUntilChanged(c710.N0).switchMap(new upa0(new tzf0(this, (byte) 23), (byte) 19));
    }

    public dxy(sqi0 sqi0Var, tji0 tji0Var, lzn0 lzn0Var, kqi0 kqi0Var, u9c0 u9c0Var) {
        this.a = (byte) 11;
        this.b = sqi0Var;
        this.c = tji0Var;
        this.d = lzn0Var;
        this.e = kqi0Var;
        this.f = u9c0Var;
        this.g = new AtomicBoolean(false);
    }

    public dxy(lzn0 lzn0Var, o241 o241Var, Flowable flowable, Scheduler scheduler) {
        this.a = (byte) 3;
        this.b = lzn0Var;
        this.c = o241Var;
        this.d = flowable;
        this.e = scheduler;
        this.f = new rku();
    }

    public dxy(Flowable flowable, o241 o241Var, vf0 vf0Var, qo91 qo91Var) {
        this.a = (byte) 25;
        this.b = flowable;
        this.c = o241Var;
        this.d = vf0Var;
        this.e = qo91Var;
        this.f = new idd1(new so91(this, (byte) 1));
        this.g = new idd1(new so91(this, (byte) 0));
    }

    public dxy(d0r d0rVar, l0k l0kVar, d2q d2qVar, f2p f2pVar, bzo bzoVar) {
        this.a = (byte) 5;
        this.b = d0rVar;
        this.c = l0kVar;
        this.d = d2qVar;
        this.e = f2pVar;
        this.f = bzoVar;
        this.g = w3p1.o(new l4r(new xv00(rc11.a.b(f7l1.class)), 2, em50.V0, new j4r(em50.X0), em50.W0), em50.Y0);
    }

    public dxy(ytp0 ytp0Var, boolean z) {
        int i;
        this.a = (byte) 13;
        this.b = ytp0Var;
        this.c = new u0n0(aox.c, 2131959101, nik1.z0, new mtn0(x0n0.a, k8b0.Q0, ibi0.d), gvn0.a, Collections.singleton(mno1.B), (xe01) null, 192);
        this.d = new u0n0(esx.c, 2131959103, nik1.z1, new mtn0(z0n0.a, czm0.f, dbm0.W0), gvn0.b, f46.S0(new gn10[]{mno1.e0, mno1.x, mno1.d, mno1.a0}), (xe01) null, 192);
        wlx wlxVar = wlx.c;
        if (z) {
            i = 2131959102;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i = 2131959104;
        }
        int i2 = i;
        this.e = new u0n0(wlxVar, i2, nik1.p2, new mtn0(a1n0.a, czm0.g, dbm0.X0), gvn0.c, f46.S0(new gn10[]{mno1.j0, mno1.f, mno1.h, mno1.g, mno1.i, mno1.j, mno1.k, mno1.n, mno1.o, mno1.p, mno1.q, mno1.l, mno1.m, mno1.z}), (xe01) null, 192);
        this.f = new idd1(new zem0(this, (byte) 6));
        this.g = new idd1(w0n0.b);
    }

    public dxy(lzn0 lzn0Var, am30 am30Var, jiq jiqVar, kiq kiqVar, eyh0 eyh0Var, ff81 ff81Var) {
        this.a = (byte) 27;
        this.b = lzn0Var;
        this.c = am30Var;
        this.d = eyh0Var;
        this.e = ff81Var;
        thq thqVar = jiqVar.a;
        this.f = new lvc1((u4q0) thqVar.b.em.get(), (lzn0) thqVar.c.i.get(), ff81Var, (byte) 12);
        thq thqVar2 = kiqVar.a;
        teq teqVar = thqVar2.c;
        teq teqVar2 = teqVar.b.b;
        this.g = new y441(new ptf1((a1r0) teqVar2.V0.get(), (ele1) teqVar2.a.q7.get(), (byte) 0), (ele1) teqVar.a.q7.get(), (am30) thqVar2.b.Qb.get(), ff81Var);
    }

    public dxy(vzh vzhVar, m0i m0iVar) {
        this.a = (byte) 23;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<wct> set = vzhVar.c;
        Set set2 = vzhVar.g;
        for (wct wctVar : set) {
            byte b = wctVar.c;
            byte b2 = wctVar.b;
            boolean z = b == 0;
            lzy0 lzy0Var = wctVar.a;
            if (z) {
                if (b2 == 2) {
                    hashSet4.add(lzy0Var);
                } else {
                    hashSet.add(lzy0Var);
                }
            } else if (b == 2) {
                hashSet3.add(lzy0Var);
            } else if (b2 == 2) {
                hashSet5.add(lzy0Var);
            } else {
                hashSet2.add(lzy0Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(lzy0.a(noy0.class));
        }
        this.e = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.f = Collections.unmodifiableSet(hashSet5);
        this.g = m0iVar;
    }

    public dxy(dv00 dv00Var, w5b1 w5b1Var, ecg1 ecg1Var, d390 d390Var, q8n q8nVar) {
        this.a = (byte) 21;
        this.b = dv00Var;
        this.c = w5b1Var;
        this.d = ecg1Var;
        this.e = d390Var;
        this.f = q8nVar;
        this.g = new ConcurrentHashMap();
    }

    public dxy(ConstraintLayout constraintLayout, ArtworkView artworkView, CalendarIconView calendarIconView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.a = (byte) 1;
        this.b = constraintLayout;
        this.c = artworkView;
        this.d = calendarIconView;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
    }

    public dxy(ViewGroup viewGroup, oh20 oh20Var, wb00 wb00Var) {
        this.a = (byte) 9;
        View viewL = eqq.l(viewGroup, 2131624688, viewGroup, false);
        viewL.setPadding(0, d4o1.h(viewGroup.getContext()), 0, 0);
        this.b = viewL;
        ViewGroup viewGroup2 = (ViewGroup) b8k1.n(viewL, 2131429084);
        tzo tzoVar = new tzo(new pfx(oh20Var.a.d, (byte) 3));
        viewGroup2.addView(((qzh) tzoVar.b).getView());
        this.c = tzoVar;
        ViewGroup viewGroup3 = (ViewGroup) b8k1.n(viewL, 2131430146);
        this.d = viewGroup3;
        k9r k9rVar = new k9r(viewGroup3);
        viewGroup3.addView((View) k9rVar.c);
        this.e = k9rVar;
        RecyclerView recyclerViewN = b8k1.n(viewL, 2131430680);
        this.f = recyclerViewN;
        this.g = new t4d1(recyclerViewN, (qxx0) wb00Var.b);
        recyclerViewN.m(new zl7(this, (byte) 10));
    }

    public dxy(wi20 wi20Var, gjj0 gjj0Var, lly0 lly0Var, lly0 lly0Var2, mj20 mj20Var) {
        this.a = (byte) 4;
        wi20Var.a();
        ny31 ny31Var = new ny31(wi20Var.a);
        this.b = wi20Var;
        this.c = gjj0Var;
        this.d = ny31Var;
        this.e = lly0Var;
        this.f = lly0Var2;
        this.g = mj20Var;
    }

    public dxy(t4h1 t4h1Var) {
        this.a = (byte) 28;
        this.b = (hrr0) t4h1Var.j.a;
        this.c = (hrr0) t4h1Var.k.a;
        this.d = t4h1Var.u;
        this.e = yv91.a(new q4h1(t4h1Var, (byte) 3));
        this.f = yv91.a(new q4h1(t4h1Var, (byte) 1));
        this.g = yv91.a(new q4h1(t4h1Var, (byte) 2));
    }
}
