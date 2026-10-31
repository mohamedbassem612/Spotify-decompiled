package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s5o0 implements n2r0 {
    public static final s5o0 a = new s5o0();
    public static final Parcelable.Creator<s5o0> CREATOR = new b4o0((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s5o0);
    }

    public final int hashCode() {
        return 1557728670;
    }

    public final String toString() {
        return "Nested";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
