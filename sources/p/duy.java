package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class duy {
    public final Flowable a;
    public final a1r0 b;
    public final uvy c;
    public final q8n d;
    public final wu4 e;

    public duy(Flowable flowable, a1r0 a1r0Var, uvy uvyVar, q8n q8nVar, wu4 wu4Var) {
        this.a = flowable;
        this.b = a1r0Var;
        this.c = uvyVar;
        this.d = q8nVar;
        this.e = wu4Var;
    }

    public static kuy a(duy duyVar, int i) {
        return new kuy(duyVar.a, duyVar.b, duyVar.c, (i & 1) == 0, true, duyVar.d, duyVar.e);
    }
}
