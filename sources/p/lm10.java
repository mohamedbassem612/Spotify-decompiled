package p;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class lm10 implements jm10 {
    public final String a;
    public final List b;
    public final Map c;

    public lm10(String str, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = map;
    }

    @Override // p.jm10
    public f50 a(luk lukVar) {
        return new f50((LinkedHashSet) null, 7);
    }
}
