package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f321 extends u9 {
    public static final Parcelable.Creator<f321> CREATOR = new g321((byte) 0);
    public final Bundle a;
    public y36 b;

    public f321(Bundle bundle) {
        this.a = bundle;
    }

    public final Map j() {
        y36 y36Var = this.b;
        if (y36Var == null) {
            y36Var = new y36(0);
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        y36Var.put(str, str2);
                    }
                }
            }
            this.b = y36Var;
        }
        return y36Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.u(parcel, 2, this.a);
        j541.M(iL, parcel);
    }
}
