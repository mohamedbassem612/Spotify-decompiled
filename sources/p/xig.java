package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.appauthorization.sso.ClientIdentity;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xig implements Parcelable {
    public static final Parcelable.Creator<xig> CREATOR = new i8g((byte) 18);
    public final String a;
    public final String b;

    public xig(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.sso.ClientIdentity$ValidationException */
    public static Signature a(Context context, String str) throws ClientIdentity.ValidationException {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length == 1) {
                return signatureArr[0];
            }
            throw new ClientIdentity.ValidationException("Multiple certificates found");
        } catch (PackageManager.NameNotFoundException e) {
            throw new ClientIdentity.ValidationException(e);
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
        if (!(obj instanceof xig)) {
            return false;
        }
        xig xigVar = (xig) obj;
        return Objects.equals(this.a, xigVar.a) && Objects.equals(this.b, xigVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public xig(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
