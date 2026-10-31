package p;

import android.os.Handler;
import androidx.media3.session.legacy.VolumeProviderCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yzh0 extends VolumeProviderCompat {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ ffu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzh0(int i, int i2, int i3, String str, Handler handler, ffu0 ffu0Var) {
        super(i, i2, i3, str);
        this.a = handler;
        this.b = ffu0Var;
    }

    @Override // androidx.media3.session.legacy.VolumeProviderCompat
    public final void onAdjustVolume(int i) {
        zoi1.c0(this.a, new xzh0(this.b, i, (byte) 1));
    }

    @Override // androidx.media3.session.legacy.VolumeProviderCompat
    public final void onSetVolumeTo(int i) {
        zoi1.c0(this.a, new xzh0(this.b, i, (byte) 0));
    }
}
