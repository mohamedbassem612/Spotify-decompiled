package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vuc1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new wuc1(SubmitFormResponse.Suggestion.A(parcel.createByteArray()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new wuc1[i];
    }
}
