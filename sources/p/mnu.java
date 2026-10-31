package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mnu implements Parcelable {
    public static final Parcelable.Creator<mnu> CREATOR = new zrt((byte) 21);
    public final int a;

    public mnu(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnu) && this.a == ((mnu) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "VOICE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "TEXT";
        }
        parcel.writeString(str);
    }
}
