package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kti0 extends m9v {
    public final byte P0;
    public final byte Q0;
    public xsi0 R0;
    public ysi0 S0;

    public kti0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.P0 = (byte) 21;
            this.Q0 = (byte) 22;
        } else {
            this.P0 = (byte) 22;
            this.Q0 = (byte) 21;
        }
    }

    @Override // p.m9v, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        jsi0 jsi0Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.R0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jsi0Var = (jsi0) headerViewListAdapter.getWrappedAdapter();
            } else {
                jsi0Var = (jsi0) adapter;
                headersCount = 0;
            }
            ysi0 ysi0VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= jsi0Var.getCount()) ? null : jsi0Var.getItem(i);
            ysi0 ysi0Var = this.S0;
            if (ysi0Var != ysi0VarB) {
                msi0 msi0Var = jsi0Var.a;
                if (ysi0Var != null) {
                    this.R0.l(msi0Var, ysi0Var);
                }
                this.S0 = ysi0VarB;
                if (ysi0VarB != null) {
                    this.R0.p(msi0Var, ysi0VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.P0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.Q0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (jsi0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (jsi0) adapter).a.d(false);
        return true;
    }

    public void setHoverListener(xsi0 xsi0Var) {
        this.R0 = xsi0Var;
    }

    @Override // p.m9v, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
