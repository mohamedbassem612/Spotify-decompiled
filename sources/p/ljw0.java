package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ljw0 implements njw0 {
    public final ko7 a;

    public ljw0(ko7 ko7Var) {
        this.a = ko7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljw0) && this.a.equals(((ljw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
