package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class do10 implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public static final co10 Companion = new co10();
    public static final Parcelable.Creator<do10> CREATOR = new qn00((byte) 27);

    public /* synthetic */ do10(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, bo10.a.getDescriptor());
            throw null;
        }
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
        if (!(obj instanceof do10)) {
            return false;
        }
        do10 do10Var = (do10) obj;
        return u890.j(this.a, do10Var.a) && u890.j(this.b, do10Var.b) && u890.j(this.c, do10Var.c);
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

    public do10(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
