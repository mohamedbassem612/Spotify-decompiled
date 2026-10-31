package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zh3 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zh3(Function0 function0, qim0 qim0Var, i3u i3uVar, j2i j2iVar, int i) {
        this.e = function0;
        this.b = qim0Var;
        this.f = i3uVar;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                gi3.d((Function0) obj5, (qim0) obj3, (i3u) obj4, this.c, (b0k) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(i | 1);
                z6p1.o((w5f1) obj5, (ven0) obj4, (qim0) obj3, this.c, (b0k) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = czo1.p(i) | 1;
                this.c.i(this.e, this.b, this.f, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ zh3(j2i j2iVar, Object obj, Object obj2, Object obj3, int i) {
        this.c = j2iVar;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.d = i;
    }

    public /* synthetic */ zh3(w5f1 w5f1Var, ven0 ven0Var, qim0 qim0Var, j2i j2iVar, int i) {
        this.e = w5f1Var;
        this.f = ven0Var;
        this.b = qim0Var;
        this.c = j2iVar;
        this.d = i;
    }
}
