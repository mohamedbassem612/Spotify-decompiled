package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vb7 implements Parcelable {
    public static final Parcelable.Creator<vb7> CREATOR = new f67((byte) 4);
    public final String a;
    public final String b;
    public final qb7 c;

    public vb7(String str, String str2, qb7 qb7Var) {
        this.a = str;
        this.b = str2;
        this.c = qb7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb7)) {
            return false;
        }
        vb7 vb7Var = (vb7) obj;
        return u890.j(this.a, vb7Var.a) && u890.j(this.b, vb7Var.b) && this.c == vb7Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
