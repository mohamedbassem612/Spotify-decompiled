package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o411 {
    public final i411 a;
    public final sjj0 b;
    public final lfb c;

    public o411(i411 i411Var, sjj0 sjj0Var, lfb lfbVar) {
        this.a = i411Var;
        this.b = sjj0Var;
        this.c = lfbVar;
    }

    public static Observable a(o411 o411Var, int i, String str, String str2, Set set, Set set2, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            set = w7x.a;
        }
        return o411Var.b(i, str, str2, set2, set);
    }

    public final Observable b(int i, String str, String str2, Set set, Set set2) {
        Set<String> set3 = set2;
        ArrayList arrayList = new ArrayList(q7h.U(set3, 10));
        for (String str3 : set3) {
            Set set4 = s4b1.f;
            arrayList.add(uic.x(str3).h());
        }
        Set setP1 = o7h.p1(arrayList);
        Set<String> set5 = set;
        ArrayList arrayList2 = new ArrayList(q7h.U(set5, 10));
        for (String str4 : set5) {
            Set set6 = s4b1.f;
            arrayList2.add(uic.x(str4).h());
        }
        return this.a.a(new s411(i, str2, str, setP1, o7h.p1(arrayList2))).flatMap(new zgz0(this, (byte) 4)).map(this.c).toObservable().onErrorReturn(b4x0.e);
    }
}
