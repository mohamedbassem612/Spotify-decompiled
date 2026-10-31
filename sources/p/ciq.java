package p;

import android.app.Activity;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ciq {
    public final /* synthetic */ thq a;

    public ciq(thq thqVar) {
        this.a = thqVar;
    }

    public final void a(SpotifyMainActivity spotifyMainActivity, SpotifyMainActivity spotifyMainActivity2, b5b1 b5b1Var, ggs0 ggs0Var) {
        thq thqVar = this.a;
        iac0 iac0VarM = zgf0.m(thq.d(thqVar).c);
        yiq yiqVar = thq.d(thqVar).b;
        ji3 ji3Var = new ji3((bn5) yiqVar.A5.get(), new q3c());
        mrd0 mrd0Var = (mrd0) yiqVar.B7.get();
        daq daqVar = yiqVar.a;
        wmo0 wmo0Var = new wmo0((rvy0) daqVar.Ca.get(), new l0x0((i8h1) daqVar.A5.get(), (rrl0) daqVar.xb.get(), (url0) daqVar.yb.get(), (byte) 13), (rb00) daqVar.Aa.get());
        g341 g341Var = (g341) daqVar.Fh.get();
        Scheduler scheduler = (Scheduler) daqVar.z1.get();
        Scheduler scheduler2 = (Scheduler) daqVar.A2.get();
        teq teqVar = yiqVar.b;
        Activity activity = (Activity) teqVar.f.a;
        hbq hbqVar = daqVar.a;
        t380 t380VarY = f580.y(new eb80(ji3Var, mrd0Var, wmo0Var, new jx5(g341Var, scheduler, scheduler2, activity, fj30.E(new cm4(false, (luk) hbqVar.a.L1.get()))), new blp0(i1l.r((b8p) hbqVar.a.f4.get()), (zor) daqVar.V6.get()), new mu40((tu40) yiqVar.C7.get(), yiqVar.c0(), (f95) daqVar.Eb.get(), (gj5) teqVar.f.a)));
        zwa zwaVar = new zwa((bbr0) teqVar.f.a, (byte) 1);
        cab cabVar = new cab((u9b) teqVar.u4.get(), (v9b) teqVar.mb.get(), (jab) teqVar.vg.get(), (byte) 0);
        mp8 mp8Var = new mp8((add) daqVar.Ge.get(), (byte) 11);
        new wjh((luk) teqVar.d.L1.get());
        st60 st60Var = new st60(t380VarY, f580.z(zwaVar, cabVar, mp8Var, new lo9(new aqh(false, (luk) daqVar.L1.get()), (byte) 19), new k9r((oc4) daqVar.T6.get(), new a0m((j9r) daqVar.U6.get(), (byte) 15), (mtr) yiqVar.D7.get(), (byte) 0), new m4e0(new r44(false, false, (luk) daqVar.L1.get()), (byte) 13), new e5l0(yiqVar.e0(), (byte) 4), new yqu0((i5y0) teqVar.pb.get(), (x1i1) teqVar.F6.get(), (byte) 27)), f580.A(new kqi0(daqVar.Rd, teqVar.c, r7r.p((rap) yiqVar.v6.get()), (byte) 20)), (byte) 18);
        yiq yiqVar2 = thq.d(thqVar).b;
        List listB = f580.B(new o860((p680) yiqVar2.E7.get(), hva1.j((qrq) yiqVar2.p7.get()), (exn0) yiqVar2.F7.get()));
        teq teqVar2 = yiqVar2.b;
        coa1 coa1Var = new coa1(zgf0.m(teqVar2.c), (yrs) yiqVar2.G7.get());
        daq daqVar2 = yiqVar2.a;
        o0g1 o0g1Var = new o0g1(listB, f580.C(new h0y(coa1Var, (f8r) daqVar2.a.p5.get(), new fgb0((i8h1) daqVar2.A5.get()), r7r.q((rap) yiqVar2.v6.get()), (ha41) yiqVar2.H7.get(), (ab50) yiqVar2.I7.get(), (cun0) teqVar2.D2.get())), new hu4(100, (luk) daqVar2.L1.get(), false), (byte) 9);
        jvn0 jvn0Var = (jvn0) thq.d(thqVar).b.o7.get();
        lzn0 lzn0Var = (lzn0) thq.d(thqVar).i.get();
        rsn0 rsn0Var = (rsn0) thq.d(thqVar).F5.get();
        hds hdsVar = (hds) thq.d(thqVar).y5.get();
        io60 io60VarE0 = thq.d(thqVar).b.e0();
        yiq yiqVar3 = thq.d(thqVar).b;
        daq daqVar3 = yiqVar3.a;
        xs0 xs0Var = (xs0) daqVar3.pb.get();
        io60 io60VarE1 = yiqVar3.e0();
        teq teqVar3 = yiqVar3.b;
        d520 d520Var = new d520(xs0Var, io60VarE1, new ewn0((yun0) teqVar3.t5.get(), (byte) 0), (Activity) teqVar3.f.a, (String) daqVar3.Oe.get(), (lrw0) daqVar3.qb.get(), (zt0) daqVar3.Ua.get());
        a44 a44Var = (a44) thq.b(thqVar).Wa.get();
        yiq yiqVar4 = thq.d(thqVar).b;
        new eyn0(spotifyMainActivity, spotifyMainActivity2, ggs0Var, b5b1Var, iac0VarM, st60Var, o0g1Var, jvn0Var, lzn0Var, rsn0Var, hdsVar, io60VarE0, d520Var, a44Var, new bnj0((nbr) yiqVar4.a.f15io.get(), (w911) yiqVar4.u6.get(), (byte) 11), (g8h1) thq.b(thqVar).im.get(), (mwn0) thq.b(thqVar).Wd.get());
    }
}
