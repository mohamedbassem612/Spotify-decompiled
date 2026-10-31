package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eqj1 extends ConstraintLayout implements naz {
    public final e821 T0;

    /* JADX WARN: Multi-variable type inference failed */
    public eqj1(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(2131626309, (ViewGroup) this);
        int i = 2131427611;
        View view = (ArtworkView) m5n1.t(this, 2131427611);
        if (view != null) {
            i = 2131431115;
            TextView textView = (TextView) m5n1.t(this, 2131431115);
            if (textView != null) {
                i = 2131431133;
                if (((LinearLayout) m5n1.t(this, 2131431133)) != null) {
                    i = 2131431356;
                    TextView textView2 = (TextView) m5n1.t(this, 2131431356);
                    if (textView2 != null) {
                        i = 2131431599;
                        FrameLayout frameLayout = (FrameLayout) m5n1.t(this, 2131431599);
                        if (frameLayout != null) {
                            i = 2131431645;
                            TextView textView3 = (TextView) m5n1.t(this, 2131431645);
                            if (textView3 != null) {
                                e821 e821Var = new e821(this, view, textView, textView2, frameLayout, textView3);
                                setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                v9w0 v9w0VarQ = b2u.q(this);
                                ArrayList arrayList = v9w0VarQ.c;
                                Collections.addAll(arrayList, textView3);
                                Collections.addAll(arrayList, textView);
                                Collections.addAll(arrayList, textView2);
                                Collections.addAll(v9w0VarQ.d, view);
                                v9w0VarQ.a();
                                this.T0 = e821Var;
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        maz mazVar = (maz) obj;
        String str = mazVar.b;
        boolean z = mazVar.d;
        e821 e821Var = this.T0;
        TextView textView = (TextView) e821Var.c;
        TextView textView2 = (TextView) e821Var.a;
        textView.setText(ihc1.e1(mazVar.a).toString());
        ((ArtworkView) e821Var.b).h(new t07(new g07(mazVar.c), false));
        ((TextView) e821Var.e).setVisibility(8);
        textView2.setText(o7h.y0(f46.i0(new String[]{z ? getContext().getString(2131963755) : null, str != null ? ihc1.e1(str).toString() : null}), " • ", (String) null, (String) null, (iu30) null, 62));
        textView2.setVisibility(ihc1.y0(textView2.getText()) ? 8 : 0);
        ((FrameLayout) e821Var.d).setVisibility(8);
    }

    public final void setViewContext(dqj1 dqj1Var) {
        ((ArtworkView) this.T0.b).setViewContext(new f47(dqj1Var.a));
    }
}
