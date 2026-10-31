package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class wid0 implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public static final vid0 Companion = new vid0();
    public static final Parcelable.Creator<wid0> CREATOR = new lad0((byte) 25);

    public /* synthetic */ wid0(String str, int i, String str2, String str3, boolean z, String str4) {
        if (27 != (i & 27)) {
            o6p1.t(i, 27, sid0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = z;
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
        if (!(obj instanceof wid0)) {
            return false;
        }
        wid0 wid0Var = (wid0) obj;
        return u890.j(this.a, wid0Var.a) && u890.j(this.b, wid0Var.b) && u890.j(this.c, wid0Var.c) && this.d == wid0Var.d && u890.j(this.e, wid0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }

    public wid0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }
}
