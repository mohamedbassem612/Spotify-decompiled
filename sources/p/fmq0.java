package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fmq0 extends rcr {
    public final /* synthetic */ byte g;
    public final v35 h;
    public final hab0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmq0(k9r k9rVar, xfb0 xfb0Var, t8r0 t8r0Var, gw70 gw70Var, pcr pcrVar, v35 v35Var, byte b) {
        super(k9rVar, xfb0Var, t8r0Var, gw70Var, pcrVar);
        this.g = b;
        switch (b) {
            case 1:
                super(k9rVar, xfb0Var, t8r0Var, gw70Var, pcrVar);
                this.h = v35Var;
                this.i = dw81.X0;
                break;
            default:
                this.h = v35Var;
                this.i = new nrj0(this, (byte) 28);
                break;
        }
    }

    public static emq0 d(hi hiVar) {
        Object next;
        d7 d7Var = new d7(emq0.d, (byte) 0);
        while (d7Var.hasNext()) {
            next = d7Var.next();
            emq0 emq0Var = (emq0) next;
            String str = emq0Var.b;
            if (rcr.c(hiVar, str, emq0Var.a, str)) {
                return (emq0) next;
            }
        }
        next = null;
        return (emq0) next;
    }

    @Override // p.rcr
    public final boolean a(hi hiVar) {
        byte b = this.g;
        v35 v35Var = this.h;
        switch (b) {
            case 0:
                return v35Var.c() && d(hiVar) != null && super.a(hiVar);
            default:
                if (!v35Var.e()) {
                    return false;
                }
                t0z t0zVar = ekm1.b;
                if (t0zVar.isEmpty()) {
                    return false;
                }
                Iterator it = t0zVar.iterator();
                while (it.hasNext()) {
                    ((ekm1) it.next()).getClass();
                    if (rcr.c(hiVar, "REDMI Headphones Neo", "REDMI", "REDMI Headphones Neo")) {
                        return super.a(hiVar);
                    }
                }
                return false;
        }
    }

    @Override // p.rcr
    public final iu30 b() {
        switch (this.g) {
            case 0:
                return this.i;
            default:
                return (dw81) this.i;
        }
    }
}
