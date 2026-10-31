package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class db20 implements Parcelable {
    public static final Parcelable.Creator<db20> CREATOR = new u220((byte) 27);
    public final String a;
    public final String b;
    public final boolean c;

    public db20(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static db20 a(db20 db20Var, boolean z) {
        String str = db20Var.a;
        String str2 = db20Var.b;
        db20Var.getClass();
        return new db20(str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db20)) {
            return false;
        }
        db20 db20Var = (db20) obj;
        return u890.j(this.a, db20Var.a) && u890.j(this.b, db20Var.b) && this.c == db20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
