package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qa20 implements Parcelable {
    public static final Parcelable.Creator<qa20> CREATOR = new u220((byte) 21);
    public final String a;
    public final boolean b;
    public final pa20 c;

    public qa20(String str, boolean z, pa20 pa20Var) {
        this.a = str;
        this.b = z;
        this.c = pa20Var;
    }

    public final pa20 a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa20)) {
            return false;
        }
        qa20 qa20Var = (qa20) obj;
        return u890.j(this.a, qa20Var.a) && this.b == qa20Var.b && u890.j(this.c, qa20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
