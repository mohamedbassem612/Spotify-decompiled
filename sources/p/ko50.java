package p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ko50 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sp00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko50(sp00 sp00Var, byte b) {
        super(0);
        this.a = b;
        this.b = sp00Var;
    }

    public final Object invoke() {
        byte b = this.a;
        sp00 sp00Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new SchedulerWorkRunner((Scheduler) sp00Var.e);
    }
}
