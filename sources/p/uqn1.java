package p;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uqn1 extends mgn1 {
    public final /* synthetic */ arn1 l;

    public uqn1(arn1 arn1Var) {
        this.l = arn1Var;
    }

    @Override // p.mgn1
    public final void b1(int i) {
        this.l.i().post(new cqn1(this, i, (byte) 3));
    }

    @Override // p.mgn1
    public final void c1(int i) {
        this.l.i().post(new cqn1(this, i, (byte) 0));
    }

    @Override // p.mgn1
    public final void d1(int i) {
        this.l.i().post(new cqn1(this, i, (byte) 1));
    }

    @Override // p.mgn1
    public final void e1(yz5 yz5Var, String str, String str2, boolean z) {
        arn1 arn1Var = this.l;
        arn1Var.u = yz5Var;
        arn1Var.v = str;
        o5p1 o5p1Var = new o5p1(new Status(0, (String) null, (PendingIntent) null, (lal) null), yz5Var, str, str2, z);
        synchronized (arn1Var.s) {
            try {
                bsd1 bsd1Var = arn1Var.f3p;
                if (bsd1Var != null) {
                    bsd1Var.b(o5p1Var);
                }
                arn1Var.f3p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.mgn1
    public final void f1(int i) {
        this.l.l(i);
    }

    @Override // p.mgn1
    public final void g1(int i) {
        this.l.g(i);
    }

    @Override // p.mgn1
    public final void h1(int i) {
        this.l.g(i);
    }

    @Override // p.mgn1
    public final void i1(int i) {
        arn1 arn1Var = this.l;
        arn1Var.g(i);
        if (arn1Var.E != null) {
            arn1Var.i().post(new cqn1(this, i, (byte) 2));
        }
    }

    @Override // p.mgn1
    public final void k1(jdn1 jdn1Var) {
        this.l.i().post(new mqh1(this, jdn1Var, (byte) 14));
    }

    @Override // p.mgn1
    public final void l1(fbn1 fbn1Var) {
        this.l.i().post(new sjj1((Object) this, (Object) fbn1Var, (byte) 12));
    }

    @Override // p.mgn1
    public final void m1(String str, String str2) {
        arn1.H.a("Receive (type=text, ns=%s) %s", new Object[]{str, str2});
        this.l.i().post(new sl21((Object) this, (Object) str, (Object) str2, (byte) 12));
    }

    @Override // p.mgn1
    public final void o1(int i, long j) {
        this.l.h(i, j);
    }

    @Override // p.mgn1
    public final void p1(long j) {
        this.l.h(0, j);
    }
}
