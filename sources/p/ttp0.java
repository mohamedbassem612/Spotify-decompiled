package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ttp0 implements Parcelable {
    public static final Parcelable.Creator<ttp0> CREATOR;
    public static final ttp0 a;
    public static final ttp0 b;
    public static final /* synthetic */ ttp0[] c;

    static {
        ttp0 ttp0Var = new ttp0("OFF", 0);
        a = ttp0Var;
        ttp0 ttp0Var2 = new ttp0("ON", 1);
        b = ttp0Var2;
        c = new ttp0[]{ttp0Var, ttp0Var2};
        CREATOR = new ump0((byte) 11);
    }

    public static ttp0 valueOf(String str) {
        return (ttp0) Enum.valueOf(ttp0.class, str);
    }

    public static ttp0[] values() {
        return (ttp0[]) c.clone();
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
