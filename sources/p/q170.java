package p;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q170 implements Function0 {
    public final /* synthetic */ z170 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ q170(z170 z170Var, int i, long j) {
        this.a = z170Var;
        this.b = i;
        this.c = j;
    }

    public final Object invoke() {
        z170 z170Var = this.a;
        try {
            z170Var.X0.i(this.b, this.c);
        } catch (IOException e) {
            z170Var.a(2, 2, e);
        }
        return rih1.a;
    }
}
