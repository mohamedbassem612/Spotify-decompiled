package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m7z extends yon1 {
    public final String d;
    public final j7z e;

    public m7z(String str, j7z j7zVar) {
        this.d = str;
        this.e = j7zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7z)) {
            return false;
        }
        m7z m7zVar = (m7z) obj;
        return u890.j(this.d, m7zVar.d) && this.e.equals(m7zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
