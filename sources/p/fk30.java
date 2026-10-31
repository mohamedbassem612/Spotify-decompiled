package p;

import android.os.PowerManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fk30 implements PowerManager.OnThermalStatusChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fk30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public final void onThermalStatusChanged(int i) {
        switch (this.a) {
            case 0:
                ((dk30) this.b).n1 = i;
                break;
            default:
                ((hdn0) this.b).t(i);
                break;
        }
    }
}
