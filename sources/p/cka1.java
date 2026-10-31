package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cka1 implements dtb1 {
    public static final Parcelable.Creator<cka1> CREATOR = new nja1((byte) 2);
    public final d761 a;
    public final d761 b;
    public final drf1 c;
    public final String d;

    public cka1(d761 d761Var, d761 d761Var2, drf1 drf1Var, String str) {
        this.a = d761Var;
        this.b = d761Var2;
        this.c = drf1Var;
        this.d = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cka1)) {
            return false;
        }
        cka1 cka1Var = (cka1) obj;
        return u890.j(this.a, cka1Var.a) && u890.j(this.b, cka1Var.b) && u890.j(this.c, cka1Var.c) && u890.j(this.d, cka1Var.d);
    }

    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.a.a) * 31;
        d761 d761Var = this.b;
        return this.d.hashCode() + f4i1.b((iHashCode + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31, 31, this.c.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
