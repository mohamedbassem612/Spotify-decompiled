package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fdb0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gdb0 b;

    public /* synthetic */ fdb0(gdb0 gdb0Var, byte b) {
        this.a = b;
        this.b = gdb0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        gdb0 gdb0Var = this.b;
        switch (b) {
            case 0:
                mdb0 mdb0Var = (mdb0) obj;
                if (mdb0Var instanceof idb0) {
                    gdb0Var.t = ((idb0) mdb0Var).a;
                }
                gdb0Var.h.m(mdb0Var);
                break;
            default:
                gdb0Var.h.m(jdb0.a);
                break;
        }
    }
}
