package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dle1 implements Parcelable {
    public static final Parcelable.Creator<dle1> CREATOR = new pwd1((byte) 14);
    public final String a;
    public final String b;

    public dle1(String str, String str2) {
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
        if (!(obj instanceof dle1)) {
            return false;
        }
        dle1 dle1Var = (dle1) obj;
        return u890.j(this.a, dle1Var.a) && u890.j(this.b, dle1Var.b);
    }

    public final String getViewUri() {
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
