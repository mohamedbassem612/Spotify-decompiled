package p;

import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class gtl1 {
    public static final nen0 a;

    static {
        long[] jArr = hj41.a;
        a = new nen0();
    }

    public static final v3k a(View view) {
        Object tag = view.getTag(2131427576);
        if (tag instanceof v3k) {
            return (v3k) tag;
        }
        return null;
    }

    public static final p311 b(View view) {
        if (!view.isAttachedToWindow()) {
            qf80.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objP = dm5.P(view);
        while (objP instanceof View) {
            View view2 = (View) objP;
            if (view2.getId() == 16908290) {
                break;
            }
            objP = view2.getParent();
            view = view2;
        }
        v3k v3kVarA = a(view);
        if (v3kVarA != null) {
            if (v3kVarA instanceof p311) {
                return (p311) v3kVarA;
            }
            eg.m("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        p311 p311VarA = ((dtl1) etl1.a.get()).a(view);
        view.setTag(2131427576, p311VarA);
        Handler handler = view.getHandler();
        int i = ds50.a;
        view.addOnAttachStateChangeListener(new y22(c921.y(ov40.a, new bs50(handler, "windowRecomposer cleanup", false).f, 0, new gqj1(p311VarA, view, (lnm) null, (byte) 19), 2), (byte) 28));
        return p311VarA;
    }
}
