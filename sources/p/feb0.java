package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class feb0 implements Parcelable {
    public static final feb0 a = new feb0();
    public static final Parcelable.Creator<feb0> CREATOR = new jca0((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof feb0);
    }

    public final int hashCode() {
        return 646736511;
    }

    public final String toString() {
        return "LanguageSettingsPageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
