package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cgb0 implements anc0, mqb1 {
    public final ye90 a;
    public final yqg b;
    public final q8n c;
    public final q8n d;
    public final String e;
    public final String f;
    public final bpb1 g;
    public final bpb1 h;
    public xab1 i;
    public Long j;
    public final ayh k;
    public volatile boolean l;
    public boolean m;

    public cgb0(ye90 ye90Var, yqg yqgVar, q8n q8nVar, q8n q8nVar2, String str, String str2) {
        this.a = ye90Var;
        this.b = yqgVar;
        this.c = q8nVar;
        this.d = q8nVar2;
        this.e = str;
        this.f = str2;
        bpb1 bpb1VarB = gio1.b(tmw0.a);
        this.g = bpb1VarB;
        this.h = bpb1VarB;
        this.k = sap1.a();
    }

    @Override // p.anc0
    public final void a() {
        if (!this.l || this.m) {
            return;
        }
        long jB = this.b.b();
        this.i = fn31.T(smo1.e(this.c), (o8n) null, 0, new wc80(this.i, this, jB, (lnm) null, (byte) 2), 3);
    }

    @Override // p.anc0
    public final void b() {
        long jB;
        this.m = false;
        if (this.l) {
            return;
        }
        xab1 xab1Var = this.i;
        if (xab1Var == null || !xab1Var.isActive()) {
            Long l = this.j;
            if (l != null) {
                jB = l.longValue();
            } else {
                jB = this.b.b();
                this.j = Long.valueOf(jB);
            }
            this.i = fn31.T(smo1.e(this.c), (o8n) null, 0, new agb0(this, jB, (lnm) null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, onm onmVar) {
        bgb0 bgb0Var;
        if (onmVar instanceof bgb0) {
            bgb0Var = (bgb0) onmVar;
            int i = bgb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgb0Var.c = i - Integer.MIN_VALUE;
            } else {
                bgb0Var = new bgb0(this, onmVar);
            }
        } else {
            bgb0Var = new bgb0(this, onmVar);
        }
        Object obj = bgb0Var.a;
        int i2 = bgb0Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            ye90 ye90Var = this.a;
            String str = this.e;
            String str2 = this.f;
            bgb0Var.c = 1;
            Object objA = ((r4r) ye90Var.c).a(new rgb0(ye90Var, str, str2, j, null), bgb0Var);
            d9n d9nVar = d9n.a;
            if (objA != d9nVar) {
                objA = rih1Var;
            }
            return objA == d9nVar ? d9nVar : rih1Var;
        } catch (IOException e) {
            Logger.e(e, "Failed to write the last visited timestamp", new Object[0]);
            return rih1Var;
        }
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("last_visited_current_visit_millis")) {
            this.j = Long.valueOf(bundle.getLong("last_visited_current_visit_millis"));
        }
        if (!bundle.getBoolean("last_visited_visit_recorded")) {
            return;
        }
        this.l = true;
        this.k.m0(rih1.a);
        this.g.m((Object) null, bundle.containsKey("last_visited_previous_visit_millis") ? new rmw0(bundle.getLong("last_visited_previous_visit_millis")) : smw0.a);
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        if (!this.l) {
            this.m = true;
        }
        Long l = this.j;
        if (l != null) {
            bundle.putLong("last_visited_current_visit_millis", l.longValue());
        }
        if (this.l) {
            bundle.putBoolean("last_visited_visit_recorded", true);
            Object value = this.g.getValue();
            rmw0 rmw0Var = value instanceof rmw0 ? (rmw0) value : null;
            if (rmw0Var != null) {
                bundle.putLong("last_visited_previous_visit_millis", rmw0Var.a);
            }
        }
    }

    @Override // p.anc0
    public final Object h(l8t0 l8t0Var) {
        Object objQ = this.k.Q(l8t0Var);
        return objQ == d9n.a ? objQ : rih1.a;
    }
}
