package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eo6 implements Parcelable {
    public static final Parcelable.Creator<eo6> CREATOR = new fp5((byte) 11);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public eo6(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
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
        if (!(obj instanceof eo6)) {
            return false;
        }
        eo6 eo6Var = (eo6) obj;
        return u890.j(this.a, eo6Var.a) && u890.j(this.b, eo6Var.b) && this.c == eo6Var.c && u890.j(this.d, eo6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
