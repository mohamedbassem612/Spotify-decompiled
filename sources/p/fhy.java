package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fhy extends mhy {
    public static final Parcelable.Creator<fhy> CREATOR = new utx((byte) 26);
    public final String a;
    public final MessageResponseToken b;

    public fhy(String str, MessageResponseToken messageResponseToken) {
        this.a = str;
        this.b = messageResponseToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhy)) {
            return false;
        }
        fhy fhyVar = (fhy) obj;
        return u890.j(this.a, fhyVar.a) && u890.j(this.b, fhyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
