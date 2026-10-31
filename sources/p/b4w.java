package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b4w implements Parcelable {
    public static final Parcelable.Creator<b4w> CREATOR = new s5v((byte) 25);
    public final String a;
    public final ResultReceiver b;
    public final String c;
    public final String d;
    public final boolean e;

    public b4w(String str, ResultReceiver resultReceiver, String str2, String str3, boolean z) {
        this.a = str;
        this.b = resultReceiver;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final String a() {
        return this.a;
    }

    public final ResultReceiver b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4w)) {
            return false;
        }
        b4w b4wVar = (b4w) obj;
        return u890.j(this.a, b4wVar.a) && u890.j(this.b, b4wVar.b) && u890.j(this.c, b4wVar.c) && u890.j(this.d, b4wVar.d) && this.e == b4wVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ResultReceiver resultReceiver = this.b;
        int iHashCode2 = (iHashCode + (resultReceiver == null ? 0 : resultReceiver.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
