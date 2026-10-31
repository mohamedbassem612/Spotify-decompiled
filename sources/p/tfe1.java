package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tfe1 {
    public final String a;
    public final Uri b;
    public final Uri c;

    public tfe1(String str, Uri uri, Uri uri2) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfe1)) {
            return false;
        }
        tfe1 tfe1Var = (tfe1) obj;
        return this.a.equals(tfe1Var.a) && this.b.equals(tfe1Var.b) && this.c.equals(tfe1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.h(this.b, this.a.hashCode() * 31, 31);
    }
}
