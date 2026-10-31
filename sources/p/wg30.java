package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wg30 implements vg30 {
    public final ig30 a;
    public final mwn0 b;
    public final y911 c;
    public final gun0 d;
    public final syn0 e;

    public wg30(mu9 mu9Var, ig30 ig30Var, mwn0 mwn0Var, y911 y911Var, gun0 gun0Var, syn0 syn0Var) {
        this.a = ig30Var;
        this.b = mwn0Var;
        this.c = y911Var;
        this.d = gun0Var;
        this.e = syn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    @Override // p.vg30
    public final void a(ug30 ug30Var, Intent intent, e6w0 e6w0Var) throws Throwable {
        son0 m231Var;
        son0 son0Var;
        son0 son0Var2;
        ges gesVar;
        n57.i(u890.j(Looper.myLooper(), Looper.getMainLooper()), "Fragment navigation must be applied on the main thread, but ran on %s.", Thread.currentThread().getName());
        a4p1 a4p1VarN = c4p1.n(intent);
        yy8 yy8Var = new yy8();
        yy8Var.n(intent.getStringExtra("title"));
        yy8Var.l(intent);
        yy8Var.m(intent.getStringExtra("tag"));
        lu9 lu9VarD = yy8Var.d();
        ee5 ee5VarO = c4p1.o(intent);
        this.c.a(ug30Var, intent);
        Bundle bundleExtra = intent.getBundleExtra("fragment_arguments");
        if (bundleExtra != null) {
            Bundle bundle = ug30Var.b().f;
            if (bundle != null) {
                bundle.putAll(bundleExtra);
            } else {
                ug30Var.b().T0(bundleExtra);
            }
        }
        if (!intent.getBooleanExtra("extra_internal_injected", false)) {
            this.b.f(gg.d(intent));
        }
        String stringExtra = intent.getStringExtra("navigation_transaction_id");
        if (stringExtra != null) {
            try {
                m231Var = new son0(UUID.fromString(stringExtra));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            son0Var = m231Var;
        } else {
            son0Var = null;
        }
        wyn0 wyn0Var = new wyn0(intent.getDataString());
        syn0 syn0Var = this.e;
        son0 son0VarA = syn0Var.a(wyn0Var);
        try {
            this.a.a(a4p1VarN, ug30Var.b(), lu9VarD, ee5VarO, e6w0Var);
            gun0 gun0Var = this.d;
            zf30 zf30VarB = ug30Var.b();
            zf30 zf30Var = !(zf30VarB instanceof m6r0) ? zf30VarB : null;
            if (zf30Var != null) {
                Object obj = zf30Var.j1;
                if (obj instanceof ges) {
                    gesVar = (ges) obj;
                } else {
                    gesVar = null;
                }
            } else {
                gesVar = null;
            }
            if (gesVar != null) {
                lj30 lj30VarN0 = zf30VarB.n0();
                fpo fpoVar = new fpo(gesVar, gun0Var, (lnm) null, (byte) 22);
                son0Var2 = son0VarA;
                try {
                    c921.y(cto1.q(lj30VarN0), (o8n) null, 0, new l4f0(gun0Var, lj30VarN0, fpoVar, (lnm) null, (byte) 14), 3);
                } catch (Throwable th2) {
                    th = th2;
                    syn0Var.e(son0Var2);
                    throw th;
                }
            } else {
                son0Var2 = son0VarA;
            }
            if (son0Var != null) {
                syn0Var.g(son0Var);
            }
            syn0Var.e(son0Var2);
        } catch (Throwable th3) {
            th = th3;
            son0Var2 = son0VarA;
        }
    }
}
