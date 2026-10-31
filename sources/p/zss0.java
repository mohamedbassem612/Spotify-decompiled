package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zss0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ats0 b;
    public final /* synthetic */ m210 c;

    public /* synthetic */ zss0(ats0 ats0Var, m210 m210Var, byte b) {
        this.a = b;
        this.b = ats0Var;
        this.c = m210Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        m210 m210Var = this.c;
        ats0 ats0Var = this.b;
        switch (b) {
            case 0:
                ats0Var.i.put(m210Var, (l510) obj);
                break;
            default:
                ats0Var.i.put(m210Var, (l510) ((mmr0) obj).a);
                break;
        }
    }
}
