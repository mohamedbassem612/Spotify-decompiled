package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pih1 implements Parcelable {
    public static final Parcelable.Creator<pih1> CREATOR = new gwg1((byte) 8);
    public final String a;
    public final String b;
    public final TriggerType c;
    public final String d;
    public final String e;

    public pih1(String str, String str2, TriggerType triggerType, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = triggerType;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pih1)) {
            return false;
        }
        pih1 pih1Var = (pih1) obj;
        return u890.j(this.a, pih1Var.a) && u890.j(this.b, pih1Var.b) && this.c == pih1Var.c && u890.j(this.d, pih1Var.d) && u890.j(this.e, pih1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
