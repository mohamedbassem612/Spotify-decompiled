package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zu1 implements Parcelable {
    public static final Parcelable.Creator<zu1> CREATOR = new d41(26);
    public final String a;
    public final String b;

    public zu1(String str, String str2) {
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
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return u890.j(this.a, zu1Var.a) && u890.j(this.b, zu1Var.b);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
