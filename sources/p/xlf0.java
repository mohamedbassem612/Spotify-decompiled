package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xlf0 implements Parcelable {
    public static final Parcelable.Creator<xlf0> CREATOR = new j7f0((byte) 17);
    public final int a;
    public final String b;
    public final long c;
    public final ArrayList d;

    public xlf0(int i, String str, long j, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlf0)) {
            return false;
        }
        xlf0 xlf0Var = (xlf0) obj;
        return this.a == xlf0Var.a && u890.j(this.b, xlf0Var.b) && this.c == xlf0Var.c && this.d.equals(xlf0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
    }
}
