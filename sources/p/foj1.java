package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class foj1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ioj1 b;

    public /* synthetic */ foj1(ioj1 ioj1Var, byte b) {
        this.a = b;
        this.b = ioj1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ioj1 ioj1Var = this.b;
        switch (b) {
            case 0:
                ioj1Var.u.a(new tnj1(((Integer) obj).intValue()));
                break;
            case 1:
                ioj1Var.u.a(snj1.c);
                break;
            case 2:
                ioj1Var.u.reset();
                break;
            default:
                Integer num = (Integer) obj;
                ioj1Var.e.setTranslationY(num.intValue());
                ioj1Var.g.setTranslationY(num.intValue());
                break;
        }
    }
}
