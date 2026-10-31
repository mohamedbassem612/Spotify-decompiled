package p;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/m350;", "Lp/z250;", "<init>", "()V", "p/bjx", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m350 extends z250 {
    public Function0 W1;
    public Function0 X1;
    public final String Y1 = "GoogleMeetUpsellDialog";

    public final void G0() {
        super.G0();
        Dialog dialog = ((t2u) this).Q1;
        if (dialog != null) {
            jbc.c(dialog, 0.75f);
        }
    }

    @Override // p.z250
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final String getY1() {
        return this.Y1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Function0 function0 = this.X1;
        if (function0 != null) {
            function0.invoke();
        }
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
        View viewInflate = layoutInflater.inflate(2131625060, viewGroup, false);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate.findViewById(2131431558);
        String string = O0().getString("title");
        if (string == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        textView.setText(string);
        TextView textView2 = (TextView) viewInflate.findViewById(2131431557);
        String string2 = O0().getString("subtitle");
        if (string2 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        textView2.setText(string2);
        EncoreButton encoreButtonFindViewById = viewInflate.findViewById(2131431556);
        String string3 = O0().getString("positive_button_text");
        if (string3 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        encoreButtonFindViewById.setText(string3);
        encoreButtonFindViewById.setOnClickListener(new l350(this, (byte) 0));
        EncoreButton encoreButtonFindViewById2 = viewInflate.findViewById(2131431555);
        String string4 = O0().getString("negative_button_text");
        if (string4 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        encoreButtonFindViewById2.setText(string4);
        encoreButtonFindViewById2.setOnClickListener(new l350(this, (byte) 1));
        return viewInflate;
    }
}
