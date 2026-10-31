package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oh90 implements hi90, Parcelable {
    public static final Parcelable.Creator<oh90> CREATOR = new qg90((byte) 8);
    public final String a;
    public final String b;
    public final String c;

    public oh90(String str, String str2, String str3) {
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
        if (!(obj instanceof oh90)) {
            return false;
        }
        oh90 oh90Var = (oh90) obj;
        return u890.j(this.a, oh90Var.a) && u890.j(this.b, oh90Var.b) && u890.j(this.c, oh90Var.c);
    }

    @Override // p.hi90
    public final String getImageUri() {
        return this.c;
    }

    @Override // p.hi90
    public final String getName() {
        return this.b;
    }

    @Override // p.hi90
    public final String getUri() {
        return this.a;
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
