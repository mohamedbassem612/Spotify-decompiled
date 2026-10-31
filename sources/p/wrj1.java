package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class wrj1 {
    public static final vrj1 Companion = new vrj1();
    public final boolean a;

    public /* synthetic */ wrj1(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrj1) && this.a == ((wrj1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public wrj1() {
        this.a = true;
    }
}
