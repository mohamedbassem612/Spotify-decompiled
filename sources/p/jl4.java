package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jl4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 8));

    public jl4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        jl4 jl4Var = (jl4) this.c.getValue();
        return jl4Var != null ? jl4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_quiz_question_reporting_enabled", "android-learning-music-quiz-gameplay", a()));
    }
}
