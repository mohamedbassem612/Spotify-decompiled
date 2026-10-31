package p;

import android.os.Parcelable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kik1 {
    public final String a;
    public final idd1 b = new idd1(new dch1(this, (byte) 29));

    public kik1(String str) {
        this.a = str;
    }

    public final boolean a(String str) {
        return ((Pattern) this.b.getValue()).matcher(str).matches();
    }

    public final lik1 b(String str) {
        if (!a(str)) {
            n57.m("View URI " + str + " did not match pattern " + this.a);
        }
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        return oap1.i(str);
    }

    public final String toString() {
        return this.a;
    }
}
