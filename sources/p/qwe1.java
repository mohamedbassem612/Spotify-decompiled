package p;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qwe1 {
    public final Context a;

    public qwe1(Context context) {
        this.a = context;
    }

    public final String a(String str) {
        Long lD0;
        if (str == null || (lD0 = nhc1.d0(10, str)) == null) {
            return "";
        }
        long jLongValue = lD0.longValue();
        int i = (int) (jLongValue / 3600);
        int i2 = ((int) (jLongValue / 60)) - (i * 60);
        long j = jLongValue % 60;
        String string = this.a.getString(2131962348, i > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Long.valueOf(j)}, 2)));
        return string == null ? "" : string;
    }
}
