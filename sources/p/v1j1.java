package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1j1 implements x1j1 {
    public static final Parcelable.Creator<v1j1> CREATOR = new xbi1((byte) 17);
    public final String a;
    public final List b;

    public v1j1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1j1)) {
            return false;
        }
        v1j1 v1j1Var = (v1j1) obj;
        return u890.j(this.a, v1j1Var.a) && u890.j(this.b, v1j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
