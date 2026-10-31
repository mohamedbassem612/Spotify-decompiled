package p;

import android.animation.LayoutTransition;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zpr implements qzh {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public zpr(Context context, gw70 gw70Var, x800 x800Var, int i) {
        boolean z = (i & 4) == 0;
        x800Var = (i & 8) != 0 ? uwg.f1 : x800Var;
        this.c = context;
        this.b = z;
        this.d = x800Var;
        vb00 vb00Var = vb00.b;
        this.e = r4u.c(new r4u[]{r4u.d(new cua((byte) 10), r4u.a(new wb00(this, (byte) 0))), r4u.a(new ogr(this, (byte) 29)), r4u.a(new ouz(this, (byte) 1)), r4u.a(new dqu(this, (byte) 12))});
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624613, (ViewGroup) null, false);
        int i2 = 2131427611;
        View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
        if (view != null) {
            i2 = 2131427877;
            CalendarIconView calendarIconViewT = m5n1.t(constraintLayoutInflate, 2131427877);
            if (calendarIconViewT != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                i2 = 2131429056;
                if (m5n1.t(constraintLayoutInflate, 2131429056) != null) {
                    i2 = 2131430735;
                    AddToButtonView addToButtonViewT = m5n1.t(constraintLayoutInflate, 2131430735);
                    if (addToButtonViewT != null) {
                        i2 = 2131431356;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView != null) {
                            i2 = 2131431569;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431569);
                            if (textView2 != null) {
                                g2z g2zVar = new g2z(constraintLayout, view, calendarIconViewT, addToButtonViewT, textView, textView2);
                                view.setViewContext(new f47(gw70Var));
                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                v9w0 v9w0VarP = b2u.p(constraintLayout);
                                Collections.addAll(v9w0VarP.c, textView);
                                Collections.addAll(v9w0VarP.d, view);
                                v9w0VarP.a();
                                this.f = g2zVar;
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void f(Object obj) {
        byte b = this.a;
        boolean z = true;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                pbm pbmVar = (pbm) obj;
                TextView textView = (TextView) obj2;
                TextView textView2 = (TextView) obj3;
                LinearLayout linearLayout = (LinearLayout) this.c;
                TextView textView3 = (TextView) this.d;
                String str = pbmVar.a;
                boolean z2 = pbmVar.e;
                String str2 = pbmVar.b;
                String str3 = pbmVar.d;
                boolean z3 = str3 == null || ihc1.y0(str3);
                if (!z2 && !this.b) {
                    z = false;
                }
                if (z) {
                    linearLayout.setLayoutTransition(null);
                }
                textView3.setText(str);
                textView2.setText(str2 == null ? "" : str2);
                if (str3 == null) {
                    str3 = "";
                }
                textView.setText(str3);
                textView3.setVisibility((!z3 || str.length() == 0) ? 8 : 0);
                textView3.setEllipsize((str2 == null || ihc1.y0(str2)) ? TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END);
                textView2.setVisibility((str2 == null || ihc1.y0(str2)) ? 8 : 0);
                textView.setVisibility(z3 ? 8 : 0);
                if (z) {
                    linearLayout.setLayoutTransition((LayoutTransition) this.g);
                }
                this.b = z2;
                break;
            default:
                z800 z800Var = (z800) obj;
                this.g = z800Var;
                ((r4u) obj3).e(z800Var);
                ((ArtworkView) ((g2z) obj2).b).h(new x07(new g07(z800Var.h, new zz6(4.0f)), true));
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (LinearLayout) this.c;
            default:
                return (ConstraintLayout) ((g2z) this.f).a;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((LinearLayout) obj).setOnClickListener(new yer(iu30Var, (byte) 27));
                break;
            default:
                g2z g2zVar = (g2z) this.f;
                ((ConstraintLayout) g2zVar.a).setOnClickListener(new vhs(iu30Var, (byte) 1));
                b8k1.m((ConstraintLayout) g2zVar.a, fg.g, ((Context) obj).getString(2131959399), (sh) null);
                ((AddToButtonView) g2zVar.d).n(new v2y(iu30Var, (byte) 17));
                break;
        }
    }

    public zpr(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(2131624470, (ViewGroup) null);
        this.c = linearLayout;
        this.g = linearLayout.getLayoutTransition();
        b8k1.p(linearLayout, new zdc((byte) 11));
        View viewFindViewById = linearLayout.findViewById(2131428233);
        ((TextView) viewFindViewById).setSelected(true);
        this.d = (TextView) viewFindViewById;
        this.e = (TextView) linearLayout.findViewById(2131428232);
        this.f = (TextView) linearLayout.findViewById(2131428231);
    }
}
