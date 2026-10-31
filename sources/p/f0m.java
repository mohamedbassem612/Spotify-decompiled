package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f0m implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContentPickerFragment b;

    public /* synthetic */ f0m(ContentPickerFragment contentPickerFragment, byte b) {
        this.a = b;
        this.b = contentPickerFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fws0 fws0Var;
        byte b = this.a;
        ContentPickerFragment contentPickerFragment = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                dtw dtwVar = contentPickerFragment.U1;
                if (dtwVar != null && (fws0Var = (fws0) dtwVar.f) != null && fws0Var.e != view.getHeight()) {
                    dtwVar.f(fws0.a(fws0Var, view.getHeight()));
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                RecyclerView recyclerViewC1 = contentPickerFragment.c1();
                recyclerViewC1.setPadding(recyclerViewC1.getPaddingLeft(), recyclerViewC1.getPaddingTop(), recyclerViewC1.getPaddingRight(), view.getHeight());
                break;
        }
    }
}
