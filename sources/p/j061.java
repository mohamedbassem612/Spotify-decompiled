package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j061 implements anc0, mqb1 {
    public final d0r a;
    public final q8n b;
    public xab1 c;
    public gz51 d;

    public j061(d0r d0rVar, q8n q8nVar) {
        this.a = d0rVar;
        this.b = q8nVar;
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    @Override // p.anc0
    public final void b() {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = fn31.T(smo1.e(this.b), (o8n) null, 0, new b751(this, (lnm) null, (byte) 7), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        i061 i061Var;
        m231 m231Var;
        if (onmVar instanceof i061) {
            i061Var = (i061) onmVar;
            int i = i061Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i061Var.c = i - Integer.MIN_VALUE;
            } else {
                i061Var = new i061(this, onmVar);
            }
        } else {
            i061Var = new i061(this, onmVar);
        }
        Object obj = i061Var.a;
        int i2 = i061Var.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                gz51 gz51Var = this.d;
                if (gz51Var == null) {
                    return m231Var2;
                }
                d0r d0rVar = this.a;
                pwc0 pwc0Var = pwc0.D;
                dz51 dz51Var = new dz51(gz51Var);
                i061Var.c = 1;
                Object objD = d0r.d(d0rVar, pwc0Var, m231Var2, dz51Var, i061Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Restoring the playlist selection failed.", new Object[0]);
        }
        this.d = null;
        return m231Var2;
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("selection_restore_selection_mode_active")) {
            z6x stringArrayList = bundle.getStringArrayList("selection_restore_selected_keys");
            if (stringArrayList == null) {
                stringArrayList = z6x.a;
            }
            this.d = new gz51(o7h.p1((Iterable) stringArrayList), true);
        }
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        gz51 gz51Var = (gz51) u890.G(x2p1.n(this.a, ujo1.u(), rih1.a));
        if (gz51Var == null) {
            return;
        }
        bundle.putBoolean("selection_restore_selection_mode_active", gz51Var.a);
        bundle.putStringArrayList("selection_restore_selected_keys", new ArrayList<>(gz51Var.b));
    }
}
