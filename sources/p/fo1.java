package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fo1 implements Parcelable {
    public static final Parcelable.Creator<fo1> CREATOR = new d41(19);
    public final ru1 a;
    public final Map b;

    public fo1(ru1 ru1Var, Map map) {
        this.a = ru1Var;
        this.b = map;
    }

    public static yv51 a(fo1 fo1Var) {
        return (yv51) fo1Var.b.get("atp");
    }

    public final boolean b() {
        ru1 ru1Var = this.a;
        return u890.j(ru1Var != null ? ru1Var.a : null, "atp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo1)) {
            return false;
        }
        fo1 fo1Var = (fo1) obj;
        return u890.j(this.a, fo1Var.a) && u890.j(this.b, fo1Var.b);
    }

    public final int hashCode() {
        ru1 ru1Var = this.a;
        return this.b.hashCode() + ((ru1Var == null ? 0 : ru1Var.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ru1 ru1Var = this.a;
        if (ru1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ru1Var.writeToParcel(parcel, i);
        }
        Iterator itJ = xcg1.j(parcel, this.b);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            yv51 yv51Var = (yv51) entry.getValue();
            if (yv51Var == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                yv51Var.writeToParcel(parcel, i);
            }
        }
    }
}
