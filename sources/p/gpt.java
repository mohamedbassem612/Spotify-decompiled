package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gpt {
    public final String a;
    public final int b;

    public gpt(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpt)) {
            return false;
        }
        gpt gptVar = (gpt) obj;
        return u890.j(this.a, gptVar.a) && this.b == gptVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
