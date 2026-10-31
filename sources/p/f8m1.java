package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f8m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l8m1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8m1(l8m1 l8m1Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = l8m1Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l8m1 l8m1Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                g4k g4kVar = l8m1Var.a;
                g4kVar.getClass();
                f4k f4kVar = new f4k(g4kVar, (StoryCard) obj, (byte) 0);
                if (!g4kVar.c.get()) {
                    f4kVar.invoke();
                }
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                g4k g4kVar2 = l8m1Var.a;
                g4kVar2.getClass();
                f4k f4kVar2 = new f4k(g4kVar2, (StoryCard) obj, (byte) 2);
                if (!g4kVar2.c.get()) {
                    f4kVar2.invoke();
                }
                frl1 frl1Var = l8m1Var.d;
                zxl1 zxl1Var = (zxl1) frl1Var.c;
                if (zxl1Var != null) {
                    ((bcl1) ((qpj1) zxl1Var.b).c).g((t480) zxl1Var.c);
                } else {
                    n57.e("Wrapped: TimeBasedImpression must not be null");
                }
                frl1Var.c = null;
                break;
        }
        return rih1Var;
    }
}
