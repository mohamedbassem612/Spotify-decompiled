package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gd30 extends ld30 {
    public static final Parcelable.Creator<gd30> CREATOR = new ix20((byte) 12);
    public final Intent a;

    public gd30(Intent intent) {
        this.a = intent;
    }

    public final Intent a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
