package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class o1p0 implements Update {
    public static final o1p0 a = new o1p0();

    public final Next a(Object obj, Object obj2) {
        t1p0 t1p0Var = (t1p0) obj;
        d0p0 d0p0Var = (g0p0) obj2;
        if (d0p0Var instanceof wzo0) {
            return Next.a(Effects.a(new tzo0[]{new tzo0(((wzo0) d0p0Var).a)}));
        }
        if (d0p0Var instanceof yzo0) {
            return Next.a(Effects.a(new uzo0[]{new uzo0(((yzo0) d0p0Var).a)}));
        }
        if (d0p0Var instanceof c0p0) {
            return Next.a(Effects.a(new uzo0[]{new uzo0(((c0p0) d0p0Var).a)}));
        }
        if (d0p0Var instanceof d0p0) {
            return Next.h(t1p0.a(t1p0Var, d0p0Var.a, (cam) null, (d7l) null, false, false, false, 62));
        }
        if (d0p0Var instanceof zzo0) {
            return Next.h(t1p0.a(t1p0Var, (ibu0) null, ((zzo0) d0p0Var).a, (d7l) null, false, false, false, 61));
        }
        if (d0p0Var instanceof xzo0) {
            return Next.h(t1p0.a(t1p0Var, (ibu0) null, (cam) null, ((xzo0) d0p0Var).a, false, false, false, 59));
        }
        if (d0p0Var instanceof b0p0) {
            return Next.h(t1p0.a(t1p0Var, (ibu0) null, (cam) null, (d7l) null, false, false, ((b0p0) d0p0Var).a, 31));
        }
        if (d0p0Var instanceof a0p0) {
            boolean z = ((a0p0) d0p0Var).a;
            return Next.h(t1p0.a(t1p0Var, (ibu0) null, (cam) null, (d7l) null, z, z, false, 39));
        }
        if (d0p0Var instanceof e0p0) {
            return Next.a(Effects.a(new vzo0[]{new vzo0(((e0p0) d0p0Var).a)}));
        }
        if (d0p0Var instanceof f0p0) {
            return Next.h(t1p0.a(t1p0Var, (ibu0) null, (cam) null, (d7l) null, false, ((f0p0) d0p0Var).a, false, 47));
        }
        eg.o();
        return null;
    }
}
