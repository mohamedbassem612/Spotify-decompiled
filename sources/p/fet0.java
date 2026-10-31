package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fet0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ get0 b;
    public final /* synthetic */ ou80 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ fet0(get0 get0Var, ou80 ou80Var, boolean z, byte b) {
        this.a = b;
        this.b = get0Var;
        this.c = ou80Var;
        this.d = z;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.d;
        ou80 ou80Var = this.c;
        get0 get0Var = this.b;
        switch (b) {
            case 0:
                if (((d1z) obj) == d1z.a) {
                    get0Var.b(ou80Var, z);
                }
                break;
            case 1:
                get0Var.b(ou80Var, z);
                break;
            default:
                get0Var.b(ou80Var, z);
                break;
        }
    }
}
