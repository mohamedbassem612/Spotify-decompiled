package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hm3 extends jm3 {
    public static final Parcelable.Creator<hm3> CREATOR = new i93((byte) 6);
    public final String a;
    public final List b;
    public final EntryPoint c;
    public final boolean d;

    public hm3(String str, ArrayList arrayList, EntryPoint entryPoint, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = entryPoint;
        this.d = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm3)) {
            return false;
        }
        hm3 hm3Var = (hm3) obj;
        return u890.j(this.a, hm3Var.a) && this.b.equals(hm3Var.b) && this.c == hm3Var.c && this.d == hm3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c.name());
        parcel.writeInt(this.d ? 1 : 0);
    }
}
