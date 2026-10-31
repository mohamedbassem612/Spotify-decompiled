package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ajg1 implements Parcelable {
    public static final Parcelable.Creator<ajg1> CREATOR = new h3g1((byte) 8);
    public final String a;
    public final String b;
    public final String c;

    public ajg1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajg1)) {
            return false;
        }
        ajg1 ajg1Var = (ajg1) obj;
        return u890.j(this.a, ajg1Var.a) && u890.j(this.b, ajg1Var.b) && u890.j(this.c, ajg1Var.c);
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
