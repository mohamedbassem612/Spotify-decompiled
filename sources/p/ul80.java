package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ul80 implements Parcelable {
    public static final Parcelable.Creator<ul80> CREATOR = new mj70((byte) 27);
    public final d761 a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final ArrayList g;
    public final Integer h;

    public ul80(d761 d761Var, String str, String str2, int i, String str3, int i2, ArrayList arrayList, Integer num) {
        this.a = d761Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = arrayList;
        this.h = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul80)) {
            return false;
        }
        ul80 ul80Var = (ul80) obj;
        return u890.j(this.a, ul80Var.a) && u890.j(this.b, ul80Var.b) && u890.j(this.c, ul80Var.c) && this.d == ul80Var.d && u890.j(this.e, ul80Var.e) && this.f == ul80Var.f && this.g.equals(ul80Var.g) && u890.j(this.h, ul80Var.h);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.g, kaa0.f(this.f, cy30.d(kaa0.f(this.d, cy30.d(cy30.d(Arrays.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31);
        Integer num = this.h;
        return iF + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        Iterator itO = xvj1.o(this.g, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        Integer num = this.h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
