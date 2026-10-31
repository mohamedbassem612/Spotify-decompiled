package p;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class r170 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z170 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ r170(z170 z170Var, int i, int i2, byte b) {
        this.a = b;
        this.b = z170Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        int i2 = this.c;
        z170 z170Var = this.b;
        switch (b) {
            case 0:
                try {
                    z170Var.X0.h(i2, i);
                } catch (IOException e) {
                    z170Var.a(2, 2, e);
                }
                break;
            default:
                try {
                    z170Var.X0.g(i2, i, true);
                } catch (IOException e2) {
                    z170Var.a(2, 2, e2);
                }
                break;
        }
        return rih1Var;
        return rih1Var;
    }
}
