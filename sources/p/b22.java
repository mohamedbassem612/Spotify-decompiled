package p;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.address.endpoint.model.v1.proto.AddressCollection;
import com.spotify.address.endpoint.model.v1.proto.FormField;
import com.spotify.address.endpoint.model.v1.proto.SavedAddress;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class b22 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;

    public /* synthetic */ b22(h22 h22Var, byte b) {
        this.a = b;
        this.b = h22Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:108:0x0205  */
    /* JADX WARN: Code duplicated, block: B:109:0x0208  */
    /* JADX WARN: Code duplicated, block: B:129:0x027b  */
    /* JADX WARN: Code duplicated, block: B:254:0x0577  */
    /* JADX WARN: Code duplicated, block: B:256:0x057d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0583  */
    /* JADX WARN: Code duplicated, block: B:261:0x058a  */
    /* JADX WARN: Code duplicated, block: B:263:0x0592 A[LOOP:5: B:259:0x0584->B:263:0x0592, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:267:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:379:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    public final void b(Object obj) {
        Parcelable pfk1Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        View view;
        View childAt;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        int i4;
        View childAt2;
        View view2;
        rfk1 rfk1Var;
        int i5;
        Spanned spannedS;
        Spanned spanned;
        int iQ;
        String str;
        Object m320Var;
        String strO;
        String strP;
        String strP2;
        ArrayList arrayList;
        boolean z4;
        List list;
        byte b = this.a;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                jhm0 jhm0Var = (jhm0) obj;
                Context contextP0 = h22Var.P0();
                int iU = ((n12) h22Var.M1.getValue()).u();
                int i6 = 3;
                int i7 = 2;
                if (jhm0Var instanceof ugm0) {
                    pfk1Var = ngk1.a;
                } else if ((jhm0Var instanceof hgm0) || (jhm0Var instanceof xgm0)) {
                    pfk1Var = new pfk1(contextP0.getString(2131951971), contextP0.getString(2131951967), contextP0.getString(2131951969), null);
                } else {
                    if (!(jhm0Var instanceof sgm0)) {
                        eg.o();
                        return;
                    }
                    sgm0 sgm0Var = (sgm0) jhm0Var;
                    pgm0 pgm0Var = sgm0Var.b;
                    AddressCollection addressCollection = sgm0Var.a;
                    if (pgm0Var instanceof lgm0) {
                        lgm0 lgm0Var = (lgm0) pgm0Var;
                        String str2 = lgm0Var.b;
                        h290<FormField> h290VarR = addressCollection.n().r();
                        ArrayList arrayList2 = new ArrayList();
                        for (FormField formField : h290VarR) {
                            kgm0 kgm0Var = (kgm0) lgm0Var.a.get(formField.getId());
                            int iQ2 = formField.q();
                            int i8 = iQ2 == 0 ? -1 : dhk1.a[l1d.C(iQ2)];
                            if (i8 == -1) {
                                iQ = formField.q();
                                if (iQ != 1) {
                                    str = "TEXT";
                                } else if (iQ != 2) {
                                    str = "DROPDOWN";
                                } else if (iQ != 3) {
                                    str = "AUTOCOMPLETE";
                                } else if (iQ != 4) {
                                    str = "null";
                                } else {
                                    str = "FIELD_NOT_SET";
                                }
                                n57.e("Unexpected field type: ".concat(str));
                                m320Var = null;
                            } else if (i8 == 1) {
                                String id = formField.getId();
                                String strR = formField.r();
                                String str3 = kgm0Var != null ? kgm0Var.b : null;
                                if (kgm0Var == null || (strO = kgm0Var.a) == null) {
                                    strO = formField.s().o();
                                }
                                strO.getClass();
                                m320Var = new m320(id, strR, str3, strO);
                            } else if (i8 == i7) {
                                String id2 = formField.getId();
                                String strR2 = formField.r();
                                String str4 = kgm0Var != null ? kgm0Var.b : null;
                                String strR3 = formField.p().r();
                                h290<FormField.Dropdown.Option> h290VarQ = formField.p().q();
                                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarQ, 10));
                                for (FormField.Dropdown.Option option : h290VarQ) {
                                    arrayList3.add(new k320(option.getValue(), option.n()));
                                }
                                if (kgm0Var == null || (strP = kgm0Var.a) == null) {
                                    strP = formField.p().p();
                                }
                                m320Var = new l320(id2, strR2, str4, strR3, strP, arrayList3);
                            } else if (i8 != i6) {
                                if (i8 != 4) {
                                    eg.o();
                                    return;
                                }
                                iQ = formField.q();
                                if (iQ != 1) {
                                    str = "TEXT";
                                } else if (iQ != 2) {
                                    str = "DROPDOWN";
                                } else if (iQ != 3) {
                                    str = "AUTOCOMPLETE";
                                } else if (iQ != 4) {
                                    str = "null";
                                } else {
                                    str = "FIELD_NOT_SET";
                                }
                                n57.e("Unexpected field type: ".concat(str));
                                m320Var = null;
                            } else {
                                String id3 = formField.getId();
                                String strR4 = formField.r();
                                String str5 = kgm0Var != null ? kgm0Var.b : null;
                                if (kgm0Var == null || (strP2 = kgm0Var.a) == null) {
                                    strP2 = formField.o().p();
                                }
                                String str6 = strP2;
                                str6.getClass();
                                if (kgm0Var == null || (list = kgm0Var.c) == null) {
                                    arrayList = null;
                                } else {
                                    List<jgm0> list2 = list;
                                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                                    for (jgm0 jgm0Var : list2) {
                                        arrayList4.add(new i320(jgm0Var.b, jgm0Var.a));
                                    }
                                    arrayList = arrayList4;
                                }
                                if (sgm0Var.b()) {
                                    String str7 = kgm0Var != null ? kgm0Var.a : null;
                                    if (str7 == null || str7.length() == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                }
                                m320Var = new j320(id3, strR4, str5, str6, arrayList, z4, new h320(sgm0Var.b() ? formField.o().s() : null, formField.o().q(), formField.o().r(), formField.o().n()));
                            }
                            if (m320Var != null) {
                                arrayList2.add(m320Var);
                            }
                            i6 = 3;
                            i7 = 2;
                        }
                        String strS = addressCollection.n().s();
                        String strP3 = addressCollection.n().p();
                        strP3.getClass();
                        String str8 = (ihc1.y0(strP3) || u890.j(addressCollection.r(), SavedAddress.q())) ? null : strP3;
                        String strT = addressCollection.n().t();
                        strT.getClass();
                        pfk1Var = new hfk1(str2, arrayList2, strS, str8, (ihc1.y0(strT) || u890.j(addressCollection.r(), SavedAddress.q())) ? null : strT, fhk1.a(iU, addressCollection));
                    } else if (pgm0Var instanceof ngm0) {
                        pfk1Var = ngk1.a;
                    } else if (pgm0Var instanceof mgm0) {
                        pfk1Var = new pfk1(contextP0.getString(2131951971), contextP0.getString(2131951968), contextP0.getString(2131951970), contextP0.getString(R.string.cancel));
                    } else {
                        if (!(pgm0Var instanceof ogm0)) {
                            eg.o();
                            return;
                        }
                        pfk1Var = new vgk1(addressCollection.r().p(), addressCollection.r().r(), fhk1.a(iU, addressCollection));
                    }
                }
                fg30 fg30Var = h22Var.Q1;
                if (fg30Var == null) {
                    return;
                }
                boolean z5 = pfk1Var instanceof ngk1;
                fg30Var.u.setVisibility(z5 ? 0 : 8);
                boolean z6 = pfk1Var instanceof pfk1;
                pfk1 pfk1Var2 = z6 ? (pfk1) pfk1Var : null;
                fg30 fg30Var2 = h22Var.Q1;
                if (fg30Var2 != null) {
                    EncoreButton encoreButton = fg30Var2.d;
                    EncoreButton encoreButton2 = fg30Var2.v;
                    fg30Var2.o.setVisibility(pfk1Var2 != null ? 0 : 8);
                    if (pfk1Var2 != null) {
                        String str9 = pfk1Var2.d;
                        String str10 = pfk1Var2.c;
                        fg30Var2.p.setText(pfk1Var2.a);
                        fg30Var2.n.setText(pfk1Var2.b);
                        encoreButton2.setVisibility((str10 == null || ihc1.y0(str10)) ? 8 : 0);
                        encoreButton2.setText(str10);
                        encoreButton.setVisibility((str9 == null || ihc1.y0(str9)) ? 8 : 0);
                        encoreButton.setText(str9);
                    }
                }
                boolean z7 = pfk1Var instanceof vgk1;
                vgk1 vgk1Var = z7 ? (vgk1) pfk1Var : null;
                fg30 fg30Var3 = h22Var.Q1;
                if (fg30Var3 != null) {
                    TextView textView = fg30Var3.b;
                    ConstraintLayout constraintLayout = fg30Var3.w;
                    if (vgk1Var == null) {
                        constraintLayout.setVisibility(8);
                    } else {
                        List list3 = vgk1Var.a;
                        constraintLayout.setVisibility(0);
                        fg30Var3.c.setText((CharSequence) o7h.t0(0, list3));
                        List listSubList = list3.size() > 1 ? list3.subList(1, list3.size()) : z6x.a;
                        textView.setText(o7h.y0(listSubList, "\n", (String) null, (String) null, (iu30) null, 62));
                        textView.setVisibility(!listSubList.isEmpty() ? 0 : 8);
                        fg30Var3.f.setText(vgk1Var.b);
                    }
                }
                boolean z8 = pfk1Var instanceof hfk1;
                hfk1 hfk1Var = z8 ? (hfk1) pfk1Var : null;
                ArrayList arrayList5 = h22Var.W1;
                fg30 fg30Var4 = h22Var.Q1;
                if (fg30Var4 == null) {
                    z = z5;
                    z2 = z7;
                } else {
                    EncoreButton encoreButton3 = fg30Var4.e;
                    LinearLayout linearLayout = fg30Var4.k;
                    ConstraintLayout constraintLayout2 = fg30Var4.l;
                    if (hfk1Var == null) {
                        constraintLayout2.setVisibility(8);
                        z = z5;
                        z2 = z7;
                    } else {
                        String str11 = hfk1Var.e;
                        String str12 = hfk1Var.d;
                        String str13 = hfk1Var.a;
                        byte b2 = 1;
                        ArrayList arrayList6 = hfk1Var.b;
                        constraintLayout2.setVisibility(0);
                        fg30Var4.i.setVisibility((str13 == null || ihc1.y0(str13)) ? 8 : 0);
                        fg30Var4.j.setText(str13);
                        if (linearLayout.getChildCount() == 0) {
                            Iterator it = arrayList6.iterator();
                            int i9 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    p7h.T();
                                    throw null;
                                }
                                n320 n320Var = (n320) next;
                                Iterator it2 = it;
                                int i11 = i9 == arrayList6.size() + (-1) ? 6 : 5;
                                boolean z9 = z5;
                                if (n320Var instanceof m320) {
                                    f8e1 f8e1Var = new f8e1(h22Var.P0());
                                    m320 m320Var2 = (m320) n320Var;
                                    z3 = z7;
                                    f8e1Var.setOnTextChanged(new c22(h22Var, m320Var2, (byte) 0));
                                    f8e1Var.setOnFocused(new y4(h22Var, m320Var2, (byte) 21));
                                    f8e1Var.setOnFocusLost(new c22(h22Var, m320Var2, b2));
                                    f8e1Var.setImeOptions(i11);
                                    gik1 gik1Var = h22Var.L1;
                                    if (gik1Var == null) {
                                        u890.C("viewUbiImpressionLogger");
                                        throw null;
                                    }
                                    dsk0 dsk0Var = h22Var.T1;
                                    if (dsk0Var == null) {
                                        u890.C("ubiEventFactory");
                                        throw null;
                                    }
                                    ttk0 ttk0Var = new ttk0(dsk0Var, (byte) 7);
                                    f8e1Var.f.b(new e8e1(gik1Var, f8e1Var, ttk0Var, (byte) 0));
                                    f8e1Var.g.b(new e8e1(gik1Var, f8e1Var, ttk0Var, (byte) 1));
                                    arrayList5.add(new e39(f8e1Var, (byte) 2));
                                    view2 = f8e1Var;
                                } else {
                                    z3 = z7;
                                    if (n320Var instanceof l320) {
                                        fav favVar = new fav(h22Var.P0());
                                        l320 l320Var = (l320) n320Var;
                                        favVar.setOnTextChanged(new d22(h22Var, l320Var, (byte) 0));
                                        favVar.setOnOptionSelected(new d22(h22Var, l320Var, (byte) 1));
                                        favVar.setOnFocused(new y4(h22Var, l320Var, (byte) 22));
                                        favVar.setOnUserInput(new y12(h22Var, (byte) 13));
                                        favVar.setImeOptions(i11);
                                        gik1 gik1Var2 = h22Var.L1;
                                        if (gik1Var2 == null) {
                                            u890.C("viewUbiImpressionLogger");
                                            throw null;
                                        }
                                        dsk0 dsk0Var2 = h22Var.T1;
                                        if (dsk0Var2 == null) {
                                            u890.C("ubiEventFactory");
                                            throw null;
                                        }
                                        ttk0 ttk0Var2 = new ttk0(dsk0Var2, (byte) 7);
                                        favVar.g.b(new eav(gik1Var2, favVar, ttk0Var2, (byte) 0));
                                        favVar.h.b(new eav(gik1Var2, favVar, ttk0Var2, (byte) 1));
                                        arrayList5.add(new e39(favVar, (byte) 1));
                                        view2 = favVar;
                                    } else {
                                        if (!(n320Var instanceof j320)) {
                                            eg.o();
                                            return;
                                        }
                                        f39 f39Var = new f39(h22Var.P0());
                                        j320 j320Var = (j320) n320Var;
                                        f39Var.setOnTextChanged(new e22(h22Var, j320Var, (byte) 0));
                                        f39Var.setOnFocused(new y4(h22Var, j320Var, (byte) 23));
                                        f39Var.setOnFocusLost(new e22(h22Var, j320Var, (byte) 1));
                                        f39Var.setOnManualEntrySelected(new y12(h22Var, (byte) 14));
                                        f39Var.setOnSuggestionSelected(new e22(h22Var, j320Var, (byte) 2));
                                        f39Var.setImeOptions(i11);
                                        gik1 gik1Var3 = h22Var.L1;
                                        if (gik1Var3 == null) {
                                            u890.C("viewUbiImpressionLogger");
                                            throw null;
                                        }
                                        dsk0 dsk0Var3 = h22Var.T1;
                                        if (dsk0Var3 == null) {
                                            u890.C("ubiEventFactory");
                                            throw null;
                                        }
                                        ttk0 ttk0Var3 = new ttk0(dsk0Var3, (byte) 7);
                                        f39Var.t.b(new d39(gik1Var3, f39Var, ttk0Var3, (byte) 0));
                                        i = 1;
                                        f39Var.N0.b(new d39(gik1Var3, f39Var, ttk0Var3, (byte) 1));
                                        i2 = 0;
                                        arrayList5.add(new e39(f39Var, (byte) 0));
                                        view = f39Var;
                                    }
                                    linearLayout.addView(view);
                                    if (linearLayout.getChildCount() <= i) {
                                        if (linearLayout.getChildCount() > 0) {
                                            bhn0.t("Sequence is empty.");
                                            return;
                                        }
                                        childAt = linearLayout.getChildAt(i2);
                                        if (childAt != null) {
                                            tw20.p();
                                            return;
                                        }
                                        i3 = 1;
                                        while (i3 < linearLayout.getChildCount()) {
                                            i4 = i3 + 1;
                                            childAt2 = linearLayout.getChildAt(i3);
                                            if (childAt2 != null) {
                                                tw20.p();
                                                return;
                                            } else {
                                                i3 = i4;
                                                childAt = childAt2;
                                            }
                                        }
                                        layoutParams = childAt.getLayoutParams();
                                        if (layoutParams != null) {
                                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                            return;
                                        } else {
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                            marginLayoutParams.topMargin = h22Var.k0().getDimensionPixelOffset(2131165897);
                                            childAt.setLayoutParams(marginLayoutParams);
                                        }
                                    }
                                    i9 = i10;
                                    z5 = z9;
                                    it = it2;
                                    z7 = z3;
                                    b2 = 1;
                                }
                                i = 1;
                                i2 = 0;
                                view = view2;
                                linearLayout.addView(view);
                                if (linearLayout.getChildCount() <= i) {
                                    if (linearLayout.getChildCount() > 0) {
                                        bhn0.t("Sequence is empty.");
                                        return;
                                    }
                                    childAt = linearLayout.getChildAt(i2);
                                    if (childAt != null) {
                                        tw20.p();
                                        return;
                                    }
                                    i3 = 1;
                                    while (i3 < linearLayout.getChildCount()) {
                                        i4 = i3 + 1;
                                        childAt2 = linearLayout.getChildAt(i3);
                                        if (childAt2 != null) {
                                            tw20.p();
                                            return;
                                        } else {
                                            i3 = i4;
                                            childAt = childAt2;
                                        }
                                    }
                                    layoutParams = childAt.getLayoutParams();
                                    if (layoutParams != null) {
                                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        return;
                                    } else {
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                                        marginLayoutParams2.topMargin = h22Var.k0().getDimensionPixelOffset(2131165897);
                                        childAt.setLayoutParams(marginLayoutParams2);
                                    }
                                }
                                i9 = i10;
                                z5 = z9;
                                it = it2;
                                z7 = z3;
                                b2 = 1;
                            }
                        }
                        z = z5;
                        z2 = z7;
                        n57.i(arrayList6.size() == linearLayout.getChildCount(), "Number of form fields (%d) changed since creation (%d)", new Object[]{Integer.valueOf(arrayList6.size()), Integer.valueOf(linearLayout.getChildCount())});
                        int childCount = linearLayout.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View viewQ = jhc1.q(i12, linearLayout);
                            n320 n320Var2 = (n320) arrayList6.get(i12);
                            if (viewQ instanceof f8e1) {
                                ((f8e1) viewQ).setState(n320Var2 instanceof m320 ? (m320) n320Var2 : null);
                            } else if (viewQ instanceof fav) {
                                ((fav) viewQ).setState(n320Var2 instanceof l320 ? (l320) n320Var2 : null);
                            } else if (viewQ instanceof f39) {
                                ((f39) viewQ).setState(n320Var2 instanceof j320 ? (j320) n320Var2 : null);
                            } else {
                                n57.e("Unexpected view in form: " + viewQ);
                            }
                        }
                        fg30Var4.m.setText(hfk1Var.c);
                        encoreButton3.setVisibility((str12 == null || ihc1.y0(str12)) ? 8 : 0);
                        encoreButton3.setText(str12);
                        fg30Var4.g.setVisibility((str11 == null || ihc1.y0(str11)) ? 8 : 0);
                        fg30Var4.h.setText(str11);
                    }
                }
                fg30 fg30Var5 = h22Var.Q1;
                if (fg30Var5 == null) {
                    return;
                }
                TextView textView2 = fg30Var5.t;
                TextView textView3 = fg30Var5.s;
                TextView textView4 = fg30Var5.r;
                if (z || z6) {
                    rfk1Var = null;
                } else if (z8) {
                    rfk1Var = ((hfk1) pfk1Var).f;
                } else {
                    if (!z2) {
                        eg.o();
                        return;
                    }
                    rfk1Var = ((vgk1) pfk1Var).c;
                }
                ConstraintLayout constraintLayout3 = fg30Var5.q;
                int i13 = 8;
                if (rfk1Var == null) {
                    constraintLayout3.setVisibility(8);
                    textView3.setVisibility(8);
                    return;
                }
                String str14 = rfk1Var.d;
                String str15 = rfk1Var.b;
                String str16 = rfk1Var.a;
                constraintLayout3.setVisibility(0);
                textView2.setVisibility((str16 == null || ihc1.y0(str16)) ? 8 : 0);
                textView2.setText(str16);
                textView4.setVisibility((str15 == null || ihc1.y0(str15)) ? 8 : 0);
                if (str15 != null) {
                    i5 = 0;
                    spannedS = ulo1.s(str15, new f22(h22Var, (byte) 0));
                } else {
                    i5 = 0;
                    spannedS = null;
                }
                textView4.setText(spannedS);
                if (rfk1Var.c == null) {
                    textView4.setMovementMethod(LinkMovementMethod.getInstance());
                    spanned = null;
                    textView4.setOnClickListener(null);
                } else {
                    spanned = null;
                    textView4.setMovementMethod(null);
                    textView4.setOnClickListener(new cg1(h22Var, rfk1Var, (byte) 3));
                }
                if (str14 != null && !ihc1.y0(str14)) {
                    i13 = i5;
                }
                textView3.setVisibility(i13);
                textView3.setText(str14 != null ? ulo1.s(str14, new f22(h22Var, (byte) 1)) : spanned);
                return;
            case 1:
                h22Var.b1((giw) obj);
                return;
            default:
                Iterator it3 = ((Iterable) obj).iterator();
                while (it3.hasNext()) {
                    h22Var.b1((giw) it3.next());
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new tv30(1, this.b, h22.class, "render", "render(Lcom/spotify/address/addressimpl/domain/Model;)V", 0);
            case 1:
                return new tv30(1, this.b, h22.class, "trigger", "trigger(Lcom/spotify/address/addressimpl/domain/Effect$ViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, h22.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
