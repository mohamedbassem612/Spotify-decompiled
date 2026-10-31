package p;

import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s4g1 implements Function {
    public final /* synthetic */ q4g1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ v4g1 c;
    public final /* synthetic */ p811 d;

    public s4g1(q4g1 q4g1Var, boolean z, v4g1 v4g1Var, p811 p811Var) {
        this.a = q4g1Var;
        this.b = z;
        this.c = v4g1Var;
        this.d = p811Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        q4g1 q4g1Var = this.a;
        UUID uuid = q4g1Var.a;
        mxc mxcVar = new mxc();
        mxcVar.j = true;
        long j = q4g1Var.b;
        v4g1 v4g1Var = this.c;
        v4g1Var.getClass();
        mxcVar.a(j, gtv0.k(), q4g1Var.c);
        boolean z = this.b;
        gxc gxcVar = new gxc(uuid, mxcVar, z);
        this.d.a = gxcVar;
        if (!z) {
            v4g1Var.g.a(q4g1Var);
        }
        return gxcVar;
    }
}
