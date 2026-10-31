package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vlt extends wlt {
    public final String a;

    public vlt(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlt) && u890.j(this.a, ((vlt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
