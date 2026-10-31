package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ybi1 implements Parcelable {
    public final String a;
    public final String b;
    public static final wbi1 Companion = new wbi1();
    public static final Parcelable.Creator<ybi1> CREATOR = new xbi1((byte) 0);

    public /* synthetic */ ybi1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ubi1.a.getDescriptor());
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
        if (!(obj instanceof ybi1)) {
            return false;
        }
        ybi1 ybi1Var = (ybi1) obj;
        return u890.j(this.a, ybi1Var.a) && u890.j(this.b, ybi1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public ybi1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
