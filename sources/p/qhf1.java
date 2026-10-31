package p;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qhf1 {
    public static WeakReference b;
    public r961 a;

    public final synchronized ohf1 a() {
        ohf1 ohf1Var;
        String strZ = this.a.z();
        Pattern pattern = ohf1.d;
        ohf1Var = null;
        if (!TextUtils.isEmpty(strZ)) {
            String[] strArrSplit = strZ.split("!", -1);
            if (strArrSplit.length == 2) {
                ohf1Var = new ohf1(strArrSplit[0], strArrSplit[1]);
            }
        }
        return ohf1Var;
    }
}
