package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class apk1 implements Parcelable {
    public static final Parcelable.Creator<apk1> CREATOR = new ylk1((byte) 1);
    public final String a;
    public final String b;

    public apk1(String str, String str2) {
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
        if (!(obj instanceof apk1)) {
            return false;
        }
        apk1 apk1Var = (apk1) obj;
        return u890.j(this.a, apk1Var.a) && u890.j(this.b, apk1Var.b);
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
