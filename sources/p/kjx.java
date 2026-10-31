package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kjx extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjx(float f, ven0 ven0Var) {
        super(1);
        this.a = f;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        long j = ((yr80) obj).a;
        this.b.setValue(Boolean.valueOf(((float) Math.min((int) (j >> 32), (int) (j & 4294967295L))) <= this.a));
        return rih1.a;
    }
}
