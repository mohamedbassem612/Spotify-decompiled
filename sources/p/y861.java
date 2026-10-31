package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.view.View;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y861 {
    public static y861 e;
    public static final Object f = new Object();
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public y861(zob1 zob1Var, iac0 iac0Var, qns0 qns0Var, b7n b7nVar, as00 as00Var, boolean z, boolean z2) {
        this.b = qns0Var;
        this.a = z;
        bpb1 bpb1VarB = gio1.b("");
        this.c = bpb1VarB;
        this.d = d5p1.t(h5p1.r(bpb1VarB, zob1Var, h5p1.t(as00Var.a(), b7nVar.a(q6n.a), new irp0((byte) 24)), z2 ? hu20.e(bpb1VarB, new afb1((lnm) null, this, (byte) 7)) : h4p1.m(Boolean.FALSE), new ddm(this, (lnm) null, (byte) 2)), cto1.q(iac0Var), new alb1(5000L, Long.MAX_VALUE), new zag1());
    }

    public static void c(CountDownLatch countDownLatch, int i, x861 x861Var) {
        try {
            if (countDownLatch.await(i, TimeUnit.MILLISECONDS)) {
                return;
            }
            x861Var.cancel(true);
            x861Var.b(new b961(-120, "Thread task timed out. Timeout: " + i));
        } catch (InterruptedException e2) {
            i1k0.n("Caught InterruptedException " + e2.getMessage());
            x861Var.cancel(true);
            x861Var.b(new b961(-120, e2.getMessage()));
        }
    }

    public static boolean j() {
        return !n3c.h().b.B().equals("bnc_no_value");
    }

    public void a() {
        beu beuVar = (beu) this.d;
        synchronized (beuVar) {
            try {
                if (this.a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (u890.j(((udu) this.b).g, this)) {
                    beuVar.c(this, false);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str, String str2) {
        ((ConcurrentHashMap) this.d).put(str, str2);
    }

    public void d() {
        synchronized (f) {
            try {
                i1k0.B("Queue operation clear: " + ((List) this.b));
                ((List) this.b).clear();
                i1k0.B("Queue cleared.");
            } catch (UnsupportedOperationException e2) {
                i1k0.n("Caught UnsupportedOperationException " + e2.getMessage());
            }
        }
    }

    public void e() {
        beu beuVar = (beu) this.d;
        synchronized (beuVar) {
            try {
                if (this.a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (u890.j(((udu) this.b).g, this)) {
                    beuVar.c(this, true);
                }
                this.a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        udu uduVar = (udu) this.b;
        if (u890.j(uduVar.g, this)) {
            beu beuVar = (beu) this.d;
            if (beuVar.Y) {
                beuVar.c(this, false);
            } else {
                uduVar.f = true;
            }
        }
    }

    public void g(u861 u861Var, int i) {
        i1k0.B("executeTimedBranchPostTask " + u861Var);
        if (u861Var instanceof v861) {
            i1k0.B("callback to be returned " + ((v861) u861Var).i);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        x861 x861Var = new x861(this, u861Var, countDownLatch);
        x861Var.a(new Void[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(new w861(this, countDownLatch, i, x861Var)).start();
        } else {
            c(countDownLatch, i, x861Var);
        }
    }

    public int h() {
        int size;
        synchronized (f) {
            size = ((List) this.b).size();
        }
        return size;
    }

    public void i(u861 u861Var) {
        boolean z;
        boolean z2;
        boolean z3;
        i1k0.m("handleNewRequest " + u861Var);
        if (n3c.h().k.a && !u861Var.i()) {
            String str = "Requested operation cannot be completed since tracking is disabled [" + eqq.f(u861Var.d) + "]";
            i1k0.m(str);
            u861Var.f(-117, str);
            return;
        }
        if (n3c.h().n != 1 && !((z = u861Var instanceof v861)) && !((z2 = u861Var instanceof oaz0)) && !((z3 = u861Var instanceof paz0)) && !z && !z2 && !z3) {
            i1k0.m("handleNewRequest " + u861Var + " needs a session");
            u861Var.g.add(t861.a);
        }
        synchronized (f) {
            try {
                i1k0.B("Queue operation enqueue. Request: " + u861Var);
                ((List) this.b).add(u861Var);
                if (h() >= 25) {
                    i1k0.B("Queue maxed out. Removing index 1.");
                    ((List) this.b).remove(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        System.currentTimeMillis();
        p("handleNewRequest");
    }

    public void k(v861 v861Var, int i) {
        synchronized (f) {
            try {
                try {
                    i1k0.B("Queue operation insert. Request: " + v861Var + " Size: " + ((List) this.b).size() + " Index: " + i);
                    if (((List) this.b).size() < i) {
                        i = ((List) this.b).size();
                    }
                    ((List) this.b).add(i, v861Var);
                } catch (IndexOutOfBoundsException e2) {
                    i1k0.n("Caught IndexOutOfBoundsException " + e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c291 l(int i) {
        final beu beuVar = (beu) this.d;
        synchronized (beuVar) {
            if (this.a) {
                throw new IllegalStateException("Check failed.");
            }
            if (!u890.j(((udu) this.b).g, this)) {
                return sj1.e();
            }
            if (!((udu) this.b).e) {
                boolean[] zArr = (boolean[]) this.c;
                zArr.getClass();
                zArr[i] = true;
            }
            try {
                final byte b = 0;
                return new ml10(beuVar.b.i((s8s0) ((udu) this.b).d.get(i), false), new iu30() { // from class: p.sdu
                    @Override // p.iu30
                    public final Object invoke(Object obj) {
                        switch (b) {
                            case 0:
                                beu beuVar2 = (beu) beuVar;
                                y861 y861Var = (y861) this;
                                synchronized (beuVar2) {
                                    y861Var.f();
                                }
                                return rih1.a;
                            default:
                                m8m1 m8m1Var = (m8m1) beuVar;
                                vu30 vu30Var = (vu30) this;
                                qzj qzjVar = (qzj) obj;
                                if (!m8m1Var.c) {
                                    iac0 iac0VarD = qzjVar.d();
                                    View view = qzjVar.a;
                                    x8c0 lifecycle = iac0VarD.getLifecycle();
                                    m8m1Var.e = vu30Var;
                                    if (m8m1Var.d == null) {
                                        if (u890.j(Looper.myLooper(), view.getHandler().getLooper())) {
                                            m8m1Var.d = lifecycle;
                                            lifecycle.a(m8m1Var);
                                        } else {
                                            view.post(new qub1(m8m1Var, lifecycle, (byte) 21));
                                        }
                                    } else if (lifecycle.b().a(w8c0.c)) {
                                        m8m1Var.b.A(apo.j(-1723985096, new qg(m8m1Var, qzjVar, vu30Var, (byte) 12), true));
                                    }
                                }
                                return rih1.a;
                        }
                    }
                });
            } catch (FileNotFoundException unused) {
                return sj1.e();
            }
        }
    }

    public u861 m() {
        u861 u861Var;
        synchronized (f) {
            try {
                u861Var = (u861) ((List) this.b).get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException e2) {
                i1k0.C("Caught Exception ServerRequestQueue peek: " + e2.getMessage());
                u861Var = null;
            }
        }
        return u861Var;
    }

    public u861 n(int i) {
        Throwable e2;
        u861 u861Var;
        synchronized (f) {
            u861 u861Var2 = null;
            try {
                try {
                    u861Var = (u861) ((List) this.b).get(i);
                    try {
                        i1k0.B("Queue operation peekAt " + u861Var);
                    } catch (IndexOutOfBoundsException | NoSuchElementException e3) {
                        e2 = e3;
                        u861Var2 = u861Var;
                        i1k0.n("Caught Exception ServerRequestQueue peekAt " + i + ": " + e2.getMessage());
                        u861Var = u861Var2;
                    }
                } catch (IndexOutOfBoundsException e4) {
                    e2 = e4;
                } catch (NoSuchElementException e5) {
                    e2 = e5;
                }
            } catch (IndexOutOfBoundsException | NoSuchElementException e6) {
                e2 = e6;
            }
        }
        return u861Var;
    }

    public void o() {
        String string;
        if (i3a.c(i1k0.o()) == i3a.c(5)) {
            synchronized (f) {
                try {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < ((List) this.b).size(); i++) {
                        sb.append(((List) this.b).get(i));
                        sb.append(" with locks ");
                        u861 u861Var = (u861) ((List) this.b).get(i);
                        u861Var.getClass();
                        try {
                            string = Arrays.toString(u861Var.g.toArray());
                        } catch (ConcurrentModificationException unused) {
                            i1k0.C("ConcurrentModificationException in printWaitLocks - queue modified during iteration.");
                            string = "[concurrent-modification]";
                        }
                        sb.append(string);
                        sb.append("\n");
                    }
                    i1k0.B("Queue is: " + ((Object) sb));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void p(String str) {
        Semaphore semaphore = (Semaphore) this.c;
        i1k0.B("processNextQueueItem ".concat(str));
        o();
        try {
            semaphore.acquire();
            if (this.a || h() <= 0) {
                semaphore.release();
                return;
            }
            this.a = true;
            u861 u861VarM = m();
            semaphore.release();
            if (u861VarM == null) {
                q(null);
                return;
            }
            i1k0.m("processNextQueueItem, req " + u861VarM);
            if (u861VarM.g.size() > 0) {
                this.a = false;
                return;
            }
            if (!(u861VarM instanceof z861) && !(u861VarM instanceof oaz0) && !(u861VarM instanceof paz0) && !j()) {
                i1k0.m("Branch Error: User session has not been initialized!");
                this.a = false;
                i1k0.B("Invoking " + u861VarM + " handleFailure. Has no session. hasUser: " + j());
                StringBuilder sb = new StringBuilder("Request ");
                sb.append(u861VarM);
                sb.append(" has no session.");
                u861VarM.f(-101, sb.toString());
                return;
            }
            if ((((u861VarM instanceof v861) || (u861VarM instanceof oaz0) || (u861VarM instanceof paz0)) ? false : true) && (n3c.h().b.F("bnc_session_id").equals("bnc_no_value") || n3c.h().b.C().equals("bnc_no_value"))) {
                this.a = false;
                i1k0.B("Invoking " + u861VarM + " handleFailure. Has no session.");
                u861VarM.f(-101, "Request " + u861VarM + " has no session.");
                return;
            }
            SharedPreferences sharedPreferences = (SharedPreferences) n3c.h().b.a;
            g(u861VarM, sharedPreferences.getInt("bnc_connect_timeout", 10000) + sharedPreferences.getInt("bnc_timeout", 5500));
        } catch (Exception e2) {
            StringBuilder sbT = l1d.t("Caught Exception ", str, " processNextQueueItem: ");
            sbT.append(e2.getMessage());
            sbT.append(" stacktrace: ");
            sbT.append(i1k0.x(e2));
            i1k0.n(sbT.toString());
        }
    }

    public void q(u861 u861Var) {
        synchronized (f) {
            try {
                try {
                    i1k0.B("Queue operation remove. Request: " + u861Var);
                    i1k0.B("Queue operation remove. Removed: " + (((List) this.b).remove(u861Var) || !((List) this.b).contains(u861Var)));
                } catch (UnsupportedOperationException e2) {
                    i1k0.n("Caught UnsupportedOperationException " + e2.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(t861 t861Var) {
        synchronized (f) {
            try {
                for (u861 u861Var : (List) this.b) {
                    if (u861Var != null) {
                        u861Var.g.remove(t861Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        for (int i = 0; i < h(); i++) {
            try {
                u861 u861VarN = n(i);
                i1k0.B("Queue operation updateAllRequestsInQueue updating: " + u861VarN);
                if (u861VarN != null) {
                    JSONObject jSONObject = u861VarN.c;
                    f4t f4tVar = f4t.RandomizedBundleToken;
                    if (jSONObject.has("session_id")) {
                        u861VarN.c.put("session_id", n3c.h().b.F("bnc_session_id"));
                    }
                    if (jSONObject.has("randomized_bundle_token")) {
                        u861VarN.c.put("randomized_bundle_token", n3c.h().b.B());
                    }
                    if (jSONObject.has("randomized_device_token")) {
                        u861VarN.c.put("randomized_device_token", n3c.h().b.C());
                    }
                }
            } catch (JSONException e2) {
                i1k0.n("Caught JSONException " + e2.getMessage());
                return;
            }
        }
    }

    public y861() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public y861(Context context) {
        this.c = new Semaphore(1);
        this.a = false;
        this.d = new ConcurrentHashMap();
        i1k0.B("Creating ServerRequestQueue " + context);
        context.getSharedPreferences("BNC_Server_Request_Queue", 0).edit();
        List listSynchronizedList = Collections.synchronizedList(new LinkedList());
        this.b = listSynchronizedList;
        i1k0.B("Created queue " + listSynchronizedList);
    }

    public y861(beu beuVar, udu uduVar) {
        boolean[] zArr;
        this.d = beuVar;
        this.b = uduVar;
        if (uduVar.e) {
            zArr = null;
        } else {
            beuVar.getClass();
            zArr = new boolean[2];
        }
        this.c = zArr;
    }
}
