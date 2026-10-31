package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wy2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4g b;
    public final /* synthetic */ uy2 c;
    public final /* synthetic */ ContextTrack d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy2(r4g r4gVar, uy2 uy2Var, ContextTrack contextTrack, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r4gVar;
        this.c = uy2Var;
        this.d = contextTrack;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                bin.a(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                bin.a(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
