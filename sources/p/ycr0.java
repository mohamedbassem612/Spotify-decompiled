package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ycr0 implements UnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;
    public final /* synthetic */ y1c1 c;

    public /* synthetic */ ycr0(ks6 ks6Var, y1c1 y1c1Var, byte b) {
        this.a = b;
        this.b = ks6Var;
        this.c = y1c1Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        w2c1 w2c1Var = this.c;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                oyu oyuVar = (oyu) obj;
                if (oyuVar != null) {
                    return oyuVar;
                }
                oyu oyuVarA = ((pyu) ks6Var.h).a(new huz(Collections.singleton((String) ks6Var.b), (byte) 10), ks6Var.d(w2c1Var), new kdn0(new ioj0()));
                ks6Var.b(new t0r0(0, oyuVarA, oyu.class, "start", "start()V", 0, (byte) 9), new t0r0(0, oyuVarA, oyu.class, "stop", "stop()V", 0, (byte) 10));
                return oyuVarA;
            case 1:
                k740 k740Var = (k740) obj;
                if (k740Var != null) {
                    return k740Var;
                }
                String str = (String) ks6Var.b;
                if (new y6b1(str, false).c != v6b1.H1) {
                    hhg1.n("ContextUri must be an show");
                    return null;
                }
                s640 s640Var = new s640(str, (String) null);
                k740 k740VarA = ((peq) ks6Var.f).a(new m9r0(new m9r0(new p90(w2c1Var.U(jc91.class), (byte) 7), s640Var, (byte) 1), s640Var, (byte) 2));
                ks6Var.b(new t0r0(0, k740VarA, k740.class, "start", "start()V", 0, (byte) 11), new t0r0(0, k740VarA, k740.class, "stop", "stop()V", 0, (byte) 12));
                return k740VarA;
            case 2:
                zrt0 zrt0Var = (zrt0) obj;
                if (zrt0Var != null) {
                    return zrt0Var;
                }
                String str2 = (String) ks6Var.b;
                gst0 gst0VarA = ((sbq) ks6Var.t).a(new x010(new huz(Collections.singleton(str2), (byte) 10), new p90(w2c1Var.U(jc91.class), (byte) 7), vcr0.h, (byte) 1));
                ks6Var.b(new t0r0(0, gst0VarA, gst0.class, "start", "start()V", 0, (byte) 13), new t0r0(0, gst0VarA, gst0.class, "stop", "stop()V", 0, (byte) 14));
                return new llb(gst0VarA, str2, (Flowable) ks6Var.Z);
            default:
                btt0 btt0Var = (btt0) obj;
                if (btt0Var != null) {
                    return btt0Var;
                }
                stt0 stt0VarA = ((qeq) ks6Var.i).a(new x010(new huz(Collections.singleton((String) ks6Var.b), (byte) 10), new p90(w2c1Var.U(jc91.class), (byte) 7), vcr0.h, (byte) 1));
                ks6Var.b(new t0r0(0, stt0VarA, stt0.class, "start", "start()V", 0, (byte) 15), new t0r0(0, stt0VarA, stt0.class, "stop", "stop()V", 0, (byte) 16));
                return stt0VarA;
        }
    }
}
