package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8n0 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ v8n0 f;
    public final /* synthetic */ q0o1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8n0(lnm lnmVar, boolean z, boolean z2, v8n0 v8n0Var, q0o1 q0o1Var) {
        super(3, lnmVar);
        this.d = z;
        this.e = z2;
        this.f = v8n0Var;
        this.g = q0o1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t8n0 t8n0Var = new t8n0((lnm) obj3, this.d, this.e, this.f, this.g);
        t8n0Var.b = (vr20) obj;
        t8n0Var.c = obj2;
        return t8n0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        huz sii0Var;
        vr20 vr20Var = this.b;
        Object obj2 = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Map map = (Map) obj2;
            map.getClass();
            if (y7y0.G(map)) {
                sii0Var = new huz(new z7n0(this.d), (byte) 10);
            } else {
                boolean zL = y7y0.L(map);
                boolean z2 = this.e;
                if (zL) {
                    sii0Var = new huz(new z7n0(z2), (byte) 10);
                } else {
                    v8n0 v8n0Var = this.f;
                    v8n0Var.b.getClass();
                    sii0Var = (rh11.c(map) && z2) ? new sii0(v8n0Var.c.c(ql10.a), this.g, (byte) 8) : new huz(new z7n0(false), (byte) 10);
                }
            }
            this.b = null;
            this.c = null;
            this.a = true;
            Object objS = l4p1.s(vr20Var, sii0Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
