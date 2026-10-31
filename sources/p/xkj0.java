package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class xkj0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w6e0 b;

    public /* synthetic */ xkj0(w6e0 w6e0Var, byte b) {
        this.a = b;
        this.b = w6e0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        w6e0 w6e0Var = this.b;
        switch (b) {
            case 0:
                ioj0 ioj0VarA = ((ioj0) w6e0Var.b).a(((ioj0) obj).a, false);
                w6e0Var.b = ioj0VarA;
                ((bpb1) w6e0Var.e).m((Object) null, ioj0VarA);
                break;
            default:
                ioj0 ioj0VarA2 = ((ioj0) w6e0Var.b).a(((ioj0) obj).a, false);
                w6e0Var.b = ioj0VarA2;
                ((bpb1) w6e0Var.e).m((Object) null, ioj0VarA2);
                break;
        }
    }
}
