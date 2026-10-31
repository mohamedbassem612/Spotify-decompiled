package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qhy extends FrameLayout implements tlv {
    public final tzo a;
    public final q4u b;

    public qhy(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(2131624589, this);
        EncoreTextView encoreTextViewT = m5n1.t(this, 2131429735);
        if (encoreTextViewT == null) {
            bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(2131429735)));
            throw null;
        }
        tzo tzoVar = new tzo(this, encoreTextViewT);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.a = tzoVar;
        this.b = nln.w(new q4u[]{nln.x(ohy.b, nln.v(new gcy(1, this, qhy.class, "renderText", "renderText(Ljava/lang/String;)V", 0, (byte) 11))), nln.x(phy.b, nln.v(new gcy(1, this, qhy.class, "renderLookDisabled", "renderLookDisabled(Ljava/lang/Boolean;)V", 0, (byte) 12)))});
    }

    public final void f(Object obj) {
        this.b.a((nhy) obj);
    }
}
