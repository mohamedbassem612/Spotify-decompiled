package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jmd0 implements dtb1 {
    public static final Parcelable.Creator<jmd0> CREATOR = new lad0((byte) 29);
    public final d761 a;
    public final int b;
    public final int c;
    public final ArrayList d;
    public final float e;
    public final float f;
    public final List g;
    public final int h;
    public final String i;
    public final String t;

    public jmd0(d761 d761Var, int i, int i2, ArrayList arrayList, float f, float f2, List list, int i3, String str, String str2) {
        this.a = d761Var;
        this.b = i;
        this.c = i2;
        this.d = arrayList;
        this.e = f;
        this.f = f2;
        this.g = list;
        this.h = i3;
        this.i = str;
        this.t = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmd0)) {
            return false;
        }
        jmd0 jmd0Var = (jmd0) obj;
        return u890.j(this.a, jmd0Var.a) && this.b == jmd0Var.b && this.c == jmd0Var.c && this.d.equals(jmd0Var.d) && Float.compare(this.e, jmd0Var.e) == 0 && Float.compare(this.f, jmd0Var.f) == 0 && this.g.equals(jmd0Var.g) && this.h == jmd0Var.h && u890.j(this.i, jmd0Var.i) && u890.j(this.t, jmd0Var.t);
    }

    public final String getId() {
        return "ListeningTimeGraph";
    }

    public final int hashCode() {
        return this.t.hashCode() + cy30.d(kaa0.f(this.h, f4i1.b(x0d.f(x0d.f(p3d1.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Arrays.hashCode(this.a.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Iterator itO = xvj1.o(this.d, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeStringList(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
    }
}
