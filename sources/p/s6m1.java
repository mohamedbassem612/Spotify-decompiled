package p;

import android.graphics.Color;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class s6m1 {
    public static final wsk a = new wsk(Color.rgb(31, 31, 31), -1, -1, -16777216);

    public static final int a(String str) {
        String strConcat;
        String strH0 = ihc1.H0(str, "#");
        int length = strH0.length();
        if (length == 6) {
            strConcat = "#".concat(strH0);
        } else {
            if (length != 8) {
                hhg1.n("Invalid color: ".concat(str));
                return 0;
            }
            strConcat = "#".concat(iro1.y(strH0));
        }
        return Color.parseColor(strConcat);
    }
}
