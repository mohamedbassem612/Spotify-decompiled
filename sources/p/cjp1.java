package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cjp1 extends txg {
    public final String a;
    public final Uri b;
    public final Uri c;

    public cjp1(String str, Uri uri, Uri uri2) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof txg) {
            txg txgVar = (txg) obj;
            String str = this.a;
            if (str != null ? str.equals(((cjp1) txgVar).a) : ((cjp1) txgVar).a == null) {
                Uri uri = this.b;
                if (uri != null ? uri.equals(((cjp1) txgVar).b) : ((cjp1) txgVar).b == null) {
                    Uri uri2 = this.c;
                    if (uri2 != null ? uri2.equals(((cjp1) txgVar).c) : ((cjp1) txgVar).c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = iHashCode ^ 1000003;
        Uri uri2 = this.c;
        return (((i * 1000003) ^ iHashCode2) * 1000003) ^ (uri2 != null ? uri2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("CollaborationStartingState{additionalData=");
        bb00.j(sb, this.a, ", mainStageUrl=", strValueOf, ", sidePanelUrl=");
        return l1d.n(strValueOf2, "}", sb);
    }
}
