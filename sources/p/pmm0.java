package p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pmm0 implements Interpolator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ clv b;

    public /* synthetic */ pmm0(clv clvVar, byte b) {
        this.a = b;
        this.b = clvVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double dB;
        switch (this.a) {
            case 0:
                dB = this.b.b(f);
                break;
            case 1:
                dB = this.b.b(f);
                break;
            default:
                dB = this.b.b(f);
                break;
        }
        return (float) dB;
    }
}
