package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i5l1 implements Parcelable {
    public static final Parcelable.Creator<i5l1> CREATOR = new ylk1((byte) 12);
    public final String a;
    public final j5l1 b;
    public final List c;

    public i5l1(String str, j5l1 j5l1Var, List list) {
        this.a = str;
        this.b = j5l1Var;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5l1)) {
            return false;
        }
        i5l1 i5l1Var = (i5l1) obj;
        return u890.j(this.a, i5l1Var.a) && this.b == i5l1Var.b && this.c.equals(i5l1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeStringList(this.c);
    }
}
