package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zg71 implements Parcelable {
    public static final Parcelable.Creator<zg71> CREATOR = new ff71(4);
    public final hl71 a;
    public final k371 b;
    public final Integer c;
    public final te71 d;
    public final xg71 e;
    public final yg71 f;
    public final va71 g;
    public final z771 h;

    public zg71(hl71 hl71Var, k371 k371Var, Integer num, te71 te71Var, xg71 xg71Var, yg71 yg71Var, va71 va71Var, z771 z771Var) {
        this.a = hl71Var;
        this.b = k371Var;
        this.c = num;
        this.d = te71Var;
        this.e = xg71Var;
        this.f = yg71Var;
        this.g = va71Var;
        this.h = z771Var;
    }

    public static zg71 a(zg71 zg71Var, hl71 hl71Var, k371 k371Var, Integer num, te71 te71Var, xg71 xg71Var, yg71 yg71Var, va71 va71Var, z771 z771Var, int i) {
        if ((i & 1) != 0) {
            hl71Var = zg71Var.a;
        }
        hl71 hl71Var2 = hl71Var;
        if ((i & 2) != 0) {
            k371Var = zg71Var.b;
        }
        k371 k371Var2 = k371Var;
        if ((i & 4) != 0) {
            num = zg71Var.c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            te71Var = zg71Var.d;
        }
        te71 te71Var2 = te71Var;
        if ((i & 16) != 0) {
            xg71Var = zg71Var.e;
        }
        xg71 xg71Var2 = xg71Var;
        if ((i & 32) != 0) {
            yg71Var = zg71Var.f;
        }
        return new zg71(hl71Var2, k371Var2, num2, te71Var2, xg71Var2, yg71Var, (i & 64) != 0 ? zg71Var.g : va71Var, (i & 128) != 0 ? zg71Var.h : z771Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg71)) {
            return false;
        }
        zg71 zg71Var = (zg71) obj;
        return u890.j(this.a, zg71Var.a) && u890.j(this.b, zg71Var.b) && u890.j(this.c, zg71Var.c) && u890.j(this.d, zg71Var.d) && u890.j(this.e, zg71Var.e) && u890.j(this.f, zg71Var.f) && u890.j(this.g, zg71Var.g) && u890.j(this.h, zg71Var.h) && u890.j((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        yg71 yg71Var = this.f;
        int iHashCode3 = (iHashCode2 + (yg71Var == null ? 0 : yg71Var.hashCode())) * 31;
        va71 va71Var = this.g;
        int iHashCode4 = (iHashCode3 + (va71Var == null ? 0 : va71Var.a.hashCode())) * 31;
        z771 z771Var = this.h;
        return ((iHashCode4 + (z771Var == null ? 0 : z771Var.a.hashCode())) * 31) + 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        yg71 yg71Var = this.f;
        if (yg71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yg71Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
