package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class evb1 implements Parcelable {
    public static final Parcelable.Creator<evb1> CREATOR = new yub1(1);
    public final String a;
    public final kvb1 b;
    public final mvb1 c;
    public final List d;

    public /* synthetic */ evb1(String str, kvb1 kvb1Var, xne0 xne0Var, h290 h290Var, int i) {
        this(str, kvb1Var, (i & 4) != 0 ? null : xne0Var, (i & 8) != 0 ? z6x.a : h290Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evb1)) {
            return false;
        }
        evb1 evb1Var = (evb1) obj;
        return u890.j(this.a, evb1Var.a) && u890.j(this.b, evb1Var.b) && u890.j(this.c, evb1Var.c) && u890.j(this.d, evb1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        mvb1 mvb1Var = this.c;
        return this.d.hashCode() + ((iHashCode + (mvb1Var == null ? 0 : mvb1Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeStringList(this.d);
    }

    public evb1(String str, kvb1 kvb1Var, mvb1 mvb1Var, List list) {
        this.a = str;
        this.b = kvb1Var;
        this.c = mvb1Var;
        this.d = list;
    }
}
