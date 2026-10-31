package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class k1o0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t1o0 b;

    public /* synthetic */ k1o0(t1o0 t1o0Var, byte b) {
        this.a = b;
        this.b = t1o0Var;
    }

    public final void accept(Object obj) {
        CompletableFromAction completableFromAction;
        byte b = this.a;
        t1o0 t1o0Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                t1o0Var.getClass();
                int iOrdinal = ((p4o0) obj).ordinal();
                if (iOrdinal != 0) {
                    byte b3 = 2;
                    if (iOrdinal == 1) {
                        completableFromAction = t1o0Var.e.b().flatMapCompletable(new qkn0(t1o0Var, b3));
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            eg.o();
                        }
                        completableFromAction = t1o0Var.e.b().flatMapCompletable(new qkn0(t1o0Var, b3));
                    } else {
                        completableFromAction = new CompletableFromAction(new s1o0(t1o0Var, b2));
                    }
                } else {
                    completableFromAction = new CompletableFromAction(new s1o0(t1o0Var, (byte) 0));
                }
                completableFromAction.getClass();
                t1o0Var.g.b(completableFromAction.subscribe());
                break;
            default:
                Integer num = (Integer) obj;
                x6h1 x6h1VarC = t1o0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("dialog", (String) null, num, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                t1o0Var.a.f(k7h1Var.a(), (Set) null);
                break;
        }
    }
}
