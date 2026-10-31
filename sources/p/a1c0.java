package p;

import com.spotify.show_esperanto.proto.MarkShowAsPlayedRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a1c0 implements wsg0 {
    public final ga81 a;

    public a1c0(ga81 ga81Var) {
        this.a = ga81Var;
    }

    public final Single a(String str, String str2) {
        xsg0 xsg0VarN = MarkShowAsPlayedRequest.n();
        xsg0VarN.n(str2);
        xsg0VarN.q(ysg0.c);
        return this.a.callSingle("spotify.show_esperanto.proto.ShowService", "MarkShowAsPlayed", (MarkShowAsPlayedRequest) xsg0VarN.build()).map(rdx0.X);
    }

    public final Single b(String str, String str2) {
        xsg0 xsg0VarN = MarkShowAsPlayedRequest.n();
        xsg0VarN.n(str2);
        xsg0VarN.q(ysg0.b);
        return this.a.callSingle("spotify.show_esperanto.proto.ShowService", "MarkShowAsPlayed", (MarkShowAsPlayedRequest) xsg0VarN.build()).map(rdx0.X);
    }
}
