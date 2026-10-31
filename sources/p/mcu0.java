package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mcu0 {
    public final uot0 a;
    public final muz b;
    public final ruz c;
    public final FlowableMap d;

    public mcu0(Flowable flowable, uot0 uot0Var, muz muzVar, ruz ruzVar) {
        this.a = uot0Var;
        this.b = muzVar;
        this.c = ruzVar;
        this.d = new FlowableTake(flowable).J(new xgc((byte) 19));
    }

    public final Flowable a(String str, String str2, ege0 ege0Var, long j, boolean z) {
        Context contextFromTrackUris;
        Single singleA;
        boolean zJ = u890.j(str2, ege0Var.c);
        ContextTrack contextTrack = ege0Var.d;
        boolean z2 = false;
        if (contextTrack != null && b3o1.w(contextTrack)) {
            z2 = true;
        }
        if (!zJ || z2) {
            if (str == null || (contextFromTrackUris = Context.fromUri(str)) == null) {
                contextFromTrackUris = Context.fromTrackUris(str2, b380.t(str2));
            }
            PreparePlayOptions.Builder builderSkipTo = PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str2));
            builderSkipTo.getClass();
            if (z) {
                builderSkipTo.seekToCreatorTimestamp(String.valueOf(j)).getClass();
            } else {
                builderSkipTo.seekTo(Long.valueOf(j)).getClass();
            }
            singleA = this.b.a(PlayCommand.builder(contextFromTrackUris, this.a.get()).options(builderSkipTo.build()).build());
        } else {
            boolean z3 = ege0Var.b;
            ruz ruzVar = this.c;
            if (z3) {
                singleA = ruzVar.a(z ? new j9u0(SeekToCommand.Builder.builder().creatorTimestampPositionMs(j).build()) : new i9u0(j));
            } else {
                singleA = ruzVar.a(z ? new j9u0(SeekToCommand.Builder.builder().creatorTimestampPositionMs(j).build()) : new i9u0(j)).flatMap(new uip0(this, (byte) 14));
                singleA.getClass();
            }
        }
        return singleA.toFlowable();
    }

    public final Object b(String str, long j, String str2, a8d1 a8d1Var) {
        azj azjVar = new azj(this, str2, str, j);
        int i = Flowable.a;
        Flowable flowableA = this.d.A(azjVar, i, i);
        flowableA.getClass();
        Object objI = fc11.i(new FlowableIgnoreElementsCompletable(flowableA), a8d1Var);
        return objI == d9n.a ? objI : rih1.a;
    }
}
