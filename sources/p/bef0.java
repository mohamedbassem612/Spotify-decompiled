package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bef0 implements Parcelable {
    public static final Parcelable.Creator<bef0> CREATOR = new j7f0(7);
    public final String a;
    public final String b;
    public final String c;

    public bef0(String str, String str2, String str3) {
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
        if (!(obj instanceof bef0)) {
            return false;
        }
        bef0 bef0Var = (bef0) obj;
        return u890.j(this.a, bef0Var.a) && u890.j(this.b, bef0Var.b) && u890.j(this.c, bef0Var.c);
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
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
