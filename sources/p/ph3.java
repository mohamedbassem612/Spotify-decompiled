package p;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ph3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ph3(f39 f39Var, Context context) {
        this.b = f39Var;
        this.c = context;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qh3 qh3Var = (qh3) obj;
                th3 th3Var = (th3) obj2;
                qh3Var.q.onClick(th3Var.b, i);
                if (!qh3Var.s) {
                    th3Var.b.dismiss();
                }
                break;
            default:
                f39 f39Var = (f39) obj2;
                hce1 hce1Var = f39Var.a;
                a39 a39Var = f39Var.b;
                int itemViewType = a39Var.getItemViewType(i);
                if (itemViewType == 0) {
                    Function0 onManualEntrySelected = f39Var.getOnManualEntrySelected();
                    if (onManualEntrySelected != null) {
                        onManualEntrySelected.invoke();
                    }
                    ((NonCompletingAutoCompleteTextView) hce1Var.e).dismissDropDown();
                    break;
                } else if (itemViewType == 1) {
                    i320 i320Var = (i320) o7h.t0(i - 1, a39Var.e);
                    if (i320Var != null) {
                        iu30 onSuggestionSelected = f39Var.getOnSuggestionSelected();
                        if (onSuggestionSelected != null) {
                            onSuggestionSelected.invoke(i320Var);
                        }
                        ((NonCompletingAutoCompleteTextView) hce1Var.e).clearFocus();
                        ((InputMethodManager) ((Context) obj).getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(((NonCompletingAutoCompleteTextView) hce1Var.e).getWindowToken(), 0);
                        break;
                    }
                }
                break;
        }
    }

    public ph3(qh3 qh3Var, th3 th3Var) {
        this.c = qh3Var;
        this.b = th3Var;
    }
}
