package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b7u0 implements Parcelable {
    public static final Parcelable.Creator<b7u0> CREATOR = new brt0((byte) 11);
    public final int a;

    public b7u0(int i) {
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
        return (obj instanceof b7u0) && this.a == ((b7u0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "StartSlow";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Stuck";
        }
        parcel.writeString(str);
    }
}
