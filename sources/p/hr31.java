package p;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hr31 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int width = view.getWidth() - (view.getPaddingRight() + view.getPaddingLeft());
                int height = view.getHeight() - (view.getPaddingBottom() + view.getPaddingTop());
                Function0 function0 = (Function0) obj;
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                if (width != height || width > fFloatValue * 2.0f) {
                    outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom(), ((Number) function0.invoke()).floatValue());
                } else {
                    outline.setOval(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
                }
                outline.setAlpha(0.0f);
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((ConstraintLayout) obj).getContext().getResources().getDimension(2131165798));
                break;
        }
    }
}
