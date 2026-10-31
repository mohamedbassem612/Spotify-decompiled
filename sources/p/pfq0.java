package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pfq0 implements Parcelable {
    public static final Parcelable.Creator<pfq0> CREATOR = new p7q0((byte) 7);
    public final String a;
    public final String b;

    public pfq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfq0)) {
            return false;
        }
        pfq0 pfq0Var = (pfq0) obj;
        return u890.j(this.a, pfq0Var.a) && u890.j(this.b, pfq0Var.b);
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
