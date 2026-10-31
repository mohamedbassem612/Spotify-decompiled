package com.spotify.yourlibrary.uiusecases.filterrow.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.bno1;
import p.iu30;
import p.pze0;
import p.tlv;
import p.u890;
import p.v4c0;
import p.w4c0;
import p.wb00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/spotify/yourlibrary/uiusecases/filterrow/chips/LibraryChipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lp/tlv;", "", "", "Lp/ud20;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Y0", "Z", "getRequireModelUpdate$src_main_java_com_spotify_yourlibrary_uiusecases_filterrow_filterrow", "()Z", "setRequireModelUpdate$src_main_java_com_spotify_yourlibrary_uiusecases_filterrow_filterrow", "(Z)V", "requireModelUpdate", "src_main_java_com_spotify_yourlibrary_uiusecases_filterrow-filterrow"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LibraryChipsView extends ConstraintLayout implements tlv {
    public final wb00 T0;
    public final w4c0 U0;
    public final v4c0 V0;
    public List W0;
    public iu30 X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public boolean requireModelUpdate;
    public final AtomicBoolean Z0;
    public final AtomicBoolean a1;
    public int b1;

    public LibraryChipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T0 = new wb00(this, (byte) 28);
        this.U0 = new w4c0(this);
        this.V0 = new v4c0(context);
        this.Z0 = new AtomicBoolean(false);
        this.a1 = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Object obj) {
        List list = (List) obj;
        if (this.requireModelUpdate) {
            this.Z0.set(false);
        }
        if (u890.j(this.W0, list)) {
            return;
        }
        List list2 = this.W0;
        if ((list2 == null || list2.isEmpty()) && list.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
        }
        v4c0 v4c0Var = this.V0;
        ConstraintLayout constraintLayout = v4c0Var.a;
        constraintLayout.removeAllViews();
        v4c0Var.b.w(list, w4c0.f).b(constraintLayout);
        int i = v4c0.c;
        constraintLayout.measure(i, i);
        int paddingRight = getPaddingRight() + getPaddingLeft() + constraintLayout.getMeasuredWidth();
        if (this.b1 != paddingRight) {
            this.b1 = paddingRight;
            this.a1.set(true);
            requestLayout();
        }
        removeAllViews();
        setConstraintSet(this.U0.w(list, this.T0));
        this.W0 = list;
    }

    /* JADX INFO: renamed from: getRequireModelUpdate$src_main_java_com_spotify_yourlibrary_uiusecases_filterrow_filterrow, reason: from getter */
    public final boolean getRequireModelUpdate() {
        return this.requireModelUpdate;
    }

    public final void n(iu30 iu30Var) {
        if (this.requireModelUpdate) {
            this.Z0.set(false);
        }
        this.X0 = iu30Var;
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b1;
        if (i3 >= size) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (i == i3 || !this.a1.compareAndSet(true, false)) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof HorizontalScrollView) {
            ((HorizontalScrollView) parent).fullScroll(bno1.t(this) ? 66 : 17);
        }
    }

    public final void setRequireModelUpdate$src_main_java_com_spotify_yourlibrary_uiusecases_filterrow_filterrow(boolean z) {
        this.requireModelUpdate = z;
    }

    public LibraryChipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LibraryChipsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ LibraryChipsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
