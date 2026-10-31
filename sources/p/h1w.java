package p;

import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h1w implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a2w b;

    public /* synthetic */ h1w(a2w a2wVar, byte b) {
        this.a = b;
        this.b = a2wVar;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        hb9 hb9Var;
        byte b = this.a;
        a2w a2wVar = this.b;
        switch (b) {
            case 0:
                s0w s0wVar = (s0w) obj;
                s0wVar.getClass();
                Integer num = s0wVar.j;
                boolean z = s0wVar.f;
                if (z && (hb9Var = s0wVar.i) != null) {
                    str = hb9Var.b;
                } else if (!z || (str2 = s0wVar.h) == null) {
                    str = (!z || num == null) ? s0wVar.g : null;
                } else {
                    str = str2;
                }
                a2wVar.t.e(a2wVar.b, new td10(str, s0wVar.a, s0wVar.c, num != null ? new rd10(Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)))) : null));
                break;
            case 1:
                xb41 xb41Var = (xb41) obj;
                mzr0 mzr0Var = a2wVar.d;
                ProgressBar progressBar = (ProgressBar) mzr0Var.e;
                TextView textView = (TextView) mzr0Var.f;
                View view = (View) mzr0Var.g;
                if (progressBar != null && textView != null && view != null) {
                    float f = xb41Var.b;
                    progressBar.setProgress(Float.isNaN(f) ? 0 : jch0.U(f * 100.0f));
                    int iC = l1d.C(xb41Var.a);
                    if (iC != 0) {
                        if (iC == 1) {
                            textView.setText(2131961418);
                            progressBar.setVisibility(0);
                            view.setVisibility(4);
                        } else if (iC != 2) {
                            eg.o();
                        } else {
                            textView.setText(2131961417);
                            progressBar.setVisibility(4);
                            view.setVisibility(0);
                        }
                    }
                    break;
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mzr0 mzr0Var2 = a2wVar.d;
                if (zBooleanValue && !mzr0Var2.j()) {
                    dg30 dg30Var = a2wVar.a;
                    View currentFocus = dg30Var.getCurrentFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) dg30Var.getSystemService("input_method");
                    if (currentFocus != null && inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                    }
                    ((pw40) mzr0Var2.d).b();
                    break;
                } else if (!zBooleanValue && mzr0Var2.j()) {
                    mzr0Var2.c();
                    break;
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                qzh qzhVar = a2wVar.Q0;
                qzhVar.getView().setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
                qzhVar.getView().setContentDescription(bool.booleanValue() ? null : a2wVar.i.getContext().getString(2131955348));
                break;
        }
    }
}
