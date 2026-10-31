package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ewj extends RuntimeException {
    public final wdn0 a;
    public final wdn0 b;
    public final edn0 c;
    public final int d;

    public ewj(wdn0 wdn0Var, wdn0 wdn0Var2, edn0 edn0Var, int i, Exception exc) {
        super(exc);
        this.a = wdn0Var;
        this.b = wdn0Var2;
        this.c = edn0Var;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        z6x z6xVarSingletonList;
        r561 r561VarA = j2h1.A(new dwj(this, null));
        if (r561VarA.hasNext()) {
            Object next = r561VarA.next();
            if (r561VarA.hasNext()) {
                z6x z6xVarH = ydh.h(next);
                while (r561VarA.hasNext()) {
                    z6xVarH.add(r561VarA.next());
                }
                z6xVarSingletonList = z6xVarH;
            } else {
                z6xVarSingletonList = Collections.singletonList(next);
            }
        } else {
            z6xVarSingletonList = z6x.a;
        }
        return jhc1.K("\n            |Failed to execute op number " + this.d + ":\n            |" + o7h.y0(o7h.e1(50, z6xVarSingletonList), "\n", (String) null, (String) null, (iu30) null, 62) + "\n            ");
    }
}
