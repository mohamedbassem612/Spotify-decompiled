package defpackage;

import java.util.Iterator;
import p.fq50;
import p.nod;
import p.pod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q implements fq50 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Iterable b;

    public /* synthetic */ q(Iterable iterable, byte b) {
        this.a = b;
        this.b = iterable;
    }

    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return ((pod) obj).a;
            default:
                return ((nod) obj).a;
        }
    }

    public final Iterator f() {
        byte b = this.a;
        Iterable iterable = this.b;
        switch (b) {
            case 0:
                break;
        }
        return iterable.iterator();
    }
}
