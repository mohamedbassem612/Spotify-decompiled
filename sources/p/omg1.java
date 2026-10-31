package p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class omg1 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public omg1(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof omg1)) {
            return false;
        }
        omg1 omg1Var = (omg1) obj;
        return this.b == omg1Var.b && this.a.equals(omg1Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbG = dv20.g("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbG.append(this.b);
        sbG.append("\n");
        String strConcat = sbG.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
