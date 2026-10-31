package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ete implements Parcelable {
    public static final Parcelable.Creator<ete> CREATOR;
    public final w4i1 a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final boolean e;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
        CREATOR = new zge((byte) 16);
    }

    public ete(String str, String str2, ArrayList arrayList, w4i1 w4i1Var, boolean z) {
        this.a = w4i1Var;
        this.b = arrayList;
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
        if (!(obj instanceof ete)) {
            return false;
        }
        ete eteVar = (ete) obj;
        return u890.j(this.a, eteVar.a) && this.b.equals(eteVar.b) && u890.j(this.c, eteVar.c) && u890.j(this.d, eteVar.d) && this.e == eteVar.e;
    }

    public final int hashCode() {
        int iD = cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vy30) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
