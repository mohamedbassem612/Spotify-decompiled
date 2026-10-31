package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t880 implements Parcelable {
    public static final Parcelable.Creator<t880> CREATOR = new mj70((byte) 20);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public t880(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t880)) {
            return false;
        }
        t880 t880Var = (t880) obj;
        return u890.j(this.a, t880Var.a) && u890.j(this.b, t880Var.b) && this.c == t880Var.c && u890.j(this.d, t880Var.d) && u890.j(this.e, t880Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
