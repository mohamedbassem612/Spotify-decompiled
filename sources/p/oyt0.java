package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oyt0 extends a8d1 implements vu30 {
    public /* synthetic */ long a;

    public final lnm create(Object obj, lnm lnmVar) {
        oyt0 oyt0Var = new oyt0(2, lnmVar);
        oyt0Var.a = ((Number) obj).longValue();
        return oyt0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(Long.valueOf(((Number) obj).longValue()), (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        hm5.M(obj);
        return Boolean.valueOf(j > 0);
    }
}
