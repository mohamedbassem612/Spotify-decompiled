package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jpf0 implements lpf0 {
    public static final Parcelable.Creator<jpf0> CREATOR = new ipf0((byte) 0);
    public final fef0 a;
    public final bff0 b;
    public final String c;
    public final String d;
    public final String e;
    public final Set f;
    public final Set g;
    public final boolean h;

    public jpf0(fef0 fef0Var, bff0 bff0Var, String str, String str2, String str3, Set set, Set set2, boolean z) {
        this.a = fef0Var;
        this.b = bff0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = set;
        this.g = set2;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf0)) {
            return false;
        }
        jpf0 jpf0Var = (jpf0) obj;
        return u890.j(this.a, jpf0Var.a) && u890.j(this.b, jpf0Var.b) && u890.j(this.c, jpf0Var.c) && u890.j(this.d, jpf0Var.d) && u890.j(this.e, jpf0Var.e) && this.f.equals(jpf0Var.f) && this.g.equals(jpf0Var.g) && this.h == jpf0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.h) + gvg.c(gvg.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator itH = k4s0.h(this.f, parcel);
        while (itH.hasNext()) {
            parcel.writeInt(((Number) itH.next()).intValue());
        }
        Iterator itH2 = k4s0.h(this.g, parcel);
        while (itH2.hasNext()) {
            parcel.writeInt(((Number) itH2.next()).intValue());
        }
        parcel.writeInt(this.h ? 1 : 0);
    }
}
