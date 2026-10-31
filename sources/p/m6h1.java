package p;

import com.spotify.messages.UbiProd1Impression;
import com.spotify.messages.a;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventRequest;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m6h1 implements Consumer {
    public final /* synthetic */ n6h1 a;
    public final /* synthetic */ long b;

    public m6h1(n6h1 n6h1Var, long j) {
        this.a = n6h1Var;
        this.b = j;
    }

    public final void accept(Object obj) {
        b9h1 b9h1Var = (b9h1) obj;
        UbiProd1Impression ubiProd1Impression = b9h1Var.b;
        a builder = ubiProd1Impression.toBuilder();
        builder.K(this.b - ubiProd1Impression.A());
        UbiProd1Impression ubiProd1ImpressionBuild = builder.build();
        n6h1 n6h1Var = this.a;
        p6h1 p6h1Var = n6h1Var.d;
        a9h1 a9h1Var = b9h1Var.c;
        lf21 lf21VarN = ReplacePendingEventRequest.n();
        lf21VarN.q("UbiProd1Impression");
        lf21VarN.n(ubiProd1ImpressionBuild.toByteString());
        lf21VarN.r(a9h1Var.a);
        lf21VarN.s(a9h1Var.b);
        n6h1Var.i.b(p6h1Var.a.a(lf21VarN.build()).flatMap(new vnd1(b9h1Var, ubiProd1ImpressionBuild, (byte) 22)).flatMapCompletable(new owf1(p6h1Var, (byte) 3)).s(n6h1Var.g).n(n6h1Var.h).subscribe(new qs4(n6h1Var, b9h1Var), new jkt0(n6h1Var, (byte) 12)));
    }
}
