package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ykz0 implements Parcelable {
    public static final Parcelable.Creator<ykz0> CREATOR = new j1z0((byte) 23);
    public final ArrayList a;
    public final String b;

    public ykz0(ArrayList arrayList, String str) {
        this.a = arrayList;
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
        if (!(obj instanceof ykz0)) {
            return false;
        }
        ykz0 ykz0Var = (ykz0) obj;
        return this.a.equals(ykz0Var.a) && u890.j(this.b, ykz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeString(this.b);
    }
}
