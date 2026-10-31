package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sc70 implements j570, Parcelable {
    public final HubsImmutableComponentBundle a;
    public final rc70 b;
    public final idd1 c = new idd1(new g050(this, (byte) 25));
    public static final sc70 d = wxo1.p((HubsImmutableComponentBundle) null, "");
    public static final Parcelable.Creator<sc70> CREATOR = new ij60((byte) 16);

    public sc70(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        this.a = hubsImmutableComponentBundle;
        this.b = new rc70(this, str, hubsImmutableComponentBundle);
    }

    public final HubsImmutableComponentBundle a() {
        return this.b.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc70)) {
            return false;
        }
        return this.b.equals(((sc70) obj).b);
    }

    public final int hashCode() {
        return ((Number) this.c.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rc70 rc70Var = this.b;
        parcel.writeString(rc70Var.b);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = rc70Var.c;
        if (zxo1.z(hubsImmutableComponentBundle, (HubsImmutableComponentBundle) null)) {
            hubsImmutableComponentBundle = null;
        }
        parcel.writeTypedObject(hubsImmutableComponentBundle, i);
    }
}
