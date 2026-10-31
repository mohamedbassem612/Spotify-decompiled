package p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c0m extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContentPickerFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0m(ContentPickerFragment contentPickerFragment, byte b) {
        super(1);
        this.a = b;
        this.b = contentPickerFragment;
    }

    public final Object invoke(Object obj) {
        bxs0 bxs0Var;
        tzr0 tzr0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ContentPickerFragment contentPickerFragment = this.b;
        switch (b) {
            case 0:
                contentPickerFragment.d1().U(new tzl((txs0) obj));
                break;
            case 1:
                contentPickerFragment.d1().U(new tzl((txs0) obj));
                break;
            case 2:
                contentPickerFragment.d1().U(new tzl((txs0) obj));
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                dtw dtwVar = contentPickerFragment.S1;
                if (dtwVar != null && (bxs0Var = (bxs0) dtwVar.f) != null) {
                    dtwVar.f(new bxs0(bxs0Var.a, bxs0Var.b, bxs0Var.c, bxs0Var.d, bxs0Var.e, fFloatValue));
                }
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                contentPickerFragment.d1().U(wzl.a);
                if (iIntValue == 0 && (tzr0Var = contentPickerFragment.Q1) != null) {
                    ((PickerCollapsingTitleBar) tzr0Var.d).setExpanded(true);
                }
                break;
        }
        return rih1Var;
    }
}
