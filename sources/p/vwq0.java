package p;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vwq0 implements Window.Callback {
    public final /* synthetic */ Window.Callback a;
    public final /* synthetic */ Window.Callback b;
    public final /* synthetic */ wwq0 c;

    public vwq0(Window.Callback callback, wwq0 wwq0Var) {
        this.b = callback;
        this.c = wwq0Var;
        this.a = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        wvq0 wvq0Var = new wvq0(this.b, (byte) 3);
        wwq0 wwq0Var = this.c;
        Function0 function0 = wwq0Var.a;
        if (function0 == null) {
            return ((Boolean) wvq0Var.invoke(motionEvent)).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            wwq0Var.d = motionEvent.getX();
            wwq0Var.e = motionEvent.getY();
            wwq0Var.i = false;
            wwq0Var.g = false;
            MotionEvent motionEvent2 = wwq0Var.h;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            wwq0Var.h = null;
            Function0 function1 = wwq0Var.b;
            boolean zContains = (function1 == null || (rectF = (RectF) function1.invoke()) == null) ? true : rectF.contains(motionEvent.getRawX(), motionEvent.getRawY());
            wwq0Var.f = zContains;
            if (!zContains) {
                wwq0Var.h = MotionEvent.obtain(motionEvent);
                return true;
            }
        } else if (actionMasked == 1) {
            MotionEvent motionEvent3 = wwq0Var.h;
            wwq0Var.h = null;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            if (!wwq0Var.f && !wwq0Var.g) {
                if (!wwq0Var.i) {
                    wwq0Var.i = true;
                    function0.invoke();
                }
                return true;
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                MotionEvent motionEvent4 = wwq0Var.h;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                wwq0Var.h = null;
            }
        } else if (!wwq0Var.f) {
            if (wwq0Var.g) {
                return ((Boolean) wvq0Var.invoke(motionEvent)).booleanValue();
            }
            float x = motionEvent.getX() - wwq0Var.d;
            float y = motionEvent.getY() - wwq0Var.e;
            if ((y * y) + (x * x) > wwq0Var.c) {
                wwq0Var.g = true;
                if (!wwq0Var.i) {
                    wwq0Var.i = true;
                    function0.invoke();
                }
                MotionEvent motionEvent5 = wwq0Var.h;
                if (motionEvent5 != null) {
                    wvq0Var.invoke(motionEvent5);
                    motionEvent5.recycle();
                    wwq0Var.h = null;
                }
                return ((Boolean) wvq0Var.invoke(motionEvent)).booleanValue();
            }
            return true;
        }
        return ((Boolean) wvq0Var.invoke(motionEvent)).booleanValue();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.a.onWindowStartingActionMode(callback, i);
    }
}
