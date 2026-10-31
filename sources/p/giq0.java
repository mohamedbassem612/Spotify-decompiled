package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class giq0 implements Parcelable {
    public static final Parcelable.Creator<giq0> CREATOR;
    public static final giq0 a;
    public static final giq0 b;
    public static final giq0 c;
    public static final giq0 d;
    public static final /* synthetic */ giq0[] e;

    static {
        giq0 giq0Var = new giq0("NONE", 0);
        a = giq0Var;
        giq0 giq0Var2 = new giq0("DUPLICATING_MIX", 1);
        b = giq0Var2;
        giq0 giq0Var3 = new giq0("SAVING_TRANSITION", 2);
        c = giq0Var3;
        giq0 giq0Var4 = new giq0("SAVING_AND_SHARING", 3);
        d = giq0Var4;
        e = new giq0[]{giq0Var, giq0Var2, giq0Var3, giq0Var4};
        CREATOR = new p7q0((byte) 8);
    }

    public static giq0 valueOf(String str) {
        return (giq0) Enum.valueOf(giq0.class, str);
    }

    public static giq0[] values() {
        return (giq0[]) e.clone();
    }

    public final boolean a() {
        return this == c || this == d;
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
