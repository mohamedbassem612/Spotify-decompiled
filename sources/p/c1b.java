package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class c1b implements Update {
    public static final c1b a = new c1b();

    public final Next a(Object obj, Object obj2) {
        e1b e1bVar = (e1b) obj;
        z0b z0bVar = (z0b) obj2;
        boolean z = z0bVar instanceof zc90;
        ao40 ao40Var = ao40.d;
        if (z) {
            return Next.a(Effects.a(new rc2[]{ao40Var, mse0.d}));
        }
        if (z0bVar instanceof ue10) {
            return Next.a(Effects.a(new rc2[]{ao40Var, ese0.d}));
        }
        if (z0bVar instanceof gdi1) {
            return Next.h(new e1b(((gdi1) z0bVar).a, e1bVar.b));
        }
        if (!(z0bVar instanceof xc90)) {
            eg.o();
            return null;
        }
        String str = ((xc90) z0bVar).a;
        if (str == null) {
            return Next.a(Effects.a(new v681[]{v681.d}));
        }
        v4i1 v4i1Var = e1bVar.a;
        String str2 = v4i1Var != null ? v4i1Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return Next.a(Effects.a(new y871[]{new y871(str, str2)}));
    }
}
