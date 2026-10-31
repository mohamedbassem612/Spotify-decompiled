package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zvn implements awn {
    public final List a;
    public final dwn b;
    public final boolean c;

    public zvn(List list, dwn dwnVar, boolean z) {
        this.a = list;
        this.b = dwnVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvn)) {
            return false;
        }
        zvn zvnVar = (zvn) obj;
        return this.a.equals(zvnVar.a) && this.b.equals(zvnVar.b) && this.c == zvnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
