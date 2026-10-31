package com.spotify.encoremobile.component.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.spotify.encoremobile.component.slottextview.EncorePretitleView;
import com.spotify.encoremobile.component.slottextview.EncoreSubtitleView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.bhn0;
import p.cch0;
import p.dcx;
import p.eg;
import p.gf91;
import p.hhg1;
import p.i5;
import p.if91;
import p.k8p1;
import p.m9;
import p.mka;
import p.nnz0;
import p.odx;
import p.pca;
import p.pdx;
import p.qhl;
import p.rbx;
import p.sbx;
import p.tcx;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/spotify/encoremobile/component/card/EncoreCard;", "Lp/tcx;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalSpacing", "Lp/rih1;", "setHorizontalSpacing", "(I)V", "verticalSpacing", "setVerticalSpacing", "titleSpacing", "setTitleSpacing", "Lp/pdx;", "R0", "Lp/pdx;", "getBinding", "()Lp/pdx;", "binding", "Lp/dcx;", "value", "S0", "Lp/dcx;", "getMediaAspectRatio", "()Lp/dcx;", "setMediaAspectRatio", "(Lp/dcx;)V", "mediaAspectRatio", "p/odx", "src_main_java_com_spotify_encoremobile_component_card-card"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EncoreCard extends tcx {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final pdx binding;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public dcx mediaAspectRatio;

    /* JADX WARN: Multi-variable type inference failed */
    public EncoreCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = new pdx(this);
        this.mediaAspectRatio = sbx.b;
        LayoutInflater.from(context).inflate(2131624573, (ViewGroup) this);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165742);
        cch0 cch0Var = ((MaterialCardView) this).g;
        cch0Var.b.set(0, dimensionPixelSize, 0, dimensionPixelSize);
        cch0Var.h();
        Context context2 = getContext();
        int[] iArr = nnz0.a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        setHorizontalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(2131165785)));
        setVerticalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(2131165787)));
        setTitleSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(2131165786)));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
        CharSequence string = typedArrayObtainStyledAttributes2.getString(1);
        if (string != null) {
            pca encorePretitleView = new EncorePretitleView(context, null, 2, null);
            encorePretitleView.setText(string);
            k8p1.o(c(gf91.b), encorePretitleView);
        }
        String string2 = typedArrayObtainStyledAttributes2.getString(2);
        if (string2 != null) {
            EncoreSubtitleView encoreSubtitleView = new EncoreSubtitleView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            encoreSubtitleView.setText(string2);
            k8p1.o(c(gf91.d), encoreSubtitleView);
        }
        String string3 = typedArrayObtainStyledAttributes2.getString(3);
        if (string3 != null) {
            EncoreTitleView encoreTitleView = new EncoreTitleView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            encoreTitleView.setText(string3);
            k8p1.o(c(gf91.c), encoreTitleView);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void setMediaAspectRatio(dcx dcxVar) {
        this.mediaAspectRatio = dcxVar;
        View viewC = c(gf91.a);
        qhl layoutParams = viewC.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = layoutParams;
        qhlVar.G = dcxVar.a;
        viewC.setLayoutParams(qhlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.m9 */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws m9 {
        if (view == null) {
            hhg1.n("Cannot add a null child view to a ViewGroup");
            return;
        }
        if (view.getParent() != null) {
            eg.m("The specified child already has a parent. You must call removeView() on the child's parent first.");
            return;
        }
        if (view.getId() == 2131428223) {
            super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
            return;
        }
        if (!(layoutParams instanceof if91)) {
            throw new m9((byte) 6);
        }
        if91 if91Var = (if91) layoutParams;
        gf91 gf91Var = if91Var.a;
        if (gf91Var == null) {
            throw new m9((byte) 6);
        }
        k8p1.o(c(gf91Var), view);
        if (gf91Var == gf91.a) {
            sbx sbxVar = if91Var.b;
            if (sbxVar instanceof rbx) {
                sbxVar = sbx.b;
            }
            setMediaAspectRatio(sbxVar);
        }
    }

    public final View c(gf91 gf91Var) {
        int iOrdinal = gf91Var.ordinal();
        pdx pdxVar = this.binding;
        switch (iOrdinal) {
            case 0:
                return pdxVar.a.findViewById(2131429948);
            case 1:
                return pdxVar.a.findViewById(2131429734);
            case 2:
                return pdxVar.a.findViewById(2131430482);
            case 3:
                return pdxVar.a.findViewById(2131431371);
            case 4:
                return pdxVar.a.findViewById(2131431125);
            case 5:
                return pdxVar.a.findViewById(2131431502);
            case 6:
                return pdxVar.a.findViewById(2131427732);
            case 7:
                return pdxVar.a.findViewById(2131428936);
            default:
                eg.o();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new if91(getContext(), attributeSet);
    }

    public final pdx getBinding() {
        return this.binding;
    }

    public final dcx getMediaAspectRatio() {
        return this.mediaAspectRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof odx)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        odx odxVar = (odx) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(((i5) odxVar).a);
        setMediaAspectRatio(mka.d(odxVar.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, p.i5, p.odx] */
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super/*android.view.View*/.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        ?? odxVar = new odx(parcelableOnSaveInstanceState);
        odxVar.c = "";
        odxVar.c = this.mediaAspectRatio.a;
        return odxVar;
    }

    public final void setHorizontalSpacing(int horizontalSpacing) {
        this.binding.a.findViewById(2131429138).setHorizontalGap(horizontalSpacing);
    }

    public final void setTitleSpacing(int titleSpacing) {
        this.binding.a.findViewById(2131431580).setVerticalGap(titleSpacing);
    }

    public final void setVerticalSpacing(int verticalSpacing) {
        this.binding.a.findViewById(2131427901).setVerticalGap(verticalSpacing);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: generateLayoutParams, reason: collision with other method in class */
    public final FrameLayout.LayoutParams m94generateLayoutParams(AttributeSet attributeSet) {
        return new if91(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FrameLayout.LayoutParams(layoutParams);
    }

    public EncoreCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreCard(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969250 : i);
    }
}
