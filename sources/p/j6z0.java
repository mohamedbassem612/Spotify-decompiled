package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ j6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return rqt0.F(o6x.a, new pew0(this.b, (u4z0) obj, false, (lnm) null, (byte) 24)).map(gex0.c).onErrorReturn(hgx0.c).toObservable();
            default:
                ruz ruzVar = this.b.b;
                ContextTrack contextTrack = ((j5z0) obj).d;
                SkipToNextTrackCommand.Builder builder = SkipToNextTrackCommand.builder();
                if (contextTrack != null) {
                    builder.track(contextTrack);
                }
                return ruzVar.a(new m9u0(builder.build())).map(i2x0.d).onErrorReturn(r3x0.d).toObservable();
        }
    }
}
