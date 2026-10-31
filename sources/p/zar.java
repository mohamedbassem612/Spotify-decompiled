package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class zar {
    public static final tar Companion = new tar();
    public final e3z a;

    public /* synthetic */ zar(int i, e3z e3zVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = e3zVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zar) && u890.j(this.a, ((zar) obj).a);
    }

    public final int hashCode() {
        e3z e3zVar = this.a;
        if (e3zVar == null) {
            return 0;
        }
        return e3zVar.hashCode();
    }

    public zar(e3z e3zVar) {
        this.a = e3zVar;
    }
}
