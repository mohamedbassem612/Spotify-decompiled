package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bsp implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bsp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a() {
        ftp ftpVar = (ftp) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                ftpVar.getClass();
                cwq cwqVar = new cwq(27);
                cwqVar.b(AppLifecycleServicePendingIntent.ADD_TO_COLLECTION, ftpVar.d.get());
                cwqVar.b(AppLifecycleServicePendingIntent.BAN_FROM_COLLECTION, ftpVar.e.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYBACK_NOTIFICATION_CLOSE, ftpVar.f.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYER_PAUSE, ftpVar.g.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYER_RESUME, ftpVar.h.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYER_SEEK_BACK_15_SEC, ftpVar.i.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYER_SEEK_FORWARD_15_SEC, ftpVar.j.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYER_SKIP_NEXT, ftpVar.k.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAYER_SKIP_PREV, ftpVar.l.get());
                cwqVar.b(AppLifecycleServicePendingIntent.REMOVE_FROM_COLLECTION, ftpVar.m.get());
                cwqVar.b(AppLifecycleServicePendingIntent.UNBAN_FROM_COLLECTION, ftpVar.n.get());
                cwqVar.b(AppLifecycleServicePendingIntent.NOTIFICATION_CHANGE_SEGMENT, ftpVar.o.get());
                cwqVar.b(AppLifecycleServicePendingIntent.ADD_TO_PLAYLIST, ftpVar.q.get());
                cwqVar.b(AppLifecycleServicePendingIntent.ADD_TO_QUEUE, ftpVar.r.get());
                cwqVar.b(AppLifecycleServicePendingIntent.ADD_TO_YOUR_EPISODE, ftpVar.s.get());
                cwqVar.b(AppLifecycleServicePendingIntent.DISMISS, ftpVar.t.get());
                cwqVar.b(AppLifecycleServicePendingIntent.DOWNLOAD, ftpVar.u.get());
                cwqVar.b(AppLifecycleServicePendingIntent.EMAIL_VERIFY, ftpVar.v.get());
                cwqVar.b(AppLifecycleServicePendingIntent.OPEN_PUSH_SETTINGS, ftpVar.w.get());
                cwqVar.b(AppLifecycleServicePendingIntent.OPEN_URL, ftpVar.x.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PLAY_AND_NAVIGATE, ftpVar.y.get());
                cwqVar.b(AppLifecycleServicePendingIntent.SAVE_ENTITY, ftpVar.z.get());
                cwqVar.b(AppLifecycleServicePendingIntent.START_PLAYBACK, ftpVar.A.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PIP_PLAYER_PAUSE, ftpVar.B.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PIP_PLAYER_RESUME, ftpVar.C.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PIP_PLAYER_SEEK_FORWARD_15_SEC, ftpVar.D.get());
                cwqVar.b(AppLifecycleServicePendingIntent.PIP_PLAYER_SEEK_BACK_15_SEC, ftpVar.E.get());
                LinkedHashMap linkedHashMap = cwqVar.a;
                return new zo5(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
            case 1:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 0);
            case 2:
                return new m1u0(ftpVar.a.b(), (m961) ftpVar.b.get());
            case 3:
                return new m961();
            case 4:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 1);
            case 5:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 2);
            case 6:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 3);
            case 7:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 4);
            case 8:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 5);
            case 9:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 6);
            case 10:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 7);
            case 11:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 8);
            case 12:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 9);
            case 13:
                return new u1u0((m1u0) ftpVar.c.get(), (byte) 10);
            case 14:
                return new ork(ftpVar.a.b(), (m961) ftpVar.b.get(), (byte) 2);
            case 15:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 0);
            case 16:
                ym7 ym7Var = ftpVar.a;
                ym7 ym7Var2 = ftpVar.a;
                return new ewy0(ym7Var.b(), (dma1) ym7Var2.d.get(), (nfa0) ym7Var2.f.get());
            case 17:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 1);
            case 18:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 2);
            case 19:
                return new d((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get());
            case 20:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 3);
            case 21:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 4);
            case 22:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 5);
            case 23:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 6);
            case 24:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 7);
            case 25:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 8);
            case 26:
                return new j1n0((m961) ftpVar.b.get(), ftpVar.a.b(), (ewy0) ftpVar.f18p.get(), (byte) 9);
            case 27:
                return new ork(ftpVar.a.b(), (m961) ftpVar.b.get(), (byte) 6);
            case 28:
                return new ork(ftpVar.a.b(), (m961) ftpVar.b.get(), (byte) 7);
            case 29:
                return new ork(ftpVar.a.b(), (m961) ftpVar.b.get(), (byte) 8);
            case 30:
                return new ork(ftpVar.a.b(), (m961) ftpVar.b.get(), (byte) 9);
            case 31:
                return new wo70((gzm0) ftpVar.G.get(), new ArrayList((List) ftpVar.I.get()), igu.a.M(1), b3s.c.M(1));
            case 32:
                return new gzm0();
            case 33:
                return p7h.O(new po70[]{new uue0(), new k0n0((j0n0) ftpVar.a.g.get()), ftpVar.H.get()});
            case 34:
                ym7 ym7Var3 = ftpVar.a;
                ym7 ym7Var4 = ftpVar.a;
                return new ap5(ym7Var3.b(), (t961) ym7Var4.e.get(), new cd30((Context) ym7Var4.c.get()));
            case 35:
                return cto1.q(krw0.i);
            case 36:
                return new f15();
            case 37:
                return new jtl1();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object b() {
        s24 s24Var = (s24) this.c;
        byte b = 7;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                s24Var.getClass();
                n9o0 n9o0Var = (n9o0) s24Var.b;
                phh1 phh1Var = (phh1) n9o0Var.H.get();
                c8o.l(phh1Var);
                qhh1 qhh1Var = (qhh1) n9o0Var.J.get();
                c8o.l(qhh1Var);
                luk lukVar = (luk) n9o0Var.j.get();
                c8o.l(lukVar);
                eys eysVar = new eys(phh1Var, qhh1Var, new nh4(false, lukVar));
                jih1 jih1Var = (jih1) n9o0Var.I.get();
                c8o.l(jih1Var);
                iih1 iih1VarV = i7v0.v(new s3h(new n3h(new p3h(i7v0.i(), i7v0.u(), i7v0.j()))));
                jma jmaVar = new jma((byte) 11);
                yqg yqgVar = (yqg) n9o0Var.k.get();
                c8o.l(yqgVar);
                rpv0 rpv0Var = new rpv0(new jnq(yqgVar), (byte) 21);
                o241 o241Var = (o241) n9o0Var.l.get();
                c8o.l(o241Var);
                String str = ((o9o0) s24Var.c).a;
                c8o.m(str);
                o6v0 o6v0Var = (o6v0) ((jly0) ((i6v0) ((jly0) s24Var.g).get()).a.d).get();
                c8o.m(o6v0Var);
                zr00 zr00Var = (zr00) n9o0Var.n.get();
                c8o.l(zr00Var);
                yh2 yh2Var = (yh2) n9o0Var.f56p.get();
                c8o.l(yh2Var);
                luk lukVar2 = (luk) n9o0Var.j.get();
                c8o.l(lukVar2);
                return new zdz(eysVar, jih1Var, iih1VarV, jmaVar, rpv0Var, o241Var, str, o6v0Var, zr00Var, yh2Var, new vg4(true, lukVar2));
            case 1:
                skm skmVar = (skm) ((n9o0) s24Var.b).g.get();
                c8o.l(skmVar);
                ruz ruzVarA = ((cyp) ((jly0) s24Var.e).get()).a();
                gn10 gn10Var = mno1.p;
                String str2 = (String) ((n9o0) s24Var.b).D.get();
                c8o.l(str2);
                return skmVar.a(ruzVarA, d8.b(gn10Var, str2, (lik1) ((bsp) s24Var.f).get(), new a690(gn10Var)), ((cyp) ((jly0) s24Var.e).get()).d());
            case 2:
                t8u0 t8u0Var = (t8u0) ((n9o0) s24Var.b).m.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) s24Var.d, t8u0Var);
            case 3:
                lik1 lik1Var = nik1.x2;
                c8o.m(lik1Var);
                return lik1Var;
            case 4:
                jly0 jly0Var = (jly0) s24Var.N0;
                n9o0 n9o0Var2 = (n9o0) s24Var.b;
                ewn0 ewn0Var = new ewn0(jly0Var.get(), (byte) 26);
                lzn0 lzn0Var = (lzn0) n9o0Var2.d.get();
                c8o.l(lzn0Var);
                gnd1 gnd1Var = new gnd1(lzn0Var);
                lik1 lik1Var2 = (lik1) ((bsp) s24Var.f).get();
                i8h1 i8h1Var = (i8h1) n9o0Var2.e.get();
                c8o.l(i8h1Var);
                esa1 esa1Var = new esa1((Object) gnd1Var, (Object) new v9h1(i8h1Var, lik1Var2), (byte) 20);
                Context context = (Context) n9o0Var2.b.get();
                c8o.l(context);
                return new r8e0(ewn0Var, esa1Var, f7z.y(new uf0(context)), new v9c(new cua((byte) 7), (byte) 9));
            case 5:
                n9o0 n9o0Var3 = (n9o0) s24Var.b;
                n9o0 n9o0Var4 = (n9o0) s24Var.b;
                kly0 kly0Var = n9o0Var3.r;
                Activity activity = (Activity) n9o0Var3.a.get();
                c8o.l(activity);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
                Activity activity2 = (Activity) n9o0Var4.a.get();
                c8o.l(activity2);
                vx40 vx40Var = new vx40(activity2);
                jh51 jh51Var = (jh51) n9o0Var3.q.get();
                c8o.l(jh51Var);
                p01 p01Var = new p01(o4z.class, new q4z(vx40Var, jh51Var));
                xfx xfxVar = (xfx) kly0Var.get();
                c8o.l(xfxVar);
                rxr rxrVar = (rxr) ((jly0) s24Var.Y).get();
                luk lukVar3 = (luk) n9o0Var4.j.get();
                c8o.l(lukVar3);
                do4 do4Var = new do4(lukVar3);
                bsp bspVar = (bsp) s24Var.Z;
                yqg yqgVar2 = (yqg) n9o0Var3.k.get();
                c8o.l(yqgVar2);
                bf3 bf3Var = new bf3(yqgVar2);
                f6g1 f6g1Var = (f6g1) n9o0Var3.G.get();
                c8o.l(f6g1Var);
                p01 p01Var2 = new p01(q9z.class, new snm(new bjx(xfxVar, rxrVar, do4Var, bspVar, bf3Var, f6g1Var, (byte) 1), (byte) 1));
                xfx xfxVar2 = (xfx) kly0Var.get();
                c8o.l(xfxVar2);
                return new d7v0(new eyh0(layoutInflaterFrom, t380.u(p01Var, p01Var2, new p01(qnm.class, new snm(new ham(xfxVar2, (rxr) ((jly0) s24Var.Y).get(), (byte) 4), (byte) 0)))), new e7v0());
            case 6:
                jly0 jly0Var2 = (jly0) s24Var.g;
                n9o0 n9o0Var5 = (n9o0) s24Var.b;
                h6v0 h6v0Var = (h6v0) ((i6v0) jly0Var2.get()).a.b.get();
                c8o.m(h6v0Var);
                bsp bspVar2 = (bsp) s24Var.f;
                dlg1 dlg1VarK0 = s24Var.k0();
                y5v0 y5v0Var = (y5v0) n9o0Var5.y.get();
                c8o.l(y5v0Var);
                y390 y390Var = (y390) n9o0Var5.o.get();
                c8o.l(y390Var);
                iac0 iac0Var = (Activity) n9o0Var5.a.get();
                c8o.l(iac0Var);
                wr00 wr00VarA = y390Var.a(iac0Var, r6h1.c);
                yh2 yh2Var2 = (yh2) n9o0Var5.f56p.get();
                c8o.l(yh2Var2);
                aod aodVar = new aod(wr00VarA, yh2Var2, (byte) 29);
                e7p0 e7p0Var = (e7p0) n9o0Var5.s.get();
                c8o.l(e7p0Var);
                luk lukVar4 = (luk) n9o0Var5.j.get();
                c8o.l(lukVar4);
                eo4 eo4Var = new eo4(false, false, lukVar4);
                c3s c3sVar = (c3s) n9o0Var5.x.get();
                c8o.l(c3sVar);
                iac0 iac0Var2 = (Activity) n9o0Var5.a.get();
                c8o.l(iac0Var2);
                Scheduler scheduler = (Scheduler) n9o0Var5.f.get();
                c8o.l(scheduler);
                oxr oxrVar = new oxr(h6v0Var, bspVar2, dlg1VarK0, y5v0Var, aodVar, e7p0Var, eo4Var, c3sVar, iac0Var2, scheduler);
                lzn0 lzn0Var2 = (lzn0) n9o0Var5.d.get();
                c8o.l(lzn0Var2);
                dlg1 dlg1VarK1 = s24Var.k0();
                ayl aylVar = (ayl) n9o0Var5.v.get();
                c8o.l(aylVar);
                zvu zvuVar = (zvu) n9o0Var5.t.get();
                c8o.l(zvuVar);
                iac0 iac0Var3 = (Activity) n9o0Var5.a.get();
                c8o.l(iac0Var3);
                muu muuVarM = uou0.m(zvuVar, iac0Var3);
                lik1 lik1Var3 = (lik1) ((bsp) s24Var.f).get();
                drp0 drp0Var = (drp0) n9o0Var5.F.get();
                c8o.l(drp0Var);
                tjq tjqVar = new tjq(dlg1VarK1, aylVar, muuVarM, lik1Var3, drp0Var);
                lik1 lik1Var4 = (lik1) ((bsp) s24Var.f).get();
                o241 o241Var2 = (o241) n9o0Var5.l.get();
                c8o.l(o241Var2);
                a6z a6zVar = (a6z) n9o0Var5.A.get();
                c8o.l(a6zVar);
                s24Var.g0();
                dlg1 dlg1VarK2 = s24Var.k0();
                i4q i4qVar = (i4q) n9o0Var5.z.get();
                c8o.l(i4qVar);
                waz0 waz0Var = (waz0) n9o0Var5.B.get();
                c8o.l(waz0Var);
                tzo tzoVar = new tzo(new p68(lik1Var4, o241Var2, a6zVar, dlg1VarK2, i4qVar, true, waz0Var), b);
                zxl zxlVar = (zxl) n9o0Var5.w.get();
                c8o.l(zxlVar);
                zfr zfrVar = new zfr(zxlVar, s24Var.g0(), (byte) 13);
                xh71 xh71Var = (xh71) n9o0Var5.i.get();
                c8o.l(xh71Var);
                nl51 nl51Var = new nl51(xh71Var, (byte) 7);
                dlg1 dlg1VarK3 = s24Var.k0();
                lik1 lik1Var5 = (lik1) ((bsp) s24Var.f).get();
                oj3 oj3Var = (oj3) n9o0Var5.h.get();
                c8o.l(oj3Var);
                return new rxr(oxrVar, lzn0Var2, tjqVar, tzoVar, zfrVar, nl51Var, dlg1VarK3, lik1Var5, oj3Var);
            case 7:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new sfs(yon1.k6(), (lik1) ((bsp) s24Var.f).get(), r6h1.c);
            case 8:
                n9o0 n9o0Var6 = (n9o0) s24Var.b;
                n9o0 n9o0Var7 = (n9o0) s24Var.b;
                Scheduler scheduler2 = (Scheduler) n9o0Var6.f.get();
                c8o.l(scheduler2);
                r8e0 r8e0Var = (r8e0) ((g5t) s24Var.t).get();
                nbc nbcVar = new nbc((byte) 9);
                Activity activity3 = (Activity) n9o0Var7.a.get();
                c8o.l(activity3);
                lik1 lik1Var6 = (lik1) ((bsp) s24Var.f).get();
                ufs ufsVar = (ufs) n9o0Var7.C.get();
                c8o.l(ufsVar);
                otu otuVar = new otu(ufsVar);
                zwa zwaVar = new zwa(new cce((lik1) ((bsp) s24Var.f).get(), new jma((byte) 7)), (byte) 8);
                luk lukVar5 = (luk) n9o0Var7.j.get();
                c8o.l(lukVar5);
                laz lazVar = new laz(new vxr(activity3, lik1Var6, otuVar, zwaVar, true, false, new do4(lukVar5).a(), ((Boolean) n9o0Var7.E.get()).booleanValue()), (byte) 0);
                lik1 lik1Var7 = (lik1) ((bsp) s24Var.f).get();
                cce cceVar = new cce((lik1) ((bsp) s24Var.f).get(), new jma((byte) 7));
                ufs ufsVar2 = (ufs) n9o0Var7.C.get();
                c8o.l(ufsVar2);
                return new q8e0(scheduler2, r8e0Var, new t7y(nbcVar, lazVar, new ogr(new k9r(lik1Var7, cceVar, new otu(ufsVar2), (byte) 14), (byte) 3), (byte) 5), (zdz) ((jly0) s24Var.h).get(), new nbc((byte) 9));
            case 9:
                rxr rxrVar2 = (rxr) ((jly0) s24Var.Y).get();
                luk lukVar6 = (luk) ((n9o0) s24Var.b).j.get();
                c8o.l(lukVar6);
                return new nlu(rxrVar2, new do4(lukVar6).c());
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object c() {
        aup aupVar = (aup) this.c;
        d3p d3pVar = (d3p) aupVar.h;
        byte b = this.b;
        if (b == 0) {
            r2r r2rVar = (r2r) ((s3p0) ((h72) d3pVar.a).b).u.get();
            c8o.l(r2rVar);
            t701 t701Var = (t701) ((s3p0) ((h72) d3pVar.a).b).v.get();
            c8o.l(t701Var);
            six0 six0Var = (six0) ((s3p0) ((h72) d3pVar.a).b).w.get();
            c8o.l(six0Var);
            n6r0 n6r0VarI = aupVar.i();
            iac0 iac0Var = (iac0) aupVar.b.get();
            csy csyVar = (csy) ((s3p0) ((h72) d3pVar.a).b).a.get();
            c8o.l(csyVar);
            return foo1.B(r2rVar, t701Var, six0Var, n6r0VarI, iac0Var, csyVar);
        }
        byte b2 = 1;
        if (b == 1) {
            return (r3p0) ((h72) d3pVar.a).c;
        }
        if (b == 2) {
            dg30 dg30Var = (dg30) ((s3p0) ((h72) d3pVar.a).b).b.get();
            c8o.l(dg30Var);
            pqq0 pqq0Var = (pqq0) aupVar.d.get();
            n2p0 n2p0Var = (n2p0) ((s3p0) ((h72) d3pVar.a).b).s.get();
            c8o.l(n2p0Var);
            t2p0 t2p0Var = (t2p0) ((s3p0) ((h72) d3pVar.a).b).g.get();
            c8o.l(t2p0Var);
            luk lukVar = (luk) ((s3p0) ((h72) d3pVar.a).b).f.get();
            c8o.l(lukVar);
            return new hnl(new ah4(false, false, lukVar), t2p0Var, n2p0Var, dg30Var, pqq0Var, (byte) 0);
        }
        if (b == 3) {
            dg30 dg30Var2 = (dg30) ((s3p0) ((h72) d3pVar.a).b).b.get();
            c8o.l(dg30Var2);
            return dg30Var2.getResources().getConfiguration().orientation == 1 ? pqq0.a : pqq0.b;
        }
        if (b == 4) {
            return new PublishProcessor();
        }
        if (b != 5) {
            jah.e(b);
            return null;
        }
        h72 h72Var = (h72) d3pVar.a;
        r3p0 r3p0Var = (r3p0) h72Var.c;
        Flowable flowable = (Flowable) ((s3p0) h72Var.b).m.get();
        c8o.l(flowable);
        t8u0 t8u0Var = (t8u0) ((s3p0) ((h72) d3pVar.a).b).n.get();
        c8o.l(t8u0Var);
        Scheduler scheduler = (Scheduler) ((s3p0) ((h72) d3pVar.a).b).f73p.get();
        c8o.l(scheduler);
        loc1 loc1Var = new loc1();
        yqg yqgVar = (yqg) ((s3p0) ((h72) d3pVar.a).b).h.get();
        c8o.l(yqgVar);
        cyp cypVarA = t8u0Var.a(((zf30) r3p0Var).s1);
        return new uqb1(new vqb1(cypVarA, flowable, loc1Var, scheduler, yqgVar), cypVarA, b2);
    }

    private final Object d() {
        wj3 wj3Var = (wj3) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                r2p0 r2p0Var = (r2p0) wj3Var.c;
                v3p0 v3p0Var = (v3p0) wj3Var.b;
                r2p0 r2p0Var2 = (r2p0) wj3Var.c;
                Flowable flowableM = r2p0Var.m();
                c8o.l(flowableM);
                o241 o241VarR = r2p0Var.r();
                c8o.l(o241VarR);
                List listK = r2p0Var.k();
                c8o.l(listK);
                rzo0 rzo0Var = new rzo0(flowableM, o241VarR, listK);
                p4p0 p4p0Var = (p4p0) ((jly0) wj3Var.e).get();
                ynb0 ynb0VarA = xqu.a((jly0) wj3Var.f);
                Flowable flowableM2 = r2p0Var.m();
                c8o.l(flowableM2);
                Scheduler schedulerC = r2p0Var.c();
                c8o.l(schedulerC);
                Scheduler schedulerJ = r2p0Var.j();
                c8o.l(schedulerJ);
                w4p0 w4p0Var = (w4p0) v3p0Var.b.get();
                c8o.l(w4p0Var);
                luk lukVarD = r2p0Var2.d();
                c8o.l(lukVarD);
                r24 r24Var = new r24(rzo0Var, p4p0Var, ynb0VarA, flowableM2, schedulerC, schedulerJ, w4p0Var, new vu4(false, false, false, lukVarD));
                xfx xfxVarH = r2p0Var2.h();
                c8o.l(xfxVarH);
                ewx ewxVar = new ewx(new ogr(xfxVarH));
                o2p0 o2p0Var = (o2p0) ((jly0) wj3Var.g).get();
                bsp bspVar = (bsp) wj3Var.i;
                bsp bspVar2 = (bsp) wj3Var.t;
                bsp bspVar3 = (bsp) wj3Var.X;
                ror rorVarE = r2p0Var2.e();
                c8o.l(rorVarE);
                w4p0 w4p0Var2 = (w4p0) v3p0Var.b.get();
                c8o.l(w4p0Var2);
                luk lukVarD2 = r2p0Var2.d();
                c8o.l(lukVarD2);
                return new u4p0(r24Var, ewxVar, o2p0Var, bspVar, bspVar2, bspVar3, rorVarE, w4p0Var2, new vu4(false, false, false, lukVarD2));
            case 1:
                return new p4p0();
            case 2:
                return new aup(new z2p(wj3Var));
            case 3:
                return new o2p0();
            case 4:
                i8h1 i8h1VarD = ((s4p0) ((bsp) wj3Var.h).get()).d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 5:
                s4p0 s4p0Var = (s4p0) ((v3p0) wj3Var.b).d.get();
                c8o.l(s4p0Var);
                return s4p0Var;
            case 6:
                l6h1 l6h1VarE = ((s4p0) ((bsp) wj3Var.h).get()).e();
                c8o.m(l6h1VarE);
                return l6h1VarE;
            case 7:
                n7h1 n7h1VarF = ((s4p0) ((bsp) wj3Var.h).get()).f();
                c8o.m(n7h1VarF);
                return n7h1VarF;
            case 8:
                Flowable flowableM3 = ((r2p0) wj3Var.c).m();
                c8o.l(flowableM3);
                Scheduler schedulerJ2 = ((r2p0) wj3Var.c).j();
                c8o.l(schedulerJ2);
                return f2u0.m(flowableM3, schedulerJ2);
            case 9:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new cbr0(new dbr0[]{new bn70(yon1.X2(), nik1.p1, (nar0) null), new qnr0(new pnr0(onr0.a, 3)), new t1r0(true), new s9h1(14, true, false, false), new tc30(4), new t7r0(Collections.singletonMap("npv_impl", "pageapi"))}, false);
            case 10:
                dg30 dg30VarA = ((r2p0) wj3Var.c).a();
                c8o.l(dg30VarA);
                lzn0 lzn0Var = (lzn0) ((v3p0) wj3Var.b).c.get();
                c8o.l(lzn0Var);
                return new u3p0(dg30VarA, lzn0Var, (cbr0) ((jly0) wj3Var.N0).get());
            case 11:
                dg30 dg30VarA2 = ((r2p0) wj3Var.c).a();
                c8o.l(dg30VarA2);
                return new ncs(dg30VarA2.getResources().getConfiguration().orientation == 1 ? pqq0.a : pqq0.b, (u3p0) ((jly0) wj3Var.O0).get(), new tr0(dg30VarA2, (byte) 4));
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        n2p0 n2p0Var;
        aup aupVar = (aup) this.c;
        z2p z2pVar = (z2p) aupVar.h;
        byte b = this.b;
        switch (b) {
            case 0:
                return ((q7r0) ((wj3) z2pVar.b).d).a;
            case 1:
                r2r r2rVarF = ((r2p0) ((wj3) z2pVar.b).c).f();
                c8o.l(r2rVarF);
                t701 t701VarO = ((r2p0) ((wj3) z2pVar.b).c).o();
                c8o.l(t701VarO);
                six0 six0VarN = ((r2p0) ((wj3) z2pVar.b).c).n();
                c8o.l(six0VarN);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarX2 = yon1.X2();
                iac0 iac0Var = (iac0) aupVar.b.get();
                csy csyVarI = ((r2p0) ((wj3) z2pVar.b).c).i();
                c8o.l(csyVarI);
                return foo1.B(r2rVarF, t701VarO, six0VarN, p6r0VarX2, iac0Var, csyVarI);
            case 2:
                iac0 iac0Var2 = ((q7r0) ((wj3) z2pVar.b).d).d.c;
                c8o.m(iac0Var2);
                return iac0Var2;
            case 3:
                dg30 dg30VarA = ((r2p0) ((wj3) z2pVar.b).c).a();
                c8o.l(dg30VarA);
                pqq0 pqq0Var = (pqq0) aupVar.d.get();
                r2p0 r2p0Var = (r2p0) ((wj3) z2pVar.b).c;
                switch (r2p0Var.a) {
                    case 0:
                        n2p0Var = (n2p0) r2p0Var.o.get();
                        break;
                    default:
                        n2p0Var = (n2p0) r2p0Var.o.get();
                        break;
                }
                n2p0 n2p0Var2 = n2p0Var;
                c8o.l(n2p0Var2);
                t2p0 t2p0Var = (t2p0) ((jly0) ((wj3) z2pVar.b).P0).get();
                c8o.l(t2p0Var);
                luk lukVarD = ((r2p0) ((wj3) z2pVar.b).c).d();
                c8o.l(lukVarD);
                return new hnl(new ah4(false, false, lukVarD), t2p0Var, n2p0Var2, dg30VarA, pqq0Var, (byte) 1);
            case 4:
                dg30 dg30VarA2 = ((r2p0) ((wj3) z2pVar.b).c).a();
                c8o.l(dg30VarA2);
                return dg30VarA2.getResources().getConfiguration().orientation == 1 ? pqq0.a : pqq0.b;
            case 5:
                return new PublishProcessor();
            case 6:
                iac0 iac0Var3 = (iac0) aupVar.b.get();
                Flowable flowableM = ((r2p0) ((wj3) z2pVar.b).c).m();
                c8o.l(flowableM);
                t8u0 t8u0VarL = ((r2p0) ((wj3) z2pVar.b).c).l();
                c8o.l(t8u0VarL);
                Scheduler schedulerJ = ((r2p0) ((wj3) z2pVar.b).c).j();
                c8o.l(schedulerJ);
                loc1 loc1Var = new loc1();
                yqg yqgVarB = ((r2p0) ((wj3) z2pVar.b).c).b();
                c8o.l(yqgVarB);
                cyp cypVarA = t8u0VarL.a(iac0Var3.getLifecycle());
                return new uqb1(new vqb1(cypVarA, flowableM, loc1Var, schedulerJ, yqgVarB), cypVarA, (byte) 2);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        wdm wdmVar = (wdm) this.c;
        v4p0 v4p0Var = (v4p0) wdmVar.b;
        r2p0 r2p0Var = (r2p0) wdmVar.c;
        byte b = this.b;
        switch (b) {
            case 0:
                Flowable flowableM = r2p0Var.m();
                c8o.l(flowableM);
                o241 o241VarR = r2p0Var.r();
                c8o.l(o241VarR);
                List listK = r2p0Var.k();
                c8o.l(listK);
                rzo0 rzo0Var = new rzo0(flowableM, o241VarR, listK);
                p4p0 p4p0Var = (p4p0) ((jly0) wdmVar.e).get();
                ynb0 ynb0VarA = xqu.a((jly0) wdmVar.f);
                Flowable flowableM2 = r2p0Var.m();
                c8o.l(flowableM2);
                Scheduler schedulerC = r2p0Var.c();
                c8o.l(schedulerC);
                Scheduler schedulerJ = r2p0Var.j();
                c8o.l(schedulerJ);
                w4p0 w4p0Var = (w4p0) v4p0Var.d.get();
                luk lukVarD = r2p0Var.d();
                c8o.l(lukVarD);
                r24 r24Var = new r24(rzo0Var, p4p0Var, ynb0VarA, flowableM2, schedulerC, schedulerJ, w4p0Var, new vu4(false, false, false, lukVarD));
                xfx xfxVarH = r2p0Var.h();
                c8o.l(xfxVarH);
                ewx ewxVar = new ewx(new ogr(xfxVarH));
                o2p0 o2p0Var = (o2p0) ((jly0) wdmVar.g).get();
                bsp bspVar = (bsp) wdmVar.i;
                bsp bspVar2 = (bsp) wdmVar.t;
                bsp bspVar3 = (bsp) wdmVar.X;
                ror rorVarE = r2p0Var.e();
                c8o.l(rorVarE);
                w4p0 w4p0Var2 = (w4p0) v4p0Var.d.get();
                luk lukVarD2 = r2p0Var.d();
                c8o.l(lukVarD2);
                return new u4p0(r24Var, ewxVar, o2p0Var, bspVar, bspVar2, bspVar3, rorVarE, w4p0Var2, new vu4(false, false, false, lukVarD2));
            case 1:
                return new p4p0();
            case 2:
                return new aup(new z2p(wdmVar), (byte) 0);
            case 3:
                return new o2p0();
            case 4:
                i8h1 i8h1VarD = ((s4p0) ((bsp) wdmVar.h).get()).d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 5:
                return (s4p0) v4p0Var.e.get();
            case 6:
                l6h1 l6h1VarE = ((s4p0) ((bsp) wdmVar.h).get()).e();
                c8o.m(l6h1VarE);
                return l6h1VarE;
            case 7:
                n7h1 n7h1VarF = ((s4p0) ((bsp) wdmVar.h).get()).f();
                c8o.m(n7h1VarF);
                return n7h1VarF;
            case 8:
                return new tfb1();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        aup aupVar = (aup) this.c;
        z2p z2pVar = (z2p) aupVar.h;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return ((q7r0) ((wdm) z2pVar.b).d).a;
            case 1:
                r2r r2rVarF = ((r2p0) ((wdm) z2pVar.b).c).f();
                c8o.l(r2rVarF);
                t701 t701VarO = ((r2p0) ((wdm) z2pVar.b).c).o();
                c8o.l(t701VarO);
                six0 six0VarN = ((r2p0) ((wdm) z2pVar.b).c).n();
                c8o.l(six0VarN);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarZ2 = yon1.Z2();
                iac0 iac0Var = (iac0) aupVar.b.get();
                csy csyVarI = ((r2p0) ((wdm) z2pVar.b).c).i();
                c8o.l(csyVarI);
                return foo1.B(r2rVarF, t701VarO, six0VarN, p6r0VarZ2, iac0Var, csyVarI);
            case 2:
                iac0 iac0Var2 = ((q7r0) ((wdm) z2pVar.b).d).d.c;
                c8o.m(iac0Var2);
                return iac0Var2;
            case 3:
                dg30 dg30VarA = ((r2p0) ((wdm) z2pVar.b).c).a();
                c8o.l(dg30VarA);
                pqq0 pqq0Var = (pqq0) aupVar.d.get();
                t2p0 t2p0Var = (t2p0) ((jly0) ((wdm) z2pVar.b).Z).get();
                c8o.l(t2p0Var);
                luk lukVarD = ((r2p0) ((wdm) z2pVar.b).c).d();
                c8o.l(lukVarD);
                return new hnl(new ah4(false, false, lukVarD), t2p0Var, dg30VarA, pqq0Var);
            case 4:
                return pqq0.a;
            case 5:
                return new PublishProcessor();
            case 6:
                iac0 iac0Var3 = (iac0) aupVar.b.get();
                Flowable flowableM = ((r2p0) ((wdm) z2pVar.b).c).m();
                c8o.l(flowableM);
                t8u0 t8u0VarL = ((r2p0) ((wdm) z2pVar.b).c).l();
                c8o.l(t8u0VarL);
                Scheduler schedulerJ = ((r2p0) ((wdm) z2pVar.b).c).j();
                c8o.l(schedulerJ);
                loc1 loc1Var = new loc1();
                yqg yqgVarB = ((r2p0) ((wdm) z2pVar.b).c).b();
                c8o.l(yqgVarB);
                cyp cypVarA = t8u0VarL.a(iac0Var3.getLifecycle());
                return new uqb1(new vqb1(cypVarA, flowableM, loc1Var, schedulerJ, yqgVarB), cypVarA, b);
            default:
                jah.e(b2);
                return null;
        }
    }

    public final Object get() {
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 0;
        byte b4 = 4;
        byte b5 = 3;
        byte b6 = 2;
        byte b7 = 1;
        Object obj = this.c;
        byte b8 = this.b;
        switch (b) {
            case 0:
                if (b8 == 0) {
                    return pzm.h((mos) ((qni0) ((g1i) obj).b).h.get());
                }
                if (b8 == 1) {
                    return new yrp(this);
                }
                if (b8 == 2) {
                    return new zrp(this);
                }
                if (b8 == 3) {
                    return new asp(this);
                }
                jah.e(b8);
                return null;
            case 1:
                rbj0 rbj0Var = (rbj0) ((a680) obj).a;
                if (b8 == 0) {
                    bfd bfdVar = (bfd) rbj0Var.d.get();
                    c8o.l(bfdVar);
                    return bfdVar;
                }
                if (b8 == 1) {
                    lzn0 lzn0Var = (lzn0) rbj0Var.c.get();
                    c8o.l(lzn0Var);
                    return lzn0Var;
                }
                if (b8 == 2) {
                    kt91 kt91Var = (kt91) rbj0Var.f.get();
                    c8o.l(kt91Var);
                    return kt91Var;
                }
                if (b8 == 3) {
                    r35 r35Var = (r35) rbj0Var.g.get();
                    c8o.l(r35Var);
                    return r35Var;
                }
                if (b8 == 4) {
                    return pzm.h((mos) rbj0Var.k.get());
                }
                jah.e(b8);
                return null;
            case 2:
                c21 c21Var = (c21) obj;
                j3q j3qVar = (j3q) c21Var.b;
                switch (b8) {
                    case 0:
                        return w3p0.q((vqb1) ((jly0) c21Var.c).get());
                    case 1:
                        Flowable flowable = (Flowable) j3qVar.b.D5.get();
                        c8o.l(flowable);
                        loc1 loc1Var = new loc1();
                        Scheduler scheduler = (Scheduler) j3qVar.b.z1.get();
                        c8o.l(scheduler);
                        t8u0 t8u0Var = (t8u0) j3qVar.b.d9.get();
                        c8o.l(t8u0Var);
                        b4p0 b4p0Var = (b4p0) j3qVar.d.b;
                        yqg yqgVar = (yqg) j3qVar.b.J1.get();
                        c8o.l(yqgVar);
                        return w3p0.y(flowable, loc1Var, scheduler, t8u0Var, b4p0Var, yqgVar);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) c21Var.d).get()), (Flowable) ((jly0) c21Var.e).get(), (Flowable) ((jly0) c21Var.f).get(), c21Var.d());
                    case 3:
                        Flowable flowable2 = (Flowable) ((jly0) c21Var.d).get();
                        Scheduler scheduler2 = (Scheduler) j3qVar.b.z1.get();
                        c8o.l(scheduler2);
                        yqg yqgVar2 = (yqg) j3qVar.b.J1.get();
                        c8o.l(yqgVar2);
                        return f2u0.z(flowable2, scheduler2, yqgVar2, c21Var.d());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) c21Var.d).get(), c21Var.d());
                    case 5:
                        return ((vqb1) ((jly0) c21Var.c).get()).b;
                    case 6:
                        i8h1 i8h1Var = (i8h1) j3qVar.b.A5.get();
                        c8o.l(i8h1Var);
                        return i8h1Var;
                    case 7:
                        return new fsp(this, b3);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 3:
                em0 em0Var = (em0) obj;
                j3q j3qVar2 = (j3q) em0Var.b;
                switch (b8) {
                    case 0:
                        return w3p0.q((vqb1) ((jly0) em0Var.c).get());
                    case 1:
                        Flowable flowable3 = (Flowable) j3qVar2.b.D5.get();
                        c8o.l(flowable3);
                        loc1 loc1Var2 = new loc1();
                        Scheduler scheduler3 = (Scheduler) j3qVar2.b.z1.get();
                        c8o.l(scheduler3);
                        t8u0 t8u0Var2 = (t8u0) j3qVar2.b.d9.get();
                        c8o.l(t8u0Var2);
                        b4p0 b4p0Var2 = (b4p0) j3qVar2.d.b;
                        yqg yqgVar3 = (yqg) j3qVar2.b.J1.get();
                        c8o.l(yqgVar3);
                        return w3p0.y(flowable3, loc1Var2, scheduler3, t8u0Var2, b4p0Var2, yqgVar3);
                    case 2:
                        return f2u0.B(em0Var.F0(), (Flowable) ((jly0) em0Var.e).get(), (Flowable) ((jly0) em0Var.f).get(), em0Var.p());
                    case 3:
                        Flowable flowable4 = (Flowable) ((jly0) em0Var.d).get();
                        Scheduler scheduler4 = (Scheduler) j3qVar2.b.z1.get();
                        c8o.l(scheduler4);
                        yqg yqgVar4 = (yqg) j3qVar2.b.J1.get();
                        c8o.l(yqgVar4);
                        return f2u0.z(flowable4, scheduler4, yqgVar4, em0Var.p());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) em0Var.d).get(), em0Var.p());
                    case 5:
                        return ((vqb1) ((jly0) em0Var.c).get()).b;
                    case 6:
                        i8h1 i8h1Var2 = (i8h1) j3qVar2.b.A5.get();
                        c8o.l(i8h1Var2);
                        return i8h1Var2;
                    case 7:
                        return new fsp(this, b7);
                    case 8:
                        yqg yqgVar5 = (yqg) j3qVar2.b.J1.get();
                        c8o.l(yqgVar5);
                        return new im51(yqgVar5);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 4:
                qqp qqpVar = (qqp) obj;
                a1q a1qVar = (a1q) qqpVar.d;
                if (b8 == 0) {
                    return ((vqb1) ((jly0) qqpVar.b).get()).b;
                }
                if (b8 != 1) {
                    if (b8 == 2) {
                        return w3p0.q((vqb1) ((jly0) qqpVar.b).get());
                    }
                    jah.e(b8);
                    return null;
                }
                Flowable flowable5 = (Flowable) ((daq) a1qVar.b).D5.get();
                c8o.l(flowable5);
                loc1 loc1Var3 = new loc1();
                Scheduler scheduler5 = (Scheduler) ((daq) a1qVar.b).z1.get();
                c8o.l(scheduler5);
                t8u0 t8u0Var3 = (t8u0) ((daq) a1qVar.b).d9.get();
                c8o.l(t8u0Var3);
                b4p0 b4p0Var3 = (b4p0) ((byp) a1qVar.c).b;
                yqg yqgVar6 = (yqg) ((daq) a1qVar.b).J1.get();
                c8o.l(yqgVar6);
                return w3p0.y(flowable5, loc1Var3, scheduler5, t8u0Var3, b4p0Var3, yqgVar6);
            case 5:
                c21 c21Var2 = (c21) obj;
                j3q j3qVar3 = (j3q) c21Var2.b;
                switch (b8) {
                    case 0:
                        return w3p0.q((vqb1) ((jly0) c21Var2.c).get());
                    case 1:
                        Flowable flowable6 = (Flowable) j3qVar3.b.D5.get();
                        c8o.l(flowable6);
                        loc1 loc1Var4 = new loc1();
                        Scheduler scheduler6 = (Scheduler) j3qVar3.b.z1.get();
                        c8o.l(scheduler6);
                        t8u0 t8u0Var4 = (t8u0) j3qVar3.b.d9.get();
                        c8o.l(t8u0Var4);
                        b4p0 b4p0Var4 = (b4p0) j3qVar3.d.b;
                        yqg yqgVar7 = (yqg) j3qVar3.b.J1.get();
                        c8o.l(yqgVar7);
                        return w3p0.y(flowable6, loc1Var4, scheduler6, t8u0Var4, b4p0Var4, yqgVar7);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) c21Var2.d).get()), (Flowable) ((jly0) c21Var2.e).get(), (Flowable) ((jly0) c21Var2.f).get(), c21Var2.d());
                    case 3:
                        Flowable flowable7 = (Flowable) ((jly0) c21Var2.d).get();
                        Scheduler scheduler7 = (Scheduler) j3qVar3.b.z1.get();
                        c8o.l(scheduler7);
                        yqg yqgVar8 = (yqg) j3qVar3.b.J1.get();
                        c8o.l(yqgVar8);
                        return f2u0.z(flowable7, scheduler7, yqgVar8, c21Var2.d());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) c21Var2.d).get(), c21Var2.d());
                    case 5:
                        return ((vqb1) ((jly0) c21Var2.c).get()).b;
                    case 6:
                        i8h1 i8h1Var3 = (i8h1) j3qVar3.b.A5.get();
                        c8o.l(i8h1Var3);
                        return i8h1Var3;
                    case 7:
                        return new fsp(this, b6);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 6:
                em0 em0Var2 = (em0) obj;
                j3q j3qVar4 = (j3q) em0Var2.b;
                switch (b8) {
                    case 0:
                        return w3p0.q((vqb1) ((jly0) em0Var2.c).get());
                    case 1:
                        Flowable flowable8 = (Flowable) j3qVar4.b.D5.get();
                        c8o.l(flowable8);
                        loc1 loc1Var5 = new loc1();
                        Scheduler scheduler8 = (Scheduler) j3qVar4.b.z1.get();
                        c8o.l(scheduler8);
                        t8u0 t8u0Var5 = (t8u0) j3qVar4.b.d9.get();
                        c8o.l(t8u0Var5);
                        b4p0 b4p0Var5 = (b4p0) j3qVar4.d.b;
                        yqg yqgVar9 = (yqg) j3qVar4.b.J1.get();
                        c8o.l(yqgVar9);
                        return w3p0.y(flowable8, loc1Var5, scheduler8, t8u0Var5, b4p0Var5, yqgVar9);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) em0Var2.d).get()), (Flowable) ((jly0) em0Var2.e).get(), (Flowable) ((jly0) em0Var2.f).get(), em0Var2.p());
                    case 3:
                        Flowable flowable9 = (Flowable) ((jly0) em0Var2.d).get();
                        Scheduler scheduler9 = (Scheduler) j3qVar4.b.z1.get();
                        c8o.l(scheduler9);
                        yqg yqgVar10 = (yqg) j3qVar4.b.J1.get();
                        c8o.l(yqgVar10);
                        return f2u0.z(flowable9, scheduler9, yqgVar10, em0Var2.p());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) em0Var2.d).get(), em0Var2.p());
                    case 5:
                        return ((vqb1) ((jly0) em0Var2.c).get()).b;
                    case 6:
                        i8h1 i8h1Var4 = (i8h1) j3qVar4.b.A5.get();
                        c8o.l(i8h1Var4);
                        return i8h1Var4;
                    case 7:
                        return new fsp(this, b5);
                    case 8:
                        return new gsp(this);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 7:
                em0 em0Var3 = (em0) obj;
                j3q j3qVar5 = (j3q) em0Var3.b;
                switch (b8) {
                    case 0:
                        return w3p0.q((vqb1) ((jly0) em0Var3.c).get());
                    case 1:
                        Flowable flowable10 = (Flowable) j3qVar5.b.D5.get();
                        c8o.l(flowable10);
                        loc1 loc1Var6 = new loc1();
                        Scheduler scheduler10 = (Scheduler) j3qVar5.b.z1.get();
                        c8o.l(scheduler10);
                        t8u0 t8u0Var6 = (t8u0) j3qVar5.b.d9.get();
                        c8o.l(t8u0Var6);
                        b4p0 b4p0Var6 = (b4p0) j3qVar5.d.b;
                        yqg yqgVar11 = (yqg) j3qVar5.b.J1.get();
                        c8o.l(yqgVar11);
                        return w3p0.y(flowable10, loc1Var6, scheduler10, t8u0Var6, b4p0Var6, yqgVar11);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) em0Var3.d).get()), (Flowable) ((jly0) em0Var3.e).get(), (Flowable) ((jly0) em0Var3.f).get(), em0Var3.p());
                    case 3:
                        Flowable flowable11 = (Flowable) ((jly0) em0Var3.d).get();
                        Scheduler scheduler11 = (Scheduler) j3qVar5.b.z1.get();
                        c8o.l(scheduler11);
                        yqg yqgVar12 = (yqg) j3qVar5.b.J1.get();
                        c8o.l(yqgVar12);
                        return f2u0.z(flowable11, scheduler11, yqgVar12, em0Var3.p());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) em0Var3.d).get(), em0Var3.p());
                    case 5:
                        return ((vqb1) ((jly0) em0Var3.c).get()).b;
                    case 6:
                        i8h1 i8h1Var5 = (i8h1) j3qVar5.b.A5.get();
                        c8o.l(i8h1Var5);
                        return i8h1Var5;
                    case 7:
                        return new fsp(this, b4);
                    case 8:
                        yqg yqgVar13 = (yqg) j3qVar5.b.J1.get();
                        c8o.l(yqgVar13);
                        return new im51(yqgVar13);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 8:
                s24 s24Var = (s24) obj;
                switch (b8) {
                    case 0:
                        return w3p0.q((vqb1) ((jly0) s24Var.c).get());
                    case 1:
                        j3q j3qVar6 = (j3q) s24Var.b;
                        j3q j3qVar7 = (j3q) s24Var.b;
                        Flowable flowable12 = (Flowable) j3qVar6.b.D5.get();
                        c8o.l(flowable12);
                        loc1 loc1Var7 = new loc1();
                        Scheduler scheduler12 = (Scheduler) j3qVar7.b.z1.get();
                        c8o.l(scheduler12);
                        t8u0 t8u0Var7 = (t8u0) j3qVar7.b.d9.get();
                        c8o.l(t8u0Var7);
                        b4p0 b4p0Var7 = (b4p0) j3qVar7.d.b;
                        yqg yqgVar14 = (yqg) j3qVar7.b.J1.get();
                        c8o.l(yqgVar14);
                        return w3p0.y(flowable12, loc1Var7, scheduler12, t8u0Var7, b4p0Var7, yqgVar14);
                    case 2:
                        return f2u0.B(s24Var.R(), (Flowable) ((jly0) s24Var.e).get(), (Flowable) ((jly0) s24Var.f).get(), s24Var.u());
                    case 3:
                        jly0 jly0Var = (jly0) s24Var.d;
                        j3q j3qVar8 = (j3q) s24Var.b;
                        Flowable flowable13 = (Flowable) jly0Var.get();
                        Scheduler scheduler13 = (Scheduler) j3qVar8.b.z1.get();
                        c8o.l(scheduler13);
                        yqg yqgVar15 = (yqg) j3qVar8.b.J1.get();
                        c8o.l(yqgVar15);
                        return f2u0.z(flowable13, scheduler13, yqgVar15, s24Var.u());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) s24Var.d).get(), s24Var.u());
                    case 5:
                        return ((vqb1) ((jly0) s24Var.c).get()).b;
                    case 6:
                        i8h1 i8h1Var6 = (i8h1) ((j3q) s24Var.b).b.A5.get();
                        c8o.l(i8h1Var6);
                        return i8h1Var6;
                    case 7:
                        return new fsp(this, b2);
                    case 8:
                        j3q j3qVar9 = (j3q) s24Var.b;
                        daq daqVar = j3qVar9.b;
                        u4q0 u4q0Var = (u4q0) daqVar.em.get();
                        c8o.l(u4q0Var);
                        a1r0 a1r0Var = (a1r0) j3qVar9.c.V0.get();
                        c8o.l(a1r0Var);
                        am30 am30Var = (am30) daqVar.Qb.get();
                        c8o.l(am30Var);
                        p2o0 p2o0Var = new p2o0(u4q0Var, a1r0Var, am30Var, xqu.a((bsp) s24Var.X), (bsp) s24Var.Y, brt.y(), (byte) 1);
                        Flowable flowable14 = (Flowable) ((j3q) s24Var.b).b.D5.get();
                        c8o.l(flowable14);
                        return new zh11(p2o0Var, flowable14);
                    case 9:
                        a1i1 a1i1Var = (a1i1) ((j3q) s24Var.b).c.b.ub.get();
                        c8o.l(a1i1Var);
                        return a1i1Var;
                    case 10:
                        luk lukVarA = ((j3q) s24Var.b).a();
                        c8o.l(lukVarA);
                        return new h05(false, lukVarA);
                    case 11:
                        yqg yqgVar16 = (yqg) ((j3q) s24Var.b).b.J1.get();
                        c8o.l(yqgVar16);
                        return new im51(yqgVar16);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 9:
                k9k k9kVar = (k9k) obj;
                w5k0 w5k0Var = (w5k0) k9kVar.b;
                if (b8 == 0) {
                    q8n q8nVar = (q8n) w5k0Var.f.get();
                    c8o.l(q8nVar);
                    return smo1.e(flo1.l(guo1.B(), q8nVar));
                }
                if (b8 != 1) {
                    if (b8 == 2) {
                        return cwl1.C((q7r0) k9kVar.c);
                    }
                    jah.e(b8);
                    return null;
                }
                d0r d0rVar = (d0r) ((jly0) k9kVar.e).get();
                yfq yfqVar = (yfq) w5k0Var.e.get();
                c8o.l(yfqVar);
                return new r4k0(d0rVar, yfqVar);
            case 10:
                k9k0 k9k0Var = (k9k0) ((qqp) obj).d;
                if (b8 == 0) {
                    f1n0 f1n0Var = (f1n0) k9k0Var.a.get();
                    c8o.l(f1n0Var);
                    return new ud1(f1n0Var, (byte) 2);
                }
                if (b8 == 1) {
                    return new ysp();
                }
                if (b8 != 2) {
                    jah.e(b8);
                    return null;
                }
                f1n0 f1n0Var2 = (f1n0) k9k0Var.a.get();
                c8o.l(f1n0Var2);
                dg30 dg30Var = (dg30) k9k0Var.c.get();
                c8o.l(dg30Var);
                tp91 tp91Var = (tp91) k9k0Var.e.get();
                c8o.l(tp91Var);
                p3q p3qVar = (p3q) k9k0Var.d.get();
                c8o.l(p3qVar);
                u3q u3qVar = (u3q) k9k0Var.f.get();
                c8o.l(u3qVar);
                return new izg(f1n0Var2, tp91Var.a(new pp91(u3qVar.a(), (qp91) null, 1, p3qVar.a(dg30Var.e0()), 78)));
            case 11:
                g1i g1iVar = (g1i) obj;
                hhk0 hhk0Var = (hhk0) g1iVar.b;
                if (b8 != 0) {
                    if (b8 == 1) {
                        return cwl1.C((q7r0) g1iVar.c);
                    }
                    if (b8 != 2) {
                        jah.e(b8);
                        return null;
                    }
                    i8h1 i8h1Var7 = (i8h1) hhk0Var.b.get();
                    c8o.l(i8h1Var7);
                    return i8h1Var7;
                }
                d0r d0rVar2 = (d0r) ((jly0) g1iVar.d).get();
                bgq bgqVar = (bgq) hhk0Var.m.get();
                c8o.l(bgqVar);
                yfq yfqVar2 = (yfq) hhk0Var.l.get();
                c8o.l(yfqVar2);
                qfq qfqVar = (qfq) hhk0Var.n.get();
                c8o.l(qfqVar);
                return new pek0(d0rVar2, bgqVar, yfqVar2, qfqVar);
            case 12:
                k9k k9kVar2 = (k9k) obj;
                if (b8 == 0) {
                    RxRouter rxRouterP = ((asl0) k9kVar2.b).p();
                    c8o.l(rxRouterP);
                    return sdl.q(rxRouterP);
                }
                if (b8 == 1) {
                    return imy0.B((glq) ((jly0) k9kVar2.d).get());
                }
                if (b8 == 2) {
                    return new glq(new a0m(k9kVar2, (byte) 8));
                }
                if (b8 == 3) {
                    return ((glq) ((jly0) k9kVar2.d).get()).a();
                }
                jah.e(b8);
                return null;
            case 13:
                if (b8 == 0) {
                    return new atp(this);
                }
                if (b8 == 1) {
                    return new ygp((byte) 1);
                }
                if (b8 == 2) {
                    return new btp();
                }
                if (b8 == 3) {
                    return new ctp(this);
                }
                jah.e(b8);
                return null;
            case 14:
                c21 c21Var3 = (c21) obj;
                xum0 xum0Var = (xum0) c21Var3.c;
                wum0 wum0Var = (wum0) c21Var3.b;
                if (b8 == 0) {
                    return pzm.h((mos) wum0Var.c.get());
                }
                if (b8 == 1) {
                    uu00 uu00Var = (uu00) wum0Var.d.get();
                    c8o.l(uu00Var);
                    q8n q8nVar2 = (q8n) wum0Var.h.get();
                    c8o.l(q8nVar2);
                    fum0 fum0Var = new fum0(uu00Var, q8nVar2);
                    Resources resources = (Resources) wum0Var.b.get();
                    c8o.l(resources);
                    ynb0 ynb0VarA = xqu.a((bsp) c21Var3.g);
                    yzh1 yzh1Var = (yzh1) wum0Var.f.get();
                    c8o.l(yzh1Var);
                    return new nl9(fum0Var, resources, ynb0VarA, new yo31(yzh1Var, (byte) 28), new iul0(xum0Var.b), new f70((byte) 11));
                }
                if (b8 == 2) {
                    los losVar = (los) ((jly0) c21Var3.e).get();
                    ynb0 ynb0VarA2 = xqu.a((bsp) c21Var3.f);
                    q8n q8nVar3 = (q8n) wum0Var.g.get();
                    c8o.l(q8nVar3);
                    return new gum0(losVar, ynb0VarA2, q8nVar3);
                }
                if (b8 == 3) {
                    lzn0 lzn0Var2 = (lzn0) wum0Var.a.get();
                    c8o.l(lzn0Var2);
                    return lzn0Var2;
                }
                if (b8 == 4) {
                    return new uum0(xqu.a((bsp) c21Var3.i), new iul0(xum0Var.b));
                }
                if (b8 == 5) {
                    return u1n0.z((q7r0) c21Var3.d);
                }
                jah.e(b8);
                return null;
            case 15:
                return a();
            case 16:
                ntp ntpVar = (ntp) obj;
                vi2 vi2Var = ntpVar.b;
                if (b8 == 0) {
                    return new bw20((Observable) ntpVar.d.get());
                }
                if (b8 == 1) {
                    return lmt0.p((Observable) new tzr0((xm41) ntpVar.a.a.get(), ntpVar.c, vi2Var.d(), vi2Var.a()).e, (Scheduler) vi2Var.c.get(), (q8n) vi2Var.d.get(), (db4) vi2Var.e.get(), (lxg) null);
                }
                if (b8 == 2) {
                    return new qx(ntpVar.a(), vi2Var.a(), new ltw0((byte) 0));
                }
                if (b8 == 3) {
                    return new p241((Observable) ntpVar.d.get());
                }
                jah.e(b8);
                return null;
            case 17:
                c21 c21Var4 = (c21) obj;
                z9n0 z9n0Var = (z9n0) c21Var4.b;
                switch (b8) {
                    case 0:
                        s45 s45Var = (zle1) z9n0Var.g.get();
                        c8o.l(s45Var);
                        iac0 iac0Var = ((q7r0) c21Var4.c).d.c;
                        c8o.m(iac0Var);
                        return new joc(s45Var.a("cwp_page_load"), s45Var, UUID.randomUUID().toString(), 7, iac0Var);
                    case 1:
                        xfx xfxVar = (xfx) z9n0Var.h.get();
                        c8o.l(xfxVar);
                        yqg yqgVar17 = (yqg) z9n0Var.l.get();
                        c8o.l(yqgVar17);
                        return new tzv0(xfxVar, yqgVar17);
                    case 2:
                        njv0 njv0Var = (njv0) z9n0Var.i.get();
                        c8o.l(njv0Var);
                        return njv0Var;
                    case 3:
                        return new ptp(this);
                    case 4:
                        lzn0 lzn0Var3 = (lzn0) z9n0Var.b.get();
                        c8o.l(lzn0Var3);
                        return lzn0Var3;
                    case 5:
                        return new dzo(this, (byte) 3);
                    case 6:
                        xfx xfxVar2 = (xfx) z9n0Var.h.get();
                        c8o.l(xfxVar2);
                        lzn0 lzn0Var4 = (lzn0) ((bsp) c21Var4.g).get();
                        agc0 agc0Var = (agc0) z9n0Var.m.get();
                        c8o.l(agc0Var);
                        gw70 gw70Var = (gw70) z9n0Var.j.get();
                        c8o.l(gw70Var);
                        return new d460(xfxVar2, gw70Var, agc0Var, lzn0Var4, false);
                    default:
                        jah.e(b8);
                        return null;
                }
            case 18:
                ip31 ip31Var = (ip31) obj;
                q7r0 q7r0Var = (q7r0) ip31Var.c;
                ein0 ein0Var = (ein0) ip31Var.b;
                if (b8 == 0) {
                    return u1n0.z(q7r0Var);
                }
                if (b8 == 1) {
                    muz muzVar = (muz) ((jly0) ip31Var.e).get();
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    return new rxr0(muzVar, PlayOrigin.builder(yon1.p3().d).viewUri(nik1.Y5.a).build());
                }
                if (b8 == 2) {
                    t8u0 t8u0Var8 = (t8u0) ein0Var.g.get();
                    c8o.l(t8u0Var8);
                    return kmq0.w(q7r0Var, t8u0Var8);
                }
                if (b8 == 3) {
                    return new qtp();
                }
                if (b8 == 4) {
                    return new rtp();
                }
                if (b8 != 5) {
                    jah.e(b8);
                    return null;
                }
                l2r l2rVar = (dv00) ein0Var.h.get();
                c8o.l(l2rVar);
                l2r l2rVar2 = (ztw0) ein0Var.i.get();
                c8o.l(l2rVar2);
                a9q a9qVar = (a9q) ein0Var.j.get();
                c8o.l(a9qVar);
                yko ykoVar = (yko) ein0Var.d.get();
                c8o.l(ykoVar);
                mr20 mr20Var = (mr20) ein0Var.e.get();
                c8o.l(mr20Var);
                l2r l2rVarA = ykoVar.a((String) null, new ew6(mr20Var, (lnm) null, (byte) 5));
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return new e5b0(30, p7h.M(new l2r[]{l2rVar, l2rVar2, l2rVarA, a9qVar.a(yon1.p3().d)}), (List) null);
            case 19:
                return b();
            case 20:
                k9k k9kVar3 = (k9k) obj;
                rvo0 rvo0Var = (rvo0) k9kVar3.b;
                if (b8 == 0) {
                    return new ytp(this, b3);
                }
                if (b8 == 1) {
                    z8o0 z8o0Var = (z8o0) rvo0Var.d.get();
                    c8o.l(z8o0Var);
                    return new pvo0(z8o0Var);
                }
                if (b8 != 2) {
                    if (b8 == 3) {
                        return new ztp(this, b3);
                    }
                    jah.e(b8);
                    return null;
                }
                Activity activity = (Activity) rvo0Var.a.get();
                c8o.l(activity);
                gw70 gw70Var2 = (gw70) rvo0Var.h.get();
                c8o.l(gw70Var2);
                return new mvo0(activity, gw70Var2, (pvo0) ((jly0) k9kVar3.c).get());
            case 21:
                toj0 toj0Var = (toj0) obj;
                cwo0 cwo0Var = (cwo0) toj0Var.b;
                if (b8 == 0) {
                    return new lo8((ytp) ((jly0) toj0Var.e).get(), (ztp) ((jly0) toj0Var.f).get(), (byte) 13);
                }
                if (b8 == 1) {
                    return new ytp(this, b7);
                }
                if (b8 == 2) {
                    z8o0 z8o0Var2 = (z8o0) cwo0Var.c.get();
                    c8o.l(z8o0Var2);
                    return new pvo0(z8o0Var2);
                }
                if (b8 != 3) {
                    if (b8 == 4) {
                        return new ztp(this, b7);
                    }
                    jah.e(b8);
                    return null;
                }
                gj5 gj5Var = (gj5) cwo0Var.a.get();
                c8o.l(gj5Var);
                gw70 gw70Var3 = (gw70) cwo0Var.e.get();
                c8o.l(gw70Var3);
                return new mvo0(gj5Var, gw70Var3, (pvo0) ((jly0) toj0Var.c).get());
            case 22:
                return c();
            case 23:
                h72 h72Var = (h72) obj;
                s3p0 s3p0Var = (s3p0) h72Var.b;
                switch (b8) {
                    case 0:
                        return new p4p0();
                    case 1:
                        return new aup(new d3p(h72Var));
                    case 2:
                        return new o2p0();
                    case 3:
                        s4p0 s4p0Var = (s4p0) s3p0Var.j.get();
                        c8o.l(s4p0Var);
                        i8h1 i8h1VarD = s4p0Var.d();
                        c8o.m(i8h1VarD);
                        return i8h1VarD;
                    case 4:
                        s4p0 s4p0Var2 = (s4p0) s3p0Var.j.get();
                        c8o.l(s4p0Var2);
                        l6h1 l6h1VarE = s4p0Var2.e();
                        c8o.m(l6h1VarE);
                        return l6h1VarE;
                    case 5:
                        s4p0 s4p0Var3 = (s4p0) s3p0Var.j.get();
                        c8o.l(s4p0Var3);
                        n7h1 n7h1VarF = s4p0Var3.f();
                        c8o.m(n7h1VarF);
                        return n7h1VarF;
                    case 6:
                        s4p0 s4p0Var4 = (s4p0) s3p0Var.j.get();
                        c8o.l(s4p0Var4);
                        mir0 mir0VarC = s4p0Var4.c();
                        c8o.m(mir0VarC);
                        return mir0VarC;
                    case 7:
                        Flowable flowable15 = (Flowable) s3p0Var.m.get();
                        c8o.l(flowable15);
                        Scheduler scheduler14 = (Scheduler) s3p0Var.f73p.get();
                        c8o.l(scheduler14);
                        return f2u0.m(flowable15, scheduler14);
                    case 8:
                        return Boolean.valueOf(((r3p0) h72Var.c).O0().getBoolean("key_on_demand_enabled"));
                    default:
                        jah.e(b8);
                        return null;
                }
            case 24:
                return d();
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                if (b8 == 0) {
                    return new qwp(this);
                }
                if (b8 == 1) {
                    return new rwp();
                }
                if (b8 == 2) {
                    return new swp();
                }
                jah.e(b8);
                return null;
            default:
                uwp uwpVar = (uwp) obj;
                switch (b8) {
                    case 0:
                        return new euc((xrc0) uwpVar.b.get(), uwpVar.c, new be(new CosmosTransport(new x430((RxRouter) ((kly0) uwpVar.a.c).get(), (byte) 5))));
                    case 1:
                        return (xrc0) ((kly0) uwpVar.a.g).get();
                    case 2:
                        return new upp0();
                    case 3:
                        bsp bspVar = uwpVar.b;
                        f0a f0aVar = uwpVar.a;
                        return new stk((xrc0) bspVar.get(), uwpVar.c, (h35) ((kly0) f0aVar.h).get(), (c9n) uwpVar.e.get(), new xv51((Single) ((kly0) f0aVar.Y).get()), new qia1((dma1) uwpVar.f.get()));
                    case 4:
                        return smo1.e(flo1.l((q8n) ((kly0) uwpVar.a.d).get(), guo1.B()).y(new z8n("PlayableCacheScope")));
                    case 5:
                        return (dma1) ((kly0) uwpVar.a.t).get();
                    case 6:
                        return new lut0((ov20) ((kly0) uwpVar.a.i).get(), (q8n) ((kly0) uwpVar.a.d).get(), xqu.a(uwpVar.d));
                    case 7:
                        return new qut0(xqu.a(uwpVar.f), xqu.a(uwpVar.c));
                    case 8:
                        return new sut0((tut0) uwpVar.j.get(), xqu.a(uwpVar.g), (Scheduler) ((kly0) uwpVar.a.X).get());
                    case 9:
                        return new tut0(xqu.a(uwpVar.d), xqu.a(uwpVar.h), (Scheduler) ((kly0) uwpVar.a.X).get());
                    case 10:
                        return new zut0((twp) uwpVar.l.get());
                    case 11:
                        return new twp(this);
                    default:
                        jah.e(b8);
                        return null;
                }
        }
    }
}
