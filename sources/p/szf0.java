package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class szf0 {
    public static final kiv a = mod.h(df.e1);
    public static final kiv b = mod.h(lxf0.c);

    public static final Object a(View view, int i) {
        Object tag = view.getTag(i);
        if (tag != null) {
            return tag;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                return a(viewGroup, i);
            }
        }
        return null;
    }

    public static final rzf0 b(View view) {
        return (rzf0) a(view, 2131429884);
    }
}
