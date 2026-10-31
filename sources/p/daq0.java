package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class daq0 extends jaq0 {
    public final String a;

    public daq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof daq0) && this.a.equals(((daq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
