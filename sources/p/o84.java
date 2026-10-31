package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o84 implements pdy0 {
    public final m84 a;
    public final int b;
    public final tgp0 c;
    public final luk d;
    public final idd1 e = new idd1(new q30(this, (byte) 7));
    public final idd1 f = new idd1(new u74(this, (byte) 6));

    public o84(m84 m84Var, int i, tgp0 tgp0Var, luk lukVar) {
        this.a = m84Var;
        this.b = i;
        this.c = tgp0Var;
        this.d = lukVar;
    }

    public final m84 a() {
        m84 m84VarA;
        o84 o84Var = (o84) this.f.getValue();
        return (o84Var == null || (m84VarA = o84Var.a()) == null) ? this.a : m84VarA;
    }

    public final int b() {
        o84 o84Var = (o84) this.f.getValue();
        return o84Var != null ? o84Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        m84[] m84VarArrValues = m84.values();
        ArrayList arrayList = new ArrayList(m84VarArrValues.length);
        for (m84 m84Var : m84VarArrValues) {
            arrayList.add(m84Var.a);
        }
        return p7h.M(new fpb("enable_cal", "android-cal-rollout-service", str, arrayList), new fpb("minimum_gearhead_version", "android-cal-rollout-service", b(), 144000000, 300000000));
    }
}
