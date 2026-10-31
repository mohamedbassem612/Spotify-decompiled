package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vjt implements Parcelable {
    public static final Parcelable.Creator<vjt> CREATOR;
    public static final vjt a;
    public static final vjt b;
    public static final /* synthetic */ vjt[] c;

    static {
        vjt vjtVar = new vjt("CHOOSER_SIGNUP", 0);
        a = vjtVar;
        vjt vjtVar2 = new vjt("CHOOSER_LOGIN", 1);
        b = vjtVar2;
        c = new vjt[]{vjtVar, vjtVar2};
        CREATOR = new qms((byte) 17);
    }

    public static vjt valueOf(String str) {
        return (vjt) Enum.valueOf(vjt.class, str);
    }

    public static vjt[] values() {
        return (vjt[]) c.clone();
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
