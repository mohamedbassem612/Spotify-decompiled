package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kx11 implements Parcelable {
    public static final Parcelable.Creator<kx11> CREATOR = new e211((byte) 17);
    public final String a;
    public final cxn b;
    public final String c;

    public kx11(String str, cxn cxnVar, String str2) {
        this.a = str;
        this.b = cxnVar;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx11)) {
            return false;
        }
        kx11 kx11Var = (kx11) obj;
        return u890.j(this.a, kx11Var.a) && u890.j(this.b, kx11Var.b) && u890.j(this.c, kx11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
