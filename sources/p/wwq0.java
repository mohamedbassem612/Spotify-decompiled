package p;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wwq0 {
    public Function0 a;
    public Function0 b;
    public final int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public MotionEvent h;
    public boolean i;

    public wwq0(Activity activity) {
        int scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.c = scaledTouchSlop * scaledTouchSlop;
    }
}
