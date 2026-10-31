package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dvc implements hvc {
    public final String a;
    public final Boolean b;

    public /* synthetic */ dvc(String str, int i) {
        this((i & 1) != 0 ? null : str, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvc)) {
            return false;
        }
        dvc dvcVar = (dvc) obj;
        return u890.j(this.a, dvcVar.a) && u890.j(this.b, dvcVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public dvc(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }
}
