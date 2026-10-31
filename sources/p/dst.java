package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dst implements Parcelable {
    public static final Parcelable.Creator<dst> CREATOR = new zrt((byte) 2);
    public final bst a;
    public final n27 b;
    public final String c;
    public final String d;

    public dst(bst bstVar, n27 n27Var, String str, String str2) {
        this.a = bstVar;
        this.b = n27Var;
        this.c = str;
        this.d = str2;
    }

    public final bst a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dst)) {
            return false;
        }
        dst dstVar = (dst) obj;
        return this.a == dstVar.a && u890.j(this.b, dstVar.b) && u890.j(this.c, dstVar.c) && u890.j(this.d, dstVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        n27 n27Var = this.b;
        int iHashCode2 = (iHashCode + (n27Var == null ? 0 : n27Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
