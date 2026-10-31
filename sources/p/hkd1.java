package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hkd1 implements vr20 {
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ jkd1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ kkd1 e;
    public final /* synthetic */ iu30 f;

    public hkd1(vu30 vu30Var, Object obj, jkd1 jkd1Var, boolean z, kkd1 kkd1Var, iu30 iu30Var) {
        this.a = vu30Var;
        this.b = obj;
        this.c = jkd1Var;
        this.d = z;
        this.e = kkd1Var;
        this.f = iu30Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        vu30 vu30Var = this.a;
        Object obj2 = this.b;
        j3r j3rVar = (k3r) vu30Var.invoke(obj2, (rla1) obj);
        if (!this.c.c.get()) {
            if (this.d && (j3rVar instanceof j3r)) {
                this.e.b.put(obj2, j3rVar.a);
            }
            this.f.invoke(Collections.singletonList(new mmr0(obj2, j3rVar)));
        }
        return rih1.a;
    }
}
