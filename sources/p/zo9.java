package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zo9 {
    public final boolean a;
    public final f8n b;

    public zo9(boolean z, f8n f8nVar) {
        this.a = z;
        this.b = f8nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo9)) {
            return false;
        }
        zo9 zo9Var = (zo9) obj;
        return this.a == zo9Var.a && this.b == zo9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
