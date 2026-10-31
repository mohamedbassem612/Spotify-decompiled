package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class agp0 implements kku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ ujp0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ agp0(l811 l811Var, ujp0 ujp0Var, Object obj, byte b) {
        this.a = b;
        this.b = l811Var;
        this.c = ujp0Var;
        this.d = obj;
    }

    public final void dispose() {
        byte b = this.a;
        ujp0 ujp0Var = this.c;
        l811 l811Var = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (!l811Var.a) {
                    l811Var.a = true;
                    ujp0Var.dispose();
                    bgp0 bgp0Var = (bgp0) obj;
                    int i = bgp0Var.b - 1;
                    bgp0Var.b = i;
                    if (i == 0) {
                        bgp0Var.f();
                    }
                }
                break;
            default:
                toy0 toy0Var = (toy0) obj;
                if (!l811Var.a) {
                    l811Var.a = true;
                    ujp0Var.dispose();
                    int i2 = toy0Var.e - 1;
                    toy0Var.e = i2;
                    if (i2 == 0) {
                        xab1 xab1Var = toy0Var.d;
                        if (xab1Var != null) {
                            xab1Var.d((CancellationException) null);
                        }
                        toy0Var.d = null;
                        toy0Var.c = new ben0();
                    }
                }
                break;
        }
    }
}
