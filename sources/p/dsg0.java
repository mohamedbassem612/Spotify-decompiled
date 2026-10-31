package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dsg0 implements Parcelable {
    public static final Parcelable.Creator<dsg0> CREATOR = new isf0((byte) 27);
    public final String a;
    public final boolean b;
    public final String c;

    public dsg0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
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
        if (!(obj instanceof dsg0)) {
            return false;
        }
        dsg0 dsg0Var = (dsg0) obj;
        return u890.j(this.a, dsg0Var.a) && this.b == dsg0Var.b && u890.j(this.c, dsg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
