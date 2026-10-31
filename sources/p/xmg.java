package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xmg extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bng b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmg(bng bngVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, byte b) {
        super(1);
        this.a = b;
        this.b = bngVar;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (!((Boolean) obj).booleanValue() && ((Boolean) this.c.getValue()).booleanValue() && !((Boolean) this.d.getValue()).booleanValue()) {
                    this.b.d.a(ixb.b);
                }
                ((Function0) this.e.getValue()).invoke();
                return rih1.a;
            default:
                bng bngVar = this.b;
                return new ymg(bngVar.d.b(new xmg(bngVar, this.c, this.d, this.e, (byte) 0)), (byte) 0);
        }
    }
}
