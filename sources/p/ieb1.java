package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ieb1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jeb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ieb1(jeb1 jeb1Var, byte b) {
        super(0);
        this.a = b;
        this.b = jeb1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        jeb1 jeb1Var = this.b;
        switch (b) {
            case 0:
                jnq jnqVar = (jnq) jeb1Var.a.a.b;
                d0r d0rVar = ((gl90) jnqVar.c).b;
                String strD = ((qop) jnqVar.b).d();
                daq daqVar = ((d1q) jnqVar.d).a;
                kmj1 kmj1VarJ2 = daqVar.j2();
                vbs vbsVar = (vbs) daqVar.wf.get();
                c8o.l(vbsVar);
                return new xzq(new fob(d0rVar, strD, kmj1VarJ2, vbsVar), new qd81(jeb1Var, (byte) 14));
            default:
                return new laa1(jeb1Var);
        }
    }
}
