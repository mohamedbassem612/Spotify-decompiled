package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/k2l;", "Lp/t2u;", "<init>", "()V", "src_main_java_com_spotify_connect_uiusecases_dialog-dialog"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k2l extends t2u {
    public final void I0(View view, Bundle bundle) {
        ((TextView) view.findViewById(2131428185)).setText(O0().getString("title"));
        ((TextView) view.findViewById(2131428184)).setText(O0().getString("body"));
        Button button = (Button) view.findViewById(2131428183);
        button.setText(O0().getString("button_text"));
        button.setOnClickListener(new c20(this, (byte) 21));
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        e1(0, 2132017482);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624463, viewGroup, false);
    }
}
