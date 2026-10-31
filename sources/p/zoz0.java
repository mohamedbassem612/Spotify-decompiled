package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class zoz0 implements Parcelable {
    public final Integer a;
    public final List b;
    public static final yoz0 Companion = new yoz0();
    public static final Parcelable.Creator<zoz0> CREATOR = new j1z0((byte) 25);
    public static final znb0[] c = {null, dm5.S(2, ijz0.f)};

    public /* synthetic */ zoz0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
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
        if (!(obj instanceof zoz0)) {
            return false;
        }
        zoz0 zoz0Var = (zoz0) obj;
        return u890.j(this.a, zoz0Var.a) && u890.j(this.b, zoz0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        List list = this.b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator itJ = xcg1.j(parcel, (Map) it.next());
            while (itJ.hasNext()) {
                Map.Entry entry = (Map.Entry) itJ.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    public zoz0(Integer num, ArrayList arrayList) {
        this.a = num;
        this.b = arrayList;
    }
}
