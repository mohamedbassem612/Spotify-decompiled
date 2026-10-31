package p;

import android.net.Uri;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class z6b1 {
    public static final blc0[] a = {blc0.g1};

    public static final String a(String str) {
        Set set = s4b1.f;
        String strZ = uic.C(str, (String) null).z();
        return strZ == null ? l1d.m("spotify:user:", Uri.encode(str)) : strZ;
    }

    public static final boolean b(String str) {
        Set set = s4b1.f;
        blc0[] blc0VarArr = a;
        if (uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length))) {
            return true;
        }
        return c(str) && !str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq");
    }

    public static final boolean c(String str) {
        Set set = s4b1.f;
        return uic.k(str, new b3i1[]{nyu0.e, wyu0.f});
    }
}
