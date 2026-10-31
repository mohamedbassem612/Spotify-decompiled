package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class o571 implements Parcelable {
    public static final idd1 c = new idd1(w661.c1);
    public final String a;
    public final Integer b;

    public o571(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    public final String getValue() {
        return this.a;
    }
}
