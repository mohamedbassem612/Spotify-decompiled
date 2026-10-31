package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ck80 {
    public final boolean a;
    public final boolean b;

    public ck80(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck80)) {
            return false;
        }
        ck80 ck80Var = (ck80) obj;
        return this.a == ck80Var.a && this.b == ck80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.a + ", suggestionSelected=" + this.b + ")";
    }
}
