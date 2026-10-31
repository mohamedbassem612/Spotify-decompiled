package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hkb0 extends hab0 implements iu30 {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ q8n e;
    public final /* synthetic */ long f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ pbr0 h;
    public final /* synthetic */ yqg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkb0(c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, Context context, q8n q8nVar, long j, ven0 ven0Var3, pbr0 pbr0Var, yqg yqgVar) {
        super(1);
        this.a = c9nVar;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = context;
        this.e = q8nVar;
        this.f = j;
        this.g = ven0Var3;
        this.h = pbr0Var;
        this.i = yqgVar;
    }

    public final Object invoke(Object obj) {
        fod fodVar = (fod) obj;
        if (fodVar instanceof eod) {
            fn31.T(this.a, (o8n) null, 0, new gkb0(this.d, fodVar, this.e, this.f, this.g, this.h, this.i, null, (byte) 0), 3);
        } else if (fodVar.equals(cod.a)) {
            this.b.setValue(Boolean.TRUE);
        } else if (fodVar.equals(dod.a)) {
            this.c.setValue(Boolean.TRUE);
        } else if (!fodVar.equals(bod.a)) {
            eg.o();
            return null;
        }
        return rih1.a;
    }
}
