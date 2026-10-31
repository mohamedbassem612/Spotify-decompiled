package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class s360 implements Parcelable {
    public final String a;
    public final String b;
    public static final r360 Companion = new r360();
    public static final Parcelable.Creator<s360> CREATOR = new xk50((byte) 13);

    public /* synthetic */ s360(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, q360.a.getDescriptor());
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
        if (!(obj instanceof s360)) {
            return false;
        }
        s360 s360Var = (s360) obj;
        return u890.j(this.a, s360Var.a) && u890.j(this.b, s360Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public s360(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
