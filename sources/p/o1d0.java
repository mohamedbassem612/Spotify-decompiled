package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o1d0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1d0(p1d0 p1d0Var, byte b) {
        super(1);
        this.a = b;
        this.b = p1d0Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p1d0 p1d0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                z2s z2sVar = (z2s) obj;
                cbk1 cbk1VarD = p1d0Var.a.d();
                if (cbk1VarD instanceof cbk1) {
                    for (Map.Entry entry : ((LinkedHashMap) cbk1VarD.a()).entrySet()) {
                        y2o1.q(z2sVar, (Class) entry.getKey(), (laa) entry.getValue(), new m1d0(p1d0Var, (byte) 0), new s2c0(p1d0Var, (byte) 7));
                    }
                    return rih1Var;
                }
                if (!(cbk1VarD instanceof bbk1)) {
                    eg.o();
                    return null;
                }
                for (Map.Entry entry2 : p1d0Var.e.entrySet()) {
                    y2o1.p(z2sVar, (Class) entry2.getKey(), new n1d0((znb0) entry2.getValue(), (byte) 0), l1d0.d, new m1d0(p1d0Var, (byte) 1), l1d0.e, new s2c0(p1d0Var, (byte) 7), 96);
                }
                return rih1Var;
            default:
                bpb1 bpb1Var = p1d0Var.i;
                ((ArrayList) ((y2s) obj).a.b).add(j7p1.q(new wo50(bpb1Var), new o1d0(p1d0Var, b2)));
                return rih1Var;
        }
    }
}
