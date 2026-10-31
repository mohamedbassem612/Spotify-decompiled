package p;

import android.os.PowerManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nfe1 implements nku {
    public final /* synthetic */ PowerManager a;
    public final /* synthetic */ fk30 b;

    public nfe1(PowerManager powerManager, fk30 fk30Var) {
        this.a = powerManager;
        this.b = fk30Var;
    }

    public final void dispose() {
        this.a.removeThermalStatusListener(this.b);
    }
}
