package p;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z6b extends FrameLayout {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6b(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return true;
            default:
                return false;
        }
    }
}
