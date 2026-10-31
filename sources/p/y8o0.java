package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y8o0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z8o0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y8o0(z8o0 z8o0Var, String str, byte b) {
        this.a = b;
        this.b = z8o0Var;
        this.c = str;
    }

    public final void run() {
        byte b = this.a;
        String str = this.c;
        z8o0 z8o0Var = this.b;
        switch (b) {
            case 0:
                z8o0Var.b.onNext(new mmr0(str, sy21.c(Boolean.TRUE)));
                break;
            default:
                z8o0Var.b.onNext(new mmr0(str, sy21.c(Boolean.FALSE)));
                break;
        }
    }
}
