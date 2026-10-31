package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ek80 implements dk80 {
    public final cka a;

    public ek80(cka ckaVar) {
        this.a = ckaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek80) && this.a == ((ek80) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.dk80
    public final void i(h4e1 h4e1Var) {
        int i;
        int i2;
        int i3;
        CharSequence charSequenceQ = h4e1.q(h4e1Var, 0L, null, 15);
        CharSequence charSequence = h4e1Var.a;
        CharSequence charSequence2 = (CharSequence) this.a.invoke(charSequence, charSequenceQ);
        if (charSequence2 == charSequenceQ) {
            return;
        }
        if (charSequence2 == charSequence) {
            h4e1Var.m();
            return;
        }
        yzr0 yzr0Var = h4e1Var.c;
        int length = yzr0Var.length();
        int length2 = charSequence2.length();
        int i4 = 0;
        if (yzr0Var.length() <= 0 || charSequence2.length() <= 0) {
            i = 0;
            i2 = length;
            i3 = length2;
        } else {
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (true) {
                if (i4 == 0) {
                    if (yzr0Var.charAt(i5) == charSequence2.charAt(i6)) {
                        i5++;
                        i6++;
                    } else {
                        i4 = 1;
                    }
                }
                if (!z) {
                    if (yzr0Var.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z = true;
                    }
                }
                if (i5 >= length || i6 >= length2 || (i4 != 0 && z)) {
                    break;
                }
            }
            i4 = i5;
            i = i6;
            i3 = length2;
            i2 = length;
        }
        if (i4 < i2 || i < i3) {
            h4e1.l(h4e1Var, i4, i2, charSequence2, i, i3, false, 32);
        }
    }

    public final String toString() {
        return "InputTransformation.byValue(transformation=" + this.a + ")";
    }
}
