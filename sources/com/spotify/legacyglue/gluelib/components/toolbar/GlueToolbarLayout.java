package com.spotify.legacyglue.gluelib.components.toolbar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p.a8o;
import p.b8k1;
import p.bno1;
import p.g4b1;
import p.j4b1;
import p.kpt;
import p.n57;
import p.ph5;
import p.xoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Deprecated
public class GlueToolbarLayout extends ViewGroup {
    private static final int BUTTON_SIZE_DP = 48;
    private final Map<Integer, View> mEndViews;
    private final GlueToolbarOverflowHelper mGlueToolbarOverflowHelper;
    private final int mHorizontalToolbarPadding;
    private ImageButton mOverflowView;
    private final Map<Integer, View> mStartViews;
    private final TextView mSubtitleTextView;
    private final TextView mTextView;
    private int mTextViewLeft;
    private final LinearLayout mTitleContainer;

    public GlueToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStartViews = new LinkedHashMap();
        this.mEndViews = new LinkedHashMap();
        this.mHorizontalToolbarPadding = a8o.y(2.0f, getResources());
        LinearLayout linearLayout = new LinearLayout(context);
        this.mTitleContainer = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(linearLayout);
        EncoreTextView encoreTextViewCreateToolbarTextView = createToolbarTextView(context, 2131429010, 2132018004);
        this.mTextView = encoreTextViewCreateToolbarTextView;
        linearLayout.addView(encoreTextViewCreateToolbarTextView);
        EncoreTextView encoreTextViewCreateToolbarTextView2 = createToolbarTextView(context, 2131429009, 2132018003);
        this.mSubtitleTextView = encoreTextViewCreateToolbarTextView2;
        encoreTextViewCreateToolbarTextView2.setVisibility(8);
        linearLayout.addView(encoreTextViewCreateToolbarTextView2);
        this.mGlueToolbarOverflowHelper = new GlueToolbarOverflowHelper(context);
    }

    private void clearOverflow() {
        this.mOverflowView = null;
        this.mGlueToolbarOverflowHelper.clearOverflowMenu();
    }

    private void createOverflowButton() {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(getContext());
        stateListAnimatorImageButton.setImageDrawable(new g4b1(getContext(), j4b1.q4, getResources().getDimensionPixelSize(2131167141)));
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorImageButton.setBackground(null);
        stateListAnimatorImageButton.setOnClickListener(new kpt(this, (byte) 2));
        addView(ToolbarSide.END, (View) stateListAnimatorImageButton, 2131429748);
        this.mGlueToolbarOverflowHelper.setAnchorView(stateListAnimatorImageButton);
        this.mOverflowView = stateListAnimatorImageButton;
    }

    private EncoreTextView createToolbarTextView(Context context, int i, int i2) {
        EncoreTextView encoreTextView = new EncoreTextView(context);
        encoreTextView.setId(i);
        encoreTextView.setGravity(17);
        encoreTextView.setEllipsize(TextUtils.TruncateAt.END);
        encoreTextView.setMaxLines(1);
        encoreTextView.setTextAppearance(context, i2);
        encoreTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ph5.l(encoreTextView);
        return encoreTextView;
    }

    private int getOnLayoutTop(View view) {
        return (((getMeasuredHeight() - getPaddingTop()) / 2) + getPaddingTop()) - (view.getMeasuredHeight() / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createOverflowButton$0(View view) {
        this.mGlueToolbarOverflowHelper.openOverflowMenu();
    }

    public void addOverflowItem(MenuItem menuItem) {
        if (this.mOverflowView == null) {
            createOverflowButton();
        }
        this.mGlueToolbarOverflowHelper.addOverflowItem(menuItem);
    }

    public void addView(ToolbarSide toolbarSide, View view, int i) {
        if (this.mStartViews.containsKey(Integer.valueOf(i)) || this.mEndViews.containsKey(Integer.valueOf(i))) {
            return;
        }
        (toolbarSide == ToolbarSide.START ? this.mStartViews : this.mEndViews).put(Integer.valueOf(i), view);
        addView(view);
    }

    public void clear(ToolbarSide toolbarSide) {
        Map<Integer, View> map = toolbarSide == ToolbarSide.START ? this.mStartViews : this.mEndViews;
        Iterator<View> it = map.values().iterator();
        while (it.hasNext()) {
            removeView(it.next());
        }
        clearOverflow();
        map.clear();
    }

    public View findView(int i) {
        View view = this.mStartViews.get(Integer.valueOf(i));
        View view2 = this.mEndViews.get(Integer.valueOf(i));
        WeakHashMap weakHashMap = xoi1.a;
        return view != null ? view : view2;
    }

    public TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public TextView getTextView() {
        return this.mTextView;
    }

    public Collection<View> getViews(ToolbarSide toolbarSide) {
        return toolbarSide == ToolbarSide.START ? this.mStartViews.values() : this.mEndViews.values();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mGlueToolbarOverflowHelper.dismiss();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Collection<View> collectionValues;
        Collection<View> collectionValues2;
        int measuredWidth = this.mHorizontalToolbarPadding;
        if (bno1.t(this)) {
            collectionValues = this.mEndViews.values();
            collectionValues2 = this.mStartViews.values();
        } else {
            collectionValues = this.mStartViews.values();
            collectionValues2 = this.mEndViews.values();
        }
        for (View view : collectionValues) {
            int onLayoutTop = getOnLayoutTop(view);
            view.layout(measuredWidth, onLayoutTop, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + onLayoutTop);
            measuredWidth += view.getMeasuredWidth();
        }
        int measuredWidth2 = this.mHorizontalToolbarPadding;
        for (View view2 : collectionValues2) {
            int onLayoutTop2 = getOnLayoutTop(view2);
            view2.layout((getMeasuredWidth() - measuredWidth2) - view2.getMeasuredWidth(), onLayoutTop2, getMeasuredWidth() - measuredWidth2, view2.getMeasuredHeight() + onLayoutTop2);
            measuredWidth2 += view2.getMeasuredWidth();
        }
        int onLayoutTop3 = getOnLayoutTop(this.mTitleContainer);
        LinearLayout linearLayout = this.mTitleContainer;
        int i5 = this.mTextViewLeft;
        linearLayout.layout(i5, onLayoutTop3, linearLayout.getMeasuredWidth() + i5, this.mTitleContainer.getMeasuredHeight() + onLayoutTop3);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Collection<View> collectionValues;
        Collection<View> collectionValues2;
        n57.j(!(View.MeasureSpec.getMode(i) == 0), "GlueToolbarLayout does not support UNSPECIFIED width measure spec");
        n57.j(!(View.MeasureSpec.getMode(i2) == 0), "GlueToolbarLayout does not support UNSPECIFIED height measure spec");
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth = this.mHorizontalToolbarPadding;
        int iY = a8o.y(48.0f, getResources());
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iY, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iY, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2 - getPaddingTop(), Integer.MIN_VALUE);
        if (bno1.t(this)) {
            collectionValues = this.mEndViews.values();
            collectionValues2 = this.mStartViews.values();
        } else {
            collectionValues = this.mStartViews.values();
            collectionValues2 = this.mEndViews.values();
        }
        int measuredWidth2 = measuredWidth;
        for (View view : collectionValues) {
            if (view instanceof ImageButton) {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
            measuredWidth2 += view.getMeasuredWidth();
        }
        for (View view2 : collectionValues2) {
            if (view2 instanceof ImageButton) {
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view2.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
            measuredWidth += view2.getMeasuredWidth();
        }
        this.mTitleContainer.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        float f = size / 2.0f;
        float measuredWidth3 = f - (this.mTitleContainer.getMeasuredWidth() / 2.0f);
        float measuredWidth4 = (this.mTitleContainer.getMeasuredWidth() / 2.0f) + f;
        float fMax = Math.max(measuredWidth3, measuredWidth2);
        float fMin = Math.min(measuredWidth4, size - measuredWidth);
        this.mTextViewLeft = (int) Math.floor(fMax);
        this.mTitleContainer.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil(fMin - fMax), 1073741824), iMakeMeasureSpec4);
        setMeasuredDimension(size, size2);
    }

    public GlueToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueToolbarLayout(Context context) {
        this(context, null);
    }
}
