package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z4a implements Parcelable {
    public static final Parcelable.Creator<z4a> CREATOR = new ux9((byte) 17);
    public final int a;
    public final String b;

    public z4a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4a)) {
            return false;
        }
        z4a z4aVar = (z4a) obj;
        return this.a == z4aVar.a && u890.j(this.b, z4aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "SUCCESS";
        } else if (i2 == 2) {
            str = "NO_MATCH";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "FAIL";
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
    }
}
