package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z3v0 {
    public final x3v0 a;

    public static Map b() {
        Boolean bool = Boolean.TRUE;
        return sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("name", bool), new mmr0("publisher", bool), new mmr0("isExplicit", bool), new mmr0("covers", bool)});
    }

    public Observable a(List list) {
        Boolean bool = Boolean.TRUE;
        return this.a.b(list, new t3v0(sqg0.J(new mmr0[]{new mmr0("covers", bool), new mmr0("isExplicit", bool), new mmr0("is19PlusOnly", bool), new mmr0("link", bool), new mmr0("name", bool), new mmr0("playabilityRestriction", bool), new mmr0("isBookChapter", Boolean.FALSE), new mmr0("playable", bool)}), b(), b(), f46.i0(new Integer[]{22, 58}), (List) null, 135)).map(new y3v0(list, (byte) 0));
    }
}
