package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pz6 implements Parcelable {
    public static final Parcelable.Creator<pz6> CREATOR = new fp5((byte) 25);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Long e;

    public pz6(String str, String str2, String str3, List list, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz6)) {
            return false;
        }
        pz6 pz6Var = (pz6) obj;
        return u890.j(this.a, pz6Var.a) && u890.j(this.b, pz6Var.b) && u890.j(this.c, pz6Var.c) && u890.j(this.d, pz6Var.d) && u890.j(this.e, pz6Var.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return iB + (l == null ? 0 : l.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
