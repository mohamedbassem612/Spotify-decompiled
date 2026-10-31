package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hjd extends hab0 implements iu30 {
    public final /* synthetic */ kjd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ mmr0[] e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjd(kjd kjdVar, int i, int i2, float f, mmr0[] mmr0VarArr, ven0 ven0Var) {
        super(1);
        this.a = kjdVar;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = mmr0VarArr;
        this.f = ven0Var;
    }

    public final Object invoke(Object obj) {
        jjd jjdVar;
        eqc eqcVar = (eqc) obj;
        ejd ejdVar = (ejd) this.a.a.getValue();
        Float f = (Float) this.f.getValue();
        if (ejdVar == null || f == null) {
            return eqcVar.a(fjd.b);
        }
        float fFloatValue = f.floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L));
        float fH = eqcVar.h() * this.d;
        float f2 = ejdVar.a - fFloatValue;
        float f3 = ejdVar.b;
        float f4 = f2 + f3;
        int iC = l1d.C(this.c);
        int i = this.b;
        if (iC == 0) {
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                f3 = fIntBitsToFloat - f4;
            } else {
                if (iC2 != 1) {
                    eg.o();
                    return null;
                }
                f3 = f2;
            }
        } else if (iC != 1) {
            eg.o();
            return null;
        }
        if (f3 >= fH) {
            fH = f3;
        }
        int iC3 = l1d.C(i);
        if (iC3 == 0) {
            jjdVar = new jjd(fH + f4, f4);
        } else {
            if (iC3 != 1) {
                eg.o();
                return null;
            }
            jjdVar = new jjd(f2 - fH, f2);
        }
        mmr0[] mmr0VarArr = this.e;
        return eqcVar.a(new gjd(v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), jjdVar.a, jjdVar.b, 8), (byte) 0));
    }
}
