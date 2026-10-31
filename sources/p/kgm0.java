package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kgm0 implements Parcelable {
    public static final Parcelable.Creator<kgm0> CREATOR = new fgm0((byte) 7);
    public final String a;
    public final String b;
    public final List c;

    public kgm0(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static kgm0 a(kgm0 kgm0Var, ArrayList arrayList) {
        String str = kgm0Var.a;
        String str2 = kgm0Var.b;
        kgm0Var.getClass();
        return new kgm0(str, arrayList, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgm0)) {
            return false;
        }
        kgm0 kgm0Var = (kgm0) obj;
        return u890.j(this.a, kgm0Var.a) && u890.j(this.b, kgm0Var.b) && u890.j(this.c, kgm0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        List list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((jgm0) it.next()).writeToParcel(parcel, i);
        }
    }
}
