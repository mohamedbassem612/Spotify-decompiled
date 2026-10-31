package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bdl implements cdl {
    public final boolean a;

    public bdl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdl) && this.a == ((bdl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
