package p;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.offline_esperanto.proto.EsOffline$BulkRedownloadStartResponse;
import com.spotify.player.model.PlayOrigin;
import com.spotify.playlistmixing.proto.SetTransition;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class alg1 implements Function, zfl1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public alg1(Application application, lxh1 lxh1Var, tfl1 tfl1Var, Scheduler scheduler) {
        this.a = application;
        this.b = lxh1Var;
        this.c = tfl1Var;
        this.d = scheduler;
        this.f = new rku();
    }

    public static final Object k(alg1 alg1Var, xnn1 xnn1Var, l53 l53Var) {
        return fn31.Y(((qeh1) alg1Var.f).a().a, new juo1(alg1Var, xnn1Var, (lnm) null, (byte) 1), l53Var);
    }

    public static final /* synthetic */ x15 l(alg1 alg1Var) {
        return (x15) alg1Var.d;
    }

    public void a() {
        if (b()) {
            ((lxh1) this.b).l();
            return;
        }
        qpj1 qpj1Var = (qpj1) this.e;
        if (qpj1Var == null) {
            return;
        }
        ((rku) this.f).b(((BehaviorSubject) qpj1Var.c).timeout(5L, TimeUnit.SECONDS, (Scheduler) this.d, Observable.just(Boolean.FALSE)).firstOrError().subscribe(new rdj1((Object) this, (byte) 13), vrk1.f));
    }

    public Object apply(Object obj) {
        String str = (String) this.a;
        PlayIntent playIntent = (PlayIntent) this.b;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext = new VoiceAssistantLoggingContext(str, playIntent.getUri().toString(), (String) this.c, (String) obj);
        tp7 tp7Var = (tp7) this.d;
        m210 m210Var = (m210) this.e;
        t45 t45Var = (t45) this.f;
        return tp7Var.e(m210Var, t45Var).flatMapCompletable(new cik1(tp7Var, playIntent, t45Var, voiceAssistantLoggingContext, (byte) 1));
    }

    public boolean b() {
        ffl1 ffl1Var = (ffl1) ((lxh1) this.b).b;
        return ffl1Var != null && ffl1Var.g;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(vr20 vr20Var, x0k0 x0k0Var, String str, String str2, onm onmVar) {
        zkg1 zkg1Var;
        geo0 geo0Var;
        b0f1 b0f1Var;
        ldk0 ldk0Var;
        if (onmVar instanceof zkg1) {
            zkg1Var = (zkg1) onmVar;
            int i = zkg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zkg1Var.c = i - Integer.MIN_VALUE;
            } else {
                zkg1Var = new zkg1(this, onmVar);
            }
        } else {
            zkg1Var = new zkg1(this, onmVar);
        }
        Object obj = zkg1Var.a;
        int i2 = zkg1Var.c;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj);
                geo0Var = geo0.b;
                b0f1Var = new b0f1(this, (lnm) null, (byte) 12);
                zkg1Var.c = 3;
                if (fn31.Y(geo0Var, b0f1Var, zkg1Var) != d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            ldk0Var = (cdk0) this.d;
            zkg1Var.c = 5;
            if (ldk0Var.h(zkg1Var) != d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        hm5.M(obj);
        v0k0 v0k0Var = x0k0Var.b;
        lhg1 lhg1Var = x0k0Var.a;
        if (v0k0Var instanceof v0k0) {
            tv80 tv80Var = v0k0Var.a;
            ((lzn0) this.a).e();
            geo0 geo0Var2 = geo0.b;
            w621 w621Var = new w621(this, tv80Var, lnmVar, (byte) 22);
            zkg1Var.c = 1;
            if (fn31.Y(geo0Var2, w621Var, zkg1Var) != d9nVar) {
                return rih1Var;
            }
        } else if (v0k0Var instanceof u0k0) {
            g4k0 g4k0Var = new g4k0(lhg1Var, new e4k0(((u0k0) v0k0Var).a), str, str2);
            zkg1Var.c = 2;
            if (vr20Var.emit(g4k0Var, zkg1Var) != d9nVar) {
                geo0Var = geo0.b;
                b0f1Var = new b0f1(this, (lnm) null, (byte) 12);
                zkg1Var.c = 3;
                if (fn31.Y(geo0Var, b0f1Var, zkg1Var) != d9nVar) {
                    return rih1Var;
                }
            }
        } else {
            if (!(v0k0Var instanceof t0k0)) {
                eg.o();
                return null;
            }
            g4k0 g4k0Var2 = new g4k0(lhg1Var, new d4k0(((t0k0) v0k0Var).a), str, str2);
            zkg1Var.c = 4;
            if (vr20Var.emit(g4k0Var2, zkg1Var) != d9nVar) {
                ldk0Var = (cdk0) this.d;
                zkg1Var.c = 5;
                if (ldk0Var.h(zkg1Var) != d9nVar) {
                    return rih1Var;
                }
            }
        }
        return d9nVar;
    }

    public sma1 d(wao0 wao0Var) {
        u63 u63Var;
        i1q i1qVar = (i1q) this.a;
        lik1 lik1Var = (lik1) this.c;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        yon1.U4();
        muz muzVar = (muz) this.d;
        tgt0 tgt0Var = new tgt0(PlayOrigin.create("video-preview-carousel-search"));
        iac0 iac0Var = (iac0) this.f;
        i8h1 i8h1Var = (i8h1) this.b;
        xaj1 xaj1Var = new xaj1(wao0Var, (byte) 7);
        bjx0 bjx0Var = bjx0.W0;
        switch (i1qVar.a) {
            case 0:
                i2q i2qVar = (i2q) i1qVar.b;
                j2q j2qVar = i2qVar.c;
                teq teqVar = j2qVar.c;
                xfx xfxVar = (xfx) teqVar.q1.get();
                ssf1 ssf1Var = (ssf1) teqVar.g6.get();
                daq daqVar = j2qVar.b;
                ggx ggxVarP = d1j1.p(xfxVar, ssf1Var, (woa) daqVar.W8.get(), (kma) daqVar.Od.get(), (fpa) daqVar.X8.get(), (lzn0) teqVar.i.get(), (a6z) j2qVar.Y.get(), (i4q) teqVar.t2.get(), (zr00) daqVar.f9.get(), (yh2) teqVar.f3.get());
                j1q j1qVar = (j1q) j2qVar.P1.get();
                teq teqVar2 = i2qVar.b;
                cfq cfqVar = (cfq) teqVar2.a.Z1.get();
                h5q h5qVar = (h5q) teqVar2.db.get();
                u63Var = new u63(ggxVarP, j1qVar, cfqVar, h5qVar, teqVar2.Ac, (a3u0) teqVar2.Cc.get(), i8h1Var, lik1Var, muzVar, tgt0Var, iac0Var, xaj1Var, bjx0Var);
                break;
            default:
                teq teqVar3 = ((thq) i1qVar.b).c;
                yiq yiqVar = teqVar3.b;
                teq teqVar4 = yiqVar.b;
                xfx xfxVar2 = (xfx) teqVar4.q1.get();
                ssf1 ssf1Var2 = (ssf1) teqVar4.g6.get();
                daq daqVar2 = yiqVar.a;
                ggx ggxVarP2 = d1j1.p(xfxVar2, ssf1Var2, (woa) daqVar2.W8.get(), (kma) daqVar2.Od.get(), (fpa) daqVar2.X8.get(), (lzn0) teqVar4.i.get(), (a6z) yiqVar.B.get(), (i4q) teqVar4.t2.get(), (zr00) daqVar2.f9.get(), (yh2) teqVar4.f3.get());
                j1q j1qVar2 = (j1q) teqVar3.b.L0.get();
                ziq ziqVar = teqVar3.a;
                cfq cfqVar2 = (cfq) ziqVar.Z1.get();
                h5q h5qVar2 = (h5q) teqVar3.db.get();
                u63Var = new u63(ggxVarP2, j1qVar2, cfqVar2, h5qVar2, teqVar3.Ac, (a3u0) teqVar3.Cc.get(), i8h1Var, lik1Var, muzVar, tgt0Var, iac0Var, xaj1Var, bjx0Var);
                break;
        }
        return new sma1((yfx) this.e, u63Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(onm onmVar) {
        lqh1 lqh1Var;
        if (onmVar instanceof lqh1) {
            lqh1Var = (lqh1) onmVar;
            int i = lqh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lqh1Var.c = i - Integer.MIN_VALUE;
            } else {
                lqh1Var = new lqh1(this, onmVar);
            }
        } else {
            lqh1Var = new lqh1(this, onmVar);
        }
        Object objI = lqh1Var.a;
        int i2 = lqh1Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarA = ((b7n) this.a).a(k6n.a);
            lqh1Var.c = 1;
            objI = b5p1.i(mr20VarA, lqh1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return wzu.a((Context) this.d, ((Number) objI).intValue());
    }

    public ykg1 f(x0k0 x0k0Var) {
        phc byteString;
        cbk0 cbk0Var = (cbk0) this.b;
        String str = cbk0Var.a;
        String str2 = cbk0Var.b.b;
        lhg1 lhg1Var = x0k0Var.a;
        if (lhg1Var != null) {
            wl61 wl61VarN = SetTransition.n();
            wl61VarN.r(kkg1.c(lhg1Var));
            lhg1 lhg1Var2 = x0k0Var.c;
            if (lhg1Var2 != null) {
                wl61VarN.s(kkg1.c(lhg1Var2));
            } else {
                wl61VarN.n(kkg1.c(x0k0Var.d));
            }
            byteString = wl61VarN.build().toByteString();
        } else {
            byteString = null;
        }
        return new ykg1(str, str2, byteString);
    }

    public Object g(ykg1 ykg1Var, onm onmVar) {
        return ((iyc0) this.c).t(ykg1Var.a, ykg1Var.b, "set-transition", ykg1Var.c, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(onm onmVar) throws Throwable {
        nqh1 nqh1Var;
        int iIntValue;
        alg1 alg1Var;
        int i;
        int i2;
        Throwable th;
        Object objJ;
        EsOffline$BulkRedownloadStartResponse m231Var;
        Throwable thA;
        EsOffline$BulkRedownloadStartResponse esOffline$BulkRedownloadStartResponse;
        kt91 kt91Var = (kt91) this.c;
        if (onmVar instanceof nqh1) {
            nqh1Var = (nqh1) onmVar;
            int i3 = nqh1Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nqh1Var.f = i3 - Integer.MIN_VALUE;
            } else {
                nqh1Var = new nqh1(this, onmVar);
            }
        } else {
            nqh1Var = new nqh1(this, onmVar);
        }
        Object objI = nqh1Var.d;
        int i4 = nqh1Var.f;
        d9n d9nVar = d9n.a;
        try {
            if (i4 == 0) {
                hm5.M(objI);
                mr20 mr20VarA = ((b7n) this.a).a(k6n.a);
                nqh1Var.f = 1;
                objI = b5p1.i(mr20VarA, nqh1Var);
                if (objI != d9nVar) {
                }
                return d9nVar;
            }
            if (i4 == 1) {
                hm5.M(objI);
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = nqh1Var.a;
                    try {
                        hm5.M(objI);
                        m231Var = (EsOffline$BulkRedownloadStartResponse) objI;
                    } catch (Throwable th2) {
                        th = th2;
                        m231Var = new m231(th);
                    }
                    thA = e331.a(m231Var);
                    if (thA != null) {
                        if (thA instanceof CancellationException) {
                            throw thA;
                        }
                        Logger.e(thA, "UpdateDownloadsController: start failed", new Object[0]);
                    }
                    esOffline$BulkRedownloadStartResponse = m231Var instanceof m231 ? null : m231Var;
                    if (esOffline$BulkRedownloadStartResponse == null && esOffline$BulkRedownloadStartResponse.n()) {
                        Context context = (Context) this.d;
                        wzu.d(kt91Var, context.getString(2131953024, wzu.a(context, i2)));
                    } else {
                        wzu.c(kt91Var);
                    }
                    return rih1.a;
                }
                i = nqh1Var.b;
                int i5 = nqh1Var.a;
                alg1Var = nqh1Var.c;
                try {
                    hm5.M(objI);
                    iIntValue = i5;
                    Single map = ((vpp0) alg1Var.b).callSingle("spotify.offline_esperanto.proto.Offline", "BulkRedownloadStart", Empty.n()).map(qs10.U0);
                    nqh1Var.c = null;
                    nqh1Var.a = iIntValue;
                    nqh1Var.b = i;
                    nqh1Var.f = 3;
                    objJ = fc11.j(map, nqh1Var);
                    if (objJ != d9nVar) {
                        i2 = iIntValue;
                        objI = objJ;
                        m231Var = (EsOffline$BulkRedownloadStartResponse) objI;
                        thA = e331.a(m231Var);
                        if (thA != null) {
                            if (thA instanceof CancellationException) {
                                throw thA;
                            }
                            Logger.e(thA, "UpdateDownloadsController: start failed", new Object[0]);
                        }
                        esOffline$BulkRedownloadStartResponse = m231Var instanceof m231 ? null : m231Var;
                        if (esOffline$BulkRedownloadStartResponse == null) {
                            wzu.c(kt91Var);
                        } else {
                            wzu.c(kt91Var);
                        }
                        return rih1.a;
                    }
                    return d9nVar;
                } catch (Throwable th3) {
                    th = th3;
                    i2 = i5;
                    m231Var = new m231(th);
                }
            }
            Single map2 = ((vpp0) this.b).callSingle("spotify.offline_esperanto.proto.Offline", "BulkRedownloadCancel", Empty.n()).map(sl10.V0);
            nqh1Var.c = this;
            nqh1Var.a = iIntValue;
            nqh1Var.b = 0;
            nqh1Var.f = 2;
            if (fc11.j(map2, nqh1Var) != d9nVar) {
                alg1Var = this;
                i = 0;
                Single map3 = ((vpp0) alg1Var.b).callSingle("spotify.offline_esperanto.proto.Offline", "BulkRedownloadStart", Empty.n()).map(qs10.U0);
                nqh1Var.c = null;
                nqh1Var.a = iIntValue;
                nqh1Var.b = i;
                nqh1Var.f = 3;
                objJ = fc11.j(map3, nqh1Var);
                if (objJ != d9nVar) {
                    i2 = iIntValue;
                    objI = objJ;
                    m231Var = (EsOffline$BulkRedownloadStartResponse) objI;
                    thA = e331.a(m231Var);
                    if (thA != null) {
                        if (thA instanceof CancellationException) {
                            throw thA;
                        }
                        Logger.e(thA, "UpdateDownloadsController: start failed", new Object[0]);
                    }
                    esOffline$BulkRedownloadStartResponse = m231Var instanceof m231 ? null : m231Var;
                    if (esOffline$BulkRedownloadStartResponse == null) {
                        wzu.c(kt91Var);
                    } else {
                        wzu.c(kt91Var);
                    }
                    return rih1.a;
                }
            }
            return d9nVar;
        } catch (Throwable th4) {
            i2 = iIntValue;
            th = th4;
            m231Var = new m231(th);
        }
        iIntValue = ((Number) objI).intValue();
    }

    public void i(qeh1 qeh1Var) {
        ffl1 ffl1VarH;
        Application application = (Application) this.a;
        if (b()) {
            n57.e("WazeSdkWrapper has already been started!");
            return;
        }
        bih1 bih1Var = new bih1();
        bih1Var.b = ((tfl1) this.c).a(application);
        bih1Var.c = Integer.valueOf(application.getColor(2131101551));
        t8r0 t8r0Var = new t8r0();
        t8r0Var.a = (PendingIntent) bih1Var.b;
        t8r0Var.b = (Integer) bih1Var.c;
        qpj1 qpj1Var = new qpj1(qeh1Var);
        lxh1 lxh1Var = (lxh1) this.b;
        try {
            ffl1VarH = ffl1.h(application, t8r0Var, qpj1Var);
        } catch (IllegalStateException unused) {
            ffl1VarH = null;
        }
        lxh1Var.b = ffl1VarH;
        if (ffl1VarH != null) {
            ffl1VarH.j = qpj1Var;
            ffl1VarH.p();
        }
        ffl1 ffl1Var = (ffl1) lxh1Var.b;
        if (ffl1Var != null) {
            ffl1Var.e();
        }
        this.e = qpj1Var;
    }

    public nwo1 j(xnn1 xnn1Var, long j) {
        return new nwo1(22, new mug(this, xnn1Var, j, (lnm) null, (byte) 13), (Integer) null);
    }

    public void stop() {
        if (!b()) {
            n57.e("Trying to stop WazeSdkWrapper which hasn't been started yet!");
            return;
        }
        ffl1 ffl1Var = (ffl1) ((lxh1) this.b).b;
        if (ffl1Var != null) {
            ffl1Var.f(5);
        }
        this.e = null;
        ((rku) this.f).a();
    }

    public alg1(exo1 exo1Var, brk1 brk1Var, fqn1 fqn1Var, qeh1 qeh1Var, x15 x15Var) {
        this.a = exo1Var;
        this.b = brk1Var;
        this.c = fqn1Var;
        this.f = qeh1Var;
        this.d = x15Var;
    }

    public alg1(lzn0 lzn0Var, cbk0 cbk0Var, iyc0 iyc0Var, kkg1 kkg1Var, cdk0 cdk0Var, h9k0 h9k0Var, fgk0 fgk0Var) {
        this.a = lzn0Var;
        this.b = cbk0Var;
        this.c = iyc0Var;
        this.d = cdk0Var;
        this.e = h9k0Var;
        this.f = fgk0Var;
    }

    public alg1(b7n b7nVar, vpp0 vpp0Var, kt91 kt91Var, Context context, pob pobVar) {
        this.a = b7nVar;
        this.b = vpp0Var;
        this.c = kt91Var;
        this.d = context;
    }

    public /* synthetic */ alg1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }
}
