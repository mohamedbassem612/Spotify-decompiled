package p;

import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class me30 {
    public static final le30[] b = le30.values();
    public final HashMap a = new HashMap();

    public final le30 a(String str) {
        le30 le30Var = le30.PLAYLIST;
        if (str == null || str.length() == 0) {
            return le30Var;
        }
        HashMap map = this.a;
        le30 le30Var2 = (le30) map.get(str);
        if (le30Var2 != null) {
            return le30Var2;
        }
        le30 le30Var3 = le30Var;
        for (le30 le30Var4 : b) {
            if (Pattern.compile(le30Var4.a).matcher(str).matches()) {
                if (le30Var3 != le30Var) {
                    n57.e("Ambiguous patterns detected. Pattern for type " + le30Var3 + " overlaps with " + le30Var4 + ", which is not allowed.");
                }
                le30Var3 = le30Var4;
            }
        }
        map.put(str, le30Var3);
        return le30Var3;
    }
}
