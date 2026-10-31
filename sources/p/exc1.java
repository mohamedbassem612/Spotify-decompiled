package p;

import com.spotify.personalizedepisodes.contentservice.v1.Prompt;
import com.spotify.personalizedepisodes.contentservice.v1.PromptCategory;
import com.spotify.personalizedepisodes.contentservice.v1.SuggestPromptsResponse;
import com.spotify.personalizedepisodes.contentservice.v1.TopSuggestion;
import java.util.ArrayList;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class exc1 {
    public final hxc1 a;

    public exc1(hxc1 hxc1Var) {
        this.a = hxc1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws HttpException {
        cxc1 cxc1Var;
        if (onmVar instanceof cxc1) {
            cxc1Var = (cxc1) onmVar;
            int i = cxc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cxc1Var.c = i - Integer.MIN_VALUE;
            } else {
                cxc1Var = new cxc1(this, onmVar);
            }
        } else {
            cxc1Var = new cxc1(this, onmVar);
        }
        Object objA = cxc1Var.a;
        int i2 = cxc1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            cxc1Var.c = 1;
            objA = this.a.a(cxc1Var);
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
        sy21 sy21Var = (sy21) objA;
        if (!sy21Var.a.Q0) {
            throw new HttpException(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful suggest prompts response");
            return null;
        }
        h290<PromptCategory> h290VarN = ((SuggestPromptsResponse) obj).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (PromptCategory promptCategory : h290VarN) {
            String id = promptCategory.getId();
            String strN = promptCategory.n();
            h290<Prompt> h290VarO = promptCategory.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (Prompt prompt : h290VarO) {
                arrayList2.add(new kpx0(prompt.getId(), prompt.n(), prompt.o()));
            }
            arrayList.add(new rpx0(id, strN, arrayList2));
        }
        return new vsc1(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) throws HttpException {
        dxc1 dxc1Var;
        if (onmVar instanceof dxc1) {
            dxc1Var = (dxc1) onmVar;
            int i = dxc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dxc1Var.c = i - Integer.MIN_VALUE;
            } else {
                dxc1Var = new dxc1(this, onmVar);
            }
        } else {
            dxc1Var = new dxc1(this, onmVar);
        }
        Object objA = dxc1Var.a;
        int i2 = dxc1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            dxc1Var.c = 1;
            objA = this.a.a(dxc1Var);
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
        sy21 sy21Var = (sy21) objA;
        if (!sy21Var.a.Q0) {
            throw new HttpException(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful suggest prompts response");
            return null;
        }
        h290<TopSuggestion> h290VarO = ((SuggestPromptsResponse) obj).o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (TopSuggestion topSuggestion : h290VarO) {
            arrayList.add(new yef1(topSuggestion.getId(), topSuggestion.getTitle(), topSuggestion.n()));
        }
        return new zef1(arrayList);
    }
}
