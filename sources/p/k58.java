package p;

import android.media.AudioRouting;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class k58 implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ yu3 a;

    @Override // android.media.AudioRouting.OnRoutingChangedListener
    public final void onRoutingChanged(AudioRouting audioRouting) {
        yu3 yu3Var = this.a;
        if (((k58) yu3Var.e) == null) {
            return;
        }
        tx9.n().execute(new ny2(yu3Var, audioRouting, (byte) 14));
    }
}
