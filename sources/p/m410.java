package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m410 implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ q410 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PreparePlayOptions d;
    public final /* synthetic */ PlayOrigin e;
    public final /* synthetic */ LoggingParams f;
    public final /* synthetic */ Map g;

    public m410(q410 q410Var, PlayOrigin playOrigin, LoggingParams loggingParams, Map map, String str, PreparePlayOptions preparePlayOptions) {
        this.b = q410Var;
        this.e = playOrigin;
        this.f = loggingParams;
        this.g = map;
        this.c = str;
        this.d = preparePlayOptions;
    }

    public final Object apply(Object obj) {
        Single singleJust;
        switch (this.a) {
            case 0:
                u2u0 u2u0Var = (u2u0) obj;
                boolean z = u2u0Var instanceof p2u0;
                LoggingParams loggingParams = this.f;
                PlayOrigin playOrigin = this.e;
                q410 q410Var = this.b;
                if (z) {
                    p2u0 p2u0Var = (p2u0) u2u0Var;
                    String str = p2u0Var.a;
                    String str2 = p2u0Var.b;
                    Map map = this.g;
                    return q410.d(q410Var, playOrigin, loggingParams, map, str, (PreparePlayOptions) null).flatMap(new wmy(q410Var, str, str2, playOrigin, loggingParams, map));
                }
                if (u2u0Var instanceof r2u0) {
                    return q410.d(q410Var, playOrigin, loggingParams, this.g, ((r2u0) u2u0Var).a, (PreparePlayOptions) null);
                }
                boolean z2 = u2u0Var instanceof t2u0;
                String str3 = this.c;
                if (z2) {
                    f6o1 f6o1Var = ((t2u0) u2u0Var).a;
                    Set set = q410.n;
                    if (f6o1Var instanceof aeh1) {
                        singleJust = Single.just(((aeh1) f6o1Var).g);
                    } else if (f6o1Var instanceof zdh1) {
                        String str4 = ((zdh1) f6o1Var).g;
                        q8n q8nVar = q410Var.j;
                        l2w l2wVar = new l2w(q410Var, str3, str4, (lnm) null, (byte) 19);
                        str3 = str3;
                        singleJust = new MaybeToSingle(cwl1.e0(q8nVar, l2wVar).f(pbo1.c1), z6x.a).map(qbo1.b1);
                    } else if (f6o1Var instanceof beh1) {
                        singleJust = Single.just("");
                    } else {
                        eg.o();
                    }
                    Single singleFlatMap = singleJust.flatMap(new l410(q410Var, this.d, str3, playOrigin, loggingParams, this.g));
                    singleFlatMap.getClass();
                    return singleFlatMap;
                }
                if (u2u0Var instanceof s2u0) {
                    return q410.d(q410Var, playOrigin, loggingParams, this.g, str3, this.d);
                }
                if (u2u0Var instanceof q2u0) {
                    Set set2 = q410.n;
                    return q410Var.a.a.firstOrError().flatMap(new l410(q410Var, str3, this.d, playOrigin, loggingParams, this.g));
                }
                eg.o();
                return null;
            default:
                Set set3 = q410.n;
                return this.b.b(this.c, this.d, this.e, this.f, this.g);
        }
    }

    public m410(q410 q410Var, String str, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        this.b = q410Var;
        this.c = str;
        this.d = preparePlayOptions;
        this.e = playOrigin;
        this.f = loggingParams;
        this.g = map;
    }
}
