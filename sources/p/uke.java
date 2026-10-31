package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uke {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof uke) {
            return this.a.equals(((uke) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("ChapterSelectorResult(chapterUri=", this.a, ")");
    }
}
