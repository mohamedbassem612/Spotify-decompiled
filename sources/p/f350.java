package p;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/f350;", "Lp/z250;", "<init>", "()V", "p/g2z", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f350 extends z250 {
    public Function0 W1;
    public Function0 X1;
    public bm00 Y1;

    public final void G0() {
        super.G0();
        Dialog dialog = ((t2u) this).Q1;
        if (dialog != null) {
            jbc.c(dialog, 0.9f);
        }
    }

    @Override // p.z250
    /* JADX INFO: renamed from: i1 */
    public final String getY1() {
        return "GoogleMeetLiveSessionInstallAddOnDialog";
    }

    public final void w0(Bundle bundle) {
        Window window;
        super.w0(bundle);
        Dialog dialog = ((t2u) this).Q1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.requestFeature(1);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625057, viewGroup, false);
        int i = 2131427857;
        if (m5n1.t(constraintLayoutInflate, 2131427857) != null) {
            i = 2131430927;
            EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430927);
            if (encoreButtonT != null) {
                i = 2131430928;
                EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430928);
                if (encoreButtonT2 != null) {
                    i = 2131430929;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430929);
                    if (textView != null) {
                        i = 2131430930;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430930);
                        if (textView2 != null) {
                            this.Y1 = new bm00(constraintLayoutInflate, encoreButtonT, encoreButtonT2, textView, textView2);
                            String string = O0().getString("title");
                            if (string == null) {
                                hhg1.n("Required value was null.");
                                return null;
                            }
                            textView2.setText(string);
                            String string2 = O0().getString("subtitle");
                            if (string2 == null) {
                                hhg1.n("Required value was null.");
                                return null;
                            }
                            textView.setText(string2);
                            String string3 = O0().getString("install_button_text");
                            if (string3 == null) {
                                hhg1.n("Required value was null.");
                                return null;
                            }
                            encoreButtonT2.setText(string3);
                            encoreButtonT2.setOnClickListener(new e350(this, (byte) 0));
                            String string4 = O0().getString("dismiss_button_text");
                            if (string4 == null) {
                                hhg1.n("Required value was null.");
                                return null;
                            }
                            encoreButtonT.setText(string4);
                            encoreButtonT.setOnClickListener(new e350(this, (byte) 1));
                            bm00 bm00Var = this.Y1;
                            bm00Var.getClass();
                            return (ConstraintLayout) bm00Var.b;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void z0() {
        super.z0();
        this.Y1 = null;
    }
}
