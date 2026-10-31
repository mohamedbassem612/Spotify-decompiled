package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fjt implements Parcelable {
    public static final Parcelable.Creator<fjt> CREATOR;
    public static final fjt a;
    public static final fjt b;
    public static final /* synthetic */ fjt[] c;

    static {
        fjt fjtVar = new fjt("INTENT_LED_SIGNUP", 0);
        a = fjtVar;
        fjt fjtVar2 = new fjt("INTENT_LED_LOGIN", 1);
        b = fjtVar2;
        c = new fjt[]{fjtVar, fjtVar2};
        CREATOR = new qms((byte) 14);
    }

    public static fjt valueOf(String str) {
        return (fjt) Enum.valueOf(fjt.class, str);
    }

    public static fjt[] values() {
        return (fjt[]) c.clone();
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
