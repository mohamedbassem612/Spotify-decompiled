package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ag81 implements cg81 {
    public static final Parcelable.Creator<ag81> CREATOR = new ro71((byte) 11);
    public final String a;
    public final List b;
    public final boolean c;

    public ag81(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag81)) {
            return false;
        }
        ag81 ag81Var = (ag81) obj;
        return u890.j(this.a, ag81Var.a) && u890.j(this.b, ag81Var.b) && this.c == ag81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
