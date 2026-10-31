package p;

import android.content.Intent;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a280 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ro30 b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ th61 d;
    public final /* synthetic */ cv30 e;

    public /* synthetic */ a280(ro30 ro30Var, String str, cv30 cv30Var, Intent intent, th61 th61Var, byte b) {
        this.a = b;
        this.b = ro30Var;
        this.e = cv30Var;
        this.c = intent;
        this.d = th61Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        deh dehVar;
        deh dehVar2;
        byte b = this.a;
        th61 th61Var = this.d;
        Intent intent = this.c;
        xu30 xu30Var = this.e;
        ro30 ro30Var = this.b;
        deh dehVar3 = deh.a;
        switch (b) {
            case 0:
                m021 m021VarA = ((vn41) ro30Var.c).a();
                return (m021VarA == null || (dehVar = (deh) m021VarA.i(new xvy((vu30) xu30Var, intent, th61Var, (byte) 18))) == null) ? dehVar3 : dehVar;
            default:
                m021 m021VarA2 = ((vn41) ro30Var.c).a();
                return (m021VarA2 == null || (dehVar2 = (deh) m021VarA2.i(new xvy(xu30Var, intent, th61Var, (byte) 19))) == null) ? dehVar3 : dehVar2;
        }
    }
}
