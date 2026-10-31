package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.collection.downloaded.service.OffliningService;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class uq8 implements Function, tvc, wb01, i0e, cke, n2i1, m381, qmr0, myc, afu, qiw, sq, dl4 {
    public final /* synthetic */ byte a;
    public Object b;

    public uq8(byte b) {
        this.a = b;
        switch (b) {
            case 28:
                this.b = new err0(0);
                break;
            case 29:
                this.b = new qzq(this);
                break;
            default:
                this.b = gio1.b(svc.a);
                break;
        }
    }

    public void A(smr0 smr0Var) {
        if (smr0Var != null) {
            ((iu30) ((cce) this.b).c).invoke(Integer.valueOf(w5p1.j(smr0Var)));
        }
    }

    public nfa0 A0() {
        nfa0 nfa0Var = (nfa0) ((qq) ((em0) this.b).b).d;
        c8o.l(nfa0Var);
        return nfa0Var;
    }

    public xm41 B0() {
        xm41 xm41Var = (xm41) ((qq) ((em0) this.b).b).k;
        c8o.l(xm41Var);
        return xm41Var;
    }

    public tq C0() {
        luk lukVar = (luk) ((qq) ((em0) this.b).b).g;
        c8o.l(lukVar);
        return new tq(new x34(false, false, lukVar), (byte) 0);
    }

    public void D(boolean z, int i, fbp1 fbp1Var, c380 c380Var, vu30 vu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-518061131);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        int i4 = i3 | (x340Var.g(fbp1Var) ? 256 : 128) | (x340Var.g(c380Var) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.i(vu30Var) ? 16384 : 8192;
        }
        int i5 = i4 | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i5 & 1, (74899 & i5) != 74898)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            k5p1.i(z, x340Var, i5 & 14);
            if (vu30Var == null) {
                x340Var.i0(467178720);
                x340Var.r(false);
            } else {
                x340Var.i0(-262024383);
                us71.j((i5 >> 12) & 14, vu30Var, x340Var, false);
            }
            k5p1.h(fbp1Var, x340Var, (i5 >> 6) & 14);
            k5p1.c(c380Var, x340Var, (i5 >> 9) & 14);
            k5p1.g(((jq4) this.b).k() ? 1 : i, x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k3a(this, z, i, fbp1Var, c380Var, vu30Var, i2);
        }
    }

    public t2j0 D0() {
        t2j0 t2j0Var = (t2j0) ((qq) ((em0) this.b).b).r;
        c8o.l(t2j0Var);
        return t2j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(zbq0 zbq0Var, onm onmVar) {
        itf itfVar;
        if (onmVar instanceof itf) {
            itfVar = (itf) onmVar;
            int i = itfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                itfVar.c = i - Integer.MIN_VALUE;
            } else {
                itfVar = new itf(this, onmVar);
            }
        } else {
            itfVar = new itf(this, onmVar);
        }
        Object objS = itfVar.a;
        int i2 = itfVar.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                og5 og5Var = new og5((Object) this, (Object) zbq0Var, lnmVar, (byte) 7);
                itfVar.c = 1;
                objS = smo1.s(og5Var, itfVar);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objS);
            }
            return (ceq0) objS;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new odq0(true);
        }
    }

    public boolean E0() {
        luk lukVar = (luk) ((qq) ((em0) this.b).b).g;
        c8o.l(lukVar);
        return new x34(false, false, lukVar).b();
    }

    public bpb1 F() {
        return (bpb1) this.b;
    }

    public wbd1 F0() {
        return (wbd1) ((fwo) ((em0) this.b).t).get();
    }

    public synchronized svz0 G(File file, byte[] bArr) {
        k74 k74Var = k74.e;
        synchronized (this) {
            String absolutePath = file.getAbsolutePath();
            aar aarVar = (aar) ((qzq) this.b).get(absolutePath);
            if (aarVar != null) {
                if (!Arrays.equals(aarVar.a, bArr)) {
                    aarVar = null;
                }
                if (aarVar != null) {
                    return aarVar.b;
                }
            }
            Object objInvoke = k74Var.invoke(bArr);
            ((qzq) this.b).put(absolutePath, new aar(bArr, (svz0) objInvoke));
            return (svz0) objInvoke;
        }
    }

    public wve0 G0() {
        wve0 wve0Var = (wve0) ((qq) ((em0) this.b).b).b;
        c8o.l(wve0Var);
        return wve0Var;
    }

    public synchronized void H(File file) {
        String absolutePath = file.getAbsolutePath();
        r7h.Z(((qzq) this.b).keySet(), new os(absolutePath, absolutePath + File.separator, (byte) 10), true);
    }

    public xm41 H0() {
        xm41 xm41Var = (xm41) ((qq) ((em0) this.b).b).j;
        c8o.l(xm41Var);
        return xm41Var;
    }

    public l0x0 I() {
        kdy0 kdy0Var = (kdy0) this.b;
        i8h1 i8h1Var = (i8h1) kdy0Var.c;
        c8o.l(i8h1Var);
        rrl0 rrl0Var = (rrl0) kdy0Var.d;
        c8o.l(rrl0Var);
        url0 url0Var = (url0) kdy0Var.e;
        c8o.l(url0Var);
        return new l0x0(i8h1Var, rrl0Var, url0Var, (byte) 13);
    }

    public uh8 I0() {
        uh8 uh8Var = (uh8) ((qq) ((em0) this.b).b).e;
        c8o.l(uh8Var);
        return uh8Var;
    }

    public yqg a() {
        yqg yqgVar = (yqg) ((qq) ((em0) this.b).b).c;
        c8o.l(yqgVar);
        return yqgVar;
    }

    public Object apply(Object obj) {
        byte b = 16;
        switch (this.a) {
            case 0:
                return ((yze1) ((km3) this.b).b).c().map(t9w.X);
            case 1:
                ye9 ye9Var = (ye9) obj;
                af9 af9Var = (af9) this.b;
                af9Var.getClass();
                xe9 xe9Var = ye9Var.a;
                if (xe9Var != null) {
                    Queue queue = (Queue) ye9Var.b.get(xe9Var.a);
                    if (queue != null && queue.size() == ((Number) af9Var.c.e.b()).intValue()) {
                        List listL1 = o7h.l1(queue);
                        queue.poll();
                        return listL1;
                    }
                }
                return z6x.a;
            case 3:
                vjb0 vjb0Var = (vjb0) obj;
                esa esaVar = (esa) this.b;
                s141 s141Var = esaVar.a;
                vsw0 vsw0Var = vjb0Var.c.b;
                s141Var.getClass();
                return lmt0.u(Single.create(new nt21(vsw0Var, s141Var, (byte) 5)), 5).compose(new mta((byte) 0)).flatMap(new n801(new kd8(esaVar, vjb0Var, b), (byte) 11)).map(new l2a(vjb0Var, (byte) 2)).doOnSubscribe(new ura(esaVar, (byte) 1));
            case 5:
                dmc dmcVar = (dmc) this.b;
                return new ObservableFromPublisher(dmcVar.a.c().J(new l2a(dmcVar, (byte) 6)));
            case 7:
                l5d l5dVar = ((h5d) this.b).f;
                byte b2 = 4;
                Single singleFlatMap = l5dVar.b.flatMap(new n4b(l5d.e, b2));
                bma1 bma1Var = l5d.d;
                Single single = l5dVar.b;
                return Single.zip(singleFlatMap, single.flatMap(new n4b(bma1Var, b2)), single.flatMap(new dg8((Object) l5dVar, (byte) 13)), vrg.N0);
            case 15:
                r0h r0hVar = (r0h) obj;
                t8r0 t8r0Var = ((z0h) this.b).c;
                fy6 fy6Var = r0hVar.a.b;
                String str = r0hVar.b.a;
                String str2 = fy6Var.b;
                return j2h1.D((q8n) t8r0Var.b, new dvq0(t8r0Var, str2.length() > 0 ? new uzc0(str2) : new vzc0(fy6Var.a), str, (lnm) null, (byte) 15));
            case 17:
                efr efrVar = ((hfh) this.b).b;
                String str3 = ((mfh) obj).a;
                Set set = s4b1.f;
                int iOrdinal = uic.x(str3).c.ordinal();
                return ((iOrdinal == 659 || iOrdinal == 844) ? ((a7z) efrVar.b).a(Collections.singletonList(str3)).toObservable().map(new k9p1(str3, (byte) 8)) : Observable.just(new xae0(new IllegalArgumentException("Unsupported entityUri: ".concat(str3))))).onErrorReturn(new vdn1(str3, (byte) 6)).map(olj0.Q0).onErrorReturn(pzs0.Q0);
            default:
                zwu0 zwu0Var = ((fqx0) obj).a;
                yon yonVar = (yon) this.b;
                mzr0 mzr0Var = (mzr0) yonVar.b;
                CompletableOnErrorComplete completableOnErrorCompleteO = mzr0Var.z(zwu0Var).h(fcc.P0).o(Functions.h);
                String str4 = zwu0Var.a;
                String str5 = zwu0Var.k;
                Observable observable = completableOnErrorCompleteO.e(Single.just(new bsx0(str4, str5, zwu0Var.d, zwu0Var.e))).toObservable();
                byte[] bArr = new byte[16];
                dqz0.b.l().nextBytes(bArr);
                String strA = f9a.a(bArr);
                String strC = mka.c(strA);
                return Observable.concat(observable, mzr0Var.e(str5, strC, (String) null).retry(1L).flatMapCompletable(new tzr0((byte) 26, mzr0Var, zwu0Var, strC, strA)).e(Single.defer(new u33(strC, (byte) 1))).doOnError(mux0.c).doFinally(new wf0(mzr0Var, zwu0Var, strC, (byte) 15)).onErrorResumeNext(new l2a(yonVar, (byte) 22)).flatMapObservable(new oql(yonVar, zwu0Var, (byte) 12)).onErrorComplete());
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public Context context() {
        Context context = (Context) ((qq) ((em0) this.b).b).a;
        c8o.l(context);
        return context;
    }

    public q8n d() {
        q8n q8nVar = (q8n) ((qq) ((em0) this.b).b).o;
        c8o.l(q8nVar);
        return q8nVar;
    }

    public void dismiss() {
        t2u t2uVarG = ((pg0) this.b).a.e0().G("LivestreamErrorDialog");
        t2u t2uVar = t2uVarG instanceof t2u ? t2uVarG : null;
        if (t2uVar != null) {
            t2uVar.dismiss();
        }
    }

    public qsk l() {
        return (qsk) this.b;
    }

    public RetrofitMaker n() {
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((qq) ((em0) this.b).b).i;
        c8o.l(retrofitMaker);
        return retrofitMaker;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public boolean s(Uri uri) {
        String path = uri.getPath();
        if (path == null || !ihc1.h0(path, "/mobile/close/", false)) {
            zxf zxfVar = (zxf) this.b;
            if ((!(zxfVar instanceof nxf) && !(zxfVar instanceof mxf) && !(zxfVar instanceof oxf)) || !u890.j(uri.getFragment(), "close")) {
                return false;
            }
        }
        return true;
    }

    public void u(dxc dxcVar, Throwable th) {
        ((byh) this.b).completeExceptionally(th);
    }

    public void v(Object obj) {
        Set set = (Set) obj;
        olo oloVar = (olo) this.b;
        set.getClass();
        oloVar.a(set);
    }

    public void w(Object obj) {
        ((OffliningService) obj).a = (kuz) ((jly0) this.b).get();
    }

    public g0l x0() {
        g0l g0lVar = (g0l) ((qq) ((em0) this.b).b).q;
        c8o.l(g0lVar);
        return g0lVar;
    }

    public mr20 y(String str) {
        kp5 kp5Var = (kp5) this.b;
        return new te1(d3p1.F((d0r) kp5Var.a, (o3r) kp5Var.g, str), (byte) 14);
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
        boolean z = sy21Var.a.Q0;
        byh byhVar = (byh) this.b;
        if (z) {
            byhVar.complete(sy21Var.b);
        } else {
            byhVar.completeExceptionally(new HttpException(sy21Var));
        }
    }

    public Flowable z0() {
        Flowable flowable = (Flowable) ((qq) ((em0) this.b).b).f;
        c8o.l(flowable);
        return flowable;
    }

    public /* synthetic */ uq8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public uq8(h82 h82Var) {
        this.a = (byte) 14;
        this.b = w3p1.o(new l4r(pwc0.b, 2, tpg.N0, new j4r(new syf(h82Var, (byte) 17)), tpg.O0), tpg.Z);
    }
}
