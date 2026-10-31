package p;

import android.view.View;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g0m implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContentPickerFragment b;

    public /* synthetic */ g0m(ContentPickerFragment contentPickerFragment, byte b) {
        this.a = b;
        this.b = contentPickerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ContentPickerFragment contentPickerFragment = this.b;
        switch (b) {
            case 0:
                contentPickerFragment.d1().U(vzl.a);
                break;
            default:
                contentPickerFragment.d1().U(xzl.a);
                break;
        }
    }
}
