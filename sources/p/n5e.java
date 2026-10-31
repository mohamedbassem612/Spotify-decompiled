package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class n5e implements Update {
    public static final n5e a = new n5e();

    public final Next a(Object obj, Object obj2) {
        p5e p5eVar = (p5e) obj;
        j5e j5eVar = (j5e) obj2;
        if (j5eVar instanceof d5e) {
            d5e d5eVar = (d5e) j5eVar;
            return Next.a(Effects.a(new u4e[]{new u4e(d5eVar.a, d5eVar.b)}));
        }
        if (j5eVar instanceof g5e) {
            return Next.a(Effects.a(new w4e[]{new w4e()}));
        }
        if (j5eVar instanceof c5e) {
            return Next.h(p5e.a(p5eVar, ((c5e) j5eVar).a, null, 6));
        }
        if (j5eVar instanceof b5e) {
            return Next.j();
        }
        if (j5eVar instanceof h5e) {
            h5e h5eVar = (h5e) j5eVar;
            return Next.h(p5e.a(p5eVar, null, new scb0(h5eVar.a, h5eVar.b), 5));
        }
        if (j5eVar.equals(i5e.a)) {
            return Next.h(p5e.a(p5eVar, null, vcb0.a, 5));
        }
        if (j5eVar.equals(e5e.a)) {
            return Next.h(p5e.a(p5eVar, null, ucb0.a, 5));
        }
        if (j5eVar instanceof f5e) {
            return Next.a(Effects.a(new v4e[]{v4e.c}));
        }
        eg.o();
        return null;
    }
}
