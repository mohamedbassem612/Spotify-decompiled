package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4a extends xl81 implements yod1, hv51 {
    public static final Parcelable.Creator<w4a> CREATOR = new ux9((byte) 16);
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;

    public w4a(String str, String str2, boolean z, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4a)) {
            return false;
        }
        w4a w4aVar = (w4a) obj;
        return u890.j(this.a, w4aVar.a) && u890.j(this.b, w4aVar.b) && this.c.equals(w4aVar.c) && this.d == w4aVar.d && u890.j(this.e, w4aVar.e);
    }

    public final boolean f() {
        return this.d;
    }

    public final List getTags() {
        return this.c;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }
}
