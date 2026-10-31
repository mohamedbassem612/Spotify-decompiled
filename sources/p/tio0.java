package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tio0 implements Parcelable {
    public static final tio0 a = new tio0();
    public static final Parcelable.Creator<tio0> CREATOR = new b4o0((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tio0);
    }

    public final int hashCode() {
        return 489558045;
    }

    public final String toString() {
        return "NotesSharingReminderPageResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
