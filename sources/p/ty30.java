package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ty30 implements Parcelable {
    public static final Parcelable.Creator<ty30> CREATOR;
    public static final ty30 a;
    public static final ty30 b;
    public static final ty30 c;
    public static final /* synthetic */ ty30[] d;

    static {
        ty30 ty30Var = new ty30("None", 0);
        a = ty30Var;
        ty30 ty30Var2 = new ty30("Viewer", 1);
        b = ty30Var2;
        ty30 ty30Var3 = new ty30("Contributor", 2);
        c = ty30Var3;
        d = new ty30[]{ty30Var, ty30Var2, ty30Var3};
        CREATOR = new xt30((byte) 7);
    }

    public static ty30 valueOf(String str) {
        return (ty30) Enum.valueOf(ty30.class, str);
    }

    public static ty30[] values() {
        return (ty30[]) d.clone();
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
