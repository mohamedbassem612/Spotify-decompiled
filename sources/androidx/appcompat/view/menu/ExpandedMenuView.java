package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p.lsi0;
import p.lvc1;
import p.msi0;
import p.sti0;
import p.ysi0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ExpandedMenuView extends ListView implements lsi0, sti0, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public msi0 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, b, i);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(lvc1VarE.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(lvc1VarE.k(1));
        }
        lvc1VarE.I();
    }

    @Override // p.lsi0
    public final boolean a(ysi0 ysi0Var) {
        return this.a.s(ysi0Var, null, 0);
    }

    @Override // p.sti0
    public final void b(msi0 msi0Var) {
        this.a = msi0Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((ysi0) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
