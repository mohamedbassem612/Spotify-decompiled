package p;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class f881 {
    public static final Set a = Collections.singleton(new kik1(nik1.o6.a));

    public static final boolean a(String str) {
        Set set = a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((kik1) it.next()).a(ihc1.Y0(str, '?'))) {
                return true;
            }
        }
        return false;
    }

    public static final void b(Bundle bundle, q961 q961Var) {
        String string;
        if (bundle == null || (string = bundle.getString("bottom_sheet_uri")) == null) {
            return;
        }
        if (!a(string)) {
            string = null;
        }
        if (string != null) {
            q961Var.invoke(string);
        }
    }
}
