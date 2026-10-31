package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zy31 {
    public final vu30 a;

    public zy31(vu30 vu30Var) {
        this.a = vu30Var;
    }

    public float a(float f, elb0 elb0Var, elb0 elb0Var2) {
        return Float.intBitsToFloat((int) (elb0Var2.K(elb0Var, (((long) Float.floatToRawIntBits(((int) (elb0Var.b() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)) & 4294967295L));
    }

    public /* synthetic */ zy31(int i, vu30 vu30Var) {
        this(vu30Var);
    }
}
