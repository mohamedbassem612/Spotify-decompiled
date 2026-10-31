package p;

import android.os.Build;
import android.widget.Magnifier;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class xct0 implements vct0 {
    public final Object a;

    @Override // p.vct0
    public void a(float f, long j, long j2) {
        ((Magnifier) this.a).show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public void b() {
        ((Magnifier) this.a).dismiss();
    }

    public long c() {
        return (((long) ((Magnifier) this.a).getWidth()) << 32) | (((long) ((Magnifier) this.a).getHeight()) & 4294967295L);
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 28) {
            ProgressBar progressBar = (ProgressBar) ((zgz0) this.a).b;
            progressBar.setAccessibilityPaneTitle(progressBar.getContext().getString(2131957640));
        }
    }

    public void e() {
        ((Magnifier) this.a).update();
    }
}
