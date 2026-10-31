package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wxc1 {
    public final String a;
    public final ArrayList b;

    public wxc1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxc1)) {
            return false;
        }
        wxc1 wxc1Var = (wxc1) obj;
        return this.a.equals(wxc1Var.a) && this.b.equals(wxc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
