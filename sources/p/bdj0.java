package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class bdj0 implements Parcelable {
    public final String a;
    public final String b;
    public static final adj0 Companion = new adj0();
    public static final Parcelable.Creator<bdj0> CREATOR = new rqi0((byte) 26);

    public /* synthetic */ bdj0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ycj0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdj0)) {
            return false;
        }
        bdj0 bdj0Var = (bdj0) obj;
        return u890.j(this.a, bdj0Var.a) && u890.j(this.b, bdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public bdj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
