package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kp21 {
    public final ArrayList a;
    public final String b;
    public final int c;

    public kp21(int i, String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp21)) {
            return false;
        }
        kp21 kp21Var = (kp21) obj;
        return this.a.equals(kp21Var.a) && u890.j(this.b, kp21Var.b) && this.c == kp21Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionRequest(permissions=");
        sb.append(this.a);
        sb.append(", rationale=");
        sb.append(this.b);
        sb.append(", deviceId=");
        return gvg.j(sb, this.c, ")");
    }
}
