package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nlm {
    public final Resources a;

    public String a(wb40 wb40Var) {
        String string;
        int iC = l1d.C(wb40Var.b);
        Resources resources = this.a;
        if (iC == 0) {
            string = resources.getString(2131956183, resources.getString(2131956165));
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            string = resources.getString(2131956164, resources.getString(2131956165));
        }
        string.getClass();
        return string;
    }

    public String b(wb40 wb40Var) {
        String string;
        int iC = l1d.C(wb40Var.b);
        Resources resources = this.a;
        if (iC == 0) {
            string = resources.getString(2131956184);
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            string = resources.getString(2131956166);
        }
        string.getClass();
        return string;
    }
}
