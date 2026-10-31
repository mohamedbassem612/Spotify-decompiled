package p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i211 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i211(et90 et90Var, byte b) {
        super(0);
        this.a = b;
        this.b = et90Var;
    }

    public final Object invoke() {
        byte b = this.a;
        et90 et90Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new SchedulerWorkRunner((Scheduler) et90Var.g);
    }
}
