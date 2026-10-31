package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b240 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b240(boolean z, float f, boolean z2, float f2) {
        super(1);
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }

    public final Object invoke(Object obj) {
        kd31 kd31Var = (kd31) obj;
        kd31Var.E(this.a ? 0.0f : this.b);
        if (this.c) {
            float f = this.d;
            kd31Var.q(f);
            kd31Var.r(f);
        }
        return rih1.a;
    }
}
