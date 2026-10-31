package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b0y0 extends c0y0 {
    public static final Parcelable.Creator<b0y0> CREATOR = new zzx0((byte) 1);
    public final String b;
    public final String c;
    public final List d;

    public b0y0(String str, List list, String str2) {
        super(str2);
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @Override // p.c0y0
    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0y0)) {
            return false;
        }
        b0y0 b0y0Var = (b0y0) obj;
        return u890.j(this.b, b0y0Var.b) && u890.j(this.c, b0y0Var.c) && u890.j(this.d, b0y0Var.d);
    }

    @Override // p.c0y0
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
    }
}
