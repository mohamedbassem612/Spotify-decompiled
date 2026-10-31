package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o881 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jj91 b;

    public /* synthetic */ o881(jj91 jj91Var, byte b) {
        this.a = b;
        this.b = jj91Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        jj91 jj91Var = this.b;
        switch (b) {
            case 0:
                wj91 wj91Var = (wj91) obj;
                rig rigVarA = jj91Var.a(wj91Var.a);
                if (rigVarA != null) {
                    rigVarA.c.onNext(new pl91(wj91Var.b));
                }
                break;
            case 1:
                yj91 yj91Var = (yj91) obj;
                rig rigVarA2 = jj91Var.a(yj91Var.a);
                if (rigVarA2 != null) {
                    rigVarA2.c.onNext(new rl91(yj91Var.b, yj91Var.c));
                }
                break;
            default:
                zj91 zj91Var = (zj91) obj;
                rig rigVarA3 = jj91Var.a(zj91Var.a);
                if (rigVarA3 != null) {
                    rigVarA3.c.onNext(new sl91(zj91Var.b));
                }
                break;
        }
    }
}
