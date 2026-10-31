package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rd70 implements re70, Parcelable {
    public final qd70 a;
    public final idd1 b = new idd1(new nd70(this, 1));
    public static final rd70 c = pvc.b((String) null, (String) null, (y570) null, (List) null, (List) null, (String) null, (HubsImmutableComponentBundle) null);
    public static final Parcelable.Creator<rd70> CREATOR = new ij60((byte) 24);

    public rd70(String str, String str2, gd70 gd70Var, b380 b380Var, b380 b380Var2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.a = new qd70(this, str, str2, gd70Var, b380Var, b380Var2, str3, hubsImmutableComponentBundle);
    }

    public final String a() {
        return this.a.c;
    }

    public final String b() {
        return this.a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd70)) {
            return false;
        }
        return this.a.equals(((rd70) obj).a);
    }

    public final HubsImmutableComponentBundle g() {
        return this.a.i;
    }

    public final String h() {
        return this.a.h;
    }

    public final int hashCode() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final List j() {
        return this.a.g;
    }

    public final List k() {
        return this.a.f;
    }

    public final y570 l() {
        return this.a.e;
    }

    public final qd70 toBuilder() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean zJ;
        qd70 qd70Var = this.a;
        HubsImmutableComponentBundle hubsImmutableComponentBundle = qd70Var.i;
        parcel.writeString(qd70Var.c);
        parcel.writeString(qd70Var.d);
        gd70 gd70Var = qd70Var.e;
        if (gd70Var == null) {
            zJ = true;
        } else {
            zJ = u890.j(gd70Var == null ? gd70.c : gd70Var, gd70.c);
        }
        if (zJ) {
            gd70Var = null;
        }
        parcel.writeTypedObject(gd70Var, i);
        b380 b380Var = qd70Var.f;
        parcel.writeInt(b380Var.size());
        parcel.writeTypedList(b380Var);
        b380 b380Var2 = qd70Var.g;
        parcel.writeInt(b380Var2.size());
        parcel.writeTypedList(b380Var2);
        parcel.writeString(qd70Var.h);
        if (zxo1.z(hubsImmutableComponentBundle, (HubsImmutableComponentBundle) null)) {
            hubsImmutableComponentBundle = null;
        }
        parcel.writeTypedObject(hubsImmutableComponentBundle, i);
    }
}
