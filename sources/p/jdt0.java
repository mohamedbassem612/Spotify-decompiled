package p;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jdt0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ndt0 c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdt0(long j, CharSequence charSequence, lnm lnmVar, ndt0 ndt0Var) {
        super(2, lnmVar);
        this.c = ndt0Var;
        this.d = charSequence;
        this.e = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        jdt0 jdt0Var = new jdt0(this.e, this.d, lnmVar, this.c);
        jdt0Var.b = obj;
        return jdt0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(qpp0.j(obj), (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            TextClassifier textClassifierJ = qpp0.j(this.b);
            this.a = true;
            Object objB = this.c.b(this.d, this.e, textClassifierJ, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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
