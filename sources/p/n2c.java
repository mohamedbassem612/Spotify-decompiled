package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v2.BoxedEntityRowComponentV2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n2c implements j0i {
    public final kly0 a;
    public final l6l1 b;

    public n2c(jly0 jly0Var, l6l1 l6l1Var) {
        this.a = jly0Var;
        this.b = l6l1Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        j2c j2cVar;
        BoxedEntityRowComponentV2 boxedEntityRowComponentV2X = BoxedEntityRowComponentV2.x(any.q());
        String title = boxedEntityRowComponentV2X.getTitle();
        String subtitle = boxedEntityRowComponentV2X.getSubtitle();
        String url = boxedEntityRowComponentV2X.r().getUrl();
        boolean zQ = boxedEntityRowComponentV2X.q();
        boolean zS = boxedEntityRowComponentV2X.s();
        boolean zU = boxedEntityRowComponentV2X.u();
        int iN = boxedEntityRowComponentV2X.v().n();
        int i = iN == 0 ? -1 : m2c.a[l1d.C(iN)];
        if (i != 1) {
            j2cVar = i != 2 ? null : new k2c(boxedEntityRowComponentV2X.v().q().getUri(), boxedEntityRowComponentV2X.v().q().o(), boxedEntityRowComponentV2X.v().q().p());
        } else {
            j2cVar = new j2c(boxedEntityRowComponentV2X.v().p().getUri());
        }
        String strN = boxedEntityRowComponentV2X.n();
        String strP = boxedEntityRowComponentV2X.p();
        if (ihc1.y0(strP)) {
            strP = null;
        }
        return new l2c(title, subtitle, zQ, zS, strN, j2cVar, url, zU, strP, boxedEntityRowComponentV2X.w() ? this.b.b(boxedEntityRowComponentV2X.o()) : null, boxedEntityRowComponentV2X.t());
    }

    @Override // p.j0i
    public final Class b() {
        return l2c.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
