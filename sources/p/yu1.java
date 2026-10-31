package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yu1 implements Parcelable {
    public static final Parcelable.Creator<yu1> CREATOR = new d41((byte) 24);
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final gy1 e;

    public yu1(String str, ArrayList arrayList, String str2, boolean z, gy1 gy1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = z;
        this.e = gy1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu1)) {
            return false;
        }
        yu1 yu1Var = (yu1) obj;
        return u890.j(this.a, yu1Var.a) && this.b.equals(yu1Var.b) && u890.j(this.c, yu1Var.c) && this.d == yu1Var.d && u890.j(this.e, yu1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
    }
}
