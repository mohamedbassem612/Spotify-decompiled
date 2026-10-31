package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class txa1 implements Function {
    public final List a;

    public txa1(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }

    public Object apply(Object obj) {
        return this.a;
    }

    public txa1(List list) {
        this.a = list;
    }
}
