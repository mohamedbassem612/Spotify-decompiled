package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ona extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ona(boolean z, long j, long j2, p811 p811Var) {
        super(1);
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = p811Var;
    }

    public final Object invoke(Object obj) {
        String identifier;
        t2k1 configuration;
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                z590 z590Var = (z590) obj;
                Long l = (Long) ((p811) obj2).a;
                return z590.a(z590Var, (lsm0) null, false, (o091) null, this.b, l != null ? l.longValue() : this.c, 0L, 0.0f, this.d, (y1k1) null, 359);
            default:
                k5u0 k5u0Var = (k5u0) obj;
                VideoSurfaceView videoSurfaceView = this.b ? null : ((q5u0) obj2).d;
                if (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null || (identifier = configuration.getIdentifier()) == null) {
                    identifier = "unknown";
                }
                return k5u0.b(k5u0Var, this.c, Long.valueOf(this.d), (Long) null, false, 0.0f, false, (Integer) null, (List) null, identifier, (jgc1) null, 0, false, this.b, 15865);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ona(q5u0 q5u0Var, boolean z, long j, long j2) {
        super(1);
        this.e = q5u0Var;
        this.b = z;
        this.c = j;
        this.d = j2;
    }
}
