package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ck7 implements n2r0 {
    public static final ck7 a = new ck7();
    public static final Parcelable.Creator<ck7> CREATOR = new f67((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ck7);
    }

    public final int hashCode() {
        return -934192566;
    }

    public final String toString() {
        return "Attachment";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
