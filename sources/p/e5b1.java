package p;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e5b1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5b1(boolean z) {
        super(1);
        this.a = z;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(!this.a || ((MediaCodecInfo) obj).isHardwareAccelerated());
    }
}
