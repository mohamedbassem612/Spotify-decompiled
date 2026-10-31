package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yjz implements h0h1 {
    public final zjz a;
    public final String[] b;
    public final String c;

    public yjz(zjz zjzVar, String... strArr) {
        this.a = zjzVar;
        this.b = strArr;
        String str = zjzVar.a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    public final Collection d() {
        return z6x.a;
    }

    public final g6b0 e() {
        return (ikr) ikr.f.getValue();
    }

    public final List getParameters() {
        return z6x.a;
    }

    public final jfg s() {
        bkz.a.getClass();
        return bkz.c;
    }

    public final boolean t() {
        return false;
    }

    public final String toString() {
        return this.c;
    }
}
