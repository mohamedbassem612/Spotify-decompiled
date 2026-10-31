package p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b0m extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContentPickerFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0m(ContentPickerFragment contentPickerFragment, byte b) {
        super(0);
        this.a = b;
        this.b = contentPickerFragment;
    }

    public final Object invoke() {
        vws0 vws0Var;
        String str;
        byte b = this.a;
        vzl vzlVar = vzl.a;
        szl szlVar = szl.a;
        rih1 rih1Var = rih1.a;
        ContentPickerFragment contentPickerFragment = this.b;
        switch (b) {
            case 0:
                contentPickerFragment.d1().U(szlVar);
                return rih1Var;
            case 1:
                contentPickerFragment.Z0().e(true, false, true);
                return rih1Var;
            case 2:
                dtw dtwVar = contentPickerFragment.T1;
                if (dtwVar != null && (vws0Var = (vws0) dtwVar.f) != null) {
                    dtwVar.f(vws0.a(vws0Var, null));
                }
                return rih1Var;
            case 3:
                contentPickerFragment.d1().U(szlVar);
                return rih1Var;
            case 4:
                edr0 edr0Var = contentPickerFragment.H1;
                if (edr0Var == null) {
                    u890.C("sessionIdProvider");
                    throw null;
                }
                UUID uuidB = edr0Var.b(of61.a);
                ro41 ro41Var = (ro41) ((MobiusLoopViewModel) contentPickerFragment.d1()).b.e();
                if (ro41Var == null || (str = ro41Var.a) == null) {
                    str = "";
                }
                return new grk0(str, uuidB);
            case 5:
                contentPickerFragment.d1().U(vzlVar);
                return rih1Var;
            case 6:
                contentPickerFragment.d1().U(xzl.a);
                return rih1Var;
            case 7:
                contentPickerFragment.d1().U(vzlVar);
                return rih1Var;
            case 8:
                if (uyn1.t(contentPickerFragment.P0())) {
                    tzr0 tzr0Var = contentPickerFragment.Q1;
                    tzr0Var.getClass();
                    EncoreButton encoreButton = (EncoreButton) ((phi0) tzr0Var.c).c;
                    if (uyn1.t(encoreButton.getContext())) {
                        encoreButton.performAccessibilityAction(64, null);
                        encoreButton.sendAccessibilityEvent(4);
                    }
                }
                return rih1Var;
            case 9:
                contentPickerFragment.d1().U(szlVar);
                return rih1Var;
            default:
                f4m f4mVar = contentPickerFragment.L1;
                if (f4mVar != null) {
                    return f4mVar;
                }
                u890.C("viewModelFactory");
                throw null;
        }
    }
}
