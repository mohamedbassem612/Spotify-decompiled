package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t1d0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ short d;
    public final /* synthetic */ RecyclerView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public t1d0(boolean z, long j, RecyclerView recyclerView, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = (int) j;
        this.e = recyclerView;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        t1d0 t1d0Var = new t1d0(this.c, this.d, this.e, lnmVar);
        t1d0Var.b = obj;
        return t1d0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        ssw0 ssw0Var = (ssw0) this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            okk1 okk1Var = new okk1(this.c, this.d, new dy5(ssw0Var, (byte) 1));
            RecyclerView recyclerView = this.e;
            nx30 nx30Var = new nx30(okk1Var, recyclerView, (byte) 28);
            recyclerView.m(okk1Var);
            recyclerView.post(nx30Var);
            dt90 dt90Var = new dt90(recyclerView, nx30Var, okk1Var, (byte) 7);
            this.b = null;
            this.a = true;
            Object objS = jch0.s(ssw0Var, dt90Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
