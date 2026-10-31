package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p220 implements w220 {
    public static final Parcelable.Creator<p220> CREATOR = new no10((byte) 25);
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;

    public p220(String str, String str2, String str3, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p220)) {
            return false;
        }
        p220 p220Var = (p220) obj;
        return u890.j(this.a, p220Var.a) && u890.j(this.b, p220Var.b) && u890.j(this.c, p220Var.c) && u890.j(this.d, p220Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            ((m4g) itL.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
    }
}
