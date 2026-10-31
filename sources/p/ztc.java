package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ztc implements Parcelable {
    public static final Parcelable.Creator<ztc> CREATOR = new yyb((byte) 11);
    public static final mia1 X;
    public static final mia1 Y;
    public static final mia1 i;
    public static final mia1 t;
    public final mia1 a;
    public final String b;
    public final List c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final int g;
    public final Integer h;

    static {
        mia1 mia1Var = new mia1("name", false, null, 6);
        i = mia1Var;
        mia1 mia1Var2 = new mia1("album.name", false, mia1Var, 2);
        t = mia1Var2;
        X = new mia1("artist.name", false, mia1Var2, 2);
        Y = new mia1("relevance", false, null, 6);
    }

    public /* synthetic */ ztc(Integer num, int i2) {
        this(i, "", z6x.a, null, (i2 & 16) != 0 ? null : 5, (i2 & 32) != 0 ? null : num, 0, null);
    }

    public static ztc a(ztc ztcVar, mia1 mia1Var, List list, int i2, int i3) {
        if ((i3 & 1) != 0) {
            mia1Var = ztcVar.a;
        }
        mia1 mia1Var2 = mia1Var;
        String str = ztcVar.b;
        if ((i3 & 4) != 0) {
            list = ztcVar.c;
        }
        List list2 = list;
        Integer num = ztcVar.d;
        Integer num2 = ztcVar.e;
        Integer num3 = ztcVar.f;
        if ((i3 & 64) != 0) {
            i2 = ztcVar.g;
        }
        int i4 = i2;
        Integer num4 = (i3 & 128) != 0 ? ztcVar.h : null;
        ztcVar.getClass();
        return new ztc(mia1Var2, str, list2, num, num2, num3, i4, num4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztc)) {
            return false;
        }
        ztc ztcVar = (ztc) obj;
        return u890.j(this.a, ztcVar.a) && u890.j(this.b, ztcVar.b) && u890.j(this.c, ztcVar.c) && u890.j(this.d, ztcVar.d) && u890.j(this.e, ztcVar.e) && u890.j(this.f, ztcVar.f) && this.g == ztcVar.g && u890.j(this.h, ztcVar.h);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iF = kaa0.f(this.g, (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        Integer num4 = this.h;
        return iF + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        this.a.writeToParcel(parcel, i2);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num2);
        }
        Integer num3 = this.f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num3);
        }
        parcel.writeInt(this.g);
        Integer num4 = this.h;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num4);
        }
    }

    public ztc(mia1 mia1Var, String str, List list, Integer num, Integer num2, Integer num3, int i2, Integer num4) {
        this.a = mia1Var;
        this.b = str;
        this.c = list;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = i2;
        this.h = num4;
    }
}
