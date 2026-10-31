package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kd30 extends ld30 {
    public static final Parcelable.Creator<kd30> CREATOR = new ix20((byte) 16);
    public final List a;

    public kd30(List list) {
        this.a = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
    }
}
