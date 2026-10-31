package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wwe0 implements xwe0 {
    public static final Parcelable.Creator<wwe0> CREATOR = new rwe0((byte) 2);
    public final String a;
    public final String b;

    public wwe0(String str, String str2) {
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
        if (!(obj instanceof wwe0)) {
            return false;
        }
        wwe0 wwe0Var = (wwe0) obj;
        return u890.j(this.a, wwe0Var.a) && u890.j(this.b, wwe0Var.b);
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
