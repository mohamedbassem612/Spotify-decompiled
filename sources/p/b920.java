package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b920 implements Parcelable {
    public static final Parcelable.Creator<b920> CREATOR = new u220((byte) 17);
    public final List a;
    public final String b;

    public b920(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b920)) {
            return false;
        }
        b920 b920Var = (b920) obj;
        return u890.j(this.a, b920Var.a) && u890.j(this.b, b920Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((x820) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
    }
}
