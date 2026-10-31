package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2k implements mma1, Parcelable {
    public static final Parcelable.Creator<r2k> CREATOR = new v6h((byte) 12);
    public final String a;
    public final String b;
    public final String c;
    public final fvt0 d;

    public r2k(String str, String str2, String str3, fvt0 fvt0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fvt0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getKey() {
        return this.a;
    }

    public final String toString() {
        String str = this.b;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeTypedObject(this.d, i);
    }
}
