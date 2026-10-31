package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.follow.EncoreFollowButton;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bgr implements qzh {
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ip31 e;
    public final int f;

    public bgr(Context context, gw70 gw70Var, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = z3;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624056, (ViewGroup) null, false);
        int i = 2131427553;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427553);
        if (textView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131428177;
                ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131428177);
                if (constraintLayoutT != null) {
                    int i2 = 2131428162;
                    CalendarIconView calendarIconViewT = m5n1.t(constraintLayoutT, 2131428162);
                    if (calendarIconViewT != null) {
                        i2 = 2131428173;
                        EncoreAddToButtonView encoreAddToButtonViewT = m5n1.t(constraintLayoutT, 2131428173);
                        if (encoreAddToButtonViewT != null) {
                            i2 = 2131428174;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutT, 2131428174);
                            if (textView2 != null) {
                                i2 = 2131428175;
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutT, 2131428175);
                                if (textView3 != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutT;
                                    i2 = 2131429056;
                                    if (m5n1.t(constraintLayoutT, 2131429056) != null) {
                                        k9k k9kVar = new k9k(constraintLayout, calendarIconViewT, encoreAddToButtonViewT, textView2, textView3, constraintLayout);
                                        int i3 = 2131428924;
                                        EncoreFollowButton encoreFollowButtonT = m5n1.t(constraintLayoutInflate, 2131428924);
                                        if (encoreFollowButtonT != null) {
                                            i3 = 2131429054;
                                            if (m5n1.t(constraintLayoutInflate, 2131429054) != null) {
                                                ConstraintLayout constraintLayout2 = constraintLayoutInflate;
                                                i3 = 2131431115;
                                                TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                                if (textView4 != null) {
                                                    i3 = 2131431356;
                                                    TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                    if (textView5 != null) {
                                                        i3 = 2131431572;
                                                        ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431572);
                                                        if (imageView != null) {
                                                            ip31 ip31Var = new ip31(constraintLayout2, textView, view, k9kVar, encoreFollowButtonT, textView4, textView5, imageView, (byte) 4);
                                                            constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                            view.setViewContext(new f47(gw70Var));
                                                            v9w0 v9w0VarQ = b2u.q(constraintLayout2);
                                                            Collections.addAll(v9w0VarQ.c, textView5, textView4);
                                                            Collections.addAll(v9w0VarQ.d, view);
                                                            v9w0VarQ.e = false;
                                                            v9w0VarQ.a();
                                                            v9w0 v9w0VarQ2 = b2u.q(constraintLayout);
                                                            Collections.addAll(v9w0VarQ2.c, textView3, textView2);
                                                            v9w0VarQ2.e = false;
                                                            v9w0VarQ2.a();
                                                            this.e = ip31Var;
                                                            this.f = textView5.getLayoutParams().B;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = i3;
                                    }
                                }
                            }
                        }
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i2)));
                    throw null;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        wl6 wl6Var = (wl6) obj;
        tl6 tl6Var = wl6Var.t;
        boolean z = wl6Var.i;
        ip31 ip31Var = this.e;
        TextView textView = (TextView) ip31Var.h;
        k9k k9kVar = (k9k) ip31Var.e;
        EncoreFollowButton encoreFollowButton = (EncoreFollowButton) ip31Var.f;
        ArtworkView artworkView = (ArtworkView) ip31Var.d;
        TextView textView2 = (TextView) ip31Var.c;
        ImageView imageView = (ImageView) ip31Var.i;
        textView.setText(wl6Var.a);
        TextView textView3 = (TextView) ip31Var.g;
        String str = wl6Var.b;
        textView3.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (str != null && str.length() != 0) {
            textView3.setText(str);
        }
        boolean z2 = (wl6Var.e && this.c) || (wl6Var.f && this.d);
        cwl1.c0(imageView, wl6Var.d && !z2, this.b);
        cwl1.b0(textView2, z2, textView, this.f);
        artworkView.h(new l07(new g07(z ? null : wl6Var.c, xz6.d), false));
        encoreFollowButton.g(new g330(wl6Var.h ? 1 : 2, false, 10));
        boolean z3 = !z;
        boolean z4 = wl6Var.g;
        textView.setEnabled(z3);
        textView3.setEnabled(z3);
        artworkView.setEnabled(z3);
        imageView.setEnabled(z3);
        textView2.setEnabled(z3);
        encoreFollowButton.setEnabled(!z && z4);
        ((ConstraintLayout) k9kVar.f).setVisibility(tl6Var != null ? 0 : 8);
        if (tl6Var != null) {
            List listM = p7h.M(new String[]{this.a.getString(2131961488), tl6Var.c});
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
            ((TextView) k9kVar.e).setText(tl6Var.b);
            ((TextView) k9kVar.d).setText(strY0);
            ((CalendarIconView) k9kVar.b).c(new xwc(120, (Integer) null, (Integer) null, tl6Var.d, tl6Var.e, false));
            ((EncoreAddToButtonView) k9kVar.c).g(new pk1(tl6Var.f ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30));
        }
    }

    public final View getView() {
        return (ConstraintLayout) this.e.b;
    }

    public final void n(iu30 iu30Var) {
        ip31 ip31Var = this.e;
        ((ConstraintLayout) ip31Var.b).setOnClickListener(new yer(iu30Var, (byte) 3));
        ((EncoreFollowButton) ip31Var.f).n(new m0o(iu30Var, (byte) 9));
        k9k k9kVar = (k9k) ip31Var.e;
        ((ConstraintLayout) k9kVar.f).setOnClickListener(new yer(iu30Var, (byte) 4));
        ((EncoreAddToButtonView) k9kVar.c).n(new m0o(iu30Var, (byte) 10));
    }
}
