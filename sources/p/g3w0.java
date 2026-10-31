package p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g3w0 extends hab0 implements vu30 {
    public final /* synthetic */ xk00 a;
    public final /* synthetic */ h3w0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3w0(xk00 xk00Var, h3w0 h3w0Var) {
        super(2);
        this.a = xk00Var;
        this.b = h3w0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        xk00 xk00Var = this.a;
        xk00Var.d.k(str, DismissedEntity.Type.MARKED_AS_PLAYED);
        this.b.g.a((String) obj2, new f3w0(xk00Var, str));
        return rih1.a;
    }
}
