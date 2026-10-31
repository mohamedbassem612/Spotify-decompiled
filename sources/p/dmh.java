package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dmh extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gmh c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmh(gmh gmhVar, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = gmhVar;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        gmh gmhVar = this.c;
        switch (b) {
            case 0:
                return new dmh(gmhVar, str, lnmVar, (byte) 0);
            default:
                return new dmh(gmhVar, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.d;
        gmh gmhVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF = d3p1.F(gmhVar.a, gmh.c, str);
                jte jteVar = new jte(2, (lnm) null, (byte) 1);
                this.b = true;
                Object objJ = b5p1.j(ay8VarF, jteVar, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                o3r o3rVar = gmh.c;
                Object objA = gmhVar.b.a(new lvm(str), new lqm(Collections.singletonList(ovm.b), (List) null, (qle1) null, 6), 25, (String) null, this);
                return objA == d9nVar ? d9nVar : objA;
        }
    }
}
