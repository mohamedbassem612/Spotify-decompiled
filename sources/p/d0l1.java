package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d0l1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ilh1 b;
    public final /* synthetic */ int c;

    public d0l1(ilh1 ilh1Var, String str, int i) {
        this.a = (byte) 2;
        this.b = ilh1Var;
        this.c = i;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.c;
        ilh1 ilh1Var = this.b;
        switch (b) {
            case 0:
                ((my30) ilh1Var.c).a(new l2l1((String) null, 1, tx9.o(i, Long.valueOf(((wze1) obj).c)), "authenticationSucceeded"));
                break;
            case 1:
                ilh1Var.i(i, (Throwable) obj);
                break;
            default:
                ((my30) ilh1Var.c).a(new l2l1((String) null, 1, tx9.o(i, (Long) null), "authenticationStarted"));
                break;
        }
    }

    public /* synthetic */ d0l1(ilh1 ilh1Var, int i, byte b) {
        this.a = b;
        this.b = ilh1Var;
        this.c = i;
    }
}
