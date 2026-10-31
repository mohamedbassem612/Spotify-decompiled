package p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wkm0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkm0(cm0 cm0Var, byte b) {
        super(0);
        this.a = b;
        this.b = cm0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                return new SchedulerWorkRunner((Scheduler) cm0Var.e);
            default:
                return new SchedulerWorkRunner((Scheduler) cm0Var.f);
        }
    }
}
