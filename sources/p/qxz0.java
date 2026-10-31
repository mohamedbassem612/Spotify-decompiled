package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qxz0 {
    public final Context a;

    public qxz0(Context context) {
        this.a = context;
    }

    public final String a(int i) {
        Context context = this.a;
        if (i >= 1000000) {
            int i2 = i / 1000000;
            int i3 = (i % 1000000) / 100000;
            String string = i3 > 0 ? context.getString(2131960865, ab80.m(i2, i3, ".")) : context.getString(2131960865, String.valueOf(i2));
            string.getClass();
            return string;
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        int i4 = i / 1000;
        int i5 = (i % 1000) / 100;
        String string2 = i5 > 0 ? context.getString(2131960866, ab80.m(i4, i5, ".")) : context.getString(2131960866, String.valueOf(i4));
        string2.getClass();
        return string2;
    }
}
