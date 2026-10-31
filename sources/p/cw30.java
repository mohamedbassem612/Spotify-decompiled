package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class cw30 {
    public static final List a = p7h.M(new String[]{"appletv", "apple tv"});

    public static final boolean a(l0l l0lVar) {
        if (l0lVar.getType() != f0u.f) {
            return false;
        }
        String strE = l0lVar.E();
        Locale locale = Locale.ROOT;
        if (ihc1.j0(strE.toLowerCase(locale), "apple")) {
            return true;
        }
        List list = a;
        String lowerCase = l0lVar.s().toLowerCase(locale);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ihc1.j0(lowerCase, (CharSequence) it.next())) {
                return true;
            }
        }
        return false;
    }
}
