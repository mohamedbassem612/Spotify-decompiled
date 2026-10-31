package p;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class utq0 {
    public final wtq0 a;

    public utq0(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.a = new buq0(new OutputConfiguration(i, surface));
            return;
        }
        if (i2 >= 28) {
            this.a = new auq0(new ztq0(new OutputConfiguration(i, surface)));
        } else if (i2 >= 26) {
            this.a = new ytq0(new xtq0(new OutputConfiguration(i, surface)));
        } else {
            this.a = new wtq0(new vtq0(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof utq0)) {
            return false;
        }
        return this.a.equals(((utq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public utq0(wtq0 wtq0Var) {
        this.a = wtq0Var;
    }
}
