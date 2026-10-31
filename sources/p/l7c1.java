package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l7c1 implements Parcelable {
    public static final Parcelable.Creator<l7c1> CREATOR = new yub1(28);
    public final String a;
    public final String b;
    public final c380 c;
    public final c380 d;
    public final int e;

    public l7c1(String str, String str2, c380 c380Var, c380 c380Var2, int i) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = c380Var2;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7c1)) {
            return false;
        }
        l7c1 l7c1Var = (l7c1) obj;
        return u890.j(this.a, l7c1Var.a) && u890.j(this.b, l7c1Var.b) && u890.j(this.c, l7c1Var.c) && u890.j(this.d, l7c1Var.d) && this.e == l7c1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + kk0.f(this.d, kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        Iterator itL = x0d.l(this.d, parcel);
        while (itL.hasNext()) {
            ((dka1) itL.next()).writeToParcel(parcel, i);
        }
        int i2 = this.e;
        if (i2 == 1) {
            str = "UNSPECIFIED";
        } else if (i2 == 2) {
            str = "EVERGREEN";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "TIMELY";
        }
        parcel.writeString(str);
    }
}
