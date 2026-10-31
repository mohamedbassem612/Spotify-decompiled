package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nvz0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pvz0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Boolean f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvz0(pvz0 pvz0Var, Context context, List list, Boolean bool, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.c = pvz0Var;
        this.d = context;
        this.e = list;
        this.f = bool;
        this.g = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        nvz0 nvz0Var = new nvz0(this.c, this.d, this.e, this.f, this.g, lnmVar);
        nvz0Var.b = obj;
        return nvz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar;
        pvz0 pvz0Var = this.c;
        boolean z = this.a;
        d9n d9nVar = rih1.a;
        if (!z) {
            hm5.M(obj);
            c9n c9nVar2 = (c9n) this.b;
            try {
                j2p1.v(pvz0.o, "***Debug starting to send sharing packages to the server");
                lvg lvgVarA = pvz0Var.a();
                Context context = this.d;
                List list = this.e;
                Boolean bool = this.f;
                String str = this.g;
                mvz0 mvz0Var = new mvz0(pvz0Var, context);
                this.b = c9nVar2;
                this.a = true;
                lvgVarA.k(context, list, bool, str, mvz0Var);
                d9n d9nVar2 = d9n.a;
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            } catch (Exception unused) {
                c9nVar = c9nVar2;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9nVar = (c9n) this.b;
            try {
                hm5.M(obj);
                return d9nVar;
            } catch (Exception unused2) {
            }
        }
        op71.x(c9nVar.J());
        return d9nVar;
    }
}
