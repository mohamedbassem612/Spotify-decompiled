package p;

import android.graphics.Color;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.layout.v1.WatchFeedPivotingCarouselLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u9l1 implements j0i {
    public final l6l1 a;
    public final kly0 b;

    public u9l1(jly0 jly0Var, l6l1 l6l1Var) {
        this.a = l6l1Var;
        this.b = jly0Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        r160 okc1Var;
        z0i z0iVarB;
        r160 r160VarValueOf;
        WatchFeedPivotingCarouselLayout watchFeedPivotingCarouselLayoutW = WatchFeedPivotingCarouselLayout.w(any.q());
        h290 h290VarO = watchFeedPivotingCarouselLayoutW.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        Iterator it = h290VarO.iterator();
        int i = 0;
        while (true) {
            dq70 dq70VarY = null;
            if (!it.hasNext()) {
                String strR = watchFeedPivotingCarouselLayoutW.r();
                Any anyP = watchFeedPivotingCarouselLayoutW.p();
                l6l1 l6l1Var = this.a;
                z0i z0iVarB2 = l6l1Var.b(anyP);
                vpl vplVar = z0iVarB2 instanceof vpl ? (vpl) z0iVarB2 : null;
                String title = watchFeedPivotingCarouselLayoutW.getTitle();
                if (watchFeedPivotingCarouselLayoutW.t()) {
                    z0iVarB = l6l1Var.b(watchFeedPivotingCarouselLayoutW.n());
                    okc1Var = null;
                } else {
                    okc1Var = null;
                    z0iVarB = null;
                }
                String uri = watchFeedPivotingCarouselLayoutW.getUri();
                r160 r160VarH = watchFeedPivotingCarouselLayoutW.u() ? i1o1.H(watchFeedPivotingCarouselLayoutW.q(), l6l1Var) : okc1Var;
                if (watchFeedPivotingCarouselLayoutW.v()) {
                    h290<String> h290VarN = watchFeedPivotingCarouselLayoutW.s().o().n();
                    if (h290VarN.isEmpty()) {
                        okc1Var = new okc1(new ohc1(watchFeedPivotingCarouselLayoutW.s().o().n()));
                    } else {
                        for (String str : h290VarN) {
                            str.getClass();
                            try {
                                r160VarValueOf = Integer.valueOf(Color.parseColor(str));
                            } catch (Exception unused) {
                                r160VarValueOf = okc1Var;
                            }
                            if (r160VarValueOf != null) {
                            }
                        }
                        okc1Var = new okc1(new ohc1(watchFeedPivotingCarouselLayoutW.s().o().n()));
                    }
                }
                return new v9l1(strR, uri, title, arrayList, vplVar, z0iVarB, okc1Var, r160VarH);
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            WatchFeedPivotingCarouselLayout.PivotingCard pivotingCard = (WatchFeedPivotingCarouselLayout.PivotingCard) next;
            String uri2 = pivotingCard.getUri();
            String strP = pivotingCard.p();
            String title2 = pivotingCard.getTitle();
            boolean zQ = pivotingCard.q();
            String strS = pivotingCard.s();
            clj1 clj1VarB = qmo1.B(pivotingCard.u());
            dq70 dq70VarY2 = qmo1.y(pivotingCard.t());
            String strN = pivotingCard.n();
            String strO = pivotingCard.o();
            if (pivotingCard.v()) {
                dq70VarY = qmo1.y(pivotingCard.r());
            }
            arrayList.add(new s3t0(uri2, title2, strS, clj1VarB, dq70VarY2, strN, strO, Integer.valueOf(i), strP, zQ, dq70VarY));
            i = i2;
        }
    }

    @Override // p.j0i
    public final Class b() {
        return v9l1.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.b.get();
    }
}
