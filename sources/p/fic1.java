package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fic1 implements tic1 {
    public static final Parcelable.Creator<fic1> CREATOR = new y7c1((byte) 8);
    public final String a;
    public final List b;
    public final int c;

    public fic1(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fic1)) {
            return false;
        }
        fic1 fic1Var = (fic1) obj;
        return u890.j(this.a, fic1Var.a) && u890.j(this.b, fic1Var.b) && this.c == fic1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeInt(this.c);
    }
}
