package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xel implements yel {
    public static final Parcelable.Creator<xel> CREATOR = new txk((byte) 11);
    public final List a;
    public final List b;

    public xel(ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xel)) {
            return false;
        }
        xel xelVar = (xel) obj;
        return this.a.equals(xelVar.a) && u890.j(this.b, xelVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
    }
}
