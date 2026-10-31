package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class jah0 implements Update {
    public final Next a(Object obj, Object obj2) {
        mah0 mah0Var = (mah0) obj;
        cah0 cah0Var = (cah0) obj2;
        Map map = mah0Var.e;
        int i = mah0Var.f;
        b9h0 b9h0Var = b9h0.a;
        n9h0 n9h0Var = n9h0.a;
        o9h0 o9h0Var = o9h0.a;
        if (i == 3) {
            return (cah0Var.equals(o9h0Var) || cah0Var.equals(n9h0Var)) ? Next.a(Collections.singleton(b9h0Var)) : Next.j();
        }
        if (cah0Var instanceof aah0) {
            return Next.h(mah0.a(mah0Var, ((aah0) cah0Var).a, null, 0, 0, 119));
        }
        boolean z = cah0Var instanceof r9h0;
        mm90 mm90Var = mm90.a;
        if (z) {
            String str = ((r9h0) cah0Var).a;
            return Next.i(mah0.a(mah0Var, null, sqg0.P(map, new mmr0(str, mm90Var)), 0, 0, 111), Collections.singleton(new d9h0(str)));
        }
        if (cah0Var instanceof s9h0) {
            ArrayList arrayList = ((s9h0) cah0Var).a;
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : arrayList) {
                linkedHashMap.put(obj3, mm90Var);
            }
            return Next.h(mah0.a(mah0Var, null, sqg0.O(map, linkedHashMap), 0, 0, 111));
        }
        if (cah0Var instanceof v9h0) {
            return Next.h(mah0.a(mah0Var, null, sqg0.K(((v9h0) cah0Var).a, map), 0, 0, 111));
        }
        if (cah0Var instanceof w9h0) {
            return Next.h(mah0.a(mah0Var, null, sqg0.L(map, o7h.p1(((w9h0) cah0Var).a)), 0, 0, 111));
        }
        if (cah0Var instanceof bah0) {
            bah0 bah0Var = (bah0) cah0Var;
            String str2 = bah0Var.b;
            return Next.h(mah0.a(mah0Var, null, sqg0.P(map, new mmr0(str2, new nm90(dm61.x0(bah0Var.a, mah0Var.h(str2))))), 0, 0, 111));
        }
        if (cah0Var instanceof q9h0) {
            q9h0 q9h0Var = (q9h0) cah0Var;
            String str3 = q9h0Var.b;
            LinkedHashSet linkedHashSetU0 = dm61.u0(q9h0Var.a, mah0Var.h(str3));
            return Next.h(mah0.a(mah0Var, null, linkedHashSetU0.isEmpty() ? sqg0.K(str3, map) : sqg0.P(map, new mmr0(str3, new nm90(linkedHashSetU0))), 0, 0, 111));
        }
        if (cah0Var.equals(o9h0Var)) {
            return Next.h(mah0.a(mah0Var, null, null, 0, 1, 63));
        }
        if (cah0Var.equals(n9h0Var)) {
            return Next.a(Collections.singleton(b9h0Var));
        }
        if (cah0Var.equals(u9h0.a)) {
            return mah0Var.d() ? Next.h(mah0.a(mah0Var, null, null, 0, 2, 63)) : Next.j();
        }
        if (cah0Var.equals(t9h0.a)) {
            return Next.h(mah0.a(mah0Var, null, b7x.a, 0, 0, 47));
        }
        if (cah0Var.equals(y9h0.a)) {
            return ak20.f(mah0Var);
        }
        if (!cah0Var.equals(z9h0.a)) {
            if (cah0Var instanceof x9h0) {
                if (i != 2) {
                    return Next.j();
                }
                Throwable thA = e331.a(((x9h0) cah0Var).a);
                return thA == null ? Next.i(mah0.a(mah0Var, null, null, 3, 0, 31), Collections.singleton(new a9h0(mah0Var.b))) : Next.i(mah0.a(mah0Var, null, null, 1, 0, 95), Collections.singleton(new c9h0(thA)));
            }
            if (cah0Var.equals(p9h0.a)) {
                return Next.h(mah0.a(mah0Var, null, null, 0, 0, 63));
            }
            eg.o();
            return null;
        }
        if (i != 1) {
            return Next.j();
        }
        ArrayList<UnmatchedItem> arrayListC = mah0Var.c();
        if (!arrayListC.isEmpty()) {
            for (UnmatchedItem unmatchedItem : arrayListC) {
                if (!mah0.g(mah0Var, unmatchedItem.getId()) && !mah0Var.f(unmatchedItem.getId())) {
                    return Next.h(mah0.a(mah0Var, null, null, 0, 3, 63));
                }
            }
        }
        return ak20.f(mah0Var);
    }
}
