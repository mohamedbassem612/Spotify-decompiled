package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cff0 implements yta0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ k6a1 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ xtb0 e;
    public final /* synthetic */ List f;

    public cff0(int i, List list, k6a1 k6a1Var, c9n c9nVar, xtb0 xtb0Var, List list2) {
        this.a = i;
        this.b = list;
        this.c = k6a1Var;
        this.d = c9nVar;
        this.e = xtb0Var;
        this.f = list2;
    }

    public final void a() {
        int iL = p7h.L(this.b);
        int i = this.a;
        if (i != iL) {
            fn31.T(this.d, (o8n) null, 0, new zi3(this.e, i, this.f, (lnm) null, (byte) 10), 3);
        } else {
            b6t b6tVar = this.c;
            if (b6tVar != null) {
                b6tVar.a();
            }
        }
    }
}
