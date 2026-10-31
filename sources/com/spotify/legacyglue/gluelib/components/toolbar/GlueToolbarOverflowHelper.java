package com.spotify.legacyglue.gluelib.components.toolbar;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;
import p.a8o;
import p.eg;
import p.m9v;
import p.nx40;
import p.s7s0;
import p.su31;
import p.t890;
import p.tw31;
import p.vw31;
import p.y0d0;
import p.ysi0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class GlueToolbarOverflowHelper implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, PopupWindow.OnDismissListener, AdapterView.OnItemClickListener {
    private View mAnchorView;
    private final Context mContext;
    private y0d0 mPopup;
    private ViewTreeObserver mTreeObserver;
    private final List<MenuItem> mOverflowEntries = new ArrayList();
    private final MenuAdapter mMenuAdapter = new MenuAdapter(this, 0);

    public GlueToolbarOverflowHelper(Context context) {
        this.mContext = context;
    }

    public void addOverflowItem(MenuItem menuItem) {
        this.mOverflowEntries.add(menuItem);
    }

    public void clearOverflowMenu() {
        this.mAnchorView = null;
        this.mOverflowEntries.clear();
    }

    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public boolean isShowing() {
        y0d0 y0d0Var = this.mPopup;
        return y0d0Var != null && y0d0Var.Y0.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.mPopup = null;
        ViewTreeObserver viewTreeObserver = this.mTreeObserver;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.mTreeObserver = this.mAnchorView.getViewTreeObserver();
            }
            this.mTreeObserver.removeOnGlobalLayoutListener(this);
            this.mTreeObserver = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (isShowing()) {
            View view = this.mAnchorView;
            if (view == null || !view.isShown()) {
                dismiss();
            } else if (isShowing()) {
                this.mPopup.m();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MenuItem menuItem = (MenuItem) adapterView.getAdapter().getItem(i);
        y0d0 y0d0Var = this.mPopup;
        if (y0d0Var != null && y0d0Var.Y0.isShowing() && menuItem.isEnabled()) {
            this.mPopup.dismiss();
        }
        if (menuItem.isEnabled()) {
            ((ysi0) menuItem).f();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        this.mPopup.dismiss();
        return true;
    }

    public void openOverflowMenu() {
        y0d0 y0d0Var = new y0d0(this.mContext, null, 2130969653, 0);
        this.mPopup = y0d0Var;
        y0d0Var.Y0.setOnDismissListener(this);
        y0d0 y0d0Var2 = this.mPopup;
        y0d0Var2.P0 = this;
        y0d0Var2.k(this.mMenuAdapter);
        y0d0 y0d0Var3 = this.mPopup;
        y0d0Var3.X0 = true;
        y0d0Var3.Y0.setFocusable(true);
        View view = this.mAnchorView;
        view.getClass();
        boolean z = this.mTreeObserver == null;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.mTreeObserver = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        y0d0 y0d0Var4 = this.mPopup;
        y0d0Var4.O0 = view;
        y0d0Var4.Y = 8388613;
        y0d0Var4.r(a8o.x(220.0f, this.mContext.getResources()));
        this.mPopup.Y0.setInputMethodMode(2);
        this.mPopup.m();
        m9v m9vVar = this.mPopup.c;
        m9vVar.getClass();
        m9vVar.setOnKeyListener(this);
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public class MenuAdapter extends BaseAdapter {
        private MenuAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GlueToolbarOverflowHelper.this.mOverflowEntries.size();
        }

        @Override // android.widget.Adapter
        public MenuItem getItem(int i) {
            return (MenuItem) GlueToolbarOverflowHelper.this.mOverflowEntries.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            nx40 nx40Var = null;
            if (view != null) {
                nx40 nx40Var2 = (nx40) tw31.class.cast(view.getTag(2131429011));
                if (nx40Var2 == null) {
                    eg.m("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
                    return null;
                }
                nx40Var = nx40Var2;
            }
            vw31 vw31Var = (tw31) nx40Var;
            if (vw31Var == null) {
                s7s0 s7s0VarR = t890.r(viewGroup.getContext(), viewGroup, 2131625034);
                vw31Var = new vw31(s7s0VarR);
                s7s0VarR.setTag(2131429011, vw31Var);
            }
            MenuItem menuItem = (MenuItem) GlueToolbarOverflowHelper.this.mOverflowEntries.get(i);
            vw31Var.h(menuItem.getTitle());
            s7s0 s7s0Var = ((su31) vw31Var).a;
            s7s0Var.setEnabled(menuItem.isEnabled());
            return s7s0Var;
        }

        public /* synthetic */ MenuAdapter(GlueToolbarOverflowHelper glueToolbarOverflowHelper, int i) {
            this();
        }
    }
}
