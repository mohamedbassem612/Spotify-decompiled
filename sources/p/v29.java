package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class v29 implements Parcelable {
    public final String a;
    public final List b;
    public final cmc0 c;
    public static final u29 Companion = new u29();
    public static final Parcelable.Creator<v29> CREATOR = new so8((byte) 2);
    public static final znb0[] d = {null, dm5.S(2, vc7.X0), null};

    public /* synthetic */ v29(int i, String str, List list, cmc0 cmc0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = z6x.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cmc0Var;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v29)) {
            return false;
        }
        v29 v29Var = (v29) obj;
        return u890.j(this.a, v29Var.a) && u890.j(this.b, v29Var.b) && u890.j(this.c, v29Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        cmc0 cmc0Var = this.c;
        return iB + (cmc0Var != null ? cmc0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        cmc0 cmc0Var = this.c;
        if (cmc0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cmc0Var.writeToParcel(parcel, i);
        }
    }

    public v29(String str, ArrayList arrayList, cmc0 cmc0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = cmc0Var;
    }
}
