package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class c0y0 implements Parcelable {
    public final String a;

    public c0y0(String str) {
        this.a = str;
    }

    public abstract String a();

    public String getTitle() {
        return this.a;
    }
}
