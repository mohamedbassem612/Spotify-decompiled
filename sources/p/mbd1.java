package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mbd1 implements obd1 {
    public final boolean a;

    public mbd1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbd1) && this.a == ((mbd1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
