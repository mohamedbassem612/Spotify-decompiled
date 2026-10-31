package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.follow.FollowButtonView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zgr implements qzh {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Code duplicated, block: B:25:0x00db A[PHI: r3
      0x00db: PHI (r3v15 int) = (r3v14 int), (r3v19 int), (r3v20 int), (r3v21 int), (r3v22 int) binds: [B:5:0x003b, B:11:0x005a, B:13:0x0067, B:15:0x0074, B:17:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x018d A[PHI: r3
      0x018d: PHI (r3v6 int) = (r3v5 int), (r3v7 int) binds: [B:35:0x011d, B:37:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    public zgr(Context context, gw70 gw70Var, boolean z, byte b) {
        this.a = b;
        int i = 2131431356;
        switch (b) {
            case 1:
                this.b = z;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626130, (ViewGroup) null, false);
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                if (view == null) {
                    i = 2131427611;
                } else if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                    int i2 = 2131427938;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427938);
                    if (textView != null) {
                        i2 = 2131428924;
                        FollowButtonView followButtonViewT = m5n1.t(constraintLayoutInflate, 2131428924);
                        if (followButtonViewT != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                            if (textView2 != null) {
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                if (textView3 != null) {
                                    i = 2131431572;
                                    ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431572);
                                    if (imageView != null) {
                                        mzr0 mzr0Var = new mzr0(constraintLayout, view, textView, followButtonViewT, textView2, textView3, imageView);
                                        view.setViewContext(new f47(gw70Var));
                                        v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                        Collections.addAll(v9w0VarQ.c, textView3, textView2, textView);
                                        Collections.addAll(v9w0VarQ.d, view);
                                        v9w0VarQ.e = false;
                                        v9w0VarQ.a();
                                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                        this.c = mzr0Var;
                                        return;
                                    }
                                }
                            } else {
                                i = 2131431115;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = 2131427741;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            default:
                this.b = z;
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131624070, (ViewGroup) null, false);
                int i3 = 2131427445;
                ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate2, 2131427445);
                if (actionBarComplexRowSearchView == null) {
                    i = i3;
                } else {
                    View view2 = (ArtworkView) m5n1.t(constraintLayoutInflate2, 2131427611);
                    if (view2 == null) {
                        i = 2131427611;
                    } else if (m5n1.t(constraintLayoutInflate2, 2131427741) != null) {
                        i3 = 2131428438;
                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate2, 2131428438);
                        if (textView4 != null) {
                            i3 = 2131429846;
                            LockedBadgeView lockedBadgeViewT = m5n1.t(constraintLayoutInflate2, 2131429846);
                            if (lockedBadgeViewT != null) {
                                i3 = 2131430474;
                                TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate2, 2131430474);
                                if (textView5 != null) {
                                    i3 = 2131430674;
                                    ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate2, 2131430674);
                                    if (contentRestrictionBadgeViewT != null) {
                                        ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                                        TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                                        if (textView6 != null) {
                                            TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                                            if (textView7 != null) {
                                                c21 c21Var = new c21(constraintLayout2, actionBarComplexRowSearchView, view2, textView4, lockedBadgeViewT, textView5, contentRestrictionBadgeViewT, textView6, textView7, (byte) 3);
                                                view2.setViewContext(new f47(gw70Var));
                                                v9w0 v9w0VarQ2 = b2u.q(constraintLayout2);
                                                ArrayList arrayList = v9w0VarQ2.c;
                                                Collections.addAll(arrayList, textView7);
                                                Collections.addAll(arrayList, textView6);
                                                Collections.addAll(v9w0VarQ2.d, view2);
                                                v9w0VarQ2.a();
                                                constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                this.c = c21Var;
                                                return;
                                            }
                                        } else {
                                            i = 2131431115;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                } else {
                                    i = i3;
                                }
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = 2131427741;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    public final void f(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        yz6 yz6Var = yz6.d;
        Object obj2 = this.c;
        int i = 0;
        switch (b) {
            case 0:
                d88 d88Var = (d88) obj;
                CharSequence charSequence = d88Var.c;
                String str = d88Var.g;
                c21 c21Var = (c21) obj2;
                TextView textView = (TextView) c21Var.t;
                TextView textView2 = (TextView) c21Var.g;
                ?? r12 = (ActionBarComplexRowSearchView) c21Var.c;
                TextView textView3 = (TextView) c21Var.e;
                String str2 = d88Var.a;
                textView.setText(str2);
                ((TextView) c21Var.i).setText(d88Var.b);
                ArtworkView artworkView = (ArtworkView) c21Var.d;
                String str3 = d88Var.e;
                boolean z2 = d88Var.i;
                if (z2) {
                    str3 = null;
                }
                artworkView.h(new o07(new g07(str3, yz6Var)));
                y10 y10Var = !d88Var.X ? new y10(d88Var.t) : null;
                z10 z10Var = z ? new z10(2) : null;
                r12.f(new b20(str2, y10Var, z10Var != null ? z10Var.a : 0));
                ((ContentRestrictionBadgeView) c21Var.h).c(d88Var.f);
                ((LockedBadgeView) c21Var.f).c(d88Var.h);
                textView2.setVisibility((str == null || str.length() == 0) ? 8 : 0);
                textView2.setText(str);
                textView3.setText(charSequence);
                textView3.setContentDescription(d88Var.d);
                textView3.setVisibility(charSequence.length() > 0 ? 0 : 8);
                textView3.setMaxLines(3);
                boolean z3 = !z2;
                ConstraintLayout constraintLayout = (ConstraintLayout) c21Var.b;
                int i2 = 0;
                while (i2 < constraintLayout.getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = constraintLayout.getChildAt(i2);
                    if (childAt == null) {
                        tw20.p();
                    } else {
                        childAt.setEnabled(z3);
                        i2 = i3;
                    }
                    break;
                }
                r12.setEnabled(z3);
                while (i < r12.getChildCount()) {
                    int i4 = i + 1;
                    View childAt2 = r12.getChildAt(i);
                    if (childAt2 == null) {
                        tw20.p();
                    } else {
                        childAt2.setEnabled(z3);
                        i = i4;
                    }
                    break;
                }
                break;
            default:
                j381 j381Var = (j381) obj;
                mzr0 mzr0Var = (mzr0) obj2;
                TextView textView4 = (TextView) mzr0Var.e;
                FollowButtonView followButtonView = (FollowButtonView) mzr0Var.d;
                textView4.setText(j381Var.a);
                ((TextView) mzr0Var.f).setText(j381Var.b);
                TextView textView5 = (TextView) mzr0Var.c;
                String str4 = j381Var.c;
                textView5.setText(str4);
                textView5.setVisibility(str4.length() > 0 ? 0 : 8);
                ((ArtworkView) mzr0Var.b).h(new e17(new g07(j381Var.d, yz6Var)));
                followButtonView.setEnabled(j381Var.e);
                followButtonView.j(new g330(j381Var.f ? 1 : 2, false, 10));
                cwl1.c0((ImageView) mzr0Var.g, j381Var.g, z);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (ConstraintLayout) ((c21) obj).b;
            default:
                return (ConstraintLayout) ((mzr0) obj).a;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                c21 c21Var = (c21) obj;
                ((ConstraintLayout) c21Var.b).setOnClickListener(new yer(iu30Var, (byte) 12));
                ((ActionBarComplexRowSearchView) c21Var.c).n(new m0o(iu30Var, (byte) 13));
                break;
            default:
                mzr0 mzr0Var = (mzr0) obj;
                ((ConstraintLayout) mzr0Var.a).setOnClickListener(new sis(iu30Var, (byte) 17));
                ((FollowButtonView) mzr0Var.d).n(new shs(iu30Var, (byte) 5));
                break;
        }
    }
}
