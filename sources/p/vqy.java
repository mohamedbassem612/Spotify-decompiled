package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vqy implements Parcelable {
    public static final Parcelable.Creator<vqy> CREATOR = new jhy((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final g3d0 d;
    public final Set e;

    public vqy(String str, String str2, String str3, g3d0 g3d0Var, Set set) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = g3d0Var;
        this.e = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqy)) {
            return false;
        }
        vqy vqyVar = (vqy) obj;
        return u890.j(this.a, vqyVar.a) && u890.j(this.b, vqyVar.b) && u890.j(this.c, vqyVar.c) && u890.j(this.d, vqyVar.d) && u890.j(this.e, vqyVar.e);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        g3d0 g3d0Var = this.d;
        int iHashCode2 = (iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31;
        Set set = this.e;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        Set set = this.e;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
