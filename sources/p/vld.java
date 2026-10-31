package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class vld implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final o711 d;
    public final Map e;
    public static final pld Companion = new pld();
    public static final Parcelable.Creator<vld> CREATOR = new hbn1((byte) 6);
    public static final znb0[] f = {null, null, null, null, dm5.S(2, xrc.f)};

    public /* synthetic */ vld(int i, String str, String str2, String str3, o711 o711Var, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = o711Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
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
        if (!(obj instanceof vld)) {
            return false;
        }
        vld vldVar = (vld) obj;
        return u890.j(this.a, vldVar.a) && u890.j(this.b, vldVar.b) && u890.j(this.c, vldVar.c) && u890.j(this.d, vldVar.d) && u890.j(this.e, vldVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o711 o711Var = this.d;
        int iHashCode4 = (iHashCode3 + (o711Var == null ? 0 : o711Var.hashCode())) * 31;
        Map map = this.e;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        o711 o711Var = this.d;
        if (o711Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o711Var.writeToParcel(parcel, i);
        }
        Map map = this.e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public vld(String str, String str2, String str3, o711 o711Var, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = o711Var;
        this.e = linkedHashMap;
    }
}
