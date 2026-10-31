package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mfs implements qzh {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final Object c;
    public Object d;

    public mfs(Context context, gw70 gw70Var, boolean z) {
        this.b = z;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625410, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131430403;
                PlayIndicatorComposeView playIndicatorComposeView = (PlayIndicatorComposeView) m5n1.t(constraintLayoutInflate, 2131430403);
                if (playIndicatorComposeView != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    i = 2131431115;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                    if (textView != null) {
                        i = 2131431117;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431117);
                        if (textView2 != null) {
                            i = 2131431356;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView3 != null) {
                                mzr0 mzr0Var = new mzr0(constraintLayout, actionBarComplexRowSearchView, view, playIndicatorComposeView, textView, textView2, textView3);
                                view.setViewContext(new f47(gw70Var));
                                v9w0 v9w0VarP = b2u.p(constraintLayout);
                                Collections.addAll(v9w0VarP.c, textView3, textView);
                                Collections.addAll(v9w0VarP.d, view);
                                v9w0VarP.a();
                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                this.c = mzr0Var;
                                this.d = textView.getTextColors();
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, com.spotify.search.uiusecases.PlayIndicatorComposeView] */
    public final void f(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                khu0 khu0Var = (khu0) obj;
                mzr0 mzr0Var = (mzr0) obj2;
                ?? r4 = (PlayIndicatorComposeView) mzr0Var.d;
                String str = khu0Var.a;
                int i = khu0Var.g;
                boolean z = i != 3;
                TextView textView = (TextView) mzr0Var.e;
                TextView textView2 = (TextView) mzr0Var.f;
                TextView textView3 = (TextView) mzr0Var.g;
                r4.setVisibility(z ? 0 : 8);
                r4.z(mno1.A(i));
                textView3.setText(str);
                textView3.setActivated(i != 3);
                textView2.setText(khu0Var.b);
                boolean z2 = khu0Var.i;
                ColorStateList colorStateList = (ColorStateList) this.d;
                if (z2) {
                    textView2.setTextColor(xfo1.r(textView2, 2130968788));
                } else {
                    textView2.setTextColor(colorStateList);
                }
                String strY0 = o7h.y0(khu0Var.h, ", ", (String) null, (String) null, (iu30) null, 62);
                textView.setVisibility(strY0.length() > 0 ? 0 : 8);
                textView.setText(strY0);
                ((ArtworkView) mzr0Var.c).h(new y07(new g07(khu0Var.c, yz6.d), false));
                ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) mzr0Var.b;
                z10 z10Var = null;
                y10 y10Var = khu0Var.e ? new y10(khu0Var.d) : null;
                if (this.b && khu0Var.f) {
                    z10Var = new z10(3);
                }
                actionBarComplexRowSearchView.f(new b20(str, y10Var, z10Var != null ? z10Var.a : 0));
                break;
            default:
                vsv0 vsv0Var = (vsv0) obj;
                this.d = vsv0Var;
                phi0 phi0Var = (phi0) obj2;
                TextSwitcher textSwitcher = (TextSwitcher) phi0Var.f;
                textSwitcher.setCurrentText(vsv0Var.a);
                Context context = textSwitcher.getContext();
                textSwitcher.setOutAnimation(AnimationUtils.loadAnimation(context, 2130772062));
                textSwitcher.setInAnimation(AnimationUtils.loadAnimation(context, 2130772061));
                RecyclerView recyclerView = (RecyclerView) phi0Var.c;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAdapter(vsv0Var.c);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (ConstraintLayout) ((mzr0) obj).a;
            default:
                return (ConstraintLayout) ((phi0) obj).d;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                mzr0 mzr0Var = (mzr0) obj;
                ((ConstraintLayout) mzr0Var.a).setOnClickListener(new oes(iu30Var, (byte) 5));
                ((ActionBarComplexRowSearchView) mzr0Var.b).n(new mwr(iu30Var, (byte) 23));
                break;
            default:
                ((ConstraintLayout) ((phi0) obj).e).setOnClickListener(new cvr(this, iu30Var, (byte) 10));
                break;
        }
    }

    public mfs(Context context) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625437, (ViewGroup) null, false);
        int i = 2131427974;
        ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131427974);
        if (imageView != null) {
            i = 2131428535;
            if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131428535)) != null) {
                i = 2131429044;
                RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131429044);
                if (recyclerViewT != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    i = 2131430871;
                    ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131430871);
                    if (constraintLayoutT != null) {
                        i = 2131430890;
                        if (((TextView) m5n1.t(constraintLayoutInflate, 2131430890)) != null) {
                            i = 2131430891;
                            if (((TextView) m5n1.t(constraintLayoutInflate, 2131430891)) != null) {
                                i = 2131430892;
                                TextSwitcher textSwitcher = (TextSwitcher) m5n1.t(constraintLayoutInflate, 2131430892);
                                if (textSwitcher != null) {
                                    phi0 phi0Var = new phi0(constraintLayout, imageView, recyclerViewT, constraintLayout, constraintLayoutT, textSwitcher, (byte) 20);
                                    constraintLayout.setLayoutParams(new qhl(-1, -2));
                                    this.c = phi0Var;
                                    this.d = new vsv0("", "", (z511) null);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }
}
