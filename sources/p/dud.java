package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dud implements iud {
    public final Parcelable a;

    public dud(Parcelable parcelable) {
        this.a = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dud) && this.a.equals(((dud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
