package p;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gkb {
    public final Context a;
    public final a84 b;
    public final tgb c;
    public final PublishSubject d = new PublishSubject();
    public final jlb e = new jlb(this, (byte) 4);

    public gkb(Context context, a84 a84Var, ekb ekbVar, tgb tgbVar) {
        this.a = context;
        this.b = a84Var;
        this.c = tgbVar;
    }

    public final boolean a() {
        BluetoothAdapter bluetoothAdapter = this.b.a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }
}
