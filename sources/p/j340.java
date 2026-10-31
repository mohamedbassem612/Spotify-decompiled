package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j340 implements Parcelable {
    public static final Parcelable.Creator<j340> CREATOR;
    public static final j340 a;
    public static final j340 b;
    public static final /* synthetic */ j340[] c;

    static {
        j340 j340Var = new j340("INTRO", 0);
        a = j340Var;
        j340 j340Var2 = new j340("PLAY", 1);
        b = j340Var2;
        c = new j340[]{j340Var, j340Var2};
        CREATOR = new xt30((byte) 11);
    }

    public static j340 valueOf(String str) {
        return (j340) Enum.valueOf(j340.class, str);
    }

    public static j340[] values() {
        return (j340[]) c.clone();
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
