package p;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class s170 implements Function0 {
    public final /* synthetic */ z170 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nac c;
    public final /* synthetic */ int d;

    public /* synthetic */ s170(z170 z170Var, int i, nac nacVar, int i2, boolean z) {
        this.a = z170Var;
        this.b = i;
        this.c = nacVar;
        this.d = i2;
    }

    public final Object invoke() {
        z170 z170Var = this.a;
        int i = this.b;
        nac nacVar = this.c;
        int i2 = this.d;
        try {
            z170Var.X.getClass();
            nacVar.skip(i2);
            z170Var.X0.h(i, 9);
            synchronized (z170Var) {
                z170Var.Z0.remove(Integer.valueOf(i));
            }
        } catch (IOException unused) {
        }
        return rih1.a;
    }
}
