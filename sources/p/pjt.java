package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pjt implements Parcelable {
    public static final Parcelable.Creator<pjt> CREATOR;
    public static final pjt a;
    public static final pjt b;
    public static final /* synthetic */ pjt[] c;

    static {
        pjt pjtVar = new pjt("CHOOSER_SIGNUP", 0);
        a = pjtVar;
        pjt pjtVar2 = new pjt("CHOOSER_LOGIN", 1);
        b = pjtVar2;
        c = new pjt[]{pjtVar, pjtVar2};
        CREATOR = new qms((byte) 16);
    }

    public static pjt valueOf(String str) {
        return (pjt) Enum.valueOf(pjt.class, str);
    }

    public static pjt[] values() {
        return (pjt[]) c.clone();
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
