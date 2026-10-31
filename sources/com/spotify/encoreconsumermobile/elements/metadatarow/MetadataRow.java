package com.spotify.encoreconsumermobile.elements.metadatarow;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aa80;
import p.amj0;
import p.bhn0;
import p.cmj0;
import p.dnz0;
import p.f46;
import p.i46;
import p.m5n1;
import p.mf20;
import p.nf20;
import p.o0c;
import p.o7h;
import p.ojj0;
import p.q7h;
import p.qhl;
import p.qlu;
import p.r7j0;
import p.sgg1;
import p.tw20;
import p.u890;
import p.ydh;
import p.z561;
import p.z6x;
import p.zpn1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/metadatarow/MetadataRow;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getCurrentSeparatorPositions", "()Ljava/util/List;", "Lp/cmj0;", "T0", "Lp/cmj0;", "getBinding", "()Lp/cmj0;", "binding", "U0", "I", "getSeparatorColor", "()I", "setSeparatorColor", "(I)V", "separatorColor", "p/amj0", "src_main_java_com_spotify_encoreconsumermobile_elements_metadatarow-metadatarow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MetadataRow extends ConstraintLayout {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final cmj0 binding;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public int separatorColor;

    /* JADX WARN: Multi-variable type inference failed */
    public MetadataRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625234, (ViewGroup) this);
        Flow flowT = m5n1.t(this, 2131428922);
        if (flowT == null) {
            bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(2131428922)));
            throw null;
        }
        this.binding = new cmj0(this, flowT);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dnz0.b, 0, 0);
        this.separatorColor = typedArrayObtainStyledAttributes.getColor(0, context.getColor(2131104462));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final List<Integer> getCurrentSeparatorPositions() {
        return z561.k0(new sgg1(new r7j0(this, (byte) 6), z561.T(ojj0.Y, new i46(this, (byte) 8))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(MetadataRow metadataRow, View view, boolean z) {
        metadataRow.getClass();
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        metadataRow.addView(view);
        amj0 amj0Var = (amj0) view.getLayoutParams();
        amj0Var.r0 = z;
        amj0Var.q0 = false;
        metadataRow.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        Iterator it = f46.O0(this.binding.a.getReferencedIds()).iterator();
        while (it.hasNext()) {
            removeView(findViewById(((Number) it.next()).intValue()));
        }
        B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        z6x z6xVarSingletonList;
        cmj0 cmj0Var = this.binding;
        Flow flow = cmj0Var.a;
        if (getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = getChildAt(0);
            if (childAt == null) {
                tw20.p();
                return;
            }
            if (i < getChildCount()) {
                z6x arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i < getChildCount())) {
                        z6xVarSingletonList = arrayList;
                        break;
                    }
                    int i2 = i + 1;
                    View childAt2 = getChildAt(i);
                    if (childAt2 == null) {
                        tw20.p();
                        return;
                    } else {
                        arrayList.add(childAt2);
                        i = i2;
                    }
                }
            } else {
                z6xVarSingletonList = Collections.singletonList(childAt);
            }
        } else {
            z6xVarSingletonList = z6x.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) z6xVarSingletonList) {
            if (!(((View) obj) instanceof Flow)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((View) it.next()).getId()));
        }
        flow.setReferencedIds(o7h.k1(arrayList3));
        cmj0Var.a.requestLayout();
    }

    public final qhl b() {
        return new amj0(-2, -2);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof amj0;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new amj0(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new amj0(layoutParams);
    }

    public final cmj0 getBinding() {
        return this.binding;
    }

    public final int getSeparatorColor() {
        return this.separatorColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        z6x z6xVarH;
        Object obj;
        nf20 nf20VarT = z561.T(ojj0.i, new i46(new i46(this, (byte) 8), (byte) 2));
        o0c.r(2, 1);
        qlu qluVar = new qlu(new mf20(z561.f0(ojj0.t, new i46(nf20VarT, (byte) 6))), ojj0.X);
        boolean zHasNext = qluVar.hasNext();
        z6x z6xVarSingletonList = z6x.a;
        if (zHasNext) {
            Object next = qluVar.next();
            if (qluVar.hasNext()) {
                z6xVarH = ydh.h(next);
                while (qluVar.hasNext()) {
                    z6xVarH.add(qluVar.next());
                }
            } else {
                z6xVarH = Collections.singletonList(next);
            }
        } else {
            z6xVarH = z6xVarSingletonList;
        }
        Iterable<aa80> iterable = (Iterable) z6xVarH;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((aa80) it.next()).a + 1));
        }
        if (!u890.j(getCurrentSeparatorPositions(), arrayList)) {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt == null) {
                    tw20.p();
                    return;
                }
                if (1 < getChildCount()) {
                    z6x arrayList2 = new ArrayList();
                    arrayList2.add(childAt);
                    int i3 = 1;
                    while (i3 < getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = getChildAt(i3);
                        if (childAt2 == null) {
                            tw20.p();
                            return;
                        } else {
                            arrayList2.add(childAt2);
                            i3 = i4;
                        }
                    }
                    z6xVarSingletonList = arrayList2;
                } else {
                    z6xVarSingletonList = Collections.singletonList(childAt);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((Iterable) z6xVarSingletonList).iterator();
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                obj = zpn1.a;
                if (!zHasNext2) {
                    break;
                }
                Object next2 = it2.next();
                if (((View) next2).getTag() == obj) {
                    arrayList3.add(next2);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                removeView((View) it3.next());
            }
            for (aa80 aa80Var : iterable) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(2131625235, (ViewGroup) this, false);
                TextView textView = (TextView) viewInflate;
                textView.setId(View.generateViewId());
                textView.setTag(obj);
                textView.setTextColor(this.separatorColor);
                addView(viewInflate, indexOfChild((View) aa80Var.b) + 1);
            }
            B();
        }
        super.onMeasure(i, i2);
    }

    public final void setSeparatorColor(int i) {
        this.separatorColor = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final amj0 p(AttributeSet attributeSet) {
        Context context = getContext();
        amj0 amj0Var = new amj0(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dnz0.a, 0, 0);
        amj0Var.r0 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        amj0Var.q0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return amj0Var;
    }

    public MetadataRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MetadataRow(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ MetadataRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
