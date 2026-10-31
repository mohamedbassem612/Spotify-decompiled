package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bw70 implements knt, Parcelable {
    public static final Parcelable.Creator<bw70> CREATOR = new mj70((byte) 10);
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public bw70(int i, String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw70)) {
            return false;
        }
        bw70 bw70Var = (bw70) obj;
        return u890.j(this.a, bw70Var.a) && u890.j(this.b, bw70Var.b) && this.c.equals(bw70Var.c) && this.d == bw70Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeInt(this.d);
    }
}
