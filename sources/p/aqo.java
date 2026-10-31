package p;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aqo extends mzx {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqo(TextInputLayout textInputLayout, int i, byte b) {
        super(textInputLayout, i);
        this.e = b;
    }

    @Override // p.mzx
    public final void a() {
        byte b = this.e;
        TextInputLayout textInputLayout = this.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                textInputLayout.setEndIconDrawable(this.d);
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconDrawable((Drawable) null);
                textInputLayout.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }
}
