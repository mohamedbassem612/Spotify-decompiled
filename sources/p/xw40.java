package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Deprecated
public abstract class xw40 {
    public static tw40 a(Context context, ViewGroup viewGroup) {
        return (tw40) c(new uw40(LayoutInflater.from(context).inflate(2131625025, viewGroup, false)));
    }

    public static vw40 b(Context context, ViewGroup viewGroup) {
        return (vw40) c(new ww40(LayoutInflater.from(context).inflate(2131625024, viewGroup, false)));
    }

    private static <T extends nx40> T c(T t) {
        t.getView().setTag(2131429011, t);
        return t;
    }
}
