package p;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubz0 implements View.OnHoverListener {
    public static final ubz0 b = new ubz0(0);
    public static final ubz0 c = new ubz0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ ubz0(byte b2) {
        this.a = b2;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        switch (this.a) {
        }
        return true;
    }
}
