package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ofm0 implements Parcelable {
    public static final Parcelable.Creator<ofm0> CREATOR;
    public static final ofm0 a;
    public static final ofm0 b;
    public static final /* synthetic */ ofm0[] c;

    static {
        ofm0 ofm0Var = new ofm0("PLAYBACK", 0);
        a = ofm0Var;
        ofm0 ofm0Var2 = new ofm0("SELECTION", 1);
        b = ofm0Var2;
        c = new ofm0[]{ofm0Var, ofm0Var2};
        CREATOR = new w9k0((byte) 13);
    }

    public static ofm0 valueOf(String str) {
        return (ofm0) Enum.valueOf(ofm0.class, str);
    }

    public static ofm0[] values() {
        return (ofm0[]) c.clone();
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
