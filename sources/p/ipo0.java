package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ipo0 implements Parcelable {
    public static final Parcelable.Creator<ipo0> CREATOR;
    public static final ipo0 a;
    public static final ipo0 b;
    public static final ipo0 c;
    public static final ipo0 d;
    public static final /* synthetic */ ipo0[] e;

    static {
        ipo0 ipo0Var = new ipo0("PLAYLISTS", 0);
        a = ipo0Var;
        ipo0 ipo0Var2 = new ipo0("BLUEJAY_REQUEST_NOTIFICATIONS", 1);
        b = ipo0Var2;
        ipo0 ipo0Var3 = new ipo0("BLUEJAY_CONFIRMED_NOTIFICATIONS", 2);
        c = ipo0Var3;
        ipo0 ipo0Var4 = new ipo0("BLUEJAY_EDIT_SUCCESS", 3);
        d = ipo0Var4;
        e = new ipo0[]{ipo0Var, ipo0Var2, ipo0Var3, ipo0Var4};
        CREATOR = new b4o0((byte) 19);
    }

    public static ipo0 valueOf(String str) {
        return (ipo0) Enum.valueOf(ipo0.class, str);
    }

    public static ipo0[] values() {
        return (ipo0[]) e.clone();
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
