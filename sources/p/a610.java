package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a610 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c610 b;
    public final /* synthetic */ r9c c;

    public /* synthetic */ a610(c610 c610Var, r9c r9cVar, byte b) {
        this.a = b;
        this.b = c610Var;
        this.c = r9cVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        r9c r9cVar = this.c;
        c610 c610Var = this.b;
        switch (b) {
            case 0:
                c610Var.g(((z310) obj).a, r9cVar.m);
                break;
            case 1:
                c610Var.d(r9cVar);
                break;
            case 2:
                c610Var.g(((z310) obj).a, r9cVar.m);
                break;
            default:
                c610Var.d(r9cVar);
                break;
        }
    }
}
