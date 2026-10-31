package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fm3 extends jm3 {
    public static final Parcelable.Creator<fm3> CREATOR = new i93((byte) 4);
    public final boolean a;
    public final EntryPoint b;
    public final String c;
    public final String d;

    public fm3(boolean z, EntryPoint entryPoint, String str, String str2) {
        this.a = z;
        this.b = entryPoint;
        this.c = str;
        this.d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3)) {
            return false;
        }
        fm3 fm3Var = (fm3) obj;
        return this.a == fm3Var.a && this.b == fm3Var.b && u890.j(this.c, fm3Var.c) && u890.j(this.d, fm3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public /* synthetic */ fm3(boolean z, EntryPoint entryPoint, String str) {
        this(z, entryPoint, str, "");
    }
}
