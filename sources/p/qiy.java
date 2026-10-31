package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qiy extends viy {
    public final View a;
    public final byte b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public qiy(View view, int i, String str) {
        this.a = view;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiy)) {
            return false;
        }
        qiy qiyVar = (qiy) obj;
        return this.a.equals(qiyVar.a) && this.b == qiyVar.b && this.c.equals(qiyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
