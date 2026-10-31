package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFilter;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fxh implements owo0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ fxh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        Maybe maybeE;
        MaybeEmpty maybeEmptyF;
        Maybe maybeFlatMapMaybe;
        Maybe maybeFirstElement;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                cce cceVar = (cce) obj2;
                if (l4o1.G(contextTrack) || l4o1.P(contextTrack)) {
                    String str = (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_ALBUM_URI);
                    if (str == null) {
                        str = "";
                    }
                    String strUri = l4o1.G(contextTrack) ? str : contextTrack.uri();
                    strUri.getClass();
                    Set set = s4b1.f;
                    if (uic.g(strUri, blc0.fh)) {
                        maybeE = ((uu00) cceVar.c).b(new oi("image-carousel-npv-scroll-card", false, new irf(strUri, (byte) 14))).map(new vdn1(strUri, (byte) 5)).firstElement();
                    } else {
                        maybeE = uic.g(strUri, blc0.Pg) ? Maybe.e(Boolean.TRUE) : Maybe.e(Boolean.FALSE);
                    }
                    maybeEmptyF = new MaybeFlatten(new MaybeFilter(maybeE, cxo1.R0), new aod(cceVar, strUri, (byte) 20)).f(new gxh(contextTrack, str));
                } else {
                    maybeEmptyF = MaybeEmpty.a;
                    maybeEmptyF.getClass();
                }
                return maybeEmptyF.f(qbo1.P0);
            case 1:
                return pqo.j(contextTrack.uri(), (uu00) obj).f(c710.d);
            case 2:
                rzo0 rzo0Var = (rzo0) obj;
                if (((qaq0) rzo0Var.b).c()) {
                    Set set2 = s4b1.f;
                    if (uic.x(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ARTIST_URI)).c == blc0.u1) {
                        maybeFlatMapMaybe = ((Single) rzo0Var.c).flatMapMaybe(new drj0(rzo0Var, uic.x(l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ARTIST_URI)).h(), (byte) 28));
                        maybeFlatMapMaybe.getClass();
                    } else {
                        maybeFlatMapMaybe = MaybeEmpty.a;
                        maybeFlatMapMaybe.getClass();
                    }
                } else {
                    maybeFlatMapMaybe = MaybeEmpty.a;
                    maybeFlatMapMaybe.getClass();
                }
                return maybeFlatMapMaybe.f(e710.V0);
            default:
                mlw0 mlw0Var = (mlw0) obj2;
                if (!b3o1.w(contextTrack) && l4o1.P(contextTrack) && ((Boolean.parseBoolean((String) contextTrack.metadata().get("transcripts_disallowed_in_content_layer")) || l4o1.X(contextTrack)) && Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_HAS_TRANSCRIPTS)) && !Boolean.parseBoolean((String) contextTrack.metadata().get("has_static_transcripts")))) {
                    maybeFirstElement = yoi1.i(d3p1.F((rzq) mlw0Var.b, w3p1.o(new l4r(pwc0.w, 1, oa01.g, new j4r(oa01.i), oa01.h), oa01.t), new ga01(10, contextTrack.uri(), null, true)), o6x.a).filter(f4x0.d).map(i5x0.e).firstElement();
                } else {
                    maybeFirstElement = MaybeEmpty.a;
                    maybeFirstElement.getClass();
                }
                return maybeFirstElement.f(c4x0.e);
        }
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(rwo0.class);
            case 1:
                return rc11.a.b(dxo0.class);
            case 2:
                return rc11.a.b(qxo0.class);
            default:
                return rc11.a.b(uxo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 0:
                qff qffVar = new qff(this, (byte) 23);
                ji50Var.b.put(rwo0.class, r4o1.Q(ovh.t, w7xVar, qffVar, gsh.h));
                break;
            case 1:
                rr10 rr10Var = new rr10(this, (byte) 22);
                Set set = z540.a;
                ji50Var.b.put(dxo0.class, r4o1.Q(r640.b, set, rr10Var, bp30.V0));
                break;
            case 2:
                nso0 nso0Var = new nso0(this, (byte) 14);
                ji50Var.b.put(qxo0.class, r4o1.Q(cwp0.e1, w7xVar, nso0Var, w0q0.h));
                break;
            default:
                ziz0 ziz0Var = new ziz0(this, (byte) 10);
                ji50Var.b.put(uxo0.class, r4o1.Q(k301.X0, w7xVar, ziz0Var, atz0.X));
                break;
        }
    }
}
