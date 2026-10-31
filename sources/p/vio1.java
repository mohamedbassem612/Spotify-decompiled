package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vio1 {
    public final llm a;
    public final q8n b;

    public vio1(llm llmVar, q8n q8nVar) {
        this.a = llmVar;
        this.b = q8nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vio1) {
            vio1 vio1Var = (vio1) obj;
            if (this.a == vio1Var.a && u890.j(this.b, vio1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        llm llmVar = this.a;
        int length = String.valueOf(llmVar).length();
        q8n q8nVar = this.b;
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(q8nVar).length() + 1);
        sb.append("CoroutineDomain(scope=");
        sb.append(llmVar);
        sb.append(", dispatcher=");
        sb.append(q8nVar);
        sb.append(")");
        return sb.toString();
    }
}
