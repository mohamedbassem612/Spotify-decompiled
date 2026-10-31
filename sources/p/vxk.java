package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vxk implements xxk {
    public static final Parcelable.Creator<vxk> CREATOR = new txk((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public vxk(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxk)) {
            return false;
        }
        vxk vxkVar = (vxk) obj;
        return u890.j(this.a, vxkVar.a) && u890.j(this.b, vxkVar.b) && u890.j(this.c, vxkVar.c) && u890.j(this.d, vxkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
    }
}
