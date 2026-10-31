package p;

import com.spotify.mobius.Connectable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class spa extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oud b;
    public final /* synthetic */ wh71 c;
    public final /* synthetic */ l0r d;
    public final /* synthetic */ q8n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spa(oud oudVar, wh71 wh71Var, l0r l0rVar, q8n q8nVar, byte b) {
        super(1);
        this.a = b;
        this.b = oudVar;
        this.c = wh71Var;
        this.d = l0rVar;
        this.e = q8nVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q8n q8nVar = this.e;
        l0r l0rVar = this.d;
        oud oudVar = this.b;
        switch (b) {
            case 0:
                cas casVar = (a7m0) obj;
                casVar.a = vq9.Q0;
                casVar.d = cu9.h;
                casVar.e = cu9.i;
                casVar.c = new ku1(new Connectable[]{new lud(oudVar, q8nVar, new sew0(yda.Y0, this.c, vq9.R0, yda.Z0, (lnm) null, (byte) 25)), l0rVar});
                casVar.a(new rs7(1, (byte) 9), new rs7(1, (byte) 10));
                break;
            case 1:
                cas casVar2 = (a7m0) obj;
                casVar2.a = rng.Y;
                casVar2.d = nyf.O0;
                casVar2.e = nyf.P0;
                casVar2.c = new ku1(new Connectable[]{new lud(oudVar, q8nVar, new sew0(m4h.T0, this.c, rng.Z, m4h.U0, (lnm) null, (byte) 25)), l0rVar});
                casVar2.a(new rs7(1, (byte) 25), new rs7(1, (byte) 26));
                break;
            case 2:
                cas casVar3 = (a7m0) obj;
                casVar3.a = bp30.X;
                casVar3.d = bc30.N0;
                casVar3.e = bc30.O0;
                casVar3.c = new ku1(new Connectable[]{new lud(oudVar, q8nVar, new sew0(gq30.U0, this.c, (Object) null, gq30.V0, (lnm) null, (byte) 25)), l0rVar});
                casVar3.a(new z5z(1, (byte) 15), new z5z(1, (byte) 16));
                break;
            default:
                cas casVar4 = (a7m0) obj;
                casVar4.a = nva1.O0;
                casVar4.d = l4b1.Z;
                casVar4.e = l4b1.N0;
                casVar4.c = new ku1(new Connectable[]{new lud(oudVar, q8nVar, new sew0(cgb1.g, this.c, nva1.P0, cgb1.h, (lnm) null, (byte) 25)), l0rVar});
                casVar4.a(new qd81(1, (byte) 15), new qd81(1, (byte) 16));
                break;
        }
        return rih1Var;
    }
}
