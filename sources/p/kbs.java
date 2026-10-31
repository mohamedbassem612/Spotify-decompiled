package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kbs implements qzh {
    public final Context a;
    public final f47 b;
    public final r4u c = r4u.c(new r4u[]{r4u.d(new nwj(ibs.b, (byte) 2), r4u.a(new wcr(this, (byte) 9))), r4u.d(new nwj(jbs.b, (byte) 2), r4u.a(new xap(this, (byte) 11)))});
    public bqm0 d;
    public final kqm0 e;
    public final MultiArtistAvatarView f;

    public kbs(Context context, gw70 gw70Var) {
        this.a = context;
        this.b = new f47(gw70Var);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625284, (ViewGroup) null, false);
        int i = 2131427619;
        MultiArtistAvatarView multiArtistAvatarViewT = m5n1.t(constraintLayoutInflate, 2131427619);
        if (multiArtistAvatarViewT != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i = 2131431134;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431134);
            if (textView != null) {
                i = 2131431356;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                if (textView2 != null) {
                    kqm0 kqm0Var = new kqm0(constraintLayout, multiArtistAvatarViewT, constraintLayout, textView, textView2);
                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                    Collections.addAll(v9w0VarQ.c, textView2);
                    v9w0VarQ.a();
                    this.e = kqm0Var;
                    this.f = multiArtistAvatarViewT;
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        bqm0 bqm0Var = (bqm0) obj;
        this.d = bqm0Var;
        this.c.e(bqm0Var);
    }

    public final View getView() {
        return this.e.a;
    }

    public final void n(iu30 iu30Var) {
        this.e.a.setOnClickListener(new cvr(iu30Var, this, (byte) 4));
    }
}
