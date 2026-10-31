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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/g350;", "Lp/z250;", "<init>", "()V", "p/sp00", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g350 extends z250 {
    public Function0 W1;
    public nun X1;

    public final void G0() {
        super.G0();
        Dialog dialog = ((t2u) this).Q1;
        if (dialog != null) {
            jbc.c(dialog, 0.75f);
        }
    }

    @Override // p.z250
    public final String i1() {
        return "GoogleMeetLiveSessionRecordedDialog";
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
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625058, viewGroup, false);
        int i = 2131430926;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430926);
        if (encoreButtonT != null) {
            i = 2131430929;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430929);
            if (textView != null) {
                i = 2131430930;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430930);
                if (textView2 != null) {
                    this.X1 = new nun(constraintLayoutInflate, encoreButtonT, textView, textView2);
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
                    String string3 = O0().getString("positive_button_text");
                    if (string3 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    encoreButtonT.setText(string3);
                    encoreButtonT.setOnClickListener(new zfs(this, (byte) 15));
                    nun nunVar = this.X1;
                    nunVar.getClass();
                    return nunVar.a;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void z0() {
        super.z0();
        this.X1 = null;
    }
}
