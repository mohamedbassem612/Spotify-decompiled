package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mah1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mah1(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        File file;
        Disposable disposableSubscribe = null;
        switch (this.a) {
            case 0:
                rah1 rah1Var = (rah1) this.b;
                up0.a(rah1Var.j, rah1Var.a.a, (String) null, (String) null, (pah1) this.c, 6);
                return rih1.a;
            case 1:
                ven0 ven0Var = (ven0) this.c;
                lbh1 lbh1Var = (lbh1) this.b;
                List list = uah1.a;
                ven0Var.setValue(lbh1Var);
                return rih1.a;
            case 2:
                ((iu30) this.b).invoke((lbh1) this.c);
                return rih1.a;
            case 3:
                obh1 obh1Var = (obh1) this.b;
                hrr0 hrr0Var = obh1Var.e;
                hrr0 hrr0Var2 = obh1Var.i;
                List list2 = (List) hrr0Var.getValue();
                lbh1 lbh1Var2 = (lbh1) this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!u890.j(((lbh1) obj).a, lbh1Var2.a)) {
                        arrayList.add(obj);
                    }
                }
                obh1Var.e.setValue(arrayList);
                if (u890.j((String) hrr0Var2.getValue(), lbh1Var2.a)) {
                    hrr0Var2.setValue((Object) null);
                }
                return rih1.a;
            case 4:
                if (!((tbh1) this.b).e) {
                    ((iu30) this.c).invoke(rbh1.a);
                }
                return rih1.a;
            case 5:
                try {
                    ((iu30) this.b).invoke(uwh1.a);
                    ((ihg0) this.c).a(new String[]{"application/pdf"});
                    break;
                } catch (ActivityNotFoundException e) {
                    Logger.l(e, "File picker not available on device", new Object[0]);
                }
                return rih1.a;
            case 6:
                ((cir0) this.b).c().a(l231.a);
                ((Context) this.c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.spotify.com/article/ai-usage-limits/")).addFlags(268435456));
                return rih1.a;
            case 7:
                ((iu30) this.b).invoke(new q5i1(((i6i1) this.c).b));
                return rih1.a;
            case 8:
                n9i1 n9i1Var = (n9i1) this.b;
                i8h1 i8h1Var = n9i1Var.a;
                x6h1 x6h1VarC = n9i1Var.b.b.c();
                x6h1VarC.i.add(new a7h1("privacy_policy_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/content-policy-reporting/")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                z710.d((z710) this.c, "https://support.spotify.com/content-policy-reporting/", false, 6);
                return rih1.a;
            case 9:
                ((n9i1) this.b).a();
                ((gon0) this.c).t();
                return rih1.a;
            case 10:
                n9i1 n9i1Var2 = (n9i1) this.b;
                i8h1 i8h1Var2 = n9i1Var2.a;
                x6h1 x6h1VarC2 = n9i1Var2.d.b.c();
                x6h1VarC2.i.add(new a7h1("screenshot_dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                w9i1 w9i1Var = (w9i1) this.c;
                synchronized (w9i1Var.x1) {
                    try {
                        if (!w9i1Var.w1 && !w9i1Var.C1) {
                            w9i1Var.z1 = true;
                            w9i1Var.e1.l((Object) null);
                            File file2 = w9i1Var.y1;
                            if (file2 != null) {
                                w9i1Var.A1 = dm61.u0(file2, w9i1Var.A1);
                            }
                            disposableSubscribe = w9i1Var.y1;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (disposableSubscribe != null) {
                    fyh1 fyh1Var = w9i1Var.h;
                    List listSingletonList = Collections.singletonList(disposableSubscribe);
                    fyh1Var.getClass();
                    fyh1.d(listSingletonList);
                }
                return rih1.a;
            case 11:
                nni1 nni1Var = (nni1) this.b;
                ymi1 ymi1Var = (ymi1) nni1Var.d.getValue();
                i8h1 i8h1Var3 = ymi1Var.a;
                brl0 brl0Var = ymi1Var.c;
                brl0Var.getClass();
                x6h1 x6h1VarC3 = brl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("qr_code_overlay", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                String str = nni1Var.e;
                if (str != null) {
                    fn31.T((c9n) this.c, (o8n) null, 0, new lni1(nni1Var, str, null, (byte) 0), 3);
                }
                return rih1.a;
            case 12:
                ((iu30) ((tob1) this.c).getValue()).invoke(new oxi1(((txi1) this.b).a));
                return rih1.a;
            case 13:
                ((a0j1) this.b).i.c.d(((xzi1) this.c).a instanceof uzi1);
                return rih1.a;
            case 14:
                ((z1j1) this.b).g.c.d(((x1j1) this.c) instanceof v1j1);
                return rih1.a;
            case 15:
                ((iu30) this.b).invoke(((cor0) this.c).b);
                return rih1.a;
            case 16:
                long jUptimeMillis = SystemClock.uptimeMillis();
                frr0 frr0Var = (frr0) this.c;
                if (jUptimeMillis - frr0Var.s() > 1000) {
                    frr0Var.t(jUptimeMillis);
                    ((Function0) this.b).invoke();
                }
                return rih1.a;
            case 17:
                icj1 icj1Var = (icj1) ((ven0) this.c).getValue();
                if (icj1Var != null && icj1Var.c) {
                    icj1Var.a.u();
                }
                ((ocj1) this.b).b.g();
                return rih1.a;
            case 18:
                ((ven0) this.c).setValue(Boolean.FALSE);
                ((xtm0) this.b).b();
                return rih1.a;
            case 19:
                k0t k0tVar = (k0t) ((kly0) this.b).get();
                VideoSurfaceView videoSurfaceView = ((ffj1) this.c).a;
                if (videoSurfaceView != null) {
                    k0tVar.c(new x500(videoSurfaceView, (View) null));
                }
                return k0tVar;
            case 20:
                sfj1 sfj1Var = (sfj1) this.b;
                return new yuj1(sfj1Var.i, sfj1Var.j, (iac0) this.c, sfj1Var.g.h(), vno1.a, sfj1Var.m.d(), sfj1Var.d, vbh1.Z0);
            case 21:
                return new kpg0((xpw) ((rgj1) this.b).a.invoke((oud) this.c), egj1.N0);
            case 22:
                return new kpg0((xpw) ((dfv) this.b).h.get(), new yvf1((z6k0) this.c, (byte) 8));
            case 23:
                upy0 upy0Var = (upy0) this.b;
                lvw0 lvw0Var = (lvw0) upy0Var.f;
                lvw0Var.c.dispose();
                lvw0Var.b = j5.a;
                lvw0Var.c = lvw0Var.a.a.map(new hfr("streaming-rules", (byte) 16)).distinctUntilChanged().subscribe(new ixp0(lvw0Var, (byte) 27));
                rma rmaVar = (rma) upy0Var.g;
                Disposable disposable = rmaVar.d;
                if (disposable != null) {
                    disposable.dispose();
                }
                try {
                    disposableSubscribe = rmaVar.a.subscribe(new mba(rmaVar, (byte) 1), new vrk1((byte) 12));
                    break;
                } catch (Throwable th2) {
                    Logger.e(th2, "Failed to load Betamax configuration, keeping default", new Object[0]);
                }
                rmaVar.d = disposableSubscribe;
                try {
                    ((vku) upy0Var.Y).a(((Single) this.c).subscribe(new rdj1(upy0Var, (byte) 2), iqa1.Z0));
                    break;
                } catch (Throwable th3) {
                    Logger.e(th3, "Failed to load Betamax configuration, skipping video player initialization", new Object[0]);
                }
                return rih1.a;
            case 24:
                smo1.p(((upy0) this.b).b, (CancellationException) null);
                if (((aj4) ((upy0) this.b).h).i()) {
                    yoa yoaVar = (yoa) ((upy0) this.b).d.get();
                    xoa xoaVar = yoaVar.e;
                    if (xoaVar != null) {
                        Trace.beginSection("BetamaxPlayerPool.CacheAccess");
                        try {
                            xoaVar.evictAll();
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                    Iterator it = o7h.l1(yoaVar.f.values()).iterator();
                    while (it.hasNext()) {
                        yoaVar.d((uoa) it.next(), false);
                    }
                }
                akm akmVar = ((mrj1) ((upy0) this.b).c).b;
                if (akmVar != null) {
                    if (akmVar.i != null) {
                        akmVar.e.h.onNext(Boolean.FALSE);
                        akmVar.i = null;
                    }
                    Disposable disposable2 = (Disposable) akmVar.a.c;
                    if (disposable2 != null) {
                        disposable2.dispose();
                    }
                    akmVar.h.c();
                }
                ((o5n) ((upy0) this.b).t).b("");
                hqp0 hqp0Var = (hqp0) ((upy0) this.b).e;
                hqp0Var.h = true;
                kl1 kl1Var = hqp0Var.c;
                Disposable disposable3 = (Disposable) kl1Var.e;
                if (disposable3 != null) {
                    disposable3.dispose();
                }
                kl1Var.e = null;
                hqp0Var.d.b.c();
                hqp0Var.a.c.b.remove(hqp0Var);
                yna ynaVar = hqp0Var.a;
                ena enaVar = ynaVar.a;
                enaVar.a.g(3, (String) null);
                enaVar.j.c();
                cna cnaVar = ynaVar.b;
                cnaVar.h.dispose();
                ((xxu) cnaVar.a.b).e.remove(cnaVar.f);
                cnaVar.g.clear();
                cnaVar.j.clear();
                hqp0Var.b.j.c();
                ((vku) ((upy0) this.b).Y).c();
                Disposable disposable4 = ((rma) ((upy0) this.b).g).d;
                if (disposable4 != null) {
                    disposable4.dispose();
                }
                ((lvw0) ((upy0) this.b).f).c.dispose();
                rm5 rm5VarC = ((r4t) this.c).c();
                mrj1 mrj1Var = (mrj1) ((upy0) this.b).c;
                r4t r4tVar = (r4t) this.c;
                akm akmVar2 = mrj1Var.b;
                if (akmVar2 != null) {
                    apa apaVar = akmVar2.b;
                    if (apaVar != null) {
                        hdu0 hdu0Var = apaVar.U0;
                        apaVar.U0 = null;
                        r4t r4tVar2 = new r4t(new ix7(hdu0Var, apaVar, r4tVar.c(), (byte) 24));
                        rm5 rm5VarC2 = r4tVar2.c();
                        apaVar.a.s(r4tVar2);
                        apaVar.b.s(r4tVar2);
                        if (apaVar.i) {
                            zv81 zv81Var = ((kma) apaVar.h.get()).a;
                            synchronized (zv81Var) {
                                if (!zv81Var.i) {
                                    zv81Var.e.clear();
                                    zv81Var.m();
                                    try {
                                        try {
                                            zv81Var.c.C();
                                            file = zv81Var.a;
                                        } catch (IOException e2) {
                                            oon1.w("Storing index file failed", e2);
                                            file = zv81Var.a;
                                        }
                                        zv81.p(file);
                                        zv81Var.i = true;
                                    } catch (Throwable th5) {
                                        zv81.p(zv81Var.a);
                                        zv81Var.i = true;
                                        throw th5;
                                    }
                                }
                            }
                        }
                        rm5VarC2.H();
                    }
                    akmVar2.b = null;
                }
                rm5VarC.H();
                return rih1.a;
            case 25:
                adj1 adj1Var = (adj1) this.c;
                uoa uoaVar = (uoa) this.b;
                if (uoaVar.e() != null && !adj1Var.f() && adj1Var.isVisible()) {
                    uoaVar.l();
                }
                return rih1.a;
            case 26:
                if (!((gsj1) this.b).i.l()) {
                    return new qbo0();
                }
                tl7 tl7VarU = h7p1.u((ViewGroup) this.c);
                return tl7VarU == null ? new qbo0() : tl7VarU;
            case 27:
                ((iu30) this.b).invoke((zvj1) this.c);
                return rih1.a;
            case 28:
                if (((hwj1) this.b).a) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            default:
                ((oxj1) this.b).a.f();
                ((ycl1) this.c).b(jxj1.a);
                return rih1.a;
        }
    }
}
