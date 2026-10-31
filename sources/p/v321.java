package p;

import com.spotify.messages.RemoteSessionStartEvent;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class v321 implements Consumer {
    public final /* synthetic */ k811 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ v321(k811 k811Var, String str, String str2) {
        this.a = k811Var;
        this.b = str;
        this.c = str2;
    }

    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            w321 w321VarN = RemoteSessionStartEvent.n();
            w321VarN.n(this.b);
            w321VarN.q(this.c);
            ((t2j0) this.a.b).a((RemoteSessionStartEvent) w321VarN.build());
        }
    }
}
