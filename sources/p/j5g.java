package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.a;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class j5g implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChoiceScreenUcActivity b;

    public /* synthetic */ j5g(ChoiceScreenUcActivity choiceScreenUcActivity, byte b) {
        this.a = b;
        this.b = choiceScreenUcActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity, p.dg30] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v47, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v39, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v10, types: [p.i5l1] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [p.i5l1] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.i5l1] */
    /* JADX WARN: Type inference failed for: r3v46, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v50, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v36 */
    public final void b(Object obj) throws Throwable {
        i9g i9gVar;
        i9g i9gVar2;
        i9g i9gVar3;
        Throwable th;
        ?? r3;
        int i;
        ?? r4;
        ?? r5;
        ?? r6;
        ?? C;
        xhc0 xhc0Var;
        String str;
        List list;
        List list2;
        tco tcoVar;
        String str2;
        String str3;
        boolean z;
        i5l1 i5l1Var;
        i5l1 i5l1Var2;
        i5l1 i5l1Var3;
        j5l1 j5l1Var;
        d5g d5gVarG;
        byte b = this.a;
        ?? r0 = this.b;
        switch (b) {
            case 0:
                t8g t8gVar = (t8g) obj;
                f5g f5gVar = ChoiceScreenUcActivity.y1;
                u8g u8gVar = r0.g1;
                if (u8gVar == null) {
                    u890.C("modelMapper");
                    throw null;
                }
                s8g s8gVar = t8gVar.a;
                if ((s8gVar instanceof a8g) || (s8gVar instanceof f8g)) {
                    i9gVar = new i9g(null, null, null, 14);
                } else if (s8gVar instanceof c8g) {
                    i9gVar = new i9g(u8gVar.c(), null, null, 13);
                } else if (s8gVar instanceof g8g) {
                    i9gVar = new i9g(null, null, null, 14);
                } else if (s8gVar instanceof d8g) {
                    i9gVar = new i9g(u8gVar.c(), null, null, 13);
                } else {
                    if (s8gVar instanceof h8g) {
                        i9gVar3 = new i9g(((h8g) s8gVar).b, null, null, 13);
                    } else if (s8gVar instanceof e8g) {
                        i9gVar3 = new i9g(null, ((e8g) s8gVar).b, null, 11);
                    } else if (s8gVar instanceof b8g) {
                        i9gVar3 = new i9g(null, null, ((b8g) s8gVar).a, 7);
                    } else if ((s8gVar instanceof j8g) || (s8gVar instanceof k8g) || (s8gVar instanceof l8g)) {
                        i9gVar = new i9g(null, null, null, 15);
                    } else if (s8gVar instanceof n8g) {
                        i9gVar = new i9g(null, null, null, 14);
                    } else if (s8gVar instanceof m8g) {
                        i9gVar3 = new i9g(null, ((m8g) s8gVar).b, null, 10);
                    } else {
                        if (s8gVar instanceof q8g) {
                            i9gVar2 = new i9g(((q8g) s8gVar).a ? u8gVar.b() : u8gVar.a(), null, null, 13);
                        } else if (s8gVar instanceof p8g) {
                            p8g p8gVar = (p8g) s8gVar;
                            i9gVar2 = new i9g(p8gVar.a ? u8gVar.b() : u8gVar.a(), p8gVar.c, null, 9);
                        } else if (s8gVar instanceof v7g) {
                            i9gVar = new i9g(null, null, null, 14);
                        } else if (s8gVar instanceof u7g) {
                            i9gVar3 = new i9g(null, ((u7g) s8gVar).b, null, 10);
                        } else if (s8gVar instanceof y7g) {
                            i9gVar = new i9g(u8gVar.b(), null, null, 13);
                        } else {
                            if (!(s8gVar instanceof x7g)) {
                                eg.o();
                                return;
                            }
                            i9gVar2 = new i9g(u8gVar.b(), ((x7g) s8gVar).b, null, 9);
                        }
                        i9gVar = i9gVar2;
                    }
                    i9gVar = i9gVar3;
                }
                r0.w1 = i9gVar;
                zf0 zf0Var = r0.r1;
                if (zf0Var == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                zf0Var.w.setVisibility(i9gVar.a ? 0 : 8);
                f9g f9gVar = r0.x1;
                f9g f9gVar2 = i9gVar.b;
                if (!u890.j(f9gVar, f9gVar2) && f9gVar2 != null) {
                    String str4 = f9gVar2.a;
                    String str5 = f9gVar2.b;
                    e9g e9gVar = f9gVar2.d;
                    String str6 = e9gVar != null ? e9gVar.a : null;
                    e9g e9gVar2 = f9gVar2.e;
                    Parcelable wvfVar = new wvf(str4, str5, str6, e9gVar2 != null ? e9gVar2.a : null);
                    dwf dwfVar = new dwf();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ARGS_KEY", wvfVar);
                    dwfVar.T0(bundle);
                    dwfVar.h1(((tg30) ((dg30) r0).U0.b).g, "TAG_ERROR_DIALOG");
                    View view = ((zf30) dwfVar).j1;
                    if (view != null) {
                        r0.n0().a(view, new h5g(r0, (byte) 6));
                    }
                }
                r0.x1 = f9gVar2;
                zf0 zf0Var2 = r0.r1;
                if (zf0Var2 == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                Toolbar toolbar = zf0Var2.z;
                g9g g9gVar = i9gVar.d;
                h9g h9gVar = i9gVar.c;
                toolbar.setVisibility((h9gVar == null && g9gVar == null) ? 8 : 0);
                zf0 zf0Var3 = r0.r1;
                if (zf0Var3 == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                zf0Var3.A.setVisibility(h9gVar != null ? 0 : 8);
                zf0 zf0Var4 = r0.r1;
                if (zf0Var4 == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                zf0Var4.E.setVisibility(((h9gVar == null || (d5gVarG = h9gVar.g()) == null) ? null : d5gVarG.e) != null ? 0 : 8);
                if (h9gVar != null) {
                    String str7 = h9gVar.a;
                    y8g y8gVar = h9gVar.g;
                    d5g d5gVar = h9gVar.d;
                    sce sceVar = h9gVar.f;
                    r0.p0(str7);
                    d5g d5gVarG2 = h9gVar.g();
                    i5l1 i5l1Var4 = d5gVarG2 != null ? d5gVarG2.e : null;
                    if (i5l1Var4 == null || (j5l1Var = i5l1Var4.b) == null) {
                        th = null;
                    } else {
                        plm plmVar = new plm((Context) r0, j5l1Var.b);
                        TypedValue typedValue = new TypedValue();
                        TypedValue typedValue2 = new TypedValue();
                        th = null;
                        plmVar.getTheme().resolveAttribute(j5l1Var == j5l1.c ? 2130968742 : 2130968736, typedValue, true);
                        plmVar.getTheme().resolveAttribute(2130970418, typedValue2, true);
                        int i2 = typedValue.data;
                        int i3 = typedValue2.data;
                        zf0 zf0Var5 = r0.r1;
                        if (zf0Var5 == null) {
                            u890.C("viewBinding");
                            throw null;
                        }
                        zf0Var5.E.setBackgroundColor(i2);
                        zf0 zf0Var6 = r0.r1;
                        if (zf0Var6 == null) {
                            u890.C("viewBinding");
                            throw null;
                        }
                        zf0Var6.C.setTextColor(i3);
                        zf0 zf0Var7 = r0.r1;
                        if (zf0Var7 == null) {
                            u890.C("viewBinding");
                            throw null;
                        }
                        zf0Var7.D.setTextColor(i3);
                        zf0 zf0Var8 = r0.r1;
                        if (zf0Var8 == null) {
                            u890.C("viewBinding");
                            throw null;
                        }
                        zf0Var8.B.setColorFilter(i3);
                    }
                    zf0 zf0Var9 = r0.r1;
                    if (zf0Var9 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    TextView textView = zf0Var9.C;
                    d5g d5gVarG3 = h9gVar.g();
                    if (d5gVarG3 != null) {
                        i5l1Var3 = d5gVarG3.e;
                    } else {
                        r3 = th;
                    }
                    if ((r3 != 0 ? r3.a : th) != null) {
                        r3 = i5l1Var3;
                        r3 = i5l1Var3;
                        i = 0;
                    } else {
                        r3 = i5l1Var3;
                        r3 = i5l1Var3;
                        i = 8;
                    }
                    textView.setVisibility(i);
                    zf0 zf0Var10 = r0.r1;
                    if (zf0Var10 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    ?? r2 = zf0Var10.C;
                    d5g d5gVarG4 = h9gVar.g();
                    if (d5gVarG4 != null) {
                        i5l1Var2 = d5gVarG4.e;
                    } else {
                        r4 = th;
                    }
                    if (r4 != 0) {
                        r4 = i5l1Var2;
                        r5 = r4.a;
                    } else {
                        r4 = i5l1Var2;
                        r5 = th;
                    }
                    r2.setText(r5);
                    zf0 zf0Var11 = r0.r1;
                    if (zf0Var11 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    ?? r7 = zf0Var11.D;
                    d5g d5gVarG5 = h9gVar.g();
                    if (d5gVarG5 != null) {
                        i5l1Var = d5gVarG5.e;
                    } else {
                        r6 = th;
                    }
                    if (r6 != 0) {
                        List list3 = r6.c;
                        if (list3.size() > 1) {
                            r6 = i5l1Var;
                            z = true;
                        } else {
                            r6 = i5l1Var;
                            z = false;
                        }
                        C = ryo1.C(list3, z);
                    } else {
                        r6 = i5l1Var;
                        C = th;
                    }
                    r7.setText(C);
                    zf0 zf0Var12 = r0.r1;
                    if (zf0Var12 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var12.l.setVisibility(y8gVar != null ? 0 : 8);
                    zf0 zf0Var13 = r0.r1;
                    if (zf0Var13 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var13.l.setText((y8gVar == null || (str3 = y8gVar.a) == null) ? th : ryo1.D(str3));
                    dtw dtwVar = r0.s1;
                    if (dtwVar == null) {
                        u890.C("contentLineItem");
                        throw th;
                    }
                    d5g d5gVarG6 = h9gVar.g();
                    if (d5gVarG6 == null || (xhc0Var = d5gVarG6.f) == null) {
                        xhc0Var = d5gVar.f;
                    }
                    dtwVar.f(xhc0Var);
                    zf0 zf0Var14 = r0.r1;
                    if (zf0Var14 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var14.e.setText(h9gVar.b);
                    zf0 zf0Var15 = r0.r1;
                    if (zf0Var15 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var15.d.setText(h9gVar.c);
                    zf0 zf0Var16 = r0.r1;
                    if (zf0Var16 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    TextView textView2 = zf0Var16.y;
                    d5g d5gVar2 = h9gVar.e;
                    textView2.setText(d5gVar.c);
                    zf0 zf0Var17 = r0.r1;
                    if (zf0Var17 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var17.x.setSelected(d5gVar.a);
                    zf0 zf0Var18 = r0.r1;
                    if (zf0Var18 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var18.q.setText(d5gVar2.c);
                    zf0 zf0Var19 = r0.r1;
                    if (zf0Var19 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var19.p.setSelected(d5gVar2.a);
                    zf0 zf0Var20 = r0.r1;
                    if (zf0Var20 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var20.i.setBackgroundResource(h9gVar.b() != null ? 2131100249 : 2131100248);
                    zf0 zf0Var21 = r0.r1;
                    if (zf0Var21 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var21.b.setVisibility(h9gVar.b() != null ? 0 : 8);
                    lra lraVarB = h9gVar.b();
                    if (lraVarB != null) {
                        zf0 zf0Var22 = r0.r1;
                        if (zf0Var22 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        CardView cardView = zf0Var22.g;
                        nra nraVar = lraVarB.a;
                        ora oraVar = lraVarB.e;
                        cardView.setVisibility(nraVar != null ? 0 : 8);
                        zf0 zf0Var23 = r0.r1;
                        if (zf0Var23 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var23.h.setText(nraVar != null ? nraVar.a : th);
                        zf0 zf0Var24 = r0.r1;
                        if (zf0Var24 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var24.f.setVisibility((nraVar != null ? nraVar.b : th) != null ? 0 : 8);
                        zf0 zf0Var25 = r0.r1;
                        if (zf0Var25 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var25.f.setText((nraVar == null || (tcoVar = nraVar.b) == null || (str2 = tcoVar.a) == null) ? th : ryo1.D(str2));
                        zf0 zf0Var26 = r0.r1;
                        if (zf0Var26 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var26.c.setText(Html.fromHtml(lraVarB.b, 0));
                        ((xb30) r0.u1.getValue()).A(lraVarB.c);
                        zf0 zf0Var27 = r0.r1;
                        if (zf0Var27 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        a layoutManager = zf0Var27.o.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.H0(0);
                        }
                        zf0 zf0Var28 = r0.r1;
                        if (zf0Var28 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var28.t.setVisibility(oraVar != null ? 0 : 8);
                        if (oraVar != null) {
                            zf0 zf0Var29 = r0.r1;
                            if (zf0Var29 == null) {
                                u890.C("viewBinding");
                                throw th;
                            }
                            zf0Var29.u.setText(oraVar.a);
                            zf0 zf0Var30 = r0.r1;
                            if (zf0Var30 == null) {
                                u890.C("viewBinding");
                                throw th;
                            }
                            zf0Var30.s.setChecked(oraVar.b);
                        }
                        zf0 zf0Var31 = r0.r1;
                        if (zf0Var31 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var31.n.setEnabled(lraVarB.f);
                        zf0 zf0Var32 = r0.r1;
                        if (zf0Var32 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var32.n.setText(lraVarB.g);
                    }
                    zf0 zf0Var33 = r0.r1;
                    if (zf0Var33 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    TextView textView3 = zf0Var33.v;
                    lra lraVarB2 = h9gVar.b();
                    textView3.setVisibility((lraVarB2 == null || (list2 = lraVarB2.i) == null || !(list2.isEmpty() ^ true)) ? 8 : 0);
                    lra lraVarB3 = h9gVar.b();
                    if (lraVarB3 != null && (list = lraVarB3.i) != null) {
                        zf0 zf0Var34 = r0.r1;
                        if (zf0Var34 == null) {
                            u890.C("viewBinding");
                            throw th;
                        }
                        zf0Var34.v.setText(ryo1.C(list, false));
                    }
                    zf0 zf0Var35 = r0.r1;
                    if (zf0Var35 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var35.k.setVisibility(sceVar != null ? 0 : 8);
                    zf0 zf0Var36 = r0.r1;
                    if (zf0Var36 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var36.k.setText(sceVar != null ? sceVar.a : th);
                    zf0 zf0Var37 = r0.r1;
                    if (zf0Var37 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var37.j.setVisibility(sceVar != null ? 0 : 8);
                    zf0 zf0Var38 = r0.r1;
                    if (zf0Var38 == null) {
                        u890.C("viewBinding");
                        throw th;
                    }
                    zf0Var38.j.setText((sceVar == null || (str = sceVar.b) == null) ? th : ryo1.D(str));
                } else {
                    th = null;
                }
                zf0 zf0Var39 = r0.r1;
                if (zf0Var39 == null) {
                    u890.C("viewBinding");
                    throw th;
                }
                zf0Var39.r.setVisibility(g9gVar != null ? 0 : 8);
                if (g9gVar != null) {
                    r0.p0(g9gVar.a);
                    dtw dtwVar2 = r0.t1;
                    if (dtwVar2 != null) {
                        dtwVar2.f(g9gVar.b);
                        return;
                    } else {
                        u890.C("itemUnavailableVh");
                        throw th;
                    }
                }
                return;
            case 1:
                f5g f5gVar2 = ChoiceScreenUcActivity.y1;
                r0.q0((c6g) obj);
                return;
            default:
                f5g f5gVar3 = ChoiceScreenUcActivity.y1;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    r0.q0((c6g) it.next());
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
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
            case 0:
                return new tv30(1, this.b, ChoiceScreenUcActivity.class, "render", "render(Lcom/spotify/gpb/choicescreenuc/domain/ChoiceScreenUcModel;)V", 0);
            case 1:
                return new tv30(1, this.b, ChoiceScreenUcActivity.class, "trigger", "trigger(Lcom/spotify/gpb/choicescreenuc/domain/ChoiceScreenUcEffect$ChoiceScreenUcViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, ChoiceScreenUcActivity.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
