package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lhr implements Consumer {
    public final /* synthetic */ mhr a;
    public final /* synthetic */ String b;

    public lhr(mhr mhrVar, String str) {
        this.a = mhrVar;
        this.b = str;
    }

    public final void accept(Object obj) {
        String str;
        MessageResponse.Success success = (MessageResponse) obj;
        if (success instanceof MessageResponse.Success) {
            String messageRequestId = success.getMessageRequestId();
            String str2 = this.b;
            mmr0 mmr0Var = new mmr0(str2, messageRequestId);
            mhr mhrVar = this.a;
            mhrVar.n = mmr0Var;
            vku vkuVar = mhrVar.l;
            emc emcVarE = mhrVar.g.e();
            mmr0 mmr0Var2 = mhrVar.n;
            if (mmr0Var2 == null || (str = (String) mmr0Var2.b) == null) {
                str = "";
            }
            vkuVar.a(emcVarE.b(str).subscribe(new jhr(mhrVar)));
            i8h1 i8h1Var = mhrVar.i.a;
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-your-library-audiobook-progress-nudge";
            x6h1VarI.f = "2.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.d = str2;
            y6h1 y6h1VarA = x6h1VarI.a();
            List listSingletonList = Collections.singletonList("any");
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = listSingletonList;
            i8h1Var.f(k7h1Var.a(), (Set) null);
        }
    }
}
