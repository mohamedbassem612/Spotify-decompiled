package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i8m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l8m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8m1(l8m1 l8m1Var, byte b) {
        super(1);
        this.a = b;
        this.b = l8m1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        l8m1 l8m1Var = this.b;
        switch (b) {
            case 0:
                return l8m1Var.n.b((xhm1) obj, sjz.d);
            default:
                g4k g4kVar = l8m1Var.a;
                g4kVar.getClass();
                f4k f4kVar = new f4k(g4kVar, (StoryCard) obj, (byte) 1);
                if (!g4kVar.c.get()) {
                    f4kVar.invoke();
                }
                return rih1.a;
        }
    }
}
