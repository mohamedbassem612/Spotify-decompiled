package p;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c75 implements e8k1 {
    public final ViewConfiguration a;

    public c75(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // p.e8k1
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p.e8k1
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p.e8k1
    public final float c() {
        return this.a.getScaledMinimumFlingVelocity();
    }

    @Override // p.e8k1
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return sf.u(this.a);
        }
        return 2.0f;
    }

    @Override // p.e8k1
    public final float f() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // p.e8k1
    public final float g() {
        return this.a.getScaledTouchSlop();
    }

    @Override // p.e8k1
    public final float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return sf.t(this.a);
        }
        return 16.0f;
    }
}
