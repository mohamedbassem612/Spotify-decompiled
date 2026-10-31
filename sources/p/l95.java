package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l95 extends a8d1 implements iu30 {
    public ie5 a;
    public l811 b;
    public boolean c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ id5 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ iu30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l95(o95 o95Var, Object obj, id5 id5Var, long j, iu30 iu30Var, lnm lnmVar) {
        super(1, lnmVar);
        this.d = o95Var;
        this.e = obj;
        this.f = id5Var;
        this.g = j;
        this.h = iu30Var;
    }

    public final lnm create(lnm lnmVar) {
        return new l95(this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        o95 o95Var;
        ie5 ie5Var;
        l811 l811Var;
        CancellationException cancellationException;
        id5 id5Var = this.f;
        o95 o95Var2 = this.d;
        ie5 ie5Var2 = o95Var2.c;
        boolean z = this.c;
        int i = 1;
        if (!z) {
            hm5.M(obj);
            try {
                ie5Var2.c = (oe5) o95Var2.a.a.invoke(this.e);
                o95Var2.e.setValue(id5Var.h());
                o95Var2.d.setValue(Boolean.TRUE);
                ie5 ie5VarK = prn1.k(ie5Var2);
                l811 l811Var2 = new l811();
                long j = this.g;
                k95 k95Var = new k95(o95Var2, ie5VarK, this.h, l811Var2, (byte) 0);
                o95Var = o95Var2;
                try {
                    this.a = ie5VarK;
                    this.b = l811Var2;
                    this.c = true;
                    Object objS = wwo1.s(ie5VarK, id5Var, j, k95Var, this);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                    ie5Var = ie5VarK;
                    l811Var = l811Var2;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    o95Var.d();
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                o95Var = o95Var2;
                cancellationException = e;
                o95Var.d();
                throw cancellationException;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l811Var = this.b;
            ie5Var = this.a;
            try {
                hm5.M(obj);
                o95Var = o95Var2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                o95Var = o95Var2;
                o95Var.d();
                throw cancellationException;
            }
        }
        if (!l811Var.a) {
            i = 2;
        }
        o95Var.d();
        return new ce5(i, ie5Var);
    }
}
