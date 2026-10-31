package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tsp0 implements Parcelable {
    public static final Parcelable.Creator<tsp0> CREATOR;
    public static final tsp0 a;
    public static final tsp0 b;
    public static final tsp0 c;
    public static final /* synthetic */ tsp0[] d;

    static {
        tsp0 tsp0Var = new tsp0("MUSIC", 0);
        a = tsp0Var;
        tsp0 tsp0Var2 = new tsp0("PODCASTS", 1);
        b = tsp0Var2;
        tsp0 tsp0Var3 = new tsp0("AUDIOBOOKS", 2);
        c = tsp0Var3;
        d = new tsp0[]{tsp0Var, tsp0Var2, tsp0Var3};
        CREATOR = new ump0((byte) 10);
    }

    public static tsp0 valueOf(String str) {
        return (tsp0) Enum.valueOf(tsp0.class, str);
    }

    public static tsp0[] values() {
        return (tsp0[]) d.clone();
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
