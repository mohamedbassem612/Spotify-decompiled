package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z78 extends a8d1 implements bv30 {
    public /* synthetic */ x78 a;
    public /* synthetic */ y78 b;
    public /* synthetic */ w78 c;
    public /* synthetic */ tqw d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ e8r0 f;
    public final /* synthetic */ k781 g;
    public final /* synthetic */ i4q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z78(iu30 iu30Var, e8r0 e8r0Var, k781 k781Var, i4q i4qVar, lnm lnmVar) {
        super(5, lnmVar);
        this.e = iu30Var;
        this.f = e8r0Var;
        this.g = k781Var;
        this.h = i4qVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        k781 k781Var = this.g;
        i4q i4qVar = this.h;
        z78 z78Var = new z78(this.e, this.f, k781Var, i4qVar, (lnm) obj5);
        z78Var.a = (x78) obj;
        z78Var.b = (y78) obj2;
        z78Var.c = (w78) obj3;
        z78Var.d = (tqw) obj4;
        rih1 rih1Var = rih1.a;
        z78Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        x78 x78Var = this.a;
        y78 y78Var = this.b;
        w78 w78Var = this.c;
        tqw tqwVar = this.d;
        hm5.M(obj);
        boolean z = w78Var instanceof v78;
        iu30 iu30Var = this.e;
        if (z) {
            iu30Var.invoke(new v051(new z951(x78Var.a, x78Var.g, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, x78Var.f, (String) null, false, 0, false, false, false, 259568), tqwVar != null ? n3o1.y(tqwVar) : null, ((v78) w78Var).a));
        } else if (u890.j(w78Var, t78.a)) {
            iu30Var.invoke(new cz41(Collections.singletonList(x78Var.a), x78Var.a, y78Var.m, tqwVar != null ? n3o1.y(tqwVar) : null));
        } else {
            if (!u890.j(w78Var, u78.a)) {
                eg.o();
                return null;
            }
            lik1 lik1Var = new lik1(this.f.a().e);
            Observable observableA = this.g.a(x78Var.a, lik1Var, new l781((String) null, (String) null, false, false, (c821) null, (ugo0) null, (ok51) null, 0, false, false, (r6h1) null, false, (String) null, (p860) null, 4194303));
            mfm mfmVarA = this.h.a(lik1Var);
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            mfm.b(mfmVarA, observableA, yon1.c1(), (bjm) null, tqwVar != null ? n3o1.y(tqwVar) : null, 20);
        }
        return rih1.a;
    }
}
