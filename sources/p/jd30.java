package p;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jd30 extends ld30 {
    public static final Parcelable.Creator<jd30> CREATOR = new ix20((byte) 15);
    public final int a;
    public final Notification b;
    public final boolean c;
    public final Integer d;

    public jd30(int i, Notification notification, boolean z, Integer num) {
        this.a = i;
        this.b = notification;
        this.c = z;
        this.d = num;
    }

    public final int a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
