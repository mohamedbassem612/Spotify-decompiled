package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ala1 {
    public final CharSequence a;
    public final sla1 b;

    public ala1(CharSequence charSequence, sla1 sla1Var) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.a = charSequence;
        this.b = sla1Var;
    }

    public final ala1 a(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.a.subSequence(i, i2);
        sla1 sla1Var = this.b;
        return new ala1(charSequenceSubSequence, (sla1Var == null || (i3 = i2 - i) == 0) ? null : new sla1(sla1Var.a, sla1Var.b + i, sla1Var.c + i, i3));
    }
}
