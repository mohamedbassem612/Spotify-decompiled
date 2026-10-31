package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class rh90 extends bi90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final yge e;
    public static final qh90 Companion = new qh90();
    public static final Parcelable.Creator<rh90> CREATOR = new qg90((byte) 9);

    public rh90(int i, String str, String str2, String str3, String str4, yge ygeVar) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, ph90.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ygeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh90)) {
            return false;
        }
        rh90 rh90Var = (rh90) obj;
        return u890.j(this.a, rh90Var.a) && u890.j(this.b, rh90Var.b) && u890.j(this.c, rh90Var.c) && u890.j(this.d, rh90Var.d) && u890.j(this.e, rh90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
    }

    public rh90(String str, String str2, String str3, String str4, yge ygeVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ygeVar;
    }
}
