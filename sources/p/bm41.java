package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bm41 implements Parcelable {
    public static final Parcelable.Creator<bm41> CREATOR;
    public static final bm41 a;
    public static final bm41 b;
    public static final /* synthetic */ bm41[] c;

    static {
        bm41 bm41Var = new bm41("PLAYLIST", 0);
        a = bm41Var;
        bm41 bm41Var2 = new bm41("BLUEJAY", 1);
        b = bm41Var2;
        c = new bm41[]{bm41Var, bm41Var2};
        CREATOR = new xw31((byte) 23);
    }

    public static bm41 valueOf(String str) {
        return (bm41) Enum.valueOf(bm41.class, str);
    }

    public static bm41[] values() {
        return (bm41[]) c.clone();
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
