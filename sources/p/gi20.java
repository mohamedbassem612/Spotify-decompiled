package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gi20 extends FrameLayout implements qzh {
    public final t7y a;
    public final gi20 b;

    public gi20(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(2131624642, this);
        int i = 2131428880;
        FindInContextView findInContextViewT = m5n1.t(this, 2131428880);
        if (findInContextViewT != null) {
            i = 2131430252;
            View viewT = m5n1.t(this, 2131430252);
            if (viewT != null) {
                this.a = new t7y(this, findInContextViewT, viewT, (byte) 25);
                setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                this.b = this;
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        t7y t7yVar = this.a;
        FindInContextView findInContextView = (FindInContextView) t7yVar.b;
        String str = ((gg20) obj).a;
        findInContextView.y(new cqo(str));
        ((View) t7yVar.c).setContentDescription(str);
        ((FindInContextView) t7yVar.b).setDescendantFocusability(131072);
    }

    public final void n(iu30 iu30Var) {
        ((View) this.a.c).setOnClickListener(new aqs(iu30Var, (byte) 22));
    }

    public gi20 getView() {
        return this.b;
    }
}
