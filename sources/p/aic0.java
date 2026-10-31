package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aic0 implements Parcelable {
    public static final Parcelable.Creator<aic0> CREATOR = new v5c0((byte) 20);
    public final kq70 a;
    public final td10 b;
    public final String c;
    public final String d;
    public final dic0 e;

    public aic0(kq70 kq70Var, td10 td10Var, String str, String str2, dic0 dic0Var) {
        this.a = kq70Var;
        this.b = td10Var;
        this.c = str;
        this.d = str2;
        this.e = dic0Var;
    }

    public final kq70 a() {
        return this.a;
    }

    public final dic0 b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aic0)) {
            return false;
        }
        aic0 aic0Var = (aic0) obj;
        return u890.j(this.a, aic0Var.a) && u890.j(this.b, aic0Var.b) && u890.j(this.c, aic0Var.c) && u890.j(this.d, aic0Var.d) && u890.j(this.e, aic0Var.e);
    }

    public final td10 g() {
        return this.b;
    }

    public final String getTitle() {
        return this.c;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        kq70 kq70Var = this.a;
        int iHashCode = (kq70Var == null ? 0 : kq70Var.hashCode()) * 31;
        td10 td10Var = this.b;
        int iD = cy30.d(cy30.d((iHashCode + (td10Var == null ? 0 : td10Var.hashCode())) * 31, 31, this.c), 31, this.d);
        dic0 dic0Var = this.e;
        return iD + (dic0Var != null ? dic0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kq70 kq70Var = this.a;
        if (kq70Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kq70Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        dic0 dic0Var = this.e;
        if (dic0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dic0Var.writeToParcel(parcel, i);
        }
    }
}
