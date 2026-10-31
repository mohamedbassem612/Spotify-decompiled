package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n730 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ o730 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n730(o730 o730Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o730Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        o730 o730Var = this.c;
        switch (b) {
            case 0:
                return new n730(o730Var, str, lnmVar, (byte) 0);
            default:
                return new n730(o730Var, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.d;
        o730 o730Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        mma0[] mma0VarArr = o730.e;
                        Single singleD = ((w730) o730Var.b.f(o730Var, o730.e[0])).d(new ord1(Collections.singletonList(str)));
                        this.b = true;
                        obj = fc11.j(singleD, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    o730Var.c.l(((sy21) obj).a.Q0 ? new j730(str) : new i730(str));
                    return rih1Var;
                } catch (Exception unused) {
                    o730Var.c.l(new i730(str));
                    return rih1Var;
                }
            default:
                bbc bbcVar = o730Var.c;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        mma0[] mma0VarArr2 = o730.e;
                        Single singleA = ((w730) o730Var.b.f(o730Var, o730.e[0])).a(new ord1(Collections.singletonList(str)));
                        this.b = true;
                        obj = fc11.j(singleA, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    bbcVar.l(((sy21) obj).a.Q0 ? new l730(str) : new k730(str));
                    return rih1Var;
                } catch (Exception unused2) {
                    bbcVar.l(new k730(str));
                    return rih1Var;
                }
        }
    }
}
