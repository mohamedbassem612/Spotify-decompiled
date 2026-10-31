package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xtg0 implements dtb1 {
    public static final Parcelable.Creator<xtg0> CREATOR = new isf0((byte) 29);
    public final d761 a;
    public final wtg0 b;
    public final wtg0 c;
    public final float d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public xtg0(d761 d761Var, wtg0 wtg0Var, wtg0 wtg0Var2, float f, int i, int i2, String str, String str2) {
        this.a = d761Var;
        this.b = wtg0Var;
        this.c = wtg0Var2;
        this.d = f;
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtg0)) {
            return false;
        }
        xtg0 xtg0Var = (xtg0) obj;
        return u890.j(this.a, xtg0Var.a) && u890.j(this.b, xtg0Var.b) && u890.j(this.c, xtg0Var.c) && Float.compare(this.d, xtg0Var.d) == 0 && this.e == xtg0Var.e && this.f == xtg0Var.f && u890.j(this.g, xtg0Var.g) && u890.j(this.h, xtg0Var.h);
    }

    public final String getId() {
        return "MarketComparison";
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(kaa0.f(this.f, kaa0.f(this.e, x0d.f((this.c.hashCode() + ((this.b.hashCode() + (Arrays.hashCode(this.a.a) * 31)) * 31)) * 31, 31, this.d), 31), 31), 31, this.g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
