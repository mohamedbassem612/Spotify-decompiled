package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class hfa implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hfa(dah dahVar, jnm0 jnm0Var, mx61 mx61Var, k2h1 k2h1Var, j2i j2iVar, int i) {
        this.d = dahVar;
        this.e = jnm0Var;
        this.f = mx61Var;
        this.g = k2h1Var;
        this.b = j2iVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.g;
        Object obj6 = this.d;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj7 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Integer) obj2).getClass();
                z6p1.b((mfv0) obj6, (j2i) obj7, (w5f1) obj3, (qim0) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i) | 1;
                ((j2i) obj7).h(this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ich0.a((dah) obj6, (jnm0) obj4, (mx61) obj3, (k2h1) obj5, (j2i) obj7, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                bno1.i((mhg1) obj6, (fhg1) obj7, this.e, this.f, (ni20) obj5, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ hfa(j2i j2iVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = j2iVar;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    public /* synthetic */ hfa(mfv0 mfv0Var, j2i j2iVar, w5f1 w5f1Var, qim0 qim0Var, j2i j2iVar2, int i) {
        this.d = mfv0Var;
        this.b = j2iVar;
        this.f = w5f1Var;
        this.g = qim0Var;
        this.e = j2iVar2;
        this.c = i;
    }

    public /* synthetic */ hfa(mhg1 mhg1Var, fhg1 fhg1Var, Object obj, Object obj2, ni20 ni20Var, int i) {
        this.d = mhg1Var;
        this.b = fhg1Var;
        this.e = obj;
        this.f = obj2;
        this.g = ni20Var;
        this.c = i;
    }
}
