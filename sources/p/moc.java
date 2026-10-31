package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class moc implements qoc {
    public final List a;

    public moc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof moc) && u890.j(this.a, ((moc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
