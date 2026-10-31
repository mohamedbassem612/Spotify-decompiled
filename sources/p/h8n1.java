package p;

import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h8n1 implements nz40, oz40 {
    public final px40 l;
    public final gi5 m;
    public final frl1 n;
    public final int q;
    public final s8n1 r;
    public boolean s;
    public final /* synthetic */ pz40 w;
    public final LinkedList a = new LinkedList();
    public final HashSet o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f46p = new HashMap();
    public final ArrayList t = new ArrayList();
    public lal u = null;
    public int v = 0;

    public h8n1(pz40 pz40Var, kz40 kz40Var) {
        this.w = pz40Var;
        jim0 jim0Var = pz40Var.N0;
        Looper looper = jim0Var.getLooper();
        d520 d520VarL = kz40Var.a().l();
        px40 px40VarK = kz40Var.d.z().k(kz40Var.a, looper, d520VarL, kz40Var.e, this, this);
        cp5 cp5Var = kz40Var.c;
        if (cp5Var == null || !(px40VarK instanceof xaa)) {
            String str = kz40Var.b;
            if (str != null && (px40VarK instanceof xaa)) {
                px40VarK.D(str);
            }
        } else {
            px40VarK.C(cp5Var);
        }
        this.l = px40VarK;
        this.m = kz40Var.f;
        this.n = new frl1((byte) 11);
        this.q = kz40Var.h;
        if (px40VarK.B()) {
            this.r = new s8n1(pz40Var.e, jim0Var, kz40Var.a().l());
        } else {
            this.r = null;
        }
    }

    @Override // p.nz40
    public final void B0(int i) {
        pz40 pz40Var = this.w;
        if (Looper.myLooper() == pz40Var.N0.getLooper()) {
            b(i);
        } else {
            pz40Var.N0.post(new ukd(this, i, (byte) 6));
        }
    }

    public final void a() {
        px40 px40Var = this.l;
        pz40 pz40Var = this.w;
        zod.m(pz40Var.N0);
        this.u = null;
        i(lal.f);
        if (this.s) {
            jim0 jim0Var = pz40Var.N0;
            gi5 gi5Var = this.m;
            jim0Var.removeMessages(11, gi5Var);
            pz40Var.N0.removeMessages(9, gi5Var);
            this.s = false;
        }
        Iterator it = this.f46p.values().iterator();
        while (it.hasNext()) {
            lne lneVar = ((r8n1) it.next()).a;
            if (j(lneVar.b()) != null) {
                it.remove();
            } else {
                try {
                    lneVar.d(px40Var, new bsd1());
                } catch (DeadObjectException unused) {
                    B0(3);
                    px40Var.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException unused2) {
                    it.remove();
                }
            }
        }
        d();
        h();
    }

    public final void b(int i) {
        pz40 pz40Var = this.w;
        zod.m(pz40Var.N0);
        this.u = null;
        this.s = true;
        this.n.m(i, this.l.k());
        jim0 jim0Var = pz40Var.N0;
        gi5 gi5Var = this.m;
        jim0Var.sendMessageDelayed(Message.obtain(jim0Var, 9, gi5Var), 5000L);
        jim0 jim0Var2 = pz40Var.N0;
        jim0Var2.sendMessageDelayed(Message.obtain(jim0Var2, 11, gi5Var), 120000L);
        pz40Var.g.h();
        Iterator it = this.f46p.values().iterator();
        while (it.hasNext()) {
            ((r8n1) it.next()).getClass();
        }
    }

    public final boolean c(lal lalVar) {
        synchronized (pz40.R0) {
            try {
                pz40 pz40Var = this.w;
                if (pz40Var.X == null || !pz40Var.Y.contains(this.m)) {
                    return false;
                }
                c8n1 c8n1Var = pz40Var.X;
                int i = this.q;
                c8n1Var.getClass();
                n9n1 n9n1Var = new n9n1(lalVar, i);
                if (xvj1.s(c8n1Var.c, n9n1Var)) {
                    c8n1Var.d.post(new ni(c8n1Var, n9n1Var));
                }
                pz40Var.f.i(pz40Var.e, lalVar, true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g9n1 g9n1Var = (g9n1) arrayList.get(i);
            if (!this.l.u()) {
                return;
            }
            if (e(g9n1Var)) {
                linkedList.remove(g9n1Var);
            }
        }
    }

    public final boolean e(g9n1 g9n1Var) {
        if (!(g9n1Var instanceof n8n1)) {
            frl1 frl1Var = this.n;
            px40 px40Var = this.l;
            g9n1Var.c(frl1Var, px40Var.B());
            try {
                g9n1Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                B0(1);
                px40Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        n8n1 n8n1Var = (n8n1) g9n1Var;
        pl10 pl10VarJ = j(n8n1Var.f(this));
        if (pl10VarJ == null) {
            frl1 frl1Var2 = this.n;
            px40 px40Var2 = this.l;
            g9n1Var.c(frl1Var2, px40Var2.B());
            try {
                g9n1Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                B0(1);
                px40Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.l.getClass().getName();
        String str = pl10VarJ.a;
        long j = pl10VarJ.j();
        int length = name.length();
        new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(j).length() + 2);
        pz40 pz40Var = this.w;
        if (!pz40Var.O0 || !n8n1Var.g(this)) {
            n8n1Var.b(new UnsupportedApiCallException(pl10VarJ));
            return true;
        }
        int iH = n8n1Var.h(this);
        i8n1 i8n1Var = new i8n1(this.m, pl10VarJ);
        ArrayList arrayList = this.t;
        int iIndexOf = arrayList.indexOf(i8n1Var);
        if (iIndexOf >= 0) {
            i8n1 i8n1Var2 = (i8n1) arrayList.get(iIndexOf);
            pz40Var.N0.removeMessages(15, i8n1Var2);
            pz40Var.N0.sendMessageDelayed(Message.obtain(pz40Var.N0, 15, i8n1Var2), 5000L);
            return false;
        }
        arrayList.add(i8n1Var);
        pz40Var.N0.sendMessageDelayed(Message.obtain(pz40Var.N0, 15, i8n1Var), 5000L);
        pz40Var.N0.sendMessageDelayed(Message.obtain(pz40Var.N0, 16, i8n1Var), 120000L);
        lal lalVar = new lal(1, 2, null, null, Integer.valueOf(iH));
        if (c(lalVar)) {
            String str2 = pl10VarJ.a;
            long j2 = pl10VarJ.j();
            new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(j2).length());
            return false;
        }
        if (!pz40Var.g(lalVar, this.q)) {
            return false;
        }
        String str3 = pl10VarJ.a;
        long j3 = pl10VarJ.j();
        new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(j3).length());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z) {
        zod.m(this.w.N0);
        if ((status == null) == (exc == null)) {
            hhg1.n("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            g9n1 g9n1Var = (g9n1) it.next();
            if (!z || g9n1Var.a == 2) {
                if (status != null) {
                    g9n1Var.a(status);
                } else {
                    g9n1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        zod.m(this.w.N0);
        f(status, null, false);
    }

    public final void h() {
        pz40 pz40Var = this.w;
        jim0 jim0Var = pz40Var.N0;
        gi5 gi5Var = this.m;
        jim0Var.removeMessages(12, gi5Var);
        jim0 jim0Var2 = pz40Var.N0;
        jim0Var2.sendMessageDelayed(jim0Var2.obtainMessage(12, gi5Var), pz40Var.a);
    }

    public final void i(lal lalVar) {
        HashSet hashSet = this.o;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((m9n1) it.next()).c(this.m, lalVar, k8p1.h(lalVar, lal.f) ? this.l.h() : null);
        }
        hashSet.clear();
    }

    public final pl10 j(pl10[] pl10VarArr) {
        if (pl10VarArr != null && pl10VarArr.length != 0) {
            pl10[] pl10VarArrF = this.l.f();
            if (pl10VarArrF == null) {
                pl10VarArrF = new pl10[0];
            }
            y36 y36Var = new y36(pl10VarArrF.length);
            for (pl10 pl10Var : pl10VarArrF) {
                y36Var.put(pl10Var.a, Long.valueOf(pl10Var.j()));
            }
            for (pl10 pl10Var2 : pl10VarArr) {
                Long l = (Long) y36Var.get(pl10Var2.a);
                if (l == null || l.longValue() < pl10Var2.j()) {
                    return pl10Var2;
                }
            }
        }
        return null;
    }

    public final void k(lal lalVar) {
        zod.m(this.w.N0);
        px40 px40Var = this.l;
        String name = px40Var.getClass().getName();
        String strValueOf = String.valueOf(lalVar);
        px40 px40Var2 = px40Var;
        px40Var2.d(rjx.o(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        l(lalVar, null);
    }

    public final void l(lal lalVar, RuntimeException runtimeException) {
        pz40 pz40Var = this.w;
        zod.m(pz40Var.N0);
        s8n1 s8n1Var = this.r;
        if (s8n1Var != null) {
            s8n1Var.Z0();
        }
        zod.m(this.w.N0);
        this.u = null;
        pz40Var.g.h();
        i(lalVar);
        if ((this.l instanceof s9n1) && lalVar.b != 24) {
            pz40Var.b = true;
            jim0 jim0Var = pz40Var.N0;
            jim0Var.sendMessageDelayed(jim0Var.obtainMessage(19), 300000L);
        }
        int i = lalVar.b;
        if (i == 4) {
            g(pz40.Q0);
            return;
        }
        if (i == 25) {
            g(pz40.c(this.m, lalVar));
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.u = lalVar;
            return;
        }
        if (runtimeException != null) {
            zod.m(pz40Var.N0);
            f(null, runtimeException, false);
            return;
        }
        boolean z = pz40Var.O0;
        gi5 gi5Var = this.m;
        if (!z) {
            g(pz40.c(gi5Var, lalVar));
            return;
        }
        f(pz40.c(gi5Var, lalVar), null, true);
        if (linkedList.isEmpty() || c(lalVar) || pz40Var.g(lalVar, this.q)) {
            return;
        }
        if (lalVar.b == 18) {
            this.s = true;
        }
        if (!this.s) {
            g(pz40.c(gi5Var, lalVar));
        } else {
            jim0 jim0Var2 = pz40Var.N0;
            jim0Var2.sendMessageDelayed(Message.obtain(jim0Var2, 9, gi5Var), 5000L);
        }
    }

    public final void m(g9n1 g9n1Var) {
        zod.m(this.w.N0);
        boolean zU = this.l.u();
        LinkedList linkedList = this.a;
        if (zU) {
            if (e(g9n1Var)) {
                h();
                return;
            } else {
                linkedList.add(g9n1Var);
                return;
            }
        }
        linkedList.add(g9n1Var);
        lal lalVar = this.u;
        if (lalVar == null || lalVar.b == 0 || lalVar.c == null) {
            o();
        } else {
            l(lalVar, null);
        }
    }

    public final void n() {
        zod.m(this.w.N0);
        g(pz40.P0);
        this.n.l();
        for (c9d0 c9d0Var : (c9d0[]) this.f46p.keySet().toArray(new c9d0[0])) {
            m(new a9n1(c9d0Var, new bsd1()));
        }
        i(new lal(4, null, null));
        px40 px40Var = this.l;
        if (px40Var.u()) {
            px40Var.z(new dmj1(this, (byte) 11));
        }
    }

    public final void o() {
        pz40 pz40Var = this.w;
        zod.m(pz40Var.N0);
        px40 px40Var = this.l;
        if (px40Var.u() || px40Var.v()) {
            return;
        }
        try {
            int iF = pz40Var.g.f(pz40Var.e, px40Var);
            if (iF != 0) {
                lal lalVar = new lal(iF, null, null);
                new StringBuilder(px40Var.getClass().getName().length() + 35 + lalVar.toString().length());
                l(lalVar, null);
                return;
            }
            kl1 kl1Var = new kl1(pz40Var, px40Var, this.m);
            if (px40Var.B()) {
                s8n1 s8n1Var = this.r;
                zod.s(s8n1Var);
                s8n1Var.Y0(kl1Var);
            }
            try {
                px40Var.a(kl1Var);
            } catch (SecurityException e) {
                l(new lal(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            l(new lal(10, null, null), e2);
        }
    }

    @Override // p.nz40
    public final void onConnected() {
        pz40 pz40Var = this.w;
        if (Looper.myLooper() == pz40Var.N0.getLooper()) {
            a();
        } else {
            pz40Var.N0.post(new seg1(this, (byte) 12));
        }
    }

    @Override // p.oz40
    public final void s(lal lalVar) {
        l(lalVar, null);
    }
}
