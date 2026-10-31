package com.spotify.allboarding.allboardingimpl.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.iu30;
import p.rzg;
import p.u961;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001f\u001a\u00020\f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\n \"*\u0004\u0018\u00010!0!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'R0\u00100\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\f\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/utils/PickerCollapsingTitleBar;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "Lp/rih1;", "setSearchVisible", "(Z)V", "setFiltersVisible", "setComposeFiltersVisible", "Landroid/widget/FrameLayout;", "getFiltersComposeContainer", "()Landroid/widget/FrameLayout;", "getHeaderTitleComposeContainer", "getHeaderContentComposeContainer", "setHeaderComposeVisible", "", "title", "setTitle", "(Ljava/lang/String;)V", "placeholder", "setSearchPlaceholder", "Lp/z511;", "adapter", "setFiltersRecyclerViewAdapter", "(Lp/z511;)V", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getSearchPlaceholder", "()Landroid/widget/Button;", "Landroid/view/View;", "getSearchFieldRoot", "()Landroid/view/View;", "Lkotlin/Function1;", "", "g1", "Lp/iu30;", "getOnCollapseFractionChanged", "()Lp/iu30;", "setOnCollapseFractionChanged", "(Lp/iu30;)V", "onCollapseFractionChanged", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickerCollapsingTitleBar extends AppBarLayout {
    public final TextView V0;
    public final TextView W0;
    public final CollapsingToolbarLayout X0;
    public final ToolbarSearchFieldView Y0;
    public final RecyclerView Z0;
    public final FrameLayout a1;
    public final FrameLayout b1;
    public final FrameLayout c1;
    public final LinearLayoutManager d1;
    public final u961 e1;
    public boolean f1;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public iu30 onCollapseFractionChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public PickerCollapsingTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, 2131625374, this);
        TextView textView = (TextView) findViewById(2131428798);
        this.V0 = textView;
        this.W0 = (TextView) findViewById(2131428118);
        this.X0 = textView.getParent().getParent();
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) findViewById(2131430847);
        this.Y0 = toolbarSearchFieldView;
        RecyclerView recyclerViewFindViewById = findViewById(2131428879);
        this.Z0 = recyclerViewFindViewById;
        this.a1 = (FrameLayout) findViewById(2131428877);
        this.b1 = (FrameLayout) findViewById(2131429100);
        this.c1 = (FrameLayout) findViewById(2131429086);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.d1 = linearLayoutManager;
        recyclerViewFindViewById.setLayoutManager(linearLayoutManager);
        this.e1 = new u961(context, toolbarSearchFieldView, false);
        setDescendantFocusability(262144);
        a(new rzg(this, (byte) 11));
    }

    /* JADX INFO: renamed from: getFiltersComposeContainer, reason: from getter */
    public final FrameLayout getA1() {
        return this.a1;
    }

    /* JADX INFO: renamed from: getHeaderContentComposeContainer, reason: from getter */
    public final FrameLayout getC1() {
        return this.c1;
    }

    /* JADX INFO: renamed from: getHeaderTitleComposeContainer, reason: from getter */
    public final FrameLayout getB1() {
        return this.b1;
    }

    public final iu30 getOnCollapseFractionChanged() {
        return this.onCollapseFractionChanged;
    }

    public final View getSearchFieldRoot() {
        return this.Y0.findViewById(2131430819);
    }

    public final Button getSearchPlaceholder() {
        return this.Y0.getSearchPlaceHolder();
    }

    public final void setComposeFiltersVisible(boolean visible) {
        this.a1.setVisibility(visible ? 0 : 8);
    }

    public final void setFiltersRecyclerViewAdapter(z511 adapter) {
        this.Z0.setAdapter(adapter);
    }

    public final void setFiltersVisible(boolean visible) {
        this.Z0.setVisibility(visible ? 0 : 8);
    }

    public final void setHeaderComposeVisible(boolean visible) {
        this.f1 = visible;
        this.b1.setVisibility(visible ? 0 : 8);
        this.c1.setVisibility(visible ? 0 : 8);
        if (visible) {
            this.X0.setVisibility(8);
            this.Y0.setVisibility(8);
            this.Z0.setVisibility(8);
            this.a1.setVisibility(8);
        }
    }

    public final void setOnCollapseFractionChanged(iu30 iu30Var) {
        this.onCollapseFractionChanged = iu30Var;
    }

    public final void setSearchPlaceholder(String placeholder) {
        this.Y0.getSearchPlaceHolder().setText(placeholder);
    }

    public final void setSearchVisible(boolean visible) {
        this.Y0.setVisibility(visible ? 0 : 8);
    }

    public final void setTitle(String title) {
        this.V0.setText(title);
        this.W0.setText(title);
    }

    public PickerCollapsingTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PickerCollapsingTitleBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PickerCollapsingTitleBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
