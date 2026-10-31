package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ept implements Parcelable {
    public static final Parcelable.Creator<ept> CREATOR = new hbn1((byte) 14);
    public final String a;
    public final bpt b;
    public final String c;
    public final String d;
    public final int e;

    public ept(String str, bpt bptVar, String str2, String str3, int i) {
        this.a = str;
        this.b = bptVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ept)) {
            return false;
        }
        ept eptVar = (ept) obj;
        return u890.j(this.a, eptVar.a) && this.b == eptVar.b && u890.j(this.c, eptVar.c) && u890.j(this.d, eptVar.d) && this.e == eptVar.e;
    }

    public final bpt g() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
