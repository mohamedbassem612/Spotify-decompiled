package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ajk1 implements Parcelable {
    public static final Parcelable.Creator<ajk1> CREATOR = new tfk1((byte) 25);
    public final String a;
    public final String b;

    public ajk1(String str, String str2) {
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
        if (!(obj instanceof ajk1)) {
            return false;
        }
        ajk1 ajk1Var = (ajk1) obj;
        return u890.j(this.a, ajk1Var.a) && u890.j(this.b, ajk1Var.b);
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
