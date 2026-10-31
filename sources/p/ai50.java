package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ai50 implements Update {
    public static final ai50 a = new ai50();

    public final Next a(Object obj, Object obj2) {
        yh50 yh50Var = (yh50) obj;
        n5b n5bVar = (n5b) obj2;
        if (n5bVar instanceof m5b) {
            return Next.i(yh50.a(yh50Var, true), Effects.a(new z47[]{new t4b(yh50Var.b), x4b.g}));
        }
        if (n5bVar instanceof h5b) {
            String str = ((h5b) n5bVar).a;
            return yh50Var.m ? Next.i(yh50.a(yh50Var, false), Effects.a(new z4b[]{new z4b(str)})) : Next.i(yh50.a(yh50Var, false), Effects.a(new c5b[]{new c5b(str)}));
        }
        boolean z = n5bVar instanceof i5b;
        e5b e5bVar = e5b.g;
        if (z) {
            return Next.i(yh50.a(yh50Var, false), Effects.a(new e5b[]{e5bVar}));
        }
        if (n5bVar instanceof l5b) {
            return Next.a(Effects.a(new z47[]{v4b.g, w4b.g}));
        }
        if (!(n5bVar instanceof k5b)) {
            return Next.j();
        }
        String str2 = ((k5b) n5bVar).a;
        if (str2 == null) {
            return Next.a(Collections.singleton(e5bVar));
        }
        String str3 = yh50Var.e;
        if (str3 == null) {
            str3 = "";
        }
        return Next.a(Effects.a(new d5b[]{new d5b(str3, str2)}));
    }
}
