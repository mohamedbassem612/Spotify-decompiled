package p;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mbh0 {
    public final Matcher a;
    public final CharSequence b;
    public final lbh0 c = new lbh0(this);
    public kbh0 d;

    public mbh0(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    public final List a() {
        kbh0 kbh0Var = this.d;
        if (kbh0Var != null) {
            return kbh0Var;
        }
        kbh0 kbh0Var2 = new kbh0(this);
        this.d = kbh0Var2;
        return kbh0Var2;
    }

    public final tr80 b() {
        Matcher matcher = this.a;
        return yoi1.Q(matcher.start(), matcher.end());
    }

    public final mbh0 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd <= charSequence.length()) {
            return mno1.m(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
