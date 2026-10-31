package p;

import android.os.PowerManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mfe1 extends hab0 implements Function0 {
    public final /* synthetic */ PowerManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfe1(PowerManager powerManager) {
        super(0);
        this.a = powerManager;
    }

    public final Object invoke() {
        PowerManager powerManager = this.a;
        if (powerManager != null) {
            return Integer.valueOf(powerManager.getCurrentThermalStatus());
        }
        return null;
    }
}
