package p;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mx40 {
    public static final Set g;
    public final GlueToolbar a;
    public final lx40 b;
    public final Window c;
    public boolean d;
    public boolean e;
    public final StateListAnimatorImageButton f;

    static {
        Object[] objArr = {2131427482, 2131431410};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                hhg1.n(gvg.g(obj, "duplicate element: "));
                return;
            }
        }
        g = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.Window$Callback, p.lx40] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public mx40(GlueToolbar glueToolbar, Window window, View.OnClickListener onClickListener) {
        this.a = glueToolbar;
        Window.Callback callback = window.getCallback();
        ?? lx40Var = callback instanceof lx40 ? (lx40) callback : new lx40(this, callback);
        this.b = lx40Var;
        this.c = window;
        window.setCallback(lx40Var);
        Context context = glueToolbar.getView().getContext();
        this.f = new StateListAnimatorImageButton(context);
        this.f.setImageDrawable(new g4b1(context, j4b1.b1, context.getResources().getDimensionPixelSize(2131167143)));
        StateListAnimatorImageButton stateListAnimatorImageButton = this.f;
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorImageButton.setBackground(null);
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f.setOnClickListener(onClickListener);
        this.f.setContentDescription(context.getResources().getText(2131954307));
    }

    public final void a(Context context, msi0 msi0Var) {
        Set set;
        c2f1 c2f1Var = new c2f1(context, msi0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ysi0 ysi0Var = null;
        for (int i = 0; i < msi0Var.f.size(); i++) {
            MenuItem item = msi0Var.getItem(i);
            if (item.isVisible()) {
                ysi0 ysi0Var2 = (ysi0) item;
                if ((ysi0Var2.y & 2) != 2) {
                    arrayList.add(ysi0Var2);
                } else if (ysi0Var2.a == 2131427484) {
                    ysi0Var = ysi0Var2;
                } else {
                    arrayList2.add(ysi0Var2);
                }
            }
        }
        ToolbarSide toolbarSide = ToolbarSide.END;
        GlueToolbar glueToolbar = this.a;
        glueToolbar.clear(toolbarSide);
        glueToolbar.clear(ToolbarSide.START);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                glueToolbar.addOverflowItem((MenuItem) it.next());
            }
        }
        if (this.e) {
            glueToolbar.addView(ToolbarSide.START, this.f, 2131431410);
        }
        int size = arrayList2.size();
        while (true) {
            size--;
            set = g;
            if (size < 0) {
                break;
            }
            e1d1 e1d1Var = (MenuItem) arrayList2.get(size);
            View actionView = e1d1Var.getActionView();
            ToolbarSide toolbarSide2 = set.contains(Integer.valueOf(e1d1Var.getItemId())) ? ToolbarSide.START : ToolbarSide.END;
            if (actionView != null) {
                glueToolbar.addView(toolbarSide2, actionView, e1d1Var.getItemId());
            } else {
                boolean z = e1d1Var instanceof e1d1;
                glueToolbar.addView(toolbarSide2, ((z ? e1d1Var.b() : null) != null ? z ? e1d1Var.b() : null : c2f1Var).c(e1d1Var), e1d1Var.getItemId());
            }
        }
        if (ysi0Var != null) {
            int i2 = ysi0Var.a;
            glueToolbar.addView(set.contains(Integer.valueOf(i2)) ? ToolbarSide.START : ToolbarSide.END, ysi0Var.getActionView(), i2);
        }
    }
}
