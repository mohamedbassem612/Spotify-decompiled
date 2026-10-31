package p;

import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mcx extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ erl1 a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vy71 d;
    public final /* synthetic */ Window e;
    public final /* synthetic */ q811 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ erl1 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcx(u85 u85Var, vu30 vu30Var, boolean z, vy71 vy71Var, Window window, q811 q811Var, boolean z2, u85 u85Var2, long j, boolean z3, boolean z4, j2i j2iVar, boolean z5) {
        super(2);
        this.a = u85Var;
        this.b = vu30Var;
        this.c = z;
        this.d = vy71Var;
        this.e = window;
        this.f = q811Var;
        this.g = z2;
        this.h = u85Var2;
        this.i = j;
        this.t = z3;
        this.X = z4;
        this.Y = j2iVar;
        this.Z = z5;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    public final Object invoke(Object obj, Object obj2) {
        q5t0 q5t0VarH;
        Integer numValueOf;
        Integer num;
        tlc1 tlc1Var = (tlc1) obj;
        long j = ((hjl) obj2).a;
        q811 q811VarValueOf = null;
        erl1 erl1Var = (this.g && this.h.d(tlc1Var) == 0) ? this.a : null;
        if (erl1Var != null) {
            int iD = erl1Var.d(tlc1Var);
            Integer numValueOf2 = Integer.valueOf(iD);
            if (iD <= tlc1Var.X0(24.0f)) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                int iIntValue = numValueOf2.intValue();
                q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(mc91.c, new j2i(-63449176, new pu2(new j2i(104407585, new sre((byte) 18, this.i), true), (byte) 25), true)))).H(hjl.b(j, 0, 0, iIntValue, iIntValue, 3));
            } else {
                q5t0VarH = null;
            }
        } else {
            q5t0VarH = null;
        }
        vu30 vu30Var = this.b;
        q5t0 q5t0VarH2 = vu30Var != null ? ((afh0) o7h.q0(tlc1Var.P(mc91.b, new j2i(-63449176, new pu2(new j2i(1111183057, new n7f((byte) 1, vu30Var, this.t), true), (byte) 25), true)))).H(j) : null;
        q5t0 q5t0VarH3 = ((afh0) o7h.q0(tlc1Var.P(mc91.a, new j2i(-63449176, new pu2(new j2i(-658294926, new hy(this.t, this.X, q5t0VarH2, tlc1Var, this.Y, (byte) 8), true), (byte) 25), true)))).H(j);
        int iH = this.c ? hjl.h(j) : q5t0VarH3.b;
        try {
            numValueOf = Integer.valueOf((int) this.d.e.V());
        } catch (IllegalStateException unused) {
            numValueOf = null;
        }
        Window window = this.e;
        q811 q811Var = this.f;
        if (window != null && numValueOf != null) {
            int iH2 = hjl.h(j) - numValueOf.intValue();
            q811VarValueOf = this.Z ? q811Var : null;
            q811VarValueOf = Integer.valueOf(iH2 - ((q811VarValueOf == null || (num = (Integer) q811VarValueOf.a) == null) ? 0 : num.intValue() - iH));
        }
        q811Var.a = Integer.valueOf(iH);
        return tlc1Var.S(hjl.i(j), iH, b7x.a, new ggh(q5t0VarH3, q811VarValueOf, q5t0VarH2, q5t0VarH, (byte) 29));
    }
}
