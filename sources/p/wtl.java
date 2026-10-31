package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wtl {
    public final l5c a;
    public final ohd b;

    public wtl(l5c l5cVar, ohd ohdVar) {
        this.a = l5cVar;
        this.b = ohdVar;
    }

    public final String toString() {
        ohd ohdVar = this.b;
        z8n z8nVarA = ohdVar.e.A(z8n.c);
        String str = z8nVarA != null ? z8nVarA.b : null;
        int iHashCode = hashCode();
        eth.h(16);
        return "Request@" + Integer.toString(iHashCode, 16) + (str != null ? f4i1.f("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + ohdVar + ")";
    }
}
