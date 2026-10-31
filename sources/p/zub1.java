package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zub1 implements Parcelable {
    public static final Parcelable.Creator<zub1> CREATOR = new yub1(0);
    public final String a;
    public final List b;
    public final List c;

    public zub1(String str, ArrayList arrayList, List list) {
        this.a = str;
        this.b = list;
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
        if (!(obj instanceof zub1)) {
            return false;
        }
        zub1 zub1Var = (zub1) obj;
        return u890.j(this.a, zub1Var.a) && u890.j(this.b, zub1Var.b) && this.c.equals(zub1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
    }
}
