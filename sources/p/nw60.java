package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nw60 implements Parcelable {
    public static final Parcelable.Creator<nw60> CREATOR = new ij60((byte) 10);
    public final String a;
    public final transient int b;

    public nw60(String str) {
        this.a = str;
        int i = 0;
        if (str == null) {
            bhn0.i("Name is null");
        } else if (str.equals("NOTIFICATION")) {
            i = 1;
        } else if (str.equals("IN_APP")) {
            i = 2;
        } else {
            hhg1.n("No enum constant com.spotify.jam.features.hostapproval.core.api.HostActions.Trigger.".concat(str));
        }
        this.b = i;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("hostapproval.hostapprovalsheet.impl.page", this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw60) && u890.j(this.a, ((nw60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nw60(int i) {
        String str;
        if (i == 1) {
            str = "NOTIFICATION";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "IN_APP";
        }
        this(str);
    }
}
