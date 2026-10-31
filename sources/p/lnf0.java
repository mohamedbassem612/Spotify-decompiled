package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lnf0 {
    public final uu00 a;
    public final ynb0 b;
    public final qu00 c;
    public final onf0 d;
    public final o3e0 e;
    public final nmf0 f;
    public final kly0 g;
    public final kly0 h;
    public final zwz0 i;
    public final Scheduler j;
    public final q8n k;
    public final llm m;
    public final xgn0 l = ygn0.a();
    public final Object n = new Object();
    public final HashMap o = new HashMap();

    public lnf0(uu00 uu00Var, ynb0 ynb0Var, qu00 qu00Var, onf0 onf0Var, o3e0 o3e0Var, nmf0 nmf0Var, caq caqVar, caq caqVar2, zwz0 zwz0Var, Scheduler scheduler, q8n q8nVar) {
        this.a = uu00Var;
        this.b = ynb0Var;
        this.c = qu00Var;
        this.d = onf0Var;
        this.e = o3e0Var;
        this.f = nmf0Var;
        this.g = caqVar;
        this.h = caqVar2;
        this.i = zwz0Var;
        this.j = scheduler;
        this.k = q8nVar;
        this.m = l1d.x(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9 A[Catch: all -> 0x00c6, TryCatch #2 {, blocks: (B:34:0x0097, B:36:0x00a5, B:38:0x00b1, B:40:0x00b9, B:41:0x00bc), top: B:75:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:54:0x00d4, B:56:0x00e2, B:58:0x00ee, B:60:0x00f6, B:61:0x00f9), top: B:71:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ang1 ang1Var, onm onmVar) throws Throwable {
        fnf0 fnf0Var;
        xv71 xv71Var;
        ang1 ang1Var2;
        xv71 xv71Var2;
        HashMap map;
        HashMap map2;
        if (onmVar instanceof fnf0) {
            fnf0Var = (fnf0) onmVar;
            int i = fnf0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fnf0Var.e = i - Integer.MIN_VALUE;
            } else {
                fnf0Var = new fnf0(this, onmVar);
            }
        } else {
            fnf0Var = new fnf0(this, onmVar);
        }
        Object objQ = fnf0Var.c;
        d9n d9nVar = d9n.a;
        int i2 = fnf0Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xv71Var2 = fnf0Var.b;
            ang1Var2 = fnf0Var.a;
            try {
                hm5.M(objQ);
                synchronized (this.n) {
                    xv71Var2.c(xv71Var2.b() - 1);
                    if (xv71Var2.b() == 0 && ((q6) xv71Var2.a()).isActive()) {
                        map2 = this.o;
                        if (map2.get(ang1Var2) == xv71Var2) {
                            map2.remove(ang1Var2);
                        }
                        ((saa0) xv71Var2.a()).d(null);
                    }
                }
                return objQ;
            } catch (Throwable th) {
                th = th;
                synchronized (this.n) {
                    xv71Var2.c(xv71Var2.b() - 1);
                    if (xv71Var2.b() == 0 && ((q6) xv71Var2.a()).isActive()) {
                        map = this.o;
                        if (map.get(ang1Var2) == xv71Var2) {
                            map.remove(ang1Var2);
                        }
                        ((saa0) xv71Var2.a()).d(null);
                    }
                }
                throw th;
            }
        }
        hm5.M(objQ);
        synchronized (this.n) {
            try {
                HashMap map3 = this.o;
                Object obj = map3.get(ang1Var);
                if (obj == null) {
                    s2t s2tVarQ = c921.q(this.m, (o8n) null, 2, new tc1(this, ang1Var, (lnm) null, (byte) 21), 1);
                    xv71 xv71Var3 = new xv71(s2tVarQ);
                    s2tVarQ.L(new gnf0(this, ang1Var, xv71Var3, (byte) 0));
                    map3.put(ang1Var, xv71Var3);
                    obj = xv71Var3;
                }
                xv71 xv71Var4 = (xv71) obj;
                xv71Var4.c(xv71Var4.b() + 1);
                xv71Var = (xv71) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((saa0) xv71Var.a()).start();
        try {
            l2t l2tVarA = xv71Var.a();
            fnf0Var.a = ang1Var;
            fnf0Var.b = xv71Var;
            fnf0Var.e = 1;
            objQ = ((s2t) l2tVarA).Q(fnf0Var);
            if (objQ == d9nVar) {
                return d9nVar;
            }
            ang1Var2 = ang1Var;
            xv71Var2 = xv71Var;
            synchronized (this.n) {
                xv71Var2.c(xv71Var2.b() - 1);
                if (xv71Var2.b() == 0) {
                    map2 = this.o;
                    if (map2.get(ang1Var2) == xv71Var2) {
                        map2.remove(ang1Var2);
                    }
                    ((saa0) xv71Var2.a()).d(null);
                }
                return objQ;
            }
        } catch (Throwable th3) {
            th = th3;
            ang1Var2 = ang1Var;
            xv71Var2 = xv71Var;
            synchronized (this.n) {
                xv71Var2.c(xv71Var2.b() - 1);
                if (xv71Var2.b() == 0) {
                    map = this.o;
                    if (map.get(ang1Var2) == xv71Var2) {
                        map.remove(ang1Var2);
                    }
                    ((saa0) xv71Var2.a()).d(null);
                }
                throw th;
            }
        }
    }

    public final Single b(String str, String str2, dhf0 dhf0Var, String str3) {
        if (!((qg4) this.g.get()).b()) {
            Single singleDoOnSuccess = c(str, str3).doOnSuccess(new hnf0(this, str, str2, (byte) 1));
            singleDoOnSuccess.getClass();
            return singleDoOnSuccess;
        }
        Single singleC = c(str, str3);
        Single singleDefer = Single.defer(new inf0(this, dhf0Var, str, (byte) 0));
        Scheduler scheduler = this.j;
        Single singleDoOnSuccess2 = Single.zip(singleC, singleDefer.subscribeOn(scheduler).observeOn(scheduler).onErrorReturnItem(c680.y()), ak20.X).doOnSuccess(new hnf0(this, str, str2, (byte) 0));
        singleDoOnSuccess2.getClass();
        return singleDoOnSuccess2;
    }

    public final Single c(String str, String str2) {
        if (!((dr4) this.f.a.get()).b()) {
            return this.d.b(str, str2);
        }
        Single singleFlatMap = rqt0.G(new vse0(this, (lnm) null, (byte) 2)).flatMap(new o3e0(this, str, str2, (byte) 10));
        singleFlatMap.getClass();
        return singleFlatMap;
    }

    public final Single d(String str, String str2, dhf0 dhf0Var, String str3) {
        if (str3 == null || !((qg4) this.g.get()).d()) {
            return rqt0.G(new knf0(this, str3, str, str2, dhf0Var, (lnm) null));
        }
        return rqt0.F(this.k, new jnf0(this, new ang1(str, str2, str3), dhf0Var, (lnm) null, (byte) 0));
    }
}
