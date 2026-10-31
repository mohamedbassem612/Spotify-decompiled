package p;

import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rig {
    public final String a;
    public final int b;
    public final Subject c;

    public rig(String str, int i, Subject subject) {
        this.a = str;
        this.b = i;
        this.c = subject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rig) {
            rig rigVar = (rig) obj;
            return u890.j(this.a, rigVar.a) && this.b == rigVar.b && this.c == rigVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
