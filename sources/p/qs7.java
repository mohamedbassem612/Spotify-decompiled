package p;

import android.content.Context;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qs7 implements Update {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Next a(Object obj, Object obj2) {
        String str;
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                lt7 lt7Var = (lt7) obj;
                jt7 jt7Var = (jt7) obj2;
                Context context = (Context) obj4;
                if (jt7Var instanceof gt7) {
                    lt7Var.getClass();
                    return Next.h(lt7.a(lt7Var, null, null, null, null, null, ((gt7) jt7Var).a, 8191));
                }
                if (jt7Var instanceof ft7) {
                    lt7Var.getClass();
                    ft7 ft7Var = (ft7) jt7Var;
                    return Next.i(lt7.a(lt7Var, null, null, null, null, null, null, 8191), Collections.singleton(new bt7(ft7Var.a, ft7Var.b, lt7Var)));
                }
                if (jt7Var instanceof it7) {
                    it7 it7Var = (it7) jt7Var;
                    return Next.a(Collections.singleton(new ct7(it7Var.a, it7Var.b)));
                }
                if (!(jt7Var instanceof ht7)) {
                    eg.o();
                    return null;
                }
                e7i0 e7i0Var = ((ht7) jt7Var).a;
                long j = e7i0Var.c;
                long j2 = e7i0Var.d;
                String str2 = lt7Var.i;
                return Next.i(lt7.a(lt7Var, (str2 == null || (str = lt7Var.t) == null) ? lt7Var.f : f4i1.f(str2, " - ", str), new s171(context.getString(2131960180, ((vr51) obj3).f(j2 - j)), otx.c), new vve1(j), new vve1(j2), e7i0Var.a, null, 9055), f46.S0(new eso1[]{new et7(lt7Var.a, j, new vve1(j2)), new dt7(context.getString(2131960177))}));
            default:
                Next nextA = ((Update) obj4).a(obj, obj2);
                Next nextA2 = ((Update) obj3).a(nextA.f(obj), obj2);
                LinkedHashSet linkedHashSetY0 = dm61.y0(nextA.b(), nextA2.b());
                if (nextA2.d()) {
                    return Next.i(nextA2.g(), linkedHashSetY0);
                }
                return nextA.d() ? Next.i(nextA.g(), linkedHashSetY0) : Next.a(linkedHashSetY0);
        }
    }
}
