package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.marquee.marquee.MarqueeActivity;
import com.spotify.radio.radio.formatlist.RadioFormatListService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b6p implements oo91, dl4 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public b6p(w0d w0dVar) {
        this.a = (byte) 8;
        this.b = w0dVar;
        this.c = iy81.a(new j7p(this, (byte) 29));
    }

    public uu00 A() {
        uu00 uu00VarP = ((nwp) this.c).a.P();
        c8o.l(uu00VarP);
        return uu00VarP;
    }

    public a1r0 C() {
        a1r0 a1r0VarA0 = ((nwp) this.c).a.A0();
        c8o.l(a1r0VarA0);
        return a1r0VarA0;
    }

    public Scheduler G() {
        return (Scheduler) ((nwp) this.c).t.get();
    }

    public mw7 G0() {
        mw7 mw7Var = (mw7) ((daq) ((nwp) this.c).a.b).o4.get();
        c8o.l(mw7Var);
        return mw7Var;
    }

    public yqg a() {
        return (yqg) ((nwp) this.c).i.get();
    }

    public gw70 b() {
        gw70 gw70VarA0 = ((nwp) this.c).a.a0();
        c8o.l(gw70VarA0);
        return gw70VarA0;
    }

    public lzn0 c() {
        return (lzn0) ((nwp) this.c).G.get();
    }

    public Context context() {
        Context context = (Context) ((nwp) this.c).b.d;
        c8o.l(context);
        return context;
    }

    public q8n d() {
        q8n q8nVarB0 = ((nwp) this.c).a.b0();
        c8o.l(q8nVarB0);
        return q8nVarB0;
    }

    public Scheduler d0() {
        return (Scheduler) ((nwp) this.c).s.get();
    }

    public lik1 e() {
        return (lik1) this.b;
    }

    public g7h e0() {
        g7h g7hVar = (g7h) ((daq) ((nwp) this.c).a.b).b7.get();
        c8o.l(g7hVar);
        return g7hVar;
    }

    public Flowable f() {
        return (Flowable) ((nwp) this.c).l.get();
    }

    public q8n g() {
        return (q8n) ((nwp) this.c).A.get();
    }

    public ip91 h() {
        ip91 ip91Var = (ip91) ((daq) ((nwp) this.c).a.b).g8.get();
        c8o.l(ip91Var);
        return ip91Var;
    }

    public o241 i() {
        return (o241) ((nwp) this.c).k.get();
    }

    public cfr j() {
        cfr cfrVar = (cfr) ((teq) ((nwp) this.c).a.c).f1.get();
        c8o.l(cfrVar);
        return cfrVar;
    }

    public vu1 k() {
        vu1 vu1Var = (vu1) ((teq) ((nwp) this.c).a.c).a1.get();
        c8o.l(vu1Var);
        return vu1Var;
    }

    public xrc0 l() {
        xrc0 xrc0Var = (xrc0) ((teq) ((nwp) this.c).a.c).e1.get();
        c8o.l(xrc0Var);
        return xrc0Var;
    }

    public agc0 m() {
        agc0 agc0Var = (agc0) ((daq) ((nwp) this.c).a.b).B7.get();
        c8o.l(agc0Var);
        return agc0Var;
    }

    public jo91 n() {
        jo91 jo91Var = (jo91) ((daq) ((nwp) this.c).a.b).r7.get();
        c8o.l(jo91Var);
        return jo91Var;
    }

    public ccc0 o() {
        ccc0 ccc0Var = (ccc0) ((teq) ((nwp) this.c).a.c).q3.get();
        c8o.l(ccc0Var);
        return ccc0Var;
    }

    public RxRouter p() {
        RxRouter rxRouter = (RxRouter) ((daq) ((nwp) this.c).a.b).G1.get();
        c8o.l(rxRouter);
        return rxRouter;
    }

    public t2j0 q() {
        t2j0 t2j0VarI0 = ((nwp) this.c).a.i0();
        c8o.l(t2j0VarI0);
        return t2j0VarI0;
    }

    public jp00 r() {
        jp00 jp00Var = (jp00) ((daq) ((nwp) this.c).a.b).Fr.get();
        c8o.l(jp00Var);
        return jp00Var;
    }

    public Activity s() {
        Activity activityM = ((nwp) this.c).a.m();
        c8o.l(activityM);
        return activityM;
    }

    public io91 t() {
        io91 io91Var = (io91) ((daq) ((nwp) this.c).a.b).Gr.get();
        c8o.l(io91Var);
        return io91Var;
    }

    public hn91 u() {
        hn91 hn91Var = (hn91) ((teq) ((nwp) this.c).a.c).W6.get();
        c8o.l(hn91Var);
        return hn91Var;
    }

    public w8n v() {
        u8n u8nVar = (u8n) this.b;
        q8n q8nVarD = u8nVar.d();
        c8o.l(q8nVarD);
        q8n q8nVarE = u8nVar.e();
        c8o.l(q8nVarE);
        lzn0 lzn0VarC = u8nVar.c();
        c8o.l(lzn0VarC);
        Activity activityS = u8nVar.s();
        c8o.l(activityS);
        i8h1 i8h1VarM = u8nVar.m();
        c8o.l(i8h1VarM);
        uny unyVar = new uny(lzn0VarC, new kp00(activityS, new uny(i8h1VarM, (r6h1) this.c), (byte) 1));
        ov20 ov20VarQ = u8nVar.q();
        c8o.l(ov20VarQ);
        luk lukVarT = u8nVar.t();
        c8o.l(lukVarT);
        return new w8n(q8nVarD, q8nVarE, unyVar, new ur00(ov20VarQ, new nm4(false, lukVarT)));
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 27:
                ts10 ts10Var = (ts10) obj;
                uw0 uw0Var = (uw0) obj2;
                ((nzo) ts10Var).V1 = (jgu) ((s2q) uw0Var.i).get();
                ts10Var.X1 = (v2q) ((jly0) obj3).get();
                ts10Var.W1 = new uny((rwg0) ((jly0) uw0Var.O0).get(), (MarqueeActivity) uw0Var.d, (Random) ((daq) uw0Var.e).I1.get(), (byte) 27);
                ts10Var.Y1 = uw0Var.u();
                break;
            case 28:
                sso0 sso0Var = (sso0) obj;
                ((hip) sso0Var).F1 = (jgu) ((s2q) ((tnm) obj3).e).get();
                daq daqVar = (daq) obj2;
                sso0Var.J1 = (qnv0) daqVar.Fm.get();
                sso0Var.H1 = (dma1) daqVar.C1.get();
                sso0Var.I1 = new bnj0((i8h1) daqVar.a.a.A5.get(), new yvk0("permissions-notifications-prompt", "spotify:internal:permissions-notifications-prompt"), (byte) 16);
                break;
            default:
                RadioFormatListService radioFormatListService = (RadioFormatListService) obj;
                radioFormatListService.b = (s241) ((uyp) obj3).get();
                daq daqVar2 = (daq) obj2;
                radioFormatListService.c = (Scheduler) daqVar2.z1.get();
                radioFormatListService.d = (xye1) daqVar2.c3.get();
                break;
        }
    }

    public iyc0 x() {
        iyc0 iyc0Var = (iyc0) ((teq) ((nwp) this.c).a.c).g1.get();
        c8o.l(iyc0Var);
        return iyc0Var;
    }

    public vnd1 y() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        pdl0 pdl0Var = new pdl0(yon1.x3().a, nik1.O1.a, (byte) 9);
        i8h1 i8h1Var = (i8h1) ((ani0) this.b).c.get();
        c8o.l(i8h1Var);
        return new vnd1(pdl0Var, i8h1Var, (byte) 25);
    }

    public Scheduler y0() {
        Scheduler scheduler = (Scheduler) ((daq) ((nwp) this.c).a.b).A2.get();
        c8o.l(scheduler);
        return scheduler;
    }

    public Flowable z0() {
        Flowable flowable = (Flowable) ((daq) ((nwp) this.c).a.b).z2.get();
        c8o.l(flowable);
        return flowable;
    }

    public b6p(jl00 jl00Var) {
        this.a = (byte) 17;
        this.b = jl00Var;
        this.c = new ikp(this, (byte) 21);
    }

    public b6p(d520 d520Var) {
        this.a = (byte) 2;
        this.b = d520Var;
        this.c = iy81.a(new j7p(this, (byte) 1));
    }

    public b6p(rsm rsmVar) {
        this.a = (byte) 5;
        this.b = rsmVar;
        this.c = iy81.a(new j7p(this, (byte) 14));
    }

    public b6p(drj0 drj0Var) {
        this.a = (byte) 20;
        this.b = drj0Var;
        this.c = iy81.a(new xrp(this, (byte) 6));
    }

    public /* synthetic */ b6p(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public b6p(aod aodVar) {
        this.a = (byte) 1;
        this.b = aodVar;
        this.c = iy81.a(new z1p(this, (byte) 27));
    }

    public b6p(npv npvVar) {
        this.a = (byte) 7;
        this.b = npvVar;
        this.c = iy81.a(new j7p(this, (byte) 24));
    }

    public b6p(gl90 gl90Var) {
        this.a = (byte) 15;
        this.b = gl90Var;
        this.c = iy81.a(new ikp(this, (byte) 10));
    }

    public b6p(wzp wzpVar) {
        this.a = (byte) 6;
        this.b = wzpVar;
        this.c = iy81.a(new j7p(this, (byte) 17));
    }

    public b6p(ce90 ce90Var, q7r0 q7r0Var) {
        this.a = (byte) 13;
        this.b = q7r0Var;
        this.c = new ikp(this, (byte) 2);
    }

    public b6p(m0q m0qVar, qop qopVar, bct bctVar) {
        this.a = (byte) 26;
        this.b = m0qVar;
        this.c = iy81.a(new xrp(this, (byte) 26));
    }

    public b6p(rzp rzpVar, qop qopVar, bct bctVar) {
        this.a = (byte) 23;
        this.b = rzpVar;
        this.c = new xrp(this, (byte) 16);
    }

    public b6p(ans0 ans0Var, bns0 bns0Var) {
        this.a = (byte) 25;
        this.b = ans0Var;
        this.c = xqu.b(new xrp(this, (byte) 22));
    }

    public b6p(y230 y230Var, z230 z230Var) {
        this.a = (byte) 9;
        this.b = y230Var;
        this.c = xqu.b(new xep(this, (byte) 7));
    }

    public b6p(kqo0 kqo0Var, rro0 rro0Var) {
        this.a = (byte) 21;
        this.b = kqo0Var;
        this.c = xqu.b(new xrp(this, (byte) 13));
    }

    public b6p(ht90 ht90Var, gt90 gt90Var) {
        this.a = (byte) 14;
        this.b = ht90Var;
        this.c = xqu.b(new ikp(this, (byte) 5));
    }

    public b6p(ani0 ani0Var) {
        this.a = (byte) 19;
        this.b = ani0Var;
        this.c = iy81.a(new xrp(this, (byte) 0));
    }

    public b6p(s6d0 s6d0Var, t6d0 t6d0Var) {
        this.a = (byte) 16;
        this.b = s6d0Var;
        this.c = xqu.b(new ikp(this, (byte) 15));
    }

    public b6p(yc00 yc00Var, Set set) {
        this.a = (byte) 24;
        this.b = yc00Var;
        this.c = xqu.b(new xrp(this, (byte) 19));
    }

    public b6p(z750 z750Var, a850 a850Var, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = q7r0Var;
        this.c = new xep(this, (byte) 16);
    }

    public b6p(v950 v950Var, w950 w950Var, q7r0 q7r0Var) {
        this.a = (byte) 11;
        this.b = q7r0Var;
        this.c = new xep(this, (byte) 19);
    }

    public b6p(mc50 mc50Var, nc50 nc50Var, q7r0 q7r0Var) {
        this.a = (byte) 12;
        this.b = q7r0Var;
        this.c = new xep(this, (byte) 22);
    }

    public b6p(uzf uzfVar, lyj lyjVar, q7r0 q7r0Var) {
        this.a = (byte) 0;
        this.b = q7r0Var;
        this.c = new z1p(this, (byte) 21);
    }

    public b6p(feg0 feg0Var, zuj zujVar, geg0 geg0Var, q7r0 q7r0Var) {
        this.a = (byte) 18;
        this.b = q7r0Var;
        this.c = new ikp(this, (byte) 25);
    }

    public b6p(jok jokVar, lyj lyjVar, pok pokVar) {
        this.a = (byte) 3;
        this.b = jokVar;
        this.c = xqu.b(new j7p(this, (byte) 4));
    }

    public b6p(nwp nwpVar, lik1 lik1Var) {
        this.a = (byte) 22;
        this.c = nwpVar;
        this.b = lik1Var;
    }

    public b6p(daq daqVar, uw0 uw0Var) {
        this.a = (byte) 27;
        this.b = uw0Var;
        this.c = iy81.a(new bup(daqVar, uw0Var, (byte) 3));
    }

    public b6p(daq daqVar) {
        this.a = (byte) 29;
        this.b = daqVar;
        this.c = new uyp(this, (byte) 1);
    }
}
