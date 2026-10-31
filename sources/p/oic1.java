package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oic1 implements tic1 {
    public static final Parcelable.Creator<oic1> CREATOR = new y7c1((byte) 16);
    public final int a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public oic1(int i, int i2, String str, String str2, String str3, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oic1)) {
            return false;
        }
        oic1 oic1Var = (oic1) obj;
        return this.a == oic1Var.a && u890.j(this.b, oic1Var.b) && u890.j(this.c, oic1Var.c) && u890.j(this.d, oic1Var.d) && u890.j(this.e, oic1Var.e) && this.f == oic1Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Integer.hashCode(this.f) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public /* synthetic */ oic1(int i, int i2) {
        this(i, i2, "", "", null, z6x.a);
    }
}
