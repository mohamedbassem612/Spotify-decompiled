package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o3f0 extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ p3v c;
    public final /* synthetic */ p3v d;
    public final /* synthetic */ p3v e;
    public final /* synthetic */ o95 f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ dui1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3f0(float f, float f2, p3v p3vVar, p3v p3vVar2, p3v p3vVar3, o95 o95Var, tob1 tob1Var, dui1 dui1Var) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = p3vVar;
        this.d = p3vVar2;
        this.e = p3vVar3;
        this.f = o95Var;
        this.g = tob1Var;
        this.h = dui1Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        Float fValueOf;
        Float fValueOf2;
        eqc eqcVar = (eqc) obj;
        float fH = eqcVar.h() * this.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * this.b;
        float fH2 = eqcVar.h() * 8.0f;
        Float fValueOf3 = null;
        p3v p3vVar = this.c;
        if (p3vVar != null) {
            fValueOf = Float.valueOf(eqcVar.h() * p3vVar.a);
        } else {
            fValueOf = null;
        }
        p3v p3vVar2 = this.d;
        if (p3vVar2 != null) {
            fValueOf2 = Float.valueOf(eqcVar.h() * p3vVar2.a);
        } else {
            fValueOf2 = null;
        }
        p3v p3vVar3 = this.e;
        if (p3vVar3 != null) {
            fValueOf3 = Float.valueOf(eqcVar.h() * p3vVar3.a);
        }
        jm60 jm60VarA = p3f0.a(fIntBitsToFloat, fIntBitsToFloat2, fH, fIntBitsToFloat3, fH2, fValueOf, fValueOf2, fValueOf3);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 5.0f;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * 5.0f;
        mmr0[] mmr0VarArrB = p3f0.b();
        mic0 mic0VarL = v9c.l((mmr0[]) Arrays.copyOf(mmr0VarArrB, mmr0VarArrB.length), 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32), 0);
        lw4 lw4VarL = fdg1.l();
        lw4 lw4VarL2 = fdg1.l();
        lw4VarL2.b(6);
        return eqcVar.b(new n3f0(this.f, this.g, lw4VarL, jm60VarA, lw4VarL2, mic0VarL, fIntBitsToFloat4, fIntBitsToFloat5, this.h));
    }
}
