package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qpb extends spb {
    public final List a;

    public qpb(List list) {
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strV = z0o1.v(this.a);
        return "Nebula response contains no Product State".concat(strV != null ? "; ".concat(strV) : "");
    }

    public /* synthetic */ qpb() {
        this(z6x.a);
    }
}
