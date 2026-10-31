package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wb71 extends zb71 {
    public static final Parcelable.Creator<wb71> CREATOR = new v871((byte) 22);
    public final String a;
    public final String b;
    public final rb71 c;
    public final String d;
    public final yb71 e;
    public final String f;
    public final ib71 g;
    public final vb71 h;

    public wb71(String str, String str2, rb71 rb71Var, String str3, yb71 yb71Var, String str4, ib71 ib71Var, vb71 vb71Var) {
        this.a = str;
        this.b = str2;
        this.c = rb71Var;
        this.d = str3;
        this.e = yb71Var;
        this.f = str4;
        this.g = ib71Var;
        this.h = vb71Var;
    }

    @Override // p.zb71
    public final rb71 a() {
        return this.c;
    }

    @Override // p.zb71
    public final ib71 b() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb71)) {
            return false;
        }
        wb71 wb71Var = (wb71) obj;
        return u890.j(this.a, wb71Var.a) && u890.j(this.b, wb71Var.b) && u890.j(this.c, wb71Var.c) && u890.j(this.d, wb71Var.d) && u890.j(this.e, wb71Var.e) && u890.j(this.f, wb71Var.f) && this.g == wb71Var.g && u890.j(this.h, wb71Var.h);
    }

    @Override // p.zb71
    public final vb71 g() {
        return this.h;
    }

    @Override // p.zb71
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        yb71 yb71Var = this.e;
        int iD = cy30.d((iHashCode3 + (yb71Var == null ? 0 : yb71Var.hashCode())) * 31, 31, this.f);
        ib71 ib71Var = this.g;
        int iHashCode4 = (iD + (ib71Var == null ? 0 : ib71Var.hashCode())) * 31;
        vb71 vb71Var = this.h;
        return iHashCode4 + (vb71Var != null ? vb71Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        yb71 yb71Var = this.e;
        if (yb71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yb71Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        ib71 ib71Var = this.g;
        if (ib71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ib71Var.name());
        }
        parcel.writeParcelable(this.h, i);
    }

    public /* synthetic */ wb71(rb71 rb71Var, String str, String str2) {
        this(null, null, rb71Var, str, null, str2, null, null);
    }
}
