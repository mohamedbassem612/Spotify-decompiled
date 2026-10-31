package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a1c extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ pob0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ lbh f;
    public final /* synthetic */ ar41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1c(boolean z, c9n c9nVar, ven0 ven0Var, pob0 pob0Var, int i, lbh lbhVar, ar41 ar41Var) {
        super(0);
        this.a = z;
        this.b = c9nVar;
        this.c = ven0Var;
        this.d = pob0Var;
        this.e = i;
        this.f = lbhVar;
        this.g = ar41Var;
    }

    public final Object invoke() {
        this.c.setValue(Boolean.TRUE);
        lbh lbhVar = this.f;
        boolean z = this.a;
        c9n c9nVar = this.b;
        pob0 pob0Var = this.d;
        int i = this.e;
        if (z) {
            fn31.T(c9nVar, (o8n) null, 0, new fe6(pob0Var, i, lbhVar, this.g, (lnm) null, (byte) 2), 3);
        } else {
            fn31.T(c9nVar, (o8n) null, 0, new z0c(pob0Var, i, lbhVar, null), 3);
        }
        return rih1.a;
    }
}
