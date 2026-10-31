package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e951 implements Parcelable {
    public static final Parcelable.Creator<e951> CREATOR = new uo41((byte) 15);
    public final List a;
    public final boolean b;
    public final String c;

    public e951(String str, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e951)) {
            return false;
        }
        e951 e951Var = (e951) obj;
        return u890.j(this.a, e951Var.a) && this.b == e951Var.b && u890.j(this.c, e951Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
