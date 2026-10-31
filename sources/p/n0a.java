package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class n0a implements jly0 {
    public static lvw0 A(gkp gkpVar) {
        lvw0 lvw0Var = (lvw0) gkpVar.q.get();
        c8o.m(lvw0Var);
        return lvw0Var;
    }

    public static hqc1 B(gkp gkpVar) {
        hqc1 hqc1Var = (hqc1) gkpVar.B.get();
        c8o.m(hqc1Var);
        return hqc1Var;
    }

    public static yjj1 C(crd crdVar, Observable observable, dxz0 dxz0Var, Flowable flowable, yna ynaVar, v290 v290Var) {
        return new yjj1(((drd) crdVar).c, observable, dxz0Var.c(), flowable, ynaVar, v290Var);
    }

    public static w2k1 D() {
        return new w2k1();
    }

    public static gkp a(voa voaVar) {
        return new gkp(voaVar);
    }

    public static d8p b(tbl tblVar) {
        return new d8p(tblVar);
    }

    public static pt0 c(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 24);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static qda d(r7q r7qVar) {
        qda qdaVar = new qda();
        qdaVar.a = r7qVar;
        return qdaVar;
    }

    public static pt0 e(ynb0 ynb0Var) {
        pt0 pt0Var = new pt0((byte) 25);
        pt0Var.b = ynb0Var;
        return pt0Var;
    }

    public static oyx0 f(RetrofitMaker retrofitMaker) {
        k370 k370Var = new k370();
        k370Var.f((l370) null, "https://agnostic-api.spotify.dev/unauthenticated/");
        return (oyx0) retrofitMaker.createCustomHostService(oyx0.class, k370Var.b());
    }

    public static dva g(r7q r7qVar) {
        return new dva(r7qVar);
    }

    public static ekp h(gkp gkpVar) {
        ekp ekpVar = (ekp) gkpVar.w.get();
        c8o.m(ekpVar);
        return ekpVar;
    }

    public static yna i(gkp gkpVar) {
        return w290.g((zjp) gkpVar.K.get());
    }

    public static coa j(gkp gkpVar) {
        coa coaVar = (coa) ((zjp) gkpVar.K.get()).p.get();
        c8o.m(coaVar);
        return coaVar;
    }

    public static m2p k(gkp gkpVar) {
        m2p m2pVar = (m2p) gkpVar.p.get();
        c8o.m(m2pVar);
        return m2pVar;
    }

    public static woa l(gkp gkpVar) {
        woa woaVar = (woa) gkpVar.u.get();
        c8o.m(woaVar);
        return woaVar;
    }

    public static fpa m(gkp gkpVar) {
        fpa fpaVar = (fpa) gkpVar.v.get();
        c8o.m(fpaVar);
        return fpaVar;
    }

    public static b8g1 n(gkp gkpVar) {
        b8g1 b8g1Var = (b8g1) gkpVar.I.get();
        c8o.m(b8g1Var);
        return b8g1Var;
    }

    public static wuc o() {
        wuc.n.getClass();
        ic9 ic9Var = uuc.b;
        c8o.m(ic9Var);
        return ic9Var;
    }

    public static tvc p() {
        tvc.o.getClass();
        uq8 uq8Var = rvc.b;
        c8o.m(uq8Var);
        return uq8Var;
    }

    public static vsg q(x9q x9qVar, vwj1 vwj1Var, nwj1 nwj1Var, dxz0 dxz0Var) {
        return new vsg(x9qVar, vwj1Var, nwj1Var, dxz0Var);
    }

    public static u9c0 r(dg30 dg30Var) {
        return cto1.q(dg30Var);
    }

    public static n6g1 s(ynb0 ynb0Var) {
        return (n6g1) ynb0Var.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rzq t(tlu tluVar, lvc0 lvc0Var) {
        j3r j3rVar = rzq.y;
        return l2p1.f(new w1k(new l2r[]{tluVar, lvc0Var.a(bdc1.a)}));
    }

    public static mxr u(Context context, l270 l270Var, wna wnaVar, rma rmaVar) {
        return new mxr(context, l270Var, wnaVar, rmaVar);
    }

    public static u8v v(gkp gkpVar) {
        u8v u8vVar = (u8v) gkpVar.C.get();
        c8o.m(u8vVar);
        return u8vVar;
    }

    public static rrk0 w() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        String str = yon1.Z4().c;
        String str2 = nik1.o4.a;
        r6h1 r6h1Var = r6h1.c;
        return new rrk0(str, str2);
    }

    public static s311 x(Flowable flowable) {
        return new s311(flowable);
    }

    public static bbb1 y(gkp gkpVar) {
        bbb1 bbb1Var = (bbb1) gkpVar.J.get();
        c8o.m(bbb1Var);
        return bbb1Var;
    }

    public static hec1 z(gkp gkpVar) {
        RxRouter rxRouterK = gkpVar.a.k();
        c8o.l(rxRouterK);
        return cec1.o(rxRouterK);
    }
}
