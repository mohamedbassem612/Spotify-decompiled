package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bcb0 implements Parcelable {
    public static final Parcelable.Creator<bcb0> CREATOR = new jca0((byte) 20);
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public bcb0(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcb0)) {
            return false;
        }
        bcb0 bcb0Var = (bcb0) obj;
        return u890.j(this.a, bcb0Var.a) && u890.j(this.b, bcb0Var.b) && u890.j(this.c, bcb0Var.c) && this.d == bcb0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((xab0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ bcb0() {
        this("", null, z6x.a, false);
    }
}
