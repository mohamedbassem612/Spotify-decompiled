package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class djw0 implements Parcelable {
    public static final Parcelable.Creator<djw0> CREATOR = new w7w0((byte) 15);
    public final String a;
    public final Set b;
    public final String c;
    public final String d;
    public final String e;

    public djw0(String str, String str2, String str3, String str4, Set set) {
        this.a = str;
        this.b = set;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djw0)) {
            return false;
        }
        djw0 djw0Var = (djw0) obj;
        return u890.j(this.a, djw0Var.a) && this.b.equals(djw0Var.b) && u890.j(this.c, djw0Var.c) && u890.j(this.d, djw0Var.d) && u890.j(this.e, djw0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iC = gvg.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itH = k4s0.h(this.b, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
