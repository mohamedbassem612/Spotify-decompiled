package com.spotify.allboarding.allboardingimpl.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.GridLayoutAnimationController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg50;
import p.lg50;
import p.ng50;
import p.u890;
import p.uu1;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/utils/GridRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "target", "Lp/rih1;", "setUpwardFocusTarget", "(Landroid/view/View;)V", "Lkotlin/Function0;", "callback", "setOnExpandCollapsingTitleBar", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GridRecyclerView extends RecyclerView {
    public static final /* synthetic */ int n2 = 0;
    public View l2;
    public Function0 m2;

    public GridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(30);
        gridLayoutManager.m1 = new lg50(this, gridLayoutManager);
        setLayoutManager(gridLayoutManager);
        setAccessibilityDelegateCompat(new ng50(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int C0(int i) {
        z511 adapter = getAdapter();
        adapter.getClass();
        if (adapter.e() <= i) {
            return 1;
        }
        z511 adapter2 = getAdapter();
        adapter2.getClass();
        int iG = adapter2.g(i);
        if (iG == 2131624042 || iG == 2131624043) {
            return 1;
        }
        return iG == 2131624041 ? getResources().getInteger(2131492867) : getResources().getInteger(2131492868);
    }

    public final void attachLayoutAnimationParameters(View view, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        int iC0 = C0(i);
        GridLayoutAnimationController.AnimationParameters animationParameters = (GridLayoutAnimationController.AnimationParameters) layoutParams.layoutAnimationParameters;
        if (animationParameters == null) {
            animationParameters = new GridLayoutAnimationController.AnimationParameters();
        }
        layoutParams.layoutAnimationParameters = animationParameters;
        animationParameters.count = i2;
        animationParameters.index = i;
        animationParameters.columnsCount = iC0;
        int i3 = i2 / iC0;
        animationParameters.rowsCount = i3;
        int i4 = (i2 - 1) - i;
        animationParameters.column = (iC0 - 1) - (i4 % iC0);
        animationParameters.row = (i3 - 1) - (i4 / iC0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 19 || this.l2 == null) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        View view = viewFindFocus;
        while (!u890.j(view.getParent(), this) && view.getParent() != null) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null) {
                break;
            }
            view = view2;
        }
        if (!u890.j(view.getParent(), this)) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        int iR = RecyclerView.R(view);
        if (iR != -1 && iR >= 0 && getAdapter() != null) {
            GridLayoutManager gridLayoutManagerM0getLayoutManager = m0getLayoutManager();
            eg50 eg50Var = gridLayoutManagerM0getLayoutManager.m1;
            int i = gridLayoutManagerM0getLayoutManager.h1;
            int iE = 0;
            for (int i2 = 0; i2 < iR; i2++) {
                iE += eg50Var.e(i2);
                if (iE < i) {
                }
            }
            View view3 = this.l2;
            if (view3 == null) {
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            Function0 function0 = this.m2;
            if (function0 != null) {
                function0.invoke();
            }
            u0(0);
            view3.post(new uu1(this, viewFindFocus, view3, (byte) 16));
            return true;
        }
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: getLayoutManager, reason: merged with bridge method [inline-methods] */
    public GridLayoutManager m0getLayoutManager() {
        GridLayoutManager layoutManager = super.getLayoutManager();
        layoutManager.getClass();
        return layoutManager;
    }

    public final void setOnExpandCollapsingTitleBar(Function0 callback) {
        this.m2 = callback;
    }

    public final void setUpwardFocusTarget(View target) {
        this.l2 = target;
    }

    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GridRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GridRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
