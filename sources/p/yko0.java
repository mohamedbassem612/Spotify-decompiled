package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yko0 {
    public final wko0 a;
    public final String b;
    public final int c;

    public yko0(wko0 wko0Var, String str, int i) {
        this.a = wko0Var;
        Objects.requireNonNull(str);
        String strE = dko0.e(str);
        this.b = strE;
        int length = strE.length();
        boolean z = false;
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = strE.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                o0c.k("Metric label is required", !z);
                this.c = i;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        z = true;
        o0c.k("Metric label is required", !z);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yko0)) {
            return false;
        }
        yko0 yko0Var = (yko0) obj;
        if (this == yko0Var) {
            return true;
        }
        return this.a.equals(yko0Var.a) && Objects.equals(this.b, yko0Var.b) && this.c == yko0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metric{mValue=");
        sb.append(this.a);
        sb.append(", mLabel=");
        sb.append(this.b);
        sb.append(", mSemanticStyle=");
        return gvg.j(sb, this.c, "}");
    }
}
