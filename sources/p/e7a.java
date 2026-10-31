package p;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7a extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7a(g7a g7aVar, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = g7aVar;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        g7a g7aVar = this.b;
        switch (b) {
            case 0:
                return new e7a(g7aVar, lnmVar, (byte) 0);
            default:
                return new e7a(g7aVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g7a g7aVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                bpb1 bpb1Var = g7aVar.k;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                break;
            default:
                hm5.M(obj);
                Iterator it = g7aVar.j.iterator();
                while (it.hasNext()) {
                    ((faa0) it.next()).d((CancellationException) null);
                }
                break;
        }
        return rih1Var;
    }
}
