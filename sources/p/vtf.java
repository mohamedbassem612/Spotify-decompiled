package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vtf implements Parcelable {
    public static final Parcelable.Creator<vtf> CREATOR = new zsf((byte) 2);
    public final String a;
    public final String b;
    public final String c;

    public vtf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtf)) {
            return false;
        }
        vtf vtfVar = (vtf) obj;
        return u890.j(this.a, vtfVar.a) && u890.j(this.b, vtfVar.b) && u890.j(this.c, vtfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
