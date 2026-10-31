package p;

import android.media.SoundPool;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yja1 implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ zja1 a;

    public yja1(zja1 zja1Var) {
        this.a = zja1Var;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        ayh ayhVar = (zxh) this.a.f.remove(Integer.valueOf(i));
        if (ayhVar != null) {
            if (i2 == 0) {
                ayhVar.m0(Integer.valueOf(i));
            } else {
                ayhVar.y0(new RuntimeException(f4i1.c(i2, "SoundPool load failed: ")));
            }
        }
    }
}
