package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cz9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oud b;
    public final /* synthetic */ q8n c;
    public final /* synthetic */ wh71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz9(oud oudVar, wh71 wh71Var, q8n q8nVar) {
        super(1);
        this.a = (byte) 2;
        this.b = oudVar;
        this.d = wh71Var;
        this.c = q8nVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wh71 wh71Var = this.d;
        rih1 rih1Var = rih1.a;
        q8n q8nVar = this.c;
        oud oudVar = this.b;
        switch (b) {
            case 0:
                cas casVar = (a7m0) obj;
                casVar.a = vq9.f;
                casVar.d = cu9.c;
                casVar.e = cu9.d;
                casVar.c = new lud(oudVar, q8nVar, new bz9(wh71Var, null, (byte) 0));
                casVar.a(new rs7(1, (byte) 6), new rs7(1, (byte) 7));
                break;
            case 1:
                cas casVar2 = (a7m0) obj;
                casVar2.a = b5n0.h;
                casVar2.d = fsm0.t;
                casVar2.e = fsm0.X;
                casVar2.c = new lud(oudVar, q8nVar, new bz9(wh71Var, null, (byte) 2));
                casVar2.a(new nrj0(1, (byte) 15), new nrj0(1, (byte) 16));
                break;
            default:
                cas casVar3 = (a7m0) obj;
                casVar3.a = j8y0.i;
                casVar3.d = h0x0.O0;
                casVar3.e = h0x0.P0;
                casVar3.c = new lud(oudVar, q8nVar, new sew0(e6y0.c1, this.d, j8y0.t, (Object) null, (lnm) null, (byte) 25));
                casVar3.a(new ewq0(1, (byte) 24), new ewq0(1, (byte) 25));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz9(oud oudVar, q8n q8nVar, wh71 wh71Var, byte b) {
        super(1);
        this.a = b;
        this.b = oudVar;
        this.c = q8nVar;
        this.d = wh71Var;
    }
}
