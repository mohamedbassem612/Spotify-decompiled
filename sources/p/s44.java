package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s44 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new m44(this, (byte) 5));

    public s44(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        s44 s44Var = (s44) this.c.getValue();
        return s44Var != null ? s44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_prompt_suggestions", "android-aipartner-prompt-suggestions-provider", a()));
    }
}
