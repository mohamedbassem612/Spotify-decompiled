package p;

import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hmh1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ psy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmh1(psy psyVar, byte b) {
        super(0);
        this.a = b;
        this.b = psyVar;
    }

    public final Object invoke() {
        byte b = this.a;
        psy psyVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new SchedulerWorkRunner((Scheduler) psyVar.X);
    }
}
