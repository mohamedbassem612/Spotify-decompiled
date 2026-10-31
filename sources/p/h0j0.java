package p;

import android.animation.ValueAnimator;
import android.widget.EditText;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h0j0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ h0j0(EditText editText, byte b) {
        this.a = b;
        this.b = editText;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        String string = null;
        EditText editText = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CharSequence hint = editText.getHint();
                if (hint != null) {
                    string = hint.toString();
                    editText.setHintTextColor(editText.getHintTextColors().withAlpha((int) (fFloatValue * 255.0f)));
                }
                editText.setHint(string);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CharSequence hint2 = editText.getHint();
                if (hint2 != null) {
                    string = hint2.toString();
                    editText.setHintTextColor(editText.getHintTextColors().withAlpha((int) (fFloatValue2 * 255.0f)));
                }
                editText.setHint(string);
                break;
        }
    }
}
