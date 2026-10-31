package com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.cy30;
import p.g611;
import p.gf6;
import p.hhg1;
import p.izb1;
import p.jzb1;
import p.lzm;
import p.m551;
import p.n611;
import p.ngf;
import p.os00;
import p.p0g;
import p.pn;
import p.s611;
import p.v3v0;
import p.w611;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/nowplayingqueue/bottomsheet/view/layoutmanager/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "p/pn", "src_main_java_com_spotify_nowplayingqueue_bottomsheet-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    public final z511 g1;
    public final v3v0 h1;
    public final ArrayList i1;
    public View j1;
    public int k1;
    public int l1;
    public int m1;

    public StickyHeaderLinearLayoutManager(Context context, z511 z511Var, v3v0 v3v0Var) {
        super(1);
        this.g1 = z511Var;
        this.h1 = v3v0Var;
        this.i1 = new ArrayList();
        pn pnVar = new pn(this, (byte) 5);
        this.k1 = -1;
        this.l1 = -1;
        z511Var.w(pnVar);
    }

    public final int A(s611 s611Var) {
        return ((Number) M1(new izb1(this, s611Var, (byte) 4))).intValue();
    }

    public final int B(s611 s611Var) {
        return ((Number) M1(new izb1(this, s611Var, (byte) 5))).intValue();
    }

    public final int G0(int i, n611 n611Var, s611 s611Var) {
        int iIntValue = ((Number) M1(new jzb1(this, i, n611Var, s611Var, (byte) 0))).intValue();
        if (iIntValue != 0) {
            L1(n611Var, false);
        }
        return iIntValue;
    }

    public final void H0(int i) {
        w1(i, os00.INVALID_ID);
    }

    public final int H1(int i) {
        ArrayList arrayList = this.i1;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) arrayList.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else {
                if (((Number) arrayList.get(i3)).intValue() >= i) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int I0(int i, n611 n611Var, s611 s611Var) {
        int iIntValue = ((Number) M1(new jzb1(this, i, n611Var, s611Var, (byte) 1))).intValue();
        if (iIntValue != 0) {
            L1(n611Var, false);
        }
        return iIntValue;
    }

    public final int I1(int i) {
        ArrayList arrayList = this.i1;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) arrayList.get(i3)).intValue() <= i) {
                if (i3 < arrayList.size() - 1) {
                    i2 = i3 + 1;
                    if (((Number) arrayList.get(i2)).intValue() <= i) {
                    }
                }
                return i3;
            }
            size = i3 - 1;
        }
        return -1;
    }

    public final void J1(View view) {
        c0(view, 0);
        if (((LinearLayoutManager) this).Q0 == 1) {
            view.layout(getPaddingLeft(), 0, ((a) this).O0 - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), ((a) this).P0 - getPaddingBottom());
        }
    }

    public final void K1(n611 n611Var) {
        View view = this.j1;
        if (view == null) {
            return;
        }
        this.j1 = null;
        this.k1 = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        w611 w611VarU = RecyclerView.U(view);
        w611VarU.t &= -129;
        w611VarU.A();
        w611VarU.j(4);
        D0(view);
        if (n611Var != null) {
            n611Var.i(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    /* JADX WARN: Code duplicated, block: B:108:0x0211  */
    /* JADX WARN: Code duplicated, block: B:110:0x0215  */
    /* JADX WARN: Code duplicated, block: B:112:0x021d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0220  */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:116:0x0226  */
    /* JADX WARN: Code duplicated, block: B:119:0x022f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0232  */
    /* JADX WARN: Code duplicated, block: B:122:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:125:0x023b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0246 A[PHI: r3
      0x0246: PHI (r3v20 float) = (r3v19 float), (r3v23 float) binds: [B:130:0x0255, B:126:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0248  */
    /* JADX WARN: Code duplicated, block: B:132:0x0258  */
    /* JADX WARN: Code duplicated, block: B:135:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0263  */
    /* JADX WARN: Code duplicated, block: B:137:0x026e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0272  */
    /* JADX WARN: Code duplicated, block: B:141:0x027a  */
    /* JADX WARN: Code duplicated, block: B:142:0x027d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0280  */
    /* JADX WARN: Code duplicated, block: B:145:0x0283  */
    /* JADX WARN: Code duplicated, block: B:148:0x028c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0291  */
    /* JADX WARN: Code duplicated, block: B:151:0x0294  */
    /* JADX WARN: Code duplicated, block: B:153:0x0297  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a2 A[PHI: r0
      0x02a2: PHI (r0v13 float) = (r0v12 float), (r0v14 float) binds: [B:158:0x02b1, B:154:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e2  */
    public final void L1(n611 n611Var, boolean z) {
        boolean z2;
        View viewH;
        int iN;
        int i;
        View view;
        View viewD;
        View view2;
        w611 w611VarU;
        RecyclerView recyclerView;
        View view3;
        int iM;
        float f;
        g611 layoutParams;
        View view4;
        g611 g611Var;
        boolean z3;
        View view5;
        View viewH2;
        float width;
        float height;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i3;
        float top;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i4;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i5;
        float left;
        RecyclerView parent;
        RecyclerView recyclerView2;
        ArrayList arrayList = this.i1;
        int size = arrayList.size();
        int I = I();
        if (size > 0 && I > 0) {
            int i6 = 0;
            while (true) {
                z2 = ((LinearLayoutManager) this).U0;
                if (i6 >= I) {
                    viewH = null;
                    iN = -1;
                    i = -1;
                    break;
                }
                viewH = H(i6);
                viewH.getClass();
                g611 layoutParams5 = viewH.getLayoutParams();
                if (!layoutParams5.a.v() && !layoutParams5.a.t()) {
                    if (((LinearLayoutManager) this).Q0 == 1) {
                        if (z2) {
                            if (viewH.getTranslationY() + viewH.getTop() <= ((a) this).P0 + 0.0f) {
                                iN = layoutParams5.a.n();
                                i = i6;
                                break;
                            }
                        } else if (viewH.getBottom() - viewH.getTranslationY() >= 0.0f) {
                            iN = layoutParams5.a.n();
                            i = i6;
                            break;
                        }
                    } else if (z2) {
                        if (viewH.getTranslationX() + viewH.getLeft() <= ((a) this).O0 + 0.0f) {
                            iN = layoutParams5.a.n();
                            i = i6;
                            break;
                        }
                    } else if (viewH.getRight() - viewH.getTranslationX() >= 0.0f) {
                        iN = layoutParams5.a.n();
                        i = i6;
                        break;
                    }
                }
                i6++;
            }
            if (viewH != null && iN != -1) {
                int iI1 = I1(iN);
                int iIntValue = iI1 != -1 ? ((Number) arrayList.get(iI1)).intValue() : -1;
                int i7 = iI1 + 1;
                int iIntValue2 = size > i7 ? ((Number) arrayList.get(i7)).intValue() : -1;
                if (iIntValue != -1) {
                    if (iIntValue != iN) {
                        if (iIntValue2 != iIntValue + 1) {
                            view = this.j1;
                            if (view != null && RecyclerView.U(view).f != this.g1.g(iIntValue)) {
                                K1(n611Var);
                            }
                            viewD = this.j1;
                            if (viewD == null) {
                                viewD = n611Var.d(iIntValue);
                                l(viewD);
                                J1(viewD);
                                parent = viewD.getParent();
                                recyclerView2 = ((a) this).b;
                                if (parent == recyclerView2 || recyclerView2.indexOfChild(viewD) == -1) {
                                    hhg1.n("View should be fully attached to be ignored".concat(((a) this).b.G()));
                                    return;
                                }
                                w611 w611VarU2 = RecyclerView.U(viewD);
                                w611VarU2.j(SemanticState.Focused);
                                ((a) this).b.g.G(w611VarU2);
                                this.j1 = viewD;
                                this.k1 = iIntValue;
                            }
                            if (!z || a.V(viewD) != iIntValue) {
                                view2 = this.j1;
                                view2.getClass();
                                n611Var.getClass();
                                w611VarU = RecyclerView.U(view2);
                                recyclerView = n611Var.h;
                                if (w611VarU == null) {
                                    hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                    return;
                                }
                                view3 = w611VarU.a;
                                iM = recyclerView.e.m(iIntValue);
                                if (iM >= 0) {
                                    f = 0.0f;
                                    if (iM < recyclerView.P0.e()) {
                                        int i8 = iIntValue;
                                        n611Var.l(w611VarU, iM, i8, Long.MAX_VALUE);
                                        layoutParams = view3.getLayoutParams();
                                        if (layoutParams == null) {
                                            g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                            view4 = view3;
                                            view4.setLayoutParams(g611Var);
                                        } else {
                                            view4 = view3;
                                            if (recyclerView.checkLayoutParams(layoutParams)) {
                                                g611Var = layoutParams;
                                            } else {
                                                g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                view4.setLayoutParams(g611Var);
                                            }
                                        }
                                        g611Var.c = true;
                                        g611Var.a = w611VarU;
                                        if (view4.getParent() == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        g611Var.d = z3;
                                        this.k1 = i8;
                                        J1(view2);
                                        if (this.l1 != -1) {
                                            view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                        }
                                    }
                                }
                                StringBuilder sbQ = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                sbQ.append(recyclerView.H1.b());
                                sbQ.append(recyclerView.G());
                                throw new IndexOutOfBoundsException(sbQ.toString());
                            }
                            f = 0.0f;
                            view5 = this.j1;
                            if (view5 != null) {
                                if (iIntValue2 != -1 || (viewH2 = H((iIntValue2 - iN) + i)) == this.j1) {
                                    viewH2 = null;
                                }
                                if (((LinearLayoutManager) this).Q0 == 0) {
                                    if (z2) {
                                        width = f + (((a) this).O0 - view5.getWidth());
                                    } else {
                                        width = f;
                                    }
                                    if (viewH2 != null) {
                                        layoutParams3 = viewH2.getLayoutParams();
                                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                        } else {
                                            marginLayoutParams3 = null;
                                        }
                                        if (marginLayoutParams3 != null) {
                                            i4 = marginLayoutParams3.leftMargin;
                                        } else {
                                            i4 = 0;
                                        }
                                        layoutParams4 = viewH2.getLayoutParams();
                                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                            marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                        } else {
                                            marginLayoutParams4 = null;
                                        }
                                        if (marginLayoutParams4 != null) {
                                            i5 = marginLayoutParams4.rightMargin;
                                        } else {
                                            i5 = 0;
                                        }
                                        if (z2) {
                                            left = viewH2.getRight() + i5;
                                            if (left >= width) {
                                                width = left;
                                            }
                                        } else {
                                            left = (viewH2.getLeft() - i4) - view5.getWidth();
                                            if (left <= width) {
                                                width = left;
                                            }
                                        }
                                    }
                                } else {
                                    width = f;
                                }
                                view5.setTranslationX(width);
                                if (((LinearLayoutManager) this).Q0 == 1) {
                                    if (z2) {
                                        height = f + (((a) this).P0 - view5.getHeight());
                                    } else {
                                        height = f;
                                    }
                                    if (viewH2 != null) {
                                        layoutParams2 = viewH2.getLayoutParams();
                                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        } else {
                                            marginLayoutParams = null;
                                        }
                                        if (marginLayoutParams != null) {
                                            i2 = marginLayoutParams.bottomMargin;
                                        } else {
                                            i2 = 0;
                                        }
                                        ViewGroup.LayoutParams layoutParams6 = viewH2.getLayoutParams();
                                        marginLayoutParams2 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                                        if (marginLayoutParams2 != null) {
                                            i3 = marginLayoutParams2.topMargin;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (z2) {
                                            top = viewH2.getBottom() + i2;
                                            if (top >= height) {
                                                height = top;
                                            }
                                        } else {
                                            top = (viewH2.getTop() - i3) - view5.getHeight();
                                            if (top <= height) {
                                                height = top;
                                            }
                                        }
                                    }
                                } else {
                                    height = f;
                                }
                                view5.setTranslationY(height);
                                return;
                            }
                            return;
                        }
                    } else if (((LinearLayoutManager) this).Q0 == 1) {
                        if (z2) {
                            if (viewH.getBottom() - viewH.getTranslationY() > ((a) this).P0 + 0.0f) {
                                if (iIntValue2 != iIntValue + 1) {
                                    view = this.j1;
                                    if (view != null) {
                                        K1(n611Var);
                                    }
                                    viewD = this.j1;
                                    if (viewD == null) {
                                        viewD = n611Var.d(iIntValue);
                                        l(viewD);
                                        J1(viewD);
                                        parent = viewD.getParent();
                                        recyclerView2 = ((a) this).b;
                                        if (parent == recyclerView2) {
                                        }
                                        hhg1.n("View should be fully attached to be ignored".concat(((a) this).b.G()));
                                        return;
                                    }
                                    if (!z) {
                                        view2 = this.j1;
                                        view2.getClass();
                                        n611Var.getClass();
                                        w611VarU = RecyclerView.U(view2);
                                        recyclerView = n611Var.h;
                                        if (w611VarU == null) {
                                            hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                            return;
                                        }
                                        view3 = w611VarU.a;
                                        iM = recyclerView.e.m(iIntValue);
                                        if (iM >= 0) {
                                            f = 0.0f;
                                            if (iM < recyclerView.P0.e()) {
                                                int i9 = iIntValue;
                                                n611Var.l(w611VarU, iM, i9, Long.MAX_VALUE);
                                                layoutParams = view3.getLayoutParams();
                                                if (layoutParams == null) {
                                                    g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                                    view4 = view3;
                                                    view4.setLayoutParams(g611Var);
                                                } else {
                                                    view4 = view3;
                                                    if (recyclerView.checkLayoutParams(layoutParams)) {
                                                        g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                        view4.setLayoutParams(g611Var);
                                                    } else {
                                                        g611Var = layoutParams;
                                                    }
                                                }
                                                g611Var.c = true;
                                                g611Var.a = w611VarU;
                                                if (view4.getParent() == null) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                g611Var.d = z3;
                                                this.k1 = i9;
                                                J1(view2);
                                                if (this.l1 != -1) {
                                                    view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                                }
                                            }
                                        }
                                        StringBuilder sbQ2 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                        sbQ2.append(recyclerView.H1.b());
                                        sbQ2.append(recyclerView.G());
                                        throw new IndexOutOfBoundsException(sbQ2.toString());
                                    }
                                    view2 = this.j1;
                                    view2.getClass();
                                    n611Var.getClass();
                                    w611VarU = RecyclerView.U(view2);
                                    recyclerView = n611Var.h;
                                    if (w611VarU == null) {
                                        hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                        return;
                                    }
                                    view3 = w611VarU.a;
                                    iM = recyclerView.e.m(iIntValue);
                                    if (iM >= 0) {
                                        f = 0.0f;
                                        if (iM < recyclerView.P0.e()) {
                                            int i10 = iIntValue;
                                            n611Var.l(w611VarU, iM, i10, Long.MAX_VALUE);
                                            layoutParams = view3.getLayoutParams();
                                            if (layoutParams == null) {
                                                g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                                view4 = view3;
                                                view4.setLayoutParams(g611Var);
                                            } else {
                                                view4 = view3;
                                                if (recyclerView.checkLayoutParams(layoutParams)) {
                                                    g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                    view4.setLayoutParams(g611Var);
                                                } else {
                                                    g611Var = layoutParams;
                                                }
                                            }
                                            g611Var.c = true;
                                            g611Var.a = w611VarU;
                                            if (view4.getParent() == null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            g611Var.d = z3;
                                            this.k1 = i10;
                                            J1(view2);
                                            if (this.l1 != -1) {
                                                view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                            }
                                        }
                                    }
                                    StringBuilder sbQ3 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                    sbQ3.append(recyclerView.H1.b());
                                    sbQ3.append(recyclerView.G());
                                    throw new IndexOutOfBoundsException(sbQ3.toString());
                                    view5 = this.j1;
                                    if (view5 != null) {
                                        if (iIntValue2 != -1) {
                                            viewH2 = null;
                                        } else {
                                            viewH2 = null;
                                        }
                                        if (((LinearLayoutManager) this).Q0 == 0) {
                                            if (z2) {
                                                width = f + (((a) this).O0 - view5.getWidth());
                                            } else {
                                                width = f;
                                            }
                                            if (viewH2 != null) {
                                                layoutParams3 = viewH2.getLayoutParams();
                                                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                                } else {
                                                    marginLayoutParams3 = null;
                                                }
                                                if (marginLayoutParams3 != null) {
                                                    i4 = marginLayoutParams3.leftMargin;
                                                } else {
                                                    i4 = 0;
                                                }
                                                layoutParams4 = viewH2.getLayoutParams();
                                                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                                    marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                                } else {
                                                    marginLayoutParams4 = null;
                                                }
                                                if (marginLayoutParams4 != null) {
                                                    i5 = marginLayoutParams4.rightMargin;
                                                } else {
                                                    i5 = 0;
                                                }
                                                if (z2) {
                                                    left = viewH2.getRight() + i5;
                                                    if (left >= width) {
                                                        width = left;
                                                    }
                                                } else {
                                                    left = (viewH2.getLeft() - i4) - view5.getWidth();
                                                    if (left <= width) {
                                                        width = left;
                                                    }
                                                }
                                            }
                                        } else {
                                            width = f;
                                        }
                                        view5.setTranslationX(width);
                                        if (((LinearLayoutManager) this).Q0 == 1) {
                                            if (z2) {
                                                height = f + (((a) this).P0 - view5.getHeight());
                                            } else {
                                                height = f;
                                            }
                                            if (viewH2 != null) {
                                                layoutParams2 = viewH2.getLayoutParams();
                                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                                } else {
                                                    marginLayoutParams = null;
                                                }
                                                if (marginLayoutParams != null) {
                                                    i2 = marginLayoutParams.bottomMargin;
                                                } else {
                                                    i2 = 0;
                                                }
                                                ViewGroup.LayoutParams layoutParams7 = viewH2.getLayoutParams();
                                                if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                                                }
                                                if (marginLayoutParams2 != null) {
                                                    i3 = marginLayoutParams2.topMargin;
                                                } else {
                                                    i3 = 0;
                                                }
                                                if (z2) {
                                                    top = viewH2.getBottom() + i2;
                                                    if (top >= height) {
                                                        height = top;
                                                    }
                                                } else {
                                                    top = (viewH2.getTop() - i3) - view5.getHeight();
                                                    if (top <= height) {
                                                        height = top;
                                                    }
                                                }
                                            }
                                        } else {
                                            height = f;
                                        }
                                        view5.setTranslationY(height);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if (viewH.getTranslationY() + viewH.getTop() < 0.0f) {
                            if (iIntValue2 != iIntValue + 1) {
                                view = this.j1;
                                if (view != null) {
                                    K1(n611Var);
                                }
                                viewD = this.j1;
                                if (viewD == null) {
                                    viewD = n611Var.d(iIntValue);
                                    l(viewD);
                                    J1(viewD);
                                    parent = viewD.getParent();
                                    recyclerView2 = ((a) this).b;
                                    if (parent == recyclerView2) {
                                    }
                                    hhg1.n("View should be fully attached to be ignored".concat(((a) this).b.G()));
                                    return;
                                }
                                if (!z) {
                                    view2 = this.j1;
                                    view2.getClass();
                                    n611Var.getClass();
                                    w611VarU = RecyclerView.U(view2);
                                    recyclerView = n611Var.h;
                                    if (w611VarU == null) {
                                        hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                        return;
                                    }
                                    view3 = w611VarU.a;
                                    iM = recyclerView.e.m(iIntValue);
                                    if (iM >= 0) {
                                        f = 0.0f;
                                        if (iM < recyclerView.P0.e()) {
                                            int i11 = iIntValue;
                                            n611Var.l(w611VarU, iM, i11, Long.MAX_VALUE);
                                            layoutParams = view3.getLayoutParams();
                                            if (layoutParams == null) {
                                                g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                                view4 = view3;
                                                view4.setLayoutParams(g611Var);
                                            } else {
                                                view4 = view3;
                                                if (recyclerView.checkLayoutParams(layoutParams)) {
                                                    g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                    view4.setLayoutParams(g611Var);
                                                } else {
                                                    g611Var = layoutParams;
                                                }
                                            }
                                            g611Var.c = true;
                                            g611Var.a = w611VarU;
                                            if (view4.getParent() == null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            g611Var.d = z3;
                                            this.k1 = i11;
                                            J1(view2);
                                            if (this.l1 != -1) {
                                                view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                            }
                                        }
                                    }
                                    StringBuilder sbQ4 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                    sbQ4.append(recyclerView.H1.b());
                                    sbQ4.append(recyclerView.G());
                                    throw new IndexOutOfBoundsException(sbQ4.toString());
                                }
                                view2 = this.j1;
                                view2.getClass();
                                n611Var.getClass();
                                w611VarU = RecyclerView.U(view2);
                                recyclerView = n611Var.h;
                                if (w611VarU == null) {
                                    hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                    return;
                                }
                                view3 = w611VarU.a;
                                iM = recyclerView.e.m(iIntValue);
                                if (iM >= 0) {
                                    f = 0.0f;
                                    if (iM < recyclerView.P0.e()) {
                                        int i12 = iIntValue;
                                        n611Var.l(w611VarU, iM, i12, Long.MAX_VALUE);
                                        layoutParams = view3.getLayoutParams();
                                        if (layoutParams == null) {
                                            g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                            view4 = view3;
                                            view4.setLayoutParams(g611Var);
                                        } else {
                                            view4 = view3;
                                            if (recyclerView.checkLayoutParams(layoutParams)) {
                                                g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                view4.setLayoutParams(g611Var);
                                            } else {
                                                g611Var = layoutParams;
                                            }
                                        }
                                        g611Var.c = true;
                                        g611Var.a = w611VarU;
                                        if (view4.getParent() == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        g611Var.d = z3;
                                        this.k1 = i12;
                                        J1(view2);
                                        if (this.l1 != -1) {
                                            view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                        }
                                    }
                                }
                                StringBuilder sbQ5 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                sbQ5.append(recyclerView.H1.b());
                                sbQ5.append(recyclerView.G());
                                throw new IndexOutOfBoundsException(sbQ5.toString());
                                view5 = this.j1;
                                if (view5 != null) {
                                    if (iIntValue2 != -1) {
                                        viewH2 = null;
                                    } else {
                                        viewH2 = null;
                                    }
                                    if (((LinearLayoutManager) this).Q0 == 0) {
                                        if (z2) {
                                            width = f + (((a) this).O0 - view5.getWidth());
                                        } else {
                                            width = f;
                                        }
                                        if (viewH2 != null) {
                                            layoutParams3 = viewH2.getLayoutParams();
                                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                            } else {
                                                marginLayoutParams3 = null;
                                            }
                                            if (marginLayoutParams3 != null) {
                                                i4 = marginLayoutParams3.leftMargin;
                                            } else {
                                                i4 = 0;
                                            }
                                            layoutParams4 = viewH2.getLayoutParams();
                                            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                            } else {
                                                marginLayoutParams4 = null;
                                            }
                                            if (marginLayoutParams4 != null) {
                                                i5 = marginLayoutParams4.rightMargin;
                                            } else {
                                                i5 = 0;
                                            }
                                            if (z2) {
                                                left = viewH2.getRight() + i5;
                                                if (left >= width) {
                                                    width = left;
                                                }
                                            } else {
                                                left = (viewH2.getLeft() - i4) - view5.getWidth();
                                                if (left <= width) {
                                                    width = left;
                                                }
                                            }
                                        }
                                    } else {
                                        width = f;
                                    }
                                    view5.setTranslationX(width);
                                    if (((LinearLayoutManager) this).Q0 == 1) {
                                        if (z2) {
                                            height = f + (((a) this).P0 - view5.getHeight());
                                        } else {
                                            height = f;
                                        }
                                        if (viewH2 != null) {
                                            layoutParams2 = viewH2.getLayoutParams();
                                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                            } else {
                                                marginLayoutParams = null;
                                            }
                                            if (marginLayoutParams != null) {
                                                i2 = marginLayoutParams.bottomMargin;
                                            } else {
                                                i2 = 0;
                                            }
                                            ViewGroup.LayoutParams layoutParams8 = viewH2.getLayoutParams();
                                            if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                                            }
                                            if (marginLayoutParams2 != null) {
                                                i3 = marginLayoutParams2.topMargin;
                                            } else {
                                                i3 = 0;
                                            }
                                            if (z2) {
                                                top = viewH2.getBottom() + i2;
                                                if (top >= height) {
                                                    height = top;
                                                }
                                            } else {
                                                top = (viewH2.getTop() - i3) - view5.getHeight();
                                                if (top <= height) {
                                                    height = top;
                                                }
                                            }
                                        }
                                    } else {
                                        height = f;
                                    }
                                    view5.setTranslationY(height);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (z2) {
                        if (viewH.getRight() - viewH.getTranslationX() > ((a) this).O0 + 0.0f) {
                            if (iIntValue2 != iIntValue + 1) {
                                view = this.j1;
                                if (view != null) {
                                    K1(n611Var);
                                }
                                viewD = this.j1;
                                if (viewD == null) {
                                    viewD = n611Var.d(iIntValue);
                                    l(viewD);
                                    J1(viewD);
                                    parent = viewD.getParent();
                                    recyclerView2 = ((a) this).b;
                                    if (parent == recyclerView2) {
                                    }
                                    hhg1.n("View should be fully attached to be ignored".concat(((a) this).b.G()));
                                    return;
                                }
                                if (!z) {
                                    view2 = this.j1;
                                    view2.getClass();
                                    n611Var.getClass();
                                    w611VarU = RecyclerView.U(view2);
                                    recyclerView = n611Var.h;
                                    if (w611VarU == null) {
                                        hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                        return;
                                    }
                                    view3 = w611VarU.a;
                                    iM = recyclerView.e.m(iIntValue);
                                    if (iM >= 0) {
                                        f = 0.0f;
                                        if (iM < recyclerView.P0.e()) {
                                            int i13 = iIntValue;
                                            n611Var.l(w611VarU, iM, i13, Long.MAX_VALUE);
                                            layoutParams = view3.getLayoutParams();
                                            if (layoutParams == null) {
                                                g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                                view4 = view3;
                                                view4.setLayoutParams(g611Var);
                                            } else {
                                                view4 = view3;
                                                if (recyclerView.checkLayoutParams(layoutParams)) {
                                                    g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                    view4.setLayoutParams(g611Var);
                                                } else {
                                                    g611Var = layoutParams;
                                                }
                                            }
                                            g611Var.c = true;
                                            g611Var.a = w611VarU;
                                            if (view4.getParent() == null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            g611Var.d = z3;
                                            this.k1 = i13;
                                            J1(view2);
                                            if (this.l1 != -1) {
                                                view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                            }
                                        }
                                    }
                                    StringBuilder sbQ6 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                    sbQ6.append(recyclerView.H1.b());
                                    sbQ6.append(recyclerView.G());
                                    throw new IndexOutOfBoundsException(sbQ6.toString());
                                }
                                view2 = this.j1;
                                view2.getClass();
                                n611Var.getClass();
                                w611VarU = RecyclerView.U(view2);
                                recyclerView = n611Var.h;
                                if (w611VarU == null) {
                                    hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                    return;
                                }
                                view3 = w611VarU.a;
                                iM = recyclerView.e.m(iIntValue);
                                if (iM >= 0) {
                                    f = 0.0f;
                                    if (iM < recyclerView.P0.e()) {
                                        int i14 = iIntValue;
                                        n611Var.l(w611VarU, iM, i14, Long.MAX_VALUE);
                                        layoutParams = view3.getLayoutParams();
                                        if (layoutParams == null) {
                                            g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                            view4 = view3;
                                            view4.setLayoutParams(g611Var);
                                        } else {
                                            view4 = view3;
                                            if (recyclerView.checkLayoutParams(layoutParams)) {
                                                g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                view4.setLayoutParams(g611Var);
                                            } else {
                                                g611Var = layoutParams;
                                            }
                                        }
                                        g611Var.c = true;
                                        g611Var.a = w611VarU;
                                        if (view4.getParent() == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        g611Var.d = z3;
                                        this.k1 = i14;
                                        J1(view2);
                                        if (this.l1 != -1) {
                                            view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                        }
                                    }
                                }
                                StringBuilder sbQ7 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                sbQ7.append(recyclerView.H1.b());
                                sbQ7.append(recyclerView.G());
                                throw new IndexOutOfBoundsException(sbQ7.toString());
                                view5 = this.j1;
                                if (view5 != null) {
                                    if (iIntValue2 != -1) {
                                        viewH2 = null;
                                    } else {
                                        viewH2 = null;
                                    }
                                    if (((LinearLayoutManager) this).Q0 == 0) {
                                        if (z2) {
                                            width = f + (((a) this).O0 - view5.getWidth());
                                        } else {
                                            width = f;
                                        }
                                        if (viewH2 != null) {
                                            layoutParams3 = viewH2.getLayoutParams();
                                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                            } else {
                                                marginLayoutParams3 = null;
                                            }
                                            if (marginLayoutParams3 != null) {
                                                i4 = marginLayoutParams3.leftMargin;
                                            } else {
                                                i4 = 0;
                                            }
                                            layoutParams4 = viewH2.getLayoutParams();
                                            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                            } else {
                                                marginLayoutParams4 = null;
                                            }
                                            if (marginLayoutParams4 != null) {
                                                i5 = marginLayoutParams4.rightMargin;
                                            } else {
                                                i5 = 0;
                                            }
                                            if (z2) {
                                                left = viewH2.getRight() + i5;
                                                if (left >= width) {
                                                    width = left;
                                                }
                                            } else {
                                                left = (viewH2.getLeft() - i4) - view5.getWidth();
                                                if (left <= width) {
                                                    width = left;
                                                }
                                            }
                                        }
                                    } else {
                                        width = f;
                                    }
                                    view5.setTranslationX(width);
                                    if (((LinearLayoutManager) this).Q0 == 1) {
                                        if (z2) {
                                            height = f + (((a) this).P0 - view5.getHeight());
                                        } else {
                                            height = f;
                                        }
                                        if (viewH2 != null) {
                                            layoutParams2 = viewH2.getLayoutParams();
                                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                            } else {
                                                marginLayoutParams = null;
                                            }
                                            if (marginLayoutParams != null) {
                                                i2 = marginLayoutParams.bottomMargin;
                                            } else {
                                                i2 = 0;
                                            }
                                            ViewGroup.LayoutParams layoutParams9 = viewH2.getLayoutParams();
                                            if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                                            }
                                            if (marginLayoutParams2 != null) {
                                                i3 = marginLayoutParams2.topMargin;
                                            } else {
                                                i3 = 0;
                                            }
                                            if (z2) {
                                                top = viewH2.getBottom() + i2;
                                                if (top >= height) {
                                                    height = top;
                                                }
                                            } else {
                                                top = (viewH2.getTop() - i3) - view5.getHeight();
                                                if (top <= height) {
                                                    height = top;
                                                }
                                            }
                                        }
                                    } else {
                                        height = f;
                                    }
                                    view5.setTranslationY(height);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (viewH.getTranslationX() + viewH.getLeft() < 0.0f) {
                        if (iIntValue2 != iIntValue + 1) {
                            view = this.j1;
                            if (view != null) {
                                K1(n611Var);
                            }
                            viewD = this.j1;
                            if (viewD == null) {
                                viewD = n611Var.d(iIntValue);
                                l(viewD);
                                J1(viewD);
                                parent = viewD.getParent();
                                recyclerView2 = ((a) this).b;
                                if (parent == recyclerView2) {
                                }
                                hhg1.n("View should be fully attached to be ignored".concat(((a) this).b.G()));
                                return;
                            }
                            if (!z) {
                                view2 = this.j1;
                                view2.getClass();
                                n611Var.getClass();
                                w611VarU = RecyclerView.U(view2);
                                recyclerView = n611Var.h;
                                if (w611VarU == null) {
                                    hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                    return;
                                }
                                view3 = w611VarU.a;
                                iM = recyclerView.e.m(iIntValue);
                                if (iM >= 0) {
                                    f = 0.0f;
                                    if (iM < recyclerView.P0.e()) {
                                        int i15 = iIntValue;
                                        n611Var.l(w611VarU, iM, i15, Long.MAX_VALUE);
                                        layoutParams = view3.getLayoutParams();
                                        if (layoutParams == null) {
                                            g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                            view4 = view3;
                                            view4.setLayoutParams(g611Var);
                                        } else {
                                            view4 = view3;
                                            if (recyclerView.checkLayoutParams(layoutParams)) {
                                                g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                                view4.setLayoutParams(g611Var);
                                            } else {
                                                g611Var = layoutParams;
                                            }
                                        }
                                        g611Var.c = true;
                                        g611Var.a = w611VarU;
                                        if (view4.getParent() == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        g611Var.d = z3;
                                        this.k1 = i15;
                                        J1(view2);
                                        if (this.l1 != -1) {
                                            view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                        }
                                    }
                                }
                                StringBuilder sbQ8 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                sbQ8.append(recyclerView.H1.b());
                                sbQ8.append(recyclerView.G());
                                throw new IndexOutOfBoundsException(sbQ8.toString());
                            }
                            view2 = this.j1;
                            view2.getClass();
                            n611Var.getClass();
                            w611VarU = RecyclerView.U(view2);
                            recyclerView = n611Var.h;
                            if (w611VarU == null) {
                                hhg1.n("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter".concat(recyclerView.G()));
                                return;
                            }
                            view3 = w611VarU.a;
                            iM = recyclerView.e.m(iIntValue);
                            if (iM >= 0) {
                                f = 0.0f;
                                if (iM < recyclerView.P0.e()) {
                                    int i16 = iIntValue;
                                    n611Var.l(w611VarU, iM, i16, Long.MAX_VALUE);
                                    layoutParams = view3.getLayoutParams();
                                    if (layoutParams == null) {
                                        g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                                        view4 = view3;
                                        view4.setLayoutParams(g611Var);
                                    } else {
                                        view4 = view3;
                                        if (recyclerView.checkLayoutParams(layoutParams)) {
                                            g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                                            view4.setLayoutParams(g611Var);
                                        } else {
                                            g611Var = layoutParams;
                                        }
                                    }
                                    g611Var.c = true;
                                    g611Var.a = w611VarU;
                                    if (view4.getParent() == null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    g611Var.d = z3;
                                    this.k1 = i16;
                                    J1(view2);
                                    if (this.l1 != -1) {
                                        view2.getViewTreeObserver().addOnGlobalLayoutListener(new ngf(view2, this, (byte) 4));
                                    }
                                }
                            }
                            StringBuilder sbQ9 = cy30.q(iIntValue, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                            sbQ9.append(recyclerView.H1.b());
                            sbQ9.append(recyclerView.G());
                            throw new IndexOutOfBoundsException(sbQ9.toString());
                            view5 = this.j1;
                            if (view5 != null) {
                                if (iIntValue2 != -1) {
                                    viewH2 = null;
                                } else {
                                    viewH2 = null;
                                }
                                if (((LinearLayoutManager) this).Q0 == 0) {
                                    if (z2) {
                                        width = f + (((a) this).O0 - view5.getWidth());
                                    } else {
                                        width = f;
                                    }
                                    if (viewH2 != null) {
                                        layoutParams3 = viewH2.getLayoutParams();
                                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                        } else {
                                            marginLayoutParams3 = null;
                                        }
                                        if (marginLayoutParams3 != null) {
                                            i4 = marginLayoutParams3.leftMargin;
                                        } else {
                                            i4 = 0;
                                        }
                                        layoutParams4 = viewH2.getLayoutParams();
                                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                            marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                        } else {
                                            marginLayoutParams4 = null;
                                        }
                                        if (marginLayoutParams4 != null) {
                                            i5 = marginLayoutParams4.rightMargin;
                                        } else {
                                            i5 = 0;
                                        }
                                        if (z2) {
                                            left = viewH2.getRight() + i5;
                                            if (left >= width) {
                                                width = left;
                                            }
                                        } else {
                                            left = (viewH2.getLeft() - i4) - view5.getWidth();
                                            if (left <= width) {
                                                width = left;
                                            }
                                        }
                                    }
                                } else {
                                    width = f;
                                }
                                view5.setTranslationX(width);
                                if (((LinearLayoutManager) this).Q0 == 1) {
                                    if (z2) {
                                        height = f + (((a) this).P0 - view5.getHeight());
                                    } else {
                                        height = f;
                                    }
                                    if (viewH2 != null) {
                                        layoutParams2 = viewH2.getLayoutParams();
                                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        } else {
                                            marginLayoutParams = null;
                                        }
                                        if (marginLayoutParams != null) {
                                            i2 = marginLayoutParams.bottomMargin;
                                        } else {
                                            i2 = 0;
                                        }
                                        ViewGroup.LayoutParams layoutParams10 = viewH2.getLayoutParams();
                                        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
                                        }
                                        if (marginLayoutParams2 != null) {
                                            i3 = marginLayoutParams2.topMargin;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (z2) {
                                            top = viewH2.getBottom() + i2;
                                            if (top >= height) {
                                                height = top;
                                            }
                                        } else {
                                            top = (viewH2.getTop() - i3) - view5.getHeight();
                                            if (top <= height) {
                                                height = top;
                                            }
                                        }
                                    }
                                } else {
                                    height = f;
                                }
                                view5.setTranslationY(height);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (this.j1 != null) {
            K1(n611Var);
        }
    }

    public final Object M1(Function0 function0) {
        int iE;
        View view = this.j1;
        if (view != null && (iE = ((a) this).a.e(view)) >= 0) {
            p0g p0gVar = ((a) this).a;
            int iD = p0gVar.d(iE);
            p0gVar.b.L(iD);
            p0gVar.a.l(iD);
        }
        Object objInvoke = function0.invoke();
        View view2 = this.j1;
        if (view2 != null) {
            o(view2, -1);
        }
        return objInvoke;
    }

    public final PointF a(int i) {
        return (PointF) M1(new gf6(this, i, (byte) 13));
    }

    public final View i0(View view, int i, n611 n611Var, s611 s611Var) {
        return (View) M1(new lzm(i, this, view, n611Var, s611Var, (byte) 8));
    }

    public final void t0(n611 n611Var, s611 s611Var) {
        M1(new m551(this, n611Var, s611Var, (byte) 26));
        if (s611Var.g) {
            return;
        }
        L1(n611Var, true);
    }

    public final int w(s611 s611Var) {
        return ((Number) M1(new izb1(this, s611Var, (byte) 0))).intValue();
    }

    public final void w1(int i, int i2) {
        this.l1 = -1;
        this.m1 = os00.INVALID_ID;
        int iI1 = I1(i);
        if (iI1 == -1 || H1(i) != -1) {
            super.w1(i, i2);
            return;
        }
        int i3 = i - 1;
        if (H1(i3) != -1) {
            super.w1(i3, i2);
            return;
        }
        if (this.j1 == null || iI1 != H1(this.k1)) {
            this.l1 = i;
            this.m1 = i2;
            super.w1(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            super.w1(i, i2);
        }
    }

    public final int x(s611 s611Var) {
        return ((Number) M1(new izb1(this, s611Var, (byte) 1))).intValue();
    }

    public final int y(s611 s611Var) {
        return ((Number) M1(new izb1(this, s611Var, (byte) 2))).intValue();
    }

    public final int z(s611 s611Var) {
        return ((Number) M1(new izb1(this, s611Var, (byte) 3))).intValue();
    }
}
