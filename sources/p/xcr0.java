package p;

import java.util.Collections;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xcr0 implements UnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;

    public /* synthetic */ xcr0(ks6 ks6Var, byte b) {
        this.a = b;
        this.b = ks6Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                kko kkoVar = (kko) obj;
                if (kkoVar != null) {
                    return kkoVar;
                }
                mko mkoVarA = lko.a((lko) ks6Var.e, new huz(Collections.singleton((String) ks6Var.b), (byte) 10), (String) ks6Var.a);
                ks6Var.b(new t0r0(0, mkoVarA, mko.class, "start", "start()V", 0, (byte) 5), new t0r0(0, mkoVarA, mko.class, "stop", "stop()V", 0, (byte) 6));
                return mkoVarA.b();
            default:
                wxu wxuVar = (wxu) obj;
                if (wxuVar != null) {
                    return wxuVar;
                }
                zxu zxuVarA = ((byu) ks6Var.g).a(new huz(Collections.singleton((String) ks6Var.b), (byte) 10));
                ks6Var.b(new t0r0(0, zxuVarA, zxu.class, "start", "start()V", 0, (byte) 7), new t0r0(0, zxuVarA, zxu.class, "stop", "stop()V", 0, (byte) 8));
                return zxuVarA;
        }
    }
}
