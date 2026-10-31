package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ben implements Parcelable {
    public static final Parcelable.Creator<ben> CREATOR = new hbn1((byte) 11);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ben(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a(int i) {
        String str;
        String str2;
        String str3;
        if (i == 4 && (str3 = this.d) != null && str3.length() != 0) {
            return str3;
        }
        if ((i != 3 && i != 4) || (str = this.c) == null || str.length() == 0) {
            return (i != 2 || (str2 = this.b) == null || str2.length() == 0) ? this.a : str2;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ben)) {
            return false;
        }
        ben benVar = (ben) obj;
        return u890.j(this.a, benVar.a) && u890.j(this.b, benVar.b) && u890.j(this.c, benVar.c) && u890.j(this.d, benVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public /* synthetic */ ben() {
        this("", null, null, null);
    }
}
