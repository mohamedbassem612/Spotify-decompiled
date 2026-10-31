package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Size;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.f;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.session.legacy.MediaSessionManager;
import androidx.media3.transformer.ExportException;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vqh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vqh0(yqh0 yqh0Var, tkh0 tkh0Var, String str, Bundle bundle) {
        this.a = (byte) 0;
        this.b = tkh0Var;
        this.c = str;
        this.d = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:181:0x04ac  */
    @Override // java.lang.Runnable
    public final void run() {
        pa61 pa61Var;
        n8d0 n8d0VarJ;
        boolean z;
        pa61 pa61Var2 = null;
        boolean zBooleanValue = true;
        switch (this.a) {
            case 0:
                tkh0 tkh0Var = (tkh0) this.b;
                String str = (String) this.c;
                Bundle bundle = (Bundle) this.d;
                tkh0Var.h1();
                rlh0 rlh0Var = tkh0Var.c;
                mjh1 mjh1VarK = (!rlh0Var.p() ? qa61.b : rlh0Var.v).a.k();
                while (mjh1VarK.hasNext()) {
                    pa61 pa61Var3 = (pa61) mjh1VarK.next();
                    if (pa61Var3.a == 0 && pa61Var3.b.equals(str)) {
                        pa61Var2 = pa61Var3;
                        if (pa61Var2 == null || udh.l(str)) {
                            pa61Var = new pa61(str, bundle);
                            tkh0Var.h1();
                            if (rlh0Var.p()) {
                                n8d0VarJ = rlh0Var.H(pa61Var, bundle);
                            } else {
                                n8d0VarJ = fc11.J(new ch61(-100));
                            }
                            n8d0VarJ.b(new nx30((Object) n8d0VarJ, (Object) new gap1(str, (byte) 11), (byte) 24), l5u.a);
                            return;
                        }
                        return;
                    }
                }
                if (pa61Var2 == null) {
                }
                pa61Var = new pa61(str, bundle);
                tkh0Var.h1();
                if (rlh0Var.p()) {
                    n8d0VarJ = rlh0Var.H(pa61Var, bundle);
                } else {
                    n8d0VarJ = fc11.J(new ch61(-100));
                }
                n8d0VarJ.b(new nx30((Object) n8d0VarJ, (Object) new gap1(str, (byte) 11), (byte) 24), l5u.a);
                return;
            case 1:
                drh0 drh0Var = (drh0) this.b;
                v280 v280Var = (v280) this.c;
                p2i0 p2i0Var = (p2i0) this.d;
                pfr pfrVar = drh0Var.c;
                bg11 bg11VarG = v280Var.g();
                cp31 cp31Var = pfrVar.d;
                r8u0 r8u0Var = pfrVar.g;
                r8u0Var.getClass();
                cp31Var.b = b380.p(bg11VarG);
                if (!bg11VarG.isEmpty()) {
                    cp31Var.e = (p2i0) bg11VarG.get(0);
                    p2i0Var.getClass();
                    cp31Var.f = p2i0Var;
                }
                if (((p2i0) cp31Var.d) == null) {
                    cp31Var.d = cp31.z(r8u0Var, (b380) cp31Var.b, (p2i0) cp31Var.e, (dqe1) cp31Var.a);
                }
                cp31Var.O(r8u0Var.d0());
                return;
            case 2:
                fzh0 fzh0Var = (fzh0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                dzh0 dzh0Var = fzh0Var.v;
                if (dzh0Var != null) {
                    fzh0Var.t.P(dzh0Var);
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    fzh0Var.h.j();
                    fzh0Var.g.f1();
                }
                countDownLatch.countDown();
                return;
            case 3:
                fzh0 fzh0Var2 = (fzh0) this.b;
                ixh0 ixh0Var = (ixh0) this.c;
                Runnable runnable = (Runnable) this.d;
                fzh0Var2.x = ixh0Var;
                runnable.run();
                fzh0Var2.x = null;
                return;
            case 4:
                azh0 azh0Var = (azh0) this.b;
                ixh0 ixh0Var2 = (ixh0) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                fzh0 fzh0Var3 = azh0Var.b;
                if (fzh0Var3.o(ixh0Var2)) {
                    fzh0Var3.a(keyEvent, false, false);
                } else {
                    e0i0 e0i0Var = fzh0Var3.h;
                    MediaSessionManager.RemoteUserInfo remoteUserInfo = ixh0Var2.a;
                    remoteUserInfo.getClass();
                    e0i0Var.getClass();
                    e0i0Var.c(1, new izh0(e0i0Var, (byte) 7), remoteUserInfo, true);
                }
                azh0Var.a = null;
                return;
            case 5:
                fzh0 fzh0Var4 = (fzh0) this.b;
                jxh0 jxh0Var = (jxh0) this.d;
                if (fzh0Var4.p()) {
                    return;
                }
                fzh0Var4.C();
                bai0.f(fzh0Var4.t, jxh0Var);
                return;
            case 6:
                d3i0 d3i0Var = (d3i0) this.b;
                Pair pair = (Pair) this.c;
                d3i0Var.b.i.N(((Integer) pair.first).intValue(), (p2i0) pair.second, (twa) this.d);
                return;
            case 7:
                d3i0 d3i0Var2 = (d3i0) this.b;
                Pair pair2 = (Pair) this.c;
                d3i0Var2.b.i.y(((Integer) pair2.first).intValue(), (p2i0) pair2.second, (Exception) this.d);
                return;
            case 8:
                vln0 vln0Var = (vln0) this.b;
                rye0 rye0Var = (rye0) this.c;
                Bundle bundle2 = (Bundle) this.d;
                try {
                    vln0Var.r(bundle2, rye0Var);
                    vln0Var.H(bundle2, rye0Var);
                    return;
                } catch (FacebookException e) {
                    vln0Var.F(rye0Var, null, e.getMessage(), null);
                    return;
                } catch (FacebookServiceException e2) {
                    lf10 lf10Var = e2.b;
                    vln0Var.F(rye0Var, lf10Var.d, lf10Var.a(), String.valueOf(lf10Var.b));
                    return;
                }
            case 9:
                r7u0 r7u0Var = (r7u0) this.b;
                v1k1 v1k1Var = (v1k1) this.c;
                VideoFrameProcessingException videoFrameProcessingException = (VideoFrameProcessingException) this.d;
                ie30 ie30Var = r7u0Var.c;
                ie30Var.getClass();
                v1k1Var.c(new VideoSink$VideoSinkException(videoFrameProcessingException, ie30Var));
                return;
            case 10:
                lsw0 lsw0Var = (lsw0) this.b;
                pzc pzcVar = (pzc) this.c;
                sxl1 sxl1Var = (sxl1) this.d;
                lsw0Var.getClass();
                try {
                    zBooleanValue = ((Boolean) pzcVar.b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (lsw0Var.k) {
                    try {
                        uvl1 uvl1VarZ = yoi1.z(sxl1Var.a);
                        String str2 = uvl1VarZ.a;
                        if (lsw0Var.c(str2) == sxl1Var) {
                            lsw0Var.b(str2);
                        }
                        qs10.a().getClass();
                        Iterator it = lsw0Var.j.iterator();
                        while (it.hasNext()) {
                            ((em00) it.next()).a(uvl1VarZ, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 11:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str3 = (String) this.c;
                try {
                    f.f(iOnDoneCallback, str3, ((z321) this.d).b());
                    return;
                } catch (RuntimeException e3) {
                    f.e(iOnDoneCallback, e3, str3);
                    eg.j(e3);
                    return;
                } catch (BundlerException e4) {
                    f.e(iOnDoneCallback, e4, str3);
                    return;
                }
            case 12:
                na30 na30Var = (na30) this.b;
                b1d b1dVar = (b1d) this.c;
                n8d0 n8d0Var = (n8d0) this.d;
                Objects.toString(b1dVar);
                na30Var.a.remove(n8d0Var);
                return;
            case 13:
                ((lvc1) this.b).b((n3d1) this.c, (Map.Entry) this.d);
                return;
            case 14:
                q4d1 q4d1Var = (q4d1) this.b;
                j4d1 j4d1Var = (j4d1) this.c;
                k65 k65Var = (k65) this.d;
                p4d1 p4d1Var = q4d1Var.f;
                p4d1Var.a();
                if (p4d1Var.g) {
                    p4d1Var.g = false;
                    j4d1Var.c();
                    j4d1Var.i.b((Object) null);
                    return;
                }
                p4d1Var.b = j4d1Var;
                p4d1Var.d = k65Var;
                Size size = j4d1Var.b;
                p4d1Var.a = size;
                p4d1Var.f = false;
                if (p4d1Var.b()) {
                    return;
                }
                j2h1.o("SurfaceViewImpl");
                p4d1Var.h.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case 15:
                pgg1 pgg1Var = (pgg1) this.b;
                v280 v280Var2 = (v280) this.c;
                ExportException exportException = (ExportException) this.d;
                lqr lqrVar = pgg1Var.e;
                bg11 bg11VarG2 = v280Var2.g();
                cab cabVar = pgg1Var.d;
                String str4 = (String) cabVar.c;
                String str5 = (String) cabVar.d;
                myr myrVar = (myr) lqrVar.b;
                bt00 bt00Var = myrVar.f98p;
                zho1.M(bt00Var, bg11VarG2, str4, str5);
                a1g1 a1g1Var = myrVar.i;
                bt00Var.q = exportException;
                a1g1Var.c(bt00Var.a(), exportException);
                return;
            case 16:
                ((oxg1) this.b).b((pwg1) this.c, (gv40) this.d);
                return;
            case 17:
                n8d0 n8d0Var2 = (n8d0) this.b;
                em61 em61Var = (em61) this.c;
                try {
                    try {
                        em61Var.w(((bi7) this.d).apply(fc11.C(n8d0Var2)));
                        return;
                    } catch (Throwable th2) {
                        em61Var.v(th2);
                        return;
                    }
                } catch (Error e5) {
                    e = e5;
                    em61Var.v(e);
                    return;
                } catch (CancellationException unused2) {
                    em61Var.cancel(false);
                    return;
                } catch (RuntimeException e6) {
                    e = e6;
                    em61Var.v(e);
                    return;
                } catch (ExecutionException e7) {
                    Throwable th3 = e7;
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        th3 = cause;
                    }
                    em61Var.v(th3);
                    return;
                }
            case 18:
                em61 em61Var2 = (em61) this.b;
                vqh0 vqh0Var = (vqh0) this.c;
                ch61 ch61Var = (ch61) this.d;
                try {
                    if (em61Var2.isCancelled()) {
                        return;
                    }
                    vqh0Var.run();
                    em61Var2.u(ch61Var);
                    return;
                } catch (Throwable th4) {
                    em61Var2.v(th4);
                    return;
                }
            case 19:
                bih1 bih1Var = (bih1) this.b;
                ie30 ie30Var2 = (ie30) this.c;
                iar iarVar = (iar) this.d;
                qwj1 qwj1Var = (qwj1) bih1Var.c;
                String str6 = zoi1.a;
                qwj1Var.I(ie30Var2, iarVar);
                return;
            case 20:
                sjl1 sjl1Var = (sjl1) this.b;
                qpj1 qpj1Var = (qpj1) this.c;
                Context context = (Context) this.d;
                hr80.u();
                if (bjl1.a.a()) {
                    jjl1.a.a(sjl1Var, qpj1Var);
                    return;
                } else if (bjl1.b.a()) {
                    jjl1.a.c(sjl1Var, new iyh1(qpj1Var, (byte) 14));
                    return;
                } else {
                    WebSettings.getDefaultUserAgent(context.getApplicationContext());
                    new Handler(Looper.getMainLooper()).post(new ril1(qpj1Var));
                    return;
                }
            default:
                t8r0 t8r0Var = (t8r0) this.b;
                mkb1 mkb1Var = (mkb1) this.c;
                lsw0 lsw0Var2 = (lsw0) t8r0Var.a;
                lsw0Var2.getClass();
                uvl1 uvl1Var = mkb1Var.a;
                String str7 = uvl1Var.a;
                ArrayList arrayList = new ArrayList();
                vwl1 vwl1Var = (vwl1) lsw0Var2.e.r(new ww21(new v5t(lsw0Var2, arrayList, str7, (byte) 1), (byte) 1));
                byte b = 17;
                if (vwl1Var == null) {
                    qs10 qs10VarA = qs10.a();
                    uvl1Var.toString();
                    qs10VarA.getClass();
                    lsw0Var2.d.d.execute(new zyh0(lsw0Var2, uvl1Var, b));
                    return;
                }
                synchronized (lsw0Var2.k) {
                    try {
                        synchronized (lsw0Var2.k) {
                            z = lsw0Var2.c(str7) != null;
                            break;
                        }
                        if (z) {
                            Set set = (Set) lsw0Var2.h.get(str7);
                            if (((mkb1) set.iterator().next()).a.b == uvl1Var.b) {
                                set.add(mkb1Var);
                                qs10 qs10VarA2 = qs10.a();
                                uvl1Var.toString();
                                qs10VarA2.getClass();
                            } else {
                                lsw0Var2.d.d.execute(new zyh0(lsw0Var2, uvl1Var, b));
                            }
                            return;
                        }
                        if (vwl1Var.t != uvl1Var.b) {
                            lsw0Var2.d.d.execute(new zyh0(lsw0Var2, uvl1Var, b));
                            return;
                        }
                        sxl1 sxl1Var2 = new sxl1(new k1i(lsw0Var2.b, lsw0Var2.c, lsw0Var2.d, lsw0Var2, lsw0Var2.e, vwl1Var, arrayList));
                        q8n q8nVar = sxl1Var2.d.b;
                        gaa0 gaa0VarF = op71.f();
                        q8nVar.getClass();
                        pzc pzcVarR = fc11.R(flo1.l(q8nVar, gaa0VarF), new vse0(sxl1Var2, (lnm) null, (byte) 23));
                        pzcVarR.b.b(new vqh0((Object) lsw0Var2, (Object) pzcVarR, (Object) sxl1Var2, (byte) 10), lsw0Var2.d.d);
                        lsw0Var2.g.put(str7, sxl1Var2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(mkb1Var);
                        lsw0Var2.h.put(str7, hashSet);
                        qs10 qs10VarA3 = qs10.a();
                        uvl1Var.toString();
                        qs10VarA3.getClass();
                        return;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
        }
    }

    public /* synthetic */ vqh0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
