package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ild implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xca c;

    public /* synthetic */ ild(xca xcaVar, int i, byte b) {
        this.a = b;
        this.c = xcaVar;
        this.b = i;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        xca xcaVar = this.c;
        switch (b) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf("premium".equals((String) obj));
                dq5 dq5Var = new dq5();
                dq5Var.b = boolValueOf;
                ((kld) xcaVar).a(i, dq5Var);
                break;
            default:
                olm olmVar = (olm) xcaVar;
                dr8 dr8Var = (fr8) obj;
                if (dr8Var instanceof dr8) {
                    olmVar.f(dr8Var.a, i);
                } else if (dr8Var instanceof er8) {
                    olmVar.f(nhz.Y, i);
                } else if (dr8Var instanceof cr8) {
                    olmVar.f(nhz.t, i);
                } else if (dr8Var instanceof ar8) {
                    olmVar.a(i, new du5(null, ((ar8) dr8Var).a, 0));
                    olmVar.a.remove(Integer.valueOf(i));
                }
                break;
        }
    }
}
