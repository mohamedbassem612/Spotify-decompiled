package p;

import android.media.AudioRecord;
import android.media.AudioRouting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v28 implements AudioRecord.OnRoutingChangedListener {
    public final /* synthetic */ cp5 a;

    public v28(cp5 cp5Var) {
        this.a = cp5Var;
    }

    @Override // android.media.AudioRecord.OnRoutingChangedListener
    public final void onRoutingChanged(AudioRecord audioRecord) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        rt7 rt7Var = new rt7(audioRecord.getRoutedDevice());
        cp5 cp5Var = this.a;
        if (u890.j(rt7Var, (qt7) cp5Var.b)) {
            return;
        }
        cp5Var.b = rt7Var;
    }

    @Override // android.media.AudioRecord.OnRoutingChangedListener, android.media.AudioRouting.OnRoutingChangedListener
    public final void onRoutingChanged(AudioRouting audioRouting) {
        new ConcurrentHashMap();
        rt7 rt7Var = new rt7(audioRouting.getRoutedDevice());
        cp5 cp5Var = this.a;
        if (u890.j(rt7Var, (qt7) cp5Var.b)) {
            return;
        }
        cp5Var.b = rt7Var;
    }
}
