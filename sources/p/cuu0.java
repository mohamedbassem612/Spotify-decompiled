package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class cuu0 implements Parcelable {
    public abstract wls0 a();

    public abstract String b();

    public abstract String g();

    public final boolean h() {
        return (this instanceof auu0) && ((auu0) this).d;
    }

    public final cuu0 j(boolean z) {
        if (this instanceof buu0) {
            return this;
        }
        if (this instanceof auu0) {
            return auu0.k((auu0) this, z);
        }
        eg.o();
        return null;
    }
}
