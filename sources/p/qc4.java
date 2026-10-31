package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qc4 implements pdy0 {
    public final pc4 a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new wb4(this, (byte) 9));

    public qc4(pc4 pc4Var, boolean z, luk lukVar) {
        this.a = pc4Var;
        this.b = z;
        this.c = lukVar;
    }

    public final pc4 a() {
        pc4 pc4VarA;
        qc4 qc4Var = (qc4) this.d.getValue();
        return (qc4Var == null || (pc4VarA = qc4Var.a()) == null) ? this.a : pc4VarA;
    }

    public final boolean b() {
        qc4 qc4Var = (qc4) this.d.getValue();
        return qc4Var != null ? qc4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        pc4[] pc4VarArrValues = pc4.values();
        ArrayList arrayList = new ArrayList(pc4VarArrValues.length);
        for (pc4 pc4Var : pc4VarArrValues) {
            arrayList.add(pc4Var.a);
        }
        return p7h.M(new fpb("branch_error_level", "android-deeplink-branchintegrationimpl", str, arrayList), new fpb("is_clearing_intent_lock", "android-deeplink-branchintegrationimpl", b()));
    }
}
