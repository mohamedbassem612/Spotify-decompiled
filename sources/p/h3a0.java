package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h3a0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak9 b;

    public /* synthetic */ h3a0(ak9 ak9Var, byte b) {
        this.a = b;
        this.b = ak9Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ak9 ak9Var = this.b;
        switch (b) {
            case 0:
                a3a0 a3a0Var = (a3a0) obj;
                ak9Var.a.accept(new oj9(a3a0Var.a, a3a0Var.b));
                break;
            case 1:
                ak9Var.a(((d3a0) obj).a);
                break;
            case 2:
                ak9Var.b(((f3a0) obj).a);
                break;
            case 3:
                ak9Var.a(((w3a0) obj).a);
                break;
            case 4:
                x3a0 x3a0Var = (x3a0) obj;
                ee9 ee9Var = x3a0Var.b;
                boolean z = ee9Var instanceof ce9;
                String str = x3a0Var.c;
                ak9Var.a.accept(new tj9(x3a0Var.a, ee9Var, z ? str.getBytes(nne.a) : str.getBytes(nne.a)));
                break;
            default:
                ak9Var.b(((y3a0) obj).a);
                break;
        }
    }
}
