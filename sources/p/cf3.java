package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cf3 implements shm {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public /* synthetic */ cf3(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        qxc0 qxc0Var;
        switch (this.a) {
            case 0:
                return new huz(d(hti0Var), (byte) 10);
            default:
                boolean zG = false;
                if (this.b && (qxc0Var = hti0Var.d) != null) {
                    zG = gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h, dlc0.g});
                }
                return !zG ? new huz((Object) null, (byte) 10) : new qsc0(((ov20) this.c).a, this, hti0Var, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        dot0 dot0Var;
        qxc0 qxc0Var;
        switch (this.a) {
            case 0:
                return d(hti0Var);
            default:
                if (lnmVar instanceof dot0) {
                    dot0Var = (dot0) lnmVar;
                    int i = dot0Var.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dot0Var.d = i - Integer.MIN_VALUE;
                    } else {
                        dot0Var = new dot0(this, (onm) lnmVar);
                    }
                } else {
                    dot0Var = new dot0(this, (onm) lnmVar);
                }
                Object objO = dot0Var.b;
                int i2 = dot0Var.d;
                if (i2 == 0) {
                    hm5.M(objO);
                    boolean zG = false;
                    if (this.b && (qxc0Var = hti0Var.d) != null) {
                        zG = gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h, dlc0.g});
                    }
                    if (!zG) {
                        return null;
                    }
                    i2p0 i2p0Var = new i2p0(this, (lnm) null, (byte) 24);
                    dot0Var.a = hti0Var;
                    dot0Var.d = 1;
                    objO = rc2.O(2000L, i2p0Var, dot0Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hti0Var = dot0Var.a;
                    hm5.M(objO);
                }
                b7x b7xVar = (Map) objO;
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                return c(b7xVar, hti0Var);
        }
    }

    public jhm c(Map map, hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        boolean z = (qxc0Var != null ? qxc0Var.U0 : null) == r2q0.d;
        if (y7y0.G(map) || y7y0.L(map) || z) {
            return ((oy1) this.d).a(hti0Var.a);
        }
        return null;
    }

    public jhm d(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var != null && ((me30) this.d).a(qxc0Var.e) == le30.b && this.b) {
            return jl21.b((jl21) this.c, hti0Var.a, hti0Var.b);
        }
        return null;
    }
}
