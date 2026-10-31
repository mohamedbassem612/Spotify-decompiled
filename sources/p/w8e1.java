package p;

import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w8e1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextInputLayout b;

    public /* synthetic */ w8e1(TextInputLayout textInputLayout, byte b) {
        this.a = b;
        this.b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TextInputLayout textInputLayout = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                AppCompatImageButton appCompatImageButton = textInputLayout.I1;
                appCompatImageButton.performClick();
                appCompatImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.e.requestLayout();
                break;
        }
    }
}
