package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ogf implements sgf {
    public static final Parcelable.Creator<ogf> CREATOR = new zbf((byte) 14);
    public final String a;
    public final String b;

    public ogf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogf)) {
            return false;
        }
        ogf ogfVar = (ogf) obj;
        return u890.j(this.a, ogfVar.a) && u890.j(this.b, ogfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public /* synthetic */ ogf(String str) {
        this(str, null);
    }
}
