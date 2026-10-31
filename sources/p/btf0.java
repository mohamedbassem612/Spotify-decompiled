package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class btf0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ yqg d;

    public /* synthetic */ btf0(long j, Scheduler scheduler, yqg yqgVar, byte b) {
        this.a = b;
        this.b = j;
        this.c = scheduler;
        this.d = yqgVar;
    }

    public final Object apply(Object obj) {
        j380 j380VarMetadata;
        String str;
        Double dA0;
        FlowableMap flowableMapI;
        byte b = this.a;
        yqg yqgVar = this.d;
        switch (b) {
            case 0:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                double dDoubleValue = (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null || (str = (String) j380VarMetadata.get("item.speed")) == null || (dA0 = nhc1.a0(str)) == null) ? 1.0d : dA0.doubleValue();
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    return Flowable.G(0L, this.b, TimeUnit.MILLISECONDS, this.c).J(new atf0(playerState, dDoubleValue, yqgVar));
                }
                long jLongValue = ((Number) playerState.positionAsOfTimestamp().e(0L)).longValue();
                return Flowable.I(Long.valueOf(jLongValue >= 0 ? jLongValue : 0L));
            default:
                PlayerState playerState2 = (PlayerState) obj;
                if (!playerState2.isPlaying() || playerState2.isPaused()) {
                    flowableMapI = Flowable.I(playerState2.position(yqgVar.b()));
                } else {
                    FlowableJust flowableJustI = Flowable.I(playerState2);
                    boolean z = hzd1.a;
                    long j = this.b;
                    flowableMapI = Flowable.h(flowableJustI, new FlowableOnBackpressureLatest(Flowable.G(0L, (!z || j >= 500) ? j : 500L, TimeUnit.MILLISECONDS, this.c)), dj10.Z0).J(new qkn0(yqgVar, (byte) 22));
                }
                return flowableMapI.J(new rs4(playerState2, (byte) 2));
        }
    }
}
