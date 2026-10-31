package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nb61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ o95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb61(List list, o95 o95Var, byte b) {
        super(1);
        this.a = b;
        this.b = list;
        this.c = o95Var;
    }

    public final Object invoke(Object obj) {
        byte b = 1;
        switch (this.a) {
            case 0:
                return exd0.r((qim0) obj, new nb61(this.b, this.c, b));
            default:
                eqc eqcVar = (eqc) obj;
                float fH = eqcVar.h() * 1.0f;
                float fH2 = eqcVar.h() * 16.0f;
                float fIntBitsToFloat = (((float) (((double) fH2) * 3.141592653589793d)) * 2.0f) + ((Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) + Float.intBitsToFloat((int) (eqcVar.a.j() >> 32))) * 2.0f);
                tw4 tw4VarA = ww4.a();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fH2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH2)) << 32);
                tw4VarA.e(ila0.e(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), 1);
                return eqcVar.a(new ob61(this.c, fIntBitsToFloat, tw4VarA, new mic0(0, (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY))), this.b, (List) null), fH, new float[]{fIntBitsToFloat / 10.0f, fIntBitsToFloat / 2.0f}, (byte) 0));
        }
    }
}
