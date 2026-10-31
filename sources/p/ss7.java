package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ss7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oud b;
    public final /* synthetic */ q8n c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss7(oud oudVar, q8n q8nVar, Context context, byte b) {
        super(1);
        this.a = b;
        this.b = oudVar;
        this.c = q8nVar;
        this.d = context;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q8n q8nVar = this.c;
        oud oudVar = this.b;
        Context context = this.d;
        switch (b) {
            case 0:
                cas casVar = (a7m0) obj;
                casVar.d = vc7.h;
                casVar.e = vc7.i;
                casVar.c = new lud(oudVar, q8nVar, new s4(2, (lnm) null, (byte) 20));
                casVar.a(new rs7(1, (byte) 0), new rs7(1, (byte) 1));
                casVar.a = new yd2(context, (byte) 1);
                break;
            case 1:
                cas casVar2 = (a7m0) obj;
                casVar2.d = orc1.R0;
                casVar2.e = orc1.S0;
                casVar2.c = new lud(oudVar, q8nVar, new q1c1(2, null, (byte) 6));
                casVar2.a(new qd81(1, (byte) 26), new qd81(1, (byte) 27));
                casVar2.a = new yd2(context, (byte) 7);
                break;
            default:
                cas casVar3 = (a7m0) obj;
                casVar3.a = new yd2(context, (byte) 8);
                casVar3.d = kvj1.e;
                casVar3.e = kvj1.f;
                casVar3.a(new yvf1(1, (byte) 12), new yvf1(1, (byte) 13));
                casVar3.c = new lud(oudVar, q8nVar, new q1c1(2, null, (byte) 28));
                break;
        }
        return rih1Var;
    }
}
