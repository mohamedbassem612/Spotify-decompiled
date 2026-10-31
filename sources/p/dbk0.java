package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dbk0 implements Parcelable {
    public static final Parcelable.Creator<dbk0> CREATOR;
    public static final dbk0 a;
    public static final dbk0 b;
    public static final /* synthetic */ dbk0[] c;
    public static final /* synthetic */ t0z d;

    static {
        dbk0 dbk0Var = new dbk0("Editable", 0);
        a = dbk0Var;
        dbk0 dbk0Var2 = new dbk0("PlaylistHistoryPreview", 1);
        b = dbk0Var2;
        dbk0[] dbk0VarArr = {dbk0Var, dbk0Var2};
        c = dbk0VarArr;
        d = new t0z(dbk0VarArr);
        CREATOR = new w9k0((byte) 2);
    }

    public static dbk0 valueOf(String str) {
        return (dbk0) Enum.valueOf(dbk0.class, str);
    }

    public static dbk0[] values() {
        return (dbk0[]) c.clone();
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
