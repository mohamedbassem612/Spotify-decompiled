package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class udb1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vdb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udb1(vdb1 vdb1Var, byte b) {
        super(0);
        this.a = b;
        this.b = vdb1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        vdb1 vdb1Var = this.b;
        switch (b) {
            case 0:
                jnq jnqVar = (jnq) vdb1Var.b.a.b;
                luk lukVar = (luk) ((izp) jnqVar.c).b.L1.get();
                c8o.l(lukVar);
                uq8 uq8Var = new uq8(new jq4(lukVar), (byte) 2);
                d0r d0rVar = ((gl90) jnqVar.b).b;
                String strD = ((qop) jnqVar.d).d();
                daq daqVar = ((izp) jnqVar.c).b;
                kmj1 kmj1VarJ2 = daqVar.j2();
                vbs vbsVar = (vbs) daqVar.wf.get();
                c8o.l(vbsVar);
                return new xzq(new ve51(uq8Var, d0rVar, strD, kmj1VarJ2, vbsVar), rdb1.c);
            default:
                return new xv81(vdb1Var);
        }
    }
}
