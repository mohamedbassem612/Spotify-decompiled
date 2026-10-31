package p;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.follow.EncoreFollowButton;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.encoreconsumermobile.elements.settings.SettingsButton;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconHidden;
import com.spotify.encoremobile.component.icons.IconVerifiedCheck;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.profile.uiusecases.elements.profiletitletextview.DefaultProfileTitleTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vis implements qzh {
    public final af10 a;
    public final h72 b;
    public final z7x0 c;
    public final Resources d;
    public boolean e;
    public iu30 f;

    /* JADX WARN: Type inference failed for: r35v1, types: [android.view.View, com.spotify.profile.uiusecases.elements.profiletitletextview.DefaultProfileTitleTextView] */
    public vis(Context context, af10 af10Var) {
        this.a = af10Var;
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        h360.h(h72VarG);
        this.b = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131625461);
        int i = 2131428234;
        ContextMenuButton contextMenuButton = (ContextMenuButton) m5n1.t(constraintLayoutF, 2131428234);
        if (contextMenuButton != null) {
            i = 2131428551;
            EncoreButton encoreButtonT = m5n1.t(constraintLayoutF, 2131428551);
            if (encoreButtonT != null) {
                i = 2131428587;
                TextView textView = (TextView) m5n1.t(constraintLayoutF, 2131428587);
                if (textView != null) {
                    i = 2131428924;
                    EncoreFollowButton encoreFollowButton = (EncoreFollowButton) m5n1.t(constraintLayoutF, 2131428924);
                    if (encoreFollowButton != null) {
                        i = 2131428927;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutF, 2131428927);
                        if (textView2 != null) {
                            i = 2131428928;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutF, 2131428928);
                            if (textView3 != null) {
                                i = 2131428929;
                                TextView textView4 = (TextView) m5n1.t(constraintLayoutF, 2131428929);
                                if (textView4 != null) {
                                    i = 2131428931;
                                    Flow flowT = m5n1.t(constraintLayoutF, 2131428931);
                                    if (flowT != null) {
                                        i = 2131429665;
                                        EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutF, 2131429665);
                                        if (encoreButtonT2 != null) {
                                            i = 2131429965;
                                            EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutF, 2131429965);
                                            if (encoreButtonT3 != null) {
                                                i = 2131430502;
                                                SettingsButton settingsButton = (SettingsButton) m5n1.t(constraintLayoutF, 2131430502);
                                                if (settingsButton != null) {
                                                    i = 2131430503;
                                                    ImageView imageView = (ImageView) m5n1.t(constraintLayoutF, 2131430503);
                                                    if (imageView != null) {
                                                        i = 2131430504;
                                                        Flow flowT2 = m5n1.t(constraintLayoutF, 2131430504);
                                                        if (flowT2 != null) {
                                                            i = 2131430505;
                                                            if (((IconHidden) m5n1.t(constraintLayoutF, 2131430505)) != null) {
                                                                i = 2131430506;
                                                                if (((TextView) m5n1.t(constraintLayoutF, 2131430506)) != null) {
                                                                    i = 2131430510;
                                                                    AppCompatTextView appCompatTextViewT = m5n1.t(constraintLayoutF, 2131430510);
                                                                    if (appCompatTextViewT != null) {
                                                                        i = 2131430511;
                                                                        if (m5n1.t(constraintLayoutF, 2131430511) != null) {
                                                                            i = 2131430512;
                                                                            SeeMoreTextView seeMoreTextView = (SeeMoreTextView) m5n1.t(constraintLayoutF, 2131430512);
                                                                            if (seeMoreTextView != null) {
                                                                                i = 2131430513;
                                                                                AppCompatTextView appCompatTextViewT2 = m5n1.t(constraintLayoutF, 2131430513);
                                                                                if (appCompatTextViewT2 != null) {
                                                                                    i = 2131430514;
                                                                                    AppCompatTextView appCompatTextViewT3 = m5n1.t(constraintLayoutF, 2131430514);
                                                                                    if (appCompatTextViewT3 != null) {
                                                                                        i = 2131430515;
                                                                                        Flow flowT3 = m5n1.t(constraintLayoutF, 2131430515);
                                                                                        if (flowT3 != null) {
                                                                                            i = 2131430516;
                                                                                            AppCompatTextView appCompatTextViewT4 = m5n1.t(constraintLayoutF, 2131430516);
                                                                                            if (appCompatTextViewT4 != null) {
                                                                                                i = 2131430517;
                                                                                                AppCompatTextView appCompatTextViewT5 = m5n1.t(constraintLayoutF, 2131430517);
                                                                                                if (appCompatTextViewT5 != null) {
                                                                                                    i = 2131430518;
                                                                                                    AppCompatTextView appCompatTextViewT6 = m5n1.t(constraintLayoutF, 2131430518);
                                                                                                    if (appCompatTextViewT6 != null) {
                                                                                                        i = 2131430519;
                                                                                                        View viewT = m5n1.t(constraintLayoutF, 2131430519);
                                                                                                        if (viewT != null) {
                                                                                                            i = 2131430520;
                                                                                                            View viewT2 = m5n1.t(constraintLayoutF, 2131430520);
                                                                                                            if (viewT2 != null) {
                                                                                                                i = 2131430521;
                                                                                                                FaceView faceView = (FaceView) m5n1.t(constraintLayoutF, 2131430521);
                                                                                                                if (faceView != null) {
                                                                                                                    i = 2131430522;
                                                                                                                    if (((Space) m5n1.t(constraintLayoutF, 2131430522)) != null) {
                                                                                                                        i = 2131430524;
                                                                                                                        ?? r35 = (DefaultProfileTitleTextView) m5n1.t(constraintLayoutF, 2131430524);
                                                                                                                        if (r35 != 0) {
                                                                                                                            i = 2131430525;
                                                                                                                            if (m5n1.t(constraintLayoutF, 2131430525) != null) {
                                                                                                                                i = 2131430526;
                                                                                                                                Barrier barrierT = m5n1.t(constraintLayoutF, 2131430526);
                                                                                                                                if (barrierT != null) {
                                                                                                                                    i = 2131430527;
                                                                                                                                    if (m5n1.t(constraintLayoutF, 2131430527) != null) {
                                                                                                                                        ConstraintLayout constraintLayout = constraintLayoutF;
                                                                                                                                        i = 2131431573;
                                                                                                                                        IconVerifiedCheck iconVerifiedCheck = (IconVerifiedCheck) m5n1.t(constraintLayoutF, 2131431573);
                                                                                                                                        if (iconVerifiedCheck != null) {
                                                                                                                                            this.c = new z7x0(constraintLayout, contextMenuButton, encoreButtonT, textView, encoreFollowButton, textView2, textView3, textView4, flowT, encoreButtonT2, encoreButtonT3, settingsButton, imageView, flowT2, appCompatTextViewT, seeMoreTextView, appCompatTextViewT2, appCompatTextViewT3, flowT3, appCompatTextViewT4, appCompatTextViewT5, appCompatTextViewT6, viewT, viewT2, faceView, (DefaultProfileTitleTextView) r35, barrierT, constraintLayout, iconVerifiedCheck);
                                                                                                                                            this.d = context.getResources();
                                                                                                                                            this.f = c6s.c1;
                                                                                                                                            h360.i(h72VarG, new wsr(1, this, vis.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 9));
                                                                                                                                            h360.a(h72VarG, constraintLayout, barrierT);
                                                                                                                                            ((BehaviorRetainingAppBarLayout) h72VarG.b).a(new rzg(this, (byte) 8));
                                                                                                                                            b8k1.q((View) r35, true);
                                                                                                                                            textView4.addOnLayoutChangeListener(new x37(this, new uis(this, (byte) 0), (byte) 9));
                                                                                                                                            appCompatTextViewT4.addOnLayoutChangeListener(new x37(this, new uis(this, (byte) 1), (byte) 10));
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(wk51 wk51Var) {
        z7x0 z7x0Var = this.c;
        z7x0Var.o.f(wk51Var);
        z7x0Var.o.setVisibility(!ihc1.y0(wk51Var.a) ? 0 : 8);
    }

    public final SpannableString b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i)};
        Resources resources = this.d;
        String string = resources.getString(2131960499, objArr);
        SpannableString spannableString = new SpannableString(resources.getQuantityString(i2, i, Integer.valueOf(i)));
        int iW0 = ihc1.w0(spannableString, string, 0, false, 6);
        int length = string.length() + ihc1.w0(spannableString, string, 0, false, 6);
        spannableString.setSpan(new StyleSpan(1), iW0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(-1), iW0, length, 33);
        return spannableString;
    }

    public final void e(r7x0 r7x0Var) {
        z7x0 z7x0Var = this.c;
        TextView textView = z7x0Var.e;
        TextView textView2 = z7x0Var.f;
        TextView textView3 = z7x0Var.g;
        int i = 8;
        if ((r7x0Var == null || !r7x0Var.l) && textView3.getVisibility() != 8) {
            if (textView2.getTop() == textView3.getTop()) {
                i = 0;
            } else if (textView2.getTop() == z7x0Var.e.getTop()) {
                i = 4;
            }
        }
        textView.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, com.spotify.encoremobile.facepile.FaceView] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, android.widget.TextView, com.spotify.encoremobile.component.buttons.EncoreButton] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.view.View, com.spotify.encoreconsumermobile.elements.follow.EncoreFollowButton] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(Object obj) {
        sd10 sd10Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        r7x0 r7x0Var = (r7x0) obj;
        boolean z = r7x0Var.u;
        String str = r7x0Var.b;
        boolean z2 = r7x0Var.m;
        int i8 = r7x0Var.k;
        h72 h72Var = this.b;
        h360.j(h72Var, i8);
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72Var.b;
        boolean z3 = r7x0Var.l;
        z7x0 z7x0Var = this.c;
        if (z3) {
            z7x0Var.m.setVisibility(0);
        }
        ((TextView) h72Var.Y).setText(str);
        AppCompatTextView appCompatTextView = z7x0Var.y;
        ImageView imageView = z7x0Var.l;
        TextView textView = z7x0Var.g;
        AppCompatTextView appCompatTextView2 = z7x0Var.u;
        ?? r13 = z7x0Var.x;
        TextView textView2 = z7x0Var.f;
        appCompatTextView.setText(str);
        uaa uaaVar = z7x0Var.B;
        boolean z4 = r7x0Var.e;
        uaaVar.setIconActive(z4);
        uaaVar.setVisibility(z4 ? 0 : 8);
        z7x0Var.c.setVisibility(z ? 0 : 8);
        int i9 = z ? 2131428587 : 2131430524;
        qhl layoutParams = appCompatTextView2.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.j = i9;
        appCompatTextView2.setLayoutParams(qhlVar);
        if (z2 || r7x0Var.g) {
            if (z3) {
                Flow flow = z7x0Var.h;
                qhl layoutParams2 = flow.getLayoutParams();
                if (layoutParams2 == null) {
                    bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                qhl qhlVar2 = layoutParams2;
                qhlVar2.x = behaviorRetainingAppBarLayout.getContext().getResources().getDimensionPixelSize(2131167071);
                flow.setLayoutParams(qhlVar2);
                textView2.setVisibility(8);
            } else {
                textView2.setText(b(r7x0Var.i, 2131820861));
                textView2.setVisibility(0);
                imageView.setVisibility(0);
            }
            textView.setText(b(r7x0Var.j, 2131820862));
            e(r7x0Var);
            if (z2 == 0 || !r7x0Var.h || z3) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setImageDrawable(azo1.q(2131101506, behaviorRetainingAppBarLayout.getContext(), j4b1.q3));
            }
        } else {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            z7x0Var.m.setVisibility(8);
            e(null);
            z2 = z2;
        }
        AppCompatTextView appCompatTextView3 = z7x0Var.p;
        AppCompatTextView appCompatTextView4 = z7x0Var.t;
        Flow flow2 = z7x0Var.r;
        mmr0 mmr0Var = new mmr0(appCompatTextView3, (Object) null);
        AppCompatTextView appCompatTextView5 = z7x0Var.s;
        String str2 = r7x0Var.q;
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        Map mapJ = sqg0.J(new mmr0[]{mmr0Var, new mmr0(appCompatTextView5, str2)});
        if (mapJ.isEmpty()) {
            flow2.setVisibility(8);
        } else {
            Iterator it = mapJ.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    flow2.setVisibility(8);
                } else if (((Map.Entry) it.next()).getValue() != null) {
                    flow2.setVisibility(0);
                    for (Map.Entry entry : mapJ.entrySet()) {
                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) entry.getKey();
                        String str3 = (String) entry.getValue();
                        appCompatTextView6.setVisibility(str3 != null ? 0 : 8);
                        appCompatTextView6.setText(str3);
                    }
                }
            }
        }
        if (!z3) {
            String str4 = r7x0Var.o;
            appCompatTextView2.setVisibility((str4 == null || z || !r7x0Var.p) ? 8 : 0);
            appCompatTextView2.setText(str4);
        }
        if (!z3) {
            String str5 = r7x0Var.n;
            appCompatTextView4.setVisibility(str5 == null ? 8 : 0);
            appCompatTextView4.setText(str5);
        }
        String str6 = r7x0Var.r;
        int i10 = 2;
        Resources resources = this.d;
        if (!z3) {
            z7x0Var.n.setVisibility((str6 == null || str6.length() == 0) && z2 && r7x0Var.s && r7x0Var.t ? 0 : 8);
            wk51 model = z7x0Var.o.getModel();
            if (str6 == null) {
                str6 = "";
            }
            a(wk51.a(model, str6, null, l1d.m("… ", resources.getString(2131960447)), 2));
        }
        k();
        if (z2) {
            appCompatTextView.setOnClickListener(new tis(this, (byte) 0));
            r13.setOnClickListener(new tis(this, (byte) 1));
            sd10Var = null;
        } else {
            sd10Var = null;
            appCompatTextView.setOnClickListener(null);
            r13.setOnClickListener(null);
            appCompatTextView.setClickable(false);
            r13.setClickable(false);
        }
        r13.e(this.a, new td10(r7x0Var.c, r7x0Var.a, str, sd10Var));
        List list = r7x0Var.f;
        EncoreButton encoreButton = z7x0Var.b;
        ?? r3 = z7x0Var.i;
        List list2 = list;
        boolean z5 = list2 instanceof Collection;
        if (!z5 || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((p7x0) it2.next()) instanceof k7x0) {
                        i = 0;
                        break;
                    }
                } else {
                    i = 8;
                    break;
                }
            }
        } else {
            i = 8;
            break;
        }
        encoreButton.setVisibility(i);
        tlv tlvVar = z7x0Var.k;
        if (!z5 || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((p7x0) it3.next()) instanceof o7x0) {
                        i2 = 0;
                        break;
                    }
                } else {
                    i2 = 8;
                    break;
                }
            }
        } else {
            i2 = 8;
            break;
        }
        tlvVar.setVisibility(i2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof m7x0) {
                arrayList.add(obj2);
            }
        }
        m7x0 m7x0Var = (m7x0) o7h.s0(arrayList);
        r3.setVisibility(m7x0Var != null ? 0 : 8);
        if (m7x0Var != null) {
            int i11 = m7x0Var.a;
            r3.setEnabled(!(i11 == 2 || i11 == 4));
            int iC = l1d.C(i11);
            if (iC == 0) {
                i7 = 2131960533;
            } else if (iC == 1) {
                i7 = 2131960534;
            } else {
                if (iC != 2 && iC != 3) {
                    eg.o();
                    return;
                }
                i7 = 2131960441;
            }
            r3.setText(resources.getString(i7));
            int iC2 = l1d.C(i11);
            r3.setContentDescription(iC2 != 1 ? iC2 != 3 ? sd10Var : resources.getString(2131960440) : resources.getString(2131960535));
        }
        EncoreButton encoreButton2 = z7x0Var.j;
        if (!z5 || !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (((p7x0) it4.next()) instanceof n7x0) {
                        i3 = 0;
                        break;
                    }
                } else {
                    i3 = 8;
                    break;
                }
            }
        } else {
            i3 = 8;
            break;
        }
        encoreButton2.setVisibility(i3);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof l7x0) {
                arrayList2.add(obj3);
            }
        }
        l7x0 l7x0Var = (l7x0) o7h.s0(arrayList2);
        ?? r4 = z7x0Var.d;
        if (l7x0Var != null) {
            i5 = 0;
            r4.setVisibility(0);
            boolean z6 = l7x0Var.c;
            this.e = z6;
            if (l7x0Var.a) {
                i10 = 1;
            } else if (l7x0Var.b) {
                i10 = 3;
            }
            i4 = 8;
            r4.f(new g330(i10, z6, 8));
        } else {
            i4 = 8;
            i5 = 0;
            r4.setVisibility(8);
        }
        tlv tlvVar2 = z7x0Var.a;
        if (z5 && list2.isEmpty()) {
            i6 = i4;
        } else {
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                if (((p7x0) it5.next()) instanceof j7x0) {
                    i6 = i5;
                }
            }
            i6 = i4;
        }
        tlvVar2.setVisibility(i6);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.b.b;
    }

    public final void k() {
        z7x0 z7x0Var = this.c;
        View view = z7x0Var.s;
        AppCompatTextView appCompatTextView = z7x0Var.q;
        AppCompatTextView appCompatTextView2 = z7x0Var.p;
        if (view.getVisibility() != 0) {
            view = null;
        }
        int i = 8;
        if (appCompatTextView2.getVisibility() != 8 && view != null) {
            if (appCompatTextView2.getTop() == view.getTop()) {
                i = 0;
            } else if (appCompatTextView2.getTop() == appCompatTextView.getTop()) {
                i = 4;
            }
        }
        appCompatTextView.setVisibility(i);
    }

    public final void n(iu30 iu30Var) {
        this.f = iu30Var;
        ((BackButtonView) this.b.e).n(new shs(iu30Var, (byte) 2));
        z7x0 z7x0Var = this.c;
        z7x0Var.b.setOnClickListener(new sis(iu30Var, (byte) 0));
        z7x0Var.j.setOnClickListener(new sis(iu30Var, (byte) 1));
        z7x0Var.i.setOnClickListener(new sis(iu30Var, (byte) 2));
        z7x0Var.k.setOnClickListener(new sis(iu30Var, (byte) 3));
        z7x0Var.d.n(new ris(this, iu30Var, (byte) 1));
        z7x0Var.a.n(new shs(iu30Var, (byte) 3));
        z7x0Var.f.setOnClickListener(new sis(iu30Var, (byte) 4));
        z7x0Var.g.setOnClickListener(new sis(iu30Var, (byte) 5));
        z7x0Var.l.setOnClickListener(new oes(iu30Var, (byte) 28));
        z7x0Var.n.setOnClickListener(new oes(iu30Var, (byte) 29));
        z7x0Var.o.N0 = new ris(this, iu30Var, (byte) 0);
    }
}
