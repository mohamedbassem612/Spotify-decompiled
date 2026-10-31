package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class onn0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gon0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onn0(gon0 gon0Var, byte b) {
        super(1);
        this.a = b;
        this.b = gon0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gon0 gon0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return Boolean.valueOf(!gon0Var.m.containsKey(Integer.valueOf(((vnn0) obj).h)));
    }
}
