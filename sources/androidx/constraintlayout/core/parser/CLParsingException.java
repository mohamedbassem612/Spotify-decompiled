package androidx.constraintlayout.core.parser;

import p.aic;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CLParsingException extends Exception {
    public final String a;
    public final String b;

    public CLParsingException(String str, aic aicVar) {
        this.a = str;
        if (aicVar != null) {
            this.b = aicVar.k();
        } else {
            this.b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.a + " (" + this.b + " at line 0)");
        return sb.toString();
    }
}
