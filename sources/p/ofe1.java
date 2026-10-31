package p;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ofe1 extends hab0 implements iu30 {
    public final /* synthetic */ PowerManager a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofe1(PowerManager powerManager, Context context, hdn0 hdn0Var) {
        super(1);
        this.a = powerManager;
        this.b = context;
        this.c = hdn0Var;
    }

    public final Object invoke(Object obj) {
        fk30 fk30Var = new fk30(this.c, (byte) 1);
        Executor executorN = x74.N(this.b);
        PowerManager powerManager = this.a;
        powerManager.addThermalStatusListener(executorN, fk30Var);
        return new nfe1(powerManager, fk30Var);
    }
}
