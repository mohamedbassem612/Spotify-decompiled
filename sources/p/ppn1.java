package p;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ppn1 {
    public final Context a;
    public final String b;
    public final cjn1 c;
    public final p3e d;
    public final fsn1 e;

    public ppn1(Context context, p3e p3eVar, fsn1 fsn1Var) {
        boolean zIsEmpty = Collections.unmodifiableList(p3eVar.b).isEmpty();
        String str = p3eVar.a;
        String strP = zIsEmpty ? nho1.p(str) : nho1.q(str, Collections.unmodifiableList(p3eVar.b));
        this.c = new cjn1(this);
        this.a = context.getApplicationContext();
        zod.o(strP);
        this.b = strP;
        this.d = p3eVar;
        this.e = fsn1Var;
    }
}
