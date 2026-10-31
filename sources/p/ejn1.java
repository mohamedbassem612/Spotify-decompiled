package p;

import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzag;
import com.google.android.recaptcha.internal.zzy;
import com.google.android.recaptcha.internal.zzz;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ejn1 {
    public final jw91 a;
    public final h0n1 b = new h0n1((byte) 1);
    public final b8p1 c;

    public ejn1(jw91 jw91Var, b8p1 b8p1Var) {
        this.a = jw91Var;
        this.c = b8p1Var;
    }

    public final Optional a() {
        ctn1 ctn1Var;
        try {
            try {
                try {
                    ArrayDeque arrayDeque = (ArrayDeque) this.b.a;
                    if (arrayDeque.isEmpty()) {
                        throw new zzae();
                    }
                    mdn1 mdn1Var = (mdn1) arrayDeque.pop();
                    long j = mdn1Var.a;
                    long j2 = mdn1Var.b;
                    long j3 = mdn1Var.c;
                    jw91 jw91Var = this.a;
                    if (jw91Var.b < j2) {
                        return Optional.of(ctn1.h1);
                    }
                    this.c.C(j);
                    if (j3 == 0) {
                        while (jw91Var.b > j2) {
                            jw91Var.f();
                        }
                    }
                    return Optional.empty();
                } catch (zzz e) {
                    e = e;
                    throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzy | zzz e2) {
                e = e2;
            }
        } catch (zzae unused) {
            ctn1Var = ctn1.X0;
            return Optional.of(ctn1Var);
        } catch (zzag unused2) {
            ctn1Var = ctn1.h1;
            return Optional.of(ctn1Var);
        }
    }
}
