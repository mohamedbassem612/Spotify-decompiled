package p;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sb11 extends ub11 {
    public final Field a;

    public sb11(Field field) {
        this.a = field;
    }

    @Override // p.ub11
    public final Member b() {
        return this.a;
    }

    public final Field f() {
        return this.a;
    }
}
