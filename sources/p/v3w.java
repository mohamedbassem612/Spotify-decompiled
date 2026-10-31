package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v3w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ los b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3w(los losVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, byte b) {
        super(1);
        this.a = b;
        this.b = losVar;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
        this.g = ven0Var5;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!((Boolean) this.c.getValue()).booleanValue() && !((Boolean) this.d.getValue()).booleanValue()) {
                    if (!zBooleanValue && ((Boolean) this.e.getValue()).booleanValue() && !((Boolean) this.f.getValue()).booleanValue()) {
                        this.b.a(ixb.b);
                    }
                    ((Function0) this.g.getValue()).invoke();
                }
                return rih1.a;
            default:
                los losVar = this.b;
                return new ymg(losVar.b(new v3w(losVar, this.c, this.d, this.e, this.f, this.g, (byte) 0)), (byte) 1);
        }
    }
}
