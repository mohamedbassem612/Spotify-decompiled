package p;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.badge.viral.ViralBadgeView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class txr extends ConstraintLayout implements naz {
    public final tjq T0;

    /* JADX WARN: Multi-variable type inference failed */
    public txr(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(2131624519, (ViewGroup) this);
        int i = 2131427611;
        EncoreImageView encoreImageViewT = m5n1.t(this, 2131427611);
        if (encoreImageViewT != null) {
            i = 2131430472;
            TextView textView = (TextView) m5n1.t(this, 2131430472);
            if (textView != null) {
                i = 2131431115;
                TextView textView2 = (TextView) m5n1.t(this, 2131431115);
                if (textView2 != null) {
                    i = 2131431356;
                    TextView textView3 = (TextView) m5n1.t(this, 2131431356);
                    if (textView3 != null) {
                        i = 2131431644;
                        ViralBadgeView viralBadgeViewT = m5n1.t(this, 2131431644);
                        if (viralBadgeViewT != null) {
                            tjq tjqVar = new tjq((ViewGroup) this, (ViewGroup) encoreImageViewT, (View) textView, (View) textView2, (View) textView3, (ViewGroup) viralBadgeViewT);
                            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            v9w0 v9w0VarQ = b2u.q(textView3);
                            Collections.addAll(v9w0VarQ.c, textView2);
                            Collections.addAll(v9w0VarQ.d, encoreImageViewT);
                            v9w0VarQ.a();
                            this.T0 = tjqVar;
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void setUpWithSubtitle(String str) {
        tjq tjqVar = this.T0;
        ((TextView) tjqVar.a).setText(ihc1.e1(str).toString());
        ((TextView) tjqVar.a).setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        maz mazVar = (maz) obj;
        String str = mazVar.b;
        tjq tjqVar = this.T0;
        TextView textView = (TextView) tjqVar.d;
        EncoreImageView encoreImageView = (EncoreImageView) tjqVar.b;
        textView.setText(ihc1.e1(mazVar.a).toString());
        String str2 = mazVar.c;
        if (str2 != null) {
            encoreImageView.setSource(new sux(Uri.parse(str2)));
        }
        encoreImageView.setModifierFactory(new i4o(mazVar, (byte) 16));
        kil kilVar = new kil();
        kilVar.f(this);
        if (mazVar.f == 1) {
            kilVar.i(2131427611, (int) getContext().getResources().getDimension(2131167170));
        } else {
            kilVar.i(2131427611, (int) getContext().getResources().getDimension(2131167169));
        }
        kilVar.b(this);
        encoreImageView.setPlaceholderFactory(ido.c1);
        ((TextView) tjqVar.c).setVisibility(mazVar.e ? 0 : 8);
        if (str == null || ihc1.y0(str)) {
            kil kilVar2 = new kil();
            kilVar2.f(this);
            kilVar2.g(2131431356, 4, 2131431115, 3);
            kilVar2.b(this);
            ((TextView) tjqVar.a).setVisibility(8);
        } else {
            kil kilVar3 = new kil();
            kilVar3.f(this);
            kilVar3.g(2131431356, 4, 2131431115, 3);
            kilVar3.b(this);
            setUpWithSubtitle(str);
        }
        ((ViralBadgeView) tjqVar.e).setVisibility(8);
    }

    public final void setViewContext(sxr sxrVar) {
        ((EncoreImageView) this.T0.b).setImageLoader(sxrVar.a);
    }
}
