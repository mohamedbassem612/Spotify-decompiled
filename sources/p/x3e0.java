package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x3e0 extends a8d1 implements vu30 {
    public np60 a;
    public String b;
    public byte c;
    public final /* synthetic */ z3e0 d;
    public final /* synthetic */ s2t e;
    public final /* synthetic */ Effect.LoadMoreHomeStructure f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3e0(z3e0 z3e0Var, s2t s2tVar, Effect.LoadMoreHomeStructure loadMoreHomeStructure, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z3e0Var;
        this.e = s2tVar;
        this.f = loadMoreHomeStructure;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new x3e0(this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        np60 np60Var;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            z3e0 z3e0Var = this.d;
            np60 np60Var2 = z3e0Var.a;
            String str2 = z3e0Var.b.a;
            this.a = np60Var2;
            this.b = str2;
            this.c = (byte) 1;
            Object objQ = this.e.Q(this);
            if (objQ != d9nVar) {
                str = str2;
                np60Var = np60Var2;
                obj = objQ;
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str3 = this.b;
        np60 np60Var3 = this.a;
        hm5.M(obj);
        str = str3;
        np60Var = np60Var3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String pageToken = this.f.getPageToken();
        this.a = null;
        this.b = null;
        this.c = (byte) 2;
        Object objA = np60Var.a(str, zBooleanValue, pageToken, ice0.c, this);
        return objA == d9nVar ? d9nVar : objA;
    }
}
