package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class um60 extends dn60 {
    public final String e;
    public final Exception f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um60(String str, Exception exc) {
        super("errored");
        LinkedHashMap linkedHashMap = co0.b;
        this.e = str;
        this.f = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um60)) {
            return false;
        }
        um60 um60Var = (um60) obj;
        return this.e.equals(um60Var.e) && u890.j(this.f, um60Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        Exception exc = this.f;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }
}
