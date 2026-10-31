package p;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class btk1 extends VolumeProvider {
    public final /* synthetic */ ev40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btk1(ev40 ev40Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = ev40Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.a.c(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.a.d(i);
    }
}
