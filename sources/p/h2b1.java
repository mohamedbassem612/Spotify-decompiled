package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h2b1 extends u61 {
    public final yfu N0;
    public final q8n O0;
    public final iu30 P0;
    public final iu30 Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final c5u0 U0;
    public final jma X;
    public final vu30 Y;
    public final boolean Z;
    public final kma t;

    public h2b1(kma kmaVar, jma jmaVar, vu30 vu30Var, boolean z, yfu yfuVar, q8n q8nVar, iu30 iu30Var, iu30 iu30Var2, boolean z2, boolean z3, boolean z4, c5u0 c5u0Var) {
        this.t = kmaVar;
        this.X = jmaVar;
        this.Y = vu30Var;
        this.Z = z;
        this.N0 = yfuVar;
        this.O0 = q8nVar;
        this.P0 = iu30Var;
        this.Q0 = iu30Var2;
        this.R0 = z2;
        this.S0 = z3;
        this.T0 = z4;
        this.U0 = c5u0Var;
    }

    public final v61 b(pnf1 pnf1Var, int[] iArr, o4a o4aVar, b380 b380Var) {
        jma jmaVar = this.X;
        iu30 iu30Var = this.Q0;
        iu30 iu30Var2 = this.P0;
        c5u0 c5u0Var = this.U0;
        vu30 vu30Var = this.Y;
        q8n q8nVar = this.O0;
        boolean z = this.T0;
        yfu yfuVar = this.N0;
        if (z) {
            return new u6b1(yfuVar != null ? new mkr(q8nVar, yfuVar) : new mkr(q8nVar, this.t, jmaVar), vu30Var, this.Z, this.S0, c5u0Var, pnf1Var, iArr, o4aVar, iu30Var2, iu30Var);
        }
        if (yfuVar != null) {
            return new a4b1(yfuVar, vu30Var, this.Z, pnf1Var, iArr, o4aVar, q8nVar, iu30Var2, iu30Var, this.R0, this.S0, c5u0Var);
        }
        return new g2b1(this.t, jmaVar, vu30Var, this.Z, pnf1Var, iArr, o4aVar, q8nVar, iu30Var2, iu30Var, c5u0Var);
    }
}
