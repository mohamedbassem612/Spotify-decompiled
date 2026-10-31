package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c401 implements Parcelable {
    public static final Parcelable.Creator<c401> CREATOR = new erz0((byte) 17);
    public final b401 a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public c401(b401 b401Var, String str, boolean z, boolean z2) {
        this.a = b401Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c401)) {
            return false;
        }
        c401 c401Var = (c401) obj;
        return u890.j(this.a, c401Var.a) && u890.j(this.b, c401Var.b) && this.c == c401Var.c && this.d == c401Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
