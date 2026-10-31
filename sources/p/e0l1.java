package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e0l1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ilh1 b;

    public e0l1(ilh1 ilh1Var, String str) {
        this.a = (byte) 0;
        this.b = ilh1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ilh1 ilh1Var = this.b;
        switch (b) {
            case 0:
                ((my30) ilh1Var.c).a(new l2l1((String) null, 1, tx9.o(1, (Long) null), "authenticationStarted"));
                break;
            case 1:
                ((my30) ilh1Var.c).a(new l2l1((String) null, 1, tx9.o(1, Long.valueOf(((wze1) obj).c)), "authenticationSucceeded"));
                break;
            default:
                ilh1Var.i(1, (Throwable) obj);
                break;
        }
    }

    public /* synthetic */ e0l1(ilh1 ilh1Var, byte b) {
        this.a = b;
        this.b = ilh1Var;
    }
}
