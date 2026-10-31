package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w1j1 implements x1j1 {
    public static final Parcelable.Creator<w1j1> CREATOR = new xbi1((byte) 18);
    public final String a;
    public final List b;
    public final String c;

    public w1j1(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1j1)) {
            return false;
        }
        w1j1 w1j1Var = (w1j1) obj;
        return u890.j(this.a, w1j1Var.a) && u890.j(this.b, w1j1Var.b) && u890.j(this.c, w1j1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.c);
    }
}
