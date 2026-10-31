package p;

import com.spotify.browse.clientnative.mobius.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8c extends a8d1 implements vu30 {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8c(b bVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = bVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new e8c(this.a, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((at71) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        b bVar = this.a;
        return hu20.d(new mr20[]{bVar.d, bVar.e});
    }
}
