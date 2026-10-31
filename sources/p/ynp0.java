package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ynp0 implements Parcelable {
    public static final Parcelable.Creator<ynp0> CREATOR = new ump0((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public ynp0(String str, List list, String str2, String str3) {
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
        if (!(obj instanceof ynp0)) {
            return false;
        }
        ynp0 ynp0Var = (ynp0) obj;
        return u890.j(this.a, ynp0Var.a) && u890.j(this.b, ynp0Var.b) && u890.j(this.c, ynp0Var.c) && this.d.equals(ynp0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
    }
}
