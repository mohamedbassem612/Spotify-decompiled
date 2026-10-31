package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lxx extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ flb0 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxx(long j, boolean z, flb0 flb0Var, boolean z2) {
        super(1);
        this.a = j;
        this.b = z;
        this.c = flb0Var;
        this.d = z2;
    }

    public final Object invoke(Object obj) {
        z5v z5vVar = (z5v) obj;
        float f = (int) (this.a >> 32);
        boolean z = this.b;
        flb0 flb0Var = flb0.a;
        flb0 flb0Var2 = this.c;
        if (z) {
            float f2 = f * 0.45f;
            if (flb0Var2 != flb0Var) {
                f2 = -f2;
            }
            z5vVar.a(f2, w3v.a);
        }
        z5vVar.a(0.0f, w3v.b);
        if (this.d) {
            float f3 = (-f) * 0.45f;
            if (flb0Var2 != flb0Var) {
                f3 = -f3;
            }
            z5vVar.a(f3, w3v.c);
        }
        return rih1.a;
    }
}
