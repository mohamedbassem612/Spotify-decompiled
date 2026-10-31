package p;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class t170 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ z170 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ t170(z170 z170Var, int i, List list) {
        this.b = z170Var;
        this.c = i;
        this.d = list;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                z170 z170Var = this.b;
                int i = this.c;
                z170Var.X.getClass();
                try {
                    z170Var.X0.h(i, 9);
                    synchronized (z170Var) {
                        z170Var.Z0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return rih1.a;
            default:
                z170 z170Var2 = this.b;
                int i2 = this.c;
                z170Var2.X.getClass();
                try {
                    z170Var2.X0.h(i2, 9);
                    synchronized (z170Var2) {
                        z170Var2.Z0.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return rih1.a;
        }
    }

    public /* synthetic */ t170(z170 z170Var, int i, List list, boolean z) {
        this.b = z170Var;
        this.c = i;
        this.d = list;
    }
}
