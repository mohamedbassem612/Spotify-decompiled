package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class y4y implements Update {
    public static final y4y a = new y4y();

    public final Next a(Object obj, Object obj2) {
        a5y a5yVar = (a5y) obj;
        x4y x4yVar = (x4y) obj2;
        e4y e4yVar = e4y.b;
        String str = a5yVar.b;
        boolean z = a5yVar.d;
        String str2 = a5yVar.c;
        if (x4yVar instanceof n4y) {
            return Next.i(a5y.a(a5yVar, ((n4y) x4yVar).a, null, null, false, 0, null, 126), Collections.singleton(b4y.a));
        }
        if (x4yVar instanceof w4y) {
            String str3 = ((w4y) x4yVar).a;
            return Next.h(a5y.a(a5yVar, null, str3, str3, false, 0, null, 89));
        }
        if (x4yVar instanceof t4y) {
            return Next.i(a5y.a(a5yVar, null, null, null, false, 0, null, 95), Collections.singleton(e4yVar));
        }
        if (x4yVar instanceof u4y) {
            return Next.i(a5y.a(a5yVar, null, null, null, false, 0, null, 94), Collections.singleton(e4yVar));
        }
        boolean z2 = x4yVar instanceof v4y;
        Set setSingleton = w7x.a;
        if (z2) {
            String str4 = ((v4y) x4yVar).a;
            if (str4.equals(str2)) {
                return Next.h(a5yVar);
            }
            a5y a5yVarA = a5y.a(a5yVar, null, null, str4, false, 1, null, 107);
            if (!z) {
                setSingleton = Collections.singleton(new d4y(str, str4));
            }
            return Next.i(a5yVarA, setSingleton);
        }
        if (x4yVar instanceof p4y) {
            return Next.i(a5y.a(a5yVar, null, null, null, false, 0, ((p4y) x4yVar).a, 63), Collections.singleton(new d4y(str, str2)));
        }
        if (x4yVar instanceof o4y) {
            return Next.h(a5y.a(a5yVar, null, null, str, false, 0, null, 123));
        }
        if (x4yVar instanceof r4y) {
            a5y a5yVarA2 = a5y.a(a5yVar, null, str2, null, false, 2, null, 109);
            if (z) {
                setSingleton = Collections.singleton(new c4y(a5yVar.g));
            }
            return Next.i(a5yVarA2, setSingleton);
        }
        if (x4yVar instanceof q4y) {
            return Next.i(a5y.a(a5yVar, null, null, str, false, 0, null, 123), Collections.singleton(e4yVar));
        }
        if (x4yVar instanceof s4y) {
            return Next.h(a5y.a(a5yVar, null, null, null, ((s4y) x4yVar).a, 0, null, 119));
        }
        eg.o();
        return null;
    }
}
