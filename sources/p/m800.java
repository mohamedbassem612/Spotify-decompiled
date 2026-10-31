package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class m800 implements Update {
    public static final m800 a = new m800();

    public final Next a(Object obj, Object obj2) {
        o800 o800Var = (o800) obj;
        k800 k800Var = (k800) obj2;
        if (k800Var instanceof j800) {
            String str = ((j800) k800Var).a;
            return Next.h(new o800(str, k1o1.y(str, o800Var.a), o800Var.c));
        }
        if (k800Var instanceof h800) {
            String str2 = o800Var.b;
            h800 h800Var = (h800) k800Var;
            String str3 = h800Var.a;
            tv80 tv80Var = h800Var.b;
            return Next.a(Effects.a(new b800[]{new b800(u890.j(str2, str3) ? new a9u0(tv80Var) : new y8u0(str3, tv80Var))}));
        }
        if (k800Var instanceof g800) {
            return Next.a(Effects.a(new b800[]{new b800(new w8u0(((g800) k800Var).b))}));
        }
        if (k800Var instanceof i800) {
            i800 i800Var = (i800) k800Var;
            return Next.a(Effects.a(new a800[]{new a800(i800Var.b, i800Var.a, i800Var.c)}));
        }
        eg.o();
        return null;
    }
}
