package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h2o0 implements Parcelable {
    public static final Parcelable.Creator<h2o0> CREATOR = new dan0((byte) 25);
    public final int a;
    public final String b;
    public final List c;
    public final String d;

    public h2o0(int i, String str, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2o0)) {
            return false;
        }
        h2o0 h2o0Var = (h2o0) obj;
        return this.a == h2o0Var.a && u890.j(this.b, h2o0Var.b) && u890.j(this.c, h2o0Var.c) && u890.j(this.d, h2o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
    }
}
