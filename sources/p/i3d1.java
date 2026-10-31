package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i3d1 {
    public final cdt a;

    public i3d1(cdt cdtVar) {
        this.a = cdtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3d1) && u890.j(this.a, ((i3d1) obj).a);
    }

    public final int hashCode() {
        cdt cdtVar = this.a;
        if (cdtVar != null) {
            return cdtVar.hashCode();
        }
        return 0;
    }
}
