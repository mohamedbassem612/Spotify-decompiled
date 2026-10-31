package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yss0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ats0 b;
    public final /* synthetic */ m210 c;

    public /* synthetic */ yss0(ats0 ats0Var, m210 m210Var, byte b) {
        this.a = b;
        this.b = ats0Var;
        this.c = m210Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        m210 m210Var = this.c;
        ats0 ats0Var = this.b;
        switch (b) {
            case 0:
                return ats0Var.d((l510) obj, m210Var, false, true);
            default:
                return ats0Var.f(m210Var, (l510) obj);
        }
    }
}
