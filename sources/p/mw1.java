package p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mw1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw1(Scheduler scheduler, byte b) {
        super(0);
        this.a = b;
        this.b = scheduler;
    }

    public final Object invoke() {
        byte b = this.a;
        Scheduler scheduler = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return new SchedulerWorkRunner(scheduler);
    }
}
