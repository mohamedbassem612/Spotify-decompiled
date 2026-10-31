package p;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ei5 {
    public static final HashSet b = new HashSet();
    public final String a;

    public ei5(String str) {
        this.a = str;
        b.add(this);
    }

    public final boolean a() {
        HashSet hashSet = di5.a;
        String str = this.a;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
