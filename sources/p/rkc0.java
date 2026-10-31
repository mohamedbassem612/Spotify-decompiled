package p;

import com.spotify.kidssessions.link.v1.ParentAcceptLinkSessionRequest;
import com.spotify.kidssessions.link.v1.ParentAcceptLinkSessionResponse;
import com.spotify.kidssessions.link.v1.StartLinkSessionRequest;
import com.spotify.kidssessions.link.v1.StartLinkSessionResponse;
import com.spotify.kidssessions.link.v1.a;
import com.spotify.kidssessions.link.v1.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rkc0 implements okc0 {
    public final x2g1 a;
    public final tkc0 b;

    public rkc0(x2g1 x2g1Var, tkc0 tkc0Var) {
        this.a = x2g1Var;
        this.b = tkc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        pkc0 pkc0Var;
        if (onmVar instanceof pkc0) {
            pkc0Var = (pkc0) onmVar;
            int i = pkc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkc0Var.c = i - Integer.MIN_VALUE;
            } else {
                pkc0Var = new pkc0(this, onmVar);
            }
        } else {
            pkc0Var = new pkc0(this, onmVar);
        }
        Object objA = pkc0Var.a;
        int i2 = pkc0Var.c;
        int i3 = 1;
        if (i2 == 0) {
            hm5.M(objA);
            yrr0 yrr0VarN = ParentAcceptLinkSessionRequest.n();
            yrr0VarN.q(str);
            yrr0VarN.n(str2);
            ParentAcceptLinkSessionRequest parentAcceptLinkSessionRequestBuild = yrr0VarN.build();
            pkc0Var.c = 1;
            objA = this.b.a(str, parentAcceptLinkSessionRequestBuild, pkc0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ParentAcceptLinkSessionResponse parentAcceptLinkSessionResponse = (ParentAcceptLinkSessionResponse) objA;
        nkc0 nkc0VarG = uyn1.G(parentAcceptLinkSessionResponse.o());
        int iOrdinal = parentAcceptLinkSessionResponse.n().ordinal();
        if (iOrdinal == 0) {
            i3 = 3;
        } else if (iOrdinal != 1) {
            i3 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                i3 = 3;
            }
        }
        return new zrr0(nkc0VarG, i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        qkc0 qkc0Var;
        if (onmVar instanceof qkc0) {
            qkc0Var = (qkc0) onmVar;
            int i = qkc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qkc0Var.c = i - Integer.MIN_VALUE;
            } else {
                qkc0Var = new qkc0(this, onmVar);
            }
        } else {
            qkc0Var = new qkc0(this, onmVar);
        }
        Object objC = qkc0Var.a;
        int i2 = qkc0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            a aVarN = StartLinkSessionRequest.n();
            b bVarN = StartLinkSessionRequest.DependentInitiatedFlow.n();
            bVarN.n(this.a.a.a());
            aVarN.n(bVarN);
            StartLinkSessionRequest startLinkSessionRequestBuild = aVarN.build();
            qkc0Var.c = 1;
            objC = this.b.c(startLinkSessionRequestBuild, qkc0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        return uyn1.G(((StartLinkSessionResponse) objC).n());
    }
}
