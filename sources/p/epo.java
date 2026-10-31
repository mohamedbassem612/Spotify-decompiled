package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class epo {
    public final String a;
    public final Function0 b;

    public epo(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epo)) {
            return false;
        }
        epo epoVar = (epo) obj;
        return u890.j(this.a, epoVar.a) && this.b == epoVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
