package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class uav0 {
    public static final tav0 Companion = new tav0();
    public final zar a;

    public /* synthetic */ uav0(int i, zar zarVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zarVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uav0) && u890.j(this.a, ((uav0) obj).a);
    }

    public final int hashCode() {
        zar zarVar = this.a;
        if (zarVar == null) {
            return 0;
        }
        return zarVar.hashCode();
    }

    public uav0(zar zarVar) {
        this.a = zarVar;
    }
}
