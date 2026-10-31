package p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pja0 extends ton1 {
    public final Field c;

    public pja0(Field field) {
        this.c = field;
    }

    public final Field C() {
        return this.c;
    }

    public final String n() {
        Field field = this.c;
        return dia0.a(field.getName()) + "()" + bb11.b(field.getType());
    }
}
