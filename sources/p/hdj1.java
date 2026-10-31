package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hdj1 extends jdj1 {
    public static final hdj1 a = new hdj1();
    public static final Parcelable.Creator<hdj1> CREATOR = new xbi1((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hdj1);
    }

    public final int hashCode() {
        return 492312728;
    }

    public final String toString() {
        return "FILL";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
