package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class njt implements Parcelable {
    public static final Parcelable.Creator<njt> CREATOR;
    public static final njt a;
    public static final njt b;
    public static final /* synthetic */ njt[] c;

    static {
        njt njtVar = new njt("CHOOSER_SIGNUP", 0);
        a = njtVar;
        njt njtVar2 = new njt("CHOOSER_LOGIN", 1);
        b = njtVar2;
        c = new njt[]{njtVar, njtVar2};
        CREATOR = new qms((byte) 15);
    }

    public static njt valueOf(String str) {
        return (njt) Enum.valueOf(njt.class, str);
    }

    public static njt[] values() {
        return (njt[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
