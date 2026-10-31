package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hwk1 implements Parcelable {
    public static final Parcelable.Creator<hwk1> CREATOR = new ylk1((byte) 7);
    public final String a;
    public final String b;

    public hwk1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
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
        if (!(obj instanceof hwk1)) {
            return false;
        }
        hwk1 hwk1Var = (hwk1) obj;
        return u890.j(this.a, hwk1Var.a) && u890.j(this.b, hwk1Var.b);
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
