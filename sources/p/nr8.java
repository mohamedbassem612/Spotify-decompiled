package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class nr8 {
    public static final mr8 Companion = new mr8();
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr8) && u890.j(this.a, ((nr8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
