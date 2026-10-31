package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class edg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ edg1(float f, boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = z;
        this.d = z2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float f = this.b;
        switch (b) {
            case 0:
                eqc eqcVar = (eqc) obj;
                long j = u7h.j;
                u7h u7hVar = new u7h(j);
                long j2 = u7h.b;
                mic0 mic0VarM = v9c.m(0L, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), p7h.M(new u7h[]{u7hVar, new u7h(j2)}));
                List listM = p7h.M(new u7h[]{new u7h(j2), new u7h(j)});
                return eqcVar.b(new ddg1(this.c, mic0VarM, this.d, v9c.m((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L), listM), (byte) 0));
            default:
                eqc eqcVar2 = (eqc) obj;
                long j3 = u7h.j;
                u7h u7hVar2 = new u7h(j3);
                long j4 = u7h.b;
                mic0 mic0VarM2 = v9c.m(0L, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), p7h.M(new u7h[]{u7hVar2, new u7h(j4)}));
                List listM2 = p7h.M(new u7h[]{new u7h(j4), new u7h(j3)});
                return eqcVar2.b(new ddg1(this.c, mic0VarM2, this.d, v9c.m((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) - f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)))) & 4294967295L), listM2), (byte) 1));
        }
    }
}
