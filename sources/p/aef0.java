package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aef0 implements Parcelable {
    public static final Parcelable.Creator<aef0> CREATOR = new j7f0(6);
    public final long a;
    public final String b;
    public final ArrayList c;

    public aef0(long j, String str, ArrayList arrayList) {
        this.a = j;
        this.b = str;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aef0)) {
            return false;
        }
        aef0 aef0Var = (aef0) obj;
        return this.a == aef0Var.a && u890.j(this.b, aef0Var.b) && this.c.equals(aef0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((cef0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
