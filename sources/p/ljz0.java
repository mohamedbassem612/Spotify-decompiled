package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ljz0 implements Parcelable {
    public static final Parcelable.Creator<ljz0> CREATOR = new j1z0((byte) 19);
    public final ArrayList a;
    public final pbf0 b;
    public final String c;
    public final String d;
    public final boolean e;

    public ljz0(ArrayList arrayList, pbf0 pbf0Var, String str, String str2, boolean z) {
        this.a = arrayList;
        this.b = pbf0Var;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljz0)) {
            return false;
        }
        ljz0 ljz0Var = (ljz0) obj;
        return this.a.equals(ljz0Var.a) && u890.j(this.b, ljz0Var.b) && u890.j(this.c, ljz0Var.c) && u890.j(this.d, ljz0Var.d) && this.e == ljz0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((xp31) itO.next()).writeToParcel(parcel, i);
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
