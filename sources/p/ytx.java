package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ytx extends hux {
    public static final ytx c = new ytx(new dsx(yto.m(), rwq.i()), new dsx(v8r.m(), d1u.G()));
    public static final byte d = 8;
    public static final Parcelable.Creator<ytx> CREATOR = new utx((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ytx);
    }

    public final int hashCode() {
        return -711333412;
    }

    public final String toString() {
        return "VideoVertical";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
