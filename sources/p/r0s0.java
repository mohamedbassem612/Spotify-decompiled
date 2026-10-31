package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r0s0 implements Function, mi51, eds0, ObservableOnSubscribe, BiFunction, f080 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public r0s0(String str) {
        this.a = (byte) 3;
        ge30 ge30Var = new ge30();
        ge30Var.n = asj0.p("video/mp2t");
        ge30Var.o = asj0.p(str);
        this.b = new ie30(ge30Var);
    }

    public Completable A() {
        boolean z = ((AtomicBoolean) this.d).get();
        if (z) {
            return ((ruz) this.c).a(new g9u0("ads-playercontroller", false)).ignoreElement().g(new t9u0(this, (byte) 1));
        }
        if (!z) {
            return CompletableEmpty.a;
        }
        eg.o();
        return null;
    }

    public RxRouterProvider B() {
        return (RxRouterProvider) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable C(String str, onm onmVar) {
        ppu0 ppu0Var;
        String m231Var;
        jo70 jo70Var;
        if (onmVar instanceof ppu0) {
            ppu0Var = (ppu0) onmVar;
            int i = ppu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ppu0Var.d = i - Integer.MIN_VALUE;
            } else {
                ppu0Var = new ppu0(this, onmVar);
            }
        } else {
            ppu0Var = new ppu0(this, onmVar);
        }
        Object objK = ppu0Var.b;
        int i2 = ppu0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                ezc ezcVarG = yoi1.g(((uu00) this.c).b(new oi("PlaylistNameGenerator", false, new atp0(str, (byte) 28))));
                ppu0Var.a = str;
                ppu0Var.d = 1;
                objK = b5p1.k(ezcVarG, ppu0Var);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ppu0Var.a;
                hm5.M(objK);
            }
            uv00 uv00Var = (uv00) objK;
            if (uv00Var == null || (jo70Var = uv00Var.a(jo70.class, str).b) == null || (m231Var = jo70Var.a) == null || ihc1.y0(m231Var)) {
                m231Var = null;
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:28:0x0070, B:30:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0093, B:40:0x0097, B:46:0x00ac, B:47:0x00b1, B:25:0x004f), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:28:0x0070, B:30:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0093, B:40:0x0097, B:46:0x00ac, B:47:0x00b1, B:25:0x004f), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:28:0x0070, B:30:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0093, B:40:0x0097, B:46:0x00ac, B:47:0x00b1, B:25:0x004f), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:28:0x0070, B:30:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0093, B:40:0x0097, B:46:0x00ac, B:47:0x00b1, B:25:0x004f), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[Catch: Exception -> 0x0080, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:28:0x0070, B:30:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0093, B:40:0x0097, B:46:0x00ac, B:47:0x00b1, B:25:0x004f), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac A[Catch: Exception -> 0x0080, TRY_ENTER, TryCatch #0 {Exception -> 0x0080, blocks: (B:28:0x0070, B:30:0x0076, B:34:0x0085, B:36:0x0089, B:38:0x0093, B:40:0x0097, B:46:0x00ac, B:47:0x00b1, B:25:0x004f), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(onm onmVar) throws NoWhenBranchMatchedException {
        dlt0 dlt0Var;
        String string;
        Exception e;
        String str;
        Object objF;
        m0f1 m0f1Var;
        Object objE;
        String message;
        if (onmVar instanceof dlt0) {
            dlt0Var = (dlt0) onmVar;
            int i = dlt0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dlt0Var.d = i - Integer.MIN_VALUE;
            } else {
                dlt0Var = new dlt0(this, onmVar);
            }
        } else {
            dlt0Var = new dlt0(this, onmVar);
        }
        Object obj = dlt0Var.b;
        int i2 = dlt0Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            string = UUID.randomUUID().toString();
            try {
                dzp0 dzp0Var = (dzp0) this.b;
                String strZ = zno1.z(((MessageDigest) this.d).digest(string.getBytes(nne.a)));
                dlt0Var.a = string;
                dlt0Var.d = 1;
                objF = dzp0Var.f(strZ, dlt0Var);
                if (objF != d9nVar) {
                    m0f1Var = (p0f1) objF;
                    if (m0f1Var instanceof m0f1) {
                        return new jlt0(m0f1Var.a);
                    }
                    if (m0f1Var instanceof o0f1) {
                        return new llt0(((o0f1) m0f1Var).a);
                    }
                    if (m0f1Var instanceof n0f1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = ((n0f1) m0f1Var).a;
                    dlt0Var.a = string;
                    dlt0Var.d = 2;
                    objE = E(str2, string, dlt0Var);
                    if (objE != d9nVar) {
                        String str3 = string;
                        obj = objE;
                        str = str3;
                        return (nlt0) obj;
                    }
                }
                return d9nVar;
            } catch (Exception e2) {
                e = e2;
                str = string;
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                return new mlt0(message, str, (String) null);
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = dlt0Var.a;
            try {
                hm5.M(obj);
                return (nlt0) obj;
            } catch (Exception e3) {
                e = e3;
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                return new mlt0(message, str, (String) null);
            }
        }
        String str4 = dlt0Var.a;
        try {
            hm5.M(obj);
            objF = obj;
            string = str4;
            m0f1Var = (p0f1) objF;
            if (m0f1Var instanceof m0f1) {
                return new jlt0(m0f1Var.a);
            }
            if (m0f1Var instanceof o0f1) {
                return new llt0(((o0f1) m0f1Var).a);
            }
            if (m0f1Var instanceof n0f1) {
                throw new NoWhenBranchMatchedException();
            }
            String str5 = ((n0f1) m0f1Var).a;
            dlt0Var.a = string;
            dlt0Var.d = 2;
            objE = E(str5, string, dlt0Var);
            if (objE != d9nVar) {
                String str6 = string;
                obj = objE;
                str = str6;
                return (nlt0) obj;
            }
            return d9nVar;
        } catch (Exception e4) {
            e = e4;
            str = str4;
            message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new mlt0(message, str, (String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(String str, String str2, onm onmVar) {
        elt0 elt0Var;
        if (onmVar instanceof elt0) {
            elt0Var = (elt0) onmVar;
            int i = elt0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                elt0Var.e = i - Integer.MIN_VALUE;
            } else {
                elt0Var = new elt0(this, onmVar);
            }
        } else {
            elt0Var = new elt0(this, onmVar);
        }
        Object objQ = elt0Var.c;
        int i2 = elt0Var.e;
        if (i2 == 0) {
            hm5.M(objQ);
            myq0 myq0Var = (myq0) this.c;
            elt0Var.a = str;
            elt0Var.b = str2;
            elt0Var.e = 1;
            objQ = myq0Var.q(str, str2, elt0Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = elt0Var.b;
            str = elt0Var.a;
            hm5.M(objQ);
        }
        s3j1 s3j1Var = (u3j1) objQ;
        if (s3j1Var instanceof s3j1) {
            return new mlt0(s3j1Var.a, str2, str);
        }
        if (s3j1Var instanceof t3j1) {
            return new klt0(((t3j1) s3j1Var).a, str2, str);
        }
        eg.o();
        return null;
    }

    public void a(izr0 izr0Var) {
        long jD;
        long j;
        ((yve1) this.c).getClass();
        String str = zoi1.a;
        yve1 yve1Var = (yve1) this.c;
        synchronized (yve1Var) {
            try {
                long j2 = yve1Var.c;
                jD = j2 != -9223372036854775807L ? j2 + yve1Var.b : yve1Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        yve1 yve1Var2 = (yve1) this.c;
        synchronized (yve1Var2) {
            j = yve1Var2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        ie30 ie30Var = (ie30) this.b;
        if (j != ie30Var.u) {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.t = j;
            ie30 ie30Var2 = new ie30(ge30VarA);
            this.b = ie30Var2;
            ((gtf1) this.d).a(ie30Var2);
        }
        int iA = izr0Var.a();
        ((gtf1) this.d).f(iA, izr0Var);
        ((gtf1) this.d).b(jD, 1, iA, 0, (ftf1) null);
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        List list = (List) obj2;
        ats0 ats0Var = (ats0) this.c;
        r9c r9cVar = (r9c) this.b;
        if (!r9cVar.g && !list.isEmpty()) {
            Context context = ats0Var.a;
            String string = context.getString(2131954023);
            Uri uri = Uri.EMPTY;
            Single singleJust = Single.just(Collections.singletonList(new u310("com.spotify.offline", (String) null, string, (String) null, kno1.q(context, 2131233204), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12)));
            singleJust.getClass();
            return singleJust;
        }
        m210 m210Var = (m210) this.d;
        boolean zL = y7y0.L(map);
        boolean zC = rh11.c(map);
        String str = r9cVar.n;
        boolean z = !(str == null || str.length() == 0);
        boolean zY = nhc1.Y(r9cVar.b, "spotify:section:", false);
        boolean z2 = r9cVar.o;
        if (zY) {
            return z2 ? ats0Var.g(r9cVar, zL, zC) : ats0Var.h(r9cVar, m210Var, zL, z, zC);
        }
        ytp0 ytp0Var = ats0Var.d;
        Single map2 = z2 ? ytp0Var.y(r9cVar, 0).firstOrError().map(new yss0(ats0Var, m210Var, (byte) 0)) : ytp0Var.y(r9cVar, 0).firstOrError().map(new m980(ats0Var, z, (byte) 21)).flatMap(new zhq0(ats0Var, m210Var, (byte) 18)).map(new myq0(ats0Var, m210Var, (byte) 14));
        map2.getClass();
        return map2;
    }

    public void b() {
        ees0 ees0Var = ((gpv0) this.d).f;
        if (ees0Var != null) {
            ees0Var.b();
        }
    }

    public void c(yve1 yve1Var, gc10 gc10Var, wwg1 wwg1Var) {
        this.c = yve1Var;
        wwg1Var.a();
        wwg1Var.b();
        gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 5);
        this.d = gtf1VarW;
        gtf1VarW.a((ie30) this.b);
    }

    public void d(String str, String str2) {
        ees0 ees0Var = ((gpv0) this.d).f;
        if (ees0Var != null) {
            ees0Var.d(str, str2);
        }
    }

    public void e(int i, Bitmap bitmap) {
        g1u0 g1u0Var = (g1u0) this.b;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return;
                } else if (bitmap.isRecycled()) {
                    hhg1.n("Failed requirement.");
                    return;
                }
            } else if (bitmap.isRecycled()) {
                hhg1.n("Failed requirement.");
                return;
            }
        } else if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
            return;
        }
        if (!u890.j(g1u0Var.B, (String) this.d) || g1u0Var.A == null) {
            return;
        }
        ((iu30) this.c).invoke(bitmap);
        if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
        }
    }

    public void f(double d) {
        gpv0 gpv0Var = (gpv0) this.d;
        gpv0Var.c.setValue(Double.valueOf(d));
        ees0 ees0Var = gpv0Var.f;
        if (ees0Var != null) {
            ees0Var.f(d);
        }
    }

    public void h(double d) {
        ((WebView) this.c).postVisualStateCallback(0L, new des0((gpv0) this.d, d, (byte) 1));
    }

    public void i() {
        ees0 ees0Var = ((gpv0) this.d).f;
        if (ees0Var != null) {
            ees0Var.i();
        }
    }

    public void j(String str) {
        ees0 ees0Var = ((gpv0) this.d).f;
        if (ees0Var != null) {
            ees0Var.j(str);
        }
    }

    public void k(String str, String str2) {
        ees0 ees0Var = ((gpv0) this.d).f;
        if (ees0Var != null) {
            ees0Var.k(str, str2);
        }
    }

    public void l() {
        String strB = w0h1.d(k8b0.b).b(hds0.Companion.serializer(), (hds0) this.b);
        ((WebView) this.c).evaluateJavascript("window.PciBridge.init(" + strB + ");", null);
        ees0 ees0Var = ((gpv0) this.d).f;
        if (ees0Var != null) {
            ees0Var.l();
        }
    }

    public Single o() {
        Observable observableI = yoi1.i(((zwz0) this.b).c(), o6x.a);
        Observable map = ((crd) this.c).c.map(sl10.Y0);
        qs10 qs10Var = qs10.X0;
        return observableI.zipWith(map, qs10Var).zipWith(((o241) this.d).a("parental-pin-required", "0").map(as10.V0), qs10Var).firstOrError();
    }

    public yqg p() {
        return (yqg) this.c;
    }

    public void q() {
        ((lzn0) this.c).e();
    }

    public ylt0 r(xlt0 xlt0Var) {
        if (xlt0Var instanceof ult0) {
            rxp rxpVar = (rxp) this.b;
            yzc0 yzc0Var = ((ult0) xlt0Var).a;
            toj0 toj0Var = (toj0) rxpVar.a.c;
            f9p f9pVar = (f9p) toj0Var.b;
            wdm wdmVarL = toj0Var.l();
            e7p0 e7p0Var = (e7p0) f9pVar.e;
            c8o.l(e7p0Var);
            lag lagVarG = toj0Var.g();
            c9c0 c9c0Var = (c9c0) f9pVar.W0;
            c8o.l(c9c0Var);
            g0l g0lVar = (g0l) f9pVar.X0;
            c8o.l(g0lVar);
            h9k0 h9k0Var = (h9k0) f9pVar.Z0;
            c8o.l(h9k0Var);
            b9q b9qVar = (b9q) f9pVar.Y0;
            c8o.l(b9qVar);
            return new bmt0(wdmVarL, e7p0Var, lagVarG, new poj0(c9c0Var, g0lVar, h9k0Var, b9qVar), yzc0Var);
        }
        if (xlt0Var instanceof tlt0) {
            txp txpVar = (txp) this.c;
            tlt0 tlt0Var = (tlt0) xlt0Var;
            muz muzVar = tlt0Var.a;
            ruz ruzVar = tlt0Var.b;
            toj0 toj0Var2 = (toj0) txpVar.a.c;
            yqg yqgVar = (yqg) ((f9p) toj0Var2.b).c;
            c8o.l(yqgVar);
            wdm wdmVarL2 = toj0Var2.l();
            lag lagVarG2 = toj0Var2.g();
            b7r0 b7r0Var = (b7r0) ((f9p) toj0Var2.b).g;
            c8o.l(b7r0Var);
            return new wab1(yqgVar, wdmVarL2, lagVarG2, b7r0Var, muzVar, ruzVar);
        }
        if (xlt0Var instanceof vlt0) {
            return new gry(((vlt0) xlt0Var).a);
        }
        if (!(xlt0Var instanceof wlt0)) {
            eg.o();
            return null;
        }
        sxp sxpVar = (sxp) this.d;
        ruz ruzVar2 = ((wlt0) xlt0Var).a;
        toj0 toj0Var3 = (toj0) sxpVar.a.c;
        f9p f9pVar2 = (f9p) toj0Var3.b;
        wdm wdmVarL3 = toj0Var3.l();
        lag lagVarG3 = toj0Var3.g();
        xrc0 xrc0Var = (xrc0) f9pVar2.d;
        c8o.l(xrc0Var);
        b7r0 b7r0Var2 = (b7r0) f9pVar2.g;
        c8o.l(b7r0Var2);
        e7p0 e7p0Var2 = (e7p0) f9pVar2.e;
        c8o.l(e7p0Var2);
        Flowable flowable = (Flowable) f9pVar2.h;
        c8o.l(flowable);
        return new tab1(wdmVarL3, lagVarG3, xrc0Var, b7r0Var2, new myq0(e7p0Var2, flowable, (byte) 22), ruzVar2);
    }

    public phi0 s(tka0 tka0Var) {
        return new phi0((Flowable) this.b, (c3s) this.c, (q8n) this.d, tka0Var);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        kl1 kl1Var = (kl1) ((o4e0) this.b).b;
        p7w p7wVar = (p7w) this.c;
        ox41 ox41Var = (ox41) this.d;
        rrr rrrVar = new rrr(new ojs0(ox41Var, observableEmitter), (byte) 2);
        rrr rrrVar2 = new rrr(new ojs0(observableEmitter, ox41Var), (byte) 2);
        ((vku) kl1Var.f).a(Observable.fromCallable(new e71(kl1Var, p7wVar, (byte) 7)).switchMap(new jut(kl1Var, p7wVar, (byte) 18)).observeOn((Scheduler) kl1Var.d).subscribeOn((Scheduler) kl1Var.e).subscribe(new qg7(p7wVar, rrrVar, rrrVar2, (byte) 10), new lgr(rrrVar2, p7wVar, (byte) 11)));
    }

    public void t(r4z r4zVar, int i) {
        String str = r4zVar.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            ((wr00) this.b).a(str);
            return;
        }
        if (iC == 1) {
            ((y5v0) this.c).a(str, (String) null);
            return;
        }
        if (iC != 2) {
            eg.o();
            return;
        }
        String str2 = r4zVar.g;
        if (str2 == null) {
            str2 = r4zVar.f;
        }
        ((yh2) this.d).b(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(boolean z, onm onmVar) {
        npu0 npu0Var;
        if (onmVar instanceof npu0) {
            npu0Var = (npu0) onmVar;
            int i = npu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                npu0Var.d = i - Integer.MIN_VALUE;
            } else {
                npu0Var = new npu0(this, onmVar);
            }
        } else {
            npu0Var = new npu0(this, onmVar);
        }
        Object objA = npu0Var.b;
        int i2 = npu0Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            vwm1 vwm1Var = (vwm1) this.d;
            gvm1 gvm1VarO = YourLibraryRequest.o();
            hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
            hvm1VarQ.L();
            hvm1VarQ.q(true);
            jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
            jsm1VarR.q(ksm1.d);
            jsm1VarR.q(ksm1.t);
            hvm1VarQ.u(jsm1VarR.build());
            gvm1VarO.n(hvm1VarQ);
            YourLibraryRequest yourLibraryRequestBuild = gvm1VarO.build();
            npu0Var.a = z;
            npu0Var.d = 1;
            objA = vwm1Var.a(yourLibraryRequestBuild, npu0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = npu0Var.a;
            hm5.M(objA);
        }
        return ((Context) this.b).getString(z ? 2131954672 : 2131954673, new Integer(((YourLibraryResponse) objA).q().v() + 1));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r7 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(java.lang.String r6, p.onm r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.opu0
            if (r0 == 0) goto L13
            r0 = r7
            p.opu0 r0 = (p.opu0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.opu0 r0 = new p.opu0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r7)
            return r7
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            boolean r8 = r0.a
            p.hm5.M(r7)
            goto L47
        L37:
            p.hm5.M(r7)
            if (r6 == 0) goto L4d
            r0.a = r8
            r0.d = r3
            java.io.Serializable r7 = r5.C(r6, r0)
            if (r7 != r4) goto L47
            goto L57
        L47:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4c
            goto L4d
        L4c:
            return r7
        L4d:
            r0.a = r8
            r0.d = r2
            java.lang.Object r5 = r5.u(r8, r0)
            if (r5 != r4) goto L58
        L57:
            return r4
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r0s0.v(java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public void w(String str, tv80 tv80Var) {
        ou80 ou80Var;
        Bundle bundleF = pzm.f("pageUri", str, "interactionId", (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a);
        lzn0 lzn0Var = (lzn0) this.c;
        if (tv80Var != null) {
            lzn0Var.a(nik1.S3.a, tv80Var, bundleF);
        } else {
            lzn0Var.g(bundleF, nik1.S3.a);
        }
    }

    public void x(String str, tv80 tv80Var, u0t0 u0t0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("pageUri", str);
        bundle.putSerializable("interactionLoggingResult", tv80Var);
        bundle.putString(ContextTrack$Metadata.KEY_TITLE, u0t0Var.a);
        bundle.putString(ContextTrack$Metadata.KEY_SUBTITLE, u0t0Var.b);
        y0t0 y0t0VarA = ((t700) this.d).a();
        y0t0VarA.T0(bundle);
        y0t0VarA.g1((th30) this.b, "PinGateMessage");
    }

    public List y() {
        return (List) this.d;
    }

    public evz z(String str, String str2) {
        return h5p1.s(((k740) this.b).d(str2 == null ? str : str2), ((btt0) this.c).a(str2 == null ? str : str2), ((zrt0) this.d).a(str2 == null ? str : str2), new pov(this, str, str2, (lnm) null, (byte) 4));
    }

    public void g(Drawable drawable) {
    }

    public void m(Drawable drawable) {
    }

    public /* synthetic */ r0s0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public r0s0(String str, String str2, ci10 ci10Var) {
        this.a = (byte) 9;
        this.d = str;
        this.b = str2;
        this.c = ci10Var;
    }

    public r0s0(dzp0 dzp0Var, myq0 myq0Var) {
        this.a = (byte) 12;
        this.b = dzp0Var;
        this.c = myq0Var;
        this.d = MessageDigest.getInstance("SHA-256");
    }

    public r0s0(Flowable flowable, ruz ruzVar) {
        this.a = (byte) 23;
        this.b = flowable;
        this.c = ruzVar;
        this.d = new AtomicBoolean(false);
    }

    public r0s0(lik1 lik1Var, npm1 npm1Var, ywc0 ywc0Var, q8n q8nVar) {
        this.a = (byte) 27;
        this.b = lik1Var;
        this.c = ywc0Var;
        this.d = q8nVar;
    }

    public r0s0(rxp rxpVar, txp txpVar, sxp sxpVar, uxp uxpVar, vxp vxpVar) {
        this.a = (byte) 13;
        this.b = rxpVar;
        this.c = txpVar;
        this.d = sxpVar;
    }

    public /* synthetic */ r0s0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, View view2, byte b) {
        this.a = b;
        this.b = appCompatImageView;
        this.c = view;
        this.d = view2;
    }

    public r0s0(zor zorVar, dfs dfsVar, Scheduler scheduler, Scheduler scheduler2, g0l g0lVar, Observable observable, v5u0 v5u0Var, Observable observable2, efs efsVar) {
        this.a = (byte) 18;
        this.b = zorVar;
        this.c = dfsVar;
        this.d = efsVar;
    }

    public r0s0(g1u0 g1u0Var, String str, iu30 iu30Var) {
        this.a = (byte) 19;
        this.b = g1u0Var;
        this.d = str;
        this.c = iu30Var;
    }

    public r0s0(Flowable flowable, g0l g0lVar, yqg yqgVar, i8h1 i8h1Var, tau0 tau0Var, RxRouter rxRouter, e6u0 e6u0Var) {
        this.a = (byte) 20;
        this.b = yqgVar;
        this.c = tau0Var;
        this.d = rxRouter;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new CompletableFromAction(new lig((tzr0) this.b, (slc0) this.c, (String) obj, (String) this.d));
            case 7:
                List list = (List) obj;
                ((ats0) this.b).j.put((m210) this.c, list);
                return new mmr0((l510) this.d, Boolean.valueOf(list.isEmpty()));
            default:
                String str = (String) this.d;
                return (spq0) ((py21) obj).b(new atp0(str, (byte) 19), new os(str, (String) this.b, (ci10) this.c, (byte) 24));
        }
    }
}
