package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class p150 implements x150 {
    public final String a;
    public final String b;
    public static final o150 Companion = new o150();
    public static final Parcelable.Creator<p150> CREATOR = new fd40(17);

    public /* synthetic */ p150(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, n150.a.getDescriptor());
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
        if (!(obj instanceof p150)) {
            return false;
        }
        p150 p150Var = (p150) obj;
        return u890.j(this.a, p150Var.a) && u890.j(this.b, p150Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public p150(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
