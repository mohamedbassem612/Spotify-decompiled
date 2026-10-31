package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhj0 implements Parcelable {
    public static final Parcelable.Creator<uhj0> CREATOR = new ohj0((byte) 3);
    public final MessageResponseToken a;
    public final iwq b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final yhj0 f;
    public final boolean g;
    public final shj0 h;
    public final Bundle i;

    public uhj0(MessageResponseToken messageResponseToken, iwq iwqVar, String str, boolean z, boolean z2, yhj0 yhj0Var, boolean z3, shj0 shj0Var, Bundle bundle) {
        this.a = messageResponseToken;
        this.b = iwqVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = yhj0Var;
        this.g = z3;
        this.h = shj0Var;
        this.i = bundle;
    }

    public static uhj0 a(uhj0 uhj0Var, MessageResponseToken messageResponseToken, iwq iwqVar, String str, boolean z, boolean z2, yhj0 yhj0Var, boolean z3, shj0 shj0Var, Bundle bundle, int i) {
        if ((i & 1) != 0) {
            messageResponseToken = uhj0Var.a;
        }
        MessageResponseToken messageResponseToken2 = messageResponseToken;
        if ((i & 2) != 0) {
            iwqVar = uhj0Var.b;
        }
        iwq iwqVar2 = iwqVar;
        if ((i & 4) != 0) {
            str = uhj0Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = uhj0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = uhj0Var.e;
        }
        boolean z5 = z2;
        yhj0 yhj0Var2 = (i & 32) != 0 ? uhj0Var.f : yhj0Var;
        boolean z6 = (i & 64) != 0 ? uhj0Var.g : z3;
        shj0 shj0Var2 = (i & 128) != 0 ? uhj0Var.h : shj0Var;
        Bundle bundle2 = (i & 256) != 0 ? uhj0Var.i : bundle;
        uhj0Var.getClass();
        return new uhj0(messageResponseToken2, iwqVar2, str2, z4, z5, yhj0Var2, z6, shj0Var2, bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhj0)) {
            return false;
        }
        uhj0 uhj0Var = (uhj0) obj;
        return u890.j(this.a, uhj0Var.a) && u890.j(this.b, uhj0Var.b) && u890.j(this.c, uhj0Var.c) && this.d == uhj0Var.d && this.e == uhj0Var.e && u890.j(this.f, uhj0Var.f) && this.g == uhj0Var.g && u890.j(this.h, uhj0Var.h) && u890.j(this.i, uhj0Var.i);
    }

    public final int hashCode() {
        MessageResponseToken messageResponseToken = this.a;
        int iHashCode = (messageResponseToken == null ? 0 : messageResponseToken.hashCode()) * 31;
        iwq iwqVar = this.b;
        int iHashCode2 = (iHashCode + (iwqVar == null ? 0 : iwqVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (this.h.hashCode() + xcg1.g((this.f.hashCode() + xcg1.g(xcg1.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g)) * 31;
        Bundle bundle = this.i;
        return iHashCode3 + (bundle != null ? bundle.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        iwq iwqVar = this.b;
        if (iwqVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iwqVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeBundle(this.i);
    }

    public /* synthetic */ uhj0() {
        this(null, null, null, true, false, xhj0.a, false, rhj0.a, null);
    }
}
