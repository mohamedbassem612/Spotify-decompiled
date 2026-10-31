package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lle implements Parcelable {
    public static final Parcelable.Creator<lle> CREATOR;
    public static final lle a;
    public static final lle b;
    public static final lle c;
    public static final /* synthetic */ lle[] d;

    static {
        lle lleVar = new lle("UNKNOWN", 0);
        a = lleVar;
        lle lleVar2 = new lle("TALK", 1);
        b = lleVar2;
        lle lleVar3 = new lle("MUSIC", 2);
        c = lleVar3;
        d = new lle[]{lleVar, lleVar2, lleVar3};
        CREATOR = new zge((byte) 6);
    }

    public static lle valueOf(String str) {
        return (lle) Enum.valueOf(lle.class, str);
    }

    public static lle[] values() {
        return (lle[]) d.clone();
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
