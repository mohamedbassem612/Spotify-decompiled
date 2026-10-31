package p;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class je1 implements shm {
    public static final Set b = f46.S0(new dlc0[]{dlc0.d, dlc0.h, dlc0.g});
    public final cp5 a;

    public je1(cp5 cp5Var) {
        this.a = cp5Var;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        return new huz(c(hti0Var), (byte) 10);
    }

    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        return c(hti0Var);
    }

    public final jhm c(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || !qxc0Var.t.b) {
            return null;
        }
        Map map = qxc0Var.O0;
        dlc0[] dlc0VarArr = (dlc0[]) b.toArray(new dlc0[0]);
        if (!gyo1.G(map, (dlc0[]) Arrays.copyOf(dlc0VarArr, dlc0VarArr.length))) {
            return null;
        }
        return new jhm("list_add_more", (hux) irx.c, (fhm) null, (Integer) 2131960074, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(gx0.X0, gx0.Y0), new d4((byte) 15, this.a, hti0Var.a)), 244);
    }
}
