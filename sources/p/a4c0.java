package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class a4c0 implements Update {
    public final Next a(Object obj, Object obj2) {
        d4c0 d4c0Var = (d4c0) obj;
        y3c0 y3c0Var = (y3c0) obj2;
        y6r0 y6r0Var = d4c0Var.d;
        ou80 ou80Var = d4c0Var.c;
        if (y3c0Var instanceof r3c0) {
            r3c0 r3c0Var = (r3c0) y3c0Var;
            if (r3c0Var.b) {
                return Next.a(Effects.a(new i3c0[]{i3c0.c}));
            }
            return (r3c0Var.a || !r3c0Var.c) ? Next.h(d4c0.a(d4c0Var, new i4c0(2), false, 14)) : Next.h(d4c0.a(d4c0Var, new i4c0(1), false, 14));
        }
        if (y3c0Var instanceof s3c0) {
            return Next.h(d4c0.a(d4c0Var, null, ((s3c0) y3c0Var).a, 13));
        }
        if (y3c0Var instanceof t3c0) {
            t3c0 t3c0Var = (t3c0) y3c0Var;
            boolean zAfter = t3c0Var.c.after(t3c0Var.d);
            if (!t3c0Var.a || t3c0Var.b || zAfter) {
                return d4c0Var.b ? Next.i(d4c0.a(d4c0Var, j4c0.c, false, 14), Effects.a(new l3c0[]{new l3c0(ou80Var, y6r0Var)})) : Next.h(d4c0.a(d4c0Var, new i4c0(3), false, 14));
            }
            return Next.a(Effects.a(new j3c0[]{new j3c0(ou80Var)}));
        }
        if (y3c0Var instanceof w3c0) {
            return Next.a(Effects.a(new m3c0[]{m3c0.c}));
        }
        if (y3c0Var instanceof v3c0) {
            return Next.h(d4c0.a(d4c0Var, new i4c0(3), false, 14));
        }
        if (y3c0Var instanceof x3c0) {
            return Next.a(Effects.a(new j3c0[]{new j3c0(ou80Var)}));
        }
        if (y3c0Var instanceof u3c0) {
            return Next.a(Effects.a(new k3c0[]{new k3c0(((u3c0) y3c0Var).a, ou80Var != null ? new tv80(ou80Var, y6r0Var) : null)}));
        }
        eg.o();
        return null;
    }
}
