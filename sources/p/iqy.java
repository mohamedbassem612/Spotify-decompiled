package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iqy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sqy b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iqy(sqy sqyVar, d0r d0rVar, String str, byte b) {
        super(0);
        this.a = b;
        this.b = sqyVar;
        this.c = d0rVar;
        this.d = str;
    }

    public final Object invoke() {
        byte b = this.a;
        sqy sqyVar = this.b;
        switch (b) {
            case 0:
                kdn0 kdn0Var = new kdn0();
                fn31.T(zso1.H(sqyVar.d.getLifecycle()), (o8n) null, 0, new l2w(this.c, this.d, kdn0Var, (lnm) null, (byte) 9), 3);
                return kdn0Var;
            default:
                String str = this.d;
                return t5p1.j(new i0h(new vvu(d3p1.F(this.c, sqyVar.s, str), (byte) 10), (byte) 27), 1);
        }
    }
}
