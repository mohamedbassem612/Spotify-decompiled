package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h6b extends pim0 implements m7v, sjp0, wat {
    public wat O0;
    public bw61 P0;
    public v9v Q0;
    public boolean R0;
    public hw61 S0;
    public iu30 T0;
    public float U0;
    public float V0;
    public long W0;
    public long X0;
    public Brush Y0;
    public float Z0;
    public int a1;

    public final void H1() {
        this.P0 = null;
        this.Q0 = null;
        ha71.x(this);
    }

    public final void I1(float f) {
        if (this.Z0 == f) {
            return;
        }
        this.Z0 = f;
        H1();
    }

    public final void J1(int i) {
        if (this.a1 == i) {
            return;
        }
        this.a1 = i;
        H1();
    }

    public final void K1(Brush brush) {
        if (u890.j(this.Y0, brush)) {
            return;
        }
        this.Y0 = brush;
        H1();
    }

    public final void L1(long j) {
        if (j == 16) {
            j = u7h.b;
        }
        long j2 = this.X0;
        int i = u7h.l;
        if (z4h1.b(j2, j)) {
            return;
        }
        this.X0 = j;
        H1();
    }

    public final void M1(long j) {
        if (Offset.c(this.W0, j)) {
            return;
        }
        this.W0 = j;
        ha71.x(this);
    }

    public final void N1(float f) {
        if (this.U0 == f) {
            return;
        }
        this.U0 = f;
        H1();
    }

    public final void O1(float f) {
        if (this.V0 == f) {
            return;
        }
        this.V0 = f;
        H1();
    }

    public final float U0() {
        wat watVar = this.O0;
        if (watVar != null) {
            return watVar.U0();
        }
        return 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h6b)) {
            return false;
        }
        h6b h6bVar = (h6b) obj;
        if (this.Z0 != h6bVar.Z0 || !u890.j(this.S0, h6bVar.S0) || this.T0 != h6bVar.T0 || this.U0 != h6bVar.U0 || this.V0 != h6bVar.V0 || !Offset.c(this.W0, h6bVar.W0)) {
            return false;
        }
        long j = this.X0;
        long j2 = h6bVar.X0;
        int i = u7h.l;
        return z4h1.b(j, j2) && u890.j(this.Y0, h6bVar.Y0) && this.a1 == h6bVar.a1;
    }

    public final void f0() {
        this.R0 = false;
        H1();
    }

    public final float h() {
        wat watVar = this.O0;
        if (watVar != null) {
            return watVar.h();
        }
        return 1.0f;
    }

    public final int hashCode() {
        int iF = cy30.f(x0d.f(x0d.f(ktd.g(this.T0, (this.S0.hashCode() + (Float.hashCode(this.Z0) * 31)) * 31, 31), 31, this.U0), 31, this.V0), this.W0, 31);
        long j = this.X0;
        int i = u7h.l;
        int iF2 = cy30.f(iF, j, 31);
        Brush brush = this.Y0;
        return Integer.hashCode(this.a1) + ((iF2 + (brush != null ? brush.hashCode() : 0)) * 31);
    }

    public final void i() {
        if (((pim0) this).N0) {
            wat watVar = oap1.B(this).Z0;
            if (u890.j(this.O0, watVar)) {
                return;
            }
            this.O0 = watVar;
            this.R0 = false;
            H1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    public final void t0(lsl lslVar) {
        bw61 bw61Var;
        v9v v9vVar;
        if (!this.R0) {
            this.R0 = true;
            N1(0.0f);
            O1(0.0f);
            M1(0L);
            L1(u7h.b);
            K1(null);
            I1(1.0f);
            J1(3);
            p9p1.z(this, new hx4(this, (byte) 8));
        }
        bw61 bw61Var2 = this.P0;
        v9v v9vVar2 = this.Q0;
        Brush brush = this.Y0;
        float fH = this.U0 / h();
        float fH2 = this.V0 / h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.W0 >> 32)) / h();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.W0 & 4294967295L)) / h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (v9vVar2 == null || bw61Var2 == null || !p3v.c(bw61Var2.a, fH) || !p3v.c(bw61Var2.b, fH2)) {
            if (brush != null) {
                bw61Var = new bw61(fH, fH2, jFloatToRawIntBits, u7h.b, brush, this.Z0, this.a1);
            } else {
                bw61Var = new bw61(fH, this.X0, fH2, jFloatToRawIntBits, this.Z0, this.a1);
            }
            this.P0 = bw61Var;
            em3 em3VarA = oap1.y(this).a();
            hw61 hw61Var = this.S0;
            em3VarA.getClass();
            v9v v9vVar3 = new v9v(hw61Var, bw61Var, em3VarA);
            this.Q0 = v9vVar3;
            v9vVar = v9vVar3;
        } else {
            long j = bw61Var2.e;
            long j2 = this.X0;
            int i = u7h.l;
            if (z4h1.b(j, j2) && u890.j(bw61Var2.f, brush) && bw61Var2.g == this.Z0 && bw61Var2.d == this.a1 && bw61Var2.c == jFloatToRawIntBits) {
                v9vVar = v9vVar2;
            } else {
                if (brush != null) {
                    bw61Var = new bw61(fH, fH2, jFloatToRawIntBits, u7h.b, brush, this.Z0, this.a1);
                } else {
                    bw61Var = new bw61(fH, this.X0, fH2, jFloatToRawIntBits, this.Z0, this.a1);
                }
                this.P0 = bw61Var;
                em3 em3VarA2 = oap1.y(this).a();
                hw61 hw61Var2 = this.S0;
                em3VarA2.getClass();
                v9v v9vVar4 = new v9v(hw61Var2, bw61Var, em3VarA2);
                this.Q0 = v9vVar4;
                v9vVar = v9vVar4;
            }
        }
        jmr0.g(v9vVar, lslVar, lslVar.j(), 0.0f, (f2b) null, 6);
        lslVar.s1();
    }

    public final void z1() {
        wat watVar = oap1.B(this).Z0;
        if (u890.j(this.O0, watVar)) {
            return;
        }
        this.O0 = watVar;
        this.R0 = false;
        H1();
    }
}
