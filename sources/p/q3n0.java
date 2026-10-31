package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q3n0 implements pdy0 {
    public final p3n0 a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public q3n0(p3n0 p3n0Var, boolean z, luk lukVar) {
        this.a = p3n0Var;
        this.b = z;
        this.c = lukVar;
        this.d = new idd1(new zem0(this, (byte) 12));
    }

    public final p3n0 a() {
        p3n0 p3n0VarA;
        q3n0 q3n0Var = (q3n0) this.d.getValue();
        return (q3n0Var == null || (p3n0VarA = q3n0Var.a()) == null) ? this.a : p3n0VarA;
    }

    public final boolean b() {
        q3n0 q3n0Var = (q3n0) this.d.getValue();
        return q3n0Var != null ? q3n0Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        p3n0[] p3n0VarArrValues = p3n0.values();
        ArrayList arrayList = new ArrayList(p3n0VarArrValues.length);
        for (p3n0 p3n0Var : p3n0VarArrValues) {
            arrayList.add(p3n0Var.a);
        }
        return p7h.M(new fpb("page_loader_scope_policy", "music-libs-pageloader-for-music", str, arrayList), new fpb("reset_load_state", "music-libs-pageloader-for-music", b()));
    }

    public q3n0(luk lukVar) {
        this(p3n0.START_STOP, false, lukVar);
    }
}
