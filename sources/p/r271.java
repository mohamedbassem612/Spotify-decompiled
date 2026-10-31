package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r271 implements Parcelable {
    public static final Parcelable.Creator<r271> CREATOR = new hs61((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public r271(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r271)) {
            return false;
        }
        r271 r271Var = (r271) obj;
        return u890.j(this.a, r271Var.a) && u890.j(this.b, r271Var.b) && u890.j(this.c, r271Var.c) && u890.j(this.d, r271Var.d) && u890.j(this.e, r271Var.e) && u890.j(this.f, r271Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
