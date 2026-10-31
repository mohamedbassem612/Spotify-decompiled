package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dll1 implements Parcelable {
    public static final Parcelable.Creator<dll1> CREATOR = new ylk1((byte) 21);
    public final MessageResponseToken a;
    public final iwq b;
    public final tv80 c;

    public dll1(MessageResponseToken messageResponseToken, iwq iwqVar, tv80 tv80Var) {
        this.a = messageResponseToken;
        this.b = iwqVar;
        this.c = tv80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dll1)) {
            return false;
        }
        dll1 dll1Var = (dll1) obj;
        return u890.j(this.a, dll1Var.a) && u890.j(this.b, dll1Var.b) && u890.j(this.c, dll1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
    }
}
