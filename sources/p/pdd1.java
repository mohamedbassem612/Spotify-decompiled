package p;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pdd1 {
    public final ndd1 a;
    public final ArrayList b = new ArrayList();
    public nk80 c;
    public nk80 d;
    public int e;

    public pdd1(ViewGroup viewGroup) {
        View childAt;
        nk80 nk80Var = nk80.e;
        this.c = nk80Var;
        this.d = nk80Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        ndd1 ndd1Var = new ndd1(this, viewGroup.getContext(), viewGroup);
        this.a = ndd1Var;
        ndd1Var.setVisibility(8);
        ndd1Var.setWillNotDraw(true);
        ifb1 ifb1Var = new ifb1(this, (byte) 14);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(ndd1Var, ifb1Var);
        mrl1.e(ndd1Var, new odd1(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(ndd1Var, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new c9s(viewGroup, ndd1Var, (byte) 12));
        }
    }
}
