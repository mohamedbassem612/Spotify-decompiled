package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mnh0 implements oim {
    public static final Parcelable.Creator<mnh0> CREATOR = new hug0((byte) 19);
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final boolean e;

    public mnh0(String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnh0)) {
            return false;
        }
        mnh0 mnh0Var = (mnh0) obj;
        return u890.j(this.a, mnh0Var.a) && u890.j(this.b, mnh0Var.b) && this.c.equals(mnh0Var.c) && this.d.equals(mnh0Var.d) && this.e == mnh0Var.e;
    }

    public final bjm getTarget() {
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + f4i1.b(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
