package p;

import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b39 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ p811 d;
    public final /* synthetic */ LinearLayout e;

    public /* synthetic */ b39(LinearLayout linearLayout, int[] iArr, int[] iArr2, p811 p811Var, byte b) {
        this.a = b;
        this.e = linearLayout;
        this.b = iArr;
        this.c = iArr2;
        this.d = p811Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        nk80 nk80VarI;
        byte b = this.a;
        LinearLayout linearLayout = this.e;
        boolean z = false;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        p811 p811Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hce1 hce1Var = ((f39) linearLayout).a;
                if (((NonCompletingAutoCompleteTextView) hce1Var.e).isPopupShowing()) {
                    ((f39) hce1Var.b).getLocationInWindow(iArr);
                    if (!Arrays.equals(iArr2, iArr)) {
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        z = true;
                    }
                    f39 f39Var = (f39) hce1Var.b;
                    WeakHashMap weakHashMap = b8k1.a;
                    hsl1 hsl1VarA = s7k1.a(f39Var);
                    nk80VarI = hsl1VarA != null ? hsl1VarA.a.i(8) : null;
                    if (!u890.j(p811Var.a, nk80VarI)) {
                        p811Var.a = nk80VarI;
                        z = true;
                    }
                    if (z) {
                        ((NonCompletingAutoCompleteTextView) hce1Var.e).showDropDown();
                    }
                }
                break;
            default:
                hce1 hce1Var2 = ((fav) linearLayout).a;
                if (((AutoCompleteTextView) hce1Var2.e).isPopupShowing()) {
                    ((fav) hce1Var2.b).getLocationInWindow(iArr);
                    if (!Arrays.equals(iArr2, iArr)) {
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        z = true;
                    }
                    fav favVar = (fav) hce1Var2.b;
                    WeakHashMap weakHashMap2 = b8k1.a;
                    hsl1 hsl1VarA2 = s7k1.a(favVar);
                    nk80VarI = hsl1VarA2 != null ? hsl1VarA2.a.i(8) : null;
                    if (!u890.j(p811Var.a, nk80VarI)) {
                        p811Var.a = nk80VarI;
                        z = true;
                    }
                    if (z) {
                        ((AutoCompleteTextView) hce1Var2.e).showDropDown();
                    }
                }
                break;
        }
        return true;
    }
}
