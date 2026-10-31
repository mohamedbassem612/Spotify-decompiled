package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xbs0 implements Parcelable {
    public static final Parcelable.Creator<xbs0> CREATOR = new zsr0((byte) 29);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final c380 g;
    public final ee30 h;
    public final c380 i;
    public final imr0 t;

    public xbs0(String str, String str2, String str3, String str4, String str5, boolean z, c380 c380Var, ee30 ee30Var, c380 c380Var2, imr0 imr0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = c380Var;
        this.h = ee30Var;
        this.i = c380Var2;
        this.t = imr0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbs0)) {
            return false;
        }
        xbs0 xbs0Var = (xbs0) obj;
        if (!u890.j(this.a, xbs0Var.a)) {
            return false;
        }
        String str = xbs0Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals && u890.j(this.c, xbs0Var.c) && u890.j(this.d, xbs0Var.d) && u890.j(this.e, xbs0Var.e) && this.f == xbs0Var.f && u890.j(this.g, xbs0Var.g) && u890.j(this.h, xbs0Var.h) && u890.j(this.i, xbs0Var.i) && u890.j(this.t, xbs0Var.t);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iF = kk0.f(this.i, (this.h.hashCode() + kk0.f(this.g, xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31)) * 31, 31);
        imr0 imr0Var = this.t;
        return iF + (imr0Var != null ? imr0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        String str = this.b;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeStringList(this.g);
        this.h.writeToParcel(parcel, i);
        Iterator itL = x0d.l(this.i, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        imr0 imr0Var = this.t;
        if (imr0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imr0Var.writeToParcel(parcel, i);
        }
    }
}
