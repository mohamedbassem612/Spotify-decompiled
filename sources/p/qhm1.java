package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.ConsumerShareRequestParameters;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qhm1 implements Parcelable {
    public static final Parcelable.Creator<qhm1> CREATOR = new lfm1((byte) 23);
    public final String a;
    public final String b;
    public final ConsumerShareRequestParameters c;
    public final String d;

    public qhm1(String str, String str2, ConsumerShareRequestParameters consumerShareRequestParameters, String str3) {
        this.a = str;
        this.b = str2;
        this.c = consumerShareRequestParameters;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhm1)) {
            return false;
        }
        qhm1 qhm1Var = (qhm1) obj;
        return u890.j(this.a, qhm1Var.a) && u890.j(this.b, qhm1Var.b) && u890.j(this.c, qhm1Var.c) && u890.j(this.d, qhm1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        ConsumerShareRequestParameters consumerShareRequestParameters = this.c;
        int iHashCode = (iD + (consumerShareRequestParameters == null ? 0 : consumerShareRequestParameters.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        ln71.c.u(this.c, parcel);
        parcel.writeString(this.d);
    }
}
