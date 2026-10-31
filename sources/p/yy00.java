package p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yy00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy00(az00 az00Var, byte b) {
        super(0);
        this.a = b;
        this.b = az00Var;
    }

    public final Object invoke() {
        byte b = this.a;
        az00 az00Var = this.b;
        switch (b) {
            case 0:
                return new SchedulerWorkRunner(az00Var.d);
            default:
                return new SchedulerWorkRunner(az00Var.e);
        }
    }
}
