package p;

import com.spotify.userhighlight.v1.CreateUserHighlightRequest;
import com.spotify.userhighlight.v1.CreateUserHighlightResponse;
import com.spotify.userhighlight.v1.EntityReference;
import com.spotify.userhighlight.v1.UserHighlightChange;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oai1 {
    public final uai1 a;

    public oai1(uai1 uai1Var) {
        this.a = uai1Var;
    }

    public static CreateUserHighlightRequest b(trn trnVar) {
        mai1 mai1VarQ = UserHighlightChange.q();
        cpy cpyVarN = EntityReference.n();
        cpyVarN.n(trnVar.a);
        mai1VarQ.q(cpyVarN.build());
        mai1VarQ.r(obg1.v(trnVar.b));
        mai1VarQ.n(obg1.v(trnVar.c));
        srn srnVarN = CreateUserHighlightRequest.n();
        srnVarN.n(mai1VarQ.build());
        return srnVarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(trn trnVar, onm onmVar) {
        nai1 nai1Var;
        if (onmVar instanceof nai1) {
            nai1Var = (nai1) onmVar;
            int i = nai1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nai1Var.c = i - Integer.MIN_VALUE;
            } else {
                nai1Var = new nai1(this, onmVar);
            }
        } else {
            nai1Var = new nai1(this, onmVar);
        }
        Object objB = nai1Var.a;
        int i2 = nai1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                CreateUserHighlightRequest createUserHighlightRequestB = b(trnVar);
                uai1 uai1Var = this.a;
                nai1Var.c = 1;
                objB = uai1Var.b(createUserHighlightRequestB, nai1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            return new urn(((CreateUserHighlightResponse) objB).getUri());
        } catch (Throwable th) {
            return new m231(th);
        }
    }
}
