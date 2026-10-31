package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wuc1 implements Parcelable {
    public static final Parcelable.Creator<wuc1> CREATOR = new vuc1();
    public final SubmitFormResponse.Suggestion a;

    public wuc1(SubmitFormResponse.Suggestion suggestion) {
        this.a = suggestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuc1) && u890.j(this.a, ((wuc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
    }
}
