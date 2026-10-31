package p;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/k350;", "Lp/a350;", "<init>", "()V", "p/ur00", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k350 extends a350 {
    public Function0 W1;
    public Function0 X1;
    public final String Y1 = "GoogleMeetLiveSessionStartOrJoinSessionDialog";

    @Override // p.a350
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

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131625059, viewGroup, false);
        viewInflate.getClass();
        ((TextView) viewInflate.findViewById(2131431075)).setText(O0().getString("title"));
        TextView textView = (TextView) viewInflate.findViewById(2131431074);
        String string = O0().getString("subtitle");
        if (string != null) {
            SpannableString spannableString = new SpannableString(Html.fromHtml(string, 0));
            for (Object obj : spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                URLSpan uRLSpan = (URLSpan) obj;
                spannableString.setSpan(new j350(), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
            }
            textView.setText(spannableString);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        EncoreButton encoreButtonFindViewById = viewInflate.findViewById(2131431072);
        encoreButtonFindViewById.setText(O0().getString("positive_button_text"));
        encoreButtonFindViewById.setOnClickListener(new i350(this, (byte) 0));
        viewInflate.findViewById(2131431071).setOnClickListener(new i350(this, (byte) 1));
        return viewInflate;
    }
}
