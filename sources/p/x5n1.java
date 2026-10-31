package p;

import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class x5n1 extends v7n1 {
    public final /* synthetic */ y5n1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5n1(y5n1 y5n1Var, bsd1 bsd1Var) {
        super(bsd1Var);
        this.b = y5n1Var;
    }

    @Override // p.v7n1
    public final void a(Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.af)) {
            super.a(exc);
        } else if (y5n1.d(this.b)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
