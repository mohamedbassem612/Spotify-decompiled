package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gss implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ foa1 b;
    public final /* synthetic */ iss c;

    public /* synthetic */ gss(foa1 foa1Var, iss issVar, byte b) {
        this.a = b;
        this.b = foa1Var;
        this.c = issVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iss issVar = this.c;
        foa1 foa1Var = this.b;
        switch (b) {
            case 0:
                if (th30.P(2)) {
                    Objects.toString(foa1Var);
                }
                foa1Var.c(issVar);
                break;
            default:
                if (th30.P(2)) {
                    Objects.toString(foa1Var);
                }
                foa1Var.c(issVar);
                break;
        }
    }
}
