package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class c9f0 implements Update {
    public final Next a(Object obj, Object obj2) {
        e9f0 e9f0Var = (e9f0) obj;
        a9f0 a9f0Var = (a9f0) obj2;
        int i = e9f0Var.d;
        c380 c380Var = e9f0Var.c;
        int i2 = e9f0Var.a;
        boolean z = a9f0Var instanceof y8f0;
        Object obj3 = m8f0.e;
        if (z) {
            return Next.a(Collections.singleton(obj3));
        }
        if (a9f0Var instanceof x8f0) {
            int i3 = i2 - 1;
            return i3 >= 0 ? Next.h(new e9f0(i3, (ivb1) c380Var.get(i3), c380Var, i)) : Next.a(Collections.singleton(obj3));
        }
        if (!(a9f0Var instanceof z8f0)) {
            eg.o();
            return null;
        }
        int i4 = i2 + 1;
        if (i4 < c380Var.size()) {
            return Next.h(new e9f0(i4, (ivb1) c380Var.get(i4), c380Var, i));
        }
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return null;
            }
            obj3 = o8f0.e;
        }
        return Next.a(Collections.singleton(obj3));
    }
}
