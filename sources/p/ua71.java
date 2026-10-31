package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ua71 implements Parcelable {
    public static final Parcelable.Creator<ua71> CREATOR = new v871((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final k371 d;

    public ua71(String str, String str2, String str3, k371 k371Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k371Var;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("share.args", this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua71)) {
            return false;
        }
        ua71 ua71Var = (ua71) obj;
        return u890.j(this.a, ua71Var.a) && u890.j(this.b, ua71Var.b) && u890.j(this.c, ua71Var.c) && u890.j(this.d, ua71Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(new w871(this.c), i);
        parcel.writeParcelable(this.d, i);
    }

    public /* synthetic */ ua71(String str, String str2, String str3, k371 k371Var, int i) {
        this(str, str2, str3, k371Var);
    }
}
