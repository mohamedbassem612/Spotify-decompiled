package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ofz extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pfz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofz(pfz pfzVar, byte b) {
        super(0);
        this.a = b;
        this.b = pfzVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pfz pfzVar = this.b;
        switch (b) {
            case 0:
                pfzVar.d.g();
                qfz qfzVar = pfzVar.c;
                if (qfzVar.b) {
                    pfzVar.e.a(qfzVar.a);
                }
                break;
            default:
                if (pfzVar.c.b) {
                    ((tau0) pfzVar.g.b).a().a(new g9u0("ereader", false)).subscribe(mux0.T0, mux0.U0);
                } else {
                    sfz sfzVar = pfzVar.f;
                    sfzVar.c.a.e();
                    fn31.T(sfzVar.e, (o8n) null, 0, new ett(sfzVar, (lnm) null, (byte) 22), 3);
                }
                pfzVar.d.g();
                break;
        }
        return rih1Var;
    }
}
