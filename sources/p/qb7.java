package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qb7 implements Parcelable {
    public static final Parcelable.Creator<qb7> CREATOR;
    public static final qb7 a;
    public static final qb7 b;
    public static final /* synthetic */ qb7[] c;

    static {
        qb7 qb7Var = new qb7("Curation", 0);
        a = qb7Var;
        qb7 qb7Var2 = new qb7("Selection", 1);
        b = qb7Var2;
        c = new qb7[]{qb7Var, qb7Var2};
        CREATOR = new f67((byte) 3);
    }

    public static qb7 valueOf(String str) {
        return (qb7) Enum.valueOf(qb7.class, str);
    }

    public static qb7[] values() {
        return (qb7[]) c.clone();
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
