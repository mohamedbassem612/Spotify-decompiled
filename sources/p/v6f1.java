package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6f1 extends hab0 implements vu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ j2i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6f1(c380 c380Var, vu30 vu30Var, float f, float f2, float f3, float f4, float f5, float f6, j2i j2iVar) {
        super(2);
        this.a = c380Var;
        this.b = vu30Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        tlc1 tlc1Var = (tlc1) obj;
        long j = ((hjl) obj2).a;
        long jB = hjl.b(j, 0, 0, 0, 0, 10);
        c380 c380Var = this.a;
        lr80 it = p7h.K(c380Var).iterator();
        sr80 sr80Var = (sr80) it;
        if (!sr80Var.c) {
            hhg1.k();
            return null;
        }
        lr80 lr80Var = it;
        int iNextInt = lr80Var.nextInt();
        String strC = f4i1.c(iNextInt, "measure-");
        float f = this.h;
        int i = ((afh0) o7h.q0(tlc1Var.P(strC, new j2i(1144331402, new tk6(c380Var, iNextInt, f), true)))).H(jB).b;
        while (sr80Var.c) {
            int iNextInt2 = lr80Var.nextInt();
            c380 c380Var2 = c380Var;
            int i2 = ((afh0) o7h.q0(tlc1Var.P(f4i1.c(iNextInt2, "measure-"), new j2i(1144331402, new tk6(c380Var, iNextInt2, f), true)))).H(jB).b;
            if (i < i2) {
                i = i2;
            }
            c380Var = c380Var2;
        }
        vu30 vu30Var = this.b;
        Integer numValueOf = vu30Var != null ? Integer.valueOf(((afh0) o7h.q0(tlc1Var.P("measure-hint", new j2i(1174091362, new say0(vu30Var, (byte) 4), true)))).H(jB).b) : null;
        int iH = hjl.h(j);
        int iI0 = tlc1Var.i0(this.c);
        List list = k6f1.a;
        int iI1 = tlc1Var.i0(48.0f);
        float f2 = this.d + 1.0f;
        int iI2 = tlc1Var.i0(16.0f);
        int iI3 = tlc1Var.i0(this.e);
        int i3 = i;
        tzd tzdVarE = sbl.E(iI2, tlc1Var.i0(this.f), iI3, numValueOf, Math.max(iI0, iI1), f2, iI1, tlc1Var.i0(this.g), tlc1Var.i0(16.0f), i3, iH, tlc1Var.i0(8.0f), numValueOf != null);
        return tlc1Var.S(hjl.i(j), hjl.h(j), b7x.a, new oyc1(((afh0) o7h.q0(tlc1Var.P("content", new j2i(-1790352364, new u6f1(this.i, tlc1Var.N0(tzdVarE.a), tlc1Var.M0(i3), tlc1Var.N0(tzdVarE.b), tlc1Var.N0(tzdVarE.c), numValueOf != null ? tlc1Var.M0(numValueOf.intValue()) : 0.0f, tzdVarE, tlc1Var.N0(tzdVarE.e), tlc1Var.N0(tzdVarE.f)), true)))).H(j), (byte) 2));
    }
}
