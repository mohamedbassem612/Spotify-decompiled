package p;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tl60 implements rij0 {
    public final String a;
    public final String b;
    public final List c;

    public tl60(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tl60.class == obj.getClass()) {
            tl60 tl60Var = (tl60) obj;
            if (TextUtils.equals(this.a, tl60Var.a) && TextUtils.equals(this.b, tl60Var.b) && this.c.equals(tl60Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strN;
        String str = this.a;
        if (str != null) {
            strN = l1d.n(this.b, "]", l1d.t(" [", str, ", "));
        } else {
            strN = "";
        }
        return "HlsTrackMetadataEntry".concat(strN);
    }
}
