package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mn3 extends qxd0 {
    public final sot d;

    public mn3(sot sotVar) {
        this.d = sotVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn3) && this.d.equals(((mn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
