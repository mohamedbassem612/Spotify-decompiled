package p;

import com.spotify.mobius.First;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c7m0 extends a8d1 implements vu30 {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ First b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ llm d;
    public final /* synthetic */ ipb1 e;
    public final /* synthetic */ p811 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7m0(p811 p811Var, First first, ArrayList arrayList, llm llmVar, ipb1 ipb1Var, p811 p811Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = p811Var;
        this.b = first;
        this.c = arrayList;
        this.d = llmVar;
        this.e = ipb1Var;
        this.f = p811Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new c7m0(this.a, this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        c7m0 c7m0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        c7m0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        e7m0.e(this.a, this.b, this.c, this.d, this.e, this.f);
        return rih1.a;
    }
}
