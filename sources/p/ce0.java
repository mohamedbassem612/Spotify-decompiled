package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconAddBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconRemoveBadgeView;
import com.spotify.bottomsheet.core.ScrollableContentWithHeaderLayout;
import com.spotify.checkout.elements.utils.AdditionalInfoView;
import com.spotify.mainlayout.ui.view.containers.MainLayoutConstrainedContainerView;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ce0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(MainLayoutConstrainedContainerView mainLayoutConstrainedContainerView) {
        this.b = (byte) 13;
        Float fValueOf = Float.valueOf(1.0f);
        this.c = mainLayoutConstrainedContainerView;
        super(fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:344:0x05bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x05be  */
    /* JADX WARN: Code duplicated, block: B:346:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:350:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:353:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:355:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:356:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:403:0x06d0  */
    public void a(mma0 mma0Var, Object obj, Object obj2) {
        CharSequence spannableStringBuilder;
        List list;
        boolean z;
        h320 h320Var;
        h320 h320Var2;
        h320 h320Var3;
        boolean z2;
        hfl1 hfl1Var;
        hfl1 hfl1Var2;
        byte b = this.b;
        boolean z3 = false;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((fe0) obj3).b();
                return;
            case 1:
                List list2 = (List) obj2;
                TextView textView = ((AdditionalInfoView) obj3).a.a;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                int i = 0;
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
                        if (arrayList2 != null) {
                            Iterator it2 = arrayList2.iterator();
                            if (!it2.hasNext()) {
                                hhg1.h("Empty collection can't be reduced.");
                                return;
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = new SpannableStringBuilder((Spanned) next).append((CharSequence) it2.next());
                            }
                            spannableStringBuilder = (Spanned) next;
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder("");
                            }
                        } else {
                            spannableStringBuilder = new SpannableStringBuilder("");
                        }
                        textView.setText(spannableStringBuilder);
                        return;
                    }
                    Object next2 = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str2 = (String) next2;
                    if (i < list2.size() - 1) {
                        str = "<br>";
                    }
                    arrayList.add(Html.fromHtml("• " + str2 + str, 0));
                    i = i2;
                }
                break;
            case 2:
                lb5 lb5Var = (lb5) obj3;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (!((Boolean) obj).booleanValue() && zBooleanValue && lb5Var.getMeasuredHeight() == 0) {
                    lb5Var.b.invoke();
                }
                lb5Var.requestLayout();
                return;
            case 3:
                f39 f39Var = (f39) obj3;
                hce1 hce1Var = f39Var.a;
                j320 j320Var = (j320) obj2;
                j320 j320Var2 = (j320) obj;
                if (!u890.j(j320Var2 != null ? j320Var2.b : null, j320Var != null ? j320Var.b : null)) {
                    ((TextView) hce1Var.c).setText(j320Var != null ? j320Var.b : null);
                }
                if (!u890.j(j320Var2 != null ? j320Var2.c : null, j320Var != null ? j320Var.c : null)) {
                    ((TextInputLayout) hce1Var.d).setError(j320Var != null ? j320Var.c : null);
                    TextInputLayout textInputLayout = (TextInputLayout) hce1Var.d;
                    String str3 = j320Var != null ? j320Var.c : null;
                    textInputLayout.setErrorEnabled(!(str3 == null || ihc1.y0(str3)));
                }
                if (!u890.j(((NonCompletingAutoCompleteTextView) hce1Var.e).getText().toString(), j320Var != null ? j320Var.d : null)) {
                    f39Var.d = true;
                    ((NonCompletingAutoCompleteTextView) hce1Var.e).setText((CharSequence) (j320Var != null ? j320Var.d : null), false);
                    NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView = (NonCompletingAutoCompleteTextView) hce1Var.e;
                    Editable text = nonCompletingAutoCompleteTextView.getText();
                    nonCompletingAutoCompleteTextView.setSelection(text != null ? text.length() : 0);
                    f39Var.d = false;
                }
                if (!u890.j(j320Var2 != null ? Boolean.valueOf(j320Var2.f) : null, j320Var != null ? Boolean.valueOf(j320Var.f) : null)) {
                    ((NonCompletingAutoCompleteTextView) hce1Var.e).setCompoundDrawablesRelativeWithIntrinsicBounds((j320Var == null || !j320Var.f) ? 0 : 2131232554, 0, 0, 0);
                }
                if (!u890.j((j320Var2 == null || (h320Var3 = j320Var2.g) == null) ? null : h320Var3.a, (j320Var == null || (h320Var2 = j320Var.g) == null) ? null : h320Var2.a)) {
                    ((NonCompletingAutoCompleteTextView) hce1Var.e).setHint((j320Var == null || (h320Var = j320Var.g) == null) ? null : h320Var.a);
                }
                if (!u890.j(j320Var2 != null ? j320Var2.e : null, j320Var != null ? j320Var.e : null)) {
                    if (j320Var != null) {
                        list = j320Var.e;
                    } else {
                        list = null;
                    }
                    NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView2 = (NonCompletingAutoCompleteTextView) hce1Var.e;
                    if (list != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nonCompletingAutoCompleteTextView2.setAutocompleteEnabled(z);
                    if (list != null) {
                        a39 a39Var = f39Var.b;
                        h320 h320Var4 = j320Var.g;
                        String str4 = h320Var4.b;
                        String str5 = h320Var4.c;
                        String str6 = h320Var4.d;
                        a39Var.b = str4;
                        a39Var.c = str5;
                        a39Var.d = str6;
                        a39Var.e = list;
                        a39Var.notifyDataSetChanged();
                        if (((NonCompletingAutoCompleteTextView) hce1Var.e).hasFocus()) {
                            ((NonCompletingAutoCompleteTextView) hce1Var.e).showDropDown();
                        }
                    } else {
                        ((NonCompletingAutoCompleteTextView) hce1Var.e).dismissDropDown();
                    }
                } else if (!u890.j(j320Var2 != null ? j320Var2.g : null, j320Var != null ? j320Var.g : null)) {
                    if (j320Var != null) {
                        list = j320Var.e;
                    } else {
                        list = null;
                    }
                    NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView3 = (NonCompletingAutoCompleteTextView) hce1Var.e;
                    if (list != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nonCompletingAutoCompleteTextView3.setAutocompleteEnabled(z);
                    if (list != null) {
                        a39 a39Var2 = f39Var.b;
                        h320 h320Var5 = j320Var.g;
                        String str7 = h320Var5.b;
                        String str8 = h320Var5.c;
                        String str9 = h320Var5.d;
                        a39Var2.b = str7;
                        a39Var2.c = str8;
                        a39Var2.d = str9;
                        a39Var2.e = list;
                        a39Var2.notifyDataSetChanged();
                        if (((NonCompletingAutoCompleteTextView) hce1Var.e).hasFocus()) {
                            ((NonCompletingAutoCompleteTextView) hce1Var.e).showDropDown();
                        }
                    } else {
                        ((NonCompletingAutoCompleteTextView) hce1Var.e).dismissDropDown();
                    }
                }
                f39Var.t.a(j320Var != null);
                f39Var.N0.a((j320Var != null ? j320Var.c : null) != null);
                return;
            case 4:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ((uaa) obj3).refreshDrawableState();
                    return;
                }
                return;
            case 5:
                h72 h72Var = ((oee) obj3).a;
                List list4 = (List) obj2;
                if (u890.j((List) obj, list4)) {
                    return;
                }
                bk7 bk7Var = (bk7) h72Var.b;
                if (!u890.j((List) bk7Var.e, list4)) {
                    bk7Var.e = list4;
                    bk7Var.h();
                }
                dg30 dg30Var = (dg30) h72Var.e;
                InputMethodManager inputMethodManager = (InputMethodManager) dg30Var.getSystemService("input_method");
                View currentFocus = dg30Var.getCurrentFocus();
                if (currentFocus != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    currentFocus.clearFocus();
                }
                boolean z4 = list4.size() < 6;
                ((TextView) ((idd1) h72Var.t).getValue()).setVisibility(z4 ? 4 : 0);
                ((EditText) ((idd1) h72Var.i).getValue()).setEnabled(z4);
                return;
            case 6:
            default:
                return;
            case 7:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    ((hg10) obj3).invalidateSelf();
                    return;
                }
                return;
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue2) {
                    ad30 ad30Var = (ad30) obj3;
                    xu0 xu0Var = ad30Var.u1;
                    ao0 ao0Var = ad30Var.w1;
                    if (zBooleanValue2) {
                        t0u0.X(ad30Var, ao0Var, co0.Y, xu0Var.a, (Long) null, (String) null, xu0Var.c, 12);
                        return;
                    } else {
                        t0u0.X(ad30Var, ao0Var, co0.c, xu0Var.a, (Long) null, (String) null, xu0Var.c, 12);
                        return;
                    }
                }
                return;
            case 9:
                vz20 vz20Var = ((ho60) obj3).b;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue3 != ((Boolean) obj).booleanValue()) {
                    if (zBooleanValue3) {
                        vz20Var.a(v560.b);
                        return;
                    } else if (zBooleanValue3) {
                        eg.o();
                        return;
                    } else {
                        vz20Var.a(qz70.b);
                        return;
                    }
                }
                return;
            case 10:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                IconAddBadgeView iconAddBadgeView = (IconAddBadgeView) obj3;
                ycc1 ycc1Var = iconAddBadgeView.a;
                IconAddBadgeView.a(iconAddBadgeView, zBooleanValue4);
                if (zBooleanValue5 != zBooleanValue4) {
                    ((ImageView) ycc1Var.c).setImageState(zBooleanValue4 ? anm1.c : anm1.b, true);
                    if (zBooleanValue4) {
                        ((ImageView) ycc1Var.c).setImageTintList(x74.E(((ImageView) ycc1Var.b).getContext(), 2131101552));
                    } else {
                        ((ImageView) ycc1Var.c).setImageTintList(x74.E(((ImageView) ycc1Var.b).getContext(), 2131101518));
                    }
                    iconAddBadgeView.refreshDrawableState();
                    return;
                }
                return;
            case 11:
                IconRemoveBadgeView iconRemoveBadgeView = (IconRemoveBadgeView) obj3;
                hyy0 hyy0Var = iconRemoveBadgeView.a;
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue6) {
                    if (zBooleanValue6) {
                        ((ImageView) hyy0Var.c).setVisibility(0);
                        ((ImageView) hyy0Var.c).setImageTintList(x74.E(((ImageView) hyy0Var.b).getContext(), 2131101518));
                    } else {
                        ((ImageView) hyy0Var.c).setVisibility(8);
                    }
                    iconRemoveBadgeView.refreshDrawableState();
                    return;
                }
                return;
            case 12:
                ggb0 ggb0Var = (ggb0) obj2;
                if (!u890.j((ggb0) obj, ggb0Var) || ggb0Var == null) {
                    igb0 igb0Var = (igb0) obj3;
                    uo5 uo5Var = igb0Var.b;
                    Context context = igb0Var.c;
                    if (context != null) {
                        ((Scheduler) uo5Var.b).c(new pgb0(new vq80(ggb0Var, igb0Var, (byte) 12), uo5Var, context));
                        return;
                    } else {
                        u890.C("context");
                        throw null;
                    }
                }
                return;
            case 13:
                if (((Number) obj).floatValue() == ((Number) obj2).floatValue()) {
                    return;
                }
                ((MainLayoutConstrainedContainerView) obj3).requestLayout();
                return;
            case 14:
                float fFloatValue = ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                ((MainLayoutFragmentContainerView) obj3).setOutlineProvider(fFloatValue > 0.0f ? new ir31(fFloatValue, fFloatValue, 0.0f, 0.0f) : ViewOutlineProvider.BACKGROUND);
                return;
            case 15:
                if (u890.j(obj, obj2)) {
                    return;
                }
                ((iu30) obj3).invoke(obj2);
                return;
            case 16:
                Float f = null;
                d0g0 d0g0Var = (f0g0) obj2;
                d0g0 d0g0Var2 = (f0g0) obj;
                if (u890.j(d0g0Var2, d0g0Var)) {
                    return;
                }
                i0g0 i0g0Var = (i0g0) obj3;
                if (i0g0Var.e) {
                    return;
                }
                if (d0g0Var instanceof d0g0) {
                    d0g0 d0g0Var3 = d0g0Var;
                    boolean z5 = d0g0Var3.b;
                    c7p0 c7p0Var = d0g0Var3.a;
                    d7 d7Var = new d7(zyf0.h, z3 ? (byte) 1 : (byte) 0);
                    while (d7Var.hasNext()) {
                        zyf0 zyf0Var = (zyf0) d7Var.next();
                        if (zyf0Var.a == c7p0Var && zyf0Var.b != z5) {
                            i0g0.h.getClass();
                            if (d0g0Var2 instanceof d0g0) {
                                z2 = d0g0Var2.b;
                            } else {
                                if (!(d0g0Var2 instanceof e0g0)) {
                                    eg.o();
                                    return;
                                }
                                z2 = true;
                            }
                            i0g0.a(i0g0Var, zyf0Var, f, z2 || z5, 2);
                            return;
                        }
                        f = null;
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return;
                }
                if (!(d0g0Var instanceof e0g0)) {
                    eg.o();
                    return;
                }
                float fO = yoi1.o(((e0g0) d0g0Var).a, 0.0f, 1.0f);
                if (i0g0Var.a.isLaidOut()) {
                    c0g0 c0g0Var = i0g0Var.g;
                    if (c0g0Var == null) {
                        d8b1 d8b1Var = i0g0Var.d;
                        if (d8b1Var != null) {
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
                            }
                            if (d8b1Var.f) {
                                d8b1Var.b(true);
                            }
                        }
                        ArrayList arrayListB = i0g0Var.b();
                        zyf0 zyf0Var2 = zyf0.c;
                        zyf0 zyf0Var3 = zyf0.d;
                        Set setS0 = f46.S0(new zyf0[]{zyf0Var2, zyf0Var3});
                        Iterator it3 = i0g0Var.c.iterator();
                        while (it3.hasNext()) {
                            ((azf0) it3.next()).d(setS0);
                        }
                        i0g0.e(arrayListB);
                        c0g0Var = new c0g0(i0g0Var.c(zyf0Var2), i0g0Var.c(zyf0Var3));
                        i0g0Var.g = c0g0Var;
                    }
                    i0g0.e(uyn1.u(c0g0Var.a, c0g0Var.b, fO));
                    return;
                }
                return;
            case 17:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                m1p0 m1p0Var = (m1p0) obj3;
                int iIntValue2 = iIntValue - ((Number) m1p0Var.c.getValue()).intValue();
                lb5 lb5Var2 = m1p0Var.d;
                ViewGroup.LayoutParams layoutParams = lb5Var2.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = iIntValue2;
                lb5Var2.setLayoutParams(marginLayoutParams);
                int childCount = lb5Var2.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = lb5Var2.getChildAt(i3);
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (layoutParams2 == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = iIntValue2;
                    childAt.setLayoutParams(marginLayoutParams2);
                }
                return;
            case 18:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                t0u0 t0u0Var = (t0u0) obj3;
                t0u0Var.r1 = t0u0Var.r1 || zBooleanValue7;
                return;
            case 19:
                k5u0 k5u0Var = (k5u0) obj2;
                if (k5u0Var != null) {
                    ((q5u0) obj3).q(k5u0Var);
                    return;
                }
                return;
            case 20:
                ScrollableContentWithHeaderLayout scrollableContentWithHeaderLayout = (ScrollableContentWithHeaderLayout) obj3;
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue8) {
                    float measuredHeight = zBooleanValue8 ? scrollableContentWithHeaderLayout.getMeasuredHeight() : 0.0f;
                    Iterator it4 = scrollableContentWithHeaderLayout.getContentChildren().iterator();
                    while (it4.hasNext()) {
                        ((View) it4.next()).setTranslationY(measuredHeight);
                    }
                    scrollableContentWithHeaderLayout.invalidate();
                    return;
                }
                return;
            case 21:
                ((ar91) obj3).b.l(o7h.s0((List) obj2));
                return;
            case 22:
                qvb1 qvb1Var = (qvb1) obj3;
                pvb1 pvb1Var = (pvb1) obj2;
                pvb1 pvb1Var2 = (pvb1) obj;
                if (u890.j(pvb1Var2, pvb1Var)) {
                    return;
                }
                boolean z6 = pvb1Var2.b;
                boolean z7 = pvb1Var2.c;
                boolean z8 = pvb1Var.b;
                int i4 = pvb1Var.a;
                boolean z9 = pvb1Var.c;
                if (z6 != z8) {
                    if (z8) {
                        kl1 kl1Var = qvb1Var.c;
                        if (kl1Var == null) {
                            u890.C("listener");
                            throw null;
                        }
                        kl1Var.t(qvb1Var.b().f1());
                    } else {
                        if (z8) {
                            eg.o();
                            return;
                        }
                        kl1 kl1Var2 = qvb1Var.c;
                        if (kl1Var2 == null) {
                            u890.C("listener");
                            throw null;
                        }
                        qvb1Var.b().f1();
                        boolean z10 = pvb1Var.d;
                        Handler handler = (Handler) kl1Var2.e;
                        xfz0 xfz0Var = (xfz0) kl1Var2.f;
                        handler.removeCallbacks(xfz0Var);
                        long j = z10 ? 0L : 1600L;
                        handler.postDelayed(xfz0Var, j);
                        kl1Var2.z(j);
                    }
                }
                if (!z7 && z9 && !pvb1Var.b && i4 != 0) {
                    kl1 kl1Var3 = qvb1Var.c;
                    if (kl1Var3 == null) {
                        u890.C("listener");
                        throw 0;
                    }
                    if (kl1Var3.u()) {
                        return;
                    }
                    kl1Var3.z(0L);
                    return;
                }
                if (z7 && !z9 && i4 != 0) {
                    kl1 kl1Var4 = qvb1Var.c;
                    if (kl1Var4 != null) {
                        kl1Var4.A();
                        return;
                    } else {
                        u890.C("listener");
                        throw r5;
                    }
                }
                if (pvb1Var2.b() != pvb1Var.b() && pvb1Var.b()) {
                    kl1 kl1Var5 = qvb1Var.c;
                    if (kl1Var5 != null) {
                        kl1Var5.A();
                        return;
                    } else {
                        u890.C("listener");
                        throw r5;
                    }
                }
                if (pvb1Var2.b() != pvb1Var.b()) {
                    kl1 kl1Var6 = qvb1Var.c;
                    if (kl1Var6 != null) {
                        kl1Var6.z(1600L);
                        return;
                    } else {
                        u890.C("listener");
                        throw r5;
                    }
                }
                return;
            case 23:
                lfl1 lfl1Var = (lfl1) obj3;
                WeakReference weakReference = (WeakReference) obj2;
                WeakReference weakReference2 = (WeakReference) obj;
                if (weakReference2 != null && (hfl1Var2 = (hfl1) weakReference2.get()) != null) {
                    hfl1Var2.g = null;
                }
                if (weakReference != null && (hfl1Var = (hfl1) weakReference.get()) != null) {
                    hfl1Var.g = lfl1Var;
                }
                lfl1Var.a();
                return;
        }
    }

    public void b() {
        switch (this.b) {
            case 6:
                if (((fht) this.c).a) {
                    eg.m("Cannot modify readonly DescriptorRendererOptions");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce0(Object obj, Object obj2, byte b) {
        super(obj);
        this.b = b;
        this.c = obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(IconAddBadgeView iconAddBadgeView) {
        this.b = (byte) 10;
        Boolean bool = Boolean.FALSE;
        this.c = iconAddBadgeView;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(IconRemoveBadgeView iconRemoveBadgeView) {
        this.b = (byte) 11;
        Boolean bool = Boolean.TRUE;
        this.c = iconRemoveBadgeView;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(ScrollableContentWithHeaderLayout scrollableContentWithHeaderLayout) {
        this.b = (byte) 20;
        Boolean bool = Boolean.FALSE;
        this.c = scrollableContentWithHeaderLayout;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(AdditionalInfoView additionalInfoView) {
        super(z6x.a);
        this.b = (byte) 1;
        this.c = additionalInfoView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce0(Object obj, byte b) {
        super((Object) null);
        this.b = b;
        this.c = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(MainLayoutFragmentContainerView mainLayoutFragmentContainerView) {
        this.b = (byte) 14;
        Float fValueOf = Float.valueOf(0.0f);
        this.c = mainLayoutFragmentContainerView;
        super(fValueOf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(fe0 fe0Var) {
        this.b = (byte) 0;
        Boolean bool = Boolean.FALSE;
        this.c = fe0Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(lb5 lb5Var) {
        this.b = (byte) 2;
        Boolean bool = Boolean.FALSE;
        this.c = lb5Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(uaa uaaVar) {
        this.b = (byte) 4;
        Boolean bool = Boolean.FALSE;
        this.c = uaaVar;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(oee oeeVar) {
        super(z6x.a);
        this.b = (byte) 5;
        this.c = oeeVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(hg10 hg10Var) {
        this.b = (byte) 7;
        Boolean bool = Boolean.TRUE;
        this.c = hg10Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(ho60 ho60Var) {
        this.b = (byte) 9;
        Boolean bool = Boolean.FALSE;
        this.c = ho60Var;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ce0(t0u0 t0u0Var) {
        this.b = (byte) 18;
        Boolean bool = Boolean.FALSE;
        this.c = t0u0Var;
        super(bool);
    }
}
