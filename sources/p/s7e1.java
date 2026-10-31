package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s7e1 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ p9w0 b;
    public /* synthetic */ long c;
    public final /* synthetic */ idn0 d;
    public final /* synthetic */ r7e1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7e1(idn0 idn0Var, r7e1 r7e1Var, lnm lnmVar) {
        super(3, lnmVar);
        this.d = idn0Var;
        this.e = r7e1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).a;
        s7e1 s7e1Var = new s7e1(this.d, this.e, (lnm) obj3);
        s7e1Var.b = (p9w0) obj;
        s7e1Var.c = j;
        return s7e1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            p9w0 p9w0Var = this.b;
            long j = this.c;
            idn0 idn0Var = this.d;
            if (idn0Var != null) {
                mug mugVar = new mug(p9w0Var, this.e, j, idn0Var, (lnm) null, (byte) 6);
                this.a = true;
                Object objS = smo1.s(mugVar, this);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
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
