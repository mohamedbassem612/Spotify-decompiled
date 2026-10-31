package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wqt {
    public final String a;
    public final String b;
    public final int c;

    public wqt(int i, String str, String str2) {
        Bundle bundle = Bundle.EMPTY;
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqt)) {
            return false;
        }
        wqt wqtVar = (wqt) obj;
        if (!u890.j(this.a, wqtVar.a)) {
            return false;
        }
        Bundle bundle = Bundle.EMPTY;
        return u890.j(bundle, bundle) && this.b.equals(wqtVar.b) && this.c == wqtVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d((Bundle.EMPTY.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b);
    }
}
