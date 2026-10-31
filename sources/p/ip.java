package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ip implements l5r0 {
    public final pp a;
    public final MobiusLoop.Controller b;
    public final fp c;
    public final AccountSelectionActivity d;
    public ConstraintLayout e;

    public ip(pp ppVar, MobiusLoop.Controller controller, fp fpVar, AccountSelectionActivity accountSelectionActivity) {
        this.a = ppVar;
        this.b = controller;
        this.c = fpVar;
        this.d = accountSelectionActivity;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131623968, (ViewGroup) null, false);
        int i = 2131427418;
        if (m5n1.t(constraintLayoutInflate, 2131427418) != null) {
            i = 2131427419;
            if (m5n1.t(constraintLayoutInflate, 2131427419) != null) {
                i = 2131427420;
                EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131427420);
                if (encoreTextViewT != null) {
                    i = 2131427421;
                    EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131427421);
                    if (encoreTextViewT2 != null) {
                        i = 2131427423;
                        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131427423);
                        if (recyclerViewT != null) {
                            i = 2131427747;
                            if (m5n1.t(constraintLayoutInflate, 2131427747) != null) {
                                i = 2131428155;
                                ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428155);
                                if (composeViewT != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                    sp spVar = new sp(new ajq0(constraintLayout, encoreTextViewT, encoreTextViewT2, recyclerViewT, composeViewT), this.a, this.c, this.d);
                                    this.e = constraintLayout;
                                    this.b.c(spVar);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }

    public final View getView() {
        return this.e;
    }

    public final void start() {
        this.b.start();
    }

    public final void stop() {
        this.b.stop();
    }
}
