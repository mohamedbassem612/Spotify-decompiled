package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rn41 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ssw0 d;

    public /* synthetic */ rn41(AtomicInteger atomicInteger, int i, ssw0 ssw0Var, byte b) {
        this.a = b;
        this.b = atomicInteger;
        this.c = i;
        this.d = ssw0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        Object objB;
        Object objB2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        ssw0 ssw0Var = this.d;
        int i = this.c;
        AtomicInteger atomicInteger = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return (atomicInteger.get() == i && (objB = ssw0Var.b(obj, lnmVar)) == d9nVar) ? objB : rih1Var;
            default:
                return (atomicInteger.get() == i && (objB2 = ssw0Var.b(obj, lnmVar)) == d9nVar) ? objB2 : rih1Var;
        }
    }
}
