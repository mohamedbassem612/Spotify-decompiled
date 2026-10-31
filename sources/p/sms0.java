package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sms0 implements tms0 {
    public final String a;

    public sms0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sms0) && u890.j(this.a, ((sms0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
