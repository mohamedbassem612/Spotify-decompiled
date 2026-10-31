package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ld41 implements kd41 {
    public static final df41 e = new df41(new ia4((byte) 16), new llj(12));
    public final Map a;
    public final nen0 b;
    public nd41 c;
    public final waq0 d;

    public ld41(Map map) {
        this.a = map;
        long[] jArr = hj41.a;
        this.b = new nen0();
        this.d = new waq0(this, (byte) 12);
    }

    @Override // p.kd41
    public final void b(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }

    @Override // p.kd41
    public final void c(Object obj, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(533563200);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.l0(obj);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                waq0 waq0Var = this.d;
                if (!((Boolean) waq0Var.invoke(obj)).booleanValue()) {
                    hhg1.f(cy30.m("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map map = (Map) this.a.get(obj);
                kiv kivVar = pd41.a;
                qd41 qd41Var = new qd41(new od41(map, waq0Var));
                x340Var.s0(qd41Var);
                objT = qd41Var;
            }
            qd41 qd41Var2 = (qd41) objT;
            mod.c(new ely0[]{pd41.a.a(qd41Var2), lge0.a.a(qd41Var2)}, j2iVar, x340Var, (i2 & 112) | 8);
            boolean zI = x340Var.i(this) | x340Var.i(obj) | x340Var.i(qd41Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new pg(this, obj, qd41Var2, (byte) 26);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
            x340Var.w();
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(this, obj, j2iVar, i, (byte) 10);
        }
    }
}
