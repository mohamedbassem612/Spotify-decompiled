package com.spotify.encoremobile.component.listrow;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.encoremobile.component.slottextview.EncorePretitleView;
import com.spotify.encoremobile.component.slottextview.EncoreSubtitleView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.ay31;
import p.b8k1;
import p.bhn0;
import p.cch0;
import p.dcx;
import p.eg;
import p.gf91;
import p.hhg1;
import p.if91;
import p.ivx;
import p.k8p1;
import p.kil;
import p.kvx;
import p.l1d;
import p.m5n1;
import p.m9;
import p.mka;
import p.pnz0;
import p.qhl;
import p.rbx;
import p.sbx;
import p.svx;
import p.t10;
import p.tcx;
import p.u890;
import p.ulb0;
import p.vlb0;
import p.wlb0;
import p.xe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001BB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00101\u001a\u00020*2\u0006\u0010\"\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00109\u001a\u0002022\u0006\u0010\"\u001a\u0002028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010A\u001a\u00020:2\u0006\u0010\"\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/spotify/encoremobile/component/listrow/EncoreListRow;", "Lp/tcx;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalSpacing", "Lp/rih1;", "setHorizontalSpacing", "(I)V", "verticalSpacing", "setVerticalSpacing", "titleSpacing", "setTitleSpacing", "width", "setLegacyMediaSize", "height", "setVariableMediaSize", "", "Lp/xe;", "actions", "setAdditionalAccessibilityActions", "(Ljava/util/List;)V", "Lp/kvx;", "R0", "Lp/kvx;", "getBinding", "()Lp/kvx;", "binding", "Lp/dcx;", "value", "S0", "Lp/dcx;", "getMediaAspectRatio", "()Lp/dcx;", "setMediaAspectRatio", "(Lp/dcx;)V", "mediaAspectRatio", "Lp/wlb0;", "T0", "Lp/wlb0;", "getVariableMediaWidth", "()Lp/wlb0;", "setVariableMediaWidth", "(Lp/wlb0;)V", "variableMediaWidth", "Lp/svx;", "U0", "Lp/svx;", "getLayoutSize", "()Lp/svx;", "setLayoutSize", "(Lp/svx;)V", "layoutSize", "Lp/ay31;", "V0", "Lp/ay31;", "getRowType", "()Lp/ay31;", "setRowType", "(Lp/ay31;)V", "rowType", "p/ivx", "src_main_java_com_spotify_encoremobile_component_listrow-listrow"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EncoreListRow extends tcx {
    public static final /* synthetic */ int X0 = 0;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final kvx binding;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public dcx mediaAspectRatio;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public wlb0 variableMediaWidth;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public svx layoutSize;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public ay31 rowType;
    public final t10 W0;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public EncoreListRow(Context context, AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        super(context, attributeSet, i);
        this.binding = new kvx(this);
        this.mediaAspectRatio = sbx.b;
        this.variableMediaWidth = ulb0.a;
        this.layoutSize = svx.LARGE;
        this.rowType = ay31.Regular;
        this.W0 = new t10(this);
        LayoutInflater.from(context).inflate(2131624574, this);
        ((Barrier) findViewById(2131429080)).setReferencedIds(m5n1.b);
        ((Barrier) findViewById(2131428630)).setReferencedIds(m5n1.c);
        cch0 cch0Var = this.g;
        cch0Var.b.set(0, 0, 0, 0);
        cch0Var.h();
        Context context2 = getContext();
        int[] iArr = pnz0.a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 2);
        for (svx svxVar : svx.values()) {
            if (svxVar.ordinal() == i2) {
                setLayoutSize(svxVar);
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    setHorizontalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(this.layoutSize.f)));
                }
                if (typedArrayObtainStyledAttributes.hasValue(7)) {
                    setVerticalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(this.layoutSize.e)));
                }
                if (typedArrayObtainStyledAttributes.hasValue(7)) {
                    setTitleSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(this.layoutSize.g)));
                }
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr, i, 0);
                int i3 = typedArrayObtainStyledAttributes2.getInt(3, 0);
                for (ay31 ay31Var : ay31.values()) {
                    if (ay31Var.ordinal() == i3) {
                        setRowType(ay31Var);
                        typedArrayObtainStyledAttributes2.recycle();
                        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr);
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        if (string != null) {
                            EncorePretitleView encorePretitleView = new EncorePretitleView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
                            encorePretitleView.setText(string);
                            k8p1.o(c(gf91.b), encorePretitleView);
                        }
                        String string2 = typedArrayObtainStyledAttributes3.getString(4);
                        if (string2 != null) {
                            EncoreSubtitleView encoreSubtitleView = new EncoreSubtitleView(context, null, 2, null);
                            encoreSubtitleView.setText(string2);
                            k8p1.o(c(gf91.d), encoreSubtitleView);
                        }
                        String string3 = typedArrayObtainStyledAttributes3.getString(5);
                        if (string3 != null) {
                            EncoreTitleView encoreTitleView = new EncoreTitleView(context, null, 2, null);
                            encoreTitleView.setText(string3);
                            k8p1.o(c(gf91.c), encoreTitleView);
                        }
                        typedArrayObtainStyledAttributes3.recycle();
                        b8k1.p(this, this.W0);
                        return;
                    }
                }
                bhn0.t("Array contains no element matching the predicate.");
                throw null;
            }
        }
        bhn0.t("Array contains no element matching the predicate.");
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.m9 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws NoWhenBranchMatchedException, m9 {
        if (view == null) {
            hhg1.n("Cannot add a null child view to a ViewGroup");
            return;
        }
        if (view.getParent() != null) {
            eg.m("The specified child already has a parent. You must call removeView() on the child's parent first.");
            return;
        }
        if (view.getId() == 2131428631) {
            super.addView(view, i, layoutParams);
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
            dcx dcxVar = if91Var.b;
            if (dcxVar instanceof rbx) {
                dcxVar = sbx.b;
            }
            setMediaAspectRatio(dcxVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final View c(gf91 gf91Var) throws NoWhenBranchMatchedException {
        int iOrdinal = gf91Var.ordinal();
        kvx kvxVar = this.binding;
        switch (iOrdinal) {
            case 0:
                return kvxVar.b();
            case 1:
                return kvxVar.a.findViewById(2131429734);
            case 2:
                return kvxVar.a.findViewById(2131430482);
            case 3:
                return kvxVar.a.findViewById(2131431371);
            case 4:
                return kvxVar.c();
            case 5:
                return kvxVar.d();
            case 6:
                return kvxVar.a.findViewById(2131427732);
            case 7:
                return kvxVar.a.findViewById(2131428936);
            default:
                eg.o();
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d() throws NoWhenBranchMatchedException {
        f(getResources().getDimensionPixelSize(this.layoutSize.c), getResources().getDimensionPixelSize(this.layoutSize.d), getResources().getDimensionPixelSize(this.layoutSize.a), getResources().getDimensionPixelSize(this.layoutSize.b));
        setVerticalSpacing(getResources().getDimensionPixelSize(this.layoutSize.e));
        setHorizontalSpacing(getResources().getDimensionPixelSize(this.layoutSize.f));
        setTitleSpacing(getResources().getDimensionPixelSize(this.layoutSize.g));
        setMinimumHeight(getResources().getDimensionPixelSize(this.layoutSize.i));
        e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e() throws NoWhenBranchMatchedException {
        int dimensionPixelSize;
        wlb0 wlb0Var = this.variableMediaWidth;
        vlb0 vlb0Var = wlb0Var instanceof vlb0 ? (vlb0) wlb0Var : null;
        if (vlb0Var == null) {
            setLegacyMediaSize(getResources().getDimensionPixelSize(this.layoutSize.h));
            return;
        }
        int iC = l1d.C(vlb0Var.a);
        if (iC == 0) {
            dimensionPixelSize = getResources().getDimensionPixelSize(this.layoutSize.h);
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            dimensionPixelSize = getResources().getDimensionPixelSize(2131165886);
        }
        setVariableMediaSize(dimensionPixelSize);
    }

    public final void f(int i, int i2, int i3, int i4) {
        kvx kvxVar = this.binding;
        ((Guideline) kvxVar.a.findViewById(2131428634)).setGuidelineBegin(i);
        EncoreListRow encoreListRow = kvxVar.a;
        ((Guideline) encoreListRow.findViewById(2131428633)).setGuidelineEnd(i2);
        ((Guideline) encoreListRow.findViewById(2131428635)).setGuidelineBegin(i3);
        ((Guideline) encoreListRow.findViewById(2131428632)).setGuidelineEnd(i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new if91(getContext(), attributeSet);
    }

    public final kvx getBinding() {
        return this.binding;
    }

    public final svx getLayoutSize() {
        return this.layoutSize;
    }

    public final dcx getMediaAspectRatio() {
        return this.mediaAspectRatio;
    }

    public final ay31 getRowType() {
        return this.rowType;
    }

    public final wlb0 getVariableMediaWidth() {
        return this.variableMediaWidth;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws NoWhenBranchMatchedException {
        if (!(parcelable instanceof ivx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ivx ivxVar = (ivx) parcelable;
        super.onRestoreInstanceState(ivxVar.a());
        setLayoutSize(ivxVar.b());
        setMediaAspectRatio(mka.d(ivxVar.g()));
        setRowType(ivxVar.h());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        ivx ivxVar = new ivx(parcelableOnSaveInstanceState);
        ivxVar.j(this.layoutSize);
        ivxVar.l(this.rowType);
        ivxVar.k(this.mediaAspectRatio.a);
        return ivxVar;
    }

    public final void setAdditionalAccessibilityActions(List<xe> actions) {
        this.W0.b(actions);
    }

    public final void setHorizontalSpacing(int horizontalSpacing) {
        kvx kvxVar = this.binding;
        View viewFindViewById = kvxVar.a.findViewById(2131429734);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        qhlVar.setMarginEnd(horizontalSpacing);
        viewFindViewById.setLayoutParams(qhlVar);
        if (this.rowType != ay31.Regular) {
            View viewB = kvxVar.b();
            ViewGroup.LayoutParams layoutParams2 = viewB.getLayoutParams();
            if (layoutParams2 == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            qhl qhlVar2 = (qhl) layoutParams2;
            qhlVar2.setMarginEnd(0);
            viewB.setLayoutParams(qhlVar2);
            return;
        }
        View viewB2 = kvxVar.b();
        ViewGroup.LayoutParams layoutParams3 = viewB2.getLayoutParams();
        if (layoutParams3 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar3 = (qhl) layoutParams3;
        qhlVar3.setMarginEnd(horizontalSpacing);
        viewB2.setLayoutParams(qhlVar3);
        View viewD = kvxVar.d();
        ViewGroup.LayoutParams layoutParams4 = viewD.getLayoutParams();
        if (layoutParams4 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar4 = (qhl) layoutParams4;
        qhlVar4.setMarginStart(horizontalSpacing);
        viewD.setLayoutParams(qhlVar4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setLayoutSize(svx svxVar) throws NoWhenBranchMatchedException {
        this.layoutSize = svxVar;
        d();
    }

    public final void setLegacyMediaSize(int width) {
        View viewB = this.binding.b();
        ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).width = width;
        ((ViewGroup.MarginLayoutParams) qhlVar).height = 0;
        viewB.setLayoutParams(qhlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setMediaAspectRatio(dcx dcxVar) throws NoWhenBranchMatchedException {
        if (u890.j(this.mediaAspectRatio, dcxVar)) {
            return;
        }
        this.mediaAspectRatio = dcxVar;
        View viewC = c(gf91.a);
        ViewGroup.LayoutParams layoutParams = viewC.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        qhlVar.G = dcxVar.a;
        viewC.setLayoutParams(qhlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setRowType(ay31 ay31Var) throws NoWhenBranchMatchedException {
        if (this.rowType != ay31Var) {
            this.rowType = ay31Var;
            kil kilVar = new kil();
            kilVar.n(getContext(), this.rowType.a);
            kvx kvxVar = this.binding;
            ConstraintLayout constraintLayoutA = kvxVar.a();
            EncoreListRow encoreListRow = kvxVar.a;
            kilVar.b(constraintLayoutA);
            if (this.rowType == ay31.Narrow) {
                ((Barrier) encoreListRow.findViewById(2131428636)).setReferencedIds(m5n1.d);
                ((Barrier) encoreListRow.findViewById(2131428637)).setReferencedIds(m5n1.e);
            }
            d();
        }
    }

    public final void setTitleSpacing(int titleSpacing) {
        kvx kvxVar = this.binding;
        View viewFindViewById = kvxVar.a.findViewById(2131430482);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin = titleSpacing;
        viewFindViewById.setLayoutParams(qhlVar);
        View viewC = kvxVar.c();
        ViewGroup.LayoutParams layoutParams2 = viewC.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = (qhl) layoutParams2;
        ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin = titleSpacing;
        viewC.setLayoutParams(qhlVar2);
    }

    public final void setVariableMediaSize(int height) {
        View viewB = this.binding.b();
        ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).height = height;
        ((ViewGroup.MarginLayoutParams) qhlVar).width = 0;
        viewB.setLayoutParams(qhlVar);
    }

    public final void setVariableMediaWidth(wlb0 wlb0Var) {
        if (u890.j(this.variableMediaWidth, wlb0Var)) {
            return;
        }
        this.variableMediaWidth = wlb0Var;
        e();
    }

    public final void setVerticalSpacing(int verticalSpacing) {
        kvx kvxVar = this.binding;
        View viewFindViewById = kvxVar.a.findViewById(2131427732);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        ((ViewGroup.MarginLayoutParams) qhlVar).topMargin = verticalSpacing;
        viewFindViewById.setLayoutParams(qhlVar);
        View viewFindViewById2 = kvxVar.a.findViewById(2131428936);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar2 = (qhl) layoutParams2;
        ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin = verticalSpacing;
        viewFindViewById2.setLayoutParams(qhlVar2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new if91(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FrameLayout.LayoutParams(layoutParams);
    }

    public EncoreListRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreListRow(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EncoreListRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969256 : i);
    }
}
