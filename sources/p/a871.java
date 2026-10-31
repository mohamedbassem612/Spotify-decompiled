package p;

import android.net.Uri;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class a871 {
    public static final Set a = f46.S0(new String[]{"wrapped", "shareformat"});

    public static final void a(s4b1 s4b1Var) {
        Uri uri = s4b1Var.a;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        Set set = a;
        if (pathSegments == null || pathSegments.size() <= 0 || !set.contains(pathSegments.get(0))) {
            hhg1.n(gvg.h("Uri ", s4b1Var.z(), " cannot be used as a share format id. Allowed ones must be of the form ", o7h.y0(set, ", ", (String) null, (String) null, s571.X, 30)));
        }
    }
}
