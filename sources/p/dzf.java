package p;

import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dzf extends jch0 implements Serializable {
    public final eu50 d;
    public final String e;

    public dzf(eu50 eu50Var, String str) {
        this.d = eu50Var;
        this.e = str;
    }

    public final bmq0 M() {
        return new czf(this, (Checksum) this.d.get());
    }

    public final String toString() {
        return this.e;
    }
}
