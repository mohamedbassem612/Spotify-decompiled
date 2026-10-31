package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.marquee.marquee.MarqueeActivity;
import com.spotify.player.model.PlayOrigin;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.tap.go.service.GoBluetoothService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;
import spotify.playlist.esperanto.proto.PlaylistOfflineRequest;
import spotify.playlist.esperanto.proto.PlaylistQuery;
import spotify.playlist.esperanto.proto.d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uw0 implements dl4, o8g1, lw40 {
    public Object N0;
    public Object O0;
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    public uw0(k5z k5zVar, o5z o5zVar) {
        this.a = (byte) 5;
        this.d = o5zVar;
        this.e = k5zVar;
        this.f = xqu.b(new lbp(this, 2, (byte) 22));
        this.g = xqu.b(new lbp(this, 1, (byte) 22));
        this.h = xqu.b(iy81.a(new lbp(this, 3, (byte) 22)));
        this.i = xqu.b(new lbp(this, 6, (byte) 22));
        this.t = xqu.b(new lbp(this, 8, (byte) 22));
        this.X = xqu.b(new lbp(this, 9, (byte) 22));
        this.c = xqu.b(iy81.a(new lbp(this, 7, (byte) 22)));
        this.Y = xqu.b(new lbp(this, 10, (byte) 22));
        this.Z = xqu.b(new lbp(this, 5, (byte) 22));
        this.b = xqu.b(iy81.a(new lbp(this, 4, (byte) 22)));
        this.N0 = xqu.b(iy81.a(new lbp(this, 11, (byte) 22)));
        this.O0 = xqu.b(new lbp(this, 0, (byte) 22));
    }

    public static void q(View view, Object obj, iu30 iu30Var) {
        int i;
        if (obj != null) {
            iu30Var.invoke(obj);
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public cbr0 A() {
        return (cbr0) ((jly0) this.g).get();
    }

    public pis0 B() {
        xgi1 xgi1Var = (xgi1) this.d;
        lzn0 lzn0VarB = xgi1Var.b();
        c8o.l(lzn0VarB);
        js6 js6Var = (js6) xgi1Var.j.get();
        c8o.l(js6Var);
        i4q i4qVar = (i4q) xgi1Var.m.get();
        c8o.l(i4qVar);
        yhm yhmVar = (yhm) xgi1Var.l.get();
        c8o.l(yhmVar);
        em6 em6Var = (em6) xgi1Var.k.get();
        c8o.l(em6Var);
        ssf1 ssf1Var = (ssf1) xgi1Var.i.get();
        c8o.l(ssf1Var);
        return new pis0(lzn0VarB, js6Var, i4qVar, yhmVar, em6Var, ssf1Var, x(), v());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        if (r6 == r13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        if (r6 == r13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object C(p.qtu r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, p.tv80 r23, p.g3d0 r24, p.onm r25) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uw0.C(p.qtu, java.lang.String, boolean, boolean, boolean, boolean, p.tv80, p.g3d0, p.onm):java.lang.Object");
    }

    public ytp0 D() {
        xgi1 xgi1Var = (xgi1) this.d;
        Scheduler scheduler = (Scheduler) xgi1Var.b.get();
        c8o.l(scheduler);
        Flowable flowable = (Flowable) xgi1Var.r.get();
        c8o.l(flowable);
        return new ytp0((Object) scheduler, (Object) flowable, (Object) ((cyp) ((jly0) this.i).get()).d(), (Object) PlayOrigin.create("listeningstatsdetails"), (Object) ((cyp) ((jly0) this.i).get()).a(), (byte) 13);
    }

    public aru0 E() {
        daq daqVar = (daq) this.e;
        return new aru0((uwh) daqVar.Wq.get(), (gw70) daqVar.d8.get(), (q8n) daqVar.V2.get(), (byte) 13);
    }

    public vqv0 F() {
        Flowable flowable = (Flowable) ((jly0) this.t).get();
        FlowableMap flowableMapD = f2u0.D((Flowable) ((jly0) this.t).get());
        h991 h991Var = (h991) ((tbz0) this.d).w.get();
        c8o.l(h991Var);
        return new vqv0(new bs0(flowable, flowableMapD, h991Var, xqu.a((ykq) this.X)), (byte) 11);
    }

    public kdy0 G() {
        tbz0 tbz0Var = (tbz0) this.d;
        u4q0 u4q0Var = (u4q0) tbz0Var.i.get();
        c8o.l(u4q0Var);
        am30 am30Var = (am30) tbz0Var.T.get();
        c8o.l(am30Var);
        q8n q8nVar = (q8n) tbz0Var.L.get();
        c8o.l(q8nVar);
        a1r0 a1r0Var = (a1r0) tbz0Var.f.get();
        c8o.l(a1r0Var);
        return new kdy0((Object) u4q0Var, (Object) am30Var, (Object) q8nVar, (Object) a1r0Var, (byte) 6);
    }

    public pux0 H() {
        i8h1 i8h1Var = (i8h1) ((v001) this.d).o.get();
        c8o.l(i8h1Var);
        return new pux0(i8h1Var);
    }

    public Resources I() {
        Context context = (Context) ((tbz0) this.d).a.get();
        c8o.l(context);
        Resources resources = context.getResources();
        c8o.m(resources);
        return resources;
    }

    public gp41 J() {
        int iOrdinal = ((zdb) this.e).Z0().ordinal();
        if (iOrdinal == 0) {
            return gp41.i;
        }
        if (iOrdinal == 1) {
            return gp41.t;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(il51 il51Var, onm onmVar) {
        xtc1 xtc1Var;
        Boolean m231Var;
        if (onmVar instanceof xtc1) {
            xtc1Var = (xtc1) onmVar;
            int i = xtc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xtc1Var.c = i - Integer.MIN_VALUE;
            } else {
                xtc1Var = new xtc1(this, onmVar);
            }
        } else {
            xtc1Var = new xtc1(this, onmVar);
        }
        Object objL = xtc1Var.a;
        int i2 = xtc1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                Set set = s4b1.f;
                if (uic.j((String) this.g, nyu0.e)) {
                    xtc1Var.c = 1;
                    objL = L(il51Var, xtc1Var);
                    d9n d9nVar = d9n.a;
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
            m231Var = (Boolean) objL;
            m231Var.getClass();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Assisted Curation: failed to load suggested prompts: %s", new Object[]{thA.getMessage()});
        }
        Boolean bool = Boolean.FALSE;
        if (m231Var instanceof m231) {
            m231Var = bool;
        }
        boolean z = m231Var.booleanValue();
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(il51 il51Var, onm onmVar) {
        ytc1 ytc1Var;
        if (onmVar instanceof ytc1) {
            ytc1Var = (ytc1) onmVar;
            int i = ytc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytc1Var.d = i - Integer.MIN_VALUE;
            } else {
                ytc1Var = new ytc1(this, onmVar);
            }
        } else {
            ytc1Var = new ytc1(this, onmVar);
        }
        Object objI = ytc1Var.b;
        int i2 = ytc1Var.d;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarG = yoi1.g(((xvo) this.h).a(true));
            ytc1Var.a = il51Var;
            ytc1Var.d = 1;
            objI = b5p1.i(ezcVarG, ytc1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            il51Var = ytc1Var.a;
            hm5.M(objI);
        }
        boolean zBooleanValue = ((Boolean) objI).booleanValue();
        dlg1 dlg1Var = (dlg1) this.i;
        List list = il51Var.e;
        boolean z2 = il51Var.h.f;
        boolean z3 = il51Var.j;
        int i3 = il51Var.l;
        Set set = il51Var.m;
        Map map = il51Var.f;
        if (zBooleanValue || !z3 || !list.contains("UPDATE_PROMPT") || !z2 || !dlg1Var.q(zbh1.b) || (i3 != 0 && !set.contains(dlc0.d) && ((zb91) dlg1Var.a).f(map).isEmpty())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public hj91 M() {
        tbz0 tbz0Var = (tbz0) this.d;
        tp91 tp91Var = (tp91) tbz0Var.u.get();
        c8o.l(tp91Var);
        u3q u3qVar = (u3q) tbz0Var.v.get();
        c8o.l(u3qVar);
        nn61 nn61VarA = u3qVar.a();
        dg30 dg30Var = (dg30) tbz0Var.b.get();
        c8o.l(dg30Var);
        return j991.A(tp91Var, nn61VarA, new mlw0((Object) dg30Var, (byte) 13));
    }

    public FlowableFilter N() {
        return ((Flowable) ((daq) this.e).D5.get()).x(qs10.b1);
    }

    public int O() {
        int i = ((bii1) this.e).a;
        if (i == 1) {
            return 2131963609;
        }
        if (i == 2) {
            return 2131963610;
        }
        if (i == 3) {
            return 2131963608;
        }
        if (i == 5) {
            return 2131963596;
        }
        if (i == 6) {
            return 2131963597;
        }
        if (i == 7) {
            return 2131963598;
        }
        if (i == 10) {
            return 2131963607;
        }
        n57.s("Unknown details type, defaulting to time listened. DetailsType: " + i);
        return 2131963609;
    }

    public jqd0 P() {
        daq daqVar = (daq) this.e;
        return new jqd0((zuf) daqVar.Dr.get(), (uu00) daqVar.a5.get(), f2u0.f((Flowable) ((jly0) this.h).get()), d().b());
    }

    public v8f1 Q() {
        gw70 gw70VarB = ((zuj) this.f).b();
        c8o.l(gw70VarB);
        xgi1 xgi1Var = (xgi1) this.d;
        lzn0 lzn0VarB = xgi1Var.b();
        c8o.l(lzn0VarB);
        js6 js6Var = (js6) xgi1Var.j.get();
        c8o.l(js6Var);
        i4q i4qVar = (i4q) xgi1Var.m.get();
        c8o.l(i4qVar);
        yhm yhmVar = (yhm) xgi1Var.l.get();
        c8o.l(yhmVar);
        em6 em6Var = (em6) xgi1Var.k.get();
        c8o.l(em6Var);
        fg60 fg60VarA = xgi1Var.a();
        c8o.l(fg60VarA);
        return new v8f1(gw70VarB, lzn0VarB, js6Var, i4qVar, yhmVar, em6Var, fg60VarA, x(), B(), v());
    }

    public pis0 R() {
        gw70 gw70VarB = ((zuj) this.f).b();
        c8o.l(gw70VarB);
        ytp0 ytp0VarD = D();
        xgi1 xgi1Var = (xgi1) this.d;
        ssf1 ssf1Var = (ssf1) xgi1Var.i.get();
        c8o.l(ssf1Var);
        lzn0 lzn0VarB = xgi1Var.b();
        c8o.l(lzn0VarB);
        q8n q8nVar = (q8n) xgi1Var.e.get();
        c8o.l(q8nVar);
        gff1 gff1Var = new gff1(ytp0VarD, ssf1Var, lzn0VarB, q8nVar);
        ytp0 ytp0VarD2 = D();
        kly0 kly0Var = xgi1Var.d;
        q8n q8nVar2 = (q8n) kly0Var.get();
        c8o.l(q8nVar2);
        iff1 iff1Var = new iff1(ytp0VarD2, q8nVar2, (byte) 0);
        fg60 fg60VarA = xgi1Var.a();
        c8o.l(fg60VarA);
        q8n q8nVar3 = (q8n) kly0Var.get();
        c8o.l(q8nVar3);
        qn qnVar = new qn(fg60VarA, q8nVar3, (byte) 9);
        zc80 zc80VarV = v();
        q8n q8nVar4 = (q8n) kly0Var.get();
        c8o.l(q8nVar4);
        qn qnVar2 = new qn(zc80VarV, q8nVar4, (byte) 10);
        l6m0 l6m0VarX = x();
        fg60 fg60VarA2 = xgi1Var.a();
        c8o.l(fg60VarA2);
        return new pis0(gw70VarB, gff1Var, iff1Var, qnVar, qnVar2, l6m0VarX, fg60VarA2, B());
    }

    public dlg1 S() {
        i8h1 i8h1Var = (i8h1) ((nh20) this.d).t.get();
        c8o.l(i8h1Var);
        sfs sfsVar = (sfs) ((jly0) this.t).get();
        n6r0 n6r0VarP = kmq0.p((mh20) this.e);
        return new dlg1(i8h1Var, sfsVar, new fjl0(n6r0VarP.a(), n6r0VarP.path(), (byte) 28));
    }

    public stc1 T(String str, j2i j2iVar) {
        Context context = (Context) this.d;
        return new stc1(str, context.getString(2131952481), new utc1(context.getString(2131952494), new fjc1(this, (byte) 5)), j2iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, onm onmVar) {
        stu stuVar;
        if (onmVar instanceof stu) {
            stuVar = (stu) onmVar;
            int i = stuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                stuVar.c = i - Integer.MIN_VALUE;
            } else {
                stuVar = new stu(this, onmVar);
            }
        } else {
            stuVar = new stu(this, onmVar);
        }
        Object objJ = stuVar.a;
        int i2 = stuVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            r5h r5hVar = (r5h) this.t;
            c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
            c0hVarQ.r(str);
            Single map = r5hVar.a(c0hVarQ.build()).map(bbn.Z0);
            stuVar.c = 1;
            objJ = fc11.j(map, stuVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public eh4 b() {
        tbz0 tbz0Var = (tbz0) this.d;
        tgp0 tgp0Var = (tgp0) tbz0Var.D.get();
        c8o.l(tgp0Var);
        luk lukVar = (luk) tbz0Var.C.get();
        c8o.l(lukVar);
        return new eh4(tgp0Var, lukVar);
    }

    public ki4 c() {
        return new ki4(true, true, true, true, false, false, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, false, false, (luk) ((daq) this.e).L1.get());
    }

    public ri4 d() {
        return new ri4((luk) ((daq) this.e).L1.get());
    }

    public vu4 e() {
        return new vu4(false, false, false, (luk) ((daq) this.e).L1.get());
    }

    public k1i f() {
        aeb aebVar = (aeb) this.d;
        ohv0 ohv0Var = (ohv0) aebVar.c.get();
        c8o.l(ohv0Var);
        i8h1 i8h1Var = (i8h1) aebVar.m.get();
        c8o.l(i8h1Var);
        kg0 kg0Var = (kg0) aebVar.e.get();
        c8o.l(kg0Var);
        mwn0 mwn0Var = (mwn0) aebVar.n.get();
        c8o.l(mwn0Var);
        gp41 gp41VarJ = J();
        g1f0 g1f0VarA = aebVar.a();
        c8o.l(g1f0VarA);
        Activity activity = (Activity) aebVar.h.a;
        c8o.l(activity);
        return new k1i(ohv0Var, i8h1Var, kg0Var, mwn0Var, gp41VarJ, g1f0VarA, activity);
    }

    public vd01 g() {
        cbr0 cbr0Var = (cbr0) ((jly0) this.g).get();
        wd01 wd01Var = (wd01) this.d;
        a8e0 a8e0VarA = wd01Var.a();
        c8o.l(a8e0VarA);
        gw70 gw70VarB = wd01Var.b();
        c8o.l(gw70VarB);
        pe peVarH = wd01Var.h();
        c8o.l(peVarH);
        c8o.l(wd01Var.f());
        hvj hvjVar = new hvj(a8e0VarA, new q3b1(gw70VarB, peVarH));
        xd01 xd01Var = (xd01) this.e;
        ka8 ka8Var = (ka8) wd01Var.a.get();
        c8o.l(ka8Var);
        kly0 kly0Var = wd01Var.c;
        w5b1 w5b1Var = (w5b1) kly0Var.get();
        c8o.l(w5b1Var);
        q8n q8nVar = (q8n) wd01Var.g.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) wd01Var.h.get();
        c8o.l(q8nVar2);
        ed01 ed01Var = new ed01(ka8Var, w5b1Var, q8nVar, q8nVar2);
        w5b1 w5b1Var2 = (w5b1) kly0Var.get();
        c8o.l(w5b1Var2);
        lzn0 lzn0Var = (lzn0) wd01Var.b.get();
        c8o.l(lzn0Var);
        hwb hwbVar = new hwb((byte) 0);
        qe01 qe01Var = (qe01) ((jly0) this.h).get();
        he01 he01Var = new he01((qe01) ((jly0) this.h).get(), (byte) 1);
        he01 he01Var2 = new he01((qe01) ((jly0) this.h).get(), (byte) 0);
        ngs0 ngs0Var = new ngs0((gc01) ((jly0) this.i).get());
        gc01 gc01Var = (gc01) ((jly0) this.i).get();
        nl9 nl9Var = new nl9((td01) ((jly0) this.t).get(), new vun((knq) ((jly0) this.Y).get(), (byte) 4), new lqc((lnq) ((jly0) this.Z).get(), (byte) 5), (d0r) ((jly0) this.b).get(), (mz10) ((jly0) this.N0).get(), (ygt0) ((jly0) this.c).get());
        td01 td01Var = (td01) ((jly0) this.t).get();
        mr20 mr20Var = (mr20) wd01Var.f.get();
        c8o.l(mr20Var);
        m4e0 m4e0Var = new m4e0(mr20Var, (byte) 20);
        sfz sfzVar = (sfz) wd01Var.e.get();
        c8o.l(sfzVar);
        gb01 gb01Var = (gb01) wd01Var.k.get();
        c8o.l(gb01Var);
        return new vd01(cbr0Var, hvjVar, xd01Var, ed01Var, w5b1Var2, lzn0Var, hwbVar, qe01Var, he01Var, he01Var2, ngs0Var, gc01Var, nl9Var, td01Var, m4e0Var, sfzVar, gb01Var, (d0r) ((jly0) this.b).get(), (mnq) ((jly0) this.O0).get());
    }

    public toj0 h() {
        return new toj0((uwh) ((daq) this.e).Wq.get(), new lvc1((Flowable) ((jly0) this.i).get(), f2u0.D((Flowable) ((jly0) this.h).get())), (iac0) ((jly0) this.t).get());
    }

    public oi i() {
        daq daqVar = (daq) this.e;
        return new oi((b5s0) daqVar.Rr.get(), (q8n) daqVar.r2.get(), d().b(), (byte) 13);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0366  */
    /* JADX WARN: Code duplicated, block: B:102:0x0370  */
    /* JADX WARN: Code duplicated, block: B:104:0x0373  */
    /* JADX WARN: Code duplicated, block: B:105:0x0376  */
    /* JADX WARN: Code duplicated, block: B:107:0x037a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0381  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:130:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0416  */
    /* JADX WARN: Code duplicated, block: B:137:0x0446  */
    /* JADX WARN: Code duplicated, block: B:139:0x0449 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:141:0x044b  */
    /* JADX WARN: Code duplicated, block: B:143:0x044f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:144:0x0450  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x020f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0227  */
    /* JADX WARN: Code duplicated, block: B:67:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0245  */
    /* JADX WARN: Code duplicated, block: B:75:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0287  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0312  */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    /* JADX WARN: Code duplicated, block: B:90:0x032d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0354  */
    /* JADX WARN: Code duplicated, block: B:97:0x035a  */
    public Object j(qtu qtuVar, String str, boolean z, boolean z2, boolean z3, g3d0 g3d0Var, tv80 tv80Var, onm onmVar) {
        ttu ttuVar;
        qtu qtuVar2;
        int i;
        pp31 pp31Var;
        int i2;
        py21 oy21Var;
        String str2;
        boolean z4;
        tv80 tv80Var2;
        Object objC;
        qtu qtuVar3;
        int i3;
        qtu qtuVar4;
        g3d0 g3d0Var2;
        String str3;
        qtu qtuVar5;
        tv80 tv80Var3;
        boolean z5;
        boolean z6;
        int i4;
        Object objR;
        qtu qtuVar6;
        int i5;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        String str4;
        int i8;
        int i9;
        g3d0 g3d0Var3;
        d9n d9nVar;
        qtu qtuVar7;
        qtu qtuVar8;
        int i10;
        int i11;
        int i12;
        upu0 upu0VarN;
        qtu qtuVar9;
        Object objH;
        d9n d9nVar2;
        int i13;
        qtu qtuVar10;
        String str5;
        int i14;
        py21 py21Var;
        int iOrdinal;
        int i15;
        xzj1 xzj1Var;
        String str6;
        Object objK;
        Object obj;
        String str7;
        orp0 orp0Var;
        int i16;
        int i17;
        boolean z9;
        boolean z10;
        boolean z11;
        orp0 orp0Var2;
        py21 py21Var2;
        py21 py21Var3;
        qtu qtuVar11 = qtuVar;
        boolean z12 = z;
        boolean z13 = z2;
        g3d0 g3d0Var4 = g3d0Var;
        pp31 pp31Var2 = (op31) this.g;
        if (onmVar instanceof ttu) {
            ttuVar = (ttu) onmVar;
            int i18 = ttuVar.O0;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                ttuVar.O0 = i18 - Integer.MIN_VALUE;
            } else {
                ttuVar = new ttu(this, onmVar);
            }
        } else {
            ttuVar = new ttu(this, onmVar);
        }
        ttu ttuVar2 = ttuVar;
        Object objG = ttuVar2.Z;
        int i19 = ttuVar2.O0;
        d9n d9nVar3 = d9n.a;
        switch (i19) {
            case 0:
                qtuVar2 = null;
                hm5.M(objG);
                i = (!z12 || z3 || z13) ? 0 : 1;
                if (i != 0) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(str);
                    v5b1 v5b1Var = s4b1VarX.d;
                    blc0 blc0Var = s4b1VarX.c;
                    if (blc0Var == blc0.g1) {
                        ttuVar2.a = qtuVar11;
                        ttuVar2.b = str;
                        ttuVar2.c = g3d0Var4;
                        ttuVar2.d = tv80Var;
                        ttuVar2.h = z12;
                        ttuVar2.i = z13;
                        ttuVar2.t = z3;
                        ttuVar2.X = i;
                        ttuVar2.Y = 0;
                        ttuVar2.O0 = 1;
                        Object objA = a(str, ttuVar2);
                        if (objA != d9nVar3) {
                            qtuVar3 = qtuVar11;
                            i3 = i;
                            objG = objA;
                            str2 = str;
                            z4 = z3;
                            tv80Var2 = tv80Var;
                            pp31Var = pp31Var2;
                            oy21Var = (py21) objG;
                            i = i3;
                            qtuVar11 = qtuVar3;
                            i2 = 0;
                            if (!(oy21Var instanceof oy21)) {
                                return oy21Var;
                            }
                            if (!z12) {
                                qtuVar4 = qtuVar11;
                                g3d0Var2 = g3d0Var4;
                                str3 = str2;
                                qtuVar5 = qtuVar2;
                                tv80Var3 = tv80Var2;
                                z5 = z12;
                                z6 = z4;
                                i4 = i;
                                if (z5) {
                                    i6 = i2;
                                } else {
                                    i6 = i2;
                                }
                                if (z5) {
                                }
                                i7 = 4;
                                if (qtuVar5 == null) {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                } else {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                }
                                xyc0 xyc0Var = (iyc0) this.e;
                                ttuVar2.a = qtuVar7;
                                ttuVar2.b = str3;
                                ttuVar2.c = qtuVar8;
                                ttuVar2.d = tv80Var3;
                                ttuVar2.e = qtuVar8;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                i11 = i4;
                                ttuVar2.X = i11;
                                i12 = i6;
                                ttuVar2.Y = i12;
                                ttuVar2.O0 = 5;
                                xyc0 xyc0Var2 = xyc0Var;
                                xyc0Var2.getClass();
                                upu0VarN = PlaylistOfflineRequest.n();
                                upu0VarN.r(str3);
                                if (z5) {
                                    d dVarY = PlaylistQuery.y();
                                    dVarY.getClass();
                                    mlu0.a(dVarY, g3d0Var3);
                                    upu0VarN.q(dVarY.build());
                                    upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                                } else {
                                    upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                                }
                                q8n q8nVar = xyc0Var2.c;
                                qtu qtuVar12 = qtuVar8;
                                n0a0 n0a0Var = new n0a0(xyc0Var2, upu0VarN, str3, qtuVar12, (byte) 13);
                                qtuVar9 = qtuVar12;
                                objH = c921.H(q8nVar, n0a0Var, ttuVar2);
                                d9nVar2 = d9nVar;
                                if (objH != d9nVar2) {
                                    objH = (py21) objH;
                                }
                                if (objH == d9nVar2) {
                                    return d9nVar2;
                                }
                                objG = objH;
                                i13 = i11;
                                qtuVar10 = qtuVar7;
                                str5 = str3;
                                i14 = i12;
                                py21Var = (py21) objG;
                                if (!(py21Var instanceof oy21)) {
                                    if (py21Var instanceof ly21) {
                                        return py21Var;
                                    }
                                    eg.o();
                                    return null;
                                }
                                drj0 drj0Var = (drj0) this.O0;
                                iOrdinal = qtuVar10.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = i10;
                                } else {
                                    if (iOrdinal != 1) {
                                        eg.o();
                                        return null;
                                    }
                                    i15 = i9;
                                }
                                drj0Var.j(str5, i15, z5);
                                if (i14 != 0) {
                                    xzj1Var = (xzj1) this.Y;
                                    ttuVar2.a = qtuVar9;
                                    ttuVar2.b = str5;
                                    ttuVar2.c = qtuVar9;
                                    ttuVar2.d = qtuVar9;
                                    ttuVar2.e = qtuVar9;
                                    ttuVar2.f = py21Var;
                                    ttuVar2.h = z5;
                                    ttuVar2.i = z13;
                                    ttuVar2.t = z6;
                                    ttuVar2.X = i13;
                                    ttuVar2.Y = i14;
                                    ttuVar2.O0 = 6;
                                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                                        return d9nVar2;
                                    }
                                    str6 = str5;
                                    str5 = str6;
                                }
                                ezc ezcVar = (ezc) this.X;
                                ttuVar2.a = qtuVar9;
                                ttuVar2.b = str5;
                                ttuVar2.c = qtuVar9;
                                ttuVar2.d = qtuVar9;
                                ttuVar2.e = qtuVar9;
                                ttuVar2.f = py21Var;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                ttuVar2.X = i13;
                                ttuVar2.Y = i14;
                                ttuVar2.O0 = 7;
                                objK = b5p1.k(ezcVar, ttuVar2);
                                if (objK == d9nVar2) {
                                    return d9nVar2;
                                }
                                String str8 = str5;
                                obj = objK;
                                str7 = str8;
                                orp0Var = (orp0) obj;
                                if (z5) {
                                }
                                py21Var2 = py21Var;
                                if (i13 != 0) {
                                    if (orp0Var == orp0.c) {
                                        ttuVar2.a = qtuVar9;
                                        ttuVar2.b = qtuVar9;
                                        ttuVar2.c = qtuVar9;
                                        ttuVar2.d = qtuVar9;
                                        ttuVar2.e = qtuVar9;
                                        ttuVar2.f = py21Var2;
                                        ttuVar2.g = qtuVar9;
                                        ttuVar2.h = z5;
                                        ttuVar2.i = z13;
                                        ttuVar2.t = z6;
                                        ttuVar2.X = i13;
                                        ttuVar2.Y = i14;
                                        ttuVar2.O0 = 9;
                                        objG = pp31Var.g(str7, ttuVar2);
                                        if (objG == d9nVar2) {
                                            return d9nVar2;
                                        }
                                        py21Var3 = py21Var2;
                                        py21Var2 = (py21) objG;
                                    } else {
                                        py21Var3 = py21Var2;
                                    }
                                    if (py21Var2 == null) {
                                        return py21Var3;
                                    }
                                }
                                return py21Var2;
                            }
                            ttuVar2.a = qtuVar11;
                            ttuVar2.b = str2;
                            ttuVar2.c = g3d0Var4;
                            ttuVar2.d = tv80Var2;
                            ttuVar2.h = z12;
                            ttuVar2.i = z13;
                            ttuVar2.t = z4;
                            ttuVar2.X = i;
                            ttuVar2.O0 = 3;
                            objR = r(str2, ttuVar2);
                            if (objR != d9nVar3) {
                                qtuVar6 = qtuVar11;
                                i5 = i;
                                objG = objR;
                                boolean z14 = z13;
                                z7 = z12;
                                z8 = z14;
                                boolean z15 = z4;
                                i4 = i5;
                                str3 = str2;
                                tv80Var3 = tv80Var2;
                                z5 = z7;
                                z13 = z8;
                                z6 = z15;
                                qtuVar4 = qtuVar6;
                                g3d0Var2 = g3d0Var4;
                                qtuVar5 = (rtu) objG;
                                if (z5 || qtuVar5 == null || !((rtu) qtuVar5).b || !((h9n0) this.b).b(str3)) {
                                    i6 = i2;
                                } else {
                                    i6 = 1;
                                }
                                if (z5 || i6 != 0) {
                                    i7 = 4;
                                } else {
                                    CompletableSubscribeOn completableSubscribeOnA = ((xyu) this.Z).a(((n6r0) this.N0).path(), str3, tv80Var3);
                                    ttuVar2.a = qtuVar4;
                                    ttuVar2.b = str3;
                                    ttuVar2.c = g3d0Var2;
                                    ttuVar2.d = tv80Var3;
                                    ttuVar2.e = qtuVar5;
                                    ttuVar2.h = z5;
                                    ttuVar2.i = z13;
                                    ttuVar2.t = z6;
                                    ttuVar2.X = i4;
                                    ttuVar2.Y = i6;
                                    i7 = 4;
                                    ttuVar2.O0 = 4;
                                    if (fc11.i(completableSubscribeOnA, ttuVar2) != d9nVar3) {
                                        int i20 = i6;
                                        str4 = str3;
                                        i8 = i20;
                                        String str9 = str4;
                                        i6 = i8;
                                        str3 = str9;
                                    }
                                }
                                if (qtuVar5 == null && ((rtu) qtuVar5).a) {
                                    kt91 kt91Var = (kt91) this.f;
                                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955086});
                                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{qtuVar2});
                                    i10 = 2;
                                    qtuVar8 = qtuVar2;
                                    qtuVar7 = qtuVar4;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    i9 = 4;
                                    kt91Var.k(new er91((fs91) null, "", 2131955086, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                                } else {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                }
                                xyc0 xyc0Var3 = (iyc0) this.e;
                                ttuVar2.a = qtuVar7;
                                ttuVar2.b = str3;
                                ttuVar2.c = qtuVar8;
                                ttuVar2.d = tv80Var3;
                                ttuVar2.e = qtuVar8;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                i11 = i4;
                                ttuVar2.X = i11;
                                i12 = i6;
                                ttuVar2.Y = i12;
                                ttuVar2.O0 = 5;
                                xyc0 xyc0Var4 = xyc0Var3;
                                xyc0Var4.getClass();
                                upu0VarN = PlaylistOfflineRequest.n();
                                upu0VarN.r(str3);
                                if (z5) {
                                    d dVarY2 = PlaylistQuery.y();
                                    dVarY2.getClass();
                                    mlu0.a(dVarY2, g3d0Var3);
                                    upu0VarN.q(dVarY2.build());
                                    upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                                } else {
                                    upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                                }
                                q8n q8nVar2 = xyc0Var4.c;
                                qtu qtuVar13 = qtuVar8;
                                n0a0 n0a0Var2 = new n0a0(xyc0Var4, upu0VarN, str3, qtuVar13, (byte) 13);
                                qtuVar9 = qtuVar13;
                                objH = c921.H(q8nVar2, n0a0Var2, ttuVar2);
                                d9nVar2 = d9nVar;
                                if (objH != d9nVar2) {
                                    objH = (py21) objH;
                                }
                                if (objH == d9nVar2) {
                                    return d9nVar2;
                                }
                                objG = objH;
                                i13 = i11;
                                qtuVar10 = qtuVar7;
                                str5 = str3;
                                i14 = i12;
                                py21Var = (py21) objG;
                                if (!(py21Var instanceof oy21)) {
                                    if (py21Var instanceof ly21) {
                                        return py21Var;
                                    }
                                    eg.o();
                                    return null;
                                }
                                drj0 drj0Var2 = (drj0) this.O0;
                                iOrdinal = qtuVar10.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = i10;
                                } else {
                                    if (iOrdinal != 1) {
                                        eg.o();
                                        return null;
                                    }
                                    i15 = i9;
                                }
                                drj0Var2.j(str5, i15, z5);
                                if (i14 != 0) {
                                    xzj1Var = (xzj1) this.Y;
                                    ttuVar2.a = qtuVar9;
                                    ttuVar2.b = str5;
                                    ttuVar2.c = qtuVar9;
                                    ttuVar2.d = qtuVar9;
                                    ttuVar2.e = qtuVar9;
                                    ttuVar2.f = py21Var;
                                    ttuVar2.h = z5;
                                    ttuVar2.i = z13;
                                    ttuVar2.t = z6;
                                    ttuVar2.X = i13;
                                    ttuVar2.Y = i14;
                                    ttuVar2.O0 = 6;
                                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                                        return d9nVar2;
                                    }
                                    str6 = str5;
                                    str5 = str6;
                                }
                                ezc ezcVar2 = (ezc) this.X;
                                ttuVar2.a = qtuVar9;
                                ttuVar2.b = str5;
                                ttuVar2.c = qtuVar9;
                                ttuVar2.d = qtuVar9;
                                ttuVar2.e = qtuVar9;
                                ttuVar2.f = py21Var;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                ttuVar2.X = i13;
                                ttuVar2.Y = i14;
                                ttuVar2.O0 = 7;
                                objK = b5p1.k(ezcVar2, ttuVar2);
                                if (objK == d9nVar2) {
                                    return d9nVar2;
                                }
                                String str10 = str5;
                                obj = objK;
                                str7 = str10;
                                orp0Var = (orp0) obj;
                                if (z5 || orp0Var != orp0.b) {
                                    py21Var2 = py21Var;
                                    if (i13 != 0 && orp0Var != null) {
                                        if (orp0Var == orp0.c) {
                                            ttuVar2.a = qtuVar9;
                                            ttuVar2.b = qtuVar9;
                                            ttuVar2.c = qtuVar9;
                                            ttuVar2.d = qtuVar9;
                                            ttuVar2.e = qtuVar9;
                                            ttuVar2.f = py21Var2;
                                            ttuVar2.g = qtuVar9;
                                            ttuVar2.h = z5;
                                            ttuVar2.i = z13;
                                            ttuVar2.t = z6;
                                            ttuVar2.X = i13;
                                            ttuVar2.Y = i14;
                                            ttuVar2.O0 = 9;
                                            objG = pp31Var.g(str7, ttuVar2);
                                            if (objG == d9nVar2) {
                                                return d9nVar2;
                                            }
                                            py21Var3 = py21Var2;
                                            py21Var2 = (py21) objG;
                                        } else {
                                            py21Var3 = py21Var2;
                                        }
                                        if (py21Var2 == null) {
                                            return py21Var3;
                                        }
                                    }
                                } else {
                                    hce1 hce1Var = (hce1) this.c;
                                    ttuVar2.a = qtuVar9;
                                    ttuVar2.b = str7;
                                    ttuVar2.c = qtuVar9;
                                    ttuVar2.d = qtuVar9;
                                    ttuVar2.e = qtuVar9;
                                    ttuVar2.f = py21Var;
                                    ttuVar2.g = orp0Var;
                                    ttuVar2.h = z5;
                                    ttuVar2.i = z13;
                                    ttuVar2.t = z6;
                                    ttuVar2.X = i13;
                                    ttuVar2.Y = i14;
                                    ttuVar2.O0 = 8;
                                    if (hce1Var.y(str7, ttuVar2) == d9nVar2) {
                                        return d9nVar2;
                                    }
                                    i16 = i14;
                                    i17 = i13;
                                    z9 = z6;
                                    z10 = z13;
                                    z11 = z5;
                                    orp0Var2 = orp0Var;
                                    orp0Var = orp0Var2;
                                    z5 = z11;
                                    z13 = z10;
                                    z6 = z9;
                                    i13 = i17;
                                    i14 = i16;
                                    py21Var2 = py21Var;
                                    if (i13 != 0) {
                                        if (orp0Var == orp0.c) {
                                            ttuVar2.a = qtuVar9;
                                            ttuVar2.b = qtuVar9;
                                            ttuVar2.c = qtuVar9;
                                            ttuVar2.d = qtuVar9;
                                            ttuVar2.e = qtuVar9;
                                            ttuVar2.f = py21Var2;
                                            ttuVar2.g = qtuVar9;
                                            ttuVar2.h = z5;
                                            ttuVar2.i = z13;
                                            ttuVar2.t = z6;
                                            ttuVar2.X = i13;
                                            ttuVar2.Y = i14;
                                            ttuVar2.O0 = 9;
                                            objG = pp31Var.g(str7, ttuVar2);
                                            if (objG == d9nVar2) {
                                                return d9nVar2;
                                            }
                                            py21Var3 = py21Var2;
                                            py21Var2 = (py21) objG;
                                        } else {
                                            py21Var3 = py21Var2;
                                        }
                                        if (py21Var2 == null) {
                                            return py21Var3;
                                        }
                                    }
                                }
                                return py21Var2;
                            }
                        }
                    } else {
                        pp31Var = pp31Var2;
                        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                                k220.g(blc0Var, " is not supported");
                                return null;
                            }
                        }
                        ttuVar2.a = qtuVar11;
                        ttuVar2.b = str;
                        ttuVar2.c = g3d0Var4;
                        ttuVar2.d = tv80Var;
                        ttuVar2.h = z12;
                        ttuVar2.i = z13;
                        ttuVar2.t = z3;
                        ttuVar2.X = i;
                        i2 = 0;
                        ttuVar2.Y = 0;
                        ttuVar2.O0 = 2;
                        objC = pp31Var.c(str, ttuVar2);
                        if (objC != d9nVar3) {
                            str2 = str;
                            z4 = z3;
                            tv80Var2 = tv80Var;
                            oy21Var = (py21) objC;
                            if (!(oy21Var instanceof oy21)) {
                                return oy21Var;
                            }
                            if (!z12) {
                                qtuVar4 = qtuVar11;
                                g3d0Var2 = g3d0Var4;
                                str3 = str2;
                                qtuVar5 = qtuVar2;
                                tv80Var3 = tv80Var2;
                                z5 = z12;
                                z6 = z4;
                                i4 = i;
                                if (z5) {
                                    i6 = i2;
                                } else {
                                    i6 = i2;
                                }
                                if (z5) {
                                }
                                i7 = 4;
                                if (qtuVar5 == null) {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                } else {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                }
                                xyc0 xyc0Var5 = (iyc0) this.e;
                                ttuVar2.a = qtuVar7;
                                ttuVar2.b = str3;
                                ttuVar2.c = qtuVar8;
                                ttuVar2.d = tv80Var3;
                                ttuVar2.e = qtuVar8;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                i11 = i4;
                                ttuVar2.X = i11;
                                i12 = i6;
                                ttuVar2.Y = i12;
                                ttuVar2.O0 = 5;
                                xyc0 xyc0Var6 = xyc0Var5;
                                xyc0Var6.getClass();
                                upu0VarN = PlaylistOfflineRequest.n();
                                upu0VarN.r(str3);
                                if (z5) {
                                    d dVarY3 = PlaylistQuery.y();
                                    dVarY3.getClass();
                                    mlu0.a(dVarY3, g3d0Var3);
                                    upu0VarN.q(dVarY3.build());
                                    upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                                } else {
                                    upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                                }
                                q8n q8nVar3 = xyc0Var6.c;
                                qtu qtuVar14 = qtuVar8;
                                n0a0 n0a0Var3 = new n0a0(xyc0Var6, upu0VarN, str3, qtuVar14, (byte) 13);
                                qtuVar9 = qtuVar14;
                                objH = c921.H(q8nVar3, n0a0Var3, ttuVar2);
                                d9nVar2 = d9nVar;
                                if (objH != d9nVar2) {
                                    objH = (py21) objH;
                                }
                                if (objH == d9nVar2) {
                                    return d9nVar2;
                                }
                                objG = objH;
                                i13 = i11;
                                qtuVar10 = qtuVar7;
                                str5 = str3;
                                i14 = i12;
                                py21Var = (py21) objG;
                                if (!(py21Var instanceof oy21)) {
                                    if (py21Var instanceof ly21) {
                                        return py21Var;
                                    }
                                    eg.o();
                                    return null;
                                }
                                drj0 drj0Var3 = (drj0) this.O0;
                                iOrdinal = qtuVar10.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = i10;
                                } else {
                                    if (iOrdinal != 1) {
                                        eg.o();
                                        return null;
                                    }
                                    i15 = i9;
                                }
                                drj0Var3.j(str5, i15, z5);
                                if (i14 != 0) {
                                    xzj1Var = (xzj1) this.Y;
                                    ttuVar2.a = qtuVar9;
                                    ttuVar2.b = str5;
                                    ttuVar2.c = qtuVar9;
                                    ttuVar2.d = qtuVar9;
                                    ttuVar2.e = qtuVar9;
                                    ttuVar2.f = py21Var;
                                    ttuVar2.h = z5;
                                    ttuVar2.i = z13;
                                    ttuVar2.t = z6;
                                    ttuVar2.X = i13;
                                    ttuVar2.Y = i14;
                                    ttuVar2.O0 = 6;
                                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                                        return d9nVar2;
                                    }
                                    str6 = str5;
                                    str5 = str6;
                                }
                                ezc ezcVar3 = (ezc) this.X;
                                ttuVar2.a = qtuVar9;
                                ttuVar2.b = str5;
                                ttuVar2.c = qtuVar9;
                                ttuVar2.d = qtuVar9;
                                ttuVar2.e = qtuVar9;
                                ttuVar2.f = py21Var;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                ttuVar2.X = i13;
                                ttuVar2.Y = i14;
                                ttuVar2.O0 = 7;
                                objK = b5p1.k(ezcVar3, ttuVar2);
                                if (objK == d9nVar2) {
                                    return d9nVar2;
                                }
                                String str11 = str5;
                                obj = objK;
                                str7 = str11;
                                orp0Var = (orp0) obj;
                                if (z5) {
                                }
                                py21Var2 = py21Var;
                                if (i13 != 0) {
                                    if (orp0Var == orp0.c) {
                                        ttuVar2.a = qtuVar9;
                                        ttuVar2.b = qtuVar9;
                                        ttuVar2.c = qtuVar9;
                                        ttuVar2.d = qtuVar9;
                                        ttuVar2.e = qtuVar9;
                                        ttuVar2.f = py21Var2;
                                        ttuVar2.g = qtuVar9;
                                        ttuVar2.h = z5;
                                        ttuVar2.i = z13;
                                        ttuVar2.t = z6;
                                        ttuVar2.X = i13;
                                        ttuVar2.Y = i14;
                                        ttuVar2.O0 = 9;
                                        objG = pp31Var.g(str7, ttuVar2);
                                        if (objG == d9nVar2) {
                                            return d9nVar2;
                                        }
                                        py21Var3 = py21Var2;
                                        py21Var2 = (py21) objG;
                                    } else {
                                        py21Var3 = py21Var2;
                                    }
                                    if (py21Var2 == null) {
                                        return py21Var3;
                                    }
                                }
                                return py21Var2;
                            }
                            ttuVar2.a = qtuVar11;
                            ttuVar2.b = str2;
                            ttuVar2.c = g3d0Var4;
                            ttuVar2.d = tv80Var2;
                            ttuVar2.h = z12;
                            ttuVar2.i = z13;
                            ttuVar2.t = z4;
                            ttuVar2.X = i;
                            ttuVar2.O0 = 3;
                            objR = r(str2, ttuVar2);
                            if (objR != d9nVar3) {
                                qtuVar6 = qtuVar11;
                                i5 = i;
                                objG = objR;
                                boolean z16 = z13;
                                z7 = z12;
                                z8 = z16;
                                boolean z17 = z4;
                                i4 = i5;
                                str3 = str2;
                                tv80Var3 = tv80Var2;
                                z5 = z7;
                                z13 = z8;
                                z6 = z17;
                                qtuVar4 = qtuVar6;
                                g3d0Var2 = g3d0Var4;
                                qtuVar5 = (rtu) objG;
                                if (z5) {
                                    i6 = i2;
                                } else {
                                    i6 = i2;
                                }
                                if (z5) {
                                }
                                i7 = 4;
                                if (qtuVar5 == null) {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                } else {
                                    i9 = i7;
                                    g3d0Var3 = g3d0Var2;
                                    d9nVar = d9nVar3;
                                    qtuVar7 = qtuVar4;
                                    qtuVar8 = qtuVar2;
                                    i10 = 2;
                                }
                                xyc0 xyc0Var7 = (iyc0) this.e;
                                ttuVar2.a = qtuVar7;
                                ttuVar2.b = str3;
                                ttuVar2.c = qtuVar8;
                                ttuVar2.d = tv80Var3;
                                ttuVar2.e = qtuVar8;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                i11 = i4;
                                ttuVar2.X = i11;
                                i12 = i6;
                                ttuVar2.Y = i12;
                                ttuVar2.O0 = 5;
                                xyc0 xyc0Var8 = xyc0Var7;
                                xyc0Var8.getClass();
                                upu0VarN = PlaylistOfflineRequest.n();
                                upu0VarN.r(str3);
                                if (z5) {
                                    d dVarY4 = PlaylistQuery.y();
                                    dVarY4.getClass();
                                    mlu0.a(dVarY4, g3d0Var3);
                                    upu0VarN.q(dVarY4.build());
                                    upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                                } else {
                                    upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                                }
                                q8n q8nVar4 = xyc0Var8.c;
                                qtu qtuVar15 = qtuVar8;
                                n0a0 n0a0Var4 = new n0a0(xyc0Var8, upu0VarN, str3, qtuVar15, (byte) 13);
                                qtuVar9 = qtuVar15;
                                objH = c921.H(q8nVar4, n0a0Var4, ttuVar2);
                                d9nVar2 = d9nVar;
                                if (objH != d9nVar2) {
                                    objH = (py21) objH;
                                }
                                if (objH == d9nVar2) {
                                    return d9nVar2;
                                }
                                objG = objH;
                                i13 = i11;
                                qtuVar10 = qtuVar7;
                                str5 = str3;
                                i14 = i12;
                                py21Var = (py21) objG;
                                if (!(py21Var instanceof oy21)) {
                                    if (py21Var instanceof ly21) {
                                        return py21Var;
                                    }
                                    eg.o();
                                    return null;
                                }
                                drj0 drj0Var4 = (drj0) this.O0;
                                iOrdinal = qtuVar10.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = i10;
                                } else {
                                    if (iOrdinal != 1) {
                                        eg.o();
                                        return null;
                                    }
                                    i15 = i9;
                                }
                                drj0Var4.j(str5, i15, z5);
                                if (i14 != 0) {
                                    xzj1Var = (xzj1) this.Y;
                                    ttuVar2.a = qtuVar9;
                                    ttuVar2.b = str5;
                                    ttuVar2.c = qtuVar9;
                                    ttuVar2.d = qtuVar9;
                                    ttuVar2.e = qtuVar9;
                                    ttuVar2.f = py21Var;
                                    ttuVar2.h = z5;
                                    ttuVar2.i = z13;
                                    ttuVar2.t = z6;
                                    ttuVar2.X = i13;
                                    ttuVar2.Y = i14;
                                    ttuVar2.O0 = 6;
                                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                                        return d9nVar2;
                                    }
                                    str6 = str5;
                                    str5 = str6;
                                }
                                ezc ezcVar4 = (ezc) this.X;
                                ttuVar2.a = qtuVar9;
                                ttuVar2.b = str5;
                                ttuVar2.c = qtuVar9;
                                ttuVar2.d = qtuVar9;
                                ttuVar2.e = qtuVar9;
                                ttuVar2.f = py21Var;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                ttuVar2.X = i13;
                                ttuVar2.Y = i14;
                                ttuVar2.O0 = 7;
                                objK = b5p1.k(ezcVar4, ttuVar2);
                                if (objK == d9nVar2) {
                                    return d9nVar2;
                                }
                                String str12 = str5;
                                obj = objK;
                                str7 = str12;
                                orp0Var = (orp0) obj;
                                if (z5) {
                                }
                                py21Var2 = py21Var;
                                if (i13 != 0) {
                                    if (orp0Var == orp0.c) {
                                        ttuVar2.a = qtuVar9;
                                        ttuVar2.b = qtuVar9;
                                        ttuVar2.c = qtuVar9;
                                        ttuVar2.d = qtuVar9;
                                        ttuVar2.e = qtuVar9;
                                        ttuVar2.f = py21Var2;
                                        ttuVar2.g = qtuVar9;
                                        ttuVar2.h = z5;
                                        ttuVar2.i = z13;
                                        ttuVar2.t = z6;
                                        ttuVar2.X = i13;
                                        ttuVar2.Y = i14;
                                        ttuVar2.O0 = 9;
                                        objG = pp31Var.g(str7, ttuVar2);
                                        if (objG == d9nVar2) {
                                            return d9nVar2;
                                        }
                                        py21Var3 = py21Var2;
                                        py21Var2 = (py21) objG;
                                    } else {
                                        py21Var3 = py21Var2;
                                    }
                                    if (py21Var2 == null) {
                                        return py21Var3;
                                    }
                                }
                                return py21Var2;
                            }
                        }
                    }
                } else {
                    pp31Var = pp31Var2;
                    i2 = 0;
                    oy21Var = new oy21(rih1.a);
                    str2 = str;
                    z4 = z3;
                    tv80Var2 = tv80Var;
                    if (!(oy21Var instanceof oy21)) {
                        return oy21Var;
                    }
                    if (!z12) {
                        qtuVar4 = qtuVar11;
                        g3d0Var2 = g3d0Var4;
                        str3 = str2;
                        qtuVar5 = qtuVar2;
                        tv80Var3 = tv80Var2;
                        z5 = z12;
                        z6 = z4;
                        i4 = i;
                        if (z5) {
                            i6 = i2;
                        } else {
                            i6 = i2;
                        }
                        if (z5) {
                        }
                        i7 = 4;
                        if (qtuVar5 == null) {
                            i9 = i7;
                            g3d0Var3 = g3d0Var2;
                            d9nVar = d9nVar3;
                            qtuVar7 = qtuVar4;
                            qtuVar8 = qtuVar2;
                            i10 = 2;
                        } else {
                            i9 = i7;
                            g3d0Var3 = g3d0Var2;
                            d9nVar = d9nVar3;
                            qtuVar7 = qtuVar4;
                            qtuVar8 = qtuVar2;
                            i10 = 2;
                        }
                        xyc0 xyc0Var9 = (iyc0) this.e;
                        ttuVar2.a = qtuVar7;
                        ttuVar2.b = str3;
                        ttuVar2.c = qtuVar8;
                        ttuVar2.d = tv80Var3;
                        ttuVar2.e = qtuVar8;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        i11 = i4;
                        ttuVar2.X = i11;
                        i12 = i6;
                        ttuVar2.Y = i12;
                        ttuVar2.O0 = 5;
                        xyc0 xyc0Var10 = xyc0Var9;
                        xyc0Var10.getClass();
                        upu0VarN = PlaylistOfflineRequest.n();
                        upu0VarN.r(str3);
                        if (z5) {
                            d dVarY5 = PlaylistQuery.y();
                            dVarY5.getClass();
                            mlu0.a(dVarY5, g3d0Var3);
                            upu0VarN.q(dVarY5.build());
                            upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                        } else {
                            upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                        }
                        q8n q8nVar5 = xyc0Var10.c;
                        qtu qtuVar16 = qtuVar8;
                        n0a0 n0a0Var5 = new n0a0(xyc0Var10, upu0VarN, str3, qtuVar16, (byte) 13);
                        qtuVar9 = qtuVar16;
                        objH = c921.H(q8nVar5, n0a0Var5, ttuVar2);
                        d9nVar2 = d9nVar;
                        if (objH != d9nVar2) {
                            objH = (py21) objH;
                        }
                        if (objH == d9nVar2) {
                            return d9nVar2;
                        }
                        objG = objH;
                        i13 = i11;
                        qtuVar10 = qtuVar7;
                        str5 = str3;
                        i14 = i12;
                        py21Var = (py21) objG;
                        if (!(py21Var instanceof oy21)) {
                            if (py21Var instanceof ly21) {
                                return py21Var;
                            }
                            eg.o();
                            return null;
                        }
                        drj0 drj0Var5 = (drj0) this.O0;
                        iOrdinal = qtuVar10.ordinal();
                        if (iOrdinal == 0) {
                            i15 = i10;
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            i15 = i9;
                        }
                        drj0Var5.j(str5, i15, z5);
                        if (i14 != 0) {
                            xzj1Var = (xzj1) this.Y;
                            ttuVar2.a = qtuVar9;
                            ttuVar2.b = str5;
                            ttuVar2.c = qtuVar9;
                            ttuVar2.d = qtuVar9;
                            ttuVar2.e = qtuVar9;
                            ttuVar2.f = py21Var;
                            ttuVar2.h = z5;
                            ttuVar2.i = z13;
                            ttuVar2.t = z6;
                            ttuVar2.X = i13;
                            ttuVar2.Y = i14;
                            ttuVar2.O0 = 6;
                            if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                                return d9nVar2;
                            }
                            str6 = str5;
                            str5 = str6;
                        }
                        ezc ezcVar5 = (ezc) this.X;
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = str5;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 7;
                        objK = b5p1.k(ezcVar5, ttuVar2);
                        if (objK == d9nVar2) {
                            return d9nVar2;
                        }
                        String str13 = str5;
                        obj = objK;
                        str7 = str13;
                        orp0Var = (orp0) obj;
                        if (z5) {
                        }
                        py21Var2 = py21Var;
                        if (i13 != 0) {
                            if (orp0Var == orp0.c) {
                                ttuVar2.a = qtuVar9;
                                ttuVar2.b = qtuVar9;
                                ttuVar2.c = qtuVar9;
                                ttuVar2.d = qtuVar9;
                                ttuVar2.e = qtuVar9;
                                ttuVar2.f = py21Var2;
                                ttuVar2.g = qtuVar9;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                ttuVar2.X = i13;
                                ttuVar2.Y = i14;
                                ttuVar2.O0 = 9;
                                objG = pp31Var.g(str7, ttuVar2);
                                if (objG == d9nVar2) {
                                    return d9nVar2;
                                }
                                py21Var3 = py21Var2;
                                py21Var2 = (py21) objG;
                            } else {
                                py21Var3 = py21Var2;
                            }
                            if (py21Var2 == null) {
                                return py21Var3;
                            }
                        }
                        return py21Var2;
                    }
                    ttuVar2.a = qtuVar11;
                    ttuVar2.b = str2;
                    ttuVar2.c = g3d0Var4;
                    ttuVar2.d = tv80Var2;
                    ttuVar2.h = z12;
                    ttuVar2.i = z13;
                    ttuVar2.t = z4;
                    ttuVar2.X = i;
                    ttuVar2.O0 = 3;
                    objR = r(str2, ttuVar2);
                    if (objR != d9nVar3) {
                        qtuVar6 = qtuVar11;
                        i5 = i;
                        objG = objR;
                        boolean z18 = z13;
                        z7 = z12;
                        z8 = z18;
                        boolean z19 = z4;
                        i4 = i5;
                        str3 = str2;
                        tv80Var3 = tv80Var2;
                        z5 = z7;
                        z13 = z8;
                        z6 = z19;
                        qtuVar4 = qtuVar6;
                        g3d0Var2 = g3d0Var4;
                        qtuVar5 = (rtu) objG;
                        if (z5) {
                            i6 = i2;
                        } else {
                            i6 = i2;
                        }
                        if (z5) {
                        }
                        i7 = 4;
                        if (qtuVar5 == null) {
                            i9 = i7;
                            g3d0Var3 = g3d0Var2;
                            d9nVar = d9nVar3;
                            qtuVar7 = qtuVar4;
                            qtuVar8 = qtuVar2;
                            i10 = 2;
                        } else {
                            i9 = i7;
                            g3d0Var3 = g3d0Var2;
                            d9nVar = d9nVar3;
                            qtuVar7 = qtuVar4;
                            qtuVar8 = qtuVar2;
                            i10 = 2;
                        }
                        xyc0 xyc0Var11 = (iyc0) this.e;
                        ttuVar2.a = qtuVar7;
                        ttuVar2.b = str3;
                        ttuVar2.c = qtuVar8;
                        ttuVar2.d = tv80Var3;
                        ttuVar2.e = qtuVar8;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        i11 = i4;
                        ttuVar2.X = i11;
                        i12 = i6;
                        ttuVar2.Y = i12;
                        ttuVar2.O0 = 5;
                        xyc0 xyc0Var12 = xyc0Var11;
                        xyc0Var12.getClass();
                        upu0VarN = PlaylistOfflineRequest.n();
                        upu0VarN.r(str3);
                        if (z5) {
                            d dVarY6 = PlaylistQuery.y();
                            dVarY6.getClass();
                            mlu0.a(dVarY6, g3d0Var3);
                            upu0VarN.q(dVarY6.build());
                            upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                        } else {
                            upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                        }
                        q8n q8nVar6 = xyc0Var12.c;
                        qtu qtuVar17 = qtuVar8;
                        n0a0 n0a0Var6 = new n0a0(xyc0Var12, upu0VarN, str3, qtuVar17, (byte) 13);
                        qtuVar9 = qtuVar17;
                        objH = c921.H(q8nVar6, n0a0Var6, ttuVar2);
                        d9nVar2 = d9nVar;
                        if (objH != d9nVar2) {
                            objH = (py21) objH;
                        }
                        if (objH == d9nVar2) {
                            return d9nVar2;
                        }
                        objG = objH;
                        i13 = i11;
                        qtuVar10 = qtuVar7;
                        str5 = str3;
                        i14 = i12;
                        py21Var = (py21) objG;
                        if (!(py21Var instanceof oy21)) {
                            if (py21Var instanceof ly21) {
                                return py21Var;
                            }
                            eg.o();
                            return null;
                        }
                        drj0 drj0Var6 = (drj0) this.O0;
                        iOrdinal = qtuVar10.ordinal();
                        if (iOrdinal == 0) {
                            i15 = i10;
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            i15 = i9;
                        }
                        drj0Var6.j(str5, i15, z5);
                        if (i14 != 0) {
                            xzj1Var = (xzj1) this.Y;
                            ttuVar2.a = qtuVar9;
                            ttuVar2.b = str5;
                            ttuVar2.c = qtuVar9;
                            ttuVar2.d = qtuVar9;
                            ttuVar2.e = qtuVar9;
                            ttuVar2.f = py21Var;
                            ttuVar2.h = z5;
                            ttuVar2.i = z13;
                            ttuVar2.t = z6;
                            ttuVar2.X = i13;
                            ttuVar2.Y = i14;
                            ttuVar2.O0 = 6;
                            if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                                return d9nVar2;
                            }
                            str6 = str5;
                            str5 = str6;
                        }
                        ezc ezcVar6 = (ezc) this.X;
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = str5;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 7;
                        objK = b5p1.k(ezcVar6, ttuVar2);
                        if (objK == d9nVar2) {
                            return d9nVar2;
                        }
                        String str14 = str5;
                        obj = objK;
                        str7 = str14;
                        orp0Var = (orp0) obj;
                        if (z5) {
                        }
                        py21Var2 = py21Var;
                        if (i13 != 0) {
                            if (orp0Var == orp0.c) {
                                ttuVar2.a = qtuVar9;
                                ttuVar2.b = qtuVar9;
                                ttuVar2.c = qtuVar9;
                                ttuVar2.d = qtuVar9;
                                ttuVar2.e = qtuVar9;
                                ttuVar2.f = py21Var2;
                                ttuVar2.g = qtuVar9;
                                ttuVar2.h = z5;
                                ttuVar2.i = z13;
                                ttuVar2.t = z6;
                                ttuVar2.X = i13;
                                ttuVar2.Y = i14;
                                ttuVar2.O0 = 9;
                                objG = pp31Var.g(str7, ttuVar2);
                                if (objG == d9nVar2) {
                                    return d9nVar2;
                                }
                                py21Var3 = py21Var2;
                                py21Var2 = (py21) objG;
                            } else {
                                py21Var3 = py21Var2;
                            }
                            if (py21Var2 == null) {
                                return py21Var3;
                            }
                        }
                        return py21Var2;
                    }
                }
                return d9nVar3;
            case 1:
                qtuVar2 = null;
                i3 = ttuVar2.X;
                z4 = ttuVar2.t;
                boolean z20 = ttuVar2.i;
                boolean z21 = ttuVar2.h;
                tv80Var2 = ttuVar2.d;
                g3d0Var4 = ttuVar2.c;
                str2 = ttuVar2.b;
                qtuVar3 = ttuVar2.a;
                hm5.M(objG);
                z13 = z20;
                z12 = z21;
                pp31Var = pp31Var2;
                oy21Var = (py21) objG;
                i = i3;
                qtuVar11 = qtuVar3;
                i2 = 0;
                if (!(oy21Var instanceof oy21)) {
                    return oy21Var;
                }
                if (!z12) {
                    qtuVar4 = qtuVar11;
                    g3d0Var2 = g3d0Var4;
                    str3 = str2;
                    qtuVar5 = qtuVar2;
                    tv80Var3 = tv80Var2;
                    z5 = z12;
                    z6 = z4;
                    i4 = i;
                    if (z5) {
                        i6 = i2;
                    } else {
                        i6 = i2;
                    }
                    if (z5) {
                    }
                    i7 = 4;
                    if (qtuVar5 == null) {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    } else {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    }
                    xyc0 xyc0Var13 = (iyc0) this.e;
                    ttuVar2.a = qtuVar7;
                    ttuVar2.b = str3;
                    ttuVar2.c = qtuVar8;
                    ttuVar2.d = tv80Var3;
                    ttuVar2.e = qtuVar8;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    i11 = i4;
                    ttuVar2.X = i11;
                    i12 = i6;
                    ttuVar2.Y = i12;
                    ttuVar2.O0 = 5;
                    xyc0 xyc0Var14 = xyc0Var13;
                    xyc0Var14.getClass();
                    upu0VarN = PlaylistOfflineRequest.n();
                    upu0VarN.r(str3);
                    if (z5) {
                        d dVarY7 = PlaylistQuery.y();
                        dVarY7.getClass();
                        mlu0.a(dVarY7, g3d0Var3);
                        upu0VarN.q(dVarY7.build());
                        upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                    } else {
                        upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                    }
                    q8n q8nVar7 = xyc0Var14.c;
                    qtu qtuVar18 = qtuVar8;
                    n0a0 n0a0Var7 = new n0a0(xyc0Var14, upu0VarN, str3, qtuVar18, (byte) 13);
                    qtuVar9 = qtuVar18;
                    objH = c921.H(q8nVar7, n0a0Var7, ttuVar2);
                    d9nVar2 = d9nVar;
                    if (objH != d9nVar2) {
                        objH = (py21) objH;
                    }
                    if (objH == d9nVar2) {
                        return d9nVar2;
                    }
                    objG = objH;
                    i13 = i11;
                    qtuVar10 = qtuVar7;
                    str5 = str3;
                    i14 = i12;
                    py21Var = (py21) objG;
                    if (!(py21Var instanceof oy21)) {
                        if (py21Var instanceof ly21) {
                            return py21Var;
                        }
                        eg.o();
                        return null;
                    }
                    drj0 drj0Var7 = (drj0) this.O0;
                    iOrdinal = qtuVar10.ordinal();
                    if (iOrdinal == 0) {
                        i15 = i10;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i15 = i9;
                    }
                    drj0Var7.j(str5, i15, z5);
                    if (i14 != 0) {
                        xzj1Var = (xzj1) this.Y;
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = str5;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 6;
                        if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                            return d9nVar2;
                        }
                        str6 = str5;
                        str5 = str6;
                    }
                    ezc ezcVar7 = (ezc) this.X;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 7;
                    objK = b5p1.k(ezcVar7, ttuVar2);
                    if (objK == d9nVar2) {
                        return d9nVar2;
                    }
                    String str15 = str5;
                    obj = objK;
                    str7 = str15;
                    orp0Var = (orp0) obj;
                    if (z5) {
                        break;
                    }
                    py21Var2 = py21Var;
                    if (i13 != 0) {
                        if (orp0Var == orp0.c) {
                            ttuVar2.a = qtuVar9;
                            ttuVar2.b = qtuVar9;
                            ttuVar2.c = qtuVar9;
                            ttuVar2.d = qtuVar9;
                            ttuVar2.e = qtuVar9;
                            ttuVar2.f = py21Var2;
                            ttuVar2.g = qtuVar9;
                            ttuVar2.h = z5;
                            ttuVar2.i = z13;
                            ttuVar2.t = z6;
                            ttuVar2.X = i13;
                            ttuVar2.Y = i14;
                            ttuVar2.O0 = 9;
                            objG = pp31Var.g(str7, ttuVar2);
                            if (objG == d9nVar2) {
                                return d9nVar2;
                            }
                            py21Var3 = py21Var2;
                            py21Var2 = (py21) objG;
                        } else {
                            py21Var3 = py21Var2;
                        }
                        if (py21Var2 == null) {
                            return py21Var3;
                        }
                    }
                    return py21Var2;
                }
                ttuVar2.a = qtuVar11;
                ttuVar2.b = str2;
                ttuVar2.c = g3d0Var4;
                ttuVar2.d = tv80Var2;
                ttuVar2.h = z12;
                ttuVar2.i = z13;
                ttuVar2.t = z4;
                ttuVar2.X = i;
                ttuVar2.O0 = 3;
                objR = r(str2, ttuVar2);
                if (objR != d9nVar3) {
                    qtuVar6 = qtuVar11;
                    i5 = i;
                    objG = objR;
                    boolean z110 = z13;
                    z7 = z12;
                    z8 = z110;
                    boolean z111 = z4;
                    i4 = i5;
                    str3 = str2;
                    tv80Var3 = tv80Var2;
                    z5 = z7;
                    z13 = z8;
                    z6 = z111;
                    qtuVar4 = qtuVar6;
                    g3d0Var2 = g3d0Var4;
                    qtuVar5 = (rtu) objG;
                    if (z5) {
                        i6 = i2;
                    } else {
                        i6 = i2;
                    }
                    if (z5) {
                    }
                    i7 = 4;
                    if (qtuVar5 == null) {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    } else {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    }
                    xyc0 xyc0Var15 = (iyc0) this.e;
                    ttuVar2.a = qtuVar7;
                    ttuVar2.b = str3;
                    ttuVar2.c = qtuVar8;
                    ttuVar2.d = tv80Var3;
                    ttuVar2.e = qtuVar8;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    i11 = i4;
                    ttuVar2.X = i11;
                    i12 = i6;
                    ttuVar2.Y = i12;
                    ttuVar2.O0 = 5;
                    xyc0 xyc0Var16 = xyc0Var15;
                    xyc0Var16.getClass();
                    upu0VarN = PlaylistOfflineRequest.n();
                    upu0VarN.r(str3);
                    if (z5) {
                        d dVarY8 = PlaylistQuery.y();
                        dVarY8.getClass();
                        mlu0.a(dVarY8, g3d0Var3);
                        upu0VarN.q(dVarY8.build());
                        upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                    } else {
                        upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                    }
                    q8n q8nVar8 = xyc0Var16.c;
                    qtu qtuVar19 = qtuVar8;
                    n0a0 n0a0Var8 = new n0a0(xyc0Var16, upu0VarN, str3, qtuVar19, (byte) 13);
                    qtuVar9 = qtuVar19;
                    objH = c921.H(q8nVar8, n0a0Var8, ttuVar2);
                    d9nVar2 = d9nVar;
                    if (objH != d9nVar2) {
                        objH = (py21) objH;
                    }
                    if (objH == d9nVar2) {
                        return d9nVar2;
                    }
                    objG = objH;
                    i13 = i11;
                    qtuVar10 = qtuVar7;
                    str5 = str3;
                    i14 = i12;
                    py21Var = (py21) objG;
                    if (!(py21Var instanceof oy21)) {
                        if (py21Var instanceof ly21) {
                            return py21Var;
                        }
                        eg.o();
                        return null;
                    }
                    drj0 drj0Var8 = (drj0) this.O0;
                    iOrdinal = qtuVar10.ordinal();
                    if (iOrdinal == 0) {
                        i15 = i10;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i15 = i9;
                    }
                    drj0Var8.j(str5, i15, z5);
                    if (i14 != 0) {
                        xzj1Var = (xzj1) this.Y;
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = str5;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 6;
                        if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                            return d9nVar2;
                        }
                        str6 = str5;
                        str5 = str6;
                    }
                    ezc ezcVar8 = (ezc) this.X;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 7;
                    objK = b5p1.k(ezcVar8, ttuVar2);
                    if (objK == d9nVar2) {
                        return d9nVar2;
                    }
                    String str16 = str5;
                    obj = objK;
                    str7 = str16;
                    orp0Var = (orp0) obj;
                    if (z5) {
                        break;
                    }
                    py21Var2 = py21Var;
                    if (i13 != 0) {
                        if (orp0Var == orp0.c) {
                            ttuVar2.a = qtuVar9;
                            ttuVar2.b = qtuVar9;
                            ttuVar2.c = qtuVar9;
                            ttuVar2.d = qtuVar9;
                            ttuVar2.e = qtuVar9;
                            ttuVar2.f = py21Var2;
                            ttuVar2.g = qtuVar9;
                            ttuVar2.h = z5;
                            ttuVar2.i = z13;
                            ttuVar2.t = z6;
                            ttuVar2.X = i13;
                            ttuVar2.Y = i14;
                            ttuVar2.O0 = 9;
                            objG = pp31Var.g(str7, ttuVar2);
                            if (objG == d9nVar2) {
                                return d9nVar2;
                            }
                            py21Var3 = py21Var2;
                            py21Var2 = (py21) objG;
                        } else {
                            py21Var3 = py21Var2;
                        }
                        if (py21Var2 == null) {
                            return py21Var3;
                        }
                    }
                    return py21Var2;
                }
                return d9nVar3;
            case 2:
                qtuVar2 = null;
                int i21 = ttuVar2.X;
                z4 = ttuVar2.t;
                boolean z22 = ttuVar2.i;
                boolean z23 = ttuVar2.h;
                tv80Var2 = ttuVar2.d;
                g3d0Var4 = ttuVar2.c;
                str2 = ttuVar2.b;
                qtu qtuVar20 = ttuVar2.a;
                hm5.M(objG);
                z13 = z22;
                z12 = z23;
                pp31Var = pp31Var2;
                objC = objG;
                i = i21;
                qtuVar11 = qtuVar20;
                i2 = 0;
                oy21Var = (py21) objC;
                if (!(oy21Var instanceof oy21)) {
                    return oy21Var;
                }
                if (!z12) {
                    qtuVar4 = qtuVar11;
                    g3d0Var2 = g3d0Var4;
                    str3 = str2;
                    qtuVar5 = qtuVar2;
                    tv80Var3 = tv80Var2;
                    z5 = z12;
                    z6 = z4;
                    i4 = i;
                    if (z5) {
                        i6 = i2;
                    } else {
                        i6 = i2;
                    }
                    if (z5) {
                    }
                    i7 = 4;
                    if (qtuVar5 == null) {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    } else {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    }
                    xyc0 xyc0Var17 = (iyc0) this.e;
                    ttuVar2.a = qtuVar7;
                    ttuVar2.b = str3;
                    ttuVar2.c = qtuVar8;
                    ttuVar2.d = tv80Var3;
                    ttuVar2.e = qtuVar8;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    i11 = i4;
                    ttuVar2.X = i11;
                    i12 = i6;
                    ttuVar2.Y = i12;
                    ttuVar2.O0 = 5;
                    xyc0 xyc0Var18 = xyc0Var17;
                    xyc0Var18.getClass();
                    upu0VarN = PlaylistOfflineRequest.n();
                    upu0VarN.r(str3);
                    if (z5) {
                        d dVarY9 = PlaylistQuery.y();
                        dVarY9.getClass();
                        mlu0.a(dVarY9, g3d0Var3);
                        upu0VarN.q(dVarY9.build());
                        upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                    } else {
                        upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                    }
                    q8n q8nVar9 = xyc0Var18.c;
                    qtu qtuVar110 = qtuVar8;
                    n0a0 n0a0Var9 = new n0a0(xyc0Var18, upu0VarN, str3, qtuVar110, (byte) 13);
                    qtuVar9 = qtuVar110;
                    objH = c921.H(q8nVar9, n0a0Var9, ttuVar2);
                    d9nVar2 = d9nVar;
                    if (objH != d9nVar2) {
                        objH = (py21) objH;
                    }
                    if (objH == d9nVar2) {
                        return d9nVar2;
                    }
                    objG = objH;
                    i13 = i11;
                    qtuVar10 = qtuVar7;
                    str5 = str3;
                    i14 = i12;
                    py21Var = (py21) objG;
                    if (!(py21Var instanceof oy21)) {
                        if (py21Var instanceof ly21) {
                            return py21Var;
                        }
                        eg.o();
                        return null;
                    }
                    drj0 drj0Var9 = (drj0) this.O0;
                    iOrdinal = qtuVar10.ordinal();
                    if (iOrdinal == 0) {
                        i15 = i10;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i15 = i9;
                    }
                    drj0Var9.j(str5, i15, z5);
                    if (i14 != 0) {
                        xzj1Var = (xzj1) this.Y;
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = str5;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 6;
                        if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                            return d9nVar2;
                        }
                        str6 = str5;
                        str5 = str6;
                    }
                    ezc ezcVar9 = (ezc) this.X;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 7;
                    objK = b5p1.k(ezcVar9, ttuVar2);
                    if (objK == d9nVar2) {
                        return d9nVar2;
                    }
                    String str17 = str5;
                    obj = objK;
                    str7 = str17;
                    orp0Var = (orp0) obj;
                    if (z5) {
                        break;
                    }
                    py21Var2 = py21Var;
                    if (i13 != 0) {
                        if (orp0Var == orp0.c) {
                            ttuVar2.a = qtuVar9;
                            ttuVar2.b = qtuVar9;
                            ttuVar2.c = qtuVar9;
                            ttuVar2.d = qtuVar9;
                            ttuVar2.e = qtuVar9;
                            ttuVar2.f = py21Var2;
                            ttuVar2.g = qtuVar9;
                            ttuVar2.h = z5;
                            ttuVar2.i = z13;
                            ttuVar2.t = z6;
                            ttuVar2.X = i13;
                            ttuVar2.Y = i14;
                            ttuVar2.O0 = 9;
                            objG = pp31Var.g(str7, ttuVar2);
                            if (objG == d9nVar2) {
                                return d9nVar2;
                            }
                            py21Var3 = py21Var2;
                            py21Var2 = (py21) objG;
                        } else {
                            py21Var3 = py21Var2;
                        }
                        if (py21Var2 == null) {
                            return py21Var3;
                        }
                    }
                    return py21Var2;
                }
                ttuVar2.a = qtuVar11;
                ttuVar2.b = str2;
                ttuVar2.c = g3d0Var4;
                ttuVar2.d = tv80Var2;
                ttuVar2.h = z12;
                ttuVar2.i = z13;
                ttuVar2.t = z4;
                ttuVar2.X = i;
                ttuVar2.O0 = 3;
                objR = r(str2, ttuVar2);
                if (objR != d9nVar3) {
                    qtuVar6 = qtuVar11;
                    i5 = i;
                    objG = objR;
                    boolean z112 = z13;
                    z7 = z12;
                    z8 = z112;
                    boolean z113 = z4;
                    i4 = i5;
                    str3 = str2;
                    tv80Var3 = tv80Var2;
                    z5 = z7;
                    z13 = z8;
                    z6 = z113;
                    qtuVar4 = qtuVar6;
                    g3d0Var2 = g3d0Var4;
                    qtuVar5 = (rtu) objG;
                    if (z5) {
                        i6 = i2;
                    } else {
                        i6 = i2;
                    }
                    if (z5) {
                    }
                    i7 = 4;
                    if (qtuVar5 == null) {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    } else {
                        i9 = i7;
                        g3d0Var3 = g3d0Var2;
                        d9nVar = d9nVar3;
                        qtuVar7 = qtuVar4;
                        qtuVar8 = qtuVar2;
                        i10 = 2;
                    }
                    xyc0 xyc0Var19 = (iyc0) this.e;
                    ttuVar2.a = qtuVar7;
                    ttuVar2.b = str3;
                    ttuVar2.c = qtuVar8;
                    ttuVar2.d = tv80Var3;
                    ttuVar2.e = qtuVar8;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    i11 = i4;
                    ttuVar2.X = i11;
                    i12 = i6;
                    ttuVar2.Y = i12;
                    ttuVar2.O0 = 5;
                    xyc0 xyc0Var110 = xyc0Var19;
                    xyc0Var110.getClass();
                    upu0VarN = PlaylistOfflineRequest.n();
                    upu0VarN.r(str3);
                    if (z5) {
                        d dVarY10 = PlaylistQuery.y();
                        dVarY10.getClass();
                        mlu0.a(dVarY10, g3d0Var3);
                        upu0VarN.q(dVarY10.build());
                        upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                    } else {
                        upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                    }
                    q8n q8nVar10 = xyc0Var110.c;
                    qtu qtuVar111 = qtuVar8;
                    n0a0 n0a0Var10 = new n0a0(xyc0Var110, upu0VarN, str3, qtuVar111, (byte) 13);
                    qtuVar9 = qtuVar111;
                    objH = c921.H(q8nVar10, n0a0Var10, ttuVar2);
                    d9nVar2 = d9nVar;
                    if (objH != d9nVar2) {
                        objH = (py21) objH;
                    }
                    if (objH == d9nVar2) {
                        return d9nVar2;
                    }
                    objG = objH;
                    i13 = i11;
                    qtuVar10 = qtuVar7;
                    str5 = str3;
                    i14 = i12;
                    py21Var = (py21) objG;
                    if (!(py21Var instanceof oy21)) {
                        if (py21Var instanceof ly21) {
                            return py21Var;
                        }
                        eg.o();
                        return null;
                    }
                    drj0 drj0Var10 = (drj0) this.O0;
                    iOrdinal = qtuVar10.ordinal();
                    if (iOrdinal == 0) {
                        i15 = i10;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        i15 = i9;
                    }
                    drj0Var10.j(str5, i15, z5);
                    if (i14 != 0) {
                        xzj1Var = (xzj1) this.Y;
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = str5;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 6;
                        if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                            return d9nVar2;
                        }
                        str6 = str5;
                        str5 = str6;
                    }
                    ezc ezcVar10 = (ezc) this.X;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 7;
                    objK = b5p1.k(ezcVar10, ttuVar2);
                    if (objK == d9nVar2) {
                        return d9nVar2;
                    }
                    String str18 = str5;
                    obj = objK;
                    str7 = str18;
                    orp0Var = (orp0) obj;
                    if (z5) {
                        break;
                    }
                    py21Var2 = py21Var;
                    if (i13 != 0) {
                        if (orp0Var == orp0.c) {
                            ttuVar2.a = qtuVar9;
                            ttuVar2.b = qtuVar9;
                            ttuVar2.c = qtuVar9;
                            ttuVar2.d = qtuVar9;
                            ttuVar2.e = qtuVar9;
                            ttuVar2.f = py21Var2;
                            ttuVar2.g = qtuVar9;
                            ttuVar2.h = z5;
                            ttuVar2.i = z13;
                            ttuVar2.t = z6;
                            ttuVar2.X = i13;
                            ttuVar2.Y = i14;
                            ttuVar2.O0 = 9;
                            objG = pp31Var.g(str7, ttuVar2);
                            if (objG == d9nVar2) {
                                return d9nVar2;
                            }
                            py21Var3 = py21Var2;
                            py21Var2 = (py21) objG;
                        } else {
                            py21Var3 = py21Var2;
                        }
                        if (py21Var2 == null) {
                            return py21Var3;
                        }
                    }
                    return py21Var2;
                }
                return d9nVar3;
            case 3:
                qtuVar2 = null;
                i5 = ttuVar2.X;
                z4 = ttuVar2.t;
                z8 = ttuVar2.i;
                z7 = ttuVar2.h;
                tv80Var2 = ttuVar2.d;
                g3d0Var4 = ttuVar2.c;
                str2 = ttuVar2.b;
                qtu qtuVar21 = ttuVar2.a;
                hm5.M(objG);
                pp31Var = pp31Var2;
                qtuVar6 = qtuVar21;
                i2 = 0;
                boolean z114 = z4;
                i4 = i5;
                str3 = str2;
                tv80Var3 = tv80Var2;
                z5 = z7;
                z13 = z8;
                z6 = z114;
                qtuVar4 = qtuVar6;
                g3d0Var2 = g3d0Var4;
                qtuVar5 = (rtu) objG;
                if (z5) {
                    i6 = i2;
                } else {
                    i6 = i2;
                }
                if (z5) {
                }
                i7 = 4;
                if (qtuVar5 == null) {
                    i9 = i7;
                    g3d0Var3 = g3d0Var2;
                    d9nVar = d9nVar3;
                    qtuVar7 = qtuVar4;
                    qtuVar8 = qtuVar2;
                    i10 = 2;
                } else {
                    i9 = i7;
                    g3d0Var3 = g3d0Var2;
                    d9nVar = d9nVar3;
                    qtuVar7 = qtuVar4;
                    qtuVar8 = qtuVar2;
                    i10 = 2;
                }
                xyc0 xyc0Var111 = (iyc0) this.e;
                ttuVar2.a = qtuVar7;
                ttuVar2.b = str3;
                ttuVar2.c = qtuVar8;
                ttuVar2.d = tv80Var3;
                ttuVar2.e = qtuVar8;
                ttuVar2.h = z5;
                ttuVar2.i = z13;
                ttuVar2.t = z6;
                i11 = i4;
                ttuVar2.X = i11;
                i12 = i6;
                ttuVar2.Y = i12;
                ttuVar2.O0 = 5;
                xyc0 xyc0Var112 = xyc0Var111;
                xyc0Var112.getClass();
                upu0VarN = PlaylistOfflineRequest.n();
                upu0VarN.r(str3);
                if (z5) {
                    d dVarY11 = PlaylistQuery.y();
                    dVarY11.getClass();
                    mlu0.a(dVarY11, g3d0Var3);
                    upu0VarN.q(dVarY11.build());
                    upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                } else {
                    upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                }
                q8n q8nVar11 = xyc0Var112.c;
                qtu qtuVar112 = qtuVar8;
                n0a0 n0a0Var11 = new n0a0(xyc0Var112, upu0VarN, str3, qtuVar112, (byte) 13);
                qtuVar9 = qtuVar112;
                objH = c921.H(q8nVar11, n0a0Var11, ttuVar2);
                d9nVar2 = d9nVar;
                if (objH != d9nVar2) {
                    objH = (py21) objH;
                }
                if (objH == d9nVar2) {
                    return d9nVar2;
                }
                objG = objH;
                i13 = i11;
                qtuVar10 = qtuVar7;
                str5 = str3;
                i14 = i12;
                py21Var = (py21) objG;
                if (!(py21Var instanceof oy21)) {
                    if (py21Var instanceof ly21) {
                        return py21Var;
                    }
                    eg.o();
                    return null;
                }
                drj0 drj0Var11 = (drj0) this.O0;
                iOrdinal = qtuVar10.ordinal();
                if (iOrdinal == 0) {
                    i15 = i10;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i15 = i9;
                }
                drj0Var11.j(str5, i15, z5);
                if (i14 != 0) {
                    xzj1Var = (xzj1) this.Y;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 6;
                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                    str6 = str5;
                    str5 = str6;
                }
                ezc ezcVar11 = (ezc) this.X;
                ttuVar2.a = qtuVar9;
                ttuVar2.b = str5;
                ttuVar2.c = qtuVar9;
                ttuVar2.d = qtuVar9;
                ttuVar2.e = qtuVar9;
                ttuVar2.f = py21Var;
                ttuVar2.h = z5;
                ttuVar2.i = z13;
                ttuVar2.t = z6;
                ttuVar2.X = i13;
                ttuVar2.Y = i14;
                ttuVar2.O0 = 7;
                objK = b5p1.k(ezcVar11, ttuVar2);
                if (objK == d9nVar2) {
                    return d9nVar2;
                }
                String str19 = str5;
                obj = objK;
                str7 = str19;
                orp0Var = (orp0) obj;
                if (z5) {
                    break;
                }
                py21Var2 = py21Var;
                if (i13 != 0) {
                    if (orp0Var == orp0.c) {
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = qtuVar9;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var2;
                        ttuVar2.g = qtuVar9;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 9;
                        objG = pp31Var.g(str7, ttuVar2);
                        if (objG == d9nVar2) {
                            return d9nVar2;
                        }
                        py21Var3 = py21Var2;
                        py21Var2 = (py21) objG;
                    } else {
                        py21Var3 = py21Var2;
                    }
                    if (py21Var2 == null) {
                        return py21Var3;
                    }
                }
                return py21Var2;
            case 4:
                i8 = ttuVar2.Y;
                i4 = ttuVar2.X;
                z6 = ttuVar2.t;
                z13 = ttuVar2.i;
                z5 = ttuVar2.h;
                qtuVar5 = ttuVar2.e;
                tv80Var3 = ttuVar2.d;
                qtuVar2 = null;
                g3d0Var2 = ttuVar2.c;
                String str20 = ttuVar2.b;
                qtuVar4 = ttuVar2.a;
                hm5.M(objG);
                pp31Var = pp31Var2;
                str4 = str20;
                i7 = 4;
                String str21 = str4;
                i6 = i8;
                str3 = str21;
                if (qtuVar5 == null) {
                    i9 = i7;
                    g3d0Var3 = g3d0Var2;
                    d9nVar = d9nVar3;
                    qtuVar7 = qtuVar4;
                    qtuVar8 = qtuVar2;
                    i10 = 2;
                } else {
                    i9 = i7;
                    g3d0Var3 = g3d0Var2;
                    d9nVar = d9nVar3;
                    qtuVar7 = qtuVar4;
                    qtuVar8 = qtuVar2;
                    i10 = 2;
                }
                xyc0 xyc0Var113 = (iyc0) this.e;
                ttuVar2.a = qtuVar7;
                ttuVar2.b = str3;
                ttuVar2.c = qtuVar8;
                ttuVar2.d = tv80Var3;
                ttuVar2.e = qtuVar8;
                ttuVar2.h = z5;
                ttuVar2.i = z13;
                ttuVar2.t = z6;
                i11 = i4;
                ttuVar2.X = i11;
                i12 = i6;
                ttuVar2.Y = i12;
                ttuVar2.O0 = 5;
                xyc0 xyc0Var114 = xyc0Var113;
                xyc0Var114.getClass();
                upu0VarN = PlaylistOfflineRequest.n();
                upu0VarN.r(str3);
                if (z5) {
                    d dVarY12 = PlaylistQuery.y();
                    dVarY12.getClass();
                    mlu0.a(dVarY12, g3d0Var3);
                    upu0VarN.q(dVarY12.build());
                    upu0VarN.n(tpu0.SET_AS_AVAILABLE_OFFLINE);
                } else {
                    upu0VarN.n(tpu0.REMOVE_AS_AVAILABLE_OFFLINE);
                }
                q8n q8nVar12 = xyc0Var114.c;
                qtu qtuVar113 = qtuVar8;
                n0a0 n0a0Var12 = new n0a0(xyc0Var114, upu0VarN, str3, qtuVar113, (byte) 13);
                qtuVar9 = qtuVar113;
                objH = c921.H(q8nVar12, n0a0Var12, ttuVar2);
                d9nVar2 = d9nVar;
                if (objH != d9nVar2) {
                    objH = (py21) objH;
                }
                if (objH == d9nVar2) {
                    return d9nVar2;
                }
                objG = objH;
                i13 = i11;
                qtuVar10 = qtuVar7;
                str5 = str3;
                i14 = i12;
                py21Var = (py21) objG;
                if (!(py21Var instanceof oy21)) {
                    if (py21Var instanceof ly21) {
                        return py21Var;
                    }
                    eg.o();
                    return null;
                }
                drj0 drj0Var12 = (drj0) this.O0;
                iOrdinal = qtuVar10.ordinal();
                if (iOrdinal == 0) {
                    i15 = i10;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i15 = i9;
                }
                drj0Var12.j(str5, i15, z5);
                if (i14 != 0) {
                    xzj1Var = (xzj1) this.Y;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 6;
                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                    str6 = str5;
                    str5 = str6;
                }
                ezc ezcVar12 = (ezc) this.X;
                ttuVar2.a = qtuVar9;
                ttuVar2.b = str5;
                ttuVar2.c = qtuVar9;
                ttuVar2.d = qtuVar9;
                ttuVar2.e = qtuVar9;
                ttuVar2.f = py21Var;
                ttuVar2.h = z5;
                ttuVar2.i = z13;
                ttuVar2.t = z6;
                ttuVar2.X = i13;
                ttuVar2.Y = i14;
                ttuVar2.O0 = 7;
                objK = b5p1.k(ezcVar12, ttuVar2);
                if (objK == d9nVar2) {
                    return d9nVar2;
                }
                String str110 = str5;
                obj = objK;
                str7 = str110;
                orp0Var = (orp0) obj;
                if (z5) {
                    break;
                }
                py21Var2 = py21Var;
                if (i13 != 0) {
                    if (orp0Var == orp0.c) {
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = qtuVar9;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var2;
                        ttuVar2.g = qtuVar9;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 9;
                        objG = pp31Var.g(str7, ttuVar2);
                        if (objG == d9nVar2) {
                            return d9nVar2;
                        }
                        py21Var3 = py21Var2;
                        py21Var2 = (py21) objG;
                    } else {
                        py21Var3 = py21Var2;
                    }
                    if (py21Var2 == null) {
                        return py21Var3;
                    }
                }
                return py21Var2;
            case 5:
                i14 = ttuVar2.Y;
                i13 = ttuVar2.X;
                z6 = ttuVar2.t;
                z13 = ttuVar2.i;
                z5 = ttuVar2.h;
                tv80 tv80Var4 = ttuVar2.d;
                String str22 = ttuVar2.b;
                qtuVar10 = ttuVar2.a;
                hm5.M(objG);
                pp31Var = pp31Var2;
                d9nVar2 = d9nVar3;
                i9 = 4;
                i10 = 2;
                str5 = str22;
                tv80Var3 = tv80Var4;
                qtuVar9 = null;
                py21Var = (py21) objG;
                if (!(py21Var instanceof oy21)) {
                    if (py21Var instanceof ly21) {
                        return py21Var;
                    }
                    eg.o();
                    return null;
                }
                drj0 drj0Var13 = (drj0) this.O0;
                iOrdinal = qtuVar10.ordinal();
                if (iOrdinal == 0) {
                    i15 = i10;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i15 = i9;
                }
                drj0Var13.j(str5, i15, z5);
                if (i14 != 0) {
                    xzj1Var = (xzj1) this.Y;
                    ttuVar2.a = qtuVar9;
                    ttuVar2.b = str5;
                    ttuVar2.c = qtuVar9;
                    ttuVar2.d = qtuVar9;
                    ttuVar2.e = qtuVar9;
                    ttuVar2.f = py21Var;
                    ttuVar2.h = z5;
                    ttuVar2.i = z13;
                    ttuVar2.t = z6;
                    ttuVar2.X = i13;
                    ttuVar2.Y = i14;
                    ttuVar2.O0 = 6;
                    if (xzj1Var.a(str5, tv80Var3, ttuVar2) == d9nVar2) {
                        return d9nVar2;
                    }
                    str6 = str5;
                    str5 = str6;
                }
                ezc ezcVar13 = (ezc) this.X;
                ttuVar2.a = qtuVar9;
                ttuVar2.b = str5;
                ttuVar2.c = qtuVar9;
                ttuVar2.d = qtuVar9;
                ttuVar2.e = qtuVar9;
                ttuVar2.f = py21Var;
                ttuVar2.h = z5;
                ttuVar2.i = z13;
                ttuVar2.t = z6;
                ttuVar2.X = i13;
                ttuVar2.Y = i14;
                ttuVar2.O0 = 7;
                objK = b5p1.k(ezcVar13, ttuVar2);
                if (objK == d9nVar2) {
                    return d9nVar2;
                }
                String str111 = str5;
                obj = objK;
                str7 = str111;
                orp0Var = (orp0) obj;
                if (z5) {
                    break;
                }
                py21Var2 = py21Var;
                if (i13 != 0) {
                    if (orp0Var == orp0.c) {
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = qtuVar9;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var2;
                        ttuVar2.g = qtuVar9;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 9;
                        objG = pp31Var.g(str7, ttuVar2);
                        if (objG == d9nVar2) {
                            return d9nVar2;
                        }
                        py21Var3 = py21Var2;
                        py21Var2 = (py21) objG;
                    } else {
                        py21Var3 = py21Var2;
                    }
                    if (py21Var2 == null) {
                        return py21Var3;
                    }
                }
                return py21Var2;
            case 6:
                i14 = ttuVar2.Y;
                i13 = ttuVar2.X;
                z6 = ttuVar2.t;
                z13 = ttuVar2.i;
                z5 = ttuVar2.h;
                py21 py21Var4 = ttuVar2.f;
                str6 = ttuVar2.b;
                hm5.M(objG);
                py21Var = py21Var4;
                pp31Var = pp31Var2;
                d9nVar2 = d9nVar3;
                qtuVar9 = null;
                str5 = str6;
                ezc ezcVar14 = (ezc) this.X;
                ttuVar2.a = qtuVar9;
                ttuVar2.b = str5;
                ttuVar2.c = qtuVar9;
                ttuVar2.d = qtuVar9;
                ttuVar2.e = qtuVar9;
                ttuVar2.f = py21Var;
                ttuVar2.h = z5;
                ttuVar2.i = z13;
                ttuVar2.t = z6;
                ttuVar2.X = i13;
                ttuVar2.Y = i14;
                ttuVar2.O0 = 7;
                objK = b5p1.k(ezcVar14, ttuVar2);
                if (objK == d9nVar2) {
                    return d9nVar2;
                }
                String str112 = str5;
                obj = objK;
                str7 = str112;
                orp0Var = (orp0) obj;
                if (z5) {
                    break;
                }
                py21Var2 = py21Var;
                if (i13 != 0) {
                    if (orp0Var == orp0.c) {
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = qtuVar9;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var2;
                        ttuVar2.g = qtuVar9;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 9;
                        objG = pp31Var.g(str7, ttuVar2);
                        if (objG == d9nVar2) {
                            return d9nVar2;
                        }
                        py21Var3 = py21Var2;
                        py21Var2 = (py21) objG;
                    } else {
                        py21Var3 = py21Var2;
                    }
                    if (py21Var2 == null) {
                        return py21Var3;
                    }
                }
                return py21Var2;
            case 7:
                i14 = ttuVar2.Y;
                i13 = ttuVar2.X;
                z6 = ttuVar2.t;
                z13 = ttuVar2.i;
                z5 = ttuVar2.h;
                py21 py21Var5 = ttuVar2.f;
                str7 = ttuVar2.b;
                hm5.M(objG);
                pp31Var = pp31Var2;
                obj = objG;
                d9nVar2 = d9nVar3;
                py21Var = py21Var5;
                qtuVar9 = null;
                orp0Var = (orp0) obj;
                if (z5) {
                    break;
                }
                py21Var2 = py21Var;
                if (i13 != 0) {
                    if (orp0Var == orp0.c) {
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = qtuVar9;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var2;
                        ttuVar2.g = qtuVar9;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 9;
                        objG = pp31Var.g(str7, ttuVar2);
                        if (objG == d9nVar2) {
                            return d9nVar2;
                        }
                        py21Var3 = py21Var2;
                        py21Var2 = (py21) objG;
                    } else {
                        py21Var3 = py21Var2;
                    }
                    if (py21Var2 == null) {
                        return py21Var3;
                    }
                }
                return py21Var2;
            case 8:
                i16 = ttuVar2.Y;
                i17 = ttuVar2.X;
                z9 = ttuVar2.t;
                z10 = ttuVar2.i;
                z11 = ttuVar2.h;
                orp0Var2 = ttuVar2.g;
                py21 py21Var6 = ttuVar2.f;
                str7 = ttuVar2.b;
                hm5.M(objG);
                py21Var = py21Var6;
                pp31Var = pp31Var2;
                d9nVar2 = d9nVar3;
                qtuVar9 = null;
                orp0Var = orp0Var2;
                z5 = z11;
                z13 = z10;
                z6 = z9;
                i13 = i17;
                i14 = i16;
                py21Var2 = py21Var;
                if (i13 != 0) {
                    if (orp0Var == orp0.c) {
                        ttuVar2.a = qtuVar9;
                        ttuVar2.b = qtuVar9;
                        ttuVar2.c = qtuVar9;
                        ttuVar2.d = qtuVar9;
                        ttuVar2.e = qtuVar9;
                        ttuVar2.f = py21Var2;
                        ttuVar2.g = qtuVar9;
                        ttuVar2.h = z5;
                        ttuVar2.i = z13;
                        ttuVar2.t = z6;
                        ttuVar2.X = i13;
                        ttuVar2.Y = i14;
                        ttuVar2.O0 = 9;
                        objG = pp31Var.g(str7, ttuVar2);
                        if (objG == d9nVar2) {
                            return d9nVar2;
                        }
                        py21Var3 = py21Var2;
                        py21Var2 = (py21) objG;
                    } else {
                        py21Var3 = py21Var2;
                    }
                    if (py21Var2 == null) {
                        return py21Var3;
                    }
                }
                return py21Var2;
            case 9:
                py21Var2 = ttuVar2.f;
                hm5.M(objG);
                py21Var3 = py21Var2;
                py21Var2 = (py21) objG;
                if (py21Var2 == null) {
                    return py21Var3;
                }
                return py21Var2;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public lud0 k() {
        gkd gkdVar = (gkd) ((jly0) this.g).get();
        toj0 toj0VarH = h();
        daq daqVar = (daq) this.e;
        return new lud0(new tp7(new pt(gkdVar, toj0VarH, (gw70) daqVar.d8.get(), (woa) daqVar.W8.get(), (kma) daqVar.Od.get(), new yu3((uwh) daqVar.Wq.get(), (uu00) daqVar.a5.get(), (Flowable) ((jly0) this.i).get(), f2u0.D((Flowable) ((jly0) this.h).get()), (byte) 25)), (p2q) this.c, new uym0(f2u0.j((Flowable) ((jly0) this.h).get()), (Flowable) ((jly0) this.Z).get(), ((Flowable) ((jly0) this.h).get()).j(mo9.O0), (w9u0) ((jly0) this.b).get(), (d0r) ((jly0) this.N0).get()), (owp) ((jly0) this.O0).get(), (d0r) ((jly0) this.N0).get(), d().d(), new v1k(h(), new asn(t(), new lvc1((Flowable) ((jly0) this.i).get(), f2u0.D((Flowable) ((jly0) this.h).get()))), (iac0) ((jly0) this.t).get(), (byte) 28), (gkd) ((jly0) this.g).get(), (iac0) ((jly0) this.t).get(), ((v5q) this.f).i(), new et90(new xu4(false, (luk) daqVar.L1.get()), f2u0.f((Flowable) ((jly0) this.h).get()), (cbv) daqVar.vq.get())), (byte) 3);
    }

    public void l(LayoutInflater layoutInflater, ScrollView scrollView) {
        View viewInflate = layoutInflater.inflate(2131625023, (ViewGroup) scrollView, true);
        this.d = (TextView) viewInflate.findViewById(2131429678);
        this.e = (TextView) viewInflate.findViewById(2131429673);
        this.f = (TextView) viewInflate.findViewById(2131429671);
        this.g = (ImageView) viewInflate.findViewById(2131429674);
        this.h = viewInflate.findViewById(2131429675);
        this.i = viewInflate.findViewById(2131429672);
        this.t = (Button) viewInflate.findViewById(2131429677);
        TertiaryButtonView tertiaryButtonViewFindViewById = viewInflate.findViewById(2131429676);
        this.X = tertiaryButtonViewFindViewById;
        tertiaryButtonViewFindViewById.setTextColor(tyd1.b);
        TextView textView = (TextView) this.d;
        if (textView == null) {
            u890.C("titleView");
            throw null;
        }
        textView.setText((String) this.c);
        TextView textView2 = (TextView) this.f;
        if (textView2 == null) {
            u890.C("bodyView");
            throw null;
        }
        q(textView2, (String) this.Y, new wh70(this, (byte) 0));
        TextView textView3 = (TextView) this.e;
        if (textView3 == null) {
            u890.C("headerView");
            throw null;
        }
        textView3.setVisibility(8);
        ImageView imageView = (ImageView) this.g;
        if (imageView == null) {
            u890.C("iconView");
            throw null;
        }
        imageView.setVisibility(8);
        Button button = (Button) this.t;
        if (button == null) {
            u890.C("positiveButton");
            throw null;
        }
        q(button, (String) this.Z, new wh70(this, (byte) 1));
        TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) this.X;
        if (tertiaryButtonView == null) {
            u890.C("negativeButton");
            throw null;
        }
        q(tertiaryButtonView, (String) this.b, new wh70(this, (byte) 2));
        SpotifyIconView spotifyIconView = (SpotifyIconView) this.i;
        if (spotifyIconView != null) {
            spotifyIconView.setVisibility(8);
        } else {
            u890.C("closeButton");
            throw null;
        }
    }

    public xca m(String str) {
        HashMap map = (HashMap) this.f;
        str.getClass();
        return (xca) map.get(str);
    }

    public rhh0 n(int i) {
        switch (l1d.C(i)) {
            case 0:
                return (rhh0) ((ynb0) this.c).get();
            case 1:
                return (rhh0) ((ynb0) this.e).get();
            case 2:
                return (rhh0) ((ynb0) this.f).get();
            case 3:
                return (rhh0) ((ynb0) this.g).get();
            case 4:
                return (rhh0) ((ynb0) this.t).get();
            case 5:
                return (rhh0) ((ynb0) this.N0).get();
            case 6:
                return (rhh0) ((ynb0) this.O0).get();
            case 7:
                return (rhh0) ((ynb0) this.d).get();
            case 8:
                return (rhh0) ((ynb0) this.h).get();
            case 9:
                return (rhh0) ((ynb0) this.i).get();
            case 10:
                return (rhh0) ((ynb0) this.X).get();
            case 11:
                return (rhh0) ((ynb0) this.Z).get();
            case 12:
                return (rhh0) ((ynb0) this.b).get();
            case 13:
                return (rhh0) ((ynb0) this.Y).get();
            default:
                eg.o();
                return null;
        }
    }

    public int o() {
        return 0;
    }

    public yfu p() {
        daq daqVar = (daq) this.e;
        return new yfu((t2j0) daqVar.f2.get(), (g0l) daqVar.E5.get(), (byte) 15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object r(String str, onm onmVar) {
        utu utuVar;
        if (onmVar instanceof utu) {
            utuVar = (utu) onmVar;
            int i = utuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                utuVar.c = i - Integer.MIN_VALUE;
            } else {
                utuVar = new utu(this, onmVar);
            }
        } else {
            utuVar = new utu(this, onmVar);
        }
        Object objF = utuVar.a;
        int i2 = utuVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.d;
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.S();
            sku0VarP.z();
            hru0VarS.x(sku0VarP);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, (mqz0) null, (prc0) null, 0, (List) null, 494);
            utuVar.c = 1;
            objF = rsc0Var.f(str, trc0Var, utuVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var != null) {
            return new rtu(eqr0.r(wsc0Var, new dlc0[]{dlc0.b}), eqr0.s(wsc0Var, new dlc0[]{dlc0.d}) && wsc0Var.f.E);
        }
        return new rtu(false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(onm onmVar) {
        wtc1 wtc1Var;
        List m231Var;
        if (onmVar instanceof wtc1) {
            wtc1Var = (wtc1) onmVar;
            int i = wtc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wtc1Var.c = i - Integer.MIN_VALUE;
            } else {
                wtc1Var = new wtc1(this, onmVar);
            }
        } else {
            wtc1Var = new wtc1(this, onmVar);
        }
        Object objG = wtc1Var.a;
        int i2 = wtc1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                ezb1 ezb1Var = (ezb1) this.Z;
                String str = (String) this.g;
                wtc1Var.c = 1;
                objG = ezb1Var.g(str, wtc1Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objG);
            }
            m231Var = o7h.d1((Iterable) objG, 1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Assisted Curation: failed to load suggested prompts: %s", new Object[]{thA.getMessage()});
        }
        return m231Var instanceof m231 ? z6x.a : m231Var;
    }

    public b6e0 t() {
        w701 w701Var = (w701) ((v5q) this.f).La.get();
        daq daqVar = (daq) this.e;
        return new b6e0(w701Var, (uu00) daqVar.a5.get(), i(), (iac0) ((jly0) this.t).get(), (q8n) daqVar.r2.get(), d().b());
    }

    public yge0 u() {
        daq daqVar = (daq) this.e;
        return new yge0((t2j0) daqVar.f2.get(), daqVar.u1(), (byte) 15);
    }

    public zc80 v() {
        xgi1 xgi1Var = (xgi1) this.d;
        luk lukVar = (luk) xgi1Var.u.get();
        c8o.l(lukVar);
        boolean zB = new u25(lukVar).b();
        kbd kbdVar = (kbd) xgi1Var.t.get();
        c8o.l(kbdVar);
        return new zc80(zB, kbdVar);
    }

    public void w(Object obj) {
        switch (this.a) {
            case 7:
                GoBluetoothService goBluetoothService = (GoBluetoothService) obj;
                goBluetoothService.c = (a84) ((s2q) this.f).get();
                goBluetoothService.e = (gy40) ((jly0) this.O0).get();
                daq daqVar = (daq) this.e;
                goBluetoothService.d = (o4o0) daqVar.F2.get();
                goBluetoothService.b = c();
                goBluetoothService.a = tk00.D((ghp) daqVar.qa.get());
                break;
            case 8:
                MarqueeActivity marqueeActivity = (MarqueeActivity) obj;
                ((t3b1) marqueeActivity).b1 = (jgu) ((s2q) this.i).get();
                ((t3b1) marqueeActivity).c1 = new tuk(xqu.a((s2q) this.c));
                break;
            default:
                o0p0 o0p0Var = (o0p0) obj;
                daq daqVar2 = (daq) this.e;
                Flowable flowable = (Flowable) daqVar2.D5.get();
                s7q s7qVar = (s7q) this.f;
                uw0 uw0Var = (uw0) this.g;
                Flowable flowable2 = (Flowable) daqVar2.D5.get();
                c8o.l(flowable2);
                Resources resources = (Resources) s7qVar.i2.get();
                c8o.l(resources);
                dbv dbvVar = new dbv(flowable2, resources, daqVar2.i());
                Flowable flowable3 = (Flowable) daqVar2.D5.get();
                c8o.l(flowable3);
                Resources resources2 = (Resources) s7qVar.i2.get();
                c8o.l(resources2);
                ffb0 ffb0Var = (ffb0) daqVar2.Zs.get();
                c8o.l(ffb0Var);
                zs21 zs21Var = (zs21) ((jly0) uw0Var.N0).get();
                c8o.l(zs21Var);
                at21 at21Var = new at21(flowable3, resources2, ffb0Var, zs21Var);
                Resources resources3 = (Resources) s7qVar.i2.get();
                c8o.l(resources3);
                xvo xvoVar = (xvo) daqVar2.H8.get();
                c8o.l(xvoVar);
                ln91 ln91Var = (ln91) daqVar2.yf.get();
                c8o.l(ln91Var);
                pqs pqsVar = (pqs) daqVar2.ka.get();
                c8o.l(pqsVar);
                o0p0Var.I1 = new cr6(flowable, p7h.M(new e1p0[]{dbvVar, at21Var, new dbv(resources3, xvoVar, ln91Var, pqsVar)}), (Scheduler) daqVar2.r3.get(), (Scheduler) daqVar2.A2.get(), (Scheduler) daqVar2.z1.get());
                o0p0Var.K1 = new rzo0(new dx0((Flowable) daqVar2.D5.get(), (lzn0) s7qVar.U0.get()), (i8h1) daqVar2.A5.get(), (l6h1) daqVar2.fg.get(), (byte) 1);
                o0p0Var.H1 = new q1p0((Flowable) daqVar2.D5.get(), (yjj1) daqVar2.zq.get(), (unr) s7qVar.J7.get(), (e7p0) s7qVar.f3.get(), (ior) s7qVar.O7.get(), (yqg) daqVar2.J1.get(), (o241) daqVar2.u4.get(), s5h.s((b7p) daqVar2.xf.get()), (ffb0) daqVar2.Zs.get(), (cbv) daqVar2.vq.get(), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), daqVar2.i(), vp90.x((uy90) daqVar2.hc.get()));
                o0p0Var.O1 = (lnn0) s7qVar.F1.get();
                o0p0Var.L1 = (m7p0) daqVar2.q9.get();
                o0p0Var.N1 = new drj0((dg0) daqVar2.Pg.get(), (axn0) s7qVar.vj.get(), (byte) 19);
                o0p0Var.M1 = daqVar2.i();
                o0p0Var.J1 = (o3q) ((jly0) this.O0).get();
                break;
        }
    }

    public l6m0 x() {
        g6m0 g6m0Var = (g6m0) ((jly0) this.h).get();
        bii1 bii1Var = (bii1) this.e;
        return new l6m0(g6m0Var, Integer.valueOf(bii1Var.b.a()), bii1Var.c);
    }

    public bnj0 y() {
        Resources resourcesI = I();
        tbz0 tbz0Var = (tbz0) this.d;
        luk lukVar = (luk) tbz0Var.C.get();
        c8o.l(lukVar);
        hv4 hv4Var = new hv4(false, false, false, lukVar);
        fza1 fza1Var = (fza1) tbz0Var.F.get();
        c8o.l(fza1Var);
        jxa jxaVar = new jxa((byte) 2);
        yqg yqgVar = (yqg) tbz0Var.t.get();
        c8o.l(yqgVar);
        return new bnj0((Object) resourcesI, (Object) g7y.y(hv4Var, fza1Var, jxaVar, yqgVar), (byte) 10);
    }

    public w8r0 z() {
        return new w8r0(false, (luk) ((isc1) this.d).j.get());
    }

    public uw0(daq daqVar, s7q s7qVar, o0p0 o0p0Var) {
        this.a = (byte) 9;
        this.g = this;
        this.e = daqVar;
        this.f = s7qVar;
        this.d = o0p0Var;
        byte b = 3;
        this.h = xqu.b(new p2q(daqVar, s7qVar, this, 1, b));
        this.i = xqu.b(new p2q(daqVar, s7qVar, this, 2, b));
        this.t = new p2q(daqVar, s7qVar, this, 3, b);
        this.X = new p2q(daqVar, s7qVar, this, 4, b);
        this.c = new p2q(daqVar, s7qVar, this, 5, b);
        this.Y = xqu.b(new p2q(daqVar, s7qVar, this, 6, b));
        this.Z = iy81.a(new p2q(daqVar, s7qVar, this, 7, b));
        this.b = new p2q(daqVar, s7qVar, this, 8, b);
        this.N0 = xqu.b(new p2q(daqVar, s7qVar, this, 9, b));
        this.O0 = iy81.a(new p2q(daqVar, s7qVar, this, 0, b));
    }

    public uw0() {
        this.a = (byte) 20;
        this.N0 = h050.Z0;
        this.O0 = h050.Y0;
    }

    public uw0(lzn0 lzn0Var, dg30 dg30Var, rm5 rm5Var, dg8 dg8Var, kt91 kt91Var, q8n q8nVar, yqg yqgVar, uu00 uu00Var, q3c q3cVar, xrk xrkVar, y1t0 y1t0Var, hpd0 hpd0Var, gw70 gw70Var) {
        this.a = (byte) 16;
        this.e = lzn0Var;
        this.f = rm5Var;
        this.g = dg8Var;
        this.h = kt91Var;
        this.Y = q8nVar;
        this.i = yqgVar;
        this.t = uu00Var;
        this.X = q3cVar;
        this.c = xrkVar;
        this.Z = y1t0Var;
        this.b = hpd0Var;
        this.N0 = gw70Var;
        this.d = dg30Var.getApplicationContext();
        this.O0 = new x5j1(dg30Var, (byte) 3);
    }

    public uw0(xrc0 xrc0Var, iyc0 iyc0Var, kt91 kt91Var, z4q z4qVar, op31 op31Var, agc0 agc0Var, zeu zeuVar, r5h r5hVar, ezc ezcVar, hce1 hce1Var, xzj1 xzj1Var, xyu xyuVar, h9n0 h9n0Var, lik1 lik1Var, n6r0 n6r0Var) {
        this.a = (byte) 17;
        this.d = xrc0Var;
        this.e = iyc0Var;
        this.f = kt91Var;
        this.g = op31Var;
        this.h = agc0Var;
        this.i = zeuVar;
        this.t = r5hVar;
        this.X = ezcVar;
        this.c = hce1Var;
        this.Y = xzj1Var;
        this.Z = xyuVar;
        this.b = h9n0Var;
        this.N0 = n6r0Var;
        this.O0 = z4qVar.a(lik1Var);
    }

    public uw0(a1r0 a1r0Var, na naVar, ek1 ek1Var, cpr cprVar, qy30 qy30Var, ffr ffrVar, x631 x631Var, ivy0 ivy0Var, gfr gfrVar, vqb0 vqb0Var, iov0 iov0Var, q5 q5Var, Scheduler scheduler, q8n q8nVar) {
        this.a = (byte) 22;
        this.d = a1r0Var;
        this.e = naVar;
        this.f = ek1Var;
        this.g = cprVar;
        this.h = qy30Var;
        this.i = ffrVar;
        this.t = x631Var;
        this.X = ivy0Var;
        this.Z = gfrVar;
        this.b = vqb0Var;
        this.N0 = iov0Var;
        this.O0 = q5Var;
        this.c = scheduler;
        this.Y = q8nVar;
    }

    public uw0(Context context, String str, oi oiVar, rk11 rk11Var, q8x q8xVar, d0r d0rVar, ocq ocqVar, x4e x4eVar, qcq qcqVar, pob pobVar, s7p s7pVar, inb inbVar, ucq ucqVar) {
        this.a = (byte) 26;
        this.d = context;
        this.e = str;
        this.f = oiVar;
        this.g = rk11Var;
        this.h = q8xVar;
        this.i = d0rVar;
        this.t = ocqVar;
        this.X = x4eVar;
        this.c = qcqVar;
        this.Y = s7pVar;
        this.Z = inbVar;
        this.b = ucqVar;
        this.N0 = new idd1(new nld1(this, (byte) 0));
        this.O0 = new idd1(new nld1(this, (byte) 1));
    }

    public uw0(Context context, Activity activity, lzn0 lzn0Var, String str, xvo xvoVar, dlg1 dlg1Var, a1r0 a1r0Var, f2g1 f2g1Var, vxe1 vxe1Var, fwo fwoVar, ezb1 ezb1Var) {
        this.a = (byte) 25;
        this.d = context;
        this.e = activity;
        this.f = lzn0Var;
        this.g = str;
        this.h = xvoVar;
        this.i = dlg1Var;
        this.t = a1r0Var;
        this.X = f2g1Var;
        this.c = vxe1Var;
        this.Y = fwoVar;
        this.Z = ezb1Var;
        this.b = sap1.a();
        this.N0 = new AtomicBoolean(false);
        this.O0 = new vtc1(this, new Handler(Looper.getMainLooper()));
    }

    public uw0(voe0 voe0Var, m7y0 m7y0Var, uqv0 uqv0Var, zht zhtVar, nfb nfbVar, q881 q881Var, va20 va20Var, ajm0 ajm0Var, wd11 wd11Var, zf5 zf5Var, sua suaVar, bao0 bao0Var, oi oiVar, uic uicVar) {
        this.a = (byte) 21;
        ldd1.q0.getClass();
        this.d = voe0Var;
        this.e = m7y0Var;
        this.f = uqv0Var;
        this.g = zhtVar;
        this.h = nfbVar;
        this.i = q881Var;
        this.t = va20Var;
        this.X = ajm0Var;
        this.c = wd11Var;
        this.Y = zf5Var;
        this.Z = suaVar;
        this.b = bao0Var;
        this.N0 = oiVar;
        this.O0 = uicVar;
    }

    public uw0(aos aosVar, x610 x610Var, Context context, Scheduler scheduler, Scheduler scheduler2, o241 o241Var, Flowable flowable, b7n b7nVar, yqg yqgVar, irb1 irb1Var, dxz0 dxz0Var, ow3 ow3Var, Map map) {
        this.a = (byte) 24;
        this.f = new HashMap(15);
        this.d = context;
        this.g = x610Var;
        this.e = aosVar;
        this.c = scheduler;
        this.h = scheduler2;
        this.i = o241Var;
        this.t = flowable;
        this.X = b7nVar;
        this.Y = yqgVar;
        this.b = irb1Var;
        this.Z = dxz0Var;
        this.O0 = ow3Var;
        this.N0 = map;
    }

    public uw0(Scheduler scheduler, Scheduler scheduler2, Flowable flowable, kh41 kh41Var, d241 d241Var, c241 c241Var, yh41 yh41Var, bx4 bx4Var) {
        this.a = (byte) 23;
        this.b = new CompositeDisposable();
        this.N0 = new ai41(this, (byte) 0);
        this.O0 = new ai41(this, (byte) 1);
        this.c = scheduler;
        this.h = scheduler2;
        this.g = flowable;
        this.f = c241Var;
        this.e = d241Var;
        EmptyDisposable emptyDisposable = EmptyDisposable.a;
        this.Y = emptyDisposable;
        this.Z = emptyDisposable;
        this.t = yh41Var;
        this.X = bx4Var;
        this.d = kh41Var;
    }

    public uw0(isc1 isc1Var, ssc1 ssc1Var, q7r0 q7r0Var) {
        this.a = (byte) 14;
        this.d = isc1Var;
        this.e = q7r0Var;
        this.f = iy81.a(new ipq(this, 1, (byte) 29));
        this.g = iy81.a(new ipq(this, 2, (byte) 29));
        this.h = new ipq(this, 4, (byte) 29);
        this.i = iy81.a(new ipq(this, 3, (byte) 29));
        this.t = xqu.b(new ipq(this, 6, (byte) 29));
        this.X = xqu.b(new ipq(this, 7, (byte) 29));
        this.c = iy81.a(new ipq(this, 5, (byte) 29));
        this.Y = iy81.a(new ipq(this, 8, (byte) 29));
        this.Z = iy81.a(new ipq(this, 9, (byte) 29));
        this.b = iy81.a(new ipq(this, 10, (byte) 29));
        this.N0 = iy81.a(new ipq(this, 0, (byte) 29));
        this.O0 = xqu.b(new ipq(this, 11, (byte) 29));
    }

    public uw0(v001 v001Var, w001 w001Var) {
        this.a = (byte) 12;
        this.d = v001Var;
        this.e = iy81.a(new ykq(this, 2, (byte) 11));
        this.f = iy81.a(new ykq(this, 3, (byte) 11));
        this.g = iy81.a(new ykq(this, 4, (byte) 11));
        this.h = iy81.a(new ykq(this, 5, (byte) 11));
        this.i = iy81.a(new ykq(this, 1, (byte) 11));
        this.t = iy81.a(new ykq(this, 8, (byte) 11));
        this.X = iy81.a(new ykq(this, 9, (byte) 11));
        this.c = iy81.a(new ykq(this, 11, (byte) 11));
        this.Y = iy81.a(new ykq(this, 12, (byte) 11));
        this.Z = iy81.a(new ykq(this, 10, (byte) 11));
        this.b = iy81.a(new ykq(this, 7, (byte) 11));
        this.N0 = iy81.a(new ykq(this, 6, (byte) 11));
        this.O0 = iy81.a(new ykq(this, 0, (byte) 11));
    }

    public uw0(wd01 wd01Var, xd01 xd01Var, q7r0 q7r0Var) {
        this.a = (byte) 13;
        this.d = wd01Var;
        this.e = xd01Var;
        this.f = q7r0Var;
        this.g = xqu.b(new ykq(this, 0, (byte) 14));
        this.h = xqu.b(new ykq(this, 1, (byte) 14));
        this.i = xqu.b(new ykq(this, 2, (byte) 14));
        this.t = xqu.b(new ykq(this, 3, (byte) 14));
        this.X = xqu.b(new ykq(this, 6, (byte) 14));
        this.c = xqu.b(new ykq(this, 5, (byte) 14));
        this.Y = iy81.a(new ykq(this, 4, (byte) 14));
        this.Z = iy81.a(new ykq(this, 7, (byte) 14));
        this.b = xqu.b(new ykq(this, 8, (byte) 14));
        this.N0 = xqu.b(new ykq(this, 9, (byte) 14));
        this.O0 = iy81.a(new ykq(this, 10, (byte) 14));
    }

    public uw0(aeb aebVar, zdb zdbVar) {
        this.a = (byte) 3;
        this.d = aebVar;
        this.e = zdbVar;
        this.f = xqu.b(new b2p(this, 0, (byte) 5));
        this.g = xqu.b(new b2p(this, 2, (byte) 5));
        this.h = xqu.b(new b2p(this, 1, (byte) 5));
        this.i = xqu.b(new b2p(this, 4, (byte) 5));
        this.t = xqu.b(new b2p(this, 3, (byte) 5));
        this.X = xqu.b(new b2p(this, 5, (byte) 5));
        this.c = xqu.b(new b2p(this, 6, (byte) 5));
        this.Y = xqu.b(new b2p(this, 9, (byte) 5));
        this.Z = xqu.b(new b2p(this, 10, (byte) 5));
        this.b = iy81.a(new b2p(this, 8, (byte) 5));
        this.N0 = new b2p(this, 11, (byte) 5);
        this.O0 = xqu.b(new b2p(this, 7, (byte) 5));
    }

    public uw0(j0k j0kVar, ivj ivjVar, l0k l0kVar, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.d = j0kVar;
        this.e = l0kVar;
        this.f = q7r0Var;
        this.g = ivjVar;
        byte b = 1;
        this.h = xqu.b(new d7p(this, 0, b));
        this.i = iy81.a(new d7p(this, b, b));
        this.t = new d7p(this, 3, b);
        this.X = iy81.a(new d7p(this, 2, b));
        this.c = new d7p(this, 5, b);
        this.Y = iy81.a(new d7p(this, 4, b));
        this.Z = new d7p(this, 6, b);
        this.b = new d7p(this, 7, b);
        this.N0 = xqu.b(new d7p(this, 8, b));
        this.O0 = xqu.b(new d7p(this, 9, b));
    }

    public uw0(dw6 dw6Var, fw6 fw6Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.d = dw6Var;
        this.e = q7r0Var;
        this.f = xqu.b(new fwo(this, 0, (byte) 22));
        this.g = new fwo(this, 1, (byte) 22);
        this.h = new fwo(this, 2, (byte) 22);
        this.i = new fwo(this, 3, (byte) 22);
        this.t = new fwo(this, 4, (byte) 22);
        this.X = new fwo(this, 5, (byte) 22);
        this.c = iy81.a(new fwo(this, 6, (byte) 22));
        this.Y = iy81.a(new fwo(this, 7, (byte) 22));
        this.Z = iy81.a(new fwo(this, 8, (byte) 22));
        this.b = iy81.a(new fwo(this, 9, (byte) 22));
        this.N0 = new fwo(this, 10, (byte) 22);
        this.O0 = new fwo(this, 11, (byte) 22);
    }

    public /* synthetic */ uw0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.t = obj7;
        this.X = obj8;
        this.c = obj9;
        this.Y = obj10;
        this.Z = obj11;
        this.b = obj12;
        this.N0 = obj13;
        this.O0 = obj14;
    }

    public uw0(xgi1 xgi1Var, zuj zujVar, bii1 bii1Var, q7r0 q7r0Var) {
        this.a = (byte) 15;
        this.d = xgi1Var;
        this.e = bii1Var;
        this.f = zujVar;
        this.g = q7r0Var;
        this.h = xqu.b(new tsq(this, 0, (byte) 11));
        this.i = xqu.b(new tsq(this, 1, (byte) 11));
        this.t = xqu.b(new tsq(this, 2, (byte) 11));
        this.X = xqu.b(new tsq(this, 3, (byte) 11));
        this.c = xqu.b(new tsq(this, 4, (byte) 11));
        this.Y = xqu.b(new tsq(this, 5, (byte) 11));
        this.Z = xqu.b(new tsq(this, 6, (byte) 11));
        this.b = iy81.a(new tsq(this, 8, (byte) 11));
        this.N0 = iy81.a(new tsq(this, 7, (byte) 11));
        this.O0 = iy81.a(new tsq(this, 9, (byte) 11));
    }

    public uw0(nh20 nh20Var, mh20 mh20Var) {
        this.a = (byte) 6;
        this.d = nh20Var;
        this.e = mh20Var;
        this.f = xqu.b(new chp(this, 2, (byte) 3));
        this.g = new chp(this, 3, (byte) 3);
        this.h = xqu.b(new chp(this, 1, (byte) 3));
        this.i = xqu.b(new chp(this, 5, (byte) 3));
        this.t = xqu.b(new chp(this, 4, (byte) 3));
        this.X = new chp(this, 6, (byte) 3);
        this.c = iy81.a(new chp(this, 0, (byte) 3));
        this.Y = new chp(this, 7, (byte) 3);
        this.Z = xqu.b(new chp(this, 10, (byte) 3));
        this.b = xqu.b(new chp(this, 9, (byte) 3));
        this.N0 = iy81.a(new chp(this, 11, (byte) 3));
        this.O0 = xqu.b(new chp(this, 8, (byte) 3));
    }

    public uw0(tbz0 tbz0Var, qaz0 qaz0Var, q7r0 q7r0Var) {
        this.a = (byte) 11;
        this.d = tbz0Var;
        this.e = q7r0Var;
        this.f = xqu.b(new ykq(this, 0, (byte) 4));
        this.g = new ykq(this, 2, (byte) 4);
        this.h = xqu.b(new ykq(this, 5, (byte) 4));
        this.i = xqu.b(new ykq(this, 4, (byte) 4));
        this.t = xqu.b(new ykq(this, 3, (byte) 4));
        this.X = new ykq(this, 6, (byte) 4);
        this.c = iy81.a(new ykq(this, 7, (byte) 4));
        this.Y = new ykq(this, 8, (byte) 4);
        this.Z = new ykq(this, 9, (byte) 4);
        this.b = new ykq(this, 10, (byte) 4);
        this.N0 = iy81.a(new ykq(this, 1, (byte) 4));
        this.O0 = new ykq(this, 11, (byte) 4);
    }

    public uw0(Set set, mw7 mw7Var, c3s c3sVar, Observable observable, Scheduler scheduler, fnh0 fnh0Var, v5u0 v5u0Var, muz muzVar, tau0 tau0Var, Flowable flowable, RxRouter rxRouter, inh0 inh0Var, sf0 sf0Var, m54 m54Var) {
        this.a = (byte) 1;
        this.d = set;
        this.e = mw7Var;
        this.f = c3sVar;
        this.b = observable;
        this.c = scheduler;
        this.g = fnh0Var;
        this.h = v5u0Var;
        this.i = muzVar;
        this.t = tau0Var;
        this.X = flowable;
        this.Y = rxRouter;
        this.Z = inh0Var;
        this.N0 = sf0Var;
        this.O0 = m54Var;
    }

    public uw0(daq daqVar, GoBluetoothService goBluetoothService) {
        this.a = (byte) 7;
        this.e = daqVar;
        this.d = goBluetoothService;
        byte b = 4;
        this.f = new s2q(daqVar, this, 0, b);
        this.g = xqu.b(new s2q(daqVar, this, 2, b));
        this.h = xqu.b(new s2q(daqVar, this, b, b));
        this.i = new s2q(daqVar, this, 6, b);
        this.t = xqu.b(new s2q(daqVar, this, 5, b));
        this.X = xqu.b(new s2q(daqVar, this, 3, b));
        this.c = xqu.b(new s2q(daqVar, this, 8, b));
        this.Y = xqu.b(new s2q(daqVar, this, 7, b));
        this.Z = xqu.b(iy81.a(new s2q(daqVar, this, 11, b)));
        this.b = xqu.b(new s2q(daqVar, this, 10, b));
        this.N0 = xqu.b(new s2q(daqVar, this, 9, b));
        this.O0 = xqu.b(new s2q(daqVar, this, 1, b));
    }

    public uw0(daq daqVar, MarqueeActivity marqueeActivity) {
        this.a = (byte) 8;
        this.e = daqVar;
        this.d = marqueeActivity;
        byte b = 13;
        this.f = new s2q(daqVar, this, 1, b);
        this.g = new s2q(daqVar, this, 2, b);
        this.h = new s2q(daqVar, this, 3, b);
        this.i = new s2q(daqVar, this, 0, b);
        this.t = xqu.b(new s2q(daqVar, this, 6, b));
        this.X = xqu.b(new s2q(daqVar, this, 5, b));
        this.c = new s2q(daqVar, this, 4, b);
        this.Y = xqu.b(new s2q(daqVar, this, 9, b));
        this.Z = xqu.b(new s2q(daqVar, this, 8, b));
        this.b = new s2q(daqVar, this, 7, b);
        this.N0 = new s2q(daqVar, this, 11, b);
        this.O0 = xqu.b(new s2q(daqVar, this, 10, b));
    }

    public uw0(daq daqVar, v5q v5qVar, q2p0 q2p0Var) {
        this.a = (byte) 10;
        this.e = daqVar;
        this.f = v5qVar;
        this.d = q2p0Var;
        byte b = 14;
        this.g = iy81.a(new p2q(daqVar, v5qVar, this, 0, b));
        this.h = iy81.a(new p2q(daqVar, v5qVar, this, 2, b));
        this.i = iy81.a(new p2q(daqVar, v5qVar, this, 1, b));
        this.t = iy81.a(new p2q(daqVar, v5qVar, this, 3, b));
        this.X = iy81.a(new p2q(daqVar, v5qVar, this, 5, b));
        this.c = new p2q(daqVar, v5qVar, this, 4, b);
        this.Y = iy81.a(new p2q(daqVar, v5qVar, this, 7, b));
        this.Z = iy81.a(new p2q(daqVar, v5qVar, this, 6, b));
        this.b = iy81.a(new p2q(daqVar, v5qVar, this, 8, b));
        this.N0 = iy81.a(new p2q(daqVar, v5qVar, this, 9, b));
        this.O0 = iy81.a(new p2q(daqVar, v5qVar, this, 10, b));
    }
}
