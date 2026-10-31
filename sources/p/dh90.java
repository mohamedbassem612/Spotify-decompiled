package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dh90 extends li90 {
    public final String a;

    public dh90(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh90) && u890.j(this.a, ((dh90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
