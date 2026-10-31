package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ptv implements Parcelable {
    public static final Parcelable.Creator<ptv> CREATOR = new s5v((byte) 16);
    public final String a;
    public final String b;
    public final Set c;
    public final g3d0 d;
    public final lbr e;

    public ptv(String str, String str2, Set set, g3d0 g3d0Var, lbr lbrVar) {
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = g3d0Var;
        this.e = lbrVar;
    }

    public final lbr a() {
        return this.e;
    }

    public final g3d0 b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptv)) {
            return false;
        }
        ptv ptvVar = (ptv) obj;
        return u890.j(this.a, ptvVar.a) && u890.j(this.b, ptvVar.b) && this.c.equals(ptvVar.c) && u890.j(this.d, ptvVar.d) && u890.j(this.e, ptvVar.e);
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        int iC = gvg.c(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        g3d0 g3d0Var = this.d;
        return this.e.hashCode() + ((iC + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itH = k4s0.h(this.c, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
