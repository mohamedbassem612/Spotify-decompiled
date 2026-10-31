package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n6c0 extends o6c0 {
    public static final Parcelable.Creator<n6c0> CREATOR = new v5c0(8);
    public final e8a a;
    public final String b;
    public final ArrayList c;
    public final sco d;
    public final sco e;
    public final String f;
    public final boolean g;

    public n6c0(e8a e8aVar, String str, ArrayList arrayList, sco scoVar, sco scoVar2, String str2, boolean z) {
        this.a = e8aVar;
        this.b = str;
        this.c = arrayList;
        this.d = scoVar;
        this.e = scoVar2;
        this.f = str2;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6c0)) {
            return false;
        }
        n6c0 n6c0Var = (n6c0) obj;
        return this.a == n6c0Var.a && u890.j(this.b, n6c0Var.b) && this.c.equals(n6c0Var.c) && u890.j(this.d, n6c0Var.d) && u890.j(this.e, n6c0Var.e) && u890.j(this.f, n6c0Var.f) && this.g == n6c0Var.g;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        sco scoVar = this.d;
        int iHashCode = (iF + (scoVar == null ? 0 : scoVar.hashCode())) * 31;
        sco scoVar2 = this.e;
        return Boolean.hashCode(this.g) + cy30.d((iHashCode + (scoVar2 != null ? scoVar2.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((z4a) itO.next()).writeToParcel(parcel, i);
        }
        sco scoVar = this.d;
        if (scoVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scoVar.writeToParcel(parcel, i);
        }
        sco scoVar2 = this.e;
        if (scoVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scoVar2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
