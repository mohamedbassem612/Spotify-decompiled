package p;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rhr implements qzh {
    public final /* synthetic */ byte a = 2;
    public final boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public rhr(Context context, gw70 gw70Var, ai4 ai4Var, boolean z) {
        this.c = ai4Var;
        this.b = z;
        this.d = new oq51(context);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626131, (ViewGroup) null, false);
        int i = 2131427611;
        View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
        if (view != null) {
            i = 2131427741;
            if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                i = 2131429973;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429973);
                if (textView != null) {
                    i = 2131430674;
                    if (((ContentRestrictionBadgeView) m5n1.t(constraintLayoutInflate, 2131430674)) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131431115;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView2 != null) {
                            i = 2131431356;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView3 != null) {
                                i = 2131431572;
                                ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431572);
                                if (imageView != null) {
                                    wmy wmyVar = new wmy(constraintLayout, view, textView, textView2, textView3, imageView);
                                    view.setViewContext(new f47(gw70Var));
                                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                    ArrayList arrayList = v9w0VarQ.c;
                                    Collections.addAll(arrayList, textView3);
                                    Collections.addAll(arrayList, textView2);
                                    Collections.addAll(arrayList, textView);
                                    Collections.addAll(v9w0VarQ.d, view);
                                    v9w0VarQ.e = false;
                                    v9w0VarQ.a();
                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    this.e = wmyVar;
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

    public final void f(Object obj) {
        byte b = this.a;
        yz6 yz6Var = yz6.d;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        int i = 0;
        switch (b) {
            case 0:
                jc8 jc8Var = (jc8) obj;
                String str = jc8Var.a;
                boolean z2 = jc8Var.e;
                toj0 toj0Var = (toj0) this.e;
                TextView textView = (TextView) toj0Var.g;
                ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) toj0Var.c;
                List list = jc8Var.f;
                textView.setText(!list.isEmpty() ? ((oq51) obj2).a(list, true, (ai4) obj3) : str);
                ((TextView) toj0Var.f).setText(jc8Var.b);
                ArtworkView artworkView = (ArtworkView) toj0Var.d;
                String str2 = jc8Var.c;
                y10 y10Var = null;
                if (z2) {
                    str2 = null;
                }
                artworkView.h(new o07(new g07(str2, yz6Var)));
                if (z && !jc8Var.h) {
                    y10Var = new y10(jc8Var.g);
                }
                actionBarComplexRowSearchView.z(new b20(str, y10Var, 0));
                ((ContentRestrictionBadgeView) toj0Var.e).f(jc8Var.d);
                boolean z3 = !z2;
                ConstraintLayout constraintLayout = (ConstraintLayout) toj0Var.b;
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
                actionBarComplexRowSearchView.setEnabled(z3);
                while (i < actionBarComplexRowSearchView.getChildCount()) {
                    int i4 = i + 1;
                    View childAt2 = actionBarComplexRowSearchView.getChildAt(i);
                    if (childAt2 == null) {
                        tw20.p();
                    } else {
                        childAt2.setEnabled(z3);
                        i = i4;
                    }
                    break;
                }
                break;
            case 1:
                e1w e1wVar = (e1w) obj;
                j4b1 j4b1Var = e1wVar.d;
                yzu yzuVar = (yzu) obj3;
                ((TextView) yzuVar.d).setText(e1wVar.a);
                EditText editText = (EditText) yzuVar.c;
                String string = editText.getText().toString();
                String str3 = e1wVar.b;
                if (!u890.j(string, str3)) {
                    editText.setText(str3);
                }
                editText.setHint(e1wVar.c);
                AppCompatImageButton appCompatImageButton = (StateListAnimatorImageButton) yzuVar.b;
                if (j4b1Var == null) {
                    appCompatImageButton.setVisibility(4);
                } else {
                    appCompatImageButton.setImageDrawable(azo1.q(2131101354, appCompatImageButton.getContext(), j4b1Var));
                    appCompatImageButton.setContentDescription(e1wVar.e);
                    if (!z) {
                        appCompatImageButton.setVisibility(0);
                    }
                }
                break;
            default:
                fa81 fa81Var = (fa81) obj;
                String str4 = fa81Var.c;
                wmy wmyVar = (wmy) this.e;
                TextView textView2 = (TextView) wmyVar.e;
                TextView textView3 = (TextView) wmyVar.c;
                List list2 = fa81Var.e;
                textView2.setText(!list2.isEmpty() ? ((oq51) obj2).a(list2, true, (ai4) obj3) : fa81Var.a);
                textView2.setMaxLines(1);
                ((TextView) wmyVar.d).setText(fa81Var.b);
                textView3.setText(str4);
                textView3.setVisibility(str4.length() <= 0 ? 8 : 0);
                ((ArtworkView) wmyVar.b).h(new e17(new g07(fa81Var.d, yz6Var)));
                cwl1.c0((ImageView) wmyVar.f, fa81Var.f, z);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                return (ConstraintLayout) ((toj0) this.e).b;
            case 1:
                return (ConstraintLayout) this.d;
            default:
                return (ConstraintLayout) ((wmy) this.e).a;
        }
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                toj0 toj0Var = (toj0) this.e;
                ((ConstraintLayout) toj0Var.b).setOnClickListener(new yer(iu30Var, (byte) 13));
                ((ActionBarComplexRowSearchView) toj0Var.c).n(new m0o(iu30Var, (byte) 14));
                break;
            case 1:
                yzu yzuVar = (yzu) this.c;
                ((StateListAnimatorImageButton) yzuVar.b).setOnClickListener(new cvr(this, iu30Var, (byte) 1));
                EditText editText = (EditText) yzuVar.c;
                editText.setOnClickListener(new trr(iu30Var, (byte) 4));
                if (!editText.isFocusable()) {
                    ((ConstraintLayout) yzuVar.a).setOnClickListener(new trr(iu30Var, (byte) 5));
                    editText.setOnTouchListener(kgh.c);
                }
                this.e = iu30Var;
                break;
            default:
                ((ConstraintLayout) ((wmy) this.e).a).setOnClickListener(new sis(iu30Var, (byte) 20));
                break;
        }
    }

    public rhr(Context context, gw70 gw70Var, boolean z, ai4 ai4Var) {
        this.b = z;
        this.c = ai4Var;
        this.d = new oq51(context);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624071, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchViewT = m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchViewT != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131427741;
                if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                    i = 2131430674;
                    ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) m5n1.t(constraintLayoutInflate, 2131430674);
                    if (contentRestrictionBadgeView != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131431115;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView != null) {
                            i = 2131431356;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView2 != null) {
                                toj0 toj0Var = new toj0(constraintLayout, actionBarComplexRowSearchViewT, view, contentRestrictionBadgeView, textView, textView2, (byte) 5);
                                view.setViewContext(new f47(gw70Var));
                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                ArrayList arrayList = v9w0VarQ.c;
                                Collections.addAll(arrayList, textView2);
                                Collections.addAll(arrayList, textView);
                                Collections.addAll(v9w0VarQ.d, view);
                                v9w0VarQ.a();
                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                this.e = toj0Var;
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

    public rhr(Context context, z0w z0wVar) {
        int i;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624556, (ViewGroup) null, false);
        int i2 = 2131427415;
        StateListAnimatorImageButton stateListAnimatorImageButton = (StateListAnimatorImageButton) m5n1.t(constraintLayoutInflate, 2131427415);
        if (stateListAnimatorImageButton != null) {
            i2 = 2131428579;
            EditText editText = (EditText) m5n1.t(constraintLayoutInflate, 2131428579);
            if (editText != null) {
                i2 = 2131428580;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428580);
                if (textView != null) {
                    i2 = 2131429717;
                    if (m5n1.t(constraintLayoutInflate, 2131429717) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        yzu yzuVar = new yzu(constraintLayout, stateListAnimatorImageButton, editText, textView);
                        eqq.t(-1, -2, constraintLayout);
                        String str = z0wVar.e;
                        if (str != null) {
                            editText.setTag(str);
                        }
                        boolean z = z0wVar instanceof z0w;
                        if (z) {
                            editText.setSelectAllOnFocus(true);
                            if (z) {
                                boolean z2 = z0wVar.c;
                                if (z2) {
                                    i = 1;
                                } else {
                                    if (z2) {
                                        eg.o();
                                        throw null;
                                    }
                                    i = 524289;
                                }
                                editText.setInputType(i);
                                editText.setFilters((InputFilter[]) z0wVar.a.toArray(new InputFilter[0]));
                                boolean z3 = z0wVar.b;
                                this.b = z3;
                                editText.addTextChangedListener(new p96(new y0o(this, yzuVar, (byte) 18), (byte) 5));
                                if (z3) {
                                    editText.setOnFocusChangeListener(new x29(this, yzuVar));
                                }
                                if (!z0wVar.d) {
                                    editText.setFocusable(false);
                                    editText.setMaxLines(1);
                                    editText.setEllipsize(TextUtils.TruncateAt.END);
                                }
                                this.c = yzuVar;
                                this.d = constraintLayout;
                                return;
                            }
                            eg.o();
                            throw null;
                        }
                        eg.o();
                        throw null;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        throw null;
    }
}
