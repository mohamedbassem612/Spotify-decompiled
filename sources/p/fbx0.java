package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fbx0 extends nbx0 {
    public static final fbx0 a = new fbx0();
    public static final Parcelable.Creator<fbx0> CREATOR = new wvw0((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fbx0);
    }

    public final int hashCode() {
        return -2037375444;
    }

    public final String toString() {
        return "FRIEND";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
