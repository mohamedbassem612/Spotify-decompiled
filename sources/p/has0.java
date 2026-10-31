package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class has0 implements Consumer {
    public final /* synthetic */ byte a;
    public final ec7 b;

    public /* synthetic */ has0(ec7 ec7Var, byte b) {
        this.a = b;
        this.b = ec7Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ec7 ec7Var = this.b;
        switch (b) {
            case 0:
                ec7Var.b(((af7) obj).d);
                break;
            default:
                bf7 bf7Var = (bf7) obj;
                ec7Var.a(new hqt0(bf7Var.f, bf7Var.d, bf7Var.e, bf7Var.h));
                break;
        }
    }
}
