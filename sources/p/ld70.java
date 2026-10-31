package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ld70 implements pc70, Parcelable {
    public static final Parcelable.Creator<ld70> CREATOR;
    public final kd70 a;
    public final idd1 b = new idd1(new cc00(this, (byte) 15));

    static {
        eyo1.i((String) null, (String) null, (HubsImmutableComponentBundle) null);
        CREATOR = new ij60((byte) 22);
    }

    public ld70(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.a = new kd70(this, str, str2, hubsImmutableComponentBundle);
    }

    public final String b() {
        return this.a.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld70)) {
            return false;
        }
        return this.a.equals(((ld70) obj).a);
    }

    public final int hashCode() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kd70 kd70Var = this.a;
        parcel.writeString(kd70Var.c);
        parcel.writeString(kd70Var.d);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = kd70Var.e;
        if (zxo1.z(hubsImmutableComponentBundle, (HubsImmutableComponentBundle) null)) {
            hubsImmutableComponentBundle = null;
        }
        parcel.writeTypedObject(hubsImmutableComponentBundle, i);
    }
}
