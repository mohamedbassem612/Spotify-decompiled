package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vqt {
    public final String a;
    public final String b;
    public final int c;

    public vqt(int i, String str, String str2) {
        Bundle bundle = Bundle.EMPTY;
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqt)) {
            return false;
        }
        vqt vqtVar = (vqt) obj;
        if (!u890.j(this.a, vqtVar.a)) {
            return false;
        }
        Bundle bundle = Bundle.EMPTY;
        return u890.j(bundle, bundle) && this.b.equals(vqtVar.b) && this.c == vqtVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d((Bundle.EMPTY.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b);
    }
}
