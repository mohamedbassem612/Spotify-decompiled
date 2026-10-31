package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ast implements Parcelable {
    public static final Parcelable.Creator<ast> CREATOR = new zrt((byte) 0);
    public final bst a;
    public final n27 b;
    public final String c;
    public final String d;

    public /* synthetic */ ast(bst bstVar, n27 n27Var, int i) {
        this((i & 1) != 0 ? bst.b : bstVar, (i & 2) != 0 ? null : n27Var, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ast)) {
            return false;
        }
        ast astVar = (ast) obj;
        return this.a == astVar.a && u890.j(this.b, astVar.b) && u890.j(this.c, astVar.c) && u890.j(this.d, astVar.d);
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
        n27 n27Var = this.b;
        if (n27Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n27Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public ast(bst bstVar, n27 n27Var, String str, String str2) {
        this.a = bstVar;
        this.b = n27Var;
        this.c = str;
        this.d = str2;
    }
}
